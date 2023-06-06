package com.dianping.shield.node.processor.legacy.section;

import com.dianping.agentsdk.framework.af;
import com.dianping.shield.feature.SectionTitleInterface;
import com.dianping.shield.node.itemcallbacks.lazy.LegacyInterfaceRowItemProvider;
import com.dianping.shield.node.processor.ProcessorHolder;
import com.dianping.shield.node.useritem.SectionItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/section/NormalSectionInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/section/SectionInterfaceProcessor;", "holder", "Lcom/dianping/shield/node/processor/ProcessorHolder;", "(Lcom/dianping/shield/node/processor/ProcessorHolder;)V", "handleSectionItem", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "sectionItem", "Lcom/dianping/shield/node/useritem/SectionItem;", "section", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NormalSectionInterfaceProcessor extends SectionInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ProcessorHolder holder;

    public NormalSectionInterfaceProcessor(@NotNull ProcessorHolder processorHolder) {
        h.b(processorHolder, "holder");
        Object[] objArr = {processorHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "602f7fbbaae374ef1c6aaf3d9406092a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "602f7fbbaae374ef1c6aaf3d9406092a");
        } else {
            this.holder = processorHolder;
        }
    }

    @Override // com.dianping.shield.node.processor.legacy.section.SectionInterfaceProcessor
    public final boolean handleSectionItem(@NotNull af afVar, @NotNull SectionItem sectionItem, int i) {
        Object[] objArr = {afVar, sectionItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48a65010ba858a748b8219724e4a76fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48a65010ba858a748b8219724e4a76fb")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(sectionItem, "sectionItem");
        int rowCount = afVar.getRowCount(i);
        if (rowCount > 0) {
            sectionItem.isLazyLoad = true;
            sectionItem.rowCount = rowCount;
            sectionItem.lazyLoadRowItemProvider = new LegacyInterfaceRowItemProvider(afVar, this.holder);
        }
        if (afVar instanceof SectionTitleInterface) {
            sectionItem.sectionTitle = ((SectionTitleInterface) afVar).getSectionTitle(i);
        }
        if (afVar instanceof com.dianping.agentsdk.framework.h) {
            sectionItem.backgroundViewInfo = ((com.dianping.agentsdk.framework.h) afVar).a(i);
        }
        return false;
    }
}
