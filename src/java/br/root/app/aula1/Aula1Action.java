package br.root.app.aula1;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;
import br.root.AulaPage;

public abstract class Aula1Action extends JasapAct {
    
    public Aula1Action(){
    }
    
    public static class Hello extends Aula1Action {
        @Override
        public Effect execute() throws Exception {
            
            //getOutput().write(aula1.toHtml("<h1>Hello Worls Jasap!</h1>"));
            //getInput().printParameters();
   
            AulaPage aula1 = new AulaPage();
            
            StringBuilder aux = new StringBuilder();
            aux.append("<h1>Hello Worls - CadAdventure!</h1>");
            aux.append("<div> <a href=\"#\" onclick=\""+link(Continua.class).ajax()+"\"> Continua </a> </div>");
                    
            getOutput().write(aula1.toHtml(aux.toString()));
            
            return new Response();
        }
    }
    
    public static class Continua extends Aula1Action {
        @Override
        public Effect execute() throws Exception {

            System.out.print("chegou no consogo do NetBeans");
            
            return new Response();
            
        }
    }
    
}
    

