package com.meituan.roodesign.widgets.rooswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.internal.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooSwitch extends SwitchCompat {
    public static ChangeQuickRedirect a;
    private static final int[][] b = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @Nullable
    private ColorStateList c;

    public RooSwitch(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd8e0bc16d1b6459f20ac791d4c07bf7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd8e0bc16d1b6459f20ac791d4c07bf7");
        }
    }

    public RooSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.rooSwitchStyle);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82ad8cc1bd8bfd189931f498a97088e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82ad8cc1bd8bfd189931f498a97088e9");
        }
    }

    public RooSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "016b57a03515e5eef6b818d46e96e34d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "016b57a03515e5eef6b818d46e96e34d");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e606e10ff18cbc7c958d248f8647272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e606e10ff18cbc7c958d248f8647272");
            return;
        }
        super.onAttachedToWindow();
        if (getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2ebc6da2ea4aabb613a535672f1a768", RobustBitConfig.DEFAULT_VALUE)) {
            return (ColorStateList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2ebc6da2ea4aabb613a535672f1a768");
        }
        if (this.c == null) {
            int[] iArr = new int[b.length];
            int a2 = b.a(this, (int) R.attr.colorSurface);
            int a3 = b.a(this, (int) R.attr.colorControlActivated);
            int a4 = b.a(this, (int) R.attr.rooGray);
            iArr[0] = b.a(a2, a3, 1.0f);
            iArr[1] = b.a(a2, a4, 1.0f);
            iArr[2] = b.a(a2, a3, 0.5f);
            iArr[3] = b.a(a2, a4, 0.5f);
            this.c = new ColorStateList(b, iArr);
        }
        return this.c;
    }
}
