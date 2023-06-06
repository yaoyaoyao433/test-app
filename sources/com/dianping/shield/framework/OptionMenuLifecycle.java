package com.dianping.shield.framework;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface OptionMenuLifecycle {
    void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater);

    boolean onOptionsItemSelected(MenuItem menuItem);
}
