public class OverseasTour extends Tour {

    public OverseasTour(String country, String state, boolean hasJoinedTour, boolean hasPrivateTour,
                        String duration, Pricing pricing) {
        super(new String[]{"Country: " + country, "State: " + state,
                "Has Joined Tour: " + (hasJoinedTour ? "Yes" : "No"),
                "Has Private Tour: " + (hasPrivateTour ? "Yes" : "No")}, duration, pricing);
    }
}
