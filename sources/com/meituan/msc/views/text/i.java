package com.meituan.msc.views.text;

import android.support.annotation.Nullable;
import android.text.Spannable;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public final com.meituan.msc.mmpviews.text.a b;
    public final Spannable c;
    public final boolean d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    @Nullable
    public ReadableMap l;
    private final int m;
    private final int n;
    private final int o;

    public i(com.meituan.msc.mmpviews.text.a aVar, Spannable spannable, int i, boolean z, float f, float f2, float f3, float f4, int i2, int i3, int i4) {
        this(aVar, spannable, -1, z, f, f2, f3, f4, i2, i3, i4, -1, -1);
        Object[] objArr = {aVar, spannable, -1, Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f031be018ac16f3a4faad7afd1bb4a07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f031be018ac16f3a4faad7afd1bb4a07");
        }
    }

    public i(com.meituan.msc.mmpviews.text.a aVar, Spannable spannable, int i, boolean z, int i2, int i3, int i4) {
        this(aVar, spannable, i, false, -1.0f, -1.0f, -1.0f, -1.0f, i2, i3, i4, -1, -1);
        Object[] objArr = {aVar, spannable, Integer.valueOf(i), (byte) 0, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fbe476c4a1024633538a5f82c0acecb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fbe476c4a1024633538a5f82c0acecb");
        }
    }

    private i(com.meituan.msc.mmpviews.text.a aVar, Spannable spannable, int i, boolean z, float f, float f2, float f3, float f4, int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {aVar, spannable, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), -1, -1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccb358548077121ff669bd7a0f5a85a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccb358548077121ff669bd7a0f5a85a5");
            return;
        }
        this.l = null;
        this.b = aVar;
        this.c = spannable;
        this.m = i;
        this.d = z;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = i2;
        this.j = i3;
        this.n = -1;
        this.o = -1;
        this.k = i4;
    }
}
