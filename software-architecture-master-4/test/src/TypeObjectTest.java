import typeobjectpattern.SurfingFacility;
import typeobjectpattern.SurfingFacilityAttributes;

public class TypeObjectTest {
    public static void main(String[] args) {
        //定义两种水上交通工具.

        //水上摩托
        SurfingFacilityAttributes motorAttributes = new SurfingFacilityAttributes(
                "motor",
                20,
                70,
                3,
                "Marine motor's speed is relatively fast.Pay special attention when the motor is turning."
        );

        //快船
        SurfingFacilityAttributes speedboatAttributes = new SurfingFacilityAttributes(
                "speedboat",
                50,
                100,
                6,
                "Speedboat's speed is quite fast.The water may come in when accelerating.Watch out your clothes."
        );

        //创建交通工具的实例
        SurfingFacility motor = new SurfingFacility(motorAttributes);
        motor.print();
        SurfingFacility speedboat = new SurfingFacility(speedboatAttributes);
        speedboat.print();

    }
}
