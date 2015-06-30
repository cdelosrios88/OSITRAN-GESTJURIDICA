package prueba;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pe.ositran.dao.DistritoDao;
import com.pe.ositran.model.Distrito;

public class probando {
	
	@Test
	public void prueba(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");        
		DistritoDao personDAO = context.getBean(DistritoDao.class);
         
		//Distrito d = new Distrito();
		//d.setId(100);
		//d.setNombre("koko");         
        //personDAO.save(d);
         
		List<Distrito> list = personDAO.list();
        System.out.println("size: " + list.size());
        for(Distrito p : list){
            System.out.println("Person List::"+p.getNombre());
        }
       
        //close resources
        context.close();   
	}

}
