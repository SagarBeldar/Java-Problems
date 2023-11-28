package BinarySearch;

public class first_last_element{
    public static void main(String[] args) {
        int[] nums ={5,7,7,8,8,10};
        int target=8;

        System.out.println(searchRange(nums, target));
    }

     public static int[] searchRange(int nums[],int target){
        int ans[]={-1,-1};

        //check for first occurance
        int start=search(nums, target, true);
        boolean findstartIndex;
        int end=search(nums, target, findstartIndex:false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }

    //this fuction just return the index value of target

     public static int search(int nums[],int target,boolean findstartIndex){
        int ans =-1;
        int start=0;
        int end=nums.length;

        while(start<=end){
            //find thr element 
           int  mid=start+(end-start)/2;

           if(target<nums[mid]){
            end=mid-1;
           }
            else if(target>nums[mid]){
            start=mid+1;
           }
           else{
            //potential ans found
              ans=mid;
            if(findstartIndex){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
           }    
             
        }
        return ans;
    }
}