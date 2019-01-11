package com.udacity.gradle.builditbigger;

import android.support.annotation.Nullable;
import android.support.annotation.UiThread;

public interface InterfEndpointsAsyncTask {

    @UiThread
    void onRetrieveJokeStart();

    @UiThread
    void onRetrieveJokeFinish(@Nullable String result);
}
