package com.dianping.shield.node.processor.legacy.row;

import com.dianping.agentsdk.framework.af;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.feature.BottomPositionInterface;
import com.dianping.shield.feature.SetBottomInterface;
import com.dianping.shield.node.useritem.BottomInfo;
import com.dianping.shield.node.useritem.BottomInfoHelper;
import com.dianping.shield.node.useritem.RowItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/row/SetBottomInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/row/RowInterfaceProcessor;", "()V", "handleRowItem", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "section", "", "row", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class SetBottomInterfaceProcessor extends RowInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.legacy.row.RowInterfaceProcessor
    public final boolean handleRowItem(@NotNull af afVar, @NotNull RowItem rowItem, int i, int i2) {
        Object[] objArr = {afVar, rowItem, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5715233ae5a616c20009fcf23cd3a3e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5715233ae5a616c20009fcf23cd3a3e0")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(rowItem, "rowItem");
        if (afVar instanceof BottomPositionInterface) {
            BottomPositionInterface.BottomPositionInfo bottomPositionInfo = ((BottomPositionInterface) afVar).getBottomPositionInfo(CellType.NORMAL, i, i2);
            if (bottomPositionInfo != null) {
                rowItem.bottomInfo = BottomInfoHelper.Companion.createBottomInfo(bottomPositionInfo);
            }
        } else if ((afVar instanceof SetBottomInterface) && ((SetBottomInterface) afVar).isBottomView(afVar.getViewType(i, i2))) {
            rowItem.bottomInfo = new BottomInfo();
        }
        return false;
    }
}
