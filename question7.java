public class question7 {
//    This program finds the first character which is unique by using a hashmap
    public static void main(String[] args){
        String s="intern at tugcc";

        char[] a =s.toCharArray();

char [] arr=new char[s.length()];
for(int i=0;i<a.length;i++){
    if(a[i]==' '){
        arr[i]=' ';
    }
}
int j=a.length-1;
String res="";
for(int i=0;i<a.length;i++){
  if(a[i]!=' '){
      if(arr[j]==' '){
          j--;
      }
      arr[j]=a[i];
      j--;
  }
  res=new String(arr);

}
    System.out.println(res);


    }
}
