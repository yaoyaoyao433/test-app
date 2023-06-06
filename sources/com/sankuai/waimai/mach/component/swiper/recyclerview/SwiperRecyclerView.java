package com.sankuai.waimai.mach.component.swiper.recyclerview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.utils.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SwiperRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect a;
    public f b;
    public boolean c;
    private float d;
    private boolean e;
    private VelocityTracker f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private String l;
    private int m;
    private boolean n;
    private GestureDetector o;

    public SwiperRecyclerView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb8f70d80f2e6953a988a7c86fb8e7b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb8f70d80f2e6953a988a7c86fb8e7b2");
        }
    }

    private SwiperRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, -1);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "581bfd9fb3664837dc7e6173fd69f741", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "581bfd9fb3664837dc7e6173fd69f741");
        }
    }

    public SwiperRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39a803fc9971686260d558dd198e67a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39a803fc9971686260d558dd198e67a1");
            return;
        }
        this.f = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = -1.0f;
        this.o = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.sankuai.waimai.mach.component.swiper.recyclerview.SwiperRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5473205c3fe888022fce0fce3765be73", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5473205c3fe888022fce0fce3765be73")).booleanValue();
                }
                if (SwiperRecyclerView.this.getParent() != null) {
                    if (SwiperRecyclerView.this.n || ((Math.abs(f) <= SwiperRecyclerView.this.d && Math.abs(f2) <= SwiperRecyclerView.this.d) || Math.abs(SwiperRecyclerView.this.i * f) >= Math.abs(SwiperRecyclerView.this.h * f2))) {
                        SwiperRecyclerView.this.n = true;
                        SwiperRecyclerView.this.getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        SwiperRecyclerView.this.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
                return super.onScroll(motionEvent, motionEvent2, f, f2);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19e34fafa2f61f7f3418f1f8771d555f", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19e34fafa2f61f7f3418f1f8771d555f")).booleanValue();
                }
                SwiperRecyclerView.this.n = false;
                return super.onDown(motionEvent);
            }
        });
        Object[] objArr2 = {context, Float.valueOf(5.0f)};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        this.d = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7646560230a5c72cd73d4471c931650c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7646560230a5c72cd73d4471c931650c")).intValue() : (int) ((context.getResources().getDisplayMetrics().density * 5.0f) + 0.5f);
        this.b = new f();
    }

    public void setTimeInterval(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f7b05f8629fe7e341d830e0d75c2795", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f7b05f8629fe7e341d830e0d75c2795");
        } else if (this.b != null) {
            this.b.a(i);
        }
    }

    public void setFirstInterval(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "142f3663af0bc13a0b693503d0d0b682", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "142f3663af0bc13a0b693503d0d0b682");
        } else if (this.b != null) {
            this.b.b(i);
        }
    }

    public void setDirection(String str) {
        this.l = str;
    }

    public void setScrollable(boolean z) {
        this.e = z;
    }

    public void setIsAutoPlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ad497e5485a673757e37e1e0d4cea61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ad497e5485a673757e37e1e0d4cea61");
            return;
        }
        this.c = z;
        if (this.b != null) {
            this.b.b(this.c);
        }
    }

    public void setMinScrollOffset(float f) {
        this.k = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef3a4188a0e1686d06249f99540a1b46", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef3a4188a0e1686d06249f99540a1b46")).booleanValue();
        }
        this.o.onTouchEvent(motionEvent);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (this.e) {
            switch (motionEvent.getAction()) {
                case 0:
                    if (this.c && this.b != null) {
                        this.b.c();
                    }
                    this.j = "horizontal".equals(this.l) ? motionEvent.getRawX() : motionEvent.getRawY();
                    if (getLayoutManager() instanceof ViewPagerLayoutManager) {
                        this.m = ((ViewPagerLayoutManager) getLayoutManager()).f();
                    }
                    if (this.f == null) {
                        this.f = VelocityTracker.obtain();
                    } else {
                        this.f.clear();
                    }
                    this.g = 0.0f;
                    this.f.addMovement(motionEvent);
                    break;
                case 1:
                case 3:
                    if (this.c && this.b != null) {
                        this.b.a(false);
                    }
                    if (this.f != null) {
                        this.f.recycle();
                        this.f = null;
                        break;
                    }
                    break;
                case 2:
                    if (this.f != null) {
                        this.f.addMovement(motionEvent);
                        this.f.computeCurrentVelocity(1000);
                        this.g = "horizontal".equals(this.l) ? this.f.getXVelocity() : this.f.getYVelocity();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cf5243c60fe058619861f4735d70a05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cf5243c60fe058619861f4735d70a05")).booleanValue();
        }
        if (this.e) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                if (this.c && this.b != null) {
                    this.b.a(false);
                }
                if (this.k >= 0.0f && this.b != null && (!(getLayoutManager() instanceof ViewPagerLayoutManager) || ((ViewPagerLayoutManager) getLayoutManager()).f() == this.m)) {
                    if ("horizontal".equals(this.l)) {
                        f = this.j;
                        rawY = motionEvent.getRawX();
                    } else {
                        f = this.j;
                        rawY = motionEvent.getRawY();
                    }
                    float f2 = f - rawY;
                    if (f2 > this.k) {
                        this.b.c(2);
                    } else if (f2 < (-this.k)) {
                        this.b.c(1);
                    } else if (this.g < -400.0f) {
                        this.b.c(2);
                    } else if (this.g > 400.0f) {
                        this.b.c(1);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c530462494955b9d692e4335c913530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c530462494955b9d692e4335c913530");
            return;
        }
        super.setLayoutManager(layoutManager);
        if (this.b != null) {
            this.b.a(this);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66d52f2ec42a90f6be11fac5425d3567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66d52f2ec42a90f6be11fac5425d3567");
            return;
        }
        super.onAttachedToWindow();
        if (this.b == null || !this.c) {
            return;
        }
        this.b.a(true);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dec8c7c5aa5f9e42002f027990e1947", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dec8c7c5aa5f9e42002f027990e1947");
            return;
        }
        super.onDetachedFromWindow();
        if (this.b == null || !this.c) {
            return;
        }
        this.b.c();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7d355011e53f30b9ac3791bd23b764f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7d355011e53f30b9ac3791bd23b764f");
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (this.b == null || !this.c) {
            return;
        }
        if (i == 0) {
            this.b.a(true);
        } else {
            this.b.c();
        }
    }
}
