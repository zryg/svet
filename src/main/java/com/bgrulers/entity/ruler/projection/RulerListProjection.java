package com.bgrulers.entity.ruler.projection;

import com.bgrulers.entity.ruler.Ruler;
import com.bgrulers.entity.Title;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "rulerList", types = Ruler.class)
public interface RulerListProjection {

    Long getId();
    String getName();
    String getInformation();
    Title getTitle();
    Date getReignStart();
    Date getReignEnd();

}
