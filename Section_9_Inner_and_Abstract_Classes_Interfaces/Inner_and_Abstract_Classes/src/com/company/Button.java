package com.company;

public class Button {
    private String title;
    private OnClickListener onClickLister;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickLister = onClickListener;
    }

    public void onClick() {
        // i.e. Button.onClick calls OnClickListener.onClick(passes title as param)
        // the OnClickListener is an interface for a class that will be created elsewhere(i.e. in main)
        // once the class that implements OnClickListener is created it will be required to have an onClick method
        // that onClick method will be passed this.title from the Button class for use in that class's version
        // of its own onClick method.
        this.onClickLister.onClick(this.title);
    }

    public interface OnClickListener {
        public void onClick(String title);
    }

}
