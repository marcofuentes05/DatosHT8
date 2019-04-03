/**
 * Clase Paciente.
 *
 * @author Marco Fuentes y Abril Palencia
 * @since 02/04/2019
 */
public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private String prioridad;

    /**
     * getNombre.
     * @return nombre. nombre del paciente
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * getSintoma
     * @return sintoma. el sintoma que tiene el paciente.
     */
    public String getSintoma(){
        return sintoma;
    }

    /**
     * getPrioridad.
     * @return prioridad. la prioridad del caso medico del paciente.
     */
    public String getPrioridad(){
        return prioridad;
    }

    /**
     * Paciente. constructor.
     * @param n nombre
     * @param s sintoma
     * @param p prioridad
     */
    public Paciente(String n, String s, String p){
        nombre = n;
        sintoma =s;
        prioridad=p;
    }

    /**
     * compareTo.
     * @param o paciente
     * @return prioridad camparada
     */
    @Override
    public int compareTo(Paciente o) {
        return prioridad.compareToIgnoreCase(o.getPrioridad());
    }

    /**
     * toString.
     * @return estring de toda la ficha el paciente.
     */
    @Override
    public String toString(){
        String str ="";
        str+= nombre+" tiene "+sintoma+" con prioridad: "+prioridad;
        return str;
    }
}
