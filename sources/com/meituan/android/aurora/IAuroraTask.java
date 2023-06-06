package com.meituan.android.aurora;

import android.app.Application;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IAuroraTask {
    List<String> beforeTaskNames();

    void execute(Application application);

    boolean isAnchors();

    boolean isAsyncTask();
}
