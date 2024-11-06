class Solution{
    public String solution(String code) {
        int mode = 0;
        char[] codeArr = code.toCharArray();
        String ret = "";
        for(int idx = 0; idx < codeArr.length; idx++) {
            switch(mode) {
                case 0:
                    if(codeArr[idx] == '1') {
                        mode = 1;
                    }else{
                        if(idx%2 == 0){ ret += codeArr[idx];}
                    }
                    break;

                case 1:
                    if(codeArr[idx] == '1') {
                        mode = 0;
                    }else{
                        if(idx%2 == 1){ ret += codeArr[idx];}
                    }
                    break;
                default:
                    return null;
            }
        }
        return ret.isEmpty()?"EMPTY":ret;
    }
}