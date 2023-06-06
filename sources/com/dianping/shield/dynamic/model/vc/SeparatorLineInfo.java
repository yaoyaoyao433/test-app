package com.dianping.shield.dynamic.model.vc;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/dianping/shield/dynamic/model/vc/SeparatorLineInfo;", "", "()V", "bottomLineColor", "", "getBottomLineColor", "()Ljava/lang/String;", "setBottomLineColor", "(Ljava/lang/String;)V", "leftSeparatorMargin", "", "getLeftSeparatorMargin", "()Ljava/lang/Integer;", "setLeftSeparatorMargin", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "middleLineColor", "getMiddleLineColor", "setMiddleLineColor", "rightSeparatorMargin", "getRightSeparatorMargin", "setRightSeparatorMargin", "topLineColor", "getTopLineColor", "setTopLineColor", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class SeparatorLineInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String bottomLineColor;
    @Nullable
    private Integer leftSeparatorMargin;
    @Nullable
    private String middleLineColor;
    @Nullable
    private Integer rightSeparatorMargin;
    @Nullable
    private String topLineColor;

    @Nullable
    public final String getMiddleLineColor() {
        return this.middleLineColor;
    }

    public final void setMiddleLineColor(@Nullable String str) {
        this.middleLineColor = str;
    }

    @Nullable
    public final String getTopLineColor() {
        return this.topLineColor;
    }

    public final void setTopLineColor(@Nullable String str) {
        this.topLineColor = str;
    }

    @Nullable
    public final String getBottomLineColor() {
        return this.bottomLineColor;
    }

    public final void setBottomLineColor(@Nullable String str) {
        this.bottomLineColor = str;
    }

    @Nullable
    public final Integer getLeftSeparatorMargin() {
        return this.leftSeparatorMargin;
    }

    public final void setLeftSeparatorMargin(@Nullable Integer num) {
        this.leftSeparatorMargin = num;
    }

    @Nullable
    public final Integer getRightSeparatorMargin() {
        return this.rightSeparatorMargin;
    }

    public final void setRightSeparatorMargin(@Nullable Integer num) {
        this.rightSeparatorMargin = num;
    }
}
