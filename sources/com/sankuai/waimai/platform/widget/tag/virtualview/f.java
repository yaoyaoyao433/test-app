package com.sankuai.waimai.platform.widget.tag.virtualview;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView;
import com.sankuai.waimai.platform.widget.tag.virtualview.b;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.g;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.h;
import java.util.List;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class f<T> extends com.sankuai.waimai.platform.widget.tag.b {
    private static final CanvasView.b c = new CanvasView.b() { // from class: com.sankuai.waimai.platform.widget.tag.virtualview.f.1
        @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.b
        public final Drawable a(int i, int i2, int i3) {
            return null;
        }

        @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.b
        public final void a() {
        }

        @Override // com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView.b
        public final void a(String str, int i, int i2, b.a aVar) {
        }
    };
    public static ChangeQuickRedirect d;
    @NonNull
    protected CanvasView.b e;
    public com.sankuai.waimai.platform.widget.tag.virtualview.render.c<T> f;
    private LinearGradient g;
    private Object h;
    private Bitmap i;
    private BitmapShader j;
    private Drawable k;
    private boolean l;
    private int m;
    private Path n;
    private RectF o;
    private b.a p;

    public abstract void a(Canvas canvas, Paint paint, @NonNull T t, Path path);

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afc2095afd99e7b29aa833d83c691166", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afc2095afd99e7b29aa833d83c691166");
            return;
        }
        this.e = c;
        this.m = -1;
        this.p = new b.a() { // from class: com.sankuai.waimai.platform.widget.tag.virtualview.f.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.tag.virtualview.b.a
            public final void a(Bitmap bitmap, Object obj) {
                Object[] objArr2 = {bitmap, obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5f768812db30a02649fe3375a1b1cc8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5f768812db30a02649fe3375a1b1cc8");
                } else if (Objects.equals(obj, f.this.h)) {
                    f.this.i = bitmap;
                    if (bitmap != null) {
                        f fVar = f.this;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        fVar.j = new BitmapShader(bitmap, tileMode, tileMode);
                        int i = f.this.f.e.e;
                        int i2 = f.this.f.e.f;
                        if (i != bitmap.getWidth() || i2 != bitmap.getHeight()) {
                            Matrix matrix = new Matrix();
                            matrix.setScale(i / bitmap.getWidth(), i2 / bitmap.getHeight());
                            f.this.j.setLocalMatrix(matrix);
                        }
                    }
                    if (f.this.l) {
                        f.this.e.a();
                    }
                }
            }
        };
    }

    public final void b(@NonNull CanvasView.b bVar, com.sankuai.waimai.platform.widget.tag.virtualview.render.c<T> cVar) {
        this.e = bVar;
        this.f = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.graphics.Canvas r12, android.graphics.Paint r13, android.graphics.Path r14) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.platform.widget.tag.virtualview.f.d
            java.lang.String r10 = "55c9fcc4d64384d65de4968de56578ac"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L21:
            com.sankuai.waimai.platform.widget.tag.virtualview.render.c<T> r0 = r11.f
            if (r0 != 0) goto L26
            return
        L26:
            com.sankuai.waimai.platform.widget.tag.virtualview.render.g r1 = r0.f
            T r2 = r0.g
            r3 = 0
            if (r1 == 0) goto L4d
            com.sankuai.waimai.platform.widget.tag.virtualview.render.g$b r4 = r1.f
            if (r4 == 0) goto L4d
            com.sankuai.waimai.platform.widget.tag.virtualview.render.g$b r3 = r1.f
            float[] r3 = r3.f
            com.sankuai.waimai.platform.widget.tag.virtualview.render.c<T> r4 = r11.f
            com.sankuai.waimai.platform.widget.tag.virtualview.render.f r4 = r4.e
            int r4 = r4.e
            com.sankuai.waimai.platform.widget.tag.virtualview.render.c<T> r5 = r11.f
            com.sankuai.waimai.platform.widget.tag.virtualview.render.f r5 = r5.e
            int r5 = r5.f
            com.sankuai.waimai.platform.widget.tag.virtualview.render.g$b r6 = r1.f
            float r6 = r6.e
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r7
            android.graphics.Path r3 = r11.a(r3, r4, r5, r6)
        L4d:
            if (r14 == 0) goto L73
            if (r3 != 0) goto L52
            goto L74
        L52:
            com.sankuai.waimai.platform.widget.tag.virtualview.render.b r4 = r0.d
            int r4 = r4.e
            float r4 = (float) r4
            com.sankuai.waimai.platform.widget.tag.virtualview.render.b r5 = r0.d
            int r5 = r5.f
            float r5 = (float) r5
            r3.offset(r4, r5)
            android.graphics.Path$Op r4 = android.graphics.Path.Op.INTERSECT
            r3.op(r14, r4)
            com.sankuai.waimai.platform.widget.tag.virtualview.render.b r14 = r0.d
            int r14 = r14.e
            int r14 = -r14
            float r14 = (float) r14
            com.sankuai.waimai.platform.widget.tag.virtualview.render.b r4 = r0.d
            int r4 = r4.f
            int r4 = -r4
            float r4 = (float) r4
            r3.offset(r14, r4)
        L73:
            r14 = r3
        L74:
            int r3 = r12.save()
            com.sankuai.waimai.platform.widget.tag.virtualview.render.b r4 = r0.d
            int r4 = r4.e
            float r4 = (float) r4
            com.sankuai.waimai.platform.widget.tag.virtualview.render.b r0 = r0.d
            int r0 = r0.f
            float r0 = (float) r0
            r12.translate(r4, r0)
            if (r1 == 0) goto L95
            com.sankuai.waimai.platform.widget.tag.virtualview.render.g$a r0 = r1.e
            if (r0 == 0) goto L95
            boolean r4 = r0.j
            if (r4 == 0) goto L95
            r13.reset()
            r11.a(r12, r13, r0, r14)
        L95:
            if (r2 == 0) goto L9d
            r13.reset()
            r11.a(r12, r13, r2, r14)
        L9d:
            if (r1 == 0) goto La9
            com.sankuai.waimai.platform.widget.tag.virtualview.render.g$b r0 = r1.f
            if (r0 == 0) goto La9
            r13.reset()
            r11.a(r12, r13, r0, r14)
        La9:
            r12.restoreToCount(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.widget.tag.virtualview.f.a(android.graphics.Canvas, android.graphics.Paint, android.graphics.Path):void");
    }

    private void a(Canvas canvas, Paint paint, @NonNull g.a aVar, Path path) {
        Object[] objArr = {canvas, paint, aVar, path};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2417debe8ce5de5b4fad4dd23d5433f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2417debe8ce5de5b4fad4dd23d5433f");
            return;
        }
        if (!TextUtils.isEmpty(aVar.d) || aVar.e != null) {
            this.m = 0;
            int i = (int) (this.f.e.e + 0.5f);
            int i2 = (int) (this.f.e.f + 0.5f);
            if (this.i == null) {
                if (!TextUtils.isEmpty(aVar.d)) {
                    this.h = aVar.d;
                    this.l = false;
                    this.e.a(aVar.d, i, i2, this.p);
                    this.l = true;
                } else {
                    this.k = this.e.a(aVar.e.intValue(), i, i2);
                }
            }
        } else if (aVar.g()) {
            this.m = 2;
        } else if (aVar.i != null) {
            this.m = 1;
        } else {
            this.m = -1;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        if (this.m == 0) {
            if (this.j != null) {
                paint.setShader(this.j);
                canvas.drawPath(path, paint);
            } else if (this.k != null) {
                this.k.setBounds(0, 0, this.f.e.e, this.f.e.f);
                this.k.draw(canvas);
            }
        } else if (this.m == 2) {
            paint.setShader(a(aVar));
            canvas.drawPath(path, paint);
        } else if (this.m == 1) {
            paint.setColor(aVar.i.intValue());
            canvas.drawPath(path, paint);
        }
    }

    private LinearGradient a(@NonNull g.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1391770f607699b75f25cd5a41c59030", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearGradient) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1391770f607699b75f25cd5a41c59030");
        }
        if (this.g == null) {
            if (aVar.h == 0) {
                this.g = new LinearGradient(0.0f, 0.0f, this.f.e.e, 0.0f, aVar.f.intValue(), aVar.g.intValue(), Shader.TileMode.CLAMP);
            } else if (aVar.h == 1) {
                this.g = new LinearGradient(0.0f, 0.0f, 0.0f, this.f.e.f, aVar.f.intValue(), aVar.g.intValue(), Shader.TileMode.CLAMP);
            }
        }
        return this.g;
    }

    @NonNull
    private RectF a(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d1e68b352e6f87de904ac4f4291b428", RobustBitConfig.DEFAULT_VALUE)) {
            return (RectF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d1e68b352e6f87de904ac4f4291b428");
        }
        if (this.o == null) {
            this.o = new RectF();
        }
        this.o.set(f, f2, f3, f4);
        return this.o;
    }

    private Path a(float[] fArr, int i, int i2, float f) {
        Object[] objArr = {fArr, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d4ffb11c4f929b96472a1dbcd2f8ce2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Path) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d4ffb11c4f929b96472a1dbcd2f8ce2");
        }
        if (this.n == null) {
            this.n = new Path();
        }
        this.n.reset();
        if (fArr == null || fArr.length < 4) {
            this.n.addRect(f, f, i - f, i2 - f, Path.Direction.CW);
        } else {
            this.n.addRoundRect(a(f, f, i - f, i2 - f), new float[]{fArr[0] - f, fArr[0] - f, fArr[1] - f, fArr[1] - f, fArr[2] - f, fArr[2] - f, fArr[3] - f, fArr[3] - f}, Path.Direction.CW);
        }
        return this.n;
    }

    private void a(Canvas canvas, Paint paint, @NonNull g.b bVar, Path path) {
        Object[] objArr = {canvas, paint, bVar, path};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b29539c43296a080ddfe99eb2f40c2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b29539c43296a080ddfe99eb2f40c2f");
        } else if (bVar.d == null) {
        } else {
            paint.setFlags(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(bVar.e);
            paint.setColor(bVar.d.intValue());
            canvas.drawPath(path, paint);
        }
    }

    public static f<?> c(CanvasView.b bVar, com.sankuai.waimai.platform.widget.tag.virtualview.render.c<?> cVar) {
        Object[] objArr = {bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adeb9d30e6f95832bd1d207f692bba43", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adeb9d30e6f95832bd1d207f692bba43");
        }
        T t = cVar.g;
        if (t instanceof com.sankuai.waimai.platform.widget.tag.virtualview.render.a) {
            return c.a(bVar, (com.sankuai.waimai.platform.widget.tag.virtualview.render.c<com.sankuai.waimai.platform.widget.tag.virtualview.render.a>) cVar);
        }
        if (t instanceof h) {
            return e.a(bVar, (com.sankuai.waimai.platform.widget.tag.virtualview.render.c<h>) cVar);
        }
        if (t instanceof com.sankuai.waimai.platform.widget.tag.virtualview.render.e) {
            return d.a(bVar, (com.sankuai.waimai.platform.widget.tag.virtualview.render.c<com.sankuai.waimai.platform.widget.tag.virtualview.render.e>) cVar);
        }
        if (t instanceof List) {
            List list = (List) t;
            if (list.isEmpty() || (list.get(0) instanceof com.sankuai.waimai.platform.widget.tag.virtualview.render.c)) {
                return g.a(bVar, (com.sankuai.waimai.platform.widget.tag.virtualview.render.c<List<com.sankuai.waimai.platform.widget.tag.virtualview.render.c<?>>>) cVar);
            }
            return null;
        }
        return a.a(bVar, cVar);
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e46952c1f21f869dd2d67a70a5937976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e46952c1f21f869dd2d67a70a5937976");
            return;
        }
        this.e = c;
        if (this.f != null) {
            this.f.c();
            this.f = null;
        }
        this.g = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.h = null;
        this.m = -1;
        if (this.n != null) {
            this.n.reset();
        }
        if (this.o != null) {
            this.o.setEmpty();
        }
    }
}
