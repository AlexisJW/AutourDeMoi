package com.alexis.autourdemoi.data.remote.models;

import java.util.List;

public class PlacesRadiusResponse {
    private List<Feature> features;

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public static class Feature {
        private Geometry geometry;
        private Properties properties;

        public Geometry getGeometry() {
            return geometry;
        }

        public Properties getProperties() {
            return properties;
        }
    }
    public static class Geometry {
        private List<Double> coordinates; // [lon, lat]

        public List<Double> getCoordinates() {
            return coordinates;
        }
    }
    public static class Properties {
        private String xid;
        private String name;
        private String kinds;
        private Double rate;

        public String getXid() {
            return xid;
        }

        public String getName() {
            return name;
        }

        public String getKinds() {
            return kinds;
        }

        public Double getRate() {
            return rate;
        }
    }
}
