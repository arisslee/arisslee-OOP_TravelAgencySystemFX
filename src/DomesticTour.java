public class DomesticTour extends Tour {

    public DomesticTour(String state, boolean hasPrivateTour, boolean hasHoneymoonTour,
                        String duration, Pricing pricing) {
        super(new String[]{"State: " + state,
                "Has Private Tour: " + (hasPrivateTour ? "Yes" : "No"),
                "Has Honeymoon Tour: " + (hasHoneymoonTour ? "Yes" : "No")}, duration, pricing);
    }
}
