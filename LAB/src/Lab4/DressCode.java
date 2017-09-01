package Lab4;

enum DressCode {
   JERSEY("jersey"),
   FANCY("fancy"),
   ANYTHING("anything"),
   UNIFORM("uniform");

   private String description;

   private DressCode(String description) {
       this.description = description;
   }

    public String getDescription() {
        return description;
    }
}
