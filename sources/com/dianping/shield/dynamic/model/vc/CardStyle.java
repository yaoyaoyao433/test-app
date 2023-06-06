package com.dianping.shield.dynamic.model.vc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CardStyle {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String backgroundColor;
    public String borderColor;
    public int borderWidth;
    public int cornerRadius;
    public int marginLeft;
    public int marginRight;

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64c37e65dd63a4eee4f68ba58805a8d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64c37e65dd63a4eee4f68ba58805a8d4")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CardStyle cardStyle = (CardStyle) obj;
        return this.cornerRadius == cardStyle.cornerRadius && this.marginLeft == cardStyle.marginLeft && this.marginRight == cardStyle.marginRight && this.borderWidth == cardStyle.borderWidth && Objects.equals(this.backgroundColor, cardStyle.backgroundColor) && Objects.equals(this.borderColor, cardStyle.borderColor);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09bcab420d9c9401d3da5b8923f295d8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09bcab420d9c9401d3da5b8923f295d8")).intValue() : Objects.hash(Integer.valueOf(this.cornerRadius), this.backgroundColor, Integer.valueOf(this.marginLeft), Integer.valueOf(this.marginRight), Integer.valueOf(this.borderWidth), this.borderColor);
    }
}
