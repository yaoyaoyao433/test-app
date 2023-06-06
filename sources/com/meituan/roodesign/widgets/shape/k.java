package com.meituan.roodesign.widgets.shape;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    @Deprecated
    public float g;
    final List<e> h;
    private final List<f> i;

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2997d0f98c545d6b990c6aa7fc2072", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2997d0f98c545d6b990c6aa7fc2072");
            return;
        }
        this.h = new ArrayList();
        this.i = new ArrayList();
        a(0.0f, 0.0f);
    }

    public final void a(float f2, float f3) {
        Object[] objArr = {Float.valueOf(0.0f), Float.valueOf(0.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51c48eb402f0c2af92dcdcb3a8c133ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51c48eb402f0c2af92dcdcb3a8c133ad");
        } else {
            a(0.0f, 0.0f, 270.0f, 0.0f);
        }
    }

    public final void a(Matrix matrix, Path path) {
        Object[] objArr = {matrix, path};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be2092bf6d63c1167b72d8752dc9844f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be2092bf6d63c1167b72d8752dc9844f");
            return;
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            this.h.get(i).a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(f fVar, float f2, float f3) {
        Object[] objArr = {fVar, Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ee3924b9e1ef5dba5b1944a51ad271b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ee3924b9e1ef5dba5b1944a51ad271b");
            return;
        }
        a(f2);
        this.i.add(fVar);
        this.f = f3;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class f {
        public static ChangeQuickRedirect e;
        public static final Matrix f = new Matrix();

        public abstract void a(Matrix matrix, com.meituan.roodesign.widgets.shadow.a aVar, int i, Canvas canvas);

        public final void a(com.meituan.roodesign.widgets.shadow.a aVar, int i, Canvas canvas) {
            Object[] objArr = {aVar, Integer.valueOf(i), canvas};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4031c5401ce091c3eb00f502693146f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4031c5401ce091c3eb00f502693146f7");
            } else {
                a(f, aVar, i, canvas);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends f {
        public static ChangeQuickRedirect a;
        private final d b;
        private final float c;
        private final float d;

        public b(d dVar, float f, float f2) {
            Object[] objArr = {dVar, Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a01eeb6613884427d6c85826bdab2cd6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a01eeb6613884427d6c85826bdab2cd6");
                return;
            }
            this.b = dVar;
            this.c = f;
            this.d = f2;
        }

        @Override // com.meituan.roodesign.widgets.shape.k.f
        public final void a(Matrix matrix, @NonNull com.meituan.roodesign.widgets.shadow.a aVar, int i, @NonNull Canvas canvas) {
            Object[] objArr = {matrix, aVar, Integer.valueOf(i), canvas};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd036a59a5f3874f4a9d3ed50e216afe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd036a59a5f3874f4a9d3ed50e216afe");
                return;
            }
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.b.c - this.d, this.b.b - this.c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.c, this.d);
            matrix2.preRotate(a());
            Object[] objArr2 = {canvas, matrix2, rectF, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.roodesign.widgets.shadow.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5d670bf9fd873154edf5b069a3806723", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5d670bf9fd873154edf5b069a3806723");
                return;
            }
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            com.meituan.roodesign.widgets.shadow.a.h[0] = aVar.g;
            com.meituan.roodesign.widgets.shadow.a.h[1] = aVar.f;
            com.meituan.roodesign.widgets.shadow.a.h[2] = aVar.e;
            aVar.d.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, com.meituan.roodesign.widgets.shadow.a.h, com.meituan.roodesign.widgets.shadow.a.i, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.d);
            canvas.restore();
        }

        public final float a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64d79caf5d0b38759b4fbce3071dc37d", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64d79caf5d0b38759b4fbce3071dc37d")).floatValue() : (float) Math.toDegrees(Math.atan((this.b.c - this.d) / (this.b.b - this.c)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends f {
        public static ChangeQuickRedirect a;
        private final c b;

        public a(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c38fd25d04e3962ace43534e8dba0347", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c38fd25d04e3962ace43534e8dba0347");
            } else {
                this.b = cVar;
            }
        }

        @Override // com.meituan.roodesign.widgets.shape.k.f
        public final void a(Matrix matrix, @NonNull com.meituan.roodesign.widgets.shadow.a aVar, int i, @NonNull Canvas canvas) {
            Object[] objArr = {matrix, aVar, Integer.valueOf(i), canvas};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15d416f9b6827b0ceea11bbf126a5b25", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15d416f9b6827b0ceea11bbf126a5b25");
                return;
            }
            float f = this.b.f;
            float f2 = this.b.g;
            RectF rectF = new RectF(this.b.b, this.b.c, this.b.d, this.b.e);
            Object[] objArr2 = {canvas, matrix, rectF, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.roodesign.widgets.shadow.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "b2c577bf67e2267670e7874e8eadb926", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "b2c577bf67e2267670e7874e8eadb926");
                return;
            }
            boolean z = f2 < 0.0f;
            Path path = aVar.l;
            if (z) {
                com.meituan.roodesign.widgets.shadow.a.j[0] = 0;
                com.meituan.roodesign.widgets.shadow.a.j[1] = aVar.g;
                com.meituan.roodesign.widgets.shadow.a.j[2] = aVar.f;
                com.meituan.roodesign.widgets.shadow.a.j[3] = aVar.e;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = -i;
                rectF.inset(f3, f3);
                com.meituan.roodesign.widgets.shadow.a.j[0] = 0;
                com.meituan.roodesign.widgets.shadow.a.j[1] = aVar.e;
                com.meituan.roodesign.widgets.shadow.a.j[2] = aVar.f;
                com.meituan.roodesign.widgets.shadow.a.j[3] = aVar.g;
            }
            float width = 1.0f - (i / (rectF.width() / 2.0f));
            com.meituan.roodesign.widgets.shadow.a.k[1] = width;
            com.meituan.roodesign.widgets.shadow.a.k[2] = ((1.0f - width) / 2.0f) + width;
            aVar.c.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, com.meituan.roodesign.widgets.shadow.a.j, com.meituan.roodesign.widgets.shadow.a.k, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            canvas.drawArc(rectF, f, f2, true, aVar.c);
            canvas.restore();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class e {
        public static ChangeQuickRedirect h;
        protected final Matrix i;

        public abstract void a(Matrix matrix, Path path);

        public e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = h;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c7cd1668de91b193487ffc38312afb9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c7cd1668de91b193487ffc38312afb9");
            } else {
                this.i = new Matrix();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class d extends e {
        public static ChangeQuickRedirect a;
        float b;
        float c;

        @Override // com.meituan.roodesign.widgets.shape.k.e
        public final void a(@NonNull Matrix matrix, @NonNull Path path) {
            Object[] objArr = {matrix, path};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "268e1d4ed4cd74fc1087141ee67b5369", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "268e1d4ed4cd74fc1087141ee67b5369");
                return;
            }
            Matrix matrix2 = this.i;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c extends e {
        public static ChangeQuickRedirect a;
        private static final RectF j = new RectF();
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;

        public c(float f, float f2, float f3, float f4) {
            Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c13c7b049f31008cf059372096707afb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c13c7b049f31008cf059372096707afb");
                return;
            }
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        @Override // com.meituan.roodesign.widgets.shape.k.e
        public final void a(@NonNull Matrix matrix, @NonNull Path path) {
            Object[] objArr = {matrix, path};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f69595aafe2fc6886b42a6bdab336916", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f69595aafe2fc6886b42a6bdab336916");
                return;
            }
            Matrix matrix2 = this.i;
            matrix.invert(matrix2);
            path.transform(matrix2);
            j.set(this.b, this.c, this.d, this.e);
            path.arcTo(j, this.f, this.g, false);
            path.transform(matrix);
        }
    }

    public final void a(float f2, float f3, float f4, float f5) {
        Object[] objArr = {Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbfa9c2426e69ac424f13c4ae22643be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbfa9c2426e69ac424f13c4ae22643be");
            return;
        }
        this.b = f2;
        this.c = f3;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = (f4 + f5) % 360.0f;
        this.h.clear();
        this.i.clear();
    }

    @NonNull
    public final f a(final Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5cc7a8811348573a24df3f2c42d0627", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5cc7a8811348573a24df3f2c42d0627");
        }
        a(this.g);
        final ArrayList arrayList = new ArrayList(this.i);
        return new f() { // from class: com.meituan.roodesign.widgets.shape.k.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.roodesign.widgets.shape.k.f
            public final void a(Matrix matrix2, com.meituan.roodesign.widgets.shadow.a aVar, int i, Canvas canvas) {
                Object[] objArr2 = {matrix2, aVar, Integer.valueOf(i), canvas};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "656c02d1c4ffa4c3ed33722f0aff89f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "656c02d1c4ffa4c3ed33722f0aff89f3");
                    return;
                }
                for (f fVar : arrayList) {
                    fVar.a(matrix, aVar, i, canvas);
                }
            }
        };
    }

    private void a(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9006714cb9198f181ef56495064eba28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9006714cb9198f181ef56495064eba28");
        } else if (this.f == f2) {
        } else {
            float f3 = ((f2 - this.f) + 360.0f) % 360.0f;
            if (f3 > 180.0f) {
                return;
            }
            c cVar = new c(this.d, this.e, this.d, this.e);
            cVar.f = this.f;
            cVar.g = f3;
            this.i.add(new a(cVar));
            this.f = f2;
        }
    }
}
