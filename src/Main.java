public class Main {
    public static void main(String[] args) {
        int [] weight = new int[]{90,91,93,92,85,87,88,89,0,0,0,0};
        weight[0] = 90;
        int janyaryWeight = weight[0];
        System.out.println(janyaryWeight);
        System.out.println(weight[0]);
        System.out.println(weight[4]);
        int january = 0;
        System.out.println(weight[january]);
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);

        }
        //task 1
        int [] one = new int [3];
        one[0]=1;
        one[1]=2;
        one [2]=3;
        for (int i =0 ; i < one.length ;i++){   // не могу понять как решить...
            if ( one[0]% 2==0 ){one[0]= one[0]+1;
                System.out.println(one[0]);}
        if (one[2] % 2 ==0 ){one[2]=one[2]+ 1;}}






        System.out.print(one[0]+","+ one[1]+','+ one[2] );


        //task 2
        double [] two = new double[] {1.57, 7.654, 9.986};
        System.out.print( two[0]+","+ two[1]+','+ two[2] );



        //task 3
        int [] three = new int[] {5,8};
        System.out.print( three [0] +","+ three[1] );

        System.out.println('\n');
        System.out.println(one[2]+","+ one[1]+','+ one[0]);
        System.out.println( two[2]+","+ two[1]+','+ two[0] );
        System.out.println( three[1]+","+ three[0] );
    }
}