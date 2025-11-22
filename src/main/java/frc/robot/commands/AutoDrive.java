package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;

public class AutoDrive extends Command{
    private Drivetrain drivetrain;
    private double leftSpeed, rightSpeed;

    public AutoDrive(Drivetrain drivetrain, double leftSpeed, double rightSpeed){
        this.drivetrain = drivetrain;
        this.leftSpeed = leftSpeed;
        this.rightSpeed = rightSpeed;
        addRequirements(drivetrain);
    }
    @Override
    public void execute(){
        drivetrain.drive(leftSpeed , rightSpeed);
    }
    @Override
    public void end(boolean interrupted){
        drivetrain.stop();
    }
}
