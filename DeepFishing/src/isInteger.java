public class isInteger {
    public boolean isInteger(String tekst){
        if(tekst == null){
            return false;
        }
        int dlugosc = tekst.length();
        if(dlugosc == 0){
            return false;
        }
        int i = 0;
        if(tekst.charAt(0) == '-'){
            if(dlugosc == 1){
                return false;
            }
            i = 0;
        }
        for (; i<dlugosc; i++){
            char znak = tekst.charAt(i);
            if(znak < '0' || znak > '9'){
                return false;
            }
        }
        return true;
    }
}
