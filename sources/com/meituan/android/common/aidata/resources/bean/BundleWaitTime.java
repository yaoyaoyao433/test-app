package com.meituan.android.common.aidata.resources.bean;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BundleWaitTime {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bundleName;
    public boolean isStart;
    public long time = SystemClock.elapsedRealtime();

    public BundleWaitTime(String str, boolean z) {
        this.bundleName = str;
        this.isStart = z;
    }
}
