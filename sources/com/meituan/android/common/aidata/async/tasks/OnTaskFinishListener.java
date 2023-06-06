package com.meituan.android.common.aidata.async.tasks;

import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface OnTaskFinishListener<K, V> {
    void onTaskFinish(Map<K, V> map, V v, long j, List<Exception> list);
}
