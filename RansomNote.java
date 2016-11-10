import java.util.*;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        LinkedList<Character> ransomList = new LinkedList();
        LinkedList<Character> magazineList = new LinkedList();
        char[] ransomArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();
        for(char c: ransomArray){
            ransomList.offer(c);
        }
        for(char c: magazineArray){
            magazineList.offer(c);
        }
        
        for(char c: ransomList){
            if(!magazineList.contains(c)){
                // System.out.println("false: "+magazineList);
                return false;
            }
            else{
                int idx = magazineList.indexOf(c);
                System.out.println(idx);
                // ransomList.remove(c);
                magazineList.remove(c);
                // System.out.println("true: "+ransomList);
            }
        }
        return true;
    }

    public static void main(String args[]){
        RansomNote rn = new RansomNote();
        boolean b = rn.canConstruct("fihjjjjei","hjibagacbhadfaefdjaeaebgi");
        System.out.println(b);
    }
}
