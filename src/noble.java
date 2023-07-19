import java .util.*;
public class noble{
    public static int nobelInteger(int arr[])
    {
        int size = arr.length;
        for (int i = 0; i< size; i++)
        {
            int count = 0;
            for (int j = 0; j< size; j++)
                if(arr[i] < arr [j])
                    count++;
            if(count == arr[i])
                return arr[i];
        }
           return-1;
    }

public static void main(String args[]){
/*
Scanner sc=new Scanner(System.in);
int b= newInt();
int arr[]=new int[b];
for(int i=0;i<B;i++)
{
arr[i]=sc.nextInt();

 */
    int[] arr ={3,2,1,3};

    int res =noble.nobelInteger(arr);
    if(res != -1)
        System.out.println("the noble "+"integer is" +res );
    else
        System.out.println("no noble" + "Integer found");
}
}