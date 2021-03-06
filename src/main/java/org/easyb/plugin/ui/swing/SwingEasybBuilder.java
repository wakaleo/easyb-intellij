package org.easyb.plugin.ui.swing;

import org.easyb.plugin.ui.EasybPresenter;

public class SwingEasybBuilder {
    private SwingEasybView view;
    private EasybPresenter presenter;

    public SwingEasybBuilder() {
        view = new SwingEasybView();
        presenter = new EasybPresenter<SwingResultNode>(view, new SwingNodeBuilder());
        view.registerEventListener(presenter);
    }

    public SwingEasybView getView() {
        return view;
    }

    public EasybPresenter getPresenter() {
        return presenter;
    }
}
