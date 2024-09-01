class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        
        boolean C1 = (coordinate1.charAt(0) + coordinate1.charAt(1)) % 2 != 0;
        boolean C2 = (coordinate2.charAt(0) + coordinate2.charAt(1)) % 2 != 0;
        
        return C1 == C2;  
    }
}