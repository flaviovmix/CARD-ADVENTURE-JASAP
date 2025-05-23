package br.root;

public class AulaPage {
    
    public String toHtml(String corpo) {
         
        StringBuilder aux = new StringBuilder();

        aux.append("<!DOCTYPE html>\n");
        aux.append("<html lang=\"pt-br\">\n");
        aux.append("<head>\n");
        aux.append("  <meta charset=\"UTF-8\">\n");
        aux.append("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
        aux.append("  <link rel=\"stylesheet\" href=\"./assets/css/style.css\">\n");
        aux.append("  <title>Aula 1</title>\n");
        aux.append("</head>\n");
        aux.append("<body>\n");
        aux.append(corpo);
        aux.append("  <script src=\"./assets/js/scripts.js\"></script>\n");;
        aux.append("  <script src=\"./assets/js/jquery/jquery-3.6.0.min.js\"></script>\n");
        aux.append("  <script src=\"./assets/js/jquery/jquery-ui.min.js\"></script>\n");        
        aux.append("  <script src=\"./assets/js/jquery/jasapJquery.js\"></script>\n");        
        aux.append("  <script src=\"./assets/js/jquery/XTLib.js\"></script>\n"); 
        aux.append("  <script src=\"./assets/js/jquery/XTLibJqueryV1.js\"></script>\n"); 
        
        aux.append("</body>\n");
        aux.append("</html>\n");
        
        return aux.toString();
    }    
    
}