package com.meituan.roodesign.widgets.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private final k[] b;
    private final Matrix[] c;
    private final Matrix[] d;
    private final PointF e;
    private final k f;
    private final float[] g;
    private final float[] h;

    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public interface a {
        void a(k kVar, Matrix matrix, int i);

        void b(k kVar, Matrix matrix, int i);
    }

    private float b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "817bf1ebb3cfcaf2b7558429b5508cf8", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "817bf1ebb3cfcaf2b7558429b5508cf8")).floatValue() : (i + 1) * 90;
    }

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba874bc0bc8ad9848dc6a41c8199ebf9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba874bc0bc8ad9848dc6a41c8199ebf9");
            return;
        }
        this.b = new k[4];
        this.c = new Matrix[4];
        this.d = new Matrix[4];
        this.e = new PointF();
        this.f = new k();
        this.g = new float[2];
        this.h = new float[2];
        for (int i = 0; i < 4; i++) {
            this.b[i] = new k();
            this.c[i] = new Matrix();
            this.d[i] = new Matrix();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(i iVar, float f, RectF rectF, a aVar, @NonNull Path path) {
        Object[] objArr = {iVar, Float.valueOf(f), rectF, aVar, path};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61091ab7d796f04051f3bcc953297b9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61091ab7d796f04051f3bcc953297b9a");
            return;
        }
        path.rewind();
        b bVar = new b(iVar, f, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            a(bVar, i);
            a(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(bVar, i2);
            c(bVar, i2);
        }
        path.close();
    }

    private void a(@NonNull b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "077ecfd67b1bb4ce65db82fe88cfaa20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "077ecfd67b1bb4ce65db82fe88cfaa20");
            return;
        }
        a(i, bVar.a).a(this.b[i], 90.0f, bVar.e, bVar.c, b(i, bVar.a));
        float b2 = b(i);
        this.c[i].reset();
        a(i, bVar.c, this.e);
        this.c[i].setTranslate(this.e.x, this.e.y);
        this.c[i].preRotate(b2);
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46268e257eeb494700174a05e14d9199", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46268e257eeb494700174a05e14d9199");
            return;
        }
        this.g[0] = this.b[i].d;
        this.g[1] = this.b[i].e;
        this.c[i].mapPoints(this.g);
        float b2 = b(i);
        this.d[i].reset();
        this.d[i].setTranslate(this.g[0], this.g[1]);
        this.d[i].preRotate(b2);
    }

    private void b(@NonNull b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7d9aaae3cfa3de1987ea3205a9f68a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7d9aaae3cfa3de1987ea3205a9f68a2");
            return;
        }
        this.g[0] = this.b[i].b;
        this.g[1] = this.b[i].c;
        this.c[i].mapPoints(this.g);
        if (i == 0) {
            bVar.b.moveTo(this.g[0], this.g[1]);
        } else {
            bVar.b.lineTo(this.g[0], this.g[1]);
        }
        this.b[i].a(this.c[i], bVar.b);
        if (bVar.d != null) {
            bVar.d.a(this.b[i], this.c[i], i);
        }
    }

    private void c(@NonNull b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92e8257eb5b1130ef08157d678dd1776", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92e8257eb5b1130ef08157d678dd1776");
            return;
        }
        int i2 = (i + 1) % 4;
        this.g[0] = this.b[i].d;
        this.g[1] = this.b[i].e;
        this.c[i].mapPoints(this.g);
        this.h[0] = this.b[i2].b;
        this.h[1] = this.b[i2].c;
        this.c[i2].mapPoints(this.h);
        float max = Math.max(((float) Math.hypot(this.g[0] - this.h[0], this.g[1] - this.h[1])) - 0.001f, 0.0f);
        float a2 = a(bVar.c, i);
        this.f.a(0.0f, 0.0f);
        c(i, bVar.a).a(max, a2, bVar.e, this.f);
        this.f.a(this.d[i], bVar.b);
        if (bVar.d != null) {
            bVar.d.b(this.f, this.d[i], i);
        }
    }

    private float a(@NonNull RectF rectF, int i) {
        Object[] objArr = {rectF, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a57045d3228d04e993bd992238a8f1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a57045d3228d04e993bd992238a8f1d")).floatValue();
        }
        this.g[0] = this.b[i].d;
        this.g[1] = this.b[i].e;
        this.c[i].mapPoints(this.g);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.g[0]);
        }
        return Math.abs(rectF.centerY() - this.g[1]);
    }

    private void a(int i, @NonNull RectF rectF, @NonNull PointF pointF) {
        Object[] objArr = {Integer.valueOf(i), rectF, pointF};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73f4c75e8a9056de6a83becc53911e82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73f4c75e8a9056de6a83becc53911e82");
            return;
        }
        switch (i) {
            case 1:
                pointF.set(rectF.right, rectF.bottom);
                return;
            case 2:
                pointF.set(rectF.left, rectF.bottom);
                return;
            case 3:
                pointF.set(rectF.left, rectF.top);
                return;
            default:
                pointF.set(rectF.right, rectF.top);
                return;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class b {
        @NonNull
        public final i a;
        @NonNull
        public final Path b;
        @NonNull
        public final RectF c;
        @Nullable
        public final a d;
        public final float e;

        public b(@NonNull i iVar, float f, RectF rectF, @Nullable a aVar, Path path) {
            this.d = aVar;
            this.a = iVar;
            this.e = f;
            this.c = rectF;
            this.b = path;
        }
    }

    private d a(int i, @NonNull i iVar) {
        Object[] objArr = {Integer.valueOf(i), iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c35ce550ef81be6e26ec42d4c3474ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c35ce550ef81be6e26ec42d4c3474ff");
        }
        switch (i) {
            case 1:
                return iVar.e;
            case 2:
                return iVar.f;
            case 3:
                return iVar.c;
            default:
                return iVar.d;
        }
    }

    private c b(int i, @NonNull i iVar) {
        Object[] objArr = {Integer.valueOf(i), iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cbfc6f2b4e713d5cd5275d7c47e1b27", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cbfc6f2b4e713d5cd5275d7c47e1b27");
        }
        switch (i) {
            case 1:
                return iVar.i;
            case 2:
                return iVar.j;
            case 3:
                return iVar.g;
            default:
                return iVar.h;
        }
    }

    private e c(int i, @NonNull i iVar) {
        Object[] objArr = {Integer.valueOf(i), iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5de9e19e053d883f31af6d77f5b94b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5de9e19e053d883f31af6d77f5b94b4");
        }
        switch (i) {
            case 1:
                return iVar.m;
            case 2:
                return iVar.n;
            case 3:
                return iVar.k;
            default:
                return iVar.l;
        }
    }
}
