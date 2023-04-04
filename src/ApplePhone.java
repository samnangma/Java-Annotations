import lombok.*;

@SmartPhone
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplePhone {
    @Bluetooth (speed = "3.4HGz")
    private Integer code;
    private String modal;
    private Integer year;

    private AppleBluetooth BlueBooth;



}
