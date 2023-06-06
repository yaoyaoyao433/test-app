package com.meituan.android.common.aidata.async;

import com.meituan.android.common.aidata.async.tasks.DependencyTask;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface CreateTaskListener<K, V> {
    DependencyTask<K, V> create(K k);

    List<K> getChildUniqueId(K k);

    void onHitCacheTask(DependencyTask<K, V> dependencyTask, K k);
}
