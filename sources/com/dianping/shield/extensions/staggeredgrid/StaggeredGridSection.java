package com.dianping.shield.extensions.staggeredgrid;

import com.dianping.shield.node.cellnode.ShieldSection;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006 "}, d2 = {"Lcom/dianping/shield/extensions/staggeredgrid/StaggeredGridSection;", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "()V", "backgroundColor", "", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "spanCount", "getSpanCount", "setSpanCount", "staggeredGridBottomPadding", "getStaggeredGridBottomPadding", "setStaggeredGridBottomPadding", "staggeredGridLeftMargin", "getStaggeredGridLeftMargin", "setStaggeredGridLeftMargin", "staggeredGridRightMargin", "getStaggeredGridRightMargin", "setStaggeredGridRightMargin", "staggeredGridTopPadding", "getStaggeredGridTopPadding", "setStaggeredGridTopPadding", "xStaggeredGridGap", "getXStaggeredGridGap", "setXStaggeredGridGap", "yStaggeredGridGap", "getYStaggeredGridGap", "setYStaggeredGridGap", KNBConfig.CONFIG_CLEAR_CACHE, "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class StaggeredGridSection extends ShieldSection {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int backgroundColor;
    private int spanCount;
    private int staggeredGridBottomPadding;
    private int staggeredGridLeftMargin;
    private int staggeredGridRightMargin;
    private int staggeredGridTopPadding;
    private int xStaggeredGridGap;
    private int yStaggeredGridGap;

    public StaggeredGridSection() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0773893cd956708ad72f6dddee376200", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0773893cd956708ad72f6dddee376200");
        } else {
            this.spanCount = 2;
        }
    }

    public final int getSpanCount() {
        return this.spanCount;
    }

    public final void setSpanCount(int i) {
        this.spanCount = i;
    }

    public final int getXStaggeredGridGap() {
        return this.xStaggeredGridGap;
    }

    public final void setXStaggeredGridGap(int i) {
        this.xStaggeredGridGap = i;
    }

    public final int getYStaggeredGridGap() {
        return this.yStaggeredGridGap;
    }

    public final void setYStaggeredGridGap(int i) {
        this.yStaggeredGridGap = i;
    }

    public final int getStaggeredGridLeftMargin() {
        return this.staggeredGridLeftMargin;
    }

    public final void setStaggeredGridLeftMargin(int i) {
        this.staggeredGridLeftMargin = i;
    }

    public final int getStaggeredGridRightMargin() {
        return this.staggeredGridRightMargin;
    }

    public final void setStaggeredGridRightMargin(int i) {
        this.staggeredGridRightMargin = i;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final int getStaggeredGridTopPadding() {
        return this.staggeredGridTopPadding;
    }

    public final void setStaggeredGridTopPadding(int i) {
        this.staggeredGridTopPadding = i;
    }

    public final int getStaggeredGridBottomPadding() {
        return this.staggeredGridBottomPadding;
    }

    public final void setStaggeredGridBottomPadding(int i) {
        this.staggeredGridBottomPadding = i;
    }

    @Override // com.dianping.shield.node.cellnode.ShieldSection
    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "485a80d776e5dc1067e7599b14a7915b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "485a80d776e5dc1067e7599b14a7915b");
            return;
        }
        super.clear();
        this.spanCount = 2;
        this.xStaggeredGridGap = 0;
        this.yStaggeredGridGap = 0;
        this.staggeredGridLeftMargin = 0;
        this.staggeredGridRightMargin = 0;
        this.backgroundColor = 0;
        this.staggeredGridTopPadding = 0;
        this.staggeredGridBottomPadding = 0;
    }
}
