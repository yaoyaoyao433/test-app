package com.sankuai.waimai.store.drug.newwidgets.indicator.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class IndicateView extends View {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public HorizontalScrollView f;
    public int g;
    public LinearLayout h;
    public TabLayout i;
    public a j;
    private final int k;
    private Paint l;
    private Rect m;
    private RectF n;
    private Drawable o;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(float f, int i, int i2);
    }

    public IndicateView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae165ffbb8b18be31eb4ab1ad8a18ffc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae165ffbb8b18be31eb4ab1ad8a18ffc");
            return;
        }
        this.k = 0;
        this.b = 10;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.g = 20;
        this.m = new Rect();
        this.n = new RectF();
        a();
    }

    public IndicateView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46682d0c2319742cffe0f3e9167be033", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46682d0c2319742cffe0f3e9167be033");
            return;
        }
        this.k = 0;
        this.b = 10;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.g = 20;
        this.m = new Rect();
        this.n = new RectF();
        a();
    }

    public IndicateView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb9d89f9b64122d4c45190bb85a43e12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb9d89f9b64122d4c45190bb85a43e12");
            return;
        }
        this.k = 0;
        this.b = 10;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.g = 20;
        this.m = new Rect();
        this.n = new RectF();
        a();
    }

    @TargetApi(21)
    public IndicateView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1ecd4e376fef5caaed73226c32b7dd5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1ecd4e376fef5caaed73226c32b7dd5");
            return;
        }
        this.k = 0;
        this.b = 10;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.g = 20;
        this.m = new Rect();
        this.n = new RectF();
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f43bdfaebbc3dabb3e38af8105a25090", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f43bdfaebbc3dabb3e38af8105a25090");
            return;
        }
        this.g = h.a(getContext(), 20.0f);
        this.l = new Paint();
        this.l.setColor(SupportMenu.CATEGORY_MASK);
        this.l.setAntiAlias(true);
        this.l.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dec9e5b095ff800971ccbaba09634f31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dec9e5b095ff800971ccbaba09634f31");
        } else if (this.o == null) {
            this.n.left = this.c + getPaddingLeft();
            this.n.top = 0.0f;
            this.n.right = this.d;
            this.n.bottom = this.b;
            canvas.drawRoundRect(this.n, 100.0f, 100.0f, this.l);
        } else {
            this.m.left = this.c + getPaddingLeft();
            this.m.top = 0;
            this.m.right = this.d;
            this.m.bottom = this.b;
            this.o.setBounds(this.m);
            this.o.draw(canvas);
        }
    }

    public void setOnPercentageListener(a aVar) {
        this.j = aVar;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b67a8a962ee186294202eff86050a038", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b67a8a962ee186294202eff86050a038");
            return;
        }
        this.c = i;
        this.d = i2;
        invalidate();
    }

    public void setHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebfd450d64bb3289371507ad24c1ed79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebfd450d64bb3289371507ad24c1ed79");
            return;
        }
        this.b = i;
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b415b55cff0de6c5f923d175a10990cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b415b55cff0de6c5f923d175a10990cb");
            return;
        }
        this.l.setColor(i);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddde859c3fbb11f02f8e5acb618d7281", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddde859c3fbb11f02f8e5acb618d7281");
            return;
        }
        this.o = drawable;
        if (this.o != null) {
            if (this.o.getIntrinsicHeight() > 0) {
                setHeight(this.o.getIntrinsicHeight());
            }
            if (this.o.getIntrinsicWidth() > 0) {
                setWidth(this.o.getIntrinsicWidth());
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public int getInnerMeasureWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "864968a4437fac10f4074376b163d677", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "864968a4437fac10f4074376b163d677")).intValue();
        }
        if (this.h == null) {
            return 0;
        }
        return this.h.getMeasuredWidth();
    }

    public void setWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c3a69ab9c272494146b0778075e0b91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c3a69ab9c272494146b0778075e0b91");
            return;
        }
        this.g = i;
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setCurrentPosition(int i) {
        this.e = i;
    }
}
