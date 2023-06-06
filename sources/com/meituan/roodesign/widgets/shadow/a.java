package com.meituan.roodesign.widgets.shadow;

import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.v4.graphics.ColorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final int[] h = new int[3];
    public static final float[] i = {0.0f, 0.5f, 1.0f};
    public static final int[] j = new int[4];
    public static final float[] k = {0.0f, 0.0f, 0.5f, 1.0f};
    @NonNull
    public final Paint b;
    @NonNull
    public final Paint c;
    @NonNull
    public final Paint d;
    public int e;
    public int f;
    public int g;
    public final Path l;

    public a() {
        this(-16777216);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37505236e4275e6c513e61e4e1fbaf7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37505236e4275e6c513e61e4e1fbaf7e");
        }
    }

    private a(int i2) {
        Object[] objArr = {-16777216};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe15af42faca2dd595afbb146380fdb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe15af42faca2dd595afbb146380fdb6");
            return;
        }
        this.l = new Path();
        a(-16777216);
        this.c = new Paint(4);
        this.c.setStyle(Paint.Style.FILL);
        this.b = new Paint();
        this.b.setColor(this.e);
        this.d = new Paint(this.c);
    }

    public final void a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "213c9c54598abe9ee4be00b8fbc98dec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "213c9c54598abe9ee4be00b8fbc98dec");
            return;
        }
        this.e = ColorUtils.setAlphaComponent(i2, 68);
        this.f = ColorUtils.setAlphaComponent(i2, 20);
        this.g = ColorUtils.setAlphaComponent(i2, 0);
    }
}
