package projeto_testeapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserData {
    private Data data;

    // Construtores, getters e setters

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setName(String morpheus) {
        
    }

    public void setJob(String leader) {
       
    }
    
 
            
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Data {
        private int id;
        private String first_name;
        private String last_name;
        private String name;
        private String job;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }
        
        public String getLast_name() {
            return last_name;
        }    
        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }
        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
        public String getJob() {
            return job;
        }

        public void setJob(String name) {
            this.job = job;
        }
    }
}



 
