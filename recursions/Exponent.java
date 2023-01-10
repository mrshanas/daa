package recursions;

public class Exponent {
    public static void main(String[] args) {
        System.out.println(exp(4,-1));
    }

    static int exp(int number, int power){
        // Takes in a number and power
        // this below conditions assumes the func doesn't compute negative exponents
        if(power < 1) return 0;

        if(power == 0) return 1;

        if(power == 1) return number;

        return number * exp(number , power -1);
    }
}
