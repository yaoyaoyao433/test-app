package com.meituan.android.common.aidata.async.tasks;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EmptyTask<K, V> extends DependencyTask<K, V> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Set<K> childTaskUniqueIdSet;

    public EmptyTask(K k, Set<K> set) {
        this(k, false, set);
        Object[] objArr = {k, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8dfca4877062e022a8b72da5675337c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8dfca4877062e022a8b72da5675337c");
        }
    }

    public EmptyTask(K k, boolean z, Set<K> set) {
        super(k, z);
        Object[] objArr = {k, Byte.valueOf(z ? (byte) 1 : (byte) 0), set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "179ed682cac0e4466d37a49d2497bc66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "179ed682cac0e4466d37a49d2497bc66");
            return;
        }
        if (set != null) {
            this.latch = new CountDownLatch(set.size());
        }
        this.childTaskUniqueIdSet = set;
    }

    public void countDownDirect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "419c5af56b5233afc941e8bd49d07880", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "419c5af56b5233afc941e8bd49d07880");
        } else if (this.latch != null) {
            this.latch.countDown();
        }
    }

    public void alwaysWait() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de8448b8492a8be698db24e1d477ae6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de8448b8492a8be698db24e1d477ae6c");
            return;
        }
        setBasicWaitTime(-1);
        setChildAttachWaitTime(-1);
    }

    public boolean isWaitingTask(K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4301959380ce8b4032b267f767540f9e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4301959380ce8b4032b267f767540f9e")).booleanValue() : this.childTaskUniqueIdSet != null && this.childTaskUniqueIdSet.contains(k);
    }

    public void countDown(K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cf8db320ddd3bc72e06f1c90b099c23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cf8db320ddd3bc72e06f1c90b099c23");
        } else if (this.childTaskUniqueIdSet == null || !this.childTaskUniqueIdSet.contains(k) || this.latch == null) {
        } else {
            this.latch.countDown();
        }
    }
}
