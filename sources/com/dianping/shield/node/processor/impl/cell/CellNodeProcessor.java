package com.dianping.shield.node.processor.impl.cell;

import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.processor.ShieldProcessor;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0002\u0010\bJ0\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011H$¨\u0006\u0012"}, d2 = {"Lcom/dianping/shield/node/processor/impl/cell/CellNodeProcessor;", "Lcom/dianping/shield/node/processor/ShieldProcessor;", "()V", "handleData", "", "obj", "", "", "([Ljava/lang/Object;)Z", "handleShieldViewCell", "cellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "shieldViewCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "addList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "Lkotlin/collections/ArrayList;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class CellNodeProcessor extends ShieldProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract boolean handleShieldViewCell(@NotNull ShieldSectionCellItem shieldSectionCellItem, @NotNull ShieldViewCell shieldViewCell, @NotNull ArrayList<ShieldSection> arrayList);

    @Override // com.dianping.shield.node.processor.Processor
    public boolean handleData(@NotNull Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55be1707de6f0c36b58d7c1e9e50d42a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55be1707de6f0c36b58d7c1e9e50d42a")).booleanValue();
        }
        h.b(objArr, "obj");
        if (objArr.length == 3 && (objArr[0] instanceof ShieldSectionCellItem) && (objArr[1] instanceof ShieldViewCell) && (objArr[2] instanceof ArrayList)) {
            Object obj = objArr[0];
            if (obj != null) {
                ShieldSectionCellItem shieldSectionCellItem = (ShieldSectionCellItem) obj;
                Object obj2 = objArr[1];
                if (obj2 != null) {
                    ShieldViewCell shieldViewCell = (ShieldViewCell) obj2;
                    Object obj3 = objArr[2];
                    if (obj3 != null) {
                        return handleShieldViewCell(shieldSectionCellItem, shieldViewCell, (ArrayList) obj3);
                    }
                    throw new o("null cannot be cast to non-null type kotlin.collections.ArrayList<com.dianping.shield.node.cellnode.ShieldSection> /* = java.util.ArrayList<com.dianping.shield.node.cellnode.ShieldSection> */");
                }
                throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.ShieldViewCell");
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.node.useritem.ShieldSectionCellItem");
        }
        return false;
    }
}
