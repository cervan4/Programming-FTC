package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorRangeSensor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;



import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;


@TeleOp

public class Motor_Arm extends OpMode {

    private DcMotor backleft = null; 
    private DcMotor backright = null; 
    private DcMotor frontleft = null; 
    private DcMotor frontright = null; 
    @Override
    public void init()
    {
        backleft = hardwareMap.get(DcMotor.class, "backleft");
        backright = hardwareMap.get(DcMotor.class, "backright");
        frontleft = hardwareMap.get(DcMotor.class, "frontleft");
        frontright = hardwareMap.get(DcMotor.class, "frontright");

        backleft.setDirection(DcMotorSimple.Direction.REVERSE);
        frontleft.setDirection(DcMotorSimple.Direction.REVERSE);
        backright.setDirection(DcMotorSimple.Direction.FORWARD);
        frontright.setDirection(DcMotorSimple.Direction.FORWARD);

    }
    public void sidetoside()
    {
        double forward = 1;
        double back = -1;
        if(gamepad1.left_bumper)
        {
            backleft.setPower(forward);
            backright.setPower(back);
            frontleft.setPower(back);
            frontright.setPower(forward);
        }
        else if(gamepad1.right_bumper)
        {
            backleft.setPower(back);
            backright.setPower(forward);
            frontleft.setPower(forward);
            frontright.setPower(back);
        }
    }
    @Override

    public void loop()
    {
        sidetoside();
    }
    @Override
    public void stop() {
    }