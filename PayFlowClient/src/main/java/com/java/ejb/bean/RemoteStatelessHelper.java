package com.java.ejb.bean;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class RemoteStatelessHelper {

    private static Context createInitialContext() throws NamingException {
        Properties jndiProperties = new Properties();
        jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,
                "org.jboss.naming.remote.client.InitialContextFactory");
        jndiProperties.put(Context.URL_PKG_PREFIXES,
                "org.jboss.ejb.client.naming");
        jndiProperties.put(Context.PROVIDER_URL,
                "http-remoting://localhost:8080");
        jndiProperties.put("jboss.naming.client.ejb.context", true);
        return new InitialContext(jndiProperties);
    }

    public static UserBeanRemote lookupRemoteStatelessUser() throws NamingException {
        Context ctx = createInitialContext();

        final String appName = ""; // EAR name (empty if not using EAR)
        final String moduleName = "PayFlowApplication"; // your EJB JAR module name
        final String distinctName = "";
        final String beanName = "UserBeanDao"; // the bean class name
        final String viewClassName = UserBeanRemote.class.getName(); // remote interface

        return (UserBeanRemote) ctx.lookup(
            "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + viewClassName
        );
    }
//    public static UserStatelessBeanRemote lookupRemoteStatelessGroup() throws NamingException {
//        Context ctx = createInitialContext();
//
//        final String appName = ""; // EAR name (empty if not using EAR)
//        final String moduleName = "PayFlowApplication"; // your EJB JAR module name
//        final String distinctName = "";
//        final String beanName = "GroupBean"; // the bean class name
//        final String viewClassName = UserStatelessBeanRemote.class.getName(); // remote interface
//
//        return (UserStatelessBeanRemote) ctx.lookup(
//            "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + viewClassName
//        );
//    }
}
