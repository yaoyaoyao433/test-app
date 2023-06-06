package com.dianping.shield.node.processor.impl.row;

import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldFloatViewDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/impl/row/RowNodeMappingProcessor;", "Lcom/dianping/shield/node/processor/impl/row/RowNodeProcessor;", "()V", "handleRowItem", "", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class RowNodeMappingProcessor extends RowNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.row.RowNodeProcessor
    public final boolean handleRowItem(@NotNull RowItem rowItem, @NotNull ShieldRow shieldRow) {
        HashMap<ViewItem, ShieldDisplayNode> dNodeMap;
        HashMap<ViewItem, ShieldDisplayNode> dNodeMap2;
        Object[] objArr = {rowItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22223c45586680fb8bb7c9c3a49fb97c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22223c45586680fb8bb7c9c3a49fb97c")).booleanValue();
        }
        h.b(rowItem, "rowItem");
        h.b(shieldRow, "shieldRow");
        ArrayList<ShieldDisplayNode> arrayList = shieldRow.shieldDisplayNodes;
        if (arrayList != null) {
            HashMap<ViewItem, ShieldDisplayNode> dNodeMap3 = shieldRow.getDNodeMap();
            if (dNodeMap3 != null) {
                dNodeMap3.clear();
            } else {
                shieldRow.setDNodeMap(new HashMap<>());
            }
            for (ShieldDisplayNode shieldDisplayNode : arrayList) {
                if (shieldDisplayNode != null && (dNodeMap2 = shieldRow.getDNodeMap()) != null) {
                    dNodeMap2.put(shieldDisplayNode.getViewItem(), shieldDisplayNode);
                }
            }
        }
        ShieldFloatViewDisplayNode shieldFloatViewDisplayNode = shieldRow.shieldFloatViewNode;
        if (shieldFloatViewDisplayNode != null && shieldFloatViewDisplayNode != null && (dNodeMap = shieldRow.getDNodeMap()) != null) {
            dNodeMap.put(shieldFloatViewDisplayNode.getViewItem(), shieldFloatViewDisplayNode);
        }
        return false;
    }
}
