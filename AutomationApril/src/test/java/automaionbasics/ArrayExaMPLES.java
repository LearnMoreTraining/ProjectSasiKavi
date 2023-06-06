package automaionbasics;

public class ArrayExaMPLES {

    public static void main(String[] args) {

        int [] a = {45,66,78,90}; //index order - 0,1,2,3 // length - 4
        String []b = {"sasi","ajay","kalai"}; // 3 //0,1,2

        for(String r:b){
            System.out.println(r);
        }

        System.out.println(a[2]);
        System.out.println(b[2]);

        for(int t:a){
            System.out.println(t);
        }
        System.out.println("---------------");
        for(int j=0;j<b.length;j++){
            System.out.println(b[j]);
        }

        //0 <3
        //1<3
        //2 <3
        //3<3 - false

        for (int i=0; i<a.length;i++){

            System.out.println(a[i]);
        }


    }
}
