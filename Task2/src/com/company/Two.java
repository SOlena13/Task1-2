package com.company;

    public class Two extends One {
        int j;

        public Two(int j, int j1) {
            super(j);
            this.j = j1;
        }

        void metod(){
            int sum=j+super.j;
            System.out.println(sum);
        }
    }

