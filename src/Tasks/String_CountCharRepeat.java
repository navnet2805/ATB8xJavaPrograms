package Tasks;

public class String_CountCharRepeat {
    // ex: pawan :
    // p=1
    //a=2
    //w=1
    //n=1


    public static void main(String[] args) {
        // Logic1: string create
        // convert to lists of character
        // length
        // pick 1st char
        // compare index exists in the list of char.
        // if exist count increase
        // remove the char from the list

        String name = "pawan";


        for (char ch : name.toCharArray()){
            occurence(name,ch);
        }

            }
            public static void occurence(String name, char value){
        int count=0;
        for (char c : name.toCharArray()){
            if (c == value){
                count++;
            }
        }

                System.out.println(value +": " + count);

            }


    }

