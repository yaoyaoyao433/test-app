package com.dianping.live.live.mrn.list;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.dianping.live.live.mrn.MLiveMRNActivity;
import com.dianping.util.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MLiveListRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public Handler f;
    public Runnable g;
    private final DisplayMetrics h;
    private int i;
    private int j;
    private int k;

    public MLiveListRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20bb055e0f521d7ca3986cf7da7fa9a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20bb055e0f521d7ca3986cf7da7fa9a4");
            return;
        }
        this.i = 0;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = false;
        this.j = 0;
        this.k = 0;
        this.h = getResources().getDisplayMetrics();
    }

    public MLiveListRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e2494bb7272f1dde3d24da9d6f4a86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e2494bb7272f1dde3d24da9d6f4a86");
            return;
        }
        this.i = 0;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = false;
        this.j = 0;
        this.k = 0;
        this.h = getResources().getDisplayMetrics();
    }

    public MLiveListRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea74748ae10c3c2dc1460cd9c190fcb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea74748ae10c3c2dc1460cd9c190fcb7");
            return;
        }
        this.i = 0;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = false;
        this.j = 0;
        this.k = 0;
        this.i = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.h = getResources().getDisplayMetrics();
    }

    @Override // android.support.v7.widget.RecyclerView
    public MLiveMRNActivity.CustomLinearLayoutManager getLayoutManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abafe00c90703c0f81854c9f7afed0d4", RobustBitConfig.DEFAULT_VALUE) ? (MLiveMRNActivity.CustomLinearLayoutManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abafe00c90703c0f81854c9f7afed0d4") : (MLiveMRNActivity.CustomLinearLayoutManager) super.getLayoutManager();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a050672bd6065e97544e73cdbda162", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a050672bd6065e97544e73cdbda162")).booleanValue();
        }
        this.j = motionEvent.getAction();
        int b = j.b(getContext(), context.getResources().getDisplayMetrics().heightPixels);
        float b2 = j.b(getContext(), motionEvent.getRawX());
        float b3 = j.b(getContext(), motionEvent.getRawY());
        if (this.j == 0) {
            getLayoutManager().a(true, 2);
            if (b2 < 267.0f && b3 > b - 248) {
                getLayoutManager().a(false, 2);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed0da54668fc1cbda8ec31867c36bf28", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed0da54668fc1cbda8ec31867c36bf28")).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.e = false;
                this.k = 0;
                this.d = 0.0f;
                a();
                break;
            case 1:
                if (this.d != 0.0f) {
                    a();
                    this.f = new Handler();
                    this.g = new Runnable() { // from class: com.dianping.live.live.mrn.list.MLiveListRecyclerView.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4226e5016c6e0627877beafca658bfc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4226e5016c6e0627877beafca658bfc");
                                return;
                            }
                            new StringBuilder("3s判断列表状态").append(this.getScrollState());
                            if (this.getScrollState() == 1) {
                                MLiveListRecyclerView.this.stopScroll();
                            }
                            MLiveListRecyclerView.this.a();
                        }
                    };
                    this.f.postDelayed(this.g, 1000L);
                }
                if (this.d == 0.0f && getAdapter() != null && ((d) getAdapter()).a()) {
                    ((d) getAdapter()).b();
                    return true;
                }
                break;
            case 2:
                a();
                this.d = motionEvent.getY() - this.c;
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53c9a4b1573826fe67eb38679b6d236c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53c9a4b1573826fe67eb38679b6d236c");
        } else if (this.f != null) {
            this.f.removeCallbacks(this.g);
            this.f = null;
            this.g = null;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf77ef2cea8eb9657e48266001664159", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf77ef2cea8eb9657e48266001664159")).booleanValue() : super.fling((int) (i / this.h.scaledDensity), (int) (i2 / this.h.scaledDensity));
    }
}
