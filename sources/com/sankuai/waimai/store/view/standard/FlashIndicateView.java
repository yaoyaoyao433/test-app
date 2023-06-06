package com.sankuai.waimai.store.view.standard;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.foundation.utils.ColorUtils;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FlashIndicateView extends View {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    int d;
    HorizontalScrollView e;
    int f;
    LinearLayout g;
    FlashTabLayout h;
    private final int i;
    private Paint j;
    private int k;
    private Rect l;
    private RectF m;
    private Drawable n;

    public int getCurrentPosition() {
        return this.d;
    }

    public FlashIndicateView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fc14ced38d115ec945081908c6ddf92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fc14ced38d115ec945081908c6ddf92");
            return;
        }
        this.i = 0;
        this.k = 20;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.f = 20;
        this.l = new Rect();
        this.m = new RectF();
        a(context);
    }

    public FlashIndicateView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06522a818deff7e486927b9e38f0eb03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06522a818deff7e486927b9e38f0eb03");
            return;
        }
        this.i = 0;
        this.k = 20;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.f = 20;
        this.l = new Rect();
        this.m = new RectF();
        a(context);
    }

    public FlashIndicateView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "542567e783ad546c824472afeed0e37a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "542567e783ad546c824472afeed0e37a");
            return;
        }
        this.i = 0;
        this.k = 20;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.f = 20;
        this.l = new Rect();
        this.m = new RectF();
        a(context);
    }

    @TargetApi(21)
    public FlashIndicateView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0767085a7f3de9ea7251c8b3aeeae08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0767085a7f3de9ea7251c8b3aeeae08");
            return;
        }
        this.i = 0;
        this.k = 20;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.f = 20;
        this.l = new Rect();
        this.m = new RectF();
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5893f666eae2a58e8d06db3b7764c4c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5893f666eae2a58e8d06db3b7764c4c6");
            return;
        }
        this.f = h.a(getContext(), 20.0f);
        this.j = new Paint();
        this.j.setColor(ColorUtils.a("#FFCC33", ContextCompat.getColor(context, R.color.wm_sg_color_FFCC33)));
        this.j.setAntiAlias(true);
        this.j.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7a1dc956d5e67541346064ba0616e9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7a1dc956d5e67541346064ba0616e9a");
        } else if (this.n == null) {
            this.m.left = this.b + getPaddingLeft();
            this.m.top = 0.0f;
            this.m.right = this.c;
            this.m.bottom = this.k;
            canvas.drawRoundRect(this.m, 100.0f, 100.0f, this.j);
        } else {
            this.l.left = this.b + getPaddingLeft();
            this.l.top = 0;
            this.l.right = this.c;
            this.l.bottom = this.k;
            this.n.setBounds(this.l);
            this.n.draw(canvas);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11e87c65a736879c3ef0328a61419e41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11e87c65a736879c3ef0328a61419e41");
            return;
        }
        this.b = i;
        this.c = i2;
        invalidate();
    }

    public void setHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "089f0ae6af17bd1c5673fb77765d3aab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "089f0ae6af17bd1c5673fb77765d3aab");
            return;
        }
        this.k = i;
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0e3a64c6581c46831441694c90eb8e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0e3a64c6581c46831441694c90eb8e4");
            return;
        }
        this.j.setColor(i);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab23dc0c5a18ab9d53ebd542a5650d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab23dc0c5a18ab9d53ebd542a5650d3");
            return;
        }
        this.n = drawable;
        if (this.n != null) {
            if (this.n.getIntrinsicHeight() > 0) {
                setHeight(this.n.getIntrinsicHeight());
            }
            if (this.n.getIntrinsicWidth() > 0) {
                setWidth(this.n.getIntrinsicWidth());
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public final void a(FlashTabLayout flashTabLayout) {
        Object[] objArr = {flashTabLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e75e024f2ad3a2cc698791019a9aeadf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e75e024f2ad3a2cc698791019a9aeadf");
            return;
        }
        this.h = flashTabLayout;
        if (this.h == null) {
            return;
        }
        try {
            this.g = (LinearLayout) this.h.getChildAt(0);
            this.e = (HorizontalScrollView) this.g.getParent();
            this.e.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.store.view.standard.FlashIndicateView.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Object[] objArr2 = {view, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "231311488147cbd80dfb2393d84ee2b0", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "231311488147cbd80dfb2393d84ee2b0")).booleanValue();
                    }
                    View childAt = FlashIndicateView.this.g.getChildAt(FlashIndicateView.this.d);
                    if (childAt == null) {
                        return false;
                    }
                    int width = (childAt.getWidth() - FlashIndicateView.this.f) / 2;
                    FlashIndicateView.this.a((childAt.getLeft() - FlashIndicateView.this.e.getScrollX()) + width, (childAt.getRight() - FlashIndicateView.this.e.getScrollX()) - width);
                    int action = motionEvent.getAction();
                    if (action != 3) {
                        switch (action) {
                            case 0:
                                return false;
                            case 1:
                                break;
                            default:
                                return false;
                        }
                    }
                    return true;
                }
            });
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
        if (this.g == null || this.e == null) {
            this.h.setSelectedTabIndicatorHeight(this.k);
        }
    }

    public void setWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0afebebeaf8fb88e87b1a6d1e0f38ffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0afebebeaf8fb88e87b1a6d1e0f38ffa");
            return;
        }
        this.f = i;
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public final void a(float f, int i) {
        View childAt;
        int i2;
        boolean z;
        Object[] objArr = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ca7f85e5f5b753acbcd72509673b4e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ca7f85e5f5b753acbcd72509673b4e3");
            return;
        }
        Object[] objArr2 = {Float.valueOf(f), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a90c10a0024c888391f65703e05e6996", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a90c10a0024c888391f65703e05e6996");
        } else if (this.g == null || this.e == null) {
        } else {
            if (f > 1.0E-6d && f < 1.0f) {
                if (this.d == i) {
                    i2 = i + 1;
                    z = false;
                } else {
                    i2 = i;
                    z = true;
                }
                View childAt2 = this.g.getChildAt(this.d);
                View childAt3 = this.g.getChildAt(i2);
                if (p.a(childAt2, childAt3)) {
                    return;
                }
                if (!z) {
                    childAt2 = childAt3;
                    childAt3 = childAt2;
                }
                float left = ((this.h.getLeft() + childAt3.getLeft()) - this.e.getScrollX()) + (((childAt3.getWidth() + childAt2.getWidth()) / 2) * f) + ((childAt3.getWidth() - this.f) / 2);
                a((int) left, (int) (this.f + left));
                return;
            }
            this.d = i;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2080f4da3e6c52323030bce1a856f239", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2080f4da3e6c52323030bce1a856f239");
            } else if (this.g == null || this.e == null || (childAt = this.g.getChildAt(this.d)) == null) {
            } else {
                int width = (childAt.getWidth() - this.f) / 2;
                a(((this.h.getLeft() + childAt.getLeft()) - this.e.getScrollX()) + width, (childAt.getRight() - this.e.getScrollX()) - width);
            }
        }
    }

    public void setCurrentPosition(int i) {
        this.d = i;
    }
}
