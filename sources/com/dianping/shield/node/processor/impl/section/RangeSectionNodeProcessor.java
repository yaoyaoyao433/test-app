package com.dianping.shield.node.processor.impl.section;

import com.dianping.shield.node.cellnode.RowRangeHolder;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.callback.lazyload.LazyLoadShieldRowProvider;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/impl/section/RangeSectionNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/section/SectionNodeProcessor;", "()V", "handleShieldSection", "", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class RangeSectionNodeProcessor extends SectionNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.section.SectionNodeProcessor
    public final boolean handleShieldSection(@NotNull SectionItem sectionItem, @NotNull ShieldSection shieldSection) {
        ShieldRow shieldRow;
        ArrayList<ShieldDisplayNode> arrayList;
        ShieldRow shieldRow2;
        ArrayList<ShieldDisplayNode> arrayList2;
        ShieldRow shieldRow3;
        ArrayList<ShieldDisplayNode> arrayList3;
        Object[] objArr = {sectionItem, shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6caa3508a0e7961e9381a7d436010432", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6caa3508a0e7961e9381a7d436010432")).booleanValue();
        }
        h.b(sectionItem, "sectionItem");
        h.b(shieldSection, "shieldSection");
        shieldSection.getRangeDispatcher().clear();
        ArrayList arrayList4 = new ArrayList();
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList = shieldSection.shieldRows;
        int size = rangeRemoveableArrayList != null ? rangeRemoveableArrayList.size() : 0;
        for (int i = 0; i < size; i++) {
            RowRangeHolder rowRangeHolder = new RowRangeHolder(0, 1, null);
            if (i == 0 && shieldSection.hasHeaderCell) {
                RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList2 = shieldSection.shieldRows;
                rowRangeHolder.dNodeCount = (rangeRemoveableArrayList2 == null || (shieldRow3 = rangeRemoveableArrayList2.get(0)) == null || (arrayList3 = shieldRow3.shieldDisplayNodes) == null) ? 0 : arrayList3.size();
            } else {
                int i2 = size - 1;
                if (i == i2 && shieldSection.hasFooterCell) {
                    RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList3 = shieldSection.shieldRows;
                    rowRangeHolder.dNodeCount = (rangeRemoveableArrayList3 == null || (shieldRow2 = rangeRemoveableArrayList3.get(i2)) == null || (arrayList2 = shieldRow2.shieldDisplayNodes) == null) ? 0 : arrayList2.size();
                } else if (shieldSection.isLazyLoad) {
                    int i3 = shieldSection.hasHeaderCell ? i - 1 : i;
                    LazyLoadShieldRowProvider rowProvider = shieldSection.getRowProvider();
                    rowRangeHolder.dNodeCount = rowProvider != null ? rowProvider.getRowNodeCount(i3, shieldSection) : 0;
                } else {
                    RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList4 = shieldSection.shieldRows;
                    rowRangeHolder.dNodeCount = (rangeRemoveableArrayList4 == null || (shieldRow = rangeRemoveableArrayList4.get(i)) == null || (arrayList = shieldRow.shieldDisplayNodes) == null) ? 0 : arrayList.size();
                }
            }
            arrayList4.add(rowRangeHolder);
        }
        shieldSection.getRangeDispatcher().addAll(arrayList4);
        return false;
    }
}
