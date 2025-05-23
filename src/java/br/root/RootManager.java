package br.root;

import br.jasap.core.JasapRootManager; 
import br.root.app.aula1.Aula1Action;

public class RootManager extends JasapRootManager {
    
    @Override
    public void config() throws Exception {
         
        regAction(Aula1Action.Hello.class, "inicio.jsap");
        regAction(Aula1Action.Continua.class);

    }
    
    @Override
    public void sessionConfig() {
    }

    @Override
    public void configGlobalFilters() throws Exception {
        //getGlobalFilters().add(new JNDIDataBaseFilter("java:/comp/env/jdbc/xtdb"));
        //getGlobalFilters().add(new DataBaseFilter(true, "PRD_CFILMES", DataBase.POSTGRES, "localhost", 5432, "PRD_CFILMES", "postgres", "masterkey"));
    }
}
