package com.sankuai.waimai.pouch.mach.swiper;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.swiper.recyclerview.ViewPagerLayoutManager;
import com.sankuai.waimai.mach.component.swiper.recyclerview.f;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PouchSwiperView extends RecyclerView {
    public static ChangeQuickRedirect a;
    private boolean b;
    private VelocityTracker c;
    private float d;
    private f e;
    private boolean f;
    private float g;
    private float h;
    private String i;
    private int j;
    private GestureDetector k;

    public PouchSwiperView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e798bbdc10e69df6270c0a9298c59d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e798bbdc10e69df6270c0a9298c59d2");
        }
    }

    private PouchSwiperView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, -1);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d6e33bb9f356254dde3152bcb9eacf4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d6e33bb9f356254dde3152bcb9eacf4");
        }
    }

    public PouchSwiperView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cebbdf6e7b223fedeecdea322120b589", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cebbdf6e7b223fedeecdea322120b589");
            return;
        }
        this.c = null;
        this.h = -1.0f;
        this.k = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.sankuai.waimai.pouch.mach.swiper.PouchSwiperView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2ca34dd844d3ca45eaf939bfc957c4d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2ca34dd844d3ca45eaf939bfc957c4d")).booleanValue();
                }
                ViewParent parent = PouchSwiperView.this.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                return super.onDown(motionEvent);
            }
        });
        setOverScrollMode(2);
        this.e = new f();
    }

    public void setTimeInterval(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cd2077935514123ede13415c6aec52b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cd2077935514123ede13415c6aec52b");
        } else if (this.e != null) {
            this.e.a(i);
        }
    }

    public void setFirstInterval(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0ef1c3dc5d2fb85d420bd684d8bf627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0ef1c3dc5d2fb85d420bd684d8bf627");
        } else if (this.e != null) {
            this.e.b(i);
        }
    }

    public void setDirection(String str) {
        this.i = str;
    }

    public void setScrollable(boolean z) {
        this.b = z;
    }

    public void setIsAutoPlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57d4284c26086faaca7518f0a7b39902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57d4284c26086faaca7518f0a7b39902");
            return;
        }
        this.f = z;
        if (this.e != null) {
            this.e.b(this.f);
        }
    }

    public final void a(int i, Interpolator interpolator) {
        Object[] objArr = {Integer.valueOf(i), interpolator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8e34d942b4c033d966b6f5e2427f45f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8e34d942b4c033d966b6f5e2427f45f");
        } else if (i > 0) {
            try {
                Field declaredField = RecyclerView.class.getDeclaredField("mViewFlinger");
                declaredField.setAccessible(true);
                Field declaredField2 = Class.forName("android.support.v7.widget.RecyclerView$r").getDeclaredField("mScroller");
                declaredField2.setAccessible(true);
                c cVar = new c(getContext(), interpolator);
                cVar.c = i;
                declaredField2.set(declaredField.get(this), cVar);
            } catch (Exception e) {
                e.printStackTrace();
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
    }

    public void setMinScrollOffset(float f) {
        this.h = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcda3b33f1631ecede85240738748ba8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcda3b33f1631ecede85240738748ba8")).booleanValue();
        }
        this.k.onTouchEvent(motionEvent);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (this.b) {
            switch (motionEvent.getAction()) {
                case 0:
                    if (this.f && this.e != null) {
                        this.e.c();
                    }
                    this.g = "horizontal".equals(this.i) ? motionEvent.getRawX() : motionEvent.getRawY();
                    if (getLayoutManager() instanceof ViewPagerLayoutManager) {
                        this.j = ((ViewPagerLayoutManager) getLayoutManager()).f();
                    }
                    if (this.c == null) {
                        this.c = VelocityTracker.obtain();
                    } else {
                        this.c.clear();
                    }
                    this.d = 0.0f;
                    this.c.addMovement(motionEvent);
                    break;
                case 1:
                case 3:
                    if (this.f && this.e != null) {
                        this.e.a(false);
                    }
                    if (this.c != null) {
                        this.c.recycle();
                        this.c = null;
                        break;
                    }
                    break;
                case 2:
                    if (this.c != null) {
                        this.c.addMovement(motionEvent);
                        this.c.computeCurrentVelocity(1000);
                        this.d = "horizontal".equals(this.i) ? this.c.getXVelocity() : this.c.getYVelocity();
                        break;
                    }
                    break;
            }
            return dispatchTouchEvent;
        }
        return dispatchTouchEvent;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float rawY;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1a24bcdf0900dd13e74f29a5773536c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1a24bcdf0900dd13e74f29a5773536c")).booleanValue();
        }
        if (this.b) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                if (this.f && this.e != null) {
                    this.e.a(false);
                }
                if (this.h >= 0.0f && this.e != null && (!(getLayoutManager() instanceof ViewPagerLayoutManager) || ((ViewPagerLayoutManager) getLayoutManager()).f() == this.j)) {
                    if ("horizontal".equals(this.i)) {
                        f = this.g;
                        rawY = motionEvent.getRawX();
                    } else {
                        f = this.g;
                        rawY = motionEvent.getRawY();
                    }
                    float f2 = f - rawY;
                    if (f2 > this.h) {
                        this.e.c(2);
                    } else if (f2 < (-this.h)) {
                        this.e.c(1);
                    } else if (this.d < -400.0f) {
                        this.e.c(2);
                    } else if (this.d > 400.0f) {
                        this.e.c(1);
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a48065e351c75ac8349b0a8a29baf4cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a48065e351c75ac8349b0a8a29baf4cd");
            return;
        }
        super.setLayoutManager(layoutManager);
        if (this.e != null) {
            this.e.a(this);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd0d53ff744f003800bd849fb41d5a31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd0d53ff744f003800bd849fb41d5a31");
            return;
        }
        super.onAttachedToWindow();
        if (this.e == null || !this.f) {
            return;
        }
        this.e.a(true);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3342a9a9149496295c94fdac4ddc43bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3342a9a9149496295c94fdac4ddc43bf");
            return;
        }
        super.onDetachedFromWindow();
        if (this.e == null || !this.f) {
            return;
        }
        this.e.c();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e03d68df6035aaaa10c67b2c0e5b15d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e03d68df6035aaaa10c67b2c0e5b15d");
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (this.e == null || !this.f) {
            return;
        }
        if (i == 0) {
            this.e.a(true);
        } else {
            this.e.c();
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23f87e406ae0d2dc60e7aecbb0dc1403", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23f87e406ae0d2dc60e7aecbb0dc1403");
            return;
        }
        scrollToPosition(i);
        if (this.e == null || !this.f) {
            return;
        }
        this.e.c();
        this.e.a(false);
    }
}
