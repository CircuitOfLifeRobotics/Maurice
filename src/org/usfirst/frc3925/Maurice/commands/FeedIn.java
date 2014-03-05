package org.usfirst.frc3925.Maurice.commands;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3925.Maurice.Robot;

public class FeedIn extends Command {

    public FeedIn() {

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.feeder);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    protected void initialize() {
    }

    protected void execute() {
        Robot.feeder.set(Relay.Value.kForward);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        Robot.feeder.set(Relay.Value.kOff);
    }

    protected void interrupted() {
    }
}
