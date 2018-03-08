public enum HealType {
    POTION(40),
    HERBS(30);


    private int heal;

    HealType(int heal){
        this.heal = heal;
    }

    public int healPlayer(){
        return heal;
    }

}


