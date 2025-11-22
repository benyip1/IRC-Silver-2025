package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    // declare motor controller
    private VictorSP leftMotor;
    private VictorSP rightMotor;

    // constructor
    public Drivetrain(){
        // parameter channel is the port on your RoboRIO the motor controller is plugged in to
        leftMotor = new VictorSP(1);
        // what number port you plugged into your RoboRIO (**CHANGE LATER**)
        rightMotor = new VictorSP(0);
        // what number port you plugged into your RoboRio (**CHANGE LATER**)
        
        // leftMotor.setInverted(false);
        // depends on your robot's chosen orientation, can change from left to right depending on how the robot is


    }
    public void drive(double forward,double turn){
        leftMotor.set(forward);
        rightMotor.set(turn);
    }
    public void stop(){
        leftMotor.stopMotor();
        rightMotor.stopMotor();
    }
    
}

