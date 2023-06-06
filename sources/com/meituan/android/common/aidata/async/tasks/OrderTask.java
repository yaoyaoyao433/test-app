package com.meituan.android.common.aidata.async.tasks;

import com.meituan.android.common.aidata.async.AsyncHashSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OrderTask<K, V> extends DependencyTask<K, V> {
    public static final int EXECUTE_NEXT_IGNORE_ERROR = 1;
    public static final int NOTIFY_NEXT_FINISH_WHEN_ERROR = 3;
    public static final int NOT_EXECUTE_NEXT_WHEN_ERROR = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Set<OrderTask<K, V>> childOrderTaskSet;
    private final int orderType;
    private final Set<OrderTask<K, V>> parentOrderTaskSet;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface OrderType {
    }

    public OrderTask(K k) {
        this(k, 2);
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b4bd4eb5bc67da02276ccd4a302f16b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b4bd4eb5bc67da02276ccd4a302f16b");
        }
    }

    public OrderTask(K k, int i) {
        super(k);
        Object[] objArr = {k, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e925fea88747f464afd8fe34a50d896d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e925fea88747f464afd8fe34a50d896d");
            return;
        }
        this.parentOrderTaskSet = new AsyncHashSet();
        this.childOrderTaskSet = new AsyncHashSet();
        this.orderType = i;
    }

    @Override // com.meituan.android.common.aidata.async.tasks.DependencyTask
    public DependencyTask<K, V> dependencyOn(DependencyTask<K, V> dependencyTask) {
        Object[] objArr = {dependencyTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "114220c9659ccadf58a68231e824df31", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "114220c9659ccadf58a68231e824df31");
        }
        if (dependencyTask instanceof OrderTask) {
            OrderTask<K, V> orderTask = (OrderTask) dependencyTask;
            orderTask.parentOrderTaskSet.add(this);
            this.childOrderTaskSet.add(orderTask);
            return this;
        }
        return super.dependencyOn(dependencyTask);
    }

    @Override // com.meituan.android.common.aidata.async.tasks.DependencyTask
    public DependencyTask<K, V> dependencyOn(Collection<DependencyTask<K, V>> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c986dca719376f56cdd37a90a2efe56", RobustBitConfig.DEFAULT_VALUE)) {
            return (DependencyTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c986dca719376f56cdd37a90a2efe56");
        }
        if (collection == null || collection.size() <= 0) {
            return this;
        }
        ArrayList arrayList = null;
        for (DependencyTask<K, V> dependencyTask : collection) {
            if (dependencyTask instanceof OrderTask) {
                OrderTask<K, V> orderTask = (OrderTask) dependencyTask;
                orderTask.parentOrderTaskSet.add(this);
                this.childOrderTaskSet.add(orderTask);
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(dependencyTask);
            }
        }
        return super.dependencyOn(arrayList);
    }

    @Override // com.meituan.android.common.aidata.async.tasks.DependencyTask, com.meituan.android.common.aidata.async.tasks.TaskAsyncNotifier
    public void notify(V v, Exception exc) {
        Object[] objArr = {v, exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92bf8e4308db19c4d00686b412f3c28c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92bf8e4308db19c4d00686b412f3c28c");
            return;
        }
        super.notify(v, exc);
        if (this.parentOrderTaskSet.isEmpty()) {
            return;
        }
        boolean z = this.errorList.size() <= 0;
        for (OrderTask<K, V> orderTask : this.parentOrderTaskSet) {
            if (orderTask != null) {
                handleOrderParent(orderTask);
                if (z || this.orderType == 1) {
                    orderTask.run();
                } else if (this.orderType == 3) {
                    orderTask.isStart = true;
                    orderTask.isFinish = true;
                    orderTask.notify(null, null);
                }
            }
        }
    }

    private void handleOrderParent(DependencyTask<K, V> dependencyTask) {
        Object[] objArr = {dependencyTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4bc965e016cd3a4e0f030c36345d46b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4bc965e016cd3a4e0f030c36345d46b");
        } else if (dependencyTask == null || dependencyTask.isFinish) {
        } else {
            dependencyTask.errorList.addAll(this.errorList);
            dependencyTask.addChildResult(getTaskUniqueId(), this.result);
        }
    }

    public Set<OrderTask<K, V>> getOrderParentSet() {
        return this.parentOrderTaskSet;
    }

    public Set<OrderTask<K, V>> getOrderChildSet() {
        return this.childOrderTaskSet;
    }
}
