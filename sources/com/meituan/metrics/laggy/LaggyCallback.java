package com.meituan.metrics.laggy;

import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface LaggyCallback {
    void onLaggyEvent(long j, String str, String str2, List<ThreadStackEntity> list);
}
