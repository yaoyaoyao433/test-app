package com.sankuai.meituan.mtliveqos.common;

import android.content.Context;
import android.support.annotation.NonNull;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface a {
    String accessCache(String str);

    void log(@NonNull Map<String, String> map, String[] strArr);

    void register(String str, d dVar);

    void sendToBabel(@NonNull boolean z, @NonNull Map<String, Float> map, @NonNull Map<String, String> map2) throws Exception;

    void sendToLiveMonitoringBackground(@NonNull Context context, int i, @NonNull boolean z, @NonNull Map<String, Float> map, @NonNull Map<String, String> map2) throws Exception;
}
