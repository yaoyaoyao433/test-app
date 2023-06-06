package com.dianping.shield.node.processor.impl.section;

import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/impl/section/SectionNodeMappingProcessor;", "Lcom/dianping/shield/node/processor/impl/section/SectionNodeProcessor;", "()V", "handleShieldSection", "", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class SectionNodeMappingProcessor extends SectionNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.section.SectionNodeProcessor
    public final boolean handleShieldSection(@NotNull SectionItem sectionItem, @NotNull ShieldSection shieldSection) {
        HashMap<RowItem, ShieldRow> hashMap;
        Object[] objArr = {sectionItem, shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2176862dab20097ad188027697b0c970", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2176862dab20097ad188027697b0c970")).booleanValue();
        }
        h.b(sectionItem, "sectionItem");
        h.b(shieldSection, "shieldSection");
        RangeRemoveableArrayList<ShieldRow> rangeRemoveableArrayList = shieldSection.shieldRows;
        if (rangeRemoveableArrayList != null) {
            HashMap<RowItem, ShieldRow> hashMap2 = shieldSection.rowMap;
            if (hashMap2 != null) {
                hashMap2.clear();
            } else {
                shieldSection.rowMap = new HashMap<>();
            }
            for (ShieldRow shieldRow : rangeRemoveableArrayList) {
                if (shieldRow != null && (hashMap = shieldSection.rowMap) != null) {
                    hashMap.put(shieldRow.getRowItem(), shieldRow);
                }
            }
        }
        return false;
    }
}
