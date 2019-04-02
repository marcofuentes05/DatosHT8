import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main (String args[]){

        try{
            VectorHeap<Paciente> queue = new VectorHeap<>();

            String sCadena ="";
            BufferedReader bf = new BufferedReader(new FileReader("pacientes.txt"));
            while ((sCadena = bf.readLine())!=null) {
                String[] px = sCadena.split(",");
                queue.add(new Paciente(px[0],px[1],px[2]));
            }
            System.out.println(queue.remove().toString());
            System.out.println(queue.remove().toString());
            System.out.println(queue.remove().toString());
            System.out.println(queue.remove().toString());
        }catch(Exception e){
            e.printStackTrace();
        }


    }

}