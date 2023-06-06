package com.meituan.roodesign.widgets.shape;

import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class b implements c {
    public static ChangeQuickRedirect a;
    private final c b;
    private final float c;

    public b(float f, @NonNull c cVar) {
        Object[] objArr = {Float.valueOf(f), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ef9c3ae9b8195a1db41f34e7d190c9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ef9c3ae9b8195a1db41f34e7d190c9c");
            return;
        }
        while (cVar instanceof b) {
            cVar = ((b) cVar).b;
            f += ((b) cVar).c;
        }
        this.b = cVar;
        this.c = f;
    }

    @Override // com.meituan.roodesign.widgets.shape.c
    public final float a(@NonNull RectF rectF) {
        Object[] objArr = {rectF};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28199fa6cff227bb7755c115cf788d3c", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28199fa6cff227bb7755c115cf788d3c")).floatValue() : Math.max(0.0f, this.b.a(rectF) + this.c);
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dd9a6b63b3bec7c74da769ba3838187", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dd9a6b63b3bec7c74da769ba3838187")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.b.equals(bVar.b) && this.c == bVar.c;
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8ba290d8cc0e71648410df1984ece46", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8ba290d8cc0e71648410df1984ece46")).intValue() : Arrays.hashCode(new Object[]{this.b, Float.valueOf(this.c)});
    }
}
