package com.meituan.android.common.weaver.interfaces.ffp;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface FFPReportListener {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface IReportEvent {
        @NonNull
        String activityClass();

        long endTimeInMs();

        @Nullable
        Map<String, Object> extraMap();

        long ffpInMs();

        @NonNull
        String finishResult();

        @NonNull
        String pageType();

        @Nullable
        String pageUrl();

        long startTimeInMs();
    }

    void onFFPReport(@NonNull IReportEvent iReportEvent);
}
