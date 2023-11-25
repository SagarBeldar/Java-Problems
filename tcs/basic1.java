import java.util.Scanner;

public class basic1 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String ashok = sc.nextLine();
                String anand = sc.nextLine();
                char as[] = ashok.toCharArray();
                char an[] = anand.toCharArray();
                int count_as = combination(as, as.length);
                int count_an = combination(an, an.length);
                if (count_as == 0 && count_an == 0)
                        System.out.println("Invalid input");
                if (count_as > count_an)
                        System.out.println("Ashok");
                else if (count_an > count_as)
                        System.out.println("Anand");
                else
                        System.out.println("Draw");
        }

static int combination(char arr[],int n)
{
     int count=0;
     String s="";
     for(int i=0;i<n;i++)
     {
         s=""+arr[i];
         for(int j=i+1;j<n;j++)
         {
             s+=arr[j];
             if(s.charAt(0)!=arr[j])
             {
                 for(int k=j+1;k<n;k++)
                 {
                     if(s.charAt(1)!=arr[k])
                         count++;
                 }
             }
             s=""+arr[i];
         }
     }
     return count;
}

}