package com.sankuai.waimai.machpro.component.swiper;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.swiper.MPSwiperComponent;
import com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPSwiperRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect a;
    private boolean b;
    private Handler c;
    private boolean d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private int j;
    private MPViewPager k;

    public MPSwiperRecyclerView(@NonNull Context context, MPViewPager mPViewPager) {
        super(context);
        Object[] objArr = {context, mPViewPager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a9df0f3a18b8ac46e585e25123b9278", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a9df0f3a18b8ac46e585e25123b9278");
            return;
        }
        this.c = new Handler(Looper.getMainLooper());
        this.e = 3000;
        this.f = true;
        this.j = 0;
        this.k = mPViewPager;
        addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.machpro.component.swiper.MPSwiperRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61136ebf78446bc6d3fc612eedcfb365", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61136ebf78446bc6d3fc612eedcfb365");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0 || !MPSwiperRecyclerView.this.b || !MPSwiperRecyclerView.this.d) {
                    MPSwiperRecyclerView.this.b();
                } else {
                    MPSwiperRecyclerView.this.a();
                }
            }
        });
        this.i = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public void setAutoPlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf8e3d1f59c8be52c1a761c932ee9751", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf8e3d1f59c8be52c1a761c932ee9751");
            return;
        }
        this.b = z;
        if (this.b) {
            if (this.d) {
                a();
                return;
            }
            return;
        }
        b();
    }

    public void setInterval(int i) {
        if (i > 0) {
            this.e = i;
        }
    }

    public void setOrientation(int i) {
        this.j = i;
    }

    public void setScrollable(boolean z) {
        this.f = z;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "193df68a2160551fcb916cd884ee7f7a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "193df68a2160551fcb916cd884ee7f7a")).booleanValue();
        }
        if (this.f) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.g = (int) motionEvent.getX();
                this.h = (int) motionEvent.getY();
            } else if (actionMasked == 2) {
                int x = ((int) motionEvent.getX()) - this.g;
                int y = ((int) motionEvent.getY()) - this.h;
                if ((this.j == 0 && Math.abs(x) > this.i) || (this.j == 1 && Math.abs(y) > this.i)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1994e488b6242fe407421ff39060d5b3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1994e488b6242fe407421ff39060d5b3")).booleanValue();
        }
        if (this.f) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cf488314a8a0f9b17a006474d334fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cf488314a8a0f9b17a006474d334fc8");
            return;
        }
        super.onAttachedToWindow();
        this.d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4ac6b33c8d463a7e2352f0aa6e4ee05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4ac6b33c8d463a7e2352f0aa6e4ee05");
        } else if (this.b) {
            this.c.removeCallbacksAndMessages(null);
            this.c.postDelayed(new Runnable() { // from class: com.sankuai.waimai.machpro.component.swiper.MPSwiperRecyclerView.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25a769089d23c597fd2053837083a548", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25a769089d23c597fd2053837083a548");
                    } else if (MPSwiperRecyclerView.this.d) {
                        if (MPSwiperRecyclerView.this.k != null) {
                            int currentItem = MPSwiperRecyclerView.this.k.getCurrentItem() + 1;
                            if (currentItem == MPSwiperRecyclerView.this.getAdapter().getItemCount()) {
                                MPSwiperRecyclerView.this.k.a(1, false);
                            } else {
                                MPSwiperRecyclerView.this.k.a(currentItem, true);
                            }
                            MPSwiperRecyclerView.this.c.removeCallbacksAndMessages(null);
                            MPSwiperRecyclerView.this.c.postDelayed(this, MPSwiperRecyclerView.this.e);
                        } else if (MPSwiperRecyclerView.this.getLayoutManager() instanceof MPSwiperLayoutManager) {
                            int i = ((MPSwiperLayoutManager) MPSwiperRecyclerView.this.getLayoutManager()).d + 1;
                            if (MPSwiperRecyclerView.this.getAdapter() instanceof MPSwiperComponent.a) {
                                if (i == ((MPSwiperComponent.a) MPSwiperRecyclerView.this.getAdapter()).getItemCount()) {
                                    MPSwiperRecyclerView.this.scrollToPosition(0);
                                } else {
                                    MPSwiperRecyclerView.this.smoothScrollToPosition(i);
                                }
                            }
                            MPSwiperRecyclerView.this.c.removeCallbacksAndMessages(null);
                            MPSwiperRecyclerView.this.c.postDelayed(this, MPSwiperRecyclerView.this.e);
                        }
                    }
                }
            }, this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac142c9a61798a789e4d9c2294b4ef01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac142c9a61798a789e4d9c2294b4ef01");
        } else {
            this.c.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9512e3738e49b4bd7df77612a6c322b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9512e3738e49b4bd7df77612a6c322b");
            return;
        }
        try {
            super.onDetachedFromWindow();
            this.d = false;
            b();
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("MPSwiperRecyclerView | " + e.getMessage());
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1ab441277b974356a92b973b5b8f1e3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1ab441277b974356a92b973b5b8f1e3")).booleanValue() : super.performClick();
    }
}
