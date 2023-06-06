package com.dianping.shield.node.processor.legacy.cell;

import android.text.TextUtils;
import android.view.View;
import com.dianping.agentsdk.framework.ac;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.m;
import com.dianping.agentsdk.framework.n;
import com.dianping.shield.node.cellnode.callback.legacy.LegacyLoadingPaintingCallback;
import com.dianping.shield.node.processor.NodeCreator;
import com.dianping.shield.node.processor.legacy.LegacyRetryClickListener;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/cell/CellStatusInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/cell/CellInterfaceProcessor;", "()V", "getCelViewType", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "defaultStr", "handleSectionCellInterface", "", "sectionCellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class CellStatusInterfaceProcessor extends CellInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.legacy.cell.CellInterfaceProcessor
    public final boolean handleSectionCellInterface(@NotNull af afVar, @NotNull ShieldSectionCellItem shieldSectionCellItem) {
        Object[] objArr = {afVar, shieldSectionCellItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f37dd19f6b042a47c3047412b51d8d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f37dd19f6b042a47c3047412b51d8d6")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(shieldSectionCellItem, "sectionCellItem");
        if (afVar instanceof n) {
            n nVar = (n) afVar;
            shieldSectionCellItem.loadingStatus = nVar.loadingStatus();
            ViewItem viewItem = new ViewItem();
            viewItem.viewType = getCelViewType(afVar, NodeCreator.LOADING_TYPE_CUSTOM);
            viewItem.data = viewItem.viewType;
            viewItem.viewPaintingCallback = new LegacyLoadingPaintingCallback(nVar, getLoadingAndLoadingMoreCreator());
            shieldSectionCellItem.loadingViewItem = viewItem;
            ViewItem viewItem2 = new ViewItem();
            viewItem2.viewType = getCelViewType(afVar, NodeCreator.FAILED_TYPE_CUSTOM);
            viewItem2.data = viewItem2.viewType;
            viewItem2.viewPaintingCallback = new LegacyLoadingPaintingCallback(nVar, getLoadingAndLoadingMoreCreator());
            View.OnClickListener loadingRetryListener = nVar.loadingRetryListener();
            if (loadingRetryListener != null) {
                viewItem2.clickCallback = new LegacyRetryClickListener(loadingRetryListener);
            }
            shieldSectionCellItem.failedViewItem = viewItem2;
            ViewItem viewItem3 = new ViewItem();
            viewItem3.viewType = getCelViewType(afVar, NodeCreator.EMPTY_TYPE_CUSTOM);
            viewItem3.data = viewItem3.viewType;
            viewItem3.viewPaintingCallback = new LegacyLoadingPaintingCallback(nVar, getLoadingAndLoadingMoreCreator());
            shieldSectionCellItem.emptyViewItem = viewItem3;
        }
        return false;
    }

    @NotNull
    public final String getCelViewType(@NotNull af afVar, @NotNull String str) {
        Object[] objArr = {afVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b710daae2713fa7c3ca98ceaff24953", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b710daae2713fa7c3ca98ceaff24953");
        }
        h.b(afVar, "sci");
        h.b(str, "defaultStr");
        if (afVar instanceof ac) {
            ac acVar = (ac) afVar;
            String cellStatusViewType = acVar.getCellStatusViewType(acVar.loadingStatus(), m.a);
            if (TextUtils.isEmpty(cellStatusViewType)) {
                return str;
            }
            return cellStatusViewType + '*' + str;
        }
        return str;
    }
}
