package com.dianping.shield.dynamic.diff;

import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\u0011J\r\u0010\u0012\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0013JA\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u00002\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010\u001dJM\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0002\u0010\u001fJ\n\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016J\b\u0010#\u001a\u00020\u0010H&J\u0015\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nR\u001e\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0012\u0010\f\u001a\u0004\u0018\u00018\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006&"}, d2 = {"Lcom/dianping/shield/dynamic/diff/DynamicBaseDiff;", "T", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "V", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "()V", "computingInfo", "getComputingInfo", "()Lcom/dianping/shield/dynamic/model/DiffableInfo;", "setComputingInfo", "(Lcom/dianping/shield/dynamic/model/DiffableInfo;)V", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "computingItem", "Ljava/lang/Object;", "currentInfo", "bindItems", "", "(Ljava/lang/Object;)V", "createComputingItem", "()Ljava/lang/Object;", "diff", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/DiffableInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "diffChildren", "(Lcom/dianping/shield/dynamic/model/DiffableInfo;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "", "onComputingComplete", "resetProps", "updateProps", "info", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class DynamicBaseDiff<T extends DiffableInfo, V> implements DynamicDiff<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private T computingInfo;
    private V computingItem;
    private T currentInfo;

    public abstract void bindItems(@Nullable V v);

    public abstract V createComputingItem();

    public abstract void diffChildren(@NotNull T t, V v, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2);

    public abstract void resetProps();

    public abstract void updateProps(@NotNull T t);

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    @Nullable
    public String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe7e14f1df9e5c3858374cefe41ca0af", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe7e14f1df9e5c3858374cefe41ca0af");
        }
        T t = this.currentInfo;
        if (t != null) {
            return t.getIdentifier();
        }
        return null;
    }

    @Nullable
    public final T getComputingInfo() {
        return this.computingInfo;
    }

    public final void setComputingInfo(@Nullable T t) {
        this.computingInfo = t;
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public void diff(@NotNull T t, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {t, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8973e0cf93fcf6824a0cf0d04b18fae8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8973e0cf93fcf6824a0cf0d04b18fae8");
            return;
        }
        h.b(t, "newInfo");
        h.b(arrayList, "diffResult");
        this.computingInfo = t;
        this.computingItem = createComputingItem();
        V v = this.computingItem;
        if (v == null) {
            h.a();
        }
        diffChildren(t, v, arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public void onComputingComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa41c8c1d1d828ea4f87d9b669af4246", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa41c8c1d1d828ea4f87d9b669af4246");
            return;
        }
        resetProps();
        bindItems(this.computingItem);
        this.computingItem = null;
        if (this.computingInfo != null) {
            this.currentInfo = this.computingInfo;
            T t = this.currentInfo;
            if (t != null) {
                updateProps(t);
            }
            this.computingInfo = null;
        }
    }

    public static /* synthetic */ void diffChildren$default(DynamicBaseDiff dynamicBaseDiff, DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: diffChildren");
        }
        if ((i & 8) != 0) {
            num = 0;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = 0;
        }
        dynamicBaseDiff.diffChildren(diffableInfo, obj, arrayList, num3, num2);
    }
}
