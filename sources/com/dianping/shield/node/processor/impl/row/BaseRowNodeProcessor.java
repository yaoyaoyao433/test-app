package com.dianping.shield.node.processor.impl.row;

import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.node.cellnode.CardConfigInfo;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldFloatViewDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.callback.lazyload.DefaultDisplayNodeProvider;
import com.dianping.shield.node.itemcallbacks.lazy.LazyLoadViewItemProvider;
import com.dianping.shield.node.useritem.FloatViewItem;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/dianping/shield/node/processor/impl/row/BaseRowNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/row/RowNodeProcessor;", "()V", "handleRowItem", "", "rowItem", "Lcom/dianping/shield/node/useritem/RowItem;", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BaseRowNodeProcessor extends RowNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.impl.row.RowNodeProcessor
    public final boolean handleRowItem(@NotNull RowItem rowItem, @NotNull ShieldRow shieldRow) {
        Object[] objArr = {rowItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0c128ec686d011433fbc96f700b8fdd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0c128ec686d011433fbc96f700b8fdd")).booleanValue();
        }
        h.b(rowItem, "rowItem");
        h.b(shieldRow, "shieldRow");
        shieldRow.dividerStyle = rowItem.dividerStyle;
        shieldRow.cardConfigInfo = rowItem.cardConfigInfo;
        CardConfigInfo cardConfigInfo = shieldRow.cardConfigInfo;
        if (cardConfigInfo != null) {
            CardConfigInfo cardConfigInfo2 = rowItem.cardConfigInfo;
            cardConfigInfo.marginLeft = (cardConfigInfo2 != null ? Integer.valueOf(aq.a(getContext(), cardConfigInfo2.marginLeft)) : null).intValue();
        }
        CardConfigInfo cardConfigInfo3 = shieldRow.cardConfigInfo;
        if (cardConfigInfo3 != null) {
            CardConfigInfo cardConfigInfo4 = rowItem.cardConfigInfo;
            cardConfigInfo3.marginRight = (cardConfigInfo4 != null ? Integer.valueOf(aq.a(getContext(), cardConfigInfo4.marginRight)) : null).intValue();
        }
        shieldRow.showCellTopLineDivider = rowItem.showCellTopDivider;
        shieldRow.showCellBottomLineDivider = rowItem.showCellBottomDivider;
        if (rowItem.isLazyLoad) {
            shieldRow.setViewCount(rowItem.viewCount);
            shieldRow.setLazyLoad(true);
            LazyLoadViewItemProvider lazyLoadViewItemProvider = rowItem.lazyLoadViewItemProvider;
            h.a((Object) lazyLoadViewItemProvider, "rowItem.lazyLoadViewItemProvider");
            shieldRow.setNodeProvider(new DefaultDisplayNodeProvider(lazyLoadViewItemProvider, getProcessingUnit()));
        } else {
            ArrayList<ViewItem> arrayList = rowItem.viewItems;
            if (arrayList != null) {
                int i = 0;
                for (ViewItem viewItem : arrayList) {
                    if (viewItem != null) {
                        ShieldDisplayNode createDisplayNodeWithMapping = ExtensionsRegistry.INSTANCE.createDisplayNodeWithMapping(viewItem, shieldRow);
                        createDisplayNodeWithMapping.rowParent = shieldRow;
                        processShieldNode(viewItem, createDisplayNodeWithMapping);
                        ArrayList<ShieldDisplayNode> arrayList2 = shieldRow.shieldDisplayNodes;
                        if (arrayList2 != null) {
                            arrayList2.set(i, createDisplayNodeWithMapping);
                        }
                    }
                    i++;
                }
            }
        }
        FloatViewItem floatViewItem = rowItem.floatViewItem;
        if (floatViewItem != null) {
            FloatViewItem floatViewItem2 = floatViewItem;
            ShieldDisplayNode createDisplayNodeWithMapping2 = ExtensionsRegistry.INSTANCE.createDisplayNodeWithMapping(floatViewItem2, shieldRow);
            if (createDisplayNodeWithMapping2 == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.ShieldFloatViewDisplayNode");
            }
            ShieldFloatViewDisplayNode shieldFloatViewDisplayNode = (ShieldFloatViewDisplayNode) createDisplayNodeWithMapping2;
            shieldFloatViewDisplayNode.rowParent = shieldRow;
            processShieldNode(floatViewItem2, shieldFloatViewDisplayNode);
            shieldRow.shieldFloatViewNode = shieldFloatViewDisplayNode;
        }
        return false;
    }
}
