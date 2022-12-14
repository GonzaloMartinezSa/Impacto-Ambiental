package presentacion.controladores;

import domain.organizaciones.miembros.Miembro;
import domain.organizaciones.miembros.TipoDeDocumento;
import repositorios.RepositorioUsuarios;
import presentacion.Usuario;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class RegistrarMiembroController {

  public ModelAndView index(Request request, Response response) {
    return new ModelAndView(null, "registrarMiembro.hbs");
  }

  public ModelAndView post(Request request, Response response) {
    String nombre = request.queryParams("nombre");
    String apellido = request.queryParams("apellido");
    String tipoDocumento = request.queryParams("tipoDocumento");
    int nroDocumento = Integer.parseInt(request.queryParams("nroDeDocumento"));

    Miembro miembro = new Miembro(nombre, apellido, TipoDeDocumento.valueOf(tipoDocumento),
        nroDocumento);

    String username = request.session().attribute("usuario_logueado");
    Usuario usuario = RepositorioUsuarios.getInstance().findByUsername(username);
    usuario.setMiembro(miembro);
    RepositorioUsuarios.getInstance().update(usuario);

    //request.session().attribute("usuario_logueado", usuario.getUsername());
    response.redirect("/home");
    return null;
  }

}
