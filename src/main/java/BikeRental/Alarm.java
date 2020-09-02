package BikeRental;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Alarm_table")
public class Alarm {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Long bikeId;
    private Long voucherId;
    private String status;

    @PostPersist
    public void onPostPersist(){
        AlarmRegistered alarmRegistered = new AlarmRegistered();
        BeanUtils.copyProperties(this, alarmRegistered);
        alarmRegistered.publishAfterCommit();


    }

    @PostUpdate
    public void onPostUpdate(){
        AlarmUpdated alarmUpdated = new AlarmUpdated();
        BeanUtils.copyProperties(this, alarmUpdated);
        alarmUpdated.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getBikeId() {
        return bikeId;
    }

    public void setBikeId(Long bikeId) {
        this.bikeId = bikeId;
    }
    public Long getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Long voucherId) {
        this.voucherId = voucherId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }




}
