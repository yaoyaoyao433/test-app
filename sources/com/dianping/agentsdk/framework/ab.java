package com.dianping.agentsdk.framework;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ab<T extends ViewGroup> {
    T getAgentContainerView();

    void onActivityCreated(Bundle bundle);

    void onActivityResult(int i, int i2, Intent intent);

    void onCreate(Bundle bundle);

    View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    void onDestroy();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStop();
}
