package com.dianping.shield.dynamic.model.view;

import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/dianping/shield/dynamic/model/view/GridItemInfo;", "", "()V", DMKeys.KEY_GRID_COLUMN_SPAN, "", "getColSpan", "()Ljava/lang/Integer;", "setColSpan", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DMKeys.KEY_GRID_COLUMN_START, "getColStart", "setColStart", DMKeys.KEY_GRID_AREA_TAG, "", "getGridAreaTag", "()Ljava/lang/String;", "setGridAreaTag", "(Ljava/lang/String;)V", DMKeys.KEY_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", DMKeys.KEY_GRID_ROW_SPAN, "getRowSpan", "setRowSpan", DMKeys.KEY_GRID_ROW_START, "getRowStart", "setRowStart", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class GridItemInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Integer colSpan;
    @Nullable
    private Integer colStart;
    @Nullable
    private String gridAreaTag;
    @Nullable
    private MarginInfo marginInfo;
    @Nullable
    private Integer rowSpan;
    @Nullable
    private Integer rowStart;

    @Nullable
    public final Integer getRowStart() {
        return this.rowStart;
    }

    public final void setRowStart(@Nullable Integer num) {
        this.rowStart = num;
    }

    @Nullable
    public final Integer getColStart() {
        return this.colStart;
    }

    public final void setColStart(@Nullable Integer num) {
        this.colStart = num;
    }

    @Nullable
    public final Integer getRowSpan() {
        return this.rowSpan;
    }

    public final void setRowSpan(@Nullable Integer num) {
        this.rowSpan = num;
    }

    @Nullable
    public final Integer getColSpan() {
        return this.colSpan;
    }

    public final void setColSpan(@Nullable Integer num) {
        this.colSpan = num;
    }

    @Nullable
    public final String getGridAreaTag() {
        return this.gridAreaTag;
    }

    public final void setGridAreaTag(@Nullable String str) {
        this.gridAreaTag = str;
    }

    @Nullable
    public final MarginInfo getMarginInfo() {
        return this.marginInfo;
    }

    public final void setMarginInfo(@Nullable MarginInfo marginInfo) {
        this.marginInfo = marginInfo;
    }
}
