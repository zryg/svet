package com.bgrulers.entity.ruler.projection;

import com.bgrulers.entity.Dynasty;
import com.bgrulers.entity.Title;
import com.bgrulers.entity.ruler.Ruler;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "rulerDetail", types = Ruler.class)
public interface RulerDetailProjection {

    Long getId();
    String getName();
    Title getTitle();
    Date getReignStart();
    Date getReignEnd();

    Dynasty getDynasty();
    String getInformation();
    String getExtraTitle();

}
