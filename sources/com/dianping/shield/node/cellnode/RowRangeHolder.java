package com.dianping.shield.node.cellnode;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/cellnode/RowRangeHolder;", "Lcom/dianping/shield/node/cellnode/RangeHolder;", "dNodeCount", "", "(I)V", "getOldRange", "getRange", "registerObserver", "", "observer", "Lcom/dianping/shield/node/cellnode/RangeChangeObserver;", "unregisterObserver", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class RowRangeHolder implements RangeHolder {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    public int dNodeCount;

    public RowRangeHolder() {
        this(0, 1, null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b62dd8545ac9ceb23945c48a4c4058bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b62dd8545ac9ceb23945c48a4c4058bb");
        }
    }

    @Override // com.dianping.shield.node.cellnode.RangeHolder
    public final int getOldRange() {
        return -1;
    }

    @Override // com.dianping.shield.node.cellnode.RangeHolder
    public final void registerObserver(@NotNull RangeChangeObserver rangeChangeObserver) {
        Object[] objArr = {rangeChangeObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a1119824831fb7616d6f52fcb43f7e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a1119824831fb7616d6f52fcb43f7e5");
        } else {
            h.b(rangeChangeObserver, "observer");
        }
    }

    @Override // com.dianping.shield.node.cellnode.RangeHolder
    public final void unregisterObserver(@NotNull RangeChangeObserver rangeChangeObserver) {
        Object[] objArr = {rangeChangeObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78c7ed0011a02b57c7cf01dab34f9a17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78c7ed0011a02b57c7cf01dab34f9a17");
        } else {
            h.b(rangeChangeObserver, "observer");
        }
    }

    public RowRangeHolder(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b3c37cb9592e137f78dac25701b3943", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b3c37cb9592e137f78dac25701b3943");
        } else {
            this.dNodeCount = i;
        }
    }

    public /* synthetic */ RowRangeHolder(int i, int i2, f fVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    @Override // com.dianping.shield.node.cellnode.RangeHolder
    public final int getRange() {
        return this.dNodeCount;
    }
}
