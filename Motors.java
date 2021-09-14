package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorRangeSensor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DcMotor;


import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;


@TeleOp

public class Motor_Arm extends OpMode {

    private DcMotor  arm = null;
    @Override
    public void init()
    {
        arm = hardwareMap.get(DcMotor.class, "RobotArm")
        arm.setDirection(DcMotorSimple.FORWARD);
    }
    void arm_code()
    {
        double armpower = 0.5;
        double armpower2 = -0.5;
        if(gamepad1.x)
        {
            arm.setPower(armpower);
        }
        else if(gamepad1.a)
        {
            arm.setPower(armpower2);
        }
    }
    @Override
    public void loop()
    {
        arm_code();
    }
    @Override
    public void stop() {
    }

}