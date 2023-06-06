package com.dianping.imagemanager.image.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class g extends com.dianping.imagemanager.image.drawable.e {
    public static ChangeQuickRedirect i;
    private Matrix b;
    private Matrix c;
    public b j;
    public Object k;
    public int l;
    public int m;
    public Matrix n;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        public static final b b = q.s;
        public static final b c = p.s;
        public static final b d = n.s;
        public static final b e = o.s;
        public static final b f = c.s;
        public static final b g = e.s;
        public static final b h = d.s;
        public static final b i = r.r;
        public static final b j = i.s;
        public static final b k = l.s;
        public static final b l = C0081g.s;
        public static final b m = j.s;
        public static final b n = h.s;
        public static final b o = k.s;
        public static final b p = m.s;
        public static final b q = f.s;

        Matrix a(Matrix matrix, Rect rect, int i2, int i3);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class r extends a {
        public static final b r = new r();

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
        }

        public final String toString() {
            return "matrix";
        }
    }

    public g(Drawable drawable, b bVar) {
        super(drawable);
        Object[] objArr = {drawable, bVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94eba88856c28fca8655577d13c16747", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94eba88856c28fca8655577d13c16747");
            return;
        }
        this.l = 0;
        this.m = 0;
        this.b = new Matrix();
        this.c = new Matrix();
        this.j = bVar;
    }

    @Override // com.dianping.imagemanager.image.drawable.e
    public Drawable a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "812c1d4ce58e6a8e854c68c07669b12a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "812c1d4ce58e6a8e854c68c07669b12a");
        }
        Drawable a2 = super.a(drawable);
        c();
        return a2;
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d2c2939b7dbc758630dd4b83bc2ed8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d2c2939b7dbc758630dd4b83bc2ed8b");
        } else if (this.j == bVar) {
        } else {
            this.j = bVar;
            this.k = null;
            c();
            invalidateSelf();
        }
    }

    public final void a(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efaaf91faca30d4e62eba65220b7f979", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efaaf91faca30d4e62eba65220b7f979");
            return;
        }
        this.c.set(matrix);
        c();
        invalidateSelf();
    }

    @Override // com.dianping.imagemanager.image.drawable.e, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5edb479c634b92a4ebe08d1365094b17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5edb479c634b92a4ebe08d1365094b17");
            return;
        }
        b();
        if (this.n != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.n);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // com.dianping.imagemanager.image.drawable.e, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4797c154d9f1106d08bd81811ac25dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4797c154d9f1106d08bd81811ac25dc");
        } else {
            c();
        }
    }

    public final void b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f987e8525fd28af347f02a59e357dbab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f987e8525fd28af347f02a59e357dbab");
            return;
        }
        if (((this.l == getCurrent().getIntrinsicWidth() && this.m == getCurrent().getIntrinsicHeight()) ? true : true) || this.l <= 0 || this.m <= 0) {
            c();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "638be987046f2aa991b9992550797f29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "638be987046f2aa991b9992550797f29");
            return;
        }
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.l = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.m = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.n = null;
        } else if (this.j == b.i) {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.n = this.c;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.n = null;
        } else if (this.j == b.b) {
            current.setBounds(bounds);
            this.n = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.j.a(this.b, bounds, intrinsicWidth, intrinsicHeight);
            this.n = this.b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class a implements b {
        public static ChangeQuickRedirect a;

        public abstract void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2);

        @Override // com.dianping.imagemanager.image.drawable.g.b
        public final Matrix a(Matrix matrix, Rect rect, int i, int i2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a408f6cd5fc1721eca0bfc3285271302", RobustBitConfig.DEFAULT_VALUE)) {
                return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a408f6cd5fc1721eca0bfc3285271302");
            }
            a(matrix, rect, i, i2, rect.width() / i, rect.height() / i2);
            return matrix;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class q extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new q();

        public final String toString() {
            return "fit_xy";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a1f57ae9c43800e34c2db1de32a08ec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a1f57ae9c43800e34c2db1de32a08ec");
                return;
            }
            matrix.setScale(f, f2);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class p extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new p();

        public final String toString() {
            return "fit_start";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc61eca8466f8c26ae1ec3fbd8d89b41", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc61eca8466f8c26ae1ec3fbd8d89b41");
                return;
            }
            float min = Math.min(f, f2);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class n extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new n();

        public final String toString() {
            return "fit_center";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb089184068a904c89e501a84f4d530", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb089184068a904c89e501a84f4d530");
                return;
            }
            float min = Math.min(f, f2);
            float width = rect.left + ((rect.width() - (i * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i2 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class o extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new o();

        public final String toString() {
            return "fit_end";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47ac326fb875d20f6d2bf610261dfeae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47ac326fb875d20f6d2bf610261dfeae");
                return;
            }
            float min = Math.min(f, f2);
            float width = rect.left + (rect.width() - (i * min));
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (rect.top + (rect.height() - (i2 * min)) + 0.5f));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class c extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new c();

        public final String toString() {
            return "center";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff2928a8083abd15d17cbfbf96d50d6e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff2928a8083abd15d17cbfbf96d50d6e");
            } else {
                matrix.setTranslate((int) (rect.left + ((rect.width() - i) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i2) * 0.5f) + 0.5f));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class e extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new e();

        public final String toString() {
            return "center_inside";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f06a31d9f9632a6c25867a6e5f5550db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f06a31d9f9632a6c25867a6e5f5550db");
                return;
            }
            float min = Math.min(Math.min(f, f2), 1.0f);
            float width = rect.left + ((rect.width() - (i * min)) * 0.5f);
            float height = rect.top + ((rect.height() - (i2 * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class i extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new i();

        public final String toString() {
            return "crop_lefttop";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3a56f97bb5d34eb2bbbd369c1031e3b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3a56f97bb5d34eb2bbbd369c1031e3b");
                return;
            }
            float max = Math.max(f, f2);
            matrix.setScale(max, max);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + 0.5f));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class l extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new l();

        public final String toString() {
            return "crop_righttop";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c8e3ec121d3ad57fb40bdf5cb3712d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c8e3ec121d3ad57fb40bdf5cb3712d9");
                return;
            }
            float max = Math.max(f, f2);
            matrix.setScale(max, max);
            matrix.postTranslate((int) (rect.left + (rect.width() - (i * max)) + 0.5f), (int) (rect.top + 0.5f));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.imagemanager.image.drawable.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0081g extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new C0081g();

        public final String toString() {
            return "crop_leftbottom";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e55409918b524e899799c3bdb376636", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e55409918b524e899799c3bdb376636");
                return;
            }
            float max = Math.max(f, f2);
            matrix.setScale(max, max);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (rect.top + (rect.height() - (i2 * max)) + 0.5f));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class j extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new j();

        public final String toString() {
            return "crop_rightbottom";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "744728d885907a2263d25998461c4ae1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "744728d885907a2263d25998461c4ae1");
                return;
            }
            float max = Math.max(f, f2);
            float width = rect.left + (rect.width() - (i * max));
            matrix.setScale(max, max);
            matrix.postTranslate((int) (width + 0.5f), (int) (rect.top + (rect.height() - (i2 * max)) + 0.5f));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class h extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new h();

        public final String toString() {
            return "crop_leftcenter";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "245ba6174ee5f5ea5a9bc8d838b930a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "245ba6174ee5f5ea5a9bc8d838b930a7");
                return;
            }
            float max = Math.max(f, f2);
            float height = rect.top + ((rect.height() - (i2 * max)) * 0.5f);
            matrix.setScale(max, max);
            matrix.postTranslate((int) (rect.left + 0.5f), (int) (height + 0.5f));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class k extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new k();

        public final String toString() {
            return "crop_rightcenter";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09d6f44f132cbc82af12d483558e601e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09d6f44f132cbc82af12d483558e601e");
                return;
            }
            float max = Math.max(f, f2);
            float width = rect.left + (rect.width() - (i * max));
            float height = rect.top + ((rect.height() - (i2 * max)) * 0.5f);
            matrix.setScale(max, max);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class m extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new m();

        public final String toString() {
            return "crop_topcenter";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1c756f4f4771e84e347d53cb9aee1d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1c756f4f4771e84e347d53cb9aee1d9");
                return;
            }
            float max = Math.max(f, f2);
            matrix.setScale(max, max);
            matrix.postTranslate((int) (rect.left + ((rect.width() - (i * max)) * 0.5f) + 0.5f), (int) (rect.top + 0.5f));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class f extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new f();

        public final String toString() {
            return "crop_bottomcenter";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5914973813c7d82e4faf93697dfa22d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5914973813c7d82e4faf93697dfa22d8");
                return;
            }
            float max = Math.max(f, f2);
            float width = rect.left + ((rect.width() - (i * max)) * 0.5f);
            float height = rect.top + (rect.height() - (i2 * max));
            matrix.setScale(max, max);
            matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class d extends a {
        public static ChangeQuickRedirect r;
        public static final b s = new d();

        public final String toString() {
            return "center_crop";
        }

        @Override // com.dianping.imagemanager.image.drawable.g.a
        public final void a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            float f3;
            float height;
            float f4;
            Object[] objArr = {matrix, rect, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d45ab18f920378ea3461aeffcf2b8ca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d45ab18f920378ea3461aeffcf2b8ca");
                return;
            }
            if (f2 > f) {
                height = rect.top;
                f3 = rect.left + ((rect.width() - (i * f2)) * 0.5f);
                f4 = f2;
            } else {
                f3 = rect.left;
                height = ((rect.height() - (i2 * f)) * 0.5f) + rect.top;
                f4 = f;
            }
            matrix.setScale(f4, f4);
            matrix.postTranslate((int) (f3 + 0.5f), (int) (height + 0.5f));
        }
    }
}
