public class countingSheep {

    public static String countingSheep(int num) {
       
        String d = "";
        if(num < 0){ return ""; }

        else {
            for(int i=1; i<=num;i++)
            {

                d = d+ i +"sheep....";
            }
        
        }
        return d;

    }



    public static void main(String[] args) {

      String p = countingSheep(6);
        System.out.print(p);
    }

}
