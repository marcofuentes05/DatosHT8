import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorHeap_1Test {

    @Test
    void isEmpty() {
        boolean isE = true;
        VectorHeap<String> t = new VectorHeap<>();
        assertEquals(isE,t.isEmpty());
    }

    @Test
    void size() {
        //Tamaño teorico
        int sizeT = 0;
        VectorHeap<String> t = new VectorHeap<>();
        assertEquals(sizeT,t.size());
    }

    @Test
    void clear() {
        VectorHeap<String> t = new VectorHeap<>();
        t.add("hola");
        t.add("hola");
        t.add("hola");
        t.add("hola");
        t.add("hola");
        t.add("hola");
        t.add("hola");
        t.add("hola");

        t.clear();
        //Compara el tamaño del nuevo objeto
        assertEquals(0,t.size());
    }

    @Test
    void pushDownRoot() {
    }

    @Test
    void remove() {
        VectorHeap<String> t = new VectorHeap<>();
        t.add("hola");
        t.remove();
        //Compara el tamaño del nuevo objeto
        assertEquals(0,t.size());
    }

    @Test
    void getFirst() {
        VectorHeap<String> t = new VectorHeap<>();
        t.add("hola");
        String t0 = "hola";
        assertEquals(t0,t.getFirst());
    }

    @Test
    void add(){
        int expectedSize = 1;
        VectorHeap<String> t = new VectorHeap<>();
        t.add("hola");
        //Compara el tamaño del nuevo objeto
        assertEquals(1,t.size());
    }
}