package com.dianping.shield.component.extensions.gridsection;

import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.extensions.common.CommonContainerNodeData;
import com.dianping.shield.component.extensions.common.CommonContainerRow;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.processor.impl.row.RowNodeProcessor;
import com.dianping.shield.node.useritem.RowItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/component/extensions/gridsection/GridSectionRowNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/row/RowNodeProcessor;", "()V", "handleRowItem", "", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class GridSectionRowNodeProcessor extends RowNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.row.RowNodeProcessor
    public final boolean handleRowItem(@NotNull RowItem rowItem, @NotNull ShieldRow shieldRow) {
        Object[] objArr = {rowItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5509a186e4992c0550fe711ee6d66fa0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5509a186e4992c0550fe711ee6d66fa0")).booleanValue();
        }
        h.b(rowItem, "rowItem");
        h.b(shieldRow, "shieldRow");
        if ((rowItem instanceof GridSectionRowItem) && (shieldRow instanceof GridSectionShieldRow)) {
            GridSectionShieldRow gridSectionShieldRow = (GridSectionShieldRow) shieldRow;
            GridSectionRowItem gridSectionRowItem = (GridSectionRowItem) rowItem;
            gridSectionShieldRow.setColCount(gridSectionRowItem.colCount);
            gridSectionShieldRow.setXGap(aq.a(getContext(), gridSectionRowItem.xGap));
            gridSectionShieldRow.leftMargin = aq.a(getContext(), gridSectionRowItem.leftMargin);
            gridSectionShieldRow.rightMargin = aq.a(getContext(), gridSectionRowItem.rightMargin);
            gridSectionShieldRow.setTopMargin(aq.a(getContext(), gridSectionRowItem.topMargin));
            gridSectionShieldRow.setBottomMargin(aq.a(getContext(), gridSectionRowItem.bottomMargin));
            gridSectionShieldRow.setViewItems(rowItem.viewItems);
            gridSectionShieldRow.setDNodeData(new CommonContainerNodeData((CommonContainerRow) shieldRow));
            CommonContainerNodeData dNodeData = gridSectionShieldRow.getDNodeData();
            if (dNodeData != null) {
                dNodeData.setBackgroundColor(gridSectionRowItem.getBackgroundColor());
            }
            if (gridSectionShieldRow.rowPaintingCallback == null) {
                gridSectionShieldRow.rowPaintingCallback = new DefaultGirdSectionRowViewPaintingCallback();
            }
        }
        return false;
    }
}
