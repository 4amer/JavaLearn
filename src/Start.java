import java.net.SocketOption;

public class Start {
    public static void main (String[] args){
        double meter;
        int counter = 0;
        int foot = 12 * 12;

        for(int inch = 1; inch <= foot; inch++){
            meter = inch / 39.37;
            System.out.print(inch + " дюйму соответствует " + meter + " метра.");
            counter++;
            if(counter == 12){
                System.out.println();
                counter = 0;
            }
        }
    }
}
