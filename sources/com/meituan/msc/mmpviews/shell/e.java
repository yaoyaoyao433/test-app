package com.meituan.msc.mmpviews.shell;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.msc.uimanager.ah;
import com.meituan.msc.uimanager.q;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e {
    public static ChangeQuickRedirect a;
    protected final View b;
    @Nullable
    protected com.meituan.msc.mmpviews.shell.background.f c;
    ah d;
    ah e;
    protected int f;
    String g;
    com.meituan.msc.mmpviews.csstypes.a h;
    com.meituan.msc.mmpviews.csstypes.b i;
    com.meituan.msc.mmpviews.csstypes.c j;
    com.meituan.msc.mmpviews.shell.backdropfilter.a k;
    boolean l;
    private float m;
    private volatile int n;
    private volatile int o;
    private volatile float p;

    public e(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d51bc46dda83ce0189a5b2cde3bb8fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d51bc46dda83ce0189a5b2cde3bb8fa");
            return;
        }
        this.m = 1.0f;
        this.g = "visible";
        this.n = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.b = view;
    }

    public final void a(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a99b9971b064aea193f08c6158a653a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a99b9971b064aea193f08c6158a653a3");
            return;
        }
        canvas.save();
        canvas.translate(a(), b());
        Rect rect = new Rect();
        this.b.getDrawingRect(rect);
        rect.right -= c() + a();
        rect.bottom -= d() + b();
        canvas.clipRect(rect);
        canvas.scale(this.b.getWidth() > 0 ? e() / this.b.getWidth() : 1.0f, this.b.getHeight() > 0 ? f() / this.b.getHeight() : 1.0f);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a3f70a663a862a48b05133c03965214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a3f70a663a862a48b05133c03965214");
        } else if (i == 0 && this.c == null) {
        } else {
            com.meituan.msc.mmpviews.shell.background.f i2 = i();
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.shell.background.f.a;
            if (PatchProxy.isSupport(objArr2, i2, changeQuickRedirect2, false, "1aa4f3e2afda82e5beec29a245eca228", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, i2, changeQuickRedirect2, false, "1aa4f3e2afda82e5beec29a245eca228");
                return;
            }
            i2.i = i;
            i2.invalidateSelf();
        }
    }

    public final void a(ReadableMap readableMap) {
        Dynamic dynamic;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ca89dffaaeab723d8f2162eaa3c61af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ca89dffaaeab723d8f2162eaa3c61af");
            return;
        }
        Dynamic dynamic2 = readableMap.hasKey(Constants.GestureMoveEvent.KEY_Y) ? readableMap.getDynamic(Constants.GestureMoveEvent.KEY_Y) : null;
        if (dynamic2 != null && dynamic2.getType() == ReadableType.String && dynamic2.asString().endsWith("px")) {
            String asString = dynamic2.asString();
            float a2 = s.a(Float.parseFloat(asString.substring(0, asString.length() - 2)));
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.p == Float.MIN_VALUE) {
                    this.p = this.b.getElevation();
                }
                this.b.setElevation(a2);
            }
            if (Build.VERSION.SDK_INT < 28 || (dynamic = readableMap.getDynamic("color")) == null || dynamic.getType() != ReadableType.Number) {
                return;
            }
            int asInt = dynamic.asInt();
            if (this.n == Integer.MIN_VALUE) {
                this.n = this.b.getOutlineAmbientShadowColor();
            }
            if (this.o == Integer.MIN_VALUE) {
                this.o = this.b.getOutlineSpotShadowColor();
            }
            this.b.setOutlineAmbientShadowColor(asInt);
            this.b.setOutlineSpotShadowColor(asInt);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21 && this.p != Float.MIN_VALUE) {
            this.b.setElevation(this.p);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if (this.n != Integer.MIN_VALUE) {
                this.b.setOutlineAmbientShadowColor(this.n);
            }
            if (this.o != Integer.MIN_VALUE) {
                this.b.setOutlineSpotShadowColor(this.o);
            }
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8121fa24469718a22326909d4f3f7e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8121fa24469718a22326909d4f3f7e7");
            return;
        }
        com.meituan.msc.mmpviews.shell.background.f i = i();
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.shell.background.f.a;
        if (PatchProxy.isSupport(objArr2, i, changeQuickRedirect2, false, "802f12c1fa32ac2d89788374d4ada398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, i, changeQuickRedirect2, false, "802f12c1fa32ac2d89788374d4ada398");
        } else if (!q.a(i.g, f)) {
            i.g = f;
            i.f = true;
            i.invalidateSelf();
        }
        if (Build.VERSION.SDK_INT < 18) {
            int i2 = i.a() ? 1 : 2;
            if (i2 != this.b.getLayerType()) {
                this.b.setLayerType(i2, null);
            }
        }
    }

    public final void a(float f, int i) {
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb32c4a75535294ee04e1510906d815d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb32c4a75535294ee04e1510906d815d");
            return;
        }
        com.meituan.msc.mmpviews.shell.background.f i2 = i();
        Object[] objArr2 = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.shell.background.f.a;
        if (PatchProxy.isSupport(objArr2, i2, changeQuickRedirect2, false, "63ed0b1e7f4cf8f5deff929c6c5dfdef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, i2, changeQuickRedirect2, false, "63ed0b1e7f4cf8f5deff929c6c5dfdef");
        } else {
            if (i2.j == null) {
                i2.j = new float[8];
                Arrays.fill(i2.j, Float.NaN);
            }
            if (!q.a(i2.j[i], f)) {
                i2.j[i] = f;
                i2.f = true;
                i2.invalidateSelf();
            }
        }
        if (Build.VERSION.SDK_INT < 18) {
            int i3 = i2.a() ? 1 : 2;
            if (i3 != this.b.getLayerType()) {
                this.b.setLayerType(i3, null);
            }
        }
    }

    private void a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19543093134f09ebdce4267f27441909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19543093134f09ebdce4267f27441909");
        } else {
            this.b.setBackground(drawable);
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43ff1fc69012056eb7df5c24339439c4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43ff1fc69012056eb7df5c24339439c4")).intValue() : c(0);
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9248fe66ae27e2fa5439ea20c2743129", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9248fe66ae27e2fa5439ea20c2743129")).intValue() : c(1);
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b5e7a96948068eae77ebeae37b1399", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b5e7a96948068eae77ebeae37b1399")).intValue() : c(2);
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f95db394fd2df8c3c004104686cf170", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f95db394fd2df8c3c004104686cf170")).intValue() : c(3);
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6f3705903a97e8d0c373df94b039e4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6f3705903a97e8d0c373df94b039e4f")).intValue();
        }
        int width = this.b.getWidth();
        if (width <= 0) {
            return 0;
        }
        return (width - a()) - c();
    }

    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7a1949fb423184d36a577cd5d3b8f26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7a1949fb423184d36a577cd5d3b8f26")).intValue();
        }
        int height = this.b.getHeight();
        if (height <= 0) {
            return 0;
        }
        return (height - b()) - d();
    }

    private int c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7387268f1b5d2f46ed5fa062f05b2d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7387268f1b5d2f46ed5fa062f05b2d4")).intValue();
        }
        ah ahVar = i().b;
        return Math.round((this.d != null ? this.d.a(i) : 0.0f) + (ahVar != null ? ahVar.a(i) : 0.0f));
    }

    private float d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "728e7418fa6cd1ab3078cd67c3b54cd8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "728e7418fa6cd1ab3078cd67c3b54cd8")).floatValue();
        }
        ah ahVar = i().b;
        if (ahVar != null) {
            return ahVar.a(i);
        }
        return 0.0f;
    }

    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3e4df68ef91a2b57bf198b32a18f52c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3e4df68ef91a2b57bf198b32a18f52c")).intValue();
        }
        return Math.round(this.e != null ? this.e.a(2) : 0.0f);
    }

    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75213e675533d38a7f16b997ca921de5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75213e675533d38a7f16b997ca921de5")).intValue();
        }
        return Math.round(this.e != null ? this.e.a(3) : 0.0f);
    }

    public final void a(Rect rect, View view) {
        Object[] objArr = {rect, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbfad61b6e5cbb801bd7968a8ef3d0c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbfad61b6e5cbb801bd7968a8ef3d0c0");
            return;
        }
        view.getDrawingRect(rect);
        int i = rect.left;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        rect.left = i + (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e976b5cffbdf7633f5df20e05fecae25", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e976b5cffbdf7633f5df20e05fecae25")).intValue() : Math.round(d(0)));
        int i2 = rect.top;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        rect.top = i2 + (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0686a188d0ccb1e5c82d9d657665419", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0686a188d0ccb1e5c82d9d657665419")).intValue() : Math.round(d(1)));
        int i3 = rect.right;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        rect.right = i3 - (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a072bdbd2fc30f3a4f00e3e0f9c0ba80", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a072bdbd2fc30f3a4f00e3e0f9c0ba80")).intValue() : Math.round(d(2)));
        int i4 = rect.bottom;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        rect.bottom = i4 - (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8ef3c19e5aad05883569ceeb361771bd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8ef3c19e5aad05883569ceeb361771bd")).intValue() : Math.round(d(3)));
    }

    public com.meituan.msc.mmpviews.shell.background.f i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89af5b895d6cb9b2a6abfe164faa53c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.mmpviews.shell.background.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89af5b895d6cb9b2a6abfe164faa53c5");
        }
        if (this.c == null) {
            this.c = new com.meituan.msc.mmpviews.shell.background.f(n());
            Drawable background = this.b.getBackground();
            a((Drawable) null);
            if (background == null) {
                a(this.c);
            } else {
                a(new LayerDrawable(new Drawable[]{this.c, background}));
            }
            if (Build.VERSION.SDK_INT >= 17) {
                com.meituan.msc.jse.modules.i18nmanager.a.a();
                n();
                this.f = 0;
                this.c.a(this.f);
            }
        }
        return this.c;
    }

    public final void j() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a2915c6f72f96e894b5f6eb71a27fc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a2915c6f72f96e894b5f6eb71a27fc7");
        } else if (this.g.equals("visible")) {
            this.b.setAlpha(this.m);
        } else {
            float rotationX = this.b.getRotationX();
            float rotationY = this.b.getRotationY();
            if (rotationX >= -90.0f && rotationX < 90.0f && rotationY >= -90.0f && rotationY < 90.0f) {
                z = true;
            }
            if (z) {
                this.b.setAlpha(this.m);
            } else {
                this.b.setAlpha(0.0f);
            }
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "816bbde94f58a3dc113fd889e9895649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "816bbde94f58a3dc113fd889e9895649");
        } else if (Build.VERSION.SDK_INT < 17 || this.c == null) {
        } else {
            this.c.a(this.f);
        }
    }

    @Nullable
    public final com.meituan.msc.mmpviews.shell.background.f k() {
        return this.c;
    }

    public final int l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee132c4b2e665b408d4f923e88659687", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee132c4b2e665b408d4f923e88659687")).intValue() : this.b.getId();
    }

    public final View m() {
        return this.b;
    }

    public final Context n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff44545491ba1c3664868a501acbffd4", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff44545491ba1c3664868a501acbffd4") : this.b.getContext();
    }
}
