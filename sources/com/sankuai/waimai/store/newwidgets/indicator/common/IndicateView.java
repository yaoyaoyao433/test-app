package com.sankuai.waimai.store.newwidgets.indicator.common;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb773f3215ca2764304cd9579e2454c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb773f3215ca2764304cd9579e2454c7");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c7cb9002380feb0abc15bce770327a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c7cb9002380feb0abc15bce770327a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "272904329765d4f06af873938d82df8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "272904329765d4f06af873938d82df8b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dc71761c759df6ab582a59b5bd1c26a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dc71761c759df6ab582a59b5bd1c26a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6a590183e7c1e154ed5558ec0613145", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6a590183e7c1e154ed5558ec0613145");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4896395528bd41d515ec24a894e79441", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4896395528bd41d515ec24a894e79441");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b4109a3bb6ba8d4b642a88094cf630c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b4109a3bb6ba8d4b642a88094cf630c");
            return;
        }
        this.c = i;
        this.d = i2;
        invalidate();
    }

    public void setHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "123b8e6fad4001599aec70d40a275775", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "123b8e6fad4001599aec70d40a275775");
            return;
        }
        this.b = i;
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd6a15de157b3ecd1484d5fd7bf1c952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd6a15de157b3ecd1484d5fd7bf1c952");
            return;
        }
        this.l.setColor(i);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb2c991dcd7fd1b744ba42de4e2abd30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb2c991dcd7fd1b744ba42de4e2abd30");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af7c9c0f49c4dca590dfd0da33df50c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af7c9c0f49c4dca590dfd0da33df50c7")).intValue();
        }
        if (this.h == null) {
            return 0;
        }
        return this.h.getMeasuredWidth();
    }

    public void setWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f26a96af1d3d9306b2d8eefc17910bf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f26a96af1d3d9306b2d8eefc17910bf1");
            return;
        }
        this.g = i;
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setCurrentPosition(int i) {
        this.e = i;
    }
}
