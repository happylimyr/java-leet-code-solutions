package easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += (int) a.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += b.charAt(j--) - '0';
            }
            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();


    }
}

//        1010
//        1011
//       10101
//        if(a.length() < b.length()) return addBinary(b,a);
//
//        int i = a.length();
//        int j = b.length();
//        int carry = 0;
//        char[] arr = new char[i+1];
//
//        while(i > 0){
//        carry += a.charAt(--i) - '0';
//        if(j > 0) carry += b.charAt(--j) - '0';
//
//        arr[i+1] = (char) (carry % 2 + '0');
//        carry/=2;
//        }
//        if(carry == 0) return new String(arr , 1 , arr.length-1);
//
//        arr[0] = '1';
//        return new String(arr);