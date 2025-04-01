package org.tarun.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.tarun.Interfaces.MobileProcessor;

@Component
@Primary
public class Snapdragon implements MobileProcessor {
    @Override
    public void process() {
        System.out.println("World best CPU");
    }
}
