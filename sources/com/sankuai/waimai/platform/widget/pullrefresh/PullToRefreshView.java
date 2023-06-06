package com.sankuai.waimai.platform.widget.pullrefresh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AdapterView;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PullToRefreshView extends AbsScrollPullRefresh {
    public static ChangeQuickRedirect b;
    private c a;
    private int h;
    private int i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements c {
        public static final b a = new b();

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.PullToRefreshView.c
        public final boolean a() {
            return false;
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.PullToRefreshView.c
        public final boolean b() {
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        boolean a();

        boolean b();
    }

    public PullToRefreshView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4431b667d3233f6a62f7b9e982ba1abc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4431b667d3233f6a62f7b9e982ba1abc");
        } else {
            a(context);
        }
    }

    public PullToRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb6bb2a9bce6d425b67a78406594c3e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb6bb2a9bce6d425b67a78406594c3e2");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0e5a09e68ef54f0328503f007d4b00c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0e5a09e68ef54f0328503f007d4b00c");
        } else {
            this.i = ViewConfiguration.get(context).getScaledTouchSlop();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.pullrefresh.AbsScrollPullRefresh, android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "397c6b0357d62a2d48120269c5512414", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "397c6b0357d62a2d48120269c5512414");
            return;
        }
        super.onFinishInflate();
        this.a = d();
    }

    public void setContentView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc6507540f87c8da67a953b28fb806ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc6507540f87c8da67a953b28fb806ac");
            return;
        }
        super.addView(view);
        this.a = d();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd923a406f4931cb47cf48ac3cbc5250", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd923a406f4931cb47cf48ac3cbc5250")).booleanValue();
        }
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.h = rawY;
        } else if (action == 2) {
            int i = rawY - this.h;
            if (this.f && i >= this.i && this.a.a()) {
                setPullTarget(1);
                return true;
            } else if (this.g && i <= (-this.i) && this.a.b()) {
                setPullTarget(2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d69d2dafc791aa3d74425c701a535a68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d69d2dafc791aa3d74425c701a535a68")).booleanValue();
        }
        int rawY = (int) motionEvent.getRawY();
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                if (b()) {
                    this.d.d();
                } else if (c()) {
                    this.e.d();
                }
                setPullTarget(0);
                break;
            case 2:
                int i = rawY - this.h;
                if (b()) {
                    this.d.c(i);
                    break;
                } else if (c()) {
                    this.e.c(-i);
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @NonNull
    private c d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b96d583c562b687f903f759f6bec221", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b96d583c562b687f903f759f6bec221");
        }
        ScrollView b2 = com.sankuai.waimai.platform.widget.pullrefresh.d.b(this);
        if (b2 != null) {
            return new d(b2);
        }
        AdapterView<?> a2 = com.sankuai.waimai.platform.widget.pullrefresh.d.a(this);
        if (a2 != null) {
            return new a(a2);
        }
        return b.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class d implements c {
        public static ChangeQuickRedirect a;
        @NonNull
        private final ScrollView c;

        public d(@NonNull ScrollView scrollView) {
            Object[] objArr = {PullToRefreshView.this, scrollView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ada4275396ea29ad699c718bfdc93cb7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ada4275396ea29ad699c718bfdc93cb7");
            } else {
                this.c = scrollView;
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.PullToRefreshView.c
        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c05c35062265285dd736c0c2a03f1c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c05c35062265285dd736c0c2a03f1c9")).booleanValue() : this.c.getScrollY() == 0;
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.PullToRefreshView.c
        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "846fdde65a300708b257117a31d25c10", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "846fdde65a300708b257117a31d25c10")).booleanValue();
            }
            View childAt = this.c.getChildAt(0);
            return childAt != null && childAt.getMeasuredHeight() <= PullToRefreshView.this.getHeight() + this.c.getScrollY();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c5a54a1c42c7b2b1c4fb50cd1142fe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c5a54a1c42c7b2b1c4fb50cd1142fe");
            } else {
                this.b = adapterView;
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.PullToRefreshView.c
        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73f91c5613a96e468ae885fb7cdc884a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73f91c5613a96e468ae885fb7cdc884a")).booleanValue();
            }
            View childAt = this.b.getChildAt(0);
            if (childAt != null && this.b.getFirstVisiblePosition() == 0) {
                if (childAt.getTop() >= this.b.getPaddingTop() - 1) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.PullToRefreshView.c
        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a7bf9b5a1f2972042bee96b52b44a33", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a7bf9b5a1f2972042bee96b52b44a33")).booleanValue();
            }
            View childAt = this.b.getChildAt(this.b.getChildCount() - 1);
            if (childAt != null && this.b.getLastVisiblePosition() == this.b.getCount() - 1) {
                if (childAt.getBottom() <= (this.b.getHeight() - this.b.getPaddingBottom()) + 1) {
                    return true;
                }
            }
            return false;
        }
    }
}
