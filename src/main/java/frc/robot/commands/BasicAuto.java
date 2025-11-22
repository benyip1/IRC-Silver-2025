package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;

public class BasicAuto extends SequentialCommandGroup {
    public BasicAuto(Drivetrain drivetrain){
        addCommands(
            new AutoDrive(drivetrain, 0.25, 0.25).withTimeout(1.5)
            
            );
    }
}
