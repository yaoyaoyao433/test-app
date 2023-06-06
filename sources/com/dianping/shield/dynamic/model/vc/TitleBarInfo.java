package com.dianping.shield.dynamic.model.vc;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/dynamic/model/vc/TitleBarInfo;", "", "()V", DMKeys.KEY_TITLE_BAR_BAR_ALPHA_THRESHOLD, "", "getBarAlphaThreshold", "()Ljava/lang/Integer;", "setBarAlphaThreshold", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DMKeys.KEY_TITLE_BAR_BAR_COLOR, "", "getBarColor", "()Ljava/lang/String;", "setBarColor", "(Ljava/lang/String;)V", "style", "getStyle", "setStyle", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class TitleBarInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Integer barAlphaThreshold;
    @Nullable
    private String barColor;
    @Nullable
    private Integer style;

    @Nullable
    public final Integer getStyle() {
        return this.style;
    }

    public final void setStyle(@Nullable Integer num) {
        this.style = num;
    }

    @Nullable
    public final String getBarColor() {
        return this.barColor;
    }

    public final void setBarColor(@Nullable String str) {
        this.barColor = str;
    }

    @Nullable
    public final Integer getBarAlphaThreshold() {
        return this.barAlphaThreshold;
    }

    public final void setBarAlphaThreshold(@Nullable Integer num) {
        this.barAlphaThreshold = num;
    }
}
