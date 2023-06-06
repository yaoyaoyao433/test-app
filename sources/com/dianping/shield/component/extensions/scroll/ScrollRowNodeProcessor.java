package com.dianping.shield.component.extensions.scroll;

import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.extensions.common.CommonContainerNodeData;
import com.dianping.shield.component.extensions.common.CommonContainerRow;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.processor.impl.row.RowNodeProcessor;
import com.dianping.shield.node.useritem.RowItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/component/extensions/scroll/ScrollRowNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/row/RowNodeProcessor;", "()V", "handleRowItem", "", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ScrollRowNodeProcessor extends RowNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.row.RowNodeProcessor
    public final boolean handleRowItem(@NotNull RowItem rowItem, @NotNull ShieldRow shieldRow) {
        Object[] objArr = {rowItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2efd0d3e31a805e7e0005b4f9edfd004", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2efd0d3e31a805e7e0005b4f9edfd004")).booleanValue();
        }
        h.b(rowItem, "rowItem");
        h.b(shieldRow, "shieldRow");
        if ((rowItem instanceof ScrollRowItem) && (shieldRow instanceof ScrollRow)) {
            ScrollRow scrollRow = (ScrollRow) shieldRow;
            ScrollRowItem scrollRowItem = (ScrollRowItem) rowItem;
            scrollRow.scrollMode = scrollRowItem.scrollMode;
            scrollRow.marginTop = aq.a(getContext(), scrollRowItem.marginTop);
            scrollRow.marginBottom = aq.a(getContext(), scrollRowItem.marginBottom);
            scrollRow.marginRight = aq.a(getContext(), scrollRowItem.marginRight);
            scrollRow.marginLeft = aq.a(getContext(), scrollRowItem.marginLeft);
            scrollRow.extraMarginTop = aq.a(getContext(), scrollRowItem.extraMarginTop);
            scrollRow.extraMarginBottom = aq.a(getContext(), scrollRowItem.extraMarginBottom);
            scrollRow.extraMarginLeft = aq.a(getContext(), scrollRowItem.extraMarginLeft);
            scrollRow.extraMarginRight = aq.a(getContext(), scrollRowItem.extraMarginRight);
            scrollRow.xGap = aq.a(getContext(), scrollRowItem.xGap);
            scrollRow.yGap = aq.a(getContext(), scrollRowItem.yGap);
            scrollRow.scrollEnabled = scrollRowItem.scrollEnabled;
            scrollRow.normalAttachView = scrollRowItem.normalAttachView;
            scrollRow.triggeredAttachView = scrollRowItem.triggeredAttachView;
            scrollRow.attachTriggerDistance = aq.a(getContext(), scrollRowItem.attachTriggerDistance);
            scrollRow.attachedStatusChangedListener = scrollRowItem.attachedStatusChangedListener;
            scrollRow.onFooterActionListener = scrollRowItem.onFooterActionListener;
            scrollRow.setViewItems(rowItem.viewItems);
            scrollRow.scrollEventDispatcherProvider = scrollRowItem.scrollEventDispatcherProvider;
            scrollRow.onDidInterceptTouchListener = scrollRowItem.onDidInterceptTouchListener;
            scrollRow.pageIndex = scrollRowItem.pageIndex;
            scrollRow.isLoop = scrollRowItem.isLoop;
            scrollRow.isVertical = scrollRowItem.isVertical;
            scrollRow.isGallery = scrollRowItem.isGallery;
            scrollRow.galleryGap = aq.a(getContext(), scrollRowItem.galleryGap);
            scrollRow.rowCount = scrollRowItem.rowCount;
            scrollRow.colCount = scrollRowItem.colCount;
            scrollRow.autoLoopInterval = scrollRowItem.autoLoopInterval;
            scrollRow.onPageSelectedListener = scrollRowItem.onPageSelectedListener;
            scrollRow.autoHeight = scrollRowItem.autoHeight;
            scrollRow.heightList = scrollRowItem.heightList;
            scrollRow.rowPaintingCallback = new RecyclerPagerPaintingCallback();
            scrollRow.setDNodeData(new CommonContainerNodeData((CommonContainerRow) shieldRow));
        }
        return false;
    }
}
