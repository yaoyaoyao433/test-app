package com.dianping.shield.node.useritem;

import com.dianping.shield.node.cellnode.CardConfigInfo;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.itemcallbacks.lazy.LazyLoadViewItemProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class RowItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static AtomicLong rowItemId = new AtomicLong();
    public BottomInfo bottomInfo;
    public CardConfigInfo cardConfigInfo;
    public DividerStyle dividerStyle;
    public ArrayList<ExposeInfo> exposeInfoArray;
    public FloatViewItem floatViewItem;
    public boolean frozenExclude;
    public ArrayList<HotZoneInfo> hotZoneArrayList;
    public boolean isLazyLoad;
    public LayoutType layoutType;
    public LazyLoadViewItemProvider lazyLoadViewItemProvider;
    public MoveStatusInfo moveStatusInfo;
    private int rHash;
    private String rId;
    public Integer rowIndex;
    public boolean showCellBottomDivider;
    public boolean showCellTopDivider;
    public TopInfo topInfo;
    public int viewCount;
    public ArrayList<ViewItem> viewItems;

    public RowItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7448e8f7ab3d4886864b333cf492266c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7448e8f7ab3d4886864b333cf492266c");
            return;
        }
        this.layoutType = LayoutType.LINEAR_FULL_FILL;
        this.topInfo = null;
        this.bottomInfo = null;
        this.showCellTopDivider = true;
        this.showCellBottomDivider = true;
        this.isLazyLoad = false;
        this.viewCount = 0;
        this.rowIndex = -3;
        this.rId = "rId_" + rowItemId.getAndIncrement();
        this.rHash = this.rId.hashCode();
    }

    public RowItem(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f18b4bd47a45a8b4690224384b7fa116", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f18b4bd47a45a8b4690224384b7fa116");
            return;
        }
        this.layoutType = LayoutType.LINEAR_FULL_FILL;
        this.topInfo = null;
        this.bottomInfo = null;
        this.showCellTopDivider = true;
        this.showCellBottomDivider = true;
        this.isLazyLoad = false;
        this.viewCount = 0;
        this.rowIndex = -3;
        if (str != null) {
            this.rId = str;
        } else {
            this.rId = "rId_" + rowItemId.getAndIncrement();
        }
        this.rHash = this.rId.hashCode();
    }

    public static RowItem createNormalRow(ViewPaintingCallback viewPaintingCallback) {
        Object[] objArr = {viewPaintingCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c027a09a6d1808f409b5e2505c95122c", RobustBitConfig.DEFAULT_VALUE) ? (RowItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c027a09a6d1808f409b5e2505c95122c") : new RowItem().addViewItem(ViewItem.simpleViewItem(viewPaintingCallback));
    }

    public static RowItem createNormalRow(ViewPaintingCallback viewPaintingCallback, String str) {
        Object[] objArr = {viewPaintingCallback, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fc1d36d5a9956eead8c1e084eaa37f15", RobustBitConfig.DEFAULT_VALUE) ? (RowItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fc1d36d5a9956eead8c1e084eaa37f15") : new RowItem().addViewItem(ViewItem.simpleViewItem(viewPaintingCallback, str));
    }

    public static RowItem createNormalRow(ViewPaintingCallback viewPaintingCallback, String str, Object obj) {
        Object[] objArr = {viewPaintingCallback, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b0a4b6c29c4ba75133b1132af1f1ad15", RobustBitConfig.DEFAULT_VALUE) ? (RowItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b0a4b6c29c4ba75133b1132af1f1ad15") : new RowItem().addViewItem(ViewItem.simpleViewItem(viewPaintingCallback, str, obj));
    }

    public RowItem addViewItem(ViewItem viewItem) {
        Object[] objArr = {viewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4de2b08edc605b165ca3d745055ad4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (RowItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4de2b08edc605b165ca3d745055ad4f");
        }
        if (this.viewItems == null) {
            this.viewItems = new ArrayList<>();
        }
        viewItem.viewIndex = Integer.valueOf(this.viewItems.size());
        this.viewItems.add(viewItem);
        return this;
    }

    public RowItem addViewItemWithoutIndex(ViewItem viewItem) {
        Object[] objArr = {viewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "047a91a0126b04c4e525a8886d92a67b", RobustBitConfig.DEFAULT_VALUE)) {
            return (RowItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "047a91a0126b04c4e525a8886d92a67b");
        }
        if (this.viewItems == null) {
            this.viewItems = new ArrayList<>();
        }
        this.viewItems.add(viewItem);
        return this;
    }

    public RowItem setLayoutType(LayoutType layoutType) {
        this.layoutType = layoutType;
        return this;
    }

    public RowItem setTopInfo(TopInfo topInfo) {
        this.topInfo = topInfo;
        return this;
    }

    public RowItem setBottomInfo(BottomInfo bottomInfo) {
        this.bottomInfo = bottomInfo;
        return this;
    }

    public RowItem setShowCellTopDivider(boolean z) {
        this.showCellTopDivider = z;
        return this;
    }

    public RowItem setShowCellBottomDivider(boolean z) {
        this.showCellBottomDivider = z;
        return this;
    }

    public RowItem setDividerStyle(DividerStyle dividerStyle) {
        this.dividerStyle = dividerStyle;
        return this;
    }

    public RowItem setCardConfigInfo(CardConfigInfo cardConfigInfo) {
        this.cardConfigInfo = cardConfigInfo;
        return this;
    }

    public RowItem setLazyLoad(boolean z) {
        this.isLazyLoad = z;
        return this;
    }

    public RowItem setViewCount(int i) {
        this.viewCount = i;
        return this;
    }

    public RowItem setLazyLoadViewItemProvider(LazyLoadViewItemProvider lazyLoadViewItemProvider) {
        this.lazyLoadViewItemProvider = lazyLoadViewItemProvider;
        return this;
    }

    public RowItem addExposeInfo(ExposeInfo exposeInfo) {
        Object[] objArr = {exposeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e8a7cd2d90c1f173c580bc56d6375fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (RowItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e8a7cd2d90c1f173c580bc56d6375fc");
        }
        if (this.exposeInfoArray == null) {
            this.exposeInfoArray = new ArrayList<>();
        }
        this.exposeInfoArray.add(exposeInfo);
        return this;
    }

    public RowItem addHotZoneInfo(HotZoneInfo hotZoneInfo) {
        Object[] objArr = {hotZoneInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20146914cbc0fd0e8007eb6c3268cf7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (RowItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20146914cbc0fd0e8007eb6c3268cf7f");
        }
        if (this.hotZoneArrayList == null) {
            this.hotZoneArrayList = new ArrayList<>();
        }
        this.hotZoneArrayList.add(hotZoneInfo);
        return this;
    }

    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d930c1290f4e5718a098f0821be5791a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d930c1290f4e5718a098f0821be5791a");
            return;
        }
        if (this.viewItems != null) {
            this.viewItems.clear();
        }
        if (this.exposeInfoArray != null) {
            this.exposeInfoArray.clear();
        }
        this.topInfo = null;
        this.bottomInfo = null;
        this.moveStatusInfo = null;
        this.showCellTopDivider = true;
        this.showCellBottomDivider = true;
        this.floatViewItem = null;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "004ae9ac922f40119eadabc9a9bf02f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "004ae9ac922f40119eadabc9a9bf02f0")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RowItem rowItem = (RowItem) obj;
        return this.rId != null ? this.rId.equals(rowItem.rId) : rowItem.rId == null;
    }

    public int hashCode() {
        return this.rHash;
    }
}
