package com.dianping.shield.component.extensions.gridsection;

import com.dianping.shield.component.extensions.common.CommonContainerRow;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0012\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/dianping/shield/component/extensions/gridsection/GridSectionShieldRow;", "Lcom/dianping/shield/component/extensions/common/CommonContainerRow;", "()V", DMKeys.KEY_MARGIN_BOTTOM_MARGIN, "", "getBottomMargin", "()I", "setBottomMargin", "(I)V", DMKeys.KEY_COLCOUNT, "getColCount", "setColCount", "itemWidth", "leftMargin", "recommendItemHeight", "rightMargin", DMKeys.KEY_MARGIN_TOP_MARGIN, "getTopMargin", "setTopMargin", DMKeys.KEY_XGAP, "getXGap", "setXGap", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class GridSectionShieldRow extends CommonContainerRow {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int bottomMargin;
    private int colCount;
    @JvmField
    public int itemWidth;
    @JvmField
    public int leftMargin;
    @JvmField
    public int recommendItemHeight;
    @JvmField
    public int rightMargin;
    private int topMargin;
    private int xGap;

    public final int getTopMargin() {
        return this.topMargin;
    }

    public final void setTopMargin(int i) {
        this.topMargin = i;
    }

    public final int getBottomMargin() {
        return this.bottomMargin;
    }

    public final void setBottomMargin(int i) {
        this.bottomMargin = i;
    }

    public final int getColCount() {
        return this.colCount;
    }

    public final void setColCount(int i) {
        this.colCount = i;
    }

    public final int getXGap() {
        return this.xGap;
    }

    public final void setXGap(int i) {
        this.xGap = i;
    }
}
