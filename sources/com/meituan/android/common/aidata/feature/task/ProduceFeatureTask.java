package com.meituan.android.common.aidata.feature.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class ProduceFeatureTask implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Object mParam;
    private AtomicBoolean mRunning;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface onTaskRunCompleted {
        void onCompleted(ProduceFeatureTask produceFeatureTask);
    }

    public abstract void runOnce();

    public ProduceFeatureTask(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b29e4a855379ff9616747e60e130bbef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b29e4a855379ff9616747e60e130bbef");
            return;
        }
        this.mRunning = new AtomicBoolean(false);
        this.mParam = null;
        this.mParam = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4b15b3c6745fe5f6b1a1125cbf08e21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4b15b3c6745fe5f6b1a1125cbf08e21");
            return;
        }
        this.mRunning.compareAndSet(false, true);
        try {
            runOnce();
        } catch (Throwable unused) {
        }
        this.mRunning.compareAndSet(true, false);
    }

    public boolean isRunning() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f824ae8cc23dc6cfab081b0f13d3dba", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f824ae8cc23dc6cfab081b0f13d3dba")).booleanValue() : this.mRunning.get();
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8869dea366862d13a5ad7721bfd8e782", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8869dea366862d13a5ad7721bfd8e782")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof ProduceFeatureTask) && this.mParam.equals(((ProduceFeatureTask) obj).getParam());
    }

    public Object getParam() {
        return this.mParam;
    }
}
