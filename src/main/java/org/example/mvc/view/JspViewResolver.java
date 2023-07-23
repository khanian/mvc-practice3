package org.example.mvc.view;

import org.example.mvc.DispatcherServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.example.mvc.view.RedirectView.DEFAULT_REDIRECT_PREFIX;

public class JspViewResolver implements ViewResolver {
    private static final Logger log = LoggerFactory.getLogger(JspViewResolver.class);
    @Override
    public View resolveView(String viewName) {
        log.info("JspViewResolver start. viewName = [{}]", viewName);
        if (viewName.startsWith(DEFAULT_REDIRECT_PREFIX)) {
            return new RedirectView(viewName);
        }
        return new JspView(viewName + ".jsp");
    }
}
