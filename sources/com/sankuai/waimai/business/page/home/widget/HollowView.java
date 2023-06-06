package com.sankuai.waimai.business.page.home.widget;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HollowView extends View {
    public static ChangeQuickRedirect a;
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public Paint g;
    public ValueAnimator h;
    private final RectF i;
    private boolean j;
    private float k;
    private float l;
    private float m;
    private int n;
    private int o;
    private Path p;
    private Paint q;
    private Paint r;
    private a s;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z);
    }

    public HollowView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc7a02c7aecded0c57f7b8e9282d30d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc7a02c7aecded0c57f7b8e9282d30d0");
            return;
        }
        this.i = new RectF();
        a();
    }

    public HollowView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11522817bbb484342e313523404aa480", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11522817bbb484342e313523404aa480");
            return;
        }
        this.i = new RectF();
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de9ddd7f8c740878883974d517c18614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de9ddd7f8c740878883974d517c18614");
            return;
        }
        this.p = new Path();
        this.q = new Paint();
        this.r = new Paint();
    }

    public void setClickThroughPoiCircle(boolean z) {
        this.j = z;
    }

    public final void a(float f, float f2, float f3, float f4, int i) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "586092996a717aad2e5c418b63ba7915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "586092996a717aad2e5c418b63ba7915");
            return;
        }
        this.k = f;
        this.l = f2;
        this.b = f3;
        this.m = f4;
        this.n = i;
        this.i.set((this.k - this.b) - this.m, (this.l - this.b) - this.m, this.k + this.b + this.m, this.l + this.b + this.m);
        invalidate();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033554585402402cab7c64f5bf798180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033554585402402cab7c64f5bf798180");
            return;
        }
        setBackground(null);
        this.o = i;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "731cdce44eaa95dbf8d42b0a1001e240", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "731cdce44eaa95dbf8d42b0a1001e240");
            return;
        }
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        this.p.reset();
        this.p.addCircle(this.k, this.l, this.b, Path.Direction.CCW);
        if (Build.VERSION.SDK_INT >= 28) {
            canvas.clipOutPath(this.p);
        } else {
            canvas.clipPath(this.p, Region.Op.XOR);
        }
        this.q.reset();
        this.r.setStyle(Paint.Style.FILL);
        this.r.setAntiAlias(true);
        this.q.setColor(this.o);
        canvas.drawRect(0.0f, 0.0f, width, height, this.q);
        this.r.reset();
        if (this.m > 0.0f && this.n != 0) {
            this.r.setStyle(Paint.Style.STROKE);
            this.r.setAntiAlias(true);
            this.r.setColor(this.n);
            this.r.setStrokeWidth(this.m);
            canvas.drawCircle(this.k, this.l, this.b, this.r);
        }
        if (this.d <= 0.0f || this.c <= 0.0f || this.e == 0) {
            return;
        }
        this.g.reset();
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setAntiAlias(true);
        this.g.setColor(this.e);
        this.g.setAlpha(this.f);
        this.g.setStrokeWidth(this.d);
        canvas.drawCircle(this.k, this.l, this.c, this.g);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Activity activity;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3c2d8960a5c6e4bd8e09b824819725d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3c2d8960a5c6e4bd8e09b824819725d")).booleanValue();
        }
        if (this.i.contains(motionEvent.getX(), motionEvent.getY())) {
            if (this.j && (activity = getActivity()) != null) {
                activity.getWindow().getDecorView().dispatchTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 1 && this.s != null) {
                this.s.a(this.j);
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d72ce57222c6e365954f40ffa63d55fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d72ce57222c6e365954f40ffa63d55fc");
            return;
        }
        super.onDetachedFromWindow();
        if (this.h != null) {
            this.h.cancel();
            this.h.removeAllUpdateListeners();
        }
    }

    public void setOnHollowClickListener(a aVar) {
        this.s = aVar;
    }

    @NonNull
    public RectF getHollowRegion() {
        return this.i;
    }

    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dd0563e3e99dbc9502a68022d5f3b33", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dd0563e3e99dbc9502a68022d5f3b33");
        }
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
