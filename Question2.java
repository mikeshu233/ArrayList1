import java.util.ArrayList;

class Question2 {
    
     public static void removeSmallest(ArrayList<Integer> nums) {
        int a = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i)>nums.get(a)){
            }else if (nums.get(i)<=nums.get(a)){
                a = i;
            }
        }
        nums.remove(a);
    }
  
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }
        
        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }
    
    
}