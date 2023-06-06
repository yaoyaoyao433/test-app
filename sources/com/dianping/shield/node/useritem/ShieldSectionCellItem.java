package com.dianping.shield.node.useritem;

import android.graphics.drawable.Drawable;
import com.dianping.agentsdk.framework.f;
import com.dianping.agentsdk.framework.l;
import com.dianping.agentsdk.framework.z;
import com.dianping.shield.node.itemcallbacks.LoadingMoreViewPaintingListener;
import com.dianping.shield.node.itemcallbacks.MoveStatusCallback;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ShieldSectionCellItem {
    private static AtomicLong cellItemId = new AtomicLong();
    public static ChangeQuickRedirect changeQuickRedirect;
    private int cHash;
    private String cId;
    public String emptyMessage;
    public ViewItem emptyViewItem;
    public f.a exposeComputeMode;
    public ArrayList<ExposeInfo> exposeInfo;
    public ViewItem failedViewItem;
    public FloatViewItem floatViewItem;
    public boolean hideLoadingMoreBackGround;
    public boolean hideLoadingMoreFailBackGroud;
    public ViewItem loadingMoreFailedViewItem;
    public l.a loadingMoreStatus;
    public ViewItem loadingMoreViewItem;
    public LoadingMoreViewPaintingListener loadingMoreViewPaintingListener;
    public l.b loadingStatus;
    public ViewItem loadingViewItem;
    public MoveStatusCallback moveStatusCallback;
    public boolean needScrollToTop;
    public z.a nextLinkType;
    public z.b previousLinkType;
    public Map<String, Integer> recyclerViewTypeSizeMap;
    public Drawable sectionFooterGapDrawable;
    public int sectionFooterGapHeight;
    public Drawable sectionHeaderGapDrawable;
    public int sectionHeaderGapHeight;
    public ArrayList<SectionItem> sectionItems;
    public boolean shouldShow;

    public ShieldSectionCellItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6886e434cdb4db52e83e26f36559f54e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6886e434cdb4db52e83e26f36559f54e");
            return;
        }
        this.shouldShow = true;
        this.loadingStatus = l.b.UNKNOWN;
        this.loadingMoreStatus = l.a.UNKNOWN;
        this.sectionHeaderGapHeight = -1;
        this.sectionFooterGapHeight = -1;
        this.needScrollToTop = false;
        this.recyclerViewTypeSizeMap = null;
        this.exposeComputeMode = null;
        this.cId = "cId_" + cellItemId.getAndIncrement();
        this.cHash = this.cId.hashCode();
    }

    public ShieldSectionCellItem(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b0c2ed4d25493b841a6ebf1b69e9c56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b0c2ed4d25493b841a6ebf1b69e9c56");
            return;
        }
        this.shouldShow = true;
        this.loadingStatus = l.b.UNKNOWN;
        this.loadingMoreStatus = l.a.UNKNOWN;
        this.sectionHeaderGapHeight = -1;
        this.sectionFooterGapHeight = -1;
        this.needScrollToTop = false;
        this.recyclerViewTypeSizeMap = null;
        this.exposeComputeMode = null;
        if (str != null) {
            this.cId = str;
        } else {
            this.cId = "cId_" + cellItemId.getAndIncrement();
        }
        this.cHash = this.cId.hashCode();
    }

    public static ShieldSectionCellItem createSimpleSCI(ViewPaintingCallback viewPaintingCallback) {
        Object[] objArr = {viewPaintingCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e3bac24310c92e5be0530bba20966590", RobustBitConfig.DEFAULT_VALUE) ? (ShieldSectionCellItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e3bac24310c92e5be0530bba20966590") : new ShieldSectionCellItem().addSectionItem(new SectionItem().addRowItem(RowItem.createNormalRow(viewPaintingCallback)));
    }

    public static ShieldSectionCellItem createSimpleSCI(ViewPaintingCallback viewPaintingCallback, String str) {
        Object[] objArr = {viewPaintingCallback, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2907193ac5e1924387d90e699ed3602e", RobustBitConfig.DEFAULT_VALUE) ? (ShieldSectionCellItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2907193ac5e1924387d90e699ed3602e") : new ShieldSectionCellItem().addSectionItem(new SectionItem().addRowItem(RowItem.createNormalRow(viewPaintingCallback, str)));
    }

    public static ShieldSectionCellItem createSimpleSCI(ViewPaintingCallback viewPaintingCallback, String str, Object obj) {
        Object[] objArr = {viewPaintingCallback, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df9983c1046fafbbd804fe5e4ac25ac6", RobustBitConfig.DEFAULT_VALUE) ? (ShieldSectionCellItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df9983c1046fafbbd804fe5e4ac25ac6") : new ShieldSectionCellItem().addSectionItem(new SectionItem().addRowItem(RowItem.createNormalRow(viewPaintingCallback, str, obj)));
    }

    public ShieldSectionCellItem addSectionItem(SectionItem sectionItem) {
        Object[] objArr = {sectionItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecebc5e8a278832432c38bb3a1043d2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSectionCellItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecebc5e8a278832432c38bb3a1043d2d");
        }
        if (this.sectionItems == null) {
            this.sectionItems = new ArrayList<>();
        }
        sectionItem.sectionIndex = Integer.valueOf(this.sectionItems.size());
        this.sectionItems.add(sectionItem);
        return this;
    }

    public ShieldSectionCellItem addSectionItemWithoutIndex(SectionItem sectionItem) {
        Object[] objArr = {sectionItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bdbedaf0e6dced5545477e4c32a792a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSectionCellItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bdbedaf0e6dced5545477e4c32a792a");
        }
        if (this.sectionItems == null) {
            this.sectionItems = new ArrayList<>();
        }
        this.sectionItems.add(sectionItem);
        return this;
    }

    public ShieldSectionCellItem setShouldShow(boolean z) {
        this.shouldShow = z;
        return this;
    }

    public ShieldSectionCellItem setLoadingStatus(l.b bVar) {
        this.loadingStatus = bVar;
        return this;
    }

    public ShieldSectionCellItem setLoadingViewItem(ViewItem viewItem) {
        this.loadingViewItem = viewItem;
        return this;
    }

    public ShieldSectionCellItem setFailedViewItem(ViewItem viewItem) {
        this.failedViewItem = viewItem;
        return this;
    }

    public ShieldSectionCellItem setEmptyViewItem(ViewItem viewItem) {
        this.emptyViewItem = viewItem;
        return this;
    }

    public ShieldSectionCellItem setLoadingMoreStatus(l.a aVar) {
        this.loadingMoreStatus = aVar;
        return this;
    }

    public ShieldSectionCellItem setLoadingMoreViewItem(ViewItem viewItem) {
        this.loadingMoreViewItem = viewItem;
        return this;
    }

    public ShieldSectionCellItem setLoadingMoreFailedViewItem(ViewItem viewItem) {
        this.loadingMoreFailedViewItem = viewItem;
        return this;
    }

    public ShieldSectionCellItem setLoadingMoreViewPaintingListener(LoadingMoreViewPaintingListener loadingMoreViewPaintingListener) {
        this.loadingMoreViewPaintingListener = loadingMoreViewPaintingListener;
        return this;
    }

    public ShieldSectionCellItem setMoveStatusCallback(MoveStatusCallback moveStatusCallback) {
        this.moveStatusCallback = moveStatusCallback;
        return this;
    }

    public ShieldSectionCellItem setNeedScrollToTop(boolean z) {
        this.needScrollToTop = z;
        return this;
    }

    public ShieldSectionCellItem setRecyclerViewTypeSizeMap(Map<String, Integer> map) {
        this.recyclerViewTypeSizeMap = map;
        return this;
    }

    public ShieldSectionCellItem addExposeInfo(ExposeInfo exposeInfo) {
        Object[] objArr = {exposeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "101a62febed8cbbd35cd62c45ae809bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSectionCellItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "101a62febed8cbbd35cd62c45ae809bc");
        }
        if (this.exposeInfo == null) {
            this.exposeInfo = new ArrayList<>();
        }
        this.exposeInfo.add(exposeInfo);
        return this;
    }

    public ShieldSectionCellItem setFloatViewItem(FloatViewItem floatViewItem) {
        this.floatViewItem = floatViewItem;
        return this;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0d73963783701b9d95d1aeb0176dbd9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0d73963783701b9d95d1aeb0176dbd9")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShieldSectionCellItem shieldSectionCellItem = (ShieldSectionCellItem) obj;
        return this.cId != null ? this.cId.equals(shieldSectionCellItem.cId) : shieldSectionCellItem.cId == null;
    }

    public int hashCode() {
        return this.cHash;
    }
}
