public enum Vaccine {
    PFIZER ("Pfizer"),
    JANNSEN("Johnson & Johnson"),
    MODERNA("Moderna"),
    ASTRAZENECA ("AstraZeneca");

    // tod 'name' isn't best choice
    private String displayName;
    Vaccine(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
