public class Pricing {
    private String[] headers;
    private String[] options;
    private double[][] prices;

    public Pricing(String[] headers, String[] options, double[][] prices) {
        this.headers = headers;
        this.options = options;
        this.prices = prices;
    }

    public String[] getHeaders() {
        return headers;
    }

    public String[] getOptions() {
        return options;
    }

    public double[][] getPrices() {
        return prices;
    }
    
    public void setHeaders(String[] headers) {
        this.headers = headers;
    }    
    
    public void setOptions(String[] options) {
        this.options = options;
    }
    
    public void setPrices(double[][] prices) {
        this.prices = prices;
    }

    public String formatPrice(double price) {
        return "RM" + String.format("%.2f", price);
    }
}
