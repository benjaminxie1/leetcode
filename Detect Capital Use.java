class Solution {
    public boolean detectCapitalUse(String word) {
            int count = 0;
        for(int i = 0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i)))
                count++;
            
        }
        if(Character.isUpperCase(word.charAt(0)) == true && count == 1 || count == word.length() || count == 0)
            return true;
       
        return false;
    }
}
