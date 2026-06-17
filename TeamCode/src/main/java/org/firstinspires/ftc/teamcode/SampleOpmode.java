package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Practice")
public class SampleOpmode extends OpMode {
    @Override
    public void init() {
     telemetry.addLine("Init Done!");
    }
    @Override
    public void start(){
        telemetry.clearAll();
    }
    @Override
    public void loop() {
        telemetry.addLine("Loop started!");
    }
}
