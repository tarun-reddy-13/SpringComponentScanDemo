package org.tarun.components;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.tarun.Interfaces.MobileProcessor;

@Component
public class MediaTek implements MobileProcessor {

    @Override
    public void process() {
        System.out.println("2nd Best CPU");
    }
}
