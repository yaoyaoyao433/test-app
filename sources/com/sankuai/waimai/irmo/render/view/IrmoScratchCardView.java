package com.sankuai.waimai.irmo.render.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Array;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IrmoScratchCardView extends FrameLayout {
    public static ChangeQuickRedirect a;
    public Drawable b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public boolean[][] g;
    public boolean h;
    private Rect i;
    private float j;
    private float k;
    private long l;
    private a m;
    private final Paint n;
    private Bitmap o;
    private final Path p;
    private final PathMeasure q;
    private float r;
    private float s;
    private final Xfermode t;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(boolean z);
    }

    public IrmoScratchCardView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30105cc0682b244619e8bd03837e5cac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30105cc0682b244619e8bd03837e5cac");
            return;
        }
        this.j = 45.0f;
        this.k = 0.25f;
        this.l = 150L;
        this.n = new Paint();
        this.o = null;
        this.c = false;
        this.p = new Path();
        this.q = new PathMeasure();
        this.r = -1.0f;
        this.s = -1.0f;
        this.d = 0;
        this.e = 10;
        this.f = false;
        this.g = (boolean[][]) Array.newInstance(boolean.class, this.e, this.e);
        this.h = false;
        this.t = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        a();
    }

    public IrmoScratchCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6710f01a4d88253d61fbc208eb3e68e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6710f01a4d88253d61fbc208eb3e68e");
            return;
        }
        this.j = 45.0f;
        this.k = 0.25f;
        this.l = 150L;
        this.n = new Paint();
        this.o = null;
        this.c = false;
        this.p = new Path();
        this.q = new PathMeasure();
        this.r = -1.0f;
        this.s = -1.0f;
        this.d = 0;
        this.e = 10;
        this.f = false;
        this.g = (boolean[][]) Array.newInstance(boolean.class, this.e, this.e);
        this.h = false;
        this.t = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae6ce5080e439ef6da649a79cd3a2e40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae6ce5080e439ef6da649a79cd3a2e40");
            return;
        }
        this.n.setStyle(Paint.Style.STROKE);
        this.n.setColor(-1);
        this.n.setAntiAlias(true);
        this.n.setStrokeCap(Paint.Cap.ROUND);
        this.n.setStrokeJoin(Paint.Join.ROUND);
        this.n.setStrokeWidth(getResources().getDisplayMetrics().density * 20.0f);
        setWillNotDraw(false);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9afbfa27dc3395fec8b7d2044bd63c3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9afbfa27dc3395fec8b7d2044bd63c3b");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.i = new Rect(0, 0, i, i2);
        if (!this.h) {
            b();
        }
        a(i, i2);
    }

    public void setAnimDuration(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9a54a31a03efdcf4d27e874647da63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9a54a31a03efdcf4d27e874647da63");
        } else if (j <= 0) {
        } else {
            this.l = j;
        }
    }

    public void setScratchCardListener(a aVar) {
        this.m = aVar;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89bb8e95ed8d209acf29a001324138d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89bb8e95ed8d209acf29a001324138d1");
        } else if (this.c || this.b == null || i <= 0 || i2 <= 0) {
        } else {
            this.c = true;
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
            this.b.setBounds(0, 0, i, i2);
            this.b.draw(new Canvas(createBitmap));
            a(createBitmap);
        }
    }

    private void a(float f, float f2) {
        int width;
        int height;
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b348fd6c45399df67994b785bf45f3ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b348fd6c45399df67994b785bf45f3ad");
        } else if (f < 0.0f || f2 < 0.0f || f > getWidth() || f2 > getHeight() || (width = ((int) f) / (getWidth() / this.e)) >= this.g[0].length || (height = (int) (f2 / (getHeight() / this.e))) >= this.g.length || this.g[height][width]) {
        } else {
            this.g[height][width] = true;
            this.d++;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a69ad53e27779335a2fb407eef4ec7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a69ad53e27779335a2fb407eef4ec7")).booleanValue();
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.f) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (this.m != null) {
                    if (this.r == -1.0f && this.s == -1.0f) {
                        z = true;
                    }
                    this.m.a(z);
                }
                this.p.moveTo(x, y);
                return true;
            case 1:
                if (this.d / (this.g.length * this.g[0].length) > this.k) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98abe053ec9f0636d840af845a7a47a5", RobustBitConfig.DEFAULT_VALUE)) {
                        this.f = true;
                        animate().setDuration(this.l).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.irmo.render.view.IrmoScratchCardView.1
                            public static ChangeQuickRedirect a;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                Object[] objArr3 = {valueAnimator};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fbe0b06a7ce4a66fc81fa5599f707073", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fbe0b06a7ce4a66fc81fa5599f707073");
                                    return;
                                }
                                float animatedFraction = valueAnimator.getAnimatedFraction();
                                if (animatedFraction == 1.0f && IrmoScratchCardView.this.m != null) {
                                    IrmoScratchCardView.this.m.a();
                                }
                                IrmoScratchCardView.this.setAlpha(1.0f - animatedFraction);
                            }
                        }).setInterpolator(new AccelerateInterpolator()).start();
                        break;
                    } else {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98abe053ec9f0636d840af845a7a47a5");
                        break;
                    }
                }
                break;
            case 2:
                Object[] objArr3 = {Float.valueOf(x), Float.valueOf(y)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b117fad9d107ff184d85be61de3b97fd", RobustBitConfig.DEFAULT_VALUE)) {
                    if (Math.sqrt(Math.pow(x - this.r, 2.0d) + Math.pow(y - this.s, 2.0d)) >= 30.0d) {
                        this.r = x;
                        this.s = y;
                        this.p.lineTo(x, y);
                        invalidate();
                        a(x, y - (this.j / 2.0f));
                        a(x, (this.j / 2.0f) + y);
                        a(x - (this.j / 2.0f), y);
                        a(x + (this.j / 2.0f), y);
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b117fad9d107ff184d85be61de3b97fd");
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "240f7c4e550fbee195b72a7a23dc8ddd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "240f7c4e550fbee195b72a7a23dc8ddd")).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setTouchWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "649d34b87ab5226f33cf0c0792c4c9e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "649d34b87ab5226f33cf0c0792c4c9e4");
        } else if (i <= 0) {
        } else {
            this.j = i * getResources().getDisplayMetrics().density;
            this.n.setStrokeWidth(this.j);
            b();
        }
    }

    public float getTouchWidth() {
        return this.j;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ca6fbc4c9c7492f32e86e76ce1b4c0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ca6fbc4c9c7492f32e86e76ce1b4c0a");
        } else if (getWidth() > 0 && getHeight() > 0) {
            for (int i = 0; i < this.g[0].length; i++) {
                for (int i2 = 0; i2 < this.g.length; i2++) {
                    this.g[i2][i] = false;
                }
            }
            this.d = 0;
            this.p.reset();
            this.h = true;
        }
    }

    public void setClearPercent(float f) {
        if (f <= 0.0f) {
            return;
        }
        this.k = f;
    }

    private void a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "546387b0ed1e00e5258bae2f04d80620", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "546387b0ed1e00e5258bae2f04d80620");
            return;
        }
        if (this.o != null && !this.o.isRecycled()) {
            this.o.recycle();
        }
        this.o = bitmap;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6db723e8524e3aa67d1fa893443ce452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6db723e8524e3aa67d1fa893443ce452");
            return;
        }
        super.onDraw(canvas);
        if (this.o == null || this.o.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.o, (Rect) null, this.i, this.n);
        canvas.save();
        this.n.setXfermode(this.t);
        canvas.drawPath(this.p, this.n);
        this.n.setXfermode(null);
        canvas.restore();
    }
}
