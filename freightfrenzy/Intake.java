package org.firstinspires.ftc.teamcode.freightfrenzy;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Intake extends Motor {
    public Intake(HardwareMap hardwareMap, Telemetry t){
        super(hardwareMap,t);
        motor = hardwareMap.get(DcMotorEx.class, "intake");
    }
}