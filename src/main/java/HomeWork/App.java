package HomeWork;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Nhandt4
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println(funcBai6(100));
        Random rd = new Random();
        int temp =0;
        int firstNumber =rd.nextInt(10);
        int secondNumber = firstNumber - firstNumber;//rd.nextInt(0);
        int expectedNumber;
//        expectedNumber = firstNumber/temp;
        try {
            expectedNumber = firstNumber/secondNumber;
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            expectedNumber = 0;

        }
        System.out.println(expectedNumber);



    }
    // Bai 1: Viet method nhan vao 1 mang A, sau do tra ra tat ca cac phan thu chi xuat hien trong mang do 1 lan duy nhat. Viet method test cho phuong thuc vua viet
    public static ArrayList<Integer> funcBai1(int[] arr1){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i< arr1.length; i++){
            int dem = 0;
            for(int j = 0; j< arr1.length; j++){
                if ((arr1[i] == arr1[j]) && (i!=j)){
                    dem ++;
                    break;
                }
            }
            if (dem == 0){
                result.add(arr1[i]);
            }
        }
        return result;
    }
    // Bai 2: Viet method nhan vao mot  mang A, dem xem trong mang co bao nhieu phan tu trung nhau. Viet method test cho phuong thuc vua viet
    public static int funcBai2(int[] arr1){
        int dem = 0;
        for (int i = 0; i< arr1.length-1; i++) {
            int temp = 0;
            for (int j = i+1; j < arr1.length; j++) {
                if ((arr1[i] == arr1[j])) {
                    temp++;

                }
            }
            if (temp == 1) {
                dem++;
            }
        }
        return dem;
    }
    // Bai 3: Viet mot method nhan vao 1 mot so nguyen duong n sau do tra ra danh sach n so nguyen to dau tien. Viet Test method cho method nay
    public static ArrayList<Integer> funcBai3(int n){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i<n; i++){
            if((new App()).check_snt(i)==true){
                result.add(i);
            }
        }
        return result;
    }
    public boolean check_snt(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    // Bai 4: Viet method nhan vao 1 so nguyen duong n sau do tinh tong cac chu so cua so n. Viet test method cho phuong thuc nay. vi du n = 456 thi tong bang 15
    public static int funcBai4(int n){
        int sum = 0;
        while (n>=10){
            sum +=n%10;
            n = n/10;
        }
        sum +=n;

        return sum;
    }

    // Bai 5:  Cho mot so n>0, hay viet method phan tich n thanh cac thua so nguyen to. vi du: 28 = 2*2*7. Viet Test method cho method nay
    public static String funcBai5(int n){
        String result = n + "=";
        // Liet ke so nguyen to nho hon bang n
        ArrayList<Integer> arr1 = new ArrayList<>();
        App app = new App();
        for(int i = 2; i <= n; i++ ){
            if(app.check_snt(i)){
                arr1.add(i);
            }
        }
//        System.out.println(arr1);
        if (n==1){
            return "1=1*1";
        }
        // Phan tich so day bang tich cac so nguyen to
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        int index = arr1.size() - 1;
        int a = arr1.get(index);
        while (n>1){
            int dem = 0;
            while (n % a == 0)
            {
                n = n / a;
                dem++;
            }
            if (dem > 0) {
                arr2.add(a);
                arr3.add(dem);
            }
            index--;
            if (index < 0)
                break;
            a = arr1.get(index);
        }
        // In ket qua mot chuoi
        for(int j= arr2.size() -1; j >= 0;  j--){
            for (int t = 1; t<= arr3.get(j); t++){
                result += arr2.get(j).toString() + "*";
            }
        }

        return result.substring(0, result.length() - 1);
    }


    // Bai 6: Cho mot so n > 0, hay liet ke cac so fibonacy la so nguyen to nho hon n. Viet test method cho method nay
    public static ArrayList<Integer> funcBai6(int n){
        ArrayList<Integer> result = new ArrayList<>();
        App app = new App();
        // Tim ra day so day fibonacy nho hon n
        ArrayList<Integer> fiboarr = app.arrFibo(n);
        for (int i =0; i< fiboarr.size(); i++){
            if(app.check_snt(fiboarr.get(i)))
                result.add(fiboarr.get(i));

        }
        return result;
    }
    public ArrayList<Integer> arrFibo(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        if (n == 1) {
            return result;
        } else if (n == 2) {
            result.add(1);
            return result;
        } else {
            result.add(1);
            result.add(2);
            int temp;
            int index = 2;
            for (int i = 2; i< n; i ++){
                temp = result.get(index - 1) + result.get(index - 2);
                if(temp < n){
                    index++;
                    result.add(temp);
                }
            }
            return result;
        }
    }


}

