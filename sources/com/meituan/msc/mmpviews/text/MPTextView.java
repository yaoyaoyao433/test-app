package com.meituan.msc.mmpviews.text;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.mmpviews.shell.e;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.x;
import com.meituan.msc.views.precreate.c;
import com.meituan.msc.views.text.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MPTextView extends FrameLayout implements com.meituan.msc.mmpviews.shell.a, x {
    public static ChangeQuickRedirect a;
    private static final ViewGroup.LayoutParams d = new FrameLayout.LayoutParams(0, 0);
    private int A;
    private final e B;
    public boolean b;
    public boolean c;
    private int e;
    private int f;
    private TextUtils.TruncateAt g;
    private boolean h;
    private int i;
    private boolean j;
    private boolean k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private MPInlineBlockTextView s;
    private MPLeafTextView t;
    private a u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void setSpace(Dynamic dynamic) {
    }

    public MPTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06ab6e6b8ce36618db5a6abcba686bc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06ab6e6b8ce36618db5a6abcba686bc3");
            return;
        }
        this.f = Integer.MAX_VALUE;
        this.g = TextUtils.TruncateAt.END;
        this.h = false;
        this.i = 0;
        this.k = false;
        this.m = false;
        this.o = false;
        this.q = false;
        this.B = new e(this);
    }

    private String getHashCodeForLog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09403d8b6f5a97d102aa5ae9d294ad18", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09403d8b6f5a97d102aa5ae9d294ad18");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append("/");
        sb.append(this.u == null ? StringUtil.NULL : Integer.valueOf(this.u.hashCode()));
        sb.append("/");
        sb.append(this.t == null ? StringUtil.NULL : Integer.valueOf(this.t.hashCode()));
        return sb.toString();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59547749087f44f90172b2eaf3efe607", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59547749087f44f90172b2eaf3efe607");
            return;
        }
        this.v = i;
        this.w = i2;
        super.onMeasure(i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "889dbed37c02bbd05b86618b177411ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "889dbed37c02bbd05b86618b177411ce");
            return;
        }
        this.x = i;
        this.y = i2;
        this.z = i3;
        this.A = i4;
        super.onLayout(z, i, i2, i3, i4);
        this.c = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "821fa94b1db735cf218774d7ace24990", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "821fa94b1db735cf218774d7ace24990");
            return;
        }
        if (!this.c) {
            forceLayout();
            measure(this.v, this.w);
            layout(this.x, this.y, this.z, this.A);
        }
        super.onDraw(canvas);
        this.c = false;
    }

    public void setText(i iVar) {
        int i;
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5c9297e9e7adf744d30e161fa035441", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5c9297e9e7adf744d30e161fa035441");
            return;
        }
        if (getLayoutParams() == null) {
            setLayoutParams(d);
        }
        boolean z = iVar.b != null;
        if (this.b != z) {
            removeAllViews();
            this.b = z;
        }
        if (this.b) {
            this.u = iVar.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bcf4c40bd9914e637bc8b87c0d6ee48", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bcf4c40bd9914e637bc8b87c0d6ee48");
            } else {
                MPLeafTextView mPLeafTextView = this.u.A;
                if (mPLeafTextView != null) {
                    if (this.t != null) {
                        removeAllViews();
                    }
                    this.t = mPLeafTextView;
                    this.u.A = null;
                } else if (this.t == null) {
                    long nanoTime = System.nanoTime();
                    ThemedReactContext reactContext = getReactContext();
                    this.t = reactContext.getRuntimeDelegate().tryGetMPLeafTextView(reactContext);
                    c.p++;
                    c.G += System.nanoTime() - nanoTime;
                }
                this.t.setupTextInfo(this.u);
            }
        } else {
            this.u = null;
            setTextForInlineBlock(iVar);
        }
        TextView impl = getImpl();
        Object[] objArr3 = {impl, iVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c3168bae1c48c0f253b92d833f7f1386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c3168bae1c48c0f253b92d833f7f1386");
        } else {
            float f = iVar.e;
            float f2 = iVar.f;
            float f3 = iVar.g;
            float f4 = iVar.h;
            if (f != -1.0f && f4 != -1.0f && f3 != -1.0f && i != 0) {
                impl.setPadding((int) Math.floor(f), (int) Math.floor(f2), (int) Math.floor(f3), (int) Math.floor(f4));
            }
        }
        Object[] objArr4 = {impl};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9df3c592435a5b772436dfebe1b42b39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9df3c592435a5b772436dfebe1b42b39");
        } else {
            if (this.k) {
                impl.setId(this.l);
            }
            if (this.m) {
                impl.setTextIsSelectable(this.n);
            }
            if (this.o) {
                impl.setIncludeFontPadding(this.p);
            }
            if (this.q) {
                impl.setHighlightColor(this.r);
            }
        }
        if (getChildCount() == 0) {
            addView(impl, new FrameLayout.LayoutParams(-1, -1));
        }
        this.c = false;
        requestLayout();
    }

    @Override // android.view.View
    public void setId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71e1ca612c426410fb0657e2049e8eb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71e1ca612c426410fb0657e2049e8eb6");
            return;
        }
        super.setId(i);
        this.k = true;
        this.l = i;
    }

    private void setTextForInlineBlock(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df86d21ba777dd0b576464fe80f9c3cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df86d21ba777dd0b576464fe80f9c3cf");
            return;
        }
        if (this.s == null) {
            long nanoTime = System.nanoTime();
            ThemedReactContext reactContext = getReactContext();
            this.s = reactContext.getRuntimeDelegate().tryGetMPInlineBlockTextView(reactContext);
            c.r++;
            c.H += System.nanoTime() - nanoTime;
        }
        this.s.setTextUpdate(iVar);
        this.s.setNotifyOnInlineViewLayout(this.j);
        this.s.setLinkifyMask(this.i);
        this.s.setGravityVertical(this.e);
        this.s.setSingleLine(this.f == 1);
        this.s.setMaxLines(this.f);
        this.s.setEllipsize((this.f == Integer.MAX_VALUE || this.h) ? null : this.g);
    }

    public void setGravityVertical(int i) {
        this.e = i;
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.f = i;
    }

    public void setAdjustFontSizeToFit(boolean z) {
        this.h = z;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.g = truncateAt;
    }

    public void setNotifyOnInlineViewLayout(boolean z) {
        this.j = z;
    }

    public void setLinkifyMask(int i) {
        this.i = i;
    }

    @Override // com.meituan.msc.mmpviews.shell.a
    public e getDelegate() {
        return this.B;
    }

    public void setTextIsSelectable(boolean z) {
        this.m = true;
        this.n = z;
    }

    public TextView getImpl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2335db9fb062d140e9e130957db15f40", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2335db9fb062d140e9e130957db15f40");
        }
        if (this.b) {
            return this.t;
        }
        if (this.s == null) {
            long nanoTime = System.nanoTime();
            ThemedReactContext reactContext = getReactContext();
            this.s = reactContext.getRuntimeDelegate().tryGetMPInlineBlockTextView(reactContext);
            c.r++;
            c.H += System.nanoTime() - nanoTime;
        }
        return this.s;
    }

    @Override // com.meituan.msc.uimanager.x
    public final int a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4756dcfcc3e948fcbb62e5fd8f3f1383", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4756dcfcc3e948fcbb62e5fd8f3f1383")).intValue() : this.b ? getId() : this.s.a(f, f2);
    }

    public void setIncludeFontPadding(boolean z) {
        this.o = true;
        this.o = z;
    }

    public void setHighlightColor(int i) {
        this.q = true;
        this.r = i;
    }

    private ThemedReactContext getReactContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac3942189179f48a3a2d79f806142d0d", RobustBitConfig.DEFAULT_VALUE) ? (ThemedReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac3942189179f48a3a2d79f806142d0d") : (ThemedReactContext) getContext();
    }
}
