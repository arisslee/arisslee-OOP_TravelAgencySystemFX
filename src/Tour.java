public abstract class Tour {
    private String[] tourDetails;
    private String duration;
    private Pricing pricing;

    public Tour(String[] tourDetails, String duration, Pricing pricing) {
        this.tourDetails = tourDetails;
        this.duration = duration;
        this.pricing = pricing;
    }

    public String[] getTourDetails() {
        return tourDetails;
    }

    public String getDuration() {
        return duration;
    }

    public Pricing getPricing() {
        return pricing;
    }
    
    public void setTourDetails(String[] tourDetails) {
        this.tourDetails = tourDetails;
    }    
    
    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }
}
