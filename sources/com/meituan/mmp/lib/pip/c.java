package com.meituan.mmp.lib.pip;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.meituan.mmp.lib.utils.au;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    WindowManager b;
    View c;
    WindowManager.LayoutParams d;
    boolean e;
    int f;
    View.OnClickListener g;
    private Context h;
    private float i;
    private float j;
    private int k;
    private int l;
    private final float m;

    public static /* synthetic */ void a(c cVar, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "bc983ba49c9b93abe5db2a7e65831a7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "bc983ba49c9b93abe5db2a7e65831a7d");
        } else if (cVar.b == null || cVar.c == null || cVar.d == null || !cVar.e) {
        } else {
            cVar.d.x = i;
            cVar.d.y = i2;
            cVar.b.updateViewLayout(cVar.c, cVar.d);
        }
    }

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ba8b7dfc0106a0b2bdf0be953d0faf4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ba8b7dfc0106a0b2bdf0be953d0faf4");
            return;
        }
        this.m = 15.0f;
        this.h = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9387eafa8a8e1c38462475361193165a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9387eafa8a8e1c38462475361193165a");
            return;
        }
        this.b = (WindowManager) this.h.getSystemService("window");
        this.d = new WindowManager.LayoutParams();
        this.d.flags = 40;
        this.d.type = Build.VERSION.SDK_INT < 26 ? 2003 : 2038;
        this.d.gravity = 51;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39e16cd22d024c4d261a68914534dafc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39e16cd22d024c4d261a68914534dafc");
        } else if (this.e) {
            try {
                this.b.removeViewImmediate(this.c);
            } catch (Exception e) {
                com.meituan.mmp.lib.trace.b.a("PipFloatView", e);
                e.printStackTrace();
            }
            this.e = false;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ValueAnimator ofObject;
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d443f924860b9a689eed4689ed0bdc0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d443f924860b9a689eed4689ed0bdc0")).booleanValue();
        }
        if (this.e) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            switch (motionEvent.getAction()) {
                case 0:
                    this.k = rawX;
                    this.i = rawX;
                    this.l = rawY;
                    this.j = rawY;
                    break;
                case 1:
                    float f = rawX;
                    if (f >= this.i - 15.0f && f <= this.i + 15.0f) {
                        float f2 = rawY;
                        if (f2 >= this.j - 15.0f && f2 <= this.j + 15.0f) {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3961aae3cfe809edb5149a334889f8a4", RobustBitConfig.DEFAULT_VALUE)) {
                                if (this.e) {
                                    if (this.g != null) {
                                        this.g.onClick(this.c);
                                    }
                                    com.meituan.mmp.lib.trace.b.b("PipFloatView", "click inner");
                                    break;
                                }
                            } else {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3961aae3cfe809edb5149a334889f8a4");
                                break;
                            }
                        }
                    }
                    float f3 = this.d.x;
                    float f4 = this.d.y;
                    Object[] objArr3 = {Float.valueOf(f3), Float.valueOf(f4)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "faf02009f5c55ba84c646389c1e4d80d", RobustBitConfig.DEFAULT_VALUE)) {
                        ofObject = (ValueAnimator) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "faf02009f5c55ba84c646389c1e4d80d");
                    } else {
                        if (this.d.x + (this.f / 2) <= au.b() / 2) {
                            int i = (int) f4;
                            ofObject = ValueAnimator.ofObject(new a(), new Point((int) f3, i), new Point(0, i));
                        } else {
                            int i2 = (int) f4;
                            ofObject = ValueAnimator.ofObject(new a(), new Point((int) f3, i2), new Point(au.b() - this.f, i2));
                        }
                        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.mmp.lib.pip.c.1
                            public static ChangeQuickRedirect a;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                Object[] objArr4 = {valueAnimator};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bf801f0efb981f60b1bb09f41d4f6af8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bf801f0efb981f60b1bb09f41d4f6af8");
                                    return;
                                }
                                Point point = (Point) valueAnimator.getAnimatedValue();
                                c.a(c.this, point.x, point.y);
                            }
                        });
                        ofObject.setDuration(160L);
                    }
                    ofObject.start();
                    break;
                case 2:
                    int i3 = rawX - this.k;
                    int i4 = rawY - this.l;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4163880099ea6b2dc8f6fee34411d4f9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4163880099ea6b2dc8f6fee34411d4f9");
                    } else if (this.b != null && this.c != null && this.d != null && this.e) {
                        this.d.x += i3;
                        this.d.y += i4;
                        this.b.updateViewLayout(this.c, this.d);
                    }
                    this.k = rawX;
                    this.l = rawY;
                    break;
            }
            return false;
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements TypeEvaluator {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Object evaluate(float f, Object obj, Object obj2) {
            Object[] objArr = {Float.valueOf(f), obj, obj2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c115197b175887aaba2072aa6db1354", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c115197b175887aaba2072aa6db1354");
            }
            Point point = (Point) obj;
            Point point2 = (Point) obj2;
            return new Point((int) (point.x + ((point2.x - point.x) * f)), (int) (point.y + (f * (point2.y - point.y))));
        }
    }
}
