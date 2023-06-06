package com.meituan.android.common.aidata.async.tasks;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ErrorTask<K, V> extends DependencyTask<K, V> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ErrorTask(K k, Exception exc) {
        super(k, true);
        Object[] objArr = {k, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c5b7f852cd5b29dd4cfac0c074c1082", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c5b7f852cd5b29dd4cfac0c074c1082");
        } else {
            addError(exc);
        }
    }

    @Override // com.meituan.android.common.aidata.async.tasks.DependencyTask
    public DependencyTask<K, V> addOnTaskFinishListener(OnTaskFinishListener<K, V> onTaskFinishListener) {
        Object[] objArr = {onTaskFinishListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "950618c5894b93a825b0c722cda80ee1", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "950618c5894b93a825b0c722cda80ee1");
        }
        if (onTaskFinishListener == null) {
            return this;
        }
        onTaskFinishListener.onTaskFinish(this.childResult, this.result, SystemClock.elapsedRealtime(), this.errorList);
        return this;
    }

    @Override // com.meituan.android.common.aidata.async.tasks.DependencyTask, java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bda236b88b1e6153e5b532f89883a5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bda236b88b1e6153e5b532f89883a5d");
            return;
        }
        handleParent(this.result);
        notifyFinish();
    }
}
