package com.Car;

public class Cars {
        private String make;
        private String model;
        private String plateNumber;
        private String vin;
        private int year;
        private int mileage;
        private String color;

        // Setters
        public void setMake(String make) {
                this.make = make;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public void setPlateNumber(String plateNumber) {
                this.plateNumber = plateNumber;
        }

        public void setVin(String vin) {
                this.vin = vin;
        }

        public void setYear(int year) {
                this.year = year;
        }

        public void setMileage(int mileage) {
                this.mileage = mileage;
        }

        public void setColor(String color) {
                this.color = color;
        }

        // Getters
        public String getMake() {
                return make;
        }

        public String getModel() {
                return model;
        }

        public String getPlateNumber() {
                return plateNumber;
        }

        public String getVin() {
                return vin;
        }

        public int getYear() {
                return year;
        }

        public int getMileage() {
                return mileage;
        }

        public String getColor() {
                return color;
        }
}
