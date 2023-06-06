package com.meituan.android.aurora;

import android.app.Application;
import android.support.annotation.Keep;
/* compiled from: ProGuard */
@Keep
@Deprecated
/* loaded from: classes2.dex */
public interface IInit {
    void asyncInit(Application application);

    void init(Application application);

    String tag();
}
