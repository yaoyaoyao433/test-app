package com.meituan.android.cube.debug;

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
import com.meituan.android.cube.core.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class a extends FrameLayout {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    private final int d;
    private final Paint e;
    private View f;
    private TextView g;
    private boolean h;

    public static View a(View view, Context context, f fVar, int i) {
        boolean z = false;
        Object[] objArr = {view, context, fVar, -2203478};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88c3565563035dbc86a99cedb5ae628b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88c3565563035dbc86a99cedb5ae628b");
        }
        if (context != null) {
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "29a87f1fbcd665153e5ea153517b8c4b", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "29a87f1fbcd665153e5ea153517b8c4b")).booleanValue();
            } else {
                com.meituan.android.cube.a.a();
            }
            if (z && view != null && fVar != null) {
                return new a(context, fVar, view, -2203478);
            }
        }
        return view;
    }

    private a(@NonNull Context context, @NonNull f fVar, @NonNull View view, int i) {
        super(context);
        Object[] objArr = {context, fVar, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20e7af2fedb8490a2bc8ecc4567c7b08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20e7af2fedb8490a2bc8ecc4567c7b08");
            return;
        }
        this.h = false;
        this.d = i;
        this.e = getBorderPaint();
        this.f = view;
        View view2 = this.f;
        Object[] objArr2 = {view2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67969ad9e937a08584afe8d0bd74a7ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67969ad9e937a08584afe8d0bd74a7ec");
        } else {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            addView(view2, new FrameLayout.LayoutParams(-1, -1));
            if (layoutParams != null) {
                setLayoutParams(layoutParams);
            }
        }
        Object[] objArr3 = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "99dfcc798dffa47ffd632bbd98dcf2da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "99dfcc798dffa47ffd632bbd98dcf2da");
            return;
        }
        this.g = new TextView(context);
        this.g.setTextSize(10.0f);
        this.g.setTextColor(-1);
        this.g.setBackgroundColor(this.d);
        TextView textView = this.g;
        Object[] objArr4 = {fVar};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        textView.setText(PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3506eec789d2b0a2583db33e5ce45f3b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3506eec789d2b0a2583db33e5ce45f3b") : fVar.getClass().getSimpleName());
        this.g.setMaxLines(4);
        this.g.setPadding(3, 0, 3, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 49;
        addView(this.g, layoutParams2);
    }

    @NonNull
    private Paint getBorderPaint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e98fa7460a2c1f381d8698fb61f04ffd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Paint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e98fa7460a2c1f381d8698fb61f04ffd");
        }
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.d);
        return paint;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93287de523cb1fa429e3cee8fcb46249", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93287de523cb1fa429e3cee8fcb46249");
            return;
        }
        super.dispatchDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.e);
        if (this.h) {
            canvas.drawColor(870211716);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0f4e9a69729231c5bbee8a3c3d25513", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0f4e9a69729231c5bbee8a3c3d25513")).booleanValue();
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Object[] objArr2 = {Integer.valueOf(x), Integer.valueOf(y)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "582c9be0f377fe5f83ae8888add77e36", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "582c9be0f377fe5f83ae8888add77e36")).booleanValue();
        } else {
            z = this.g.getLeft() <= x && x <= this.g.getRight() && this.g.getTop() <= y && y <= this.g.getBottom();
        }
        if (z && motionEvent.getAction() == 0) {
            setBlockSelected(true);
        }
        if (this.h && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            setBlockSelected(false);
        }
        if (this.h) {
            requestDisallowInterceptTouchEvent(true);
            switch (motionEvent.getAction()) {
                case 0:
                    this.b = x;
                    this.c = y;
                    break;
                case 1:
                case 3:
                    this.g.offsetLeftAndRight(x - this.b);
                    this.g.offsetTopAndBottom(y - this.c);
                    break;
                case 2:
                    this.g.offsetLeftAndRight(x - this.b);
                    this.g.offsetTopAndBottom(y - this.c);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b0258a9f9f7056c901c96fcf9126b13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b0258a9f9f7056c901c96fcf9126b13");
        } else if (this.h != z) {
            this.h = z;
            int i = z ? -2203516 : this.d;
            this.e.setColor(i);
            this.g.setBackgroundColor(i);
            invalidate();
        }
    }
}
