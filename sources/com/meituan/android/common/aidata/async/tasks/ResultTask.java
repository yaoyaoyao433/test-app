package com.meituan.android.common.aidata.async.tasks;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ResultTask<K, V> extends DependencyTask<K, V> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ResultTask(K k, V v) {
        super(k, true);
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "028909aab621eedc5de91cfabebcf5ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "028909aab621eedc5de91cfabebcf5ac");
        } else {
            this.result = v;
        }
    }

    @Override // com.meituan.android.common.aidata.async.tasks.DependencyTask
    public DependencyTask<K, V> addOnTaskFinishListener(OnTaskFinishListener<K, V> onTaskFinishListener) {
        Object[] objArr = {onTaskFinishListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48a4ab66d1c11af5b9de4aa87b3db2bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48a4ab66d1c11af5b9de4aa87b3db2bc");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d31458fdf4eebca92c6b11b262fcf459", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d31458fdf4eebca92c6b11b262fcf459");
            return;
        }
        StringBuilder sb = new StringBuilder("Empty task run ");
        sb.append(getTaskUniqueId());
        sb.append(" , parent is ");
        sb.append(getParents());
        handleParent(this.result);
        notifyFinish();
    }
}
