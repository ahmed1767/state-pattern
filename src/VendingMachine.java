public class VendingMachine {

    VendingState hasCash;
    VendingState doesnthasCash;
    VendingState noDrink;
    VendingState hasChange;
    VendingState hasDrink;
    VendingState hasNoChange;
    //VendingState ejectDrink;

    VendingState vendingState;
    int drinks_remaining = 20;
    boolean has_change = false;

    public VendingMachine(){

        hasCash = new HasCash(this);
        doesnthasCash = new DoesntHasCash(this);
        noDrink = new NoDrink(this);
        hasChange = new HasChange(this);
        hasDrink  = new HasDrink(this);
        hasNoChange = new HasNoChange(this);


        vendingState = doesnthasCash;
        if(drinks_remaining < 0){
            vendingState = noDrink;
        }
    }


    void setVendingState(VendingState state){
        vendingState = state;
    }

    public void setDrinksInMachine(int new_drink){
        drinks_remaining += new_drink;
    }

    public void hasCash(int cash) {
        vendingState.hasCash(cash);
    }

    public void doesnthasCash() {
        vendingState.doesnthasCash();
    }

    public void noDrink() {
        vendingState.noDrink();
    }

    public void setHasChange(boolean has_change){
        vendingState.hasChange(has_change);
    }

    public void hasDrink(){
        vendingState.hasDrink();
    }

    public void hasNoChange(){
        vendingState.hasNoChange();
    }

    public VendingState getYesCashState() { return hasCash; }
    public VendingState getNoCashState() { return doesnthasCash; }
    public VendingState getHasChange() { return hasChange; }
    public VendingState getNoDrink() { return noDrink; }
    public VendingState getHasNoChange() { return hasNoChange; }
    public VendingState getHasDrink() { return hasDrink; }

}
