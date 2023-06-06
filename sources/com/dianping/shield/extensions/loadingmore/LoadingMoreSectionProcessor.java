package com.dianping.shield.extensions.loadingmore;

import com.dianping.shield.entity.CellType;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.processor.impl.section.SectionNodeProcessor;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/extensions/loadingmore/LoadingMoreSectionProcessor;", "Lcom/dianping/shield/node/processor/impl/section/SectionNodeProcessor;", "()V", "handleShieldSection", "", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LoadingMoreSectionProcessor extends SectionNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.section.SectionNodeProcessor
    public final boolean handleShieldSection(@NotNull SectionItem sectionItem, @NotNull ShieldSection shieldSection) {
        LoadingMoreSectionItem loadingMoreSectionItem;
        ViewItem viewItem;
        Object[] objArr = {sectionItem, shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62d799f8a03ac14fffa3429de29b9a77", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62d799f8a03ac14fffa3429de29b9a77")).booleanValue();
        }
        h.b(sectionItem, "sectionItem");
        h.b(shieldSection, "shieldSection");
        if ((sectionItem instanceof LoadingMoreSectionItem) && (viewItem = (loadingMoreSectionItem = (LoadingMoreSectionItem) sectionItem).getViewItem()) != null) {
            RowItem rowItem = new RowItem();
            rowItem.showCellTopDivider = false;
            rowItem.showCellBottomDivider = false;
            rowItem.addViewItem(viewItem);
            sectionItem.addRowItem(rowItem);
            ShieldRow createRowNodeInstance = ExtensionsRegistry.INSTANCE.createRowNodeInstance(rowItem);
            createRowNodeInstance.sectionParent = shieldSection;
            createRowNodeInstance.cellType = CellType.LOADING_MORE;
            createRowNodeInstance.typePrefix = loadingMoreSectionItem.getTypePrefix();
            createRowNodeInstance.shieldDisplayNodes = new ArrayList<>(b.a(new ShieldDisplayNode[ExtensionsRegistry.INSTANCE.getRowNodeCount(rowItem)]));
            getProcessingUnit().processShieldRow(rowItem, createRowNodeInstance);
            shieldSection.shieldRows = new RangeRemoveableArrayList<>();
            RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList = shieldSection.shieldRows;
            if (rangeRemoveableArrayList != null) {
                rangeRemoveableArrayList.add(createRowNodeInstance);
            }
        }
        return false;
    }
}
