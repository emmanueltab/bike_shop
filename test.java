import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> farts = new ArrayList<>(100);

        int i = 0;
        while(true){
            if(farts.size() == 100){
                break;
            }
            farts.add(i);
            i++;
        }

        for(Integer g: farts){
            System.out.println(g);
        }



    }
}
