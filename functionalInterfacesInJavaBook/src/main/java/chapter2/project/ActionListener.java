package chapter2.project;

import java.awt.event.ActionEvent;
import java.util.EventListener;

public interface ActionListener extends EventListener {
    void actionPerformed(ActionEvent event);
}
