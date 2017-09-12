package com.teamtreehouse.testingbase;

/**
 * Created by jaeyoung on 12/09/2017.
 */

public interface MainActivityView {
    void changeTextViewText(String text);
    void changeBackgroundColor(int color);
    void launchOtherActivity(Class activity);
}
