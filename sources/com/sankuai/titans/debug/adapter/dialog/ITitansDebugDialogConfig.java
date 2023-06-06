package com.sankuai.titans.debug.adapter.dialog;

import android.app.Activity;
import android.view.View;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ITitansDebugDialogConfig {
    Activity getActivity();

    List<View> getDebugItems();

    View.OnClickListener getHiddenClickListener();

    View.OnClickListener getRefreshClickListener();

    String getScheme();

    String getUA();

    String getUrl();
}
