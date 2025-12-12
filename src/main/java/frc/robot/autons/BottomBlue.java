package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.DriveDistance;
import frc.robot.subsystems.Drivetrain;

public class AnotherAuton extends SequentialCommandGroup {
    public AnotherAuton(Drivetrain drivetrain) {
        addCommands(
            new DriveDistance(0.5, 5, drivetrain),
            new TurnDegrees(0.5, 90, drivetrain),
            new DriveDistance(0.5, 7, drivetrain),
            new TurnDegrees(0.5, -90, drivetrain),
            new DriveDistance(0.5, )




        );
    }
    
}
