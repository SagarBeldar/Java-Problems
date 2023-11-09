package String;
public class basic3 {

    public static float getShortestpath(String str){
        int x=0,y=0;

        for(int i=0;i<str.length();i++){
            int dir=str.charAt(i);

            //North
            if(dir=='N'){
                y++;
            }
            //South
            else if(dir =='S'){
                y--;
            }
            //West
            else if(dir=='W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }

        int X2=x*x;
        int Y2=y*y;

        return (float)Math.sqrt(X2 + Y2); // Formula  Srt((x2-x1)^2+(y2-y1)^2)


    }
    public static void main(String[] args) {
        //String path="WNEENESENNN";
         String path="SN";
        System.out.println(getShortestpath(path));
    }
}
