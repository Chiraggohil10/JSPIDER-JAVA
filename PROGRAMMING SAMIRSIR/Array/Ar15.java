//number of occurance
// i / p = 2,3,4,6,7,2,3,-1,-1 
// o /p = 2 number of occurance 2
// 		  3 number of occurance 2
// 		  4 number of occurance 1
//        6 number of occurance 1
//        7 number of occurance 1
//       -1 number of occurance 2

public class Ar15 {
    public static void main(String[] args) {
        int x[] = { 2, 3, 4,4, 5, 6, 6 ,6};
        for (int i = 0; i <= x.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j <= x.length - 1; j++) {
                if (x[i] == x[j]) {  //if we take element as -1 then it will not work
                    count++;
                    x[j] = -1;
                }
            }
            if (x[i] != -1)
                System.out.println(x[i] + " no of occurance " + count);
        }
    }
}

// public class Ar15 {
//     public static void main(String[] args) {
//         int arr[] = { 2,3,4,6,7,2,3,-1,-1};
// 		boolean b[] = new boolean[arr.length];
// 		 for(int i=0; i<=b.length-1; i++) {
// 			 if(b[i]== false) {
// 				  int count =1;
// 				 for(int j=i+1; j<=arr.length-1;j++) {
// 					  if(arr[i]==arr[j]) {
// 						  count++;
// 						  b[j]=true;
// 					  }
// 				 }
// 				 System.out.println(arr[i]+ " number of occurance "+count);
// 			 }
// 		 }
//     }
// }

