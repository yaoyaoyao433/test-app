package com.meituan.android.common.aidata.feature.task;

import com.meituan.android.common.aidata.feature.task.ProduceFeatureTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ProduceFeatureTaskQueue<T extends ProduceFeatureTask> extends LinkedBlockingQueue<T> implements ProduceFeatureTask.onTaskRunCompleted {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.aidata.feature.task.ProduceFeatureTask.onTaskRunCompleted
    public void onCompleted(ProduceFeatureTask produceFeatureTask) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public /* bridge */ /* synthetic */ boolean offer(Object obj) {
        return offer((ProduceFeatureTaskQueue<T>) ((ProduceFeatureTask) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
    public /* bridge */ /* synthetic */ void put(Object obj) throws InterruptedException {
        put((ProduceFeatureTaskQueue<T>) ((ProduceFeatureTask) obj));
    }

    public boolean offer(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1f5ad638ffe84ebc228c8a8247c5096", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1f5ad638ffe84ebc228c8a8247c5096")).booleanValue();
        }
        if (contains(t)) {
            new StringBuilder("task queue offer").append(t.getParam().toString());
            return true;
        }
        new StringBuilder("task queue offer").append(t.getParam().toString());
        return super.offer((ProduceFeatureTaskQueue<T>) t);
    }

    public void put(T t) throws InterruptedException {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c261cc89a3c2f83868a2561feb04475a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c261cc89a3c2f83868a2561feb04475a");
        } else if (contains(t)) {
            new StringBuilder("put queue offer has added:").append(t.getParam().toString());
        } else {
            new StringBuilder("put queue offer suc").append(t.getParam().toString());
            super.put((ProduceFeatureTaskQueue<T>) t);
        }
    }
}
