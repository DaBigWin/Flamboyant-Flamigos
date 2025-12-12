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
            new TurnDegrees(0.5, 90, drivetrain), //makes it ready to move forward from starting position
            new DriveDistance(0.5, 4.5 ,drivetrain), //goes forward
            new TurnDegrees(-0.5, -90, drivetrain), //turns right(?) negative 90 degrees
            new DriveDistance(0.5, 7 , drivetrain), //goes forward to the block
            new TurnDegrees(-0.5, -90, drivetrain), //turns right(?) negative 90 degrees
            new DriveDistance(0.5, 7 , drivetrain), //goes forward (down)
            new TurnDegrees(0.5, 90, drivetrain), //turns left
            new DriveDistance(0.5, 4.5 ,drivetrain), //goes forward
            new TurnDegrees(0.5, 90, drivetrain), //turns left
            new DriveDistance(0.5, 4.5 ,drivetrain), //goes forward
            new TurnDegrees(-0.5, -90, drivetrain) //turns right(?) negative 90 degrees and gets it in place for the drive arc
            
           
        );
    }
}
