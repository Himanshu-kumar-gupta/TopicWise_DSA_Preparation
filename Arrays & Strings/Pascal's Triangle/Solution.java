class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows==0)
            return res;
        
        List<Integer> row=new ArrayList();
        row.add(1);
        res.add(new ArrayList<Integer>(row));
        
        for(int i=1;i<numRows;i++) {
            row.clear();
            //Add 1 at first and last
            row.add(1);
            
            //Compute for middle
            for(int j=1;j<i;j++)
                row.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            row.add(1);
            
            res.add(new ArrayList<Integer>(row));
        }
		return res;
    }
}
