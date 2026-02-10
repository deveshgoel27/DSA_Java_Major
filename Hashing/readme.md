twoSUm = >  Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i<nums.length ; i++){
            int req_num = target - nums[i];   //9-2 = 7    (2,0) , 9(req_num hai ) - 7(i hai) = 2      store hora hai (7,1)
            if(map.containsKey(req_num))
            {               int [] arr = {map.get(req_num),i};  // {0,1}   return arr;}
            map.put(nums[i],i);   // chlayo end tk }
        return null;    // kuch ni hoga toh null

factorial ==>  if(n == 0 || n == 1) return 1;     return n * factorial(n - 1); 

fibonaci->  if(n <= 1) return n;  return fibRecursive(n - 1) + fibRecursive(n - 2);

validparanthesis ->  while (true) {
            if(s.contains("()")){
                s = s.replace("()", "");
            } 

frequency o feach element ==>  Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
               map.put(arr[i],map.get(arr[i])+1);
        } else{
            map.put(arr[i], 1);
        }
    }
        System.out.println("Element | Frequency");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + "   " + entry.getValue());
        }