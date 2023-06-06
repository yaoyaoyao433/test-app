package com.dianping.shield.node.useritem;

import android.graphics.drawable.Drawable;
import com.dianping.agentsdk.framework.g;
import com.dianping.agentsdk.framework.z;
import com.dianping.shield.node.adapter.animator.AnimationType;
import com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider;
import com.dianping.shield.node.useritem.DividerStyle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SectionItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static AtomicLong sectionItemId = new AtomicLong();
    public g backgroundViewInfo;
    public AnimationType deleteAnimationType;
    public DividerStyle.ShowType dividerShowType;
    public DividerStyle dividerStyle;
    public boolean enableLayoutAnimation;
    public RowItem footerRowItem;
    public RowItem headerRowItem;
    public AnimationType insertAnimationType;
    public boolean isLazyLoad;
    public LazyLoadRowItemProvider lazyLoadRowItemProvider;
    public z.a nextLinkType;
    public z.b previousLinkType;
    public int rowCount;
    public ArrayList<RowItem> rowItems;
    private int sHash;
    private String sId;
    public Drawable sectionFooterGapDrawable;
    public int sectionFooterGapHeight;
    public Drawable sectionHeaderGapDrawable;
    public int sectionHeaderGapHeight;
    public Integer sectionIndex;
    public String sectionTitle;
    public boolean showDivider;

    public SectionItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39e4d52e39750cbac57d2f82391b57fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39e4d52e39750cbac57d2f82391b57fe");
            return;
        }
        this.sectionHeaderGapHeight = -1;
        this.sectionFooterGapHeight = -1;
        this.dividerShowType = DividerStyle.ShowType.ALL;
        this.isLazyLoad = false;
        this.rowCount = 0;
        this.sectionIndex = -1;
        this.enableLayoutAnimation = false;
        this.insertAnimationType = null;
        this.deleteAnimationType = null;
        this.sId = "sId_" + sectionItemId.getAndIncrement();
        this.sHash = this.sId.hashCode();
    }

    public SectionItem(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3b0def349da71e04de3732c19c26418", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3b0def349da71e04de3732c19c26418");
            return;
        }
        this.sectionHeaderGapHeight = -1;
        this.sectionFooterGapHeight = -1;
        this.dividerShowType = DividerStyle.ShowType.ALL;
        this.isLazyLoad = false;
        this.rowCount = 0;
        this.sectionIndex = -1;
        this.enableLayoutAnimation = false;
        this.insertAnimationType = null;
        this.deleteAnimationType = null;
        if (str != null) {
            this.sId = str;
        } else {
            this.sId = "sId_" + sectionItemId.getAndIncrement();
        }
        this.sHash = this.sId.hashCode();
    }

    public SectionItem addRowItem(RowItem rowItem) {
        Object[] objArr = {rowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4155ff6bc4c66542c3e741b1e7154103", RobustBitConfig.DEFAULT_VALUE)) {
            return (SectionItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4155ff6bc4c66542c3e741b1e7154103");
        }
        if (this.rowItems == null) {
            this.rowItems = new ArrayList<>();
        }
        rowItem.rowIndex = Integer.valueOf(this.rowItems.size());
        this.rowItems.add(rowItem);
        return this;
    }

    public SectionItem addRowItemWithoutIndex(RowItem rowItem) {
        Object[] objArr = {rowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9805a26d257c276eda96d8e85b7aa1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (SectionItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9805a26d257c276eda96d8e85b7aa1e");
        }
        if (this.rowItems == null) {
            this.rowItems = new ArrayList<>();
        }
        this.rowItems.add(rowItem);
        return this;
    }

    public SectionItem setHeaderRowItem(RowItem rowItem) {
        Object[] objArr = {rowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dc561d7d6116d68576d5555b6d526cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (SectionItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dc561d7d6116d68576d5555b6d526cd");
        }
        rowItem.rowIndex = -1;
        this.headerRowItem = rowItem;
        return this;
    }

    public SectionItem setFooterRowItem(RowItem rowItem) {
        Object[] objArr = {rowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0a71752e0fdc70c94ad93bbe945acf5", RobustBitConfig.DEFAULT_VALUE)) {
            return (SectionItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0a71752e0fdc70c94ad93bbe945acf5");
        }
        rowItem.rowIndex = -2;
        this.footerRowItem = rowItem;
        return this;
    }

    public SectionItem setShowDivider(boolean z) {
        this.showDivider = z;
        return this;
    }

    public SectionItem setSectionTitle(String str) {
        this.sectionTitle = str;
        return this;
    }

    public SectionItem setPreviousLinkType(z.b bVar) {
        this.previousLinkType = bVar;
        return this;
    }

    public SectionItem setNextLinkType(z.a aVar) {
        this.nextLinkType = aVar;
        return this;
    }

    public SectionItem setSectionHeaderGapHeight(int i) {
        this.sectionHeaderGapHeight = i;
        return this;
    }

    public SectionItem setSectionHeaderGapDrawable(Drawable drawable) {
        this.sectionHeaderGapDrawable = drawable;
        return this;
    }

    public SectionItem setSectionFooterGapHeight(int i) {
        this.sectionFooterGapHeight = i;
        return this;
    }

    public SectionItem setSectionFooterGapDrawable(Drawable drawable) {
        this.sectionFooterGapDrawable = drawable;
        return this;
    }

    public SectionItem setDividerShowType(DividerStyle.ShowType showType) {
        this.dividerShowType = showType;
        return this;
    }

    public SectionItem setDividerStyle(DividerStyle dividerStyle) {
        this.dividerStyle = dividerStyle;
        return this;
    }

    public SectionItem setLazyLoad(boolean z) {
        this.isLazyLoad = z;
        return this;
    }

    public SectionItem setRowCount(int i) {
        this.rowCount = i;
        return this;
    }

    public SectionItem setLazyLoadRowItemProvider(LazyLoadRowItemProvider lazyLoadRowItemProvider) {
        this.lazyLoadRowItemProvider = lazyLoadRowItemProvider;
        return this;
    }

    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c5ade13163c74c9a8edb14ecfe90250", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c5ade13163c74c9a8edb14ecfe90250");
            return;
        }
        if (this.rowItems != null) {
            this.rowItems.clear();
        }
        this.headerRowItem = null;
        this.footerRowItem = null;
        this.showDivider = false;
        this.sectionTitle = null;
        this.previousLinkType = null;
        this.nextLinkType = null;
        this.sectionHeaderGapHeight = -1;
        this.sectionHeaderGapDrawable = null;
        this.sectionFooterGapHeight = -1;
        this.sectionFooterGapDrawable = null;
        this.dividerShowType = DividerStyle.ShowType.ALL;
        this.dividerStyle = null;
        this.enableLayoutAnimation = false;
        this.insertAnimationType = null;
        this.deleteAnimationType = null;
        this.backgroundViewInfo = null;
        this.isLazyLoad = false;
        this.rowCount = 0;
        this.lazyLoadRowItemProvider = null;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20ffe00bd579cd8e2f01256c79837f4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20ffe00bd579cd8e2f01256c79837f4f")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SectionItem sectionItem = (SectionItem) obj;
        return this.sId != null ? this.sId.equals(sectionItem.sId) : sectionItem.sId == null;
    }

    public int hashCode() {
        return this.sHash;
    }
}
