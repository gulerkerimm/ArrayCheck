package SymmetricArrayCheck;

public class ArrayCheck {
    public static void main(String[] args) {

        int[]arr ={1,2,3,4,4,3,2,1,};

        boolean isSymmetric=true;
        int left=0;
        int right=arr.length-1;

        while (left<right){
            if (arr[left]!=arr[right]){
                isSymmetric=false;
                break;
            }
            left++;
            right--;
        }

        System.out.print("Verilen dizi: [");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i<arr.length-1){
                System.out.print(", ");

            }

        }
        System.out.println("]");
        if (isSymmetric){
            System.out.println("Verilen array simetriktir");

        }else{
            System.out.println("verilen array simetrik değildir");
        }
    }
}
