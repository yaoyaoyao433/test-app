package com.meituan.android.common.horn.extra.monitor;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IHornMonitorService {
    void catchException(@Nullable String str, int i, @Nullable Throwable th);

    void onConfigChange(@NonNull Map<String, Object> map);

    boolean shouldMonitorChange(@NonNull String str);
}
