package com.meituan.android.common.aidata.async.tasks;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HolderTask<K, V> extends DependencyTask<K, V> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DependencyTask<?, ?> holder;
    private final boolean isHolderOnly;

    @Override // com.meituan.android.common.aidata.async.tasks.DependencyTask
    public boolean isOriginalTask() {
        return false;
    }

    public HolderTask(@NonNull DependencyTask<K, V> dependencyTask) {
        this((DependencyTask) dependencyTask, false);
        Object[] objArr = {dependencyTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aec0c1677c32bf81add539d500f6b7bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aec0c1677c32bf81add539d500f6b7bf");
        }
    }

    public HolderTask(@NonNull DependencyTask<K, V> dependencyTask, boolean z) {
        super(dependencyTask.getTaskUniqueId(), z);
        Object[] objArr = {dependencyTask, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "450b7242a400621179a431e6c948a977", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "450b7242a400621179a431e6c948a977");
            return;
        }
        this.isHolderOnly = false;
        if (dependencyTask != 0) {
            this.holder = dependencyTask;
            this.latch = new CountDownLatch(1);
            dependencyTask.addOnTaskFinishListener(new OnTaskFinishListener<K, V>() { // from class: com.meituan.android.common.aidata.async.tasks.HolderTask.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                public void onTaskFinish(Map<K, V> map, V v, long j, List<Exception> list) {
                    Object[] objArr2 = {map, v, new Long(j), list};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0bd77a3749146f00d7f5d80863632af8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0bd77a3749146f00d7f5d80863632af8");
                        return;
                    }
                    HolderTask.this.result = v;
                    HolderTask.this.errorList = list;
                    HolderTask.this.childResult = map;
                    HolderTask.this.latch.countDown();
                }
            });
        }
    }

    public HolderTask(K k, DependencyTask<?, ?> dependencyTask) {
        this(k, dependencyTask, false);
        Object[] objArr = {k, dependencyTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "135072496b4e66f9951ef0ce60e94d8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "135072496b4e66f9951ef0ce60e94d8a");
        }
    }

    public HolderTask(K k, DependencyTask<?, ?> dependencyTask, boolean z) {
        super(k, z);
        Object[] objArr = {k, dependencyTask, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03032d0a18d80c662f9b924d70bf8447", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03032d0a18d80c662f9b924d70bf8447");
            return;
        }
        this.isHolderOnly = true;
        if (dependencyTask != null) {
            this.holder = dependencyTask;
            this.latch = new CountDownLatch(1);
            this.holder.addOnTaskFinishListener(new OnTaskFinishListener() { // from class: com.meituan.android.common.aidata.async.tasks.HolderTask.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                public void onTaskFinish(Map map, Object obj, long j, List list) {
                    Object[] objArr2 = {map, obj, new Long(j), list};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4b10d51dee2766eb821fdf454496c84d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4b10d51dee2766eb821fdf454496c84d");
                    } else {
                        HolderTask.this.latch.countDown();
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.aidata.async.tasks.DependencyTask
    public void addChildResult(K k, V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb3e979bfe5848dd47d56211b1a01d3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb3e979bfe5848dd47d56211b1a01d3e");
        } else if (this.isHolderOnly) {
        } else {
            super.addChildResult(k, v);
        }
    }

    @Override // com.meituan.android.common.aidata.async.tasks.DependencyTask, java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "150af989a4cb80bd7a2a147b7e43b5c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "150af989a4cb80bd7a2a147b7e43b5c2");
            return;
        }
        if (this.holder != null && !this.holder.isStart) {
            this.holder.run();
        }
        super.run();
    }
}
