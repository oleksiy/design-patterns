package com.designpatterns.app.behavioral.template;

import com.designpatterns.app.structural.template.F16PreFlightCheckList;
import org.junit.jupiter.api.Test;

public class TemplatePatternTest {
    @Test
    public void testStructurePattern() {
        F16PreFlightCheckList checkList = new F16PreFlightCheckList();
        checkList.runChecklist();
    }
}
