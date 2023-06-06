package com.sankuai.waimai.store.orderlist.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class OrderClickCustomRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect a;
    public c b;
    public float c;
    public float d;
    private Runnable e;
    private Runnable f;
    private boolean g;
    private int h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a();

        void b();
    }

    public static /* synthetic */ boolean a(OrderClickCustomRecyclerView orderClickCustomRecyclerView, boolean z) {
        orderClickCustomRecyclerView.g = true;
        return true;
    }

    public OrderClickCustomRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0d0f5b4eb7a062b224a6281ae7cf5a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0d0f5b4eb7a062b224a6281ae7cf5a3");
            return;
        }
        this.e = new a();
        this.f = new b();
        this.g = false;
        this.h = 0;
        a();
    }

    public OrderClickCustomRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55a4683c13d471e86a971f1b35a245dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55a4683c13d471e86a971f1b35a245dc");
            return;
        }
        this.e = new a();
        this.f = new b();
        this.g = false;
        this.h = 0;
        a();
    }

    public OrderClickCustomRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "818f97d31f846c3b8ae65c00bed44725", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "818f97d31f846c3b8ae65c00bed44725");
            return;
        }
        this.e = new a();
        this.f = new b();
        this.g = false;
        this.h = 0;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9d2c3c082b33cf7fe0eafdd3e8e858a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9d2c3c082b33cf7fe0eafdd3e8e858a");
        } else {
            this.h = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5845a7dc3969c24d19d3cdcfd6d3333", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5845a7dc3969c24d19d3cdcfd6d3333")).booleanValue();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        switch (motionEvent.getAction()) {
            case 0:
                this.d = motionEvent.getX();
                this.c = motionEvent.getY();
                this.g = false;
                postDelayed(this.f, ViewConfiguration.getLongPressTimeout());
                removeCallbacks(this.e);
                break;
            case 1:
                if (!this.g) {
                    removeCallbacks(this.f);
                    post(this.e);
                    break;
                }
                break;
            case 2:
                if (Math.abs(motionEvent.getX() - this.d) > this.h || Math.abs(motionEvent.getY() - this.c) > this.h) {
                    this.g = true;
                    removeCallbacks(this.f);
                    break;
                } else {
                    this.c = motionEvent.getX();
                    this.c = motionEvent.getY();
                    break;
                }
                break;
            case 3:
                removeCallbacks(this.e);
                removeCallbacks(this.f);
            default:
                this.c = motionEvent.getX();
                this.c = motionEvent.getY();
                break;
        }
        return onTouchEvent;
    }

    public void setCustomRecyclerViewClick(c cVar) {
        this.b = cVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b implements Runnable {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {OrderClickCustomRecyclerView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22b166743ab82176c82bac965da9ad52", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22b166743ab82176c82bac965da9ad52");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2be823cd51e030669ff764d77126f1e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2be823cd51e030669ff764d77126f1e8");
                return;
            }
            OrderClickCustomRecyclerView.a(OrderClickCustomRecyclerView.this, true);
            if (OrderClickCustomRecyclerView.this.b != null) {
                OrderClickCustomRecyclerView.this.b.b();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a implements Runnable {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {OrderClickCustomRecyclerView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ba30997b6fe7326c2cc22f830bd8e06", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ba30997b6fe7326c2cc22f830bd8e06");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c24a97d80e4b58056bd106031030859", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c24a97d80e4b58056bd106031030859");
            } else if (OrderClickCustomRecyclerView.this.b != null) {
                OrderClickCustomRecyclerView.this.b.a();
            }
        }
    }
}
