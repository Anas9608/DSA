    package practice.DSA.Array;
    class solution{
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
            
        
            ArrayList<int[]> list = new ArrayList<>();
                                
            int i = 0;
            int j=0;
            
            while(i < firstList.length && j < secondList.length){
                int start = Math.max(firstList[i][0],secondList[j][0]);
                int end = Math.min(firstList[i][1],secondList[j][1]);
                
            if(start <= end){
                list.add(new int[]{start,end});
            
            
                }
            if(secondList[j][1] == end) j++;
            
            else i++;      
            
                }

        return list.toArray(new int[list.size()][]);
      
    }
    }