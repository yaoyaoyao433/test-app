package com.dianping.shield.node.processor.impl.cell;

import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldFloatViewDisplayNode;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0014¨\u0006\r"}, d2 = {"Lcom/dianping/shield/node/processor/impl/cell/CellNodeMappingProcessor;", "Lcom/dianping/shield/node/processor/impl/cell/CellNodeProcessor;", "()V", "handleShieldViewCell", "", "cellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "shieldViewCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "addList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "Lkotlin/collections/ArrayList;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class CellNodeMappingProcessor extends CellNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.cell.CellNodeProcessor
    public final boolean handleShieldViewCell(@NotNull ShieldSectionCellItem shieldSectionCellItem, @NotNull ShieldViewCell shieldViewCell, @NotNull ArrayList<ShieldSection> arrayList) {
        Object[] objArr = {shieldSectionCellItem, shieldViewCell, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3653d9f468147aea731282a9b30ecc80", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3653d9f468147aea731282a9b30ecc80")).booleanValue();
        }
        h.b(shieldSectionCellItem, "cellItem");
        h.b(shieldViewCell, "shieldViewCell");
        h.b(arrayList, "addList");
        RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList = shieldViewCell.shieldSections;
        if (rangeRemoveableArrayList != null) {
            HashMap<SectionItem, ShieldSection> hashMap = shieldViewCell.sectionMap;
            if (hashMap != null) {
                hashMap.clear();
            } else {
                shieldViewCell.sectionMap = new HashMap<>();
            }
            for (ShieldSection shieldSection : rangeRemoveableArrayList) {
                HashMap<SectionItem, ShieldSection> hashMap2 = shieldViewCell.sectionMap;
                if (hashMap2 != null) {
                    hashMap2.put(shieldSection.getSectionItem(), shieldSection);
                }
            }
        }
        ShieldFloatViewDisplayNode shieldFloatViewDisplayNode = shieldViewCell.shieldFloatViewNode;
        if (shieldFloatViewDisplayNode != null) {
            HashMap<ViewItem, ShieldDisplayNode> hashMap3 = shieldViewCell.immediateNodeMap;
            if (hashMap3 != null) {
                hashMap3.clear();
            } else {
                shieldViewCell.immediateNodeMap = new HashMap<>();
            }
            HashMap<ViewItem, ShieldDisplayNode> hashMap4 = shieldViewCell.immediateNodeMap;
            if (hashMap4 != null) {
                hashMap4.put(shieldFloatViewDisplayNode.getViewItem(), shieldFloatViewDisplayNode);
            }
        }
        return false;
    }
}
