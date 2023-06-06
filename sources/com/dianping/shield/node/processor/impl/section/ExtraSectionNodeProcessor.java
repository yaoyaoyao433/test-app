package com.dianping.shield.node.processor.impl.section;

import com.dianping.shield.entity.CellType;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/impl/section/ExtraSectionNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/section/SectionNodeProcessor;", "()V", "handleShieldSection", "", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ExtraSectionNodeProcessor extends SectionNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.section.SectionNodeProcessor
    public final boolean handleShieldSection(@NotNull SectionItem sectionItem, @NotNull ShieldSection shieldSection) {
        ShieldViewCell shieldViewCell;
        ShieldViewCell shieldViewCell2;
        Object[] objArr = {sectionItem, shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10c239f844b6578e7f1ff22f13710364", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10c239f844b6578e7f1ff22f13710364")).booleanValue();
        }
        h.b(sectionItem, "sectionItem");
        h.b(shieldSection, "shieldSection");
        RowItem rowItem = sectionItem.headerRowItem;
        String str = null;
        if (rowItem != null) {
            shieldSection.hasHeaderCell = true;
            RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList = shieldSection.shieldRows;
            if (rangeRemoveableArrayList != null) {
                ShieldRow createRowNodeInstanceWithMapping = ExtensionsRegistry.INSTANCE.createRowNodeInstanceWithMapping(rowItem, shieldSection);
                createRowNodeInstanceWithMapping.sectionParent = shieldSection;
                createRowNodeInstanceWithMapping.cellType = CellType.HEADER;
                ShieldSection shieldSection2 = createRowNodeInstanceWithMapping.sectionParent;
                createRowNodeInstanceWithMapping.typePrefix = (shieldSection2 == null || (shieldViewCell2 = shieldSection2.cellParent) == null) ? null : shieldViewCell2.name;
                createRowNodeInstanceWithMapping.shieldDisplayNodes = new ArrayList<>(b.a(new ShieldDisplayNode[ExtensionsRegistry.INSTANCE.getRowNodeCount(rowItem)]));
                processShieldRow(rowItem, createRowNodeInstanceWithMapping);
                rangeRemoveableArrayList.add(0, createRowNodeInstanceWithMapping);
            }
        }
        RowItem rowItem2 = sectionItem.footerRowItem;
        if (rowItem2 != null) {
            shieldSection.hasFooterCell = true;
            RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList2 = shieldSection.shieldRows;
            if (rangeRemoveableArrayList2 != null) {
                ShieldRow createRowNodeInstanceWithMapping2 = ExtensionsRegistry.INSTANCE.createRowNodeInstanceWithMapping(rowItem2, shieldSection);
                createRowNodeInstanceWithMapping2.sectionParent = shieldSection;
                createRowNodeInstanceWithMapping2.cellType = CellType.FOOTER;
                ShieldSection shieldSection3 = createRowNodeInstanceWithMapping2.sectionParent;
                if (shieldSection3 != null && (shieldViewCell = shieldSection3.cellParent) != null) {
                    str = shieldViewCell.name;
                }
                createRowNodeInstanceWithMapping2.typePrefix = str;
                createRowNodeInstanceWithMapping2.shieldDisplayNodes = new ArrayList<>(b.a(new ShieldDisplayNode[ExtensionsRegistry.INSTANCE.getRowNodeCount(rowItem2)]));
                processShieldRow(rowItem2, createRowNodeInstanceWithMapping2);
                rangeRemoveableArrayList2.add(createRowNodeInstanceWithMapping2);
            }
        }
        return false;
    }
}
