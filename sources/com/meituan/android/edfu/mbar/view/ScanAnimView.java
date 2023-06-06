package com.meituan.android.edfu.mbar.view;

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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ScanAnimView extends View {
    public static ChangeQuickRedirect a;
    ValueAnimator b;
    boolean c;
    private int d;
    private final Paint e;
    private final int f;
    private Drawable g;
    private Rect h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private Rect n;

    public ScanAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f1716ee4c3a32640bce5f901ef2004f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f1716ee4c3a32640bce5f901ef2004f");
            return;
        }
        this.e = new Paint(1);
        Resources resources = getResources();
        this.f = resources.getColor(R.color.mbar_viewfinder_mask);
        this.g = resources.getDrawable(R.drawable.mbar_scanner_line);
        this.h = new Rect();
        this.i = a(5);
        this.j = a(6);
        this.k = a(4);
        this.l = a(17);
        this.m = a(1);
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public final void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09206a80eddcfcc66cd091d4af0e955e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09206a80eddcfcc66cd091d4af0e955e");
            return;
        }
        final Rect framingRect = getFramingRect();
        if (framingRect == null) {
            return;
        }
        Object[] objArr2 = {framingRect};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7279b4490ac0403c191c833735f83cc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7279b4490ac0403c191c833735f83cc8");
        } else if (framingRect != null && !this.c) {
            this.b = ValueAnimator.ofInt(0, framingRect.bottom - framingRect.top);
            this.b.setDuration(4000L);
            this.b.setRepeatCount(-1);
            this.b.setRepeatMode(1);
            this.b.setInterpolator(new AccelerateDecelerateInterpolator());
            this.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.android.edfu.mbar.view.ScanAnimView.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr3 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "388cf6830cef81e4525d56b53fe6d1de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "388cf6830cef81e4525d56b53fe6d1de");
                        return;
                    }
                    ScanAnimView.this.d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (ScanAnimView.this.d >= framingRect.bottom - framingRect.top) {
                        ScanAnimView.this.d = 0;
                    }
                    ScanAnimView.this.invalidate();
                }
            });
            this.b.start();
            this.c = true;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.e.setColor(this.f);
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, framingRect.top, this.e);
        canvas.drawRect(0.0f, framingRect.top, framingRect.left, framingRect.bottom + 1, this.e);
        canvas.drawRect(framingRect.right + 1, framingRect.top, f, framingRect.bottom + 1, this.e);
        canvas.drawRect(0.0f, framingRect.bottom + 1, f, height, this.e);
        this.e.setColor(-1);
        canvas.drawRect(framingRect.left - this.m, framingRect.top - this.m, framingRect.left, framingRect.bottom + this.m, this.e);
        canvas.drawRect(framingRect.left - this.m, framingRect.top - this.m, framingRect.right + this.m, framingRect.top, this.e);
        canvas.drawRect(framingRect.right, framingRect.top - this.m, framingRect.right + this.m, framingRect.bottom + this.m, this.e);
        canvas.drawRect(framingRect.left - this.m, framingRect.bottom, framingRect.right + this.m, framingRect.bottom + this.m, this.e);
        this.e.setColor(getResources().getColor(R.color.mbar_corner));
        canvas.drawRect(framingRect.left, framingRect.top, framingRect.left + this.l, framingRect.top + this.k, this.e);
        canvas.drawRect(framingRect.left, framingRect.top, framingRect.left + this.k, framingRect.top + this.l, this.e);
        canvas.drawRect(framingRect.right - this.l, framingRect.top, framingRect.right, framingRect.top + this.k, this.e);
        canvas.drawRect(framingRect.right - this.k, framingRect.top, framingRect.right, framingRect.top + this.l, this.e);
        canvas.drawRect(framingRect.left, framingRect.bottom - this.l, framingRect.left + this.k, framingRect.bottom, this.e);
        canvas.drawRect(framingRect.left, framingRect.bottom - this.k, framingRect.left + this.l, framingRect.bottom, this.e);
        canvas.drawRect(framingRect.right - this.l, framingRect.bottom - this.k, framingRect.right, framingRect.bottom, this.e);
        canvas.drawRect(framingRect.right - this.k, framingRect.bottom - this.l, framingRect.right, framingRect.bottom, this.e);
        this.h.set(framingRect.left - this.j, (framingRect.top + this.d) - (this.i / 2), framingRect.right + this.j, framingRect.top + (this.i / 2) + this.d);
        this.g.setBounds(this.h);
        this.g.draw(canvas);
    }

    public final Rect getFramingRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9bb88bfdbfd7d403d1844290978e49f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9bb88bfdbfd7d403d1844290978e49f");
        }
        if (this.n == null) {
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
            this.n = new Rect(i2, i3, min + i2, i + i3);
        }
        return this.n;
    }

    public final void setRect(Rect rect) {
        this.n = rect;
    }

    private static int a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), 240, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df9f14f27329d06b32f42c55508df38a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df9f14f27329d06b32f42c55508df38a")).intValue();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "707deab00bd9560dd46c7c5e2008e627", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "707deab00bd9560dd46c7c5e2008e627")).intValue() : (int) (i * getResources().getDisplayMetrics().density);
    }
}
