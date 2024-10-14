package Lesson_11.Ex002Phonebook.UI;

import Lesson_11.Ex002Phonebook.Core.MVP.View;

public class NewConsoleView extends ConsoleView implements View {
    
    public NewConsoleView() {
        super();
    }

    @Override
    public void setDescription(String value) {
        super.setDescription(value);
        System.out.println();
    }

}
