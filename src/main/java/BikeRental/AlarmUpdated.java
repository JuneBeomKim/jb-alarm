package BikeRental;

public class AlarmUpdated extends AbstractEvent {

    private Long id;

    public AlarmUpdated(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
