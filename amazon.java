public class amazon {

   // Remove Duplicates in a String by using recursion by Amazon
   public static void removeDuplicate(String str,int idx, StringBuilder newstr , boolean map[]){
    // base case
    if(idx==str.length()){
        System.out.println(newstr);
        return;
    }
    char currchar=str.charAt(idx);
    if(map[currchar-'a']==true){
        //duplicate string
        removeDuplicate(str, idx+1, newstr, map);
    }else{
       map[currchar-'a']=true;
       removeDuplicate(str, idx+1, newstr.append(currchar), map);
    }

   }

   // tiling problem by amazon
   public static int tilingproblem(int n){
    
    //base case
    if(n==0||n==1){
        return 1;
    }

    //what have to do(kaam)
    //vertical choice
    int fnm1=tilingproblem(n-1);

    //horizontal choice
    int fnm2=tilingproblem(n-2);

    int totways=fnm1+fnm2;
    return totways;
   }

   // To calculate totalway to stand
   public static int friendsparing(int n){
      //Base case
      if(n==1||n==2){
        return n;
      }

      // kaam
      // we have two choice 
      //single
      int fnm1=friendsparing(n-1);

      //pair
      int fnm2=friendsparing(n-2);
      int pairway=(n-1)*fnm2;

      int totways=fnm1+pairway;

      // one line code
      // return friendsparing(n-1)+(n-1)*friendsparing(n-2);
      return totways;

   }
  public static void main(String args[]){
   // String str="appnnacollege";
  //  removeDuplicate(str, 0,new StringBuilder(""), new boolean[26]);
    System.out.println(friendsparing(3));

  }  
}
