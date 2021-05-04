package com.talevski.viktor.parent;

import com.talevski.viktor.child.one.config.ChildOneConfig;
import com.talevski.viktor.child.two.config.ChildTwoConfig;
import com.talevski.viktor.parent.config.ParentConfig;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class MultipleApplicationContextsApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder().parent(ParentConfig.class).web(WebApplicationType.NONE)
                .child(ChildOneConfig.class).web(WebApplicationType.SERVLET)
                .sibling(ChildTwoConfig.class).web(WebApplicationType.SERVLET)
                .run(args);
    }
}
