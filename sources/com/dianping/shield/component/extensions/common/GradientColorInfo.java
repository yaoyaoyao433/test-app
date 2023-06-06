package com.dianping.shield.component.extensions.common;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/dianping/shield/component/extensions/common/GradientColorInfo;", "", "()V", DMKeys.KEY_GRADIENT_COLOR_INFO_END_COLOR, "", "getEndColor", "()Ljava/lang/Integer;", "setEndColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, "getOrientation", "setOrientation", DMKeys.KEY_GRADIENT_COLOR_INFO_START_COLOR, "getStartColor", "setStartColor", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class GradientColorInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Integer endColor;
    @Nullable
    private Integer orientation;
    @Nullable
    private Integer startColor;

    public GradientColorInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90c4dc2ea0af1333027fac2329d92923", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90c4dc2ea0af1333027fac2329d92923");
        } else {
            this.orientation = 0;
        }
    }

    @Nullable
    public final Integer getStartColor() {
        return this.startColor;
    }

    public final void setStartColor(@Nullable Integer num) {
        this.startColor = num;
    }

    @Nullable
    public final Integer getEndColor() {
        return this.endColor;
    }

    public final void setEndColor(@Nullable Integer num) {
        this.endColor = num;
    }

    @Nullable
    public final Integer getOrientation() {
        return this.orientation;
    }

    public final void setOrientation(@Nullable Integer num) {
        this.orientation = num;
    }
}
