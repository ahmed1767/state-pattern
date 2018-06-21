public interface VendingState {
    void hasCash(int cash);
    void doesnthasCash();
    void noDrink();
    void hasChange(boolean has_change);
    void hasDrink();
    void hasNoChange();
    //void ejectDrink();
}
