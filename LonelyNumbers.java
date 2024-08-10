import java.util.*;
public class LonelyNumbers{
    public static ArrayList<Integer> lonely(ArrayList<Integer> nums){
        Collections.sort(nums);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            boolean islonely=true;
            if(i>0 && nums.get(i)==nums.get(i-1)){
                islonely=false;
            }
            if(i<nums.size()-1 && nums.get(i)==nums.get(i+1)){
                islonely=false;
            } 
            if(i>0 && nums.get(i)-1==nums.get(i-1)){
                islonely=false;
            }
            if(i<nums.size()-1 && nums.get(i)+1==nums.get(i+1)){
                islonely=false;
            }
            if(islonely){
                list.add(nums.get(i));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        System.out.println(lonely(nums));
    }
}
