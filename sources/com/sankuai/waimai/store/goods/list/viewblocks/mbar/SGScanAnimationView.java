package com.sankuai.waimai.store.goods.list.viewblocks.mbar;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGScanAnimationView extends View {
    public static ChangeQuickRedirect a;
    private int b;
    private final Paint c;
    private final int d;
    private Drawable e;
    private Rect f;
    private int g;
    private int h;
    private int i;
    private int j;
    private ValueAnimator k;
    private boolean l;
    private Rect m;

    public SGScanAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1df129f331ccf0a37b90f3a9ecd023eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1df129f331ccf0a37b90f3a9ecd023eb");
            return;
        }
        this.c = new Paint(1);
        Resources resources = getResources();
        this.d = resources.getColor(R.color.mbar_viewfinder_mask);
        this.e = resources.getDrawable(R.drawable.wm_sg_scan_line);
        this.f = new Rect();
        this.g = a(23);
        this.h = a(3);
        this.i = a(17);
        this.j = a(1);
    }

    public final void a(final Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0285677f965109f598ca136f6c9cee89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0285677f965109f598ca136f6c9cee89");
        } else if (rect == null || this.l) {
        } else {
            this.e.setVisible(true, false);
            this.k = ValueAnimator.ofInt(0, rect.bottom - rect.top);
            this.k.setDuration(MetricsAnrManager.ANR_THRESHOLD);
            this.k.setRepeatCount(-1);
            this.k.setRepeatMode(1);
            this.k.setInterpolator(new AccelerateDecelerateInterpolator());
            this.k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.SGScanAnimationView.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a6d98ac1539ef4305ba0f23bc3c0859", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a6d98ac1539ef4305ba0f23bc3c0859");
                        return;
                    }
                    SGScanAnimationView.this.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (SGScanAnimationView.this.b >= (rect.bottom - rect.top) - (SGScanAnimationView.this.g / 2)) {
                        SGScanAnimationView.this.b = 0;
                    }
                    SGScanAnimationView.this.invalidate();
                }
            });
            this.k.start();
            this.l = true;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4c2943eb4342286bb412bba0e7285f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4c2943eb4342286bb412bba0e7285f3");
        } else if (this.k == null) {
        } else {
            this.e.setVisible(false, false);
            this.k.cancel();
            this.k.end();
            this.k = null;
            this.l = false;
        }
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7df71f8bc015ef14a1fc7a4508fe5dc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7df71f8bc015ef14a1fc7a4508fe5dc4");
            return;
        }
        Rect framingRect = getFramingRect();
        if (framingRect == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.c.setColor(this.d);
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, framingRect.top, this.c);
        canvas.drawRect(0.0f, framingRect.top, framingRect.left, framingRect.bottom + 1, this.c);
        canvas.drawRect(framingRect.right + 1, framingRect.top, f, framingRect.bottom + 1, this.c);
        canvas.drawRect(0.0f, framingRect.bottom + 1, f, height, this.c);
        this.c.setColor(-1);
        canvas.drawRect(framingRect.left, framingRect.top, framingRect.left + this.i, framingRect.top + this.h, this.c);
        canvas.drawRect(framingRect.left, framingRect.top, framingRect.left + this.h, framingRect.top + this.i, this.c);
        canvas.drawRect(framingRect.right - this.i, framingRect.top, framingRect.right, framingRect.top + this.h, this.c);
        canvas.drawRect(framingRect.right - this.h, framingRect.top, framingRect.right, framingRect.top + this.i, this.c);
        canvas.drawRect(framingRect.left, framingRect.bottom - this.i, framingRect.left + this.h, framingRect.bottom, this.c);
        canvas.drawRect(framingRect.left, framingRect.bottom - this.h, framingRect.left + this.i, framingRect.bottom, this.c);
        canvas.drawRect(framingRect.right - this.i, framingRect.bottom - this.h, framingRect.right, framingRect.bottom, this.c);
        canvas.drawRect(framingRect.right - this.h, framingRect.bottom - this.i, framingRect.right, framingRect.bottom, this.c);
        this.f.set(framingRect.left, framingRect.top + this.b, framingRect.right, framingRect.top + (this.g / 2) + this.b);
        this.e.setBounds(this.f);
        this.e.draw(canvas);
    }

    public Rect getFramingRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29c74379db5592c791b2f327e4138e6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29c74379db5592c791b2f327e4138e6b");
        }
        if (this.m == null) {
            Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            Point point2 = new Point();
            point2.x = point.y;
            point2.y = point.x;
            int min = Math.min(a(point2.y, 240, 1200), a(point2.x, 240, 675));
            int i = min - 35;
            if (i <= 0) {
                i = min;
            }
            int i2 = (point2.y - min) / 2;
            int i3 = ((point2.x - i) / 2) - 45;
            if (i3 <= 0) {
                i3 = (point2.x - i) / 2;
            }
            this.m = new Rect(i2, i3, min + i2, i + i3);
        }
        return this.m;
    }

    public void setRect(Rect rect) {
        this.m = rect;
    }

    private static int a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), 240, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a71c3d9b9d27f24e1b8e121ab6b16c84", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a71c3d9b9d27f24e1b8e121ab6b16c84")).intValue();
        }
        int i4 = (i * 5) / 8;
        if (i4 < 240) {
            return 240;
        }
        return i4 > i3 ? i3 : i4;
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b42dca4d5a363d3c685003866d1a33d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b42dca4d5a363d3c685003866d1a33d")).intValue() : (int) (i * getResources().getDisplayMetrics().density);
    }
}
