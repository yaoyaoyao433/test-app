package com.dianping.shield.extensions.staggeredgrid;

import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.node.useritem.DividerStyle;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class StaggeredGridSectionItem extends SectionItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int backgroundColor;
    public ArrayList<StaggerGridRowItem> lazyRowItems;
    public int spanCount;
    @Deprecated
    public int staggeredBottomMargin;
    public int staggeredBottomPadding;
    public int staggeredLeftMargin;
    public int staggeredRightMargin;
    @Deprecated
    public int staggeredTopMargin;
    public int staggeredTopPadding;
    public final ArrayList<ViewItem> viewItems;
    public int xStaggeredGridGap;
    public int yStaggeredGridGap;

    static {
        ExtensionsRegistry.INSTANCE.registerSectionExtension(StaggeredGridSectionItem.class, new StaggeredGridSectionExtension());
    }

    public StaggeredGridSectionItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b83a4abfe8b91da15ef85c873c8cddd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b83a4abfe8b91da15ef85c873c8cddd");
            return;
        }
        this.spanCount = 2;
        this.xStaggeredGridGap = 0;
        this.yStaggeredGridGap = 0;
        this.staggeredLeftMargin = 0;
        this.staggeredRightMargin = 0;
        this.staggeredTopMargin = 0;
        this.staggeredBottomMargin = 0;
        this.staggeredTopPadding = 0;
        this.staggeredBottomPadding = 0;
        this.backgroundColor = 0;
        this.viewItems = new ArrayList<>();
        this.dividerShowType = DividerStyle.ShowType.NONE;
    }

    public StaggeredGridSectionItem(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dd76f5b85f8a96f71c352604d2f0178", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dd76f5b85f8a96f71c352604d2f0178");
            return;
        }
        this.spanCount = 2;
        this.xStaggeredGridGap = 0;
        this.yStaggeredGridGap = 0;
        this.staggeredLeftMargin = 0;
        this.staggeredRightMargin = 0;
        this.staggeredTopMargin = 0;
        this.staggeredBottomMargin = 0;
        this.staggeredTopPadding = 0;
        this.staggeredBottomPadding = 0;
        this.backgroundColor = 0;
        this.viewItems = new ArrayList<>();
        this.dividerShowType = DividerStyle.ShowType.NONE;
    }

    public void addViewItem(ViewItem viewItem) {
        Object[] objArr = {viewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acdc21c152461499d9e0eec4803987ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acdc21c152461499d9e0eec4803987ef");
        } else if (viewItem == null) {
        } else {
            viewItem.viewIndex = Integer.valueOf(this.viewItems.size());
            this.viewItems.add(viewItem);
        }
    }

    @NotNull
    public StaggerGridRowItem getRowItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9352e1f4938066cf3dbffefde2faaff1", RobustBitConfig.DEFAULT_VALUE)) {
            return (StaggerGridRowItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9352e1f4938066cf3dbffefde2faaff1");
        }
        if (this.lazyRowItems != null && i < this.lazyRowItems.size()) {
            StaggerGridRowItem staggerGridRowItem = this.lazyRowItems.get(i);
            if (staggerGridRowItem != null) {
                staggerGridRowItem.clear();
                return staggerGridRowItem;
            }
            StaggerGridRowItem staggerGridRowItem2 = new StaggerGridRowItem();
            this.lazyRowItems.add(i, staggerGridRowItem2);
            return staggerGridRowItem2;
        }
        return new StaggerGridRowItem();
    }

    @Override // com.dianping.shield.node.useritem.SectionItem
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64b927c9dd95032a113d4a9f300f7ee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64b927c9dd95032a113d4a9f300f7ee2");
            return;
        }
        super.clear();
        this.spanCount = 2;
        this.xStaggeredGridGap = 0;
        this.yStaggeredGridGap = 0;
        this.staggeredLeftMargin = 0;
        this.staggeredRightMargin = 0;
        this.staggeredTopPadding = 0;
        this.staggeredBottomPadding = 0;
        this.backgroundColor = 0;
        this.dividerShowType = DividerStyle.ShowType.NONE;
        this.viewItems.clear();
    }
}
