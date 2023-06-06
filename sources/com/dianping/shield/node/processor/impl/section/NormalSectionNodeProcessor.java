package com.dianping.shield.node.processor.impl.section;

import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.callback.lazyload.DefaultShieldRowProvider;
import com.dianping.shield.node.cellnode.callback.lazyload.DefaultShieldRowProviderWithItem;
import com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider;
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
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/impl/section/NormalSectionNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/section/SectionNodeProcessor;", "()V", "handleShieldSection", "", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NormalSectionNodeProcessor extends SectionNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.section.SectionNodeProcessor
    public final boolean handleShieldSection(@NotNull SectionItem sectionItem, @NotNull ShieldSection shieldSection) {
        int size;
        Object[] objArr = {sectionItem, shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0a61eab81a079b7fe046ac96bd9378a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0a61eab81a079b7fe046ac96bd9378a")).booleanValue();
        }
        h.b(sectionItem, "sectionItem");
        h.b(shieldSection, "shieldSection");
        if (sectionItem.isLazyLoad) {
            size = sectionItem.rowCount;
        } else {
            ArrayList<RowItem> arrayList = sectionItem.rowItems;
            size = arrayList != null ? arrayList.size() : 0;
        }
        shieldSection.isLazyLoad = true;
        if (sectionItem.isLazyLoad) {
            LazyLoadRowItemProvider lazyLoadRowItemProvider = sectionItem.lazyLoadRowItemProvider;
            if (lazyLoadRowItemProvider != null) {
                shieldSection.setRowProvider(new DefaultShieldRowProvider(lazyLoadRowItemProvider, getProcessingUnit()));
            }
        } else {
            ArrayList<RowItem> arrayList2 = sectionItem.rowItems;
            if (arrayList2 != null) {
                shieldSection.setRowProvider(new DefaultShieldRowProviderWithItem(arrayList2, getProcessingUnit()));
            }
        }
        if (shieldSection.shieldRows == null) {
            shieldSection.shieldRows = new RangeRemoveableArrayList<>(b.a(new ShieldRow[size]));
            r rVar = r.a;
        }
        shieldSection.setEnableLayoutAnimation(sectionItem.enableLayoutAnimation);
        shieldSection.setInsertAnimationType(sectionItem.insertAnimationType);
        shieldSection.setDeleteAnimationType(sectionItem.deleteAnimationType);
        return false;
    }
}
