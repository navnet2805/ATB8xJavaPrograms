package Pawan;

public class Fibnocci_Series {
    public static void main(String[] args) {
        int number=8;
        int frist_num=1;
        int Second_num=2;
        System.out.println(frist_num);
        System.out.println(Second_num);
        int Third_num;

        for(int i=3;i<number;i++){
            Third_num=frist_num + Second_num;
            System.out.println(Third_num);// Third Num
            frist_num=Second_num;
            Second_num=Third_num;


        }
    }
}
