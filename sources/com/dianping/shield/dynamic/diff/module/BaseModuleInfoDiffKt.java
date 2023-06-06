package com.dianping.shield.dynamic.diff.module;

import com.dianping.agentsdk.framework.l;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b¨\u0006\u0003"}, d2 = {KNBConfig.CONFIG_CLEAR_CACHE, "", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "shieldDynamic_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BaseModuleInfoDiffKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void clear(@NotNull ShieldSectionCellItem shieldSectionCellItem) {
        Object[] objArr = {shieldSectionCellItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4864b6f025471f6eb5f7837b48161815", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4864b6f025471f6eb5f7837b48161815");
            return;
        }
        h.b(shieldSectionCellItem, "receiver$0");
        ArrayList<SectionItem> arrayList = shieldSectionCellItem.sectionItems;
        if (arrayList != null) {
            arrayList.clear();
        }
        shieldSectionCellItem.shouldShow = true;
        shieldSectionCellItem.loadingStatus = l.b.UNKNOWN;
        shieldSectionCellItem.loadingViewItem = null;
        shieldSectionCellItem.failedViewItem = null;
        shieldSectionCellItem.emptyViewItem = null;
        shieldSectionCellItem.loadingMoreStatus = l.a.UNKNOWN;
        shieldSectionCellItem.loadingMoreViewItem = null;
        shieldSectionCellItem.loadingMoreFailedViewItem = null;
        shieldSectionCellItem.loadingMoreViewPaintingListener = null;
        shieldSectionCellItem.floatViewItem = null;
        shieldSectionCellItem.sectionHeaderGapHeight = -1;
        shieldSectionCellItem.sectionHeaderGapDrawable = null;
        shieldSectionCellItem.sectionFooterGapHeight = -1;
        shieldSectionCellItem.sectionFooterGapDrawable = null;
        shieldSectionCellItem.previousLinkType = null;
        shieldSectionCellItem.nextLinkType = null;
        shieldSectionCellItem.exposeInfo = null;
        shieldSectionCellItem.moveStatusCallback = null;
        shieldSectionCellItem.needScrollToTop = false;
        shieldSectionCellItem.emptyMessage = null;
        shieldSectionCellItem.hideLoadingMoreBackGround = false;
        shieldSectionCellItem.hideLoadingMoreFailBackGroud = false;
        shieldSectionCellItem.exposeComputeMode = null;
    }
}
