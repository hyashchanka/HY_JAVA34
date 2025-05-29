package org.tms.studentservice;

public  class Student {
        private String name;
        private int age;
        private String group;


        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {

            this.age = age;
        }

        public void setGroup(String group) {
            this.group = group;
        }


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getGroup() {
            return group;
        }
    }
