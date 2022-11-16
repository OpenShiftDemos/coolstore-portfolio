package com.redhat.coolstore;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) throws ServletException {

        final AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

        context.setConfigLocation("com.redhat.coolstore.config");
        context.scan("com.redhat.coolstore");

        container.addListener(new ContextLoaderListener(context));

        final ServletRegistration.Dynamic dispatcher =
                container.addServlet("dispatcher", new DispatcherServlet(context));

        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }

}
