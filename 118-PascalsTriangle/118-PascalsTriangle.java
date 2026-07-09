// Last updated: 7/9/2026, 9:28:09 AM
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<numRows; i++) {

            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++) {

                //If first or last element of row then add default value 1
                if(j==0 || j==i) {
                    row.add(1);
                } 

                // Else calculate from prevous row
                else {
                    List<Integer> prev_row = result.get(i-1);
                    int value = prev_row.get(j-1) + prev_row.get(j);
                    System.out.print(value+ ",");
                    row.add(value);
                }
            }

            result.add(row);
        }

        return result;
    }
}