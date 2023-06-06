package com.dianping.shield.component.extensions.normal;

import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.extensions.common.CommonContainerNodeData;
import com.dianping.shield.component.extensions.common.CommonContainerRow;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.processor.impl.row.RowNodeProcessor;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/component/extensions/normal/NormalRowNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/row/RowNodeProcessor;", "()V", "handleRowItem", "", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NormalRowNodeProcessor extends RowNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.row.RowNodeProcessor
    public final boolean handleRowItem(@NotNull RowItem rowItem, @NotNull ShieldRow shieldRow) {
        Object[] objArr = {rowItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdd261ac7039fa96cc5bc44afb746f8b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdd261ac7039fa96cc5bc44afb746f8b")).booleanValue();
        }
        h.b(rowItem, "rowItem");
        h.b(shieldRow, "shieldRow");
        if ((rowItem instanceof NormalRowItem) && (shieldRow instanceof NormalShieldRow)) {
            NormalShieldRow normalShieldRow = (NormalShieldRow) shieldRow;
            NormalRowItem normalRowItem = (NormalRowItem) rowItem;
            normalShieldRow.showArrow = normalRowItem.showArrow;
            normalShieldRow.clipChildren = normalRowItem.clipChildren;
            normalShieldRow.arrowTintColor = normalRowItem.arrowTintColor;
            normalShieldRow.arrowPositionType = normalRowItem.arrowPositionType;
            normalShieldRow.imageArrowResId = normalRowItem.imageArrowResId;
            normalShieldRow.arrowOffset = aq.a(getContext(), normalRowItem.arrowOffset);
            normalShieldRow.actionInfoList = normalRowItem.actionInfoList;
            normalShieldRow.marginBottom = aq.a(getContext(), normalRowItem.marginBottom);
            normalShieldRow.marginLeft = aq.a(getContext(), normalRowItem.marginLeft);
            normalShieldRow.marginRight = aq.a(getContext(), normalRowItem.marginRight);
            normalShieldRow.marginTop = aq.a(getContext(), normalRowItem.marginTop);
            normalShieldRow.onActionViewShowListener = normalRowItem.onActionViewShowListener;
            if (rowItem.isLazyLoad) {
                ArrayList<ViewItem> arrayList = new ArrayList<>();
                int i = rowItem.viewCount;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(rowItem.lazyLoadViewItemProvider.getViewItem(i2));
                }
                normalShieldRow.setViewItems(arrayList);
            } else {
                normalShieldRow.setViewItems(rowItem.viewItems);
            }
            normalShieldRow.rowPaintingCallback = new DefaultNormalRowViewPaintingCallback(normalShieldRow);
            normalShieldRow.setDNodeData(new CommonContainerNodeData((CommonContainerRow) shieldRow));
        }
        return false;
    }
}
