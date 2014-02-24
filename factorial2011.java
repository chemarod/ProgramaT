import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 *    Este problema recuerdo que tenía 'truco': los casos de prueba hacían saltar TimeLimits o desbordamientos si el número
 *    era muy grande... Reutilizo uno de los programas enviados y pongo el método 'rápido' de cálculo.
 *    La clave está en que se pide la última cifra: 
 *       en cuanto aparezca un factorial que termine en 0, todos los siguientes son cero.
 *
 *
 */
public class factorial2011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        factorial2011 p = new factorial2011();
        int casos = Integer.parseInt(in.readLine());
        int num;
        for (int i = 0; i < casos; i++) 
		{
		    
            num = Integer.parseInt(in.readLine());
            System.out.println( p.factUltimaCifra(num) );
        }
    }

    private int factUltimaCifra(int num) 
	{
	       int resul = 0;
           switch(num)
			{
			   case 1: resul = 1; 
				break;
			   case 2: resul = 2;
				break;
			   case 3: resul = 6;
				break;
			   case 4: resul = 4;
			    break;
			   default: resul = 0;  
			}
			return resul;
    }
}
