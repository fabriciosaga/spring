package com.apress.springrecipes.court.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.apress.springrecipes.court.config.InterceptorConfiguration;
import com.apress.springrecipes.court.service.config.ServiceConfiguration;
import com.apress.springrecipes.court.web.config.WebConfiguration;

/**
 * Created by marten on 28-04-14.
 */
public class CourtApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ServiceConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfiguration.class, InterceptorConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/", "/welcome"};
    }
}
