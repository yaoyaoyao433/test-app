package com.meituan.roodesign.widgets.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.annotation.FontRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public final float b;
    @Nullable
    public final ColorStateList c;
    @Nullable
    public final ColorStateList d;
    @Nullable
    public final ColorStateList e;
    public final int f;
    public final int g;
    @Nullable
    public final String h;
    public final boolean i;
    @Nullable
    public final ColorStateList j;
    public final float k;
    public final float l;
    public final float m;
    @FontRes
    private final int n;
    private boolean o;

    public c(@NonNull Context context, @StyleRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c250703c9c25393a875164e3835fb35d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c250703c9c25393a875164e3835fb35d");
            return;
        }
        this.o = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.textAllCaps, R.attr.fontFamily});
        this.b = obtainStyledAttributes.getDimension(0, 0.0f);
        this.c = b.a(context, obtainStyledAttributes, 3);
        this.d = b.a(context, obtainStyledAttributes, 4);
        this.e = b.a(context, obtainStyledAttributes, 5);
        this.f = obtainStyledAttributes.getInt(2, 0);
        this.g = obtainStyledAttributes.getInt(1, 1);
        int i2 = 12;
        Object[] objArr2 = {obtainStyledAttributes, 12, 10};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bf4b3b9057dd1fd8703fc8782e028de7", RobustBitConfig.DEFAULT_VALUE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bf4b3b9057dd1fd8703fc8782e028de7")).intValue();
        } else if (!obtainStyledAttributes.hasValue(12)) {
            i2 = 10;
        }
        this.n = obtainStyledAttributes.getResourceId(i2, 0);
        this.h = obtainStyledAttributes.getString(i2);
        this.i = obtainStyledAttributes.getBoolean(11, false);
        this.j = b.a(context, obtainStyledAttributes, 6);
        this.k = obtainStyledAttributes.getFloat(7, 0.0f);
        this.l = obtainStyledAttributes.getFloat(8, 0.0f);
        this.m = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
