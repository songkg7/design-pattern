package com.design.factory;

import com.design.factory.robot.PowerRobot;
import com.design.factory.robot.Robot;
import com.design.factory.robot.SuperRobot;

public class SuperRobotFactory extends RobotFactory {

    @Override
    Robot createRobot(String name) {
        switch (name) {
            case "super":
                return new SuperRobot();
            case "power":
                return new PowerRobot();
        }
        return null;
    }

}
