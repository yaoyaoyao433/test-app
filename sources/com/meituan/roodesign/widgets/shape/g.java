package com.meituan.roodesign.widgets.shape;

import android.graphics.RectF;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g implements c {
    public static ChangeQuickRedirect a;
    private final float b;

    public g(float f) {
        Object[] objArr = {Float.valueOf(0.5f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c8121639410e70a3242ff3e2adbbf75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c8121639410e70a3242ff3e2adbbf75");
        } else {
            this.b = 0.5f;
        }
    }

    @Override // com.meituan.roodesign.widgets.shape.c
    public final float a(@NonNull RectF rectF) {
        Object[] objArr = {rectF};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "093ee1332283f12a33300336bef4e360", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "093ee1332283f12a33300336bef4e360")).floatValue() : this.b * rectF.height();
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3f2bfb834b37c09e64eb235f2786a06", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3f2bfb834b37c09e64eb235f2786a06")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.b == ((g) obj).b;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "754f872aefd6d48cdcb9b2082f694a90", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "754f872aefd6d48cdcb9b2082f694a90")).intValue() : Arrays.hashCode(new Object[]{Float.valueOf(this.b)});
    }
}
