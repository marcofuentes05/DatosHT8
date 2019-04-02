public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private String prioridad;

    public String getNombre(){
        return nombre;
    }

    public String getSintoma(){
        return sintoma;
    }

    public String getPrioridad(){
        return sintoma;
    }

    public Paciente(String n, String s, String p){
        nombre = n;
        sintoma =s;
        prioridad=p;
    }

    @Override
    public int compareTo(Paciente o) {
        return prioridad.compareToIgnoreCase(o.getPrioridad());
    }

    @Override
    public String toString(){
        String str ="";
        str+= nombre+" tiene "+sintoma+" con prioridad: "+prioridad;
        return str;
    }
}
