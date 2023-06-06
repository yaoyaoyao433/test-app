package com.sankuai.waimai.platform.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.utils.d;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public final class c extends FrameLayout {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    private final int d;
    private final Paint e;
    private final int f;
    private View g;
    private TextView h;
    private boolean i;

    public static View a(View view, Context context, Object obj) {
        Object[] objArr = {view, context, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "caf9400cc61518eafbb97ac4f417bf66", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "caf9400cc61518eafbb97ac4f417bf66") : a(view, context, obj, -10438946);
    }

    public static View a(View view, Context context, Object obj, int i) {
        Object[] objArr = {view, context, obj, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "680809370702b1dba3902cd2a9886091", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "680809370702b1dba3902cd2a9886091") : (context == null || !d.a(context) || view == null || obj == null) ? view : new c(context, obj, view, i);
    }

    private c(@NonNull Context context, @NonNull Object obj, @NonNull View view, int i) {
        super(context);
        Object[] objArr = {context, obj, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77d52681f18f57015e66969500e48d78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77d52681f18f57015e66969500e48d78");
            return;
        }
        this.i = false;
        this.d = i;
        this.f = g.a(getContext(), 3.0f);
        this.e = getBorderPaint();
        this.g = view;
        View view2 = this.g;
        Object[] objArr2 = {view2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c0e4b4e235c58927e6a02a2fad7acf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c0e4b4e235c58927e6a02a2fad7acf0");
        } else if (view2 == null || view2.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            addView(view2, new FrameLayout.LayoutParams(-1, -1));
            if (layoutParams != null) {
                setLayoutParams(layoutParams);
            }
        }
        Object[] objArr3 = {context, obj};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "755914b54ed7309327cc6a8a6c996d98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "755914b54ed7309327cc6a8a6c996d98");
            return;
        }
        this.h = new TextView(context);
        this.h.setTextSize(10.0f);
        this.h.setTextColor(-1);
        this.h.setBackgroundColor(this.d);
        TextView textView = this.h;
        Object[] objArr4 = {obj};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        textView.setText(PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b299d9093f8a43e6f69425887ff227d0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b299d9093f8a43e6f69425887ff227d0") : obj.getClass().getSimpleName());
        this.h.setMaxLines(4);
        int a2 = g.a(context, 3.0f);
        this.h.setPadding(a2, 0, a2, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 49;
        addView(this.h, layoutParams2);
    }

    @NonNull
    private Paint getBorderPaint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f140c0f4472e471e22a876aaec41d966", RobustBitConfig.DEFAULT_VALUE)) {
            return (Paint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f140c0f4472e471e22a876aaec41d966");
        }
        Paint paint = new Paint(1);
        paint.setStrokeWidth(this.f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.d);
        return paint;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c03f39e646f8a42bf9c0cdccc03d4325", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c03f39e646f8a42bf9c0cdccc03d4325");
            return;
        }
        super.dispatchDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.e);
        if (this.i) {
            canvas.drawColor(870211716);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75b461c7ec27b55c9af1023acf568064", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75b461c7ec27b55c9af1023acf568064")).booleanValue();
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Object[] objArr2 = {Integer.valueOf(x), Integer.valueOf(y)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a520427e7a3e19d5087240248b9db787", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a520427e7a3e19d5087240248b9db787")).booleanValue();
        } else {
            z = this.h.getLeft() <= x && x <= this.h.getRight() && this.h.getTop() <= y && y <= this.h.getBottom();
        }
        if (z && motionEvent.getAction() == 0) {
            setBlockSelected(true);
        }
        if (this.i && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            setBlockSelected(false);
        }
        if (this.i) {
            requestDisallowInterceptTouchEvent(true);
            switch (motionEvent.getAction()) {
                case 0:
                    this.b = x;
                    this.c = y;
                    break;
                case 1:
                case 3:
                    this.h.offsetLeftAndRight(x - this.b);
                    this.h.offsetTopAndBottom(y - this.c);
                    break;
                case 2:
                    this.h.offsetLeftAndRight(x - this.b);
                    this.h.offsetTopAndBottom(y - this.c);
                    this.b = x;
                    this.c = y;
                    break;
            }
            return true;
        }
        requestDisallowInterceptTouchEvent(false);
        return super.dispatchTouchEvent(motionEvent);
    }

    private void setBlockSelected(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c94ea0137824fbf1057a98daaf3d5d0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c94ea0137824fbf1057a98daaf3d5d0f");
        } else if (this.i != z) {
            this.i = z;
            int i = z ? -2203516 : this.d;
            this.e.setColor(i);
            this.h.setBackgroundColor(i);
            invalidate();
        }
    }
}
