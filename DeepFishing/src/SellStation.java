public class SellStation {
    public void enter(){
        int i;
        String text = "\nYou walk up to the Selling Station. You look at the metal elevator chute. You can hear it clunking.\n";
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(5);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }

    public double sell(double money, double value){
        money = money + value;
        return money;
    }

}
