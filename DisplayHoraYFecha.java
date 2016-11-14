
/**
 * Write a description of class DisplayHoraYFecha here.
 * 
 * @author (Valeriesantos) 
 * @version (14/11/2016)
 */
public class DisplayHoraYFecha
{
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos annio;
    private NumberDisplay horas;
    private NumberDisplay minutos;
    
/** 
 * Constructor for objects of class DisplayHoraYFecha
 */
public DisplayHoraYFecha()
{
    dia = new DisplayDosDigitos(31);
    mes = new DisplayDosDigitos(13);
    annio = new DisplayDosDigitos(100);
    horas = new NumberDisplay(24);
    minutos = new NumberDisplay(60);
}

public void avanzarMomento()
{
    minutos.increment();
    if(minutos.getValue() == 0){
        //avanza hora
        horas.increment();
    }
     dia.incrementaValor();
     if(dia.getValor() == 1){
         //avanza mes
         if(mes.getValor() == 1){
             //avanza annio
             annio.incrementaValor();
         }
     }
    
}

}


