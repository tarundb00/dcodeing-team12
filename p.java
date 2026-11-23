import java.util.Arrays;
import java.util.Scanner;

public class p {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("100");
        // System.out.print("100");
        // System.out.printf("100");
        // int i = 0;

        // for (System.out.println("start"); i < 5; System.out.print("inc"))
        // {
        // System.out.println("Block of code ");
        // i++;
        // }

        // do {
        // System.out.println("block of code ");
        // i++;
        // } while (i > 5);
        // 1.sum of natural numbers

        // System.out.println("Enter the number:");
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum = sum + i;

        // }
        // System.out.println(sum);
        // sum of factors
        // System.out.println("Enter the number:");
        // int n = sc.nextInt();
        // int fact = 0;
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0)
        // fact += i;
        // }
        // System.out.println(fact);

        // sum of digits
        // System.out.println("Enter the number:");
        // int n = sc.nextInt();
        // int sum = 0;
        // while (n != 0) {
        // sum =sum+ (n % 10);
        // n=n/10;

        // }
        // System.out.println(sum);

        // sum of factorial
        // System.out.println("Enter the number:");
        // int n = sc.nextInt();
        // int sum = 1;
        // for (int i = 1; i <= n; i++) {
        //     sum = sum * i;
        // }
        // System.out.println(sum);



        //fibonacci series
        // System.out.println("Enter the number:");
        // int n = sc.nextInt();
        // int a=0;
        // int b=1;
        // int c=0;
        // if(n==0){
        //     System.out.println("0");
        // }
        // if(n>=1){
        //     System.out.print("0 1 ");
        //     for (int i=2; i<=n; i++) {
        //         c=a+b;
        //         System.out.println(c+" ");
        //         a=b;b=c;
                
        //     }
        // }

        // check the giveen number is prime or not

        // int n= sc.nextInt();
        // int sum=0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0)
        //     sum++;
        // }
        // if(sum==2)
        // System.out.println("Prime");
        // else{
        //     System.out.println("not a Prime");
        // }

        //Guess the number (user need to find the number in the condition )
    //     int n=20;
    //     int input=0;

    //    do{
    //     System.out.println("Guess the number");
    //     input=sc.nextInt();

    //    }while(n!=input);
    //    System.out.println("you found it ");
    //



    //sum of digits (input=444=>4+4+4=>12=>1+2=>3)until a single number

    //  System.out.println("Enter the number:");
    //      int n = sc.nextInt();
    //      int sum = 0;
    //     for(;n!=0;){
    //         sum+=(n%10);
    //         n/=10;
    //         if(sum>9 && n==0){
    //             System.out.println(sum);
    //             n=sum;
    //             sum=0;
    //         }
    //     }
    //      System.out.println(sum);

    //strong or weak password (min 1 digit,1 lowercase.1 uppercase,1 special char,length of password >8)
    //askey value 32 space ,48 is 0, uppercase A is 65,lowercase a is 97
    // A_Z a-z 0-9 special char
    // String input="ABc@1234$";
    // boolean upper =false;
    // boolean lower=false;
    // boolean number=false;
    // boolean special=false;
    // for(int i=0;i<input.length();i++){
    //     char c=input.charAt(i);
    //     if(c>=65||c<=90){
    //         upper=true;

    //     }
    //     else  if(c>=97 ||c<=122){
    //            lower=true;
    //     }
    //     else  if(c>=48 ||c<=57){
    //            number=true;
    //     }
    //     else{
    //         special=true;

    //     }
    // }
    // if(input.length()>8 && upper && lower && number&& special){
    //     System.out.println("Password strong");
    // }
    // else{
    //     System.out.println("Weak strong");
    // }




    //9.calculation appication 
   // (two input as input values third input as operation do it again and again until user  )
//1.add 2.sub 3.mul 4.exit
// int num1=0;
// int num2=0;
// char operation='0';
// do{
//     System.out.println("1.Add");
//     System.out.println("2.sub");
//     System.out.println("3.mul");
//     System.out.println("4.div");
//     System.out.println("0.exit");
//     operation=sc.next().charAt(0);
//     if(operation !='0'){
//         System.out.println("Enter the num1:");
//         num1=sc.nextInt();
//         System.out.println("Enter the num2:");
//         num2=sc.nextInt();
//         switch (operation) {
//             case '1':
//                  System.out.println("Output:"+(num1+num2));
//                 break;
//             case '2':
//                  System.out.println("Output:"+(num1-num2));
//                 break;
//             case '3':
//                  System.out.println("Output:"+(num1*num2));
//                  break;
//              case '4':
//                  System.out.println("Output:"+(num1/num2));
//                  break;     
                
//             default:
//                 break;
//         }
//     }
// }while (operation!='0');
    


//----------------------//ARRAY--------------


