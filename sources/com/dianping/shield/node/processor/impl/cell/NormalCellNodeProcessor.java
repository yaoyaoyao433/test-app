package com.dianping.shield.node.processor.impl.cell;

import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldFloatViewDisplayNode;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.useritem.FloatViewItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0014¨\u0006\r"}, d2 = {"Lcom/dianping/shield/node/processor/impl/cell/NormalCellNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/cell/CellNodeProcessor;", "()V", "handleShieldViewCell", "", "cellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "shieldViewCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "addList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "Lkotlin/collections/ArrayList;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NormalCellNodeProcessor extends CellNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.cell.CellNodeProcessor
    public final boolean handleShieldViewCell(@NotNull ShieldSectionCellItem shieldSectionCellItem, @NotNull ShieldViewCell shieldViewCell, @NotNull ArrayList<ShieldSection> arrayList) {
        Object[] objArr = {shieldSectionCellItem, shieldViewCell, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a93ebf3987035458c8083bf6e45a6b9c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a93ebf3987035458c8083bf6e45a6b9c")).booleanValue();
        }
        h.b(shieldSectionCellItem, "cellItem");
        h.b(shieldViewCell, "shieldViewCell");
        h.b(arrayList, "addList");
        ArrayList<SectionItem> arrayList2 = shieldSectionCellItem.sectionItems;
        if (arrayList2 != null) {
            if (shieldViewCell.shieldSections == null) {
                shieldViewCell.shieldSections = new RangeRemoveableArrayList<>();
                r rVar = r.a;
            }
            Iterator<SectionItem> it = arrayList2.iterator();
            while (it.hasNext()) {
                SectionItem next = it.next();
                ExtensionsRegistry extensionsRegistry = ExtensionsRegistry.INSTANCE;
                h.a((Object) next, "sectionItem");
                ShieldSection createSectionNodeInstanceWithMapping = extensionsRegistry.createSectionNodeInstanceWithMapping(next, shieldViewCell);
                createSectionNodeInstanceWithMapping.cellParent = shieldViewCell;
                RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList = shieldViewCell.shieldSections;
                if (rangeRemoveableArrayList != null) {
                    rangeRemoveableArrayList.add(createSectionNodeInstanceWithMapping);
                }
                processShieldSection(next, createSectionNodeInstanceWithMapping);
                arrayList.add(createSectionNodeInstanceWithMapping);
            }
        }
        shieldViewCell.needScrollToTop = shieldSectionCellItem.needScrollToTop;
        shieldViewCell.recyclerViewTypeSizeMap = shieldSectionCellItem.recyclerViewTypeSizeMap;
        FloatViewItem floatViewItem = shieldSectionCellItem.floatViewItem;
        if (floatViewItem != null) {
            FloatViewItem floatViewItem2 = floatViewItem;
            ShieldDisplayNode createImmediateNodeInstanceWithMapping = ExtensionsRegistry.INSTANCE.createImmediateNodeInstanceWithMapping(floatViewItem2, shieldViewCell);
            if (!(createImmediateNodeInstanceWithMapping instanceof ShieldFloatViewDisplayNode)) {
                createImmediateNodeInstanceWithMapping = null;
            }
            ShieldFloatViewDisplayNode shieldFloatViewDisplayNode = (ShieldFloatViewDisplayNode) createImmediateNodeInstanceWithMapping;
            if (shieldFloatViewDisplayNode != null) {
                shieldFloatViewDisplayNode.immediateCellParent = shieldViewCell;
                processShieldNode(floatViewItem2, shieldFloatViewDisplayNode);
            } else {
                shieldFloatViewDisplayNode = null;
            }
            shieldViewCell.shieldFloatViewNode = shieldFloatViewDisplayNode;
        }
        return false;
    }
}
