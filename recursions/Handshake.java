package recursions;

public class Handshake {
    public static void main(String[] args) {
        System.out.println(handshake(4));
    }

    public static int handshake(int n){
        /*
        * This is a recursive function to determine number of handshakes in a room
        */

        if(n == 1)
            return 0;

        return handshake(n - 1) + n - 1;
    }
}
