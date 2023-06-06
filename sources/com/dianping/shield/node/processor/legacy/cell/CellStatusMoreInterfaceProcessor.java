package com.dianping.shield.node.processor.legacy.cell;

import android.text.TextUtils;
import android.view.View;
import com.dianping.agentsdk.framework.ad;
import com.dianping.agentsdk.framework.af;
import com.dianping.agentsdk.framework.l;
import com.dianping.agentsdk.framework.m;
import com.dianping.agentsdk.framework.o;
import com.dianping.shield.node.cellnode.callback.legacy.LegacyLoadingMorePaintingCallback;
import com.dianping.shield.node.processor.NodeCreator;
import com.dianping.shield.node.processor.legacy.LegacyLoadingMoreListener;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/dianping/shield/node/processor/legacy/cell/CellStatusMoreInterfaceProcessor;", "Lcom/dianping/shield/node/processor/legacy/cell/CellInterfaceProcessor;", "()V", "getCelViewType", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "status", "Lcom/dianping/agentsdk/framework/CellStatus$LoadingMoreStatus;", "defaultStr", "handleSectionCellInterface", "", "sectionCellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class CellStatusMoreInterfaceProcessor extends CellInterfaceProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.processor.legacy.cell.CellInterfaceProcessor
    public final boolean handleSectionCellInterface(@NotNull af afVar, @NotNull ShieldSectionCellItem shieldSectionCellItem) {
        Object[] objArr = {afVar, shieldSectionCellItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "386a90597c58dd78dbe2adf429c29379", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "386a90597c58dd78dbe2adf429c29379")).booleanValue();
        }
        h.b(afVar, "sci");
        h.b(shieldSectionCellItem, "sectionCellItem");
        if (afVar instanceof o) {
            o oVar = (o) afVar;
            shieldSectionCellItem.loadingMoreStatus = oVar.loadingMoreStatus();
            ViewItem viewItem = new ViewItem();
            viewItem.viewType = getCelViewType(afVar, l.a.LOADING, NodeCreator.LOADING_MORE_TYPE_CUSTOM);
            viewItem.data = viewItem.viewType;
            viewItem.viewPaintingCallback = new LegacyLoadingMorePaintingCallback(oVar, getLoadingAndLoadingMoreCreator());
            shieldSectionCellItem.loadingMoreViewItem = viewItem;
            ViewItem viewItem2 = new ViewItem();
            viewItem2.viewType = getCelViewType(afVar, l.a.FAILED, NodeCreator.LOADING_MORE_FAILED_TYPE_CUSTOM);
            viewItem2.data = viewItem2.viewType;
            viewItem2.viewPaintingCallback = new LegacyLoadingMorePaintingCallback(oVar, getLoadingAndLoadingMoreCreator());
            View.OnClickListener loadingMoreRetryListener = oVar.loadingMoreRetryListener();
            if (loadingMoreRetryListener != null) {
                viewItem2.clickCallback = new LegacyRetryClickListener(loadingMoreRetryListener);
            }
            shieldSectionCellItem.loadingMoreFailedViewItem = viewItem2;
            shieldSectionCellItem.loadingMoreViewPaintingListener = new LegacyLoadingMoreListener(oVar);
        }
        return false;
    }

    @NotNull
    public final String getCelViewType(@NotNull af afVar, @NotNull l.a aVar, @NotNull String str) {
        Object[] objArr = {afVar, aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd8b46f5eba9e326d23246acc36a746d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd8b46f5eba9e326d23246acc36a746d");
        }
        h.b(afVar, "sci");
        h.b(aVar, "status");
        h.b(str, "defaultStr");
        if (afVar instanceof ad) {
            String loadingMoreViewType = ((ad) afVar).getLoadingMoreViewType(aVar, m.a);
            if (TextUtils.isEmpty(loadingMoreViewType)) {
                return str;
            }
            return loadingMoreViewType + '*' + str;
        }
        return str;
    }
}
