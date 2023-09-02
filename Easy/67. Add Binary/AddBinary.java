class AddBinary {
    public String addBinary(String a, String b) {
        int carry =0;
        // int aSize = a.length();
        // int bSize = b.length();
        String result = "";
        int i=0;
        while(i<a.length() || i<b.length() || carry!=0){
            int x = 0;
            if(i<a.length() && a.charAt(a.length()-1-i) == '1') x = 1;
            int y = 0;
            if(i<b.length() && b.charAt(b.length()-1-i) == '1') y = 1;
            
            result = (x + y + carry)%2 + result;
            carry = (x + y + carry)/2;
            i++;
        }
        return result;
    }
}