//
public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));
  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static boolean equals(double [] a, double [] b){
    if (a.length==b.length){
          for(int i=0;i<a.length;i++){
              if (a[i]==b[i]){
                  contipublinue;
              }
              else {
                  return false;
              }
          }
          return true;
        }
      else {
          return false;
      }
  }
  
  public static double [] addArrays(double [] m, double [] n){
      double [] answer;
      if (m.length>n.length){
          answer= new double [m.length];
          for (int i=0;i<n.length;i++){
              answer[i]=m[i]+n[i];
          }
          for (int i=n.length;i<m.length;i++){
              answer[i]=m[i];
          }
      }
      else if (n.length>m.length){
          answer= new double [n.length];
          for (int i=0;i<m.length;i++){
              answer[i]=m[i]+n[i];
          }
          for (int i=m.length;i<n.length;i++){
              answer[i]=n[i];
          }
      }
      else {
          answer= new double [n.length];
          for (int i=0;i<n.length;i++){
              answer[i]=m[i]+n[i];
          }
      }
      return answer;
  }
  
  
  
}

