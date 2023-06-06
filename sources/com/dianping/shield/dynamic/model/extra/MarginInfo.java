package com.dianping.shield.dynamic.model.extra;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "", "()V", DMKeys.KEY_MARGIN_BOTTOM_MARGIN, "", "getBottomMargin", "()Ljava/lang/Integer;", "setBottomMargin", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "leftMargin", "getLeftMargin", "setLeftMargin", "rightMargin", "getRightMargin", "setRightMargin", DMKeys.KEY_MARGIN_TOP_MARGIN, "getTopMargin", "setTopMargin", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class MarginInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Integer bottomMargin;
    @Nullable
    private Integer leftMargin;
    @Nullable
    private Integer rightMargin;
    @Nullable
    private Integer topMargin;

    @Nullable
    public final Integer getLeftMargin() {
        return this.leftMargin;
    }

    public final void setLeftMargin(@Nullable Integer num) {
        this.leftMargin = num;
    }

    @Nullable
    public final Integer getRightMargin() {
        return this.rightMargin;
    }

    public final void setRightMargin(@Nullable Integer num) {
        this.rightMargin = num;
    }

    @Nullable
    public final Integer getTopMargin() {
        return this.topMargin;
    }

    public final void setTopMargin(@Nullable Integer num) {
        this.topMargin = num;
    }

    @Nullable
    public final Integer getBottomMargin() {
        return this.bottomMargin;
    }

    public final void setBottomMargin(@Nullable Integer num) {
        this.bottomMargin = num;
    }
}
