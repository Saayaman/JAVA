

    public class Student {
        private String name;
        private  int id;
        private int age;


//        int s;

//        String names[] = new String[5];
        public Student(String name, int id, int age){

            this.name = name;
//        public Student(String name, int id, int age){
//            for (s = 0; s < 5; s++){
//                this.name = names[s];
//            }
            this.id = id;
            this.age = age;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getName(String name){
            return name;
        }

        public void setAge(int age){
            this.age = age;
        }

        public int getAge(){
            return age;
        }

        public void SetId(int id){
            this.id = id;
        }

        public int getId(){
            return  id;
        }


        public String toString() {

            return

                            name + "      ||    " + id + "      ||    " + age + "      ||    ";

        }

    }

