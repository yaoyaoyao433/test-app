package com.dianping.shield.node.processor.legacy.cell;

import com.dianping.agentsdk.framework.af;
import com.dianping.shield.extensions.staggeredgrid.StaggeredGridSectionItem;
import com.dianping.shield.feature.RecyclerPoolSizeInterface;
import com.dianping.shield.feature.ScrollToTopOffsetInterface;
import com.dianping.shield.feature.StaggeredGridCellInfoInterface;
import com.dianping.shield.node.processor.NodeCreator;
import com.dianping.shield.node.processor.ProcessorHolder;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/cell/NormalCellInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/cell/CellInterfaceProcessor;", "holder", "Lcom/dianping/shield/node/processor/ProcessorHolder;", "(Lcom/dianping/shield/node/processor/ProcessorHolder;)V", "handleSectionCellInterface", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "sectionCellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NormalCellInterfaceProcessor extends CellInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ProcessorHolder holder;

    public NormalCellInterfaceProcessor(@NotNull ProcessorHolder processorHolder) {
        h.b(processorHolder, "holder");
        Object[] objArr = {processorHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7de6c188e5d750aad4692d6db44880bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7de6c188e5d750aad4692d6db44880bc");
        } else {
            this.holder = processorHolder;
        }
    }

    @Override // com.dianping.shield.node.processor.legacy.cell.CellInterfaceProcessor
    public final boolean handleSectionCellInterface(@NotNull af afVar, @NotNull ShieldSectionCellItem shieldSectionCellItem) {
        Map<Integer, Integer> recyclerableViewSizeMap;
        Object[] objArr = {afVar, shieldSectionCellItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "253f305762c6818049d9c7f31be95538", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "253f305762c6818049d9c7f31be95538")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(shieldSectionCellItem, "sectionCellItem");
        int sectionCount = afVar.getSectionCount();
        if (sectionCount > 0) {
            if (shieldSectionCellItem.sectionItems == null) {
                shieldSectionCellItem.sectionItems = new ArrayList<>();
                r rVar = r.a;
            }
            for (int i = 0; i < sectionCount; i++) {
                if (afVar instanceof StaggeredGridCellInfoInterface) {
                    StaggeredGridCellInfoInterface staggeredGridCellInfoInterface = (StaggeredGridCellInfoInterface) afVar;
                    if (staggeredGridCellInfoInterface.spanCount(i) > 1) {
                        ArrayList<SectionItem> arrayList = shieldSectionCellItem.sectionItems;
                        if (arrayList != null) {
                            StaggeredGridSectionItem staggeredGridSectionItem = new StaggeredGridSectionItem(NodeCreator.Companion.geneLegacySectionId(afVar, i));
                            staggeredGridSectionItem.spanCount = staggeredGridCellInfoInterface.spanCount(i);
                            staggeredGridSectionItem.xStaggeredGridGap = staggeredGridCellInfoInterface.xStaggeredGridGap(i);
                            staggeredGridSectionItem.yStaggeredGridGap = staggeredGridCellInfoInterface.yStaggeredGridGap(i);
                            staggeredGridSectionItem.staggeredLeftMargin = staggeredGridCellInfoInterface.staggeredGridLeftMargin(i);
                            staggeredGridSectionItem.staggeredRightMargin = staggeredGridCellInfoInterface.staggeredGridRightMargin(i);
                            this.holder.getSectionInterfaceProcessorChain().startProcessor(afVar, staggeredGridSectionItem, Integer.valueOf(i));
                            if (staggeredGridSectionItem.spanCount > 1) {
                                staggeredGridSectionItem.dividerShowType = DividerStyle.ShowType.NONE;
                            }
                            arrayList.add(staggeredGridSectionItem);
                        }
                    }
                }
                ArrayList<SectionItem> arrayList2 = shieldSectionCellItem.sectionItems;
                if (arrayList2 != null) {
                    SectionItem sectionItem = new SectionItem(NodeCreator.Companion.geneLegacySectionId(afVar, i));
                    this.holder.getSectionInterfaceProcessorChain().startProcessor(afVar, sectionItem, Integer.valueOf(i));
                    arrayList2.add(sectionItem);
                }
            }
            if (afVar instanceof ScrollToTopOffsetInterface) {
                shieldSectionCellItem.needScrollToTop = ((ScrollToTopOffsetInterface) afVar).needScrollToTop();
            }
        }
        if ((afVar instanceof RecyclerPoolSizeInterface) && (recyclerableViewSizeMap = ((RecyclerPoolSizeInterface) afVar).recyclerableViewSizeMap()) != null) {
            for (Map.Entry<Integer, Integer> entry : recyclerableViewSizeMap.entrySet()) {
                if (shieldSectionCellItem.recyclerViewTypeSizeMap == null) {
                    shieldSectionCellItem.recyclerViewTypeSizeMap = new HashMap();
                    r rVar2 = r.a;
                }
                Map<String, Integer> map = shieldSectionCellItem.recyclerViewTypeSizeMap;
                h.a((Object) map, "sectionCellItem.recyclerViewTypeSizeMap");
                map.put(String.valueOf(entry.getKey().intValue()), entry.getValue());
            }
        }
        return false;
    }
}
