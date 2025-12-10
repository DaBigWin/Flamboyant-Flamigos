package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.DriveDistance;
import frc.robot.commands.TurnDegrees;
import frc.robot.subsystems.Drivetrain;

public class YourAutonomous extends SequentialCommandGroup {
    public YourAutonomous(Drivetrain drivetrain) {
        addCommands(
            /* ROOKIES, INSERT DRIVE COMMANDS HERE TO CREATE YOUR AUTON! 
             * EX: new DriveTime(parameter, parameter, parameter)
            */
            new TurnDegrees(0.5, 90, drivetrain),
            new DriveDistance(0.5, 4.5 ,drivetrain),
            new TurnDegrees(-0.5, 90, drivetrain),
            new DriveDistance(0.5, 7 , drivetrain),
            new TurnDegrees(-0.5, 90, drivetrain), 
            new DriveDistance(0.5, 7 , drivetrain),
            new TurnDegrees(0.5, 90, drivetrain),
            new DriveDistance(0.5, 4.5 ,drivetrain)
            //turn
            //driveArc
        );
    }
}
