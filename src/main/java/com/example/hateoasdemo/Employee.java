package com.example.hateoasdemo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Employee {

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getCompany() {
                return company;
        }

        public void setCompany(String company) {
                this.company = company;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        private  String name;
        private String company;
        private @Id @GeneratedValue Long id;


}
