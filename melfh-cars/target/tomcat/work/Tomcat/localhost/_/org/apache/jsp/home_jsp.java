/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-24 17:30:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import br.com.melfhcars.model.Carro;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
 List<Carro> listaCars = (List<Carro>) request.getAttribute("cars");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("              integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("                integrity=\"sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link href=\"home.css\" rel=\"stylesheet\">\r\n");
      out.write("        <title>Página Inicial</title>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <form>\r\n");
      out.write("        <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"bg-dark\">\r\n");
      out.write("                <div class=\"logo titulo\">\r\n");
      out.write("                    <header\r\n");
      out.write("                        class=\"d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom\">\r\n");
      out.write("                        <a href=\"/\" class=\"d-flex align-items-center col-md-3 mb-2 mb-md-0 text-white text-decoration-none\">\r\n");
      out.write("                            <img src=\"img/Logo da Melph.png\" width=\"140px\" alt=\"\">\r\n");
      out.write("                        </a>\r\n");
      out.write("\r\n");
      out.write("                        <ul class=\"nav col-12 col-md-auto mb-2 justify-content-center mb-md-0\">\r\n");
      out.write("                            <li><a href=\"cadastroCarro.jsp\" class=\"nav-link px-2 link-dark1\">Vender carro</a>\r\n");
      out.write("                            <li><a href=\"Anuncio.jsp\" class=\"nav-link px-2 link-dark1\">Comprar carro </a></li>\r\n");
      out.write("                            <li><a href=\"sobre.html\" class=\"nav-link px-2 link-dark1\">Um pouco sobre nós</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-3 text-end\">\r\n");
      out.write("\r\n");
      out.write("                            <a href=\"login.jsp\"> <button type=\"button\" class=\"btn btn-outline-primary me-2\">Entrar</button></a>\r\n");
      out.write("                             <a href=\"cadastroCliente.html\"><button type=\"button\" class=\"btn btn-primary\">Cadastrar-se</button></a>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </header>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"carouselExampleCaptions\" class=\"carousel slide\">\r\n");
      out.write("            <div class=\"carousel-indicators\">\r\n");
      out.write("                <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"0\" class=\"active\"\r\n");
      out.write("                        aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n");
      out.write("                <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"1\"\r\n");
      out.write("                        aria-label=\"Slide 2\"></button>\r\n");
      out.write("                <button type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide-to=\"2\"\r\n");
      out.write("                        aria-label=\"Slide 3\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"carousel-inner\">\r\n");
      out.write("                    <div class=\"carousel-item active\">\r\n");
      out.write("                        <img src=\"img/Ferrari.jpg\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                            <h5>Gosta de Carros Luxuosos ?</h5>\r\n");
      out.write("                            <p>Aqui você pode vender ou comprar se carro de luxuso</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"carousel-item\">\r\n");
      out.write("                        <img src=\"img/Fusca.jpg\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                            <h5>Ta afim de reviver os velhos tempos?</h5>\r\n");
      out.write("                            <p>Que tal poder achar que seu fusca ?</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"carousel-item\">\r\n");
      out.write("                        <img src=\"img/Tesla.jpg\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                            <h5>Elon Musk !!!???</h5>\r\n");
      out.write("                            <p>Consiga agora seu carro inteligente!</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"prev\">\r\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleCaptions\" data-bs-slide=\"next\">\r\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <span class=\"visually-hidden\">Next</span>\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("                <div></div>\r\n");
      out.write("  <h1 style=\"color: #fff; text-align: center;\"> Ultimos Lançamentos!!! 🔥🔥🔥</h1>\r\n");
      out.write("        <br><br>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"conatiner-fluid d-flex flex-wrap \">\r\n");
      out.write("\r\n");
      out.write("                ");
 if (listaCars != null) { 
      out.write("\r\n");
      out.write("                   ");
 for (int i = 0; i < listaCars.size(); i++) { 
      out.write("\r\n");
      out.write("                <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("                    <img src= \"");
      out.print(listaCars.get(i).getFotoCarro());
      out.write("\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("                        <h5 class=\"card-title\">\r\n");
      out.write("                            ");
      out.print(listaCars.get(i).getNomeCarro());
      out.write("\r\n");
      out.write("                        </h5>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"list-group list-group-flush\">\r\n");
      out.write("                        <li class=\"list-group-item\">\r\n");
      out.write("                            <label>");
      out.print(listaCars.get(i).getAno());
      out.write("</label>\r\n");
      out.write("                            <label> - </label>\r\n");
      out.write("                            <label>");
      out.print(listaCars.get(i).getKm());
      out.write("Km</label>\r\n");
      out.write("                            <label> - </label>\r\n");
      out.write("                            <label>");
      out.print(listaCars.get(i).getEstado());
      out.write("</label>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <a href=\"/descricao-carro?placa=");
      out.print(listaCars.get(i).getPlaca());
      out.write("\" class=\"card-link\">R$ ");
      out.print(listaCars.get(i).getValor());
      out.write("</a>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("               ");
 } else { 
      out.write("\r\n");
      out.write("                    ");
      if (true) {
        _jspx_page_context.forward("/mostrar-carro");
        return;
      }
      out.write("\r\n");
      out.write("               ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
