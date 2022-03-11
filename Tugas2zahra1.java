import java.util.LinkedList;

public class Tugas2zahra1 {
    public static void main (String[] args) {
        
                //create linkedlist
                LinkedList <String> saya = new LinkedList<>();
                saya.add("A");
                saya.add("Z");
                saya.add("Z");
                saya.add("A");
                saya.add("H");
                saya.add("R");
                saya.add("A");
                saya.add("");
                saya.add("A");
                saya.add("T");
                saya.add("H");
                saya.add("I");
                saya.add("F");
                saya.add("A");
                saya.add("H");
                saya.add("");
                saya.add("D");
                saya.add("Z");
                saya.add("A");
                saya.add("K");
                saya.add("I");
                System.out.println("Nama Saya\t\t:"+saya+ "\nUkuran nama saya\t :" +saya.size());
                System.out.println("\n");
                
                //add linkedlist
                saya.addFirst("."); 
                saya.addFirst("r");
                saya.addFirst("D");
                saya.addLast(",");        
                saya.addLast("M");
                saya.addLast(".");
                saya.addLast("K");
                saya.addLast("O");
                saya.addLast("M");
                saya.addLast(".");
                System.out.println("Setelah ditambah\t:"+saya+ "\nUkuran nama saya\t :" +saya.size());
                System.out.println("\n");
                
                //set linkedlist / sisip
                saya.set(0,"H");
                saya.set(1,"J");
                saya.set(2,".");
                System.out.println("Setelah di set\t\t:"+saya+ "\nUkuran nama saya\t :" +saya.size());
                System.out.println("\n");
                
                //remove linked list
                saya.removeFirst();
                saya.removeLast();
                saya.remove(0);
                saya.remove(0);
                System.out.println("Setelah dihapus\t\t:"+saya+ "\nUkuran nama saya\t :" +saya.size());
                System.out.println("\n");

                //POP dan PUSH
                saya.push(".");
                saya.push("r");
                saya.push("D");
                saya.push(".");
                saya.push("F");
                saya.push("O");
                saya.push("R");
                saya.push("P");
                System.out.println("Setelah di PUSH\t\t:"+saya+ "\nUkuran nama saya\t :" +saya.size());
                System.out.println("\n");

                saya.pop();
                saya.pop();
                saya.pop();
                saya.pop();
                saya.pop();
                System.out.println("Setelah di POP\t\t:"+saya+ "\nUkuran nama saya\t :" +saya.size());        
    }
}



