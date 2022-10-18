package carComponents;

public enum ComponentTypes {

ENGINE("Combustion", "Hybrid", "Electric"),
TYRES("All-terrain", "Winter Tyres", "Summer Tyres"),
CHASSIS("Sports Car", "Van", "Pick-up");

private final String type1;
private final String type2;
private final String type3;


    ComponentTypes(String type1, String type2, String type3) {
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
    }

    public String getType(int index) {
        if(index == 1){
            return this.type1;
        } else if (index ==2){
            return this.type2;
        } else if (index ==3){
            return this.type3;
        }
        return  null;
    }

}


