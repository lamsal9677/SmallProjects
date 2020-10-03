
public class Tuple {
public static void main(String args[]) {
	int[] a =  {1, 1, 1, 2, 1, 3, 4};
	System.out.println(goodTuples(a));;
}
static int goodTuples(int[] a) {

    int[] b = new int[3];
    
    int count = 0;
    int i=0;
    while((i+2)<(a.length)){
           b[0] = a[i];
           b[1] = a[i+1];
           b[2] = a[i+2];
           if (isTupple(b)){
               count++;
           }
    }
    System.out.println("hell");
return count;

}
static boolean isTupple(int[] b){
    int count = 0;
    if (b[0] == b[1] ){
        count++;
    }
    if (b[0] == b[2]){
        count++;
    }
    if (b[1] == b[2]){
        count++;
    }
    if (count<2){
        return false;
    }
    return true;
}
}
