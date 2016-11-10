
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private NumberDisplay horas;
    private NumberDisplay minutos;


  /**
  * Constructor for objects of class ClockDisplay
  * Constructor for objects of class ClockDisplay
  */
  
  public ClockDisplay()
  {
       horas = new NumberDisplay(24);
       minutos = new NumberDisplay(60);
}
     
  public void fijarHora(int nuevaHoras,int nuevoMinutos)
  {
      horas.setValue(nuevaHoras);
      minutos.setValue(nuevoMinutos);
  }
  
  
  public void avanzarMinutos()
  {
      minutos.increment();
      if(minutos.getValue() == 0){
          //Hay que avanzar la hora.
          horas.increment();
      }
  }
  
  public String mostrarHora(){
      return horas.getDisplayValue() + ":" + minutos.getDisplayValue();
  }
}
 
 