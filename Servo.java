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

    private Servo servo_test = null;
    
    @Override
    public void init()
    {
        servo_test = hardwareMap.servo.get("Servo");
    }
    public void servo_move()
    {
        if(gamepad1.x)
        {
            servo_test.setPosition(-1);
        }
        else if(gamepad1.a)
        {
            servo_test.setPosition(1);
        }
    }
    @Override
    public void loop()
    {
        servo_move();
    }
    @Override
    public void stop() {
    }