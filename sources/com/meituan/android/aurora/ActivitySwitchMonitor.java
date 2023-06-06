package com.meituan.android.aurora;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ActivitySwitchMonitor extends ActivitySwitchCallbacks {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Activity sTopActivity;

    public Activity getTopActivity() {
        return sTopActivity;
    }
}
