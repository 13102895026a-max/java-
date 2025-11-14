public class event {
//    完成数组最小值统计
    public static  int Min_array(int [] arr){
        int Min = arr[0];
        for (int i=0;i<arr.length;i++){
            if (Min> arr[i]){
                Min=arr[i];
            }
        }
        System.out.printf("该数组最小值为%s",Min);
        System.out.println("");
        return Min;
    }
//    完成数组的求和
    public static int Sum_array(int [] arr){
        int Sum=0;
        for (int i=0;i<arr.length;i++){
          Sum+=arr[i];
        }
        System.out.printf("该数组和为%s",Sum);
        System.out.println("");
        return Sum;
    }
    //完成字符串的穿插
    public static void array_change(String s1,String s2){
        int index=0;
        int s1_length = s1.length();
        int s2_length = s2.length();
        if (s1_length>=s2_length){//3.如果s1比s2大
            String temp ="";
            for (int i =0;i<s2.length();i++){
                temp+=s1.charAt(i);
                temp+=s2.charAt(i);
                index = i+1;
            }
            for (int j =index;j<s1.length();j++){
                temp=temp+s1.charAt(j);
            }
            System.out.println(temp);
        }else {            //3.如果s2比s1大
            String temp ="";
            for (int i =0;i<s1.length();i++){
                temp+=s2.charAt(i);
                temp+=s1.charAt(i);
                index = i+1;
            }
            for (int j =index;j<s2.length();j++){
                temp=temp+s2.charAt(j);
            }
            System.out.printf("穿插后的字符%s",temp);

        }
    }
}
