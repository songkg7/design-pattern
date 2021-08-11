package com.design.factory;

import com.design.factory.robot.Robot;

public abstract class RobotFactory {

    abstract Robot createRobot(String name);

}
