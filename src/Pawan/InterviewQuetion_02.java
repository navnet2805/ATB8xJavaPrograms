package Pawan;

public class InterviewQuetion_02 {

    /*
    int a[]={10,5,15,9,5,1};
    output should be like number 15
    because it is middle number of all the elements in an array.

    Logic:
    Target =15;
    check for pairs if == then print target
    check for next pairs or triplets == then print targets
     */
    public static void main(String[] args) {


        int a[] = {10, 5, 15, 9, 4, 1,1};

        int target=15;
        Boolean found=false;


        for (int i=0;i<=a.length;i++){
            for(int j=i+1;j<=a.length;j++){

                if(a[i]+a[j]==target)
                {
                    System.out.println("the number" +  a[i] + "+" + a[j] + "=" + target);
                    found=true;
                }
            }
        }
        for(int i=0;i<=a.length;i++)
        {
            for(int j=i+1;j<=a.length;j++)
            {
                for (int k=j+1;j<=a.length;k++)
                {
                    if(a[i]+a[j]+a[k]==target)
                    {
                        System.out.println("the number" +  a[i] + "+" + a[j] + a[k] + "=" + target);
                        found=true;

                    }
                }
            }
        }
        if(found==true){
            System.out.println("Then the targeted number is true : "+ target);
        }
        else {
            System.out.println("Then the targeted number is false : ");

        }
    }

}
