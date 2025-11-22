package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;

public class LiftArm extends Command{
    private Arm arm;
    private double armSpeed;

    public LiftArm(Arm a, double s){
        arm = a;
        armSpeed = s;
        addRequirements(arm);
    }

    @Override
    public void execute(){
        arm.liftArm(armSpeed);
    }

    @Override
    public void end(boolean i){
        arm.stop();
    }
}
