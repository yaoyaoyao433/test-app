package com.sankuai.titans.offline.debug.adapter;

import android.app.Activity;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IOfflineDebug {
    void addGlobalItem(OfflineGlobalDebugItem offlineGlobalDebugItem);

    void addPageItem(OfflineDebugItem offlineDebugItem);

    void addPresetItem(OfflineGlobalDebugItem offlineGlobalDebugItem);

    void clearGlobal();

    void clearPage();

    void clearPreset();

    View getDebugView(Activity activity, boolean z);
}
