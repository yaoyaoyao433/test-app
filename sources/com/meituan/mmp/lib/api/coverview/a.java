package com.meituan.mmp.lib.api.coverview;

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
public class a extends FrameLayout {
    public static ChangeQuickRedirect a;
    public FrameLayout b;
    public f c;
    public Path d;
    public RectF e;
    public boolean f;
    public boolean g;
    private float h;
    private float i;
    private int j;
    private int k;
    private Paint l;
    private ScrollView m;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1ea5aaa5784836da53b0530249800b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1ea5aaa5784836da53b0530249800b8");
            return;
        }
        this.l = new Paint();
        this.d = new Path();
        this.e = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f = true;
        this.g = true;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "547387aa02ebc37917aeaa55fc2656c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "547387aa02ebc37917aeaa55fc2656c1");
            return;
        }
        this.m = new ScrollView(getContext()) { // from class: com.meituan.mmp.lib.api.coverview.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View
            public final void onScrollChanged(int i, int i2, int i3, int i4) {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb264f0ee453a5799441556793ae14b5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb264f0ee453a5799441556793ae14b5");
                    return;
                }
                super.onScrollChanged(i, i2, i3, i4);
                if (a.this.c != null) {
                    a.this.c.a(a.this.b, i, i2);
                }
            }

            @Override // android.widget.ScrollView, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                Object[] objArr3 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "16d6d1249a77a7acad20a07f7886f834", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "16d6d1249a77a7acad20a07f7886f834")).booleanValue();
                }
                if (motionEvent.getAction() == 2 && !a.this.f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.b = new FrameLayout(getContext());
        super.addView(this.m, 0, new FrameLayout.LayoutParams(-1, -1));
        this.m.addView(this.b, 0, new FrameLayout.LayoutParams(-1, -2));
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setAntiAlias(true);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z = true;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26be089601fd220a729a370765dcc6f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26be089601fd220a729a370765dcc6f6");
            return;
        }
        float f = 0.0f;
        if (this.i > 0.0f) {
            canvas.save();
            this.d.reset();
            this.e.set(0.0f, 0.0f, getWidth(), getHeight());
            this.d.addRoundRect(this.e, this.i, this.i, Path.Direction.CW);
            canvas.clipPath(this.d);
        }
        if (this.k != 0) {
            canvas.drawColor(this.k);
        }
        if (this.h > 0.0f) {
            float f2 = this.h / 2.0f;
            this.e.set(f2, f2, getWidth() - f2, getHeight() - f2);
            canvas.drawRoundRect(this.e, this.i, this.i, this.l);
            if (this.i > 0.0f) {
                canvas.restore();
            }
            canvas.save();
            this.d.reset();
            if (this.i > 0.0f && this.i - this.h > 0.0f) {
                f = this.i - this.h;
            }
            this.e.set(this.h, this.h, getWidth() - this.h, getHeight() - this.h);
            this.d.addRoundRect(this.e, f, f, Path.Direction.CW);
            canvas.clipPath(this.d);
        } else if (this.i <= 0.0f) {
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
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ae452bc55579b739fb3c3b61c514d7f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ae452bc55579b739fb3c3b61c514d7f")).intValue() : this.b.getChildCount();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cc7a119e9ee7af6780b1002ed20d688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cc7a119e9ee7af6780b1002ed20d688");
        } else {
            this.b.addView(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a6e12b3c4980a57350362f26f923b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a6e12b3c4980a57350362f26f923b57");
        } else {
            this.m.removeView(view);
        }
    }

    public final void setBorderRadius(float f) {
        this.i = f;
    }

    public final void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c44c5e6f9b3d4f06136edda0d380ae50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c44c5e6f9b3d4f06136edda0d380ae50");
            return;
        }
        this.j = i;
        this.l.setColor(i);
    }

    public final void setBorderWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d72ce4a993c552e25bef6bab3e61e40a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d72ce4a993c552e25bef6bab3e61e40a");
            return;
        }
        this.h = f;
        this.l.setStrokeWidth(f);
    }

    public final void setBgColor(int i) {
        this.k = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "998c99296c79119dfe7529202501072d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "998c99296c79119dfe7529202501072d")).booleanValue();
        }
        if (motionEvent.getActionMasked() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.i > 0.0f) {
                double pow = Math.pow(this.i, 2.0d);
                float width = getWidth();
                float height = getHeight();
                if (x < this.i) {
                    if (y < this.i) {
                        if (Math.pow(this.i - y, 2.0d) + Math.pow(this.i - x, 2.0d) > pow) {
                            return false;
                        }
                    } else if (y > height - this.i && Math.pow((this.i + y) - height, 2.0d) + Math.pow(this.i - x, 2.0d) > pow) {
                        return false;
                    }
                } else if (x > width - this.i) {
                    if (y < this.i) {
                        if (Math.pow(this.i - y, 2.0d) + Math.pow((x + this.i) - width, 2.0d) > pow) {
                            return false;
                        }
                    } else if (y > height - this.i && Math.pow((this.i + y) - height, 2.0d) + Math.pow((x + this.i) - width, 2.0d) > pow) {
                        return false;
                    }
                }
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setScrollVertical(boolean z) {
        this.f = z;
    }

    public void setScrollHorizontal(boolean z) {
        this.g = z;
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3447460f05026783e67efd99c604e9d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3447460f05026783e67efd99c604e9d0");
            return;
        }
        this.m.scrollTo(i, i2);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78273574624ba59dd60e08f8fa9c9d92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78273574624ba59dd60e08f8fa9c9d92");
            return;
        }
        super.onDetachedFromWindow();
        this.c = null;
    }

    public final FrameLayout getRootFrame() {
        return this.b;
    }
}
