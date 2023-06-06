package com.sankuai.waimai.store.newwidgets.pullrefresh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
public class PullToRefreshView extends SCAbsScrollPullRefresh {
    public static ChangeQuickRedirect a;
    private c g;
    private int h;
    private int i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements c {
        public static final b a = new b();

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.PullToRefreshView.c
        public final boolean a() {
            return false;
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.PullToRefreshView.c
        public final boolean b() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        boolean a();

        boolean b();
    }

    public PullToRefreshView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "823b8375e91ea9ffec6780ce8a6f6cd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "823b8375e91ea9ffec6780ce8a6f6cd0");
        } else {
            a(context);
        }
    }

    public PullToRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2d0b4af27bd08b2fdc9aac47e975ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2d0b4af27bd08b2fdc9aac47e975ee");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef6b27d75242af439c5166dd9b44c4e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef6b27d75242af439c5166dd9b44c4e2");
        } else {
            this.i = ViewConfiguration.get(context).getScaledTouchSlop();
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.SCAbsScrollPullRefresh, android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abc2544f2743351cf09c6aa790ee42b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abc2544f2743351cf09c6aa790ee42b7");
            return;
        }
        super.onFinishInflate();
        this.g = g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f687243125ff8430c43f79cbb31395d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f687243125ff8430c43f79cbb31395d");
            return;
        }
        super.onAttachedToWindow();
        this.g = g();
    }

    public void setContentView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b408709eb7780adfc30fc6be7e6dd4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b408709eb7780adfc30fc6be7e6dd4a");
            return;
        }
        super.addView(view);
        this.g = g();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7b4f79a30cb76db56fca3d96d74bfca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7b4f79a30cb76db56fca3d96d74bfca")).booleanValue();
        }
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.h = rawY;
        } else if (action == 2) {
            int i = rawY - this.h;
            if (this.e && i >= this.i && this.g.a()) {
                setPullTarget(1);
                return true;
            } else if (this.f && i <= (-this.i) && this.g.b()) {
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
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4ba445dd6257d02e05747aab913bb00", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4ba445dd6257d02e05747aab913bb00")).booleanValue();
        }
        int rawY = (int) motionEvent.getRawY();
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                if (e()) {
                    this.c.d();
                } else if (f()) {
                    this.d.d();
                }
                setPullTarget(0);
                break;
            case 2:
                int i = rawY - this.h;
                if (e()) {
                    this.c.c(i);
                    break;
                } else if (f()) {
                    this.d.c(-i);
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @NonNull
    private c g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0bbc7e2c61bb664424ed707596ec4a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0bbc7e2c61bb664424ed707596ec4a6");
        }
        RecyclerView c2 = com.sankuai.waimai.store.newwidgets.pullrefresh.d.c(this);
        if (c2 != null) {
            return new d(c2);
        }
        ScrollView b2 = com.sankuai.waimai.store.newwidgets.pullrefresh.d.b(this);
        if (b2 != null) {
            return new e(b2);
        }
        AdapterView<?> a2 = com.sankuai.waimai.store.newwidgets.pullrefresh.d.a(this);
        if (a2 != null) {
            return new a(a2);
        }
        return b.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class d implements c {
        public static ChangeQuickRedirect a;
        @NonNull
        private final RecyclerView c;

        public d(@NonNull RecyclerView recyclerView) {
            Object[] objArr = {PullToRefreshView.this, recyclerView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200fcef464096e5a948a65712874b014", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200fcef464096e5a948a65712874b014");
            } else {
                this.c = recyclerView;
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.PullToRefreshView.c
        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d54f76946f3e8ef963d0d66532fdd5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d54f76946f3e8ef963d0d66532fdd5")).booleanValue();
            }
            LinearLayoutManager linearLayoutManager = this.c.getLayoutManager() instanceof LinearLayoutManager ? (LinearLayoutManager) this.c.getLayoutManager() : null;
            return (linearLayoutManager == null || this.c.getLayoutManager().getChildAt(0) == null || linearLayoutManager.findFirstCompletelyVisibleItemPosition() != 0) ? false : true;
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.PullToRefreshView.c
        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18792a2f6e459c18e654e5f558a8919d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18792a2f6e459c18e654e5f558a8919d")).booleanValue();
            }
            View childAt = this.c.getChildAt(0);
            return childAt != null && childAt.getMeasuredHeight() <= PullToRefreshView.this.getHeight() + this.c.getScrollY();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class e implements c {
        public static ChangeQuickRedirect a;
        @NonNull
        private final ScrollView c;

        public e(@NonNull ScrollView scrollView) {
            Object[] objArr = {PullToRefreshView.this, scrollView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0069d26c461d4e9c33f917bd21cd5696", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0069d26c461d4e9c33f917bd21cd5696");
            } else {
                this.c = scrollView;
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.PullToRefreshView.c
        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72b8d1b5a846160e0acce3d21071105f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72b8d1b5a846160e0acce3d21071105f")).booleanValue() : this.c.getScrollY() == 0;
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.PullToRefreshView.c
        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aefd17fd85254433221b600a18ce63ab", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aefd17fd85254433221b600a18ce63ab")).booleanValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ddcae1590946031cc64483eda1bff1e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ddcae1590946031cc64483eda1bff1e");
            } else {
                this.b = adapterView;
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.PullToRefreshView.c
        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b57ad611c39c4fb72cabfe58e1e6d5e6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b57ad611c39c4fb72cabfe58e1e6d5e6")).booleanValue();
            }
            View childAt = this.b.getChildAt(0);
            if (childAt != null && this.b.getFirstVisiblePosition() == 0) {
                if (childAt.getTop() >= this.b.getPaddingTop() - 1) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.PullToRefreshView.c
        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1209d978805039b4a20b986e5750f8e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1209d978805039b4a20b986e5750f8e")).booleanValue();
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
