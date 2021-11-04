public enum Vaccine {
    PFIZER ("Pfizer"),
    JANNSEN("Johnson & Johnson"),
    MODERNA("Moderna"),
    ASTRAZENECA ("AstraZeneca");

    // tod 'name' isn't best choice
    private String name;
    Vaccine(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
