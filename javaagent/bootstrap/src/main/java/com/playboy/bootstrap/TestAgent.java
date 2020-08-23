package com.playboy.bootstrap;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

/**
 * @author playboy
 * @create 2020-06-19 7:02 下午
 * @description
 * @serviceLogic
 **/
public class TestAgent {

    public static void main(String[] args) throws IOException, AttachNotSupportedException, AgentLoadException, AgentInitializationException {
        System.out.println("running JVM start ");
        VirtualMachine attach = VirtualMachine.attach("48152");
        //attach.loadAgent("/Users/playboy/dev/code/boot/search-all/javaagent/agent/target/agent-1.0-SNAPSHOT.jar");
        attach.detach();

//        List<VirtualMachineDescriptor> list = VirtualMachine.list();
//        for (VirtualMachineDescriptor vmd : list) {
//            //System.out.println(vmd.id());
//            //System.out.println(vmd.displayName());
//            if (vmd.displayName().endsWith("com.playboy.bootstrap.TestAgent")) {
//
//                attach.detach();
//            }
//        }

    }
}
