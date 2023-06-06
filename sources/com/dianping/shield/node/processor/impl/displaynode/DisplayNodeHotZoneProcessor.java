package com.dianping.shield.node.processor.impl.displaynode;

import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/impl/displaynode/DisplayNodeHotZoneProcessor;", "Lcom/dianping/shield/node/processor/impl/displaynode/DisplayNodeProcessor;", "()V", "handleViewItem", "", "viewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "dNode", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DisplayNodeHotZoneProcessor extends DisplayNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.displaynode.DisplayNodeProcessor
    public final boolean handleViewItem(@NotNull ViewItem viewItem, @NotNull ShieldDisplayNode shieldDisplayNode) {
        Object[] objArr = {viewItem, shieldDisplayNode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c10a7c1aa78ba82d867aa3dbdb097f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c10a7c1aa78ba82d867aa3dbdb097f6")).booleanValue();
        }
        h.b(viewItem, "viewItem");
        h.b(shieldDisplayNode, "dNode");
        ShieldRow shieldRow = shieldDisplayNode.rowParent;
        shieldDisplayNode.hotZoneList = shieldRow != null ? shieldRow.getHotZoneArray() : null;
        return false;
    }
}
