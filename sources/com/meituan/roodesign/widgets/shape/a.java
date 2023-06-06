package com.meituan.roodesign.widgets.shape;

import android.graphics.RectF;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;
    private final float b;

    public a(float f) {
        Object[] objArr = {Float.valueOf(0.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6d98dc818cbfd000d94aaf6ad6dc115", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6d98dc818cbfd000d94aaf6ad6dc115");
        } else {
            this.b = 0.0f;
        }
    }

    @Override // com.meituan.roodesign.widgets.shape.c
    public final float a(@NonNull RectF rectF) {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764e6bebe14677a58b6d5e11ac80f26b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764e6bebe14677a58b6d5e11ac80f26b")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.b == ((a) obj).b;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d63d725c836db99b6e671f62afbf3a45", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d63d725c836db99b6e671f62afbf3a45")).intValue() : Arrays.hashCode(new Object[]{Float.valueOf(this.b)});
    }
}
