package com.meituan.msc.modules.api.msi.components.coverview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class k extends FrameLayout {
    public static ChangeQuickRedirect c;
    private float a;
    private float b;
    public FrameLayout d;
    public d e;
    public Path f;
    public RectF g;
    public boolean h;
    public boolean i;
    private int j;
    private int k;
    private Paint l;
    private ScrollView m;

    public k(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c762a747d7bffe3eab50d4b80e6a1d01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c762a747d7bffe3eab50d4b80e6a1d01");
            return;
        }
        this.l = new Paint();
        this.f = new Path();
        this.g = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.h = true;
        this.i = true;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76b8a944e8806669351c9a2dd26d9b6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76b8a944e8806669351c9a2dd26d9b6b");
            return;
        }
        this.m = new ScrollView(getContext()) { // from class: com.meituan.msc.modules.api.msi.components.coverview.k.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View
            public final void onScrollChanged(int i, int i2, int i3, int i4) {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c8ed0f552db9996eabd9efdd0f6665d1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c8ed0f552db9996eabd9efdd0f6665d1");
                    return;
                }
                super.onScrollChanged(i, i2, i3, i4);
                if (k.this.e != null) {
                    k.this.e.a(k.this.d, i, i2);
                }
            }

            @Override // android.widget.ScrollView, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                Object[] objArr3 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b98342c9d112ff740ccb760b6c55812c", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b98342c9d112ff740ccb760b6c55812c")).booleanValue();
                }
                if (motionEvent.getAction() == 2 && !k.this.h) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.d = new FrameLayout(getContext());
        super.addView(this.m, 0, new FrameLayout.LayoutParams(-1, -1));
        this.m.addView(this.d, 0, new FrameLayout.LayoutParams(-1, -2));
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setAntiAlias(true);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z = true;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fae0c7a3f4f9198d12231c197ca07715", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fae0c7a3f4f9198d12231c197ca07715");
            return;
        }
        float f = 0.0f;
        if (this.b > 0.0f) {
            canvas.save();
            this.f.reset();
            this.g.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f.addRoundRect(this.g, this.b, this.b, Path.Direction.CW);
            canvas.clipPath(this.f);
        }
        if (this.k != 0) {
            canvas.drawColor(this.k);
        }
        if (this.a > 0.0f) {
            float f2 = this.a / 2.0f;
            this.g.set(f2, f2, getWidth() - f2, getHeight() - f2);
            canvas.drawRoundRect(this.g, this.b, this.b, this.l);
            if (this.b > 0.0f) {
                canvas.restore();
            }
            canvas.save();
            this.f.reset();
            if (this.b > 0.0f && this.b - this.a > 0.0f) {
                f = this.b - this.a;
            }
            this.g.set(this.a, this.a, getWidth() - this.a, getHeight() - this.a);
            this.f.addRoundRect(this.g, f, f, Path.Direction.CW);
            canvas.clipPath(this.f);
        } else if (this.b <= 0.0f) {
            z = false;
        }
        int save = canvas.save();
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (z) {
            canvas.restore();
        }
    }

    public final int getChildViewCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4dcfc1de8ac7afeadb25d2ba1ae220a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4dcfc1de8ac7afeadb25d2ba1ae220a")).intValue() : this.d.getChildCount();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d858020a6442138a633a44bc28a7ff8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d858020a6442138a633a44bc28a7ff8a");
        } else {
            this.d.addView(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce6f4eba28dc03ec16e5be0303018fa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce6f4eba28dc03ec16e5be0303018fa8");
        } else {
            this.d.removeView(view);
        }
    }

    public final void setBorderRadius(float f) {
        this.b = f;
    }

    public final void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9be53519e1379b285a8d1d1fc3b33e7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9be53519e1379b285a8d1d1fc3b33e7c");
            return;
        }
        this.j = i;
        this.l.setColor(i);
    }

    public final void setBorderWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4591e8473c09325d3f41008532a42b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4591e8473c09325d3f41008532a42b1");
            return;
        }
        this.a = f;
        this.l.setStrokeWidth(f);
    }

    public final void setBgColor(int i) {
        this.k = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73d028be9f5c5a1e09cb374362a6ad2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73d028be9f5c5a1e09cb374362a6ad2c")).booleanValue();
        }
        if (motionEvent.getActionMasked() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.b > 0.0f) {
                double pow = Math.pow(this.b, 2.0d);
                float width = getWidth();
                float height = getHeight();
                if (x < this.b) {
                    if (y < this.b) {
                        if (Math.pow(this.b - y, 2.0d) + Math.pow(this.b - x, 2.0d) > pow) {
                            return false;
                        }
                    } else if (y > height - this.b && Math.pow((this.b + y) - height, 2.0d) + Math.pow(this.b - x, 2.0d) > pow) {
                        return false;
                    }
                } else if (x > width - this.b) {
                    if (y < this.b) {
                        if (Math.pow(this.b - y, 2.0d) + Math.pow((x + this.b) - width, 2.0d) > pow) {
                            return false;
                        }
                    } else if (y > height - this.b && Math.pow((this.b + y) - height, 2.0d) + Math.pow((x + this.b) - width, 2.0d) > pow) {
                        return false;
                    }
                }
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setScrollVertical(boolean z) {
        this.h = z;
    }

    public void setScrollHorizontal(boolean z) {
        this.i = z;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bae4dbd222d35522814961d3df65888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bae4dbd222d35522814961d3df65888");
            return;
        }
        this.m.scrollTo(i, i2);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74108325bd21fb0907a1abe821f63941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74108325bd21fb0907a1abe821f63941");
            return;
        }
        super.onDetachedFromWindow();
        this.e = null;
    }

    public final FrameLayout getRootFrame() {
        return this.d;
    }
}
