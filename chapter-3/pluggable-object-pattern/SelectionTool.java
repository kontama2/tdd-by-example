Figuer selected;
SelectionMode mode;
public void mouseDown() {
    selected = findFigure();
    if (selected != null) {
        mode = new SingleSelection(selected);
    } else {
        mode = new MultipleSelection();
    }
}

public void mouseMove() {
    mode.mouseMove();
}

public void mouseUp () {
    mode.mouseUp();
}