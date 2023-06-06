package com.meituan.metrics.fsp;

import android.app.Activity;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface FspDetectCallBack {
    void onDetectFinish(FspBean fspBean, WeakReference<Activity> weakReference);

    void onDetectStart(String str);
}