//1.Print all elemnets in the array 
// System.out.println("Enter the size of Array");
// int n=sc.nextInt();
// int arr[]=new int[n];
// System.out.println("Enter the numbers for Array:");
// for(int i=0;i<n;i++){
//    arr[i]= sc.nextInt();
// }
// System.out.println("Enterd numbers");
// for(int j=0;j<arr.length;j++){
//     System.out.println(arr[j]);
// }
// System.out.println("Reverse value:");
// for(int k=n-1;k>=0;k--){
//     System.out.println(arr[k]);
// }


//2.Print even index values;
//  System.out.println("Enter the size of Array");
// int n=sc.nextInt();
// int arr[]=new int[n];
// System.out.println("Enter the numbers for Array:");
// for(int i=0;i<n;i++){
//    arr[i]= sc.nextInt();
// }
// System.out.println("Enterd numbers");
// for(int j=0;j<arr.length;j+=2){
//     System.out.println(arr[j]);
// }


//3.Print even numbers in the array
//  System.out.println("Enter the size of Array");
// int n=sc.nextInt();
// int arr[]=new int[n];
// System.out.println("Enter the numbers for Array:");
// for(int i=0;i<n;i++){
//    arr[i]= sc.nextInt();
// }
// System.out.println("Even numbers in the array");
// for(int j=0;j<arr.length;j++){
//     if(arr[j]%2==0)
//       System.out.println(arr[j]);
// }


//4.find the minmum values in the arrry
//   System.out.println("Enter the size of Array");
// int n=sc.nextInt();
// int arr[]=new int[n];

// System.out.println("Enter the numbers for Array:");
// for(int i=0;i<n;i++){
//    arr[i]= sc.nextInt();
// }
// int min =arr[0];
// int smin=Integer.MAX_VALUE;
// System.out.println("minimum number");
// for(int j=0;j<arr.length;j++){
//    if( min>arr[j]){
//         smin=min;
//         min=arr[j];
        
//    }
//    else if(smin>arr[j]&&min!=arr[j])
//         smin=arr[j];    
// }
//       System.out.println(min);
//    System.out.println("Second min:"+smin);


// System.out.println("Enter the size of Array");
// int n=sc.nextInt();
// int arr[]=new int[n];

// System.out.println("Enter the numbers for Array:");
// for(int i=0;i<n;i++){
//    arr[i]= sc.nextInt();
// }
// int min =arr[0];
// int smin=Integer.MAX_VALUE;
// System.out.println("minimum number");
// for(int j=0;j<arr.length;j++){
//    if( min>arr[j]){
//         smin=min;
//         min=arr[j];
        
//    }
//    else if(smin>arr[j]&&min!=arr[j])
//         smin=arr[j];    
// }
//       System.out.println(min);
//    System.out.println("Second min:"+smin);


// System.out.println("Enter the size of Array");
// int n=sc.nextInt();
// int m=sc.nextInt();
// int[][] arr=new int[n][m];

// System.out.println("Enter the numbers for Array:");
// for(int i=0;i<n;i++){
//    for(int j=0;j<m;j++){
//    arr[i][j]= sc.nextInt();
// }}

//   for(int i=0;i<n;i++){
//    for(int j=0;j<m;j++){
//      System.out.println(arr[i][j]);

//    }         
//     }


//   for(int i=0;i<n;i++){
//    for(int j=m-1;j>=0;j--){
//       if((i+j)==m-1)
//      System.out.println(arr[i][j]);

//    }         
//     }


// PRINT THE ALL ELEMENTS SKIP MIDDLE ELEMENT
//   for(int i=0;i<n;i++){
//    for(int j=0;j<m;j++){
//       if(i==0||j==0||i==n-1||j==m-1)
//          System.out.println(arr[i][j]);
//       else{
//          System.out.println("  ");
//       }   

//    }         
//     }


   //  for(int i=0;i<n;i++){
   //    System.out.print(arr[0][i]+" ");
   //  }
   //      for(int i=0;i<n;i++){
   //    System.out.print(arr[i][i]+" ");
   //  }


//    //jagad array
//   for(int i=0;i<n;i++){
//    for(int j=0;j<arr[i].length;j++){
//      System.out.println(arr[i][j]);

//    }         
//     }



// STRING

// String str= new String();
// str=null;
// System.out.println(str);
// String arr[]=new String[3];
// System.out.println(Arrays.toString(arr));


// String str= new String();
// str="";
// System.out.println(str);
// System.out.println(System.identityHashCode(str));
// str="Laptop";
// System.out.println(System.identityHashCode(str));
// System.out.println(str);

// StringBuilder sb= new StringBuilder();
// sb.append("Arun");
// System.out.println(sb);
// System.out.println(sb.capacity());
// System.out.println(sb.length());
// System.out.println(System.identityHashCode(sb));
// sb.append("sfsdffvssdsdssds");

// System.out.println(sb.capacity());
// System.out.println(sb.length());
// System.out.println(System.identityHashCode(sb));


String str="Tarun";
System.out.println(str.length());
int count=0;
for(char c : str.toCharArray()){
   System.out.println(c);
   count++;
}
System.out.println(count);
char ch[]=str.toCharArray();
System.out.println(Arrays.toString(ch));

   }
}