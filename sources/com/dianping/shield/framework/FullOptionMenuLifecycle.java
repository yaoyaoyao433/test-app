package com.dianping.shield.framework;

import android.view.Menu;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface FullOptionMenuLifecycle extends OptionMenuLifecycle {
    void onDestroyOptionsMenu();

    void onOptionsMenuClosed(Menu menu);

    void onPrepareOptionsMenu(Menu menu);
}
