package org.usfirst.frc3925.Maurice.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3925.Maurice.Robot;

public class DefaultDrive extends Command {

    public DefaultDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drive);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    protected void initialize() {
    }

    protected void execute() {
        double fwd = Robot.oi.drivercontroller.getRawAxis(2);
        double turn = Robot.oi.drivercontroller.getRawAxis(4);
        turn = (turn > 0) ? turn*turn : -turn*turn;
        
        Robot.drive.arcade(fwd, turn);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
