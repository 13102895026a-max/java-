//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        int[]  arr = {50,30,50,60,80,99};
        event event = new event();
        int Min = event.Min_array(arr);
        int Sum =event.Sum_array(arr);
        //完成字符串的穿插
        //1.定义两个string 字符串
        String s1="abcdefghi";
        String s2="123456789999";
        //2.判断两个字符串长度并比较
//        int index=0;
//        int s1_lenth = s1.length();
//        int s2_lenth = s2.length();
//        if (s1_lenth>=s2_lenth){
//            //3.如果s1比s2大
//            String temp ="";
//            for (int i =0;i<s2.length();i++){
//                temp+=s1.charAt(i);
//                temp+=s2.charAt(i);
//                index = i+1;
//            }
//            for (int j =index;j<s1.length();j++){
//                temp=temp+s1.charAt(j);
//            }
//            System.out.println(temp);
//        }else {
//            //3.如果s2比s1大
//            String temp ="";
//            for (int i =0;i<s1.length();i++){
//                temp+=s2.charAt(i);
//                temp+=s1.charAt(i);
//                index = i+1;
//            }
//            for (int j =index;j<s2.length();j++){
//                temp=temp+s2.charAt(j);
//            }
//            System.out.println(temp);
//
//        }
        event.array_change(s1,s2);
    }
}
