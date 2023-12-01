class Medicine {
    
    //*Private only used in class not outside */
    public String name;
    public int quantity;
    public String category;


    public Medicine(String name, int quantity, String category){
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getCategory(){
        return category;
    }


    //*Adding quantity to medicines. */
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }


    //*Turns to String */
    @Override
    public String toString(){
        return "Medicine{name='" + name + "', category='" + category + "', quantity=" + quantity + '}';
    }



}
