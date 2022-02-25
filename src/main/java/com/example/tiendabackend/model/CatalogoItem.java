package com.example.tiendabackend.model;

public class CatalogoItem {

        Long id;
        String imageUrl;
        String  name;
        String vendor;
        Float price;

        public CatalogoItem(Long id, String imageUrl, String name, String vendor, Float price) {
            this.id = id;
            this.imageUrl = imageUrl;
            this.name = name;
            this.vendor = vendor;
            this.price = price;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVendor() {
            return vendor;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
        }

        public Float getPrice() {
            return price;
        }

        public void setPrice(Float price) {
            this.price = price;
        }

}
