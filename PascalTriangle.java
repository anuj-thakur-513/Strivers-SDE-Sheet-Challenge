class Solution {
    public List<List<Integer>> generate(int numRows) {
        // list of list to store the answer
        List<List<Integer>> ans = new ArrayList<>();
        // two lists to store the current and previous row
        List<Integer> currRow, prevRow = null;
        
        // start traversing for the rows in ans
        for(int i = 0; i < numRows; i++){
            // create current row
            currRow = new ArrayList<>();
            // traverse for the prevRow
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    currRow.add(1);
                } else {
                    currRow.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }
            
            prevRow = currRow;
            ans.add(currRow);
        }
        
        return ans;
    }
}
