package com.sankuai.waimai.reactnative.pullfresh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AdapterView;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.reactnative.pullrefresh.a;
import com.sankuai.waimai.reactnative.utils.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.reactnative.pullrefresh.a {
    public static ChangeQuickRedirect a;
    public int b;
    private c f;
    private int g;
    private int h;
    private final int i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.reactnative.pullfresh.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1121b implements c {
        public static final C1121b a = new C1121b();

        @Override // com.sankuai.waimai.reactnative.pullfresh.b.c
        public final boolean a() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        boolean a();
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b443ef2cd55731f8150319fd38075fd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b443ef2cd55731f8150319fd38075fd0");
            return;
        }
        this.i = 1;
        this.b = -1;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95115c6d02bdb5ff2fffdad3059ce1c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95115c6d02bdb5ff2fffdad3059ce1c4");
        } else {
            this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        }
    }

    @Override // com.sankuai.waimai.reactnative.pullrefresh.a, android.view.View
    public final void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9b0c3cfd5fe9a2664f21c965d540016", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9b0c3cfd5fe9a2664f21c965d540016");
            return;
        }
        super.onFinishInflate();
        com.sankuai.waimai.imbase.log.a.a("test", "RCTPullToRefreshView onFinishInflate", new Object[0]);
        this.f = d();
    }

    public final void setContentView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7333d6319788f7191f769bf79dbccb16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7333d6319788f7191f769bf79dbccb16");
            return;
        }
        super.addView(view);
        this.f = d();
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ee0ab7b71a14ac30866c429616a6b5f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ee0ab7b71a14ac30866c429616a6b5f")).booleanValue();
        }
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.g = rawY;
        } else if (action == 2) {
            int i = rawY - this.g;
            if (this.e && i >= this.h && this.f.a()) {
                setPullTarget(1);
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d7a0bcaf697972f52d13b945d806349", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d7a0bcaf697972f52d13b945d806349")).booleanValue();
        }
        int rawY = (int) motionEvent.getRawY();
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                if (c()) {
                    a.C1122a c1122a = this.d;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a.b.c;
                    if (PatchProxy.isSupport(objArr2, c1122a, changeQuickRedirect2, false, "12915ca5928299774209f3329eec0c21", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, c1122a, changeQuickRedirect2, false, "12915ca5928299774209f3329eec0c21");
                    } else {
                        c1122a.e.b();
                    }
                }
                setPullTarget(0);
                break;
            case 2:
                int i = rawY - this.g;
                if (c()) {
                    a.C1122a c1122a2 = this.d;
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a.b.c;
                    if (!PatchProxy.isSupport(objArr3, c1122a2, changeQuickRedirect3, false, "1554f8ee3a3f5ceb810b503c73c95b18", RobustBitConfig.DEFAULT_VALUE)) {
                        c1122a2.e.a(i);
                        break;
                    } else {
                        ((Integer) PatchProxy.accessDispatch(objArr3, c1122a2, changeQuickRedirect3, false, "1554f8ee3a3f5ceb810b503c73c95b18")).intValue();
                        break;
                    }
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @NonNull
    private c d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88ee57b3a2cabfc3b56fb215f678b2c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88ee57b3a2cabfc3b56fb215f678b2c4");
        }
        ScrollView b = e.b(this);
        if (b != null) {
            return new d(b);
        }
        AdapterView<?> a2 = e.a(this);
        if (a2 != null) {
            return new a(a2);
        }
        return C1121b.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class d implements c {
        public static ChangeQuickRedirect a;
        @NonNull
        private final ScrollView c;

        public d(@NonNull ScrollView scrollView) {
            Object[] objArr = {b.this, scrollView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d127dcb8c63d947e3e672c29903afc11", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d127dcb8c63d947e3e672c29903afc11");
            } else {
                this.c = scrollView;
            }
        }

        @Override // com.sankuai.waimai.reactnative.pullfresh.b.c
        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80f606c7fd3915648a60762f3d5adce2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80f606c7fd3915648a60762f3d5adce2")).booleanValue() : this.c.getScrollY() == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements c {
        public static ChangeQuickRedirect a;
        @NonNull
        private final AdapterView b;

        public a(@NonNull AdapterView adapterView) {
            Object[] objArr = {adapterView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e830c66849ef451f86e46b49c9eda47d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e830c66849ef451f86e46b49c9eda47d");
            } else {
                this.b = adapterView;
            }
        }

        @Override // com.sankuai.waimai.reactnative.pullfresh.b.c
        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38d491ea434386573584924a17a8992a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38d491ea434386573584924a17a8992a")).booleanValue();
            }
            View childAt = this.b.getChildAt(0);
            if (childAt != null && this.b.getFirstVisiblePosition() == 0) {
                if (childAt.getTop() >= this.b.getPaddingTop() - 1) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "691fbbf96e0620330f184a419f6ad772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "691fbbf96e0620330f184a419f6ad772");
        } else {
            this.f = d();
        }
    }

    public final void setHeaderType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8de5482d0a6b7f48ec19453cd000a8dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8de5482d0a6b7f48ec19453cd000a8dc");
            return;
        }
        com.sankuai.waimai.imbase.log.a.a("test", "setHeaderType type:" + i, new Object[0]);
        if (this.b == i) {
            return;
        }
        if (i == 1) {
            setHeaderView(new WMRNPullToRefreshHeader(getContext()));
        }
        this.b = i;
    }
}
