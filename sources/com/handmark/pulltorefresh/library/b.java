package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.handmark.pulltorefresh.library.c;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class b<T extends AbsListView> extends c<T> implements AbsListView.OnScrollListener {
    private int c;
    private AbsListView.OnScrollListener d;
    private c.b e;
    private View f;
    private FrameLayout g;
    private com.handmark.pulltorefresh.library.internal.c h;
    private com.handmark.pulltorefresh.library.internal.c i;
    private boolean j;
    private boolean k;

    @Override // android.view.View
    public abstract ContextMenu.ContextMenuInfo getContextMenuInfo();

    @Override // com.handmark.pulltorefresh.library.c
    protected final /* synthetic */ void a(Context context, View view) {
        this.g = new FrameLayout(context);
        this.g.addView((AbsListView) view, -1, -1);
        a(this.g, new LinearLayout.LayoutParams(-1, 0, 1.0f));
    }

    public b(Context context) {
        super(context);
        this.c = -1;
        this.k = true;
        ((AbsListView) this.b).setOnScrollListener(this);
    }

    public boolean getShowIndicator() {
        return this.j;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.e != null) {
            int i4 = i + i2;
            if (i2 > 0 && i4 + 1 == i3 && i4 != this.c) {
                this.c = i4;
            }
        }
        if (getShowIndicatorInternal()) {
            m();
        }
        if (this.d != null) {
            this.d.onScroll(absListView, i, i2, i3);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.d != null) {
            this.d.onScrollStateChanged(absListView, i);
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f == null || this.k) {
            return;
        }
        this.f.scrollTo(-i, -i2);
    }

    public final void setEmptyView(View view) {
        if (this.f != null) {
            this.g.removeView(this.f);
        }
        if (view != null) {
            view.setClickable(true);
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(view);
            }
            this.g.addView(view, -1, -1);
            if (this.b instanceof com.handmark.pulltorefresh.library.internal.b) {
                ((com.handmark.pulltorefresh.library.internal.b) this.b).setEmptyViewInternal(view);
            } else {
                ((AbsListView) this.b).setEmptyView(view);
            }
            this.f = view;
        }
    }

    public final void setScrollEmptyView(boolean z) {
        this.k = z;
    }

    public final void setOnLastItemVisibleListener(c.b bVar) {
        this.e = bVar;
    }

    public final void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.d = onScrollListener;
    }

    public void setShowIndicator(boolean z) {
        this.j = z;
        if (getShowIndicatorInternal()) {
            k();
        } else {
            l();
        }
    }

    @Override // com.handmark.pulltorefresh.library.c
    protected final void a(TypedArray typedArray) {
        this.j = typedArray.getBoolean(5, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.handmark.pulltorefresh.library.c
    public final void c() {
        super.c();
        if (getShowIndicatorInternal()) {
            switch (getCurrentMode()) {
                case PULL_UP_TO_REFRESH:
                    this.i.e();
                    return;
                case PULL_DOWN_TO_REFRESH:
                    this.h.e();
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.handmark.pulltorefresh.library.c
    public final void d() {
        super.d();
        if (getShowIndicatorInternal()) {
            switch (getCurrentMode()) {
                case PULL_UP_TO_REFRESH:
                    this.i.d();
                    return;
                case PULL_DOWN_TO_REFRESH:
                    this.h.d();
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.handmark.pulltorefresh.library.c
    public void e() {
        super.e();
        if (getShowIndicatorInternal()) {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.handmark.pulltorefresh.library.c
    public void setRefreshingInternal(boolean z) {
        super.setRefreshingInternal(z);
        if (getShowIndicatorInternal()) {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.handmark.pulltorefresh.library.c
    public final void f() {
        super.f();
        if (getShowIndicatorInternal()) {
            k();
        } else {
            l();
        }
    }

    private void k() {
        c.a mode = getMode();
        if (mode.a() && this.h == null) {
            this.h = new com.handmark.pulltorefresh.library.internal.c(getContext(), c.a.PULL_DOWN_TO_REFRESH);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = getResources().getDimensionPixelSize(R.dimen.indicator_right_padding);
            layoutParams.gravity = 53;
            this.g.addView(this.h, layoutParams);
        } else if (!mode.a() && this.h != null) {
            this.g.removeView(this.h);
            this.h = null;
        }
        if (mode.b() && this.i == null) {
            this.i = new com.handmark.pulltorefresh.library.internal.c(getContext(), c.a.PULL_UP_TO_REFRESH);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.rightMargin = getResources().getDimensionPixelSize(R.dimen.indicator_right_padding);
            layoutParams2.gravity = 85;
            this.g.addView(this.i, layoutParams2);
        } else if (mode.b() || this.i == null) {
        } else {
            this.g.removeView(this.i);
            this.i = null;
        }
    }

    private boolean getShowIndicatorInternal() {
        return this.j && g();
    }

    private void l() {
        if (this.h != null) {
            this.g.removeView(this.h);
            this.h = null;
        }
        if (this.i != null) {
            this.g.removeView(this.i);
            this.i = null;
        }
    }

    private void m() {
        if (this.h != null) {
            if (!h() && a()) {
                if (!this.h.a()) {
                    this.h.c();
                }
            } else if (this.h.a()) {
                this.h.b();
            }
        }
        if (this.i != null) {
            if (!h() && b()) {
                if (this.i.a()) {
                    return;
                }
                this.i.c();
            } else if (this.i.a()) {
                this.i.b();
            }
        }
    }

    @Override // com.handmark.pulltorefresh.library.c
    protected final boolean a() {
        View childAt;
        Adapter adapter = ((AbsListView) this.b).getAdapter();
        if (adapter == null || adapter.isEmpty()) {
            return true;
        }
        return ((AbsListView) this.b).getFirstVisiblePosition() == 0 && (childAt = ((AbsListView) this.b).getChildAt(0)) != null && childAt.getTop() >= ((AbsListView) this.b).getTop();
    }

    @Override // com.handmark.pulltorefresh.library.c
    protected final boolean b() {
        Adapter adapter = ((AbsListView) this.b).getAdapter();
        if (adapter == null || adapter.isEmpty()) {
            return true;
        }
        int count = ((AbsListView) this.b).getCount();
        int lastVisiblePosition = ((AbsListView) this.b).getLastVisiblePosition();
        if (lastVisiblePosition == count - 1) {
            View childAt = ((AbsListView) this.b).getChildAt(lastVisiblePosition - ((AbsListView) this.b).getFirstVisiblePosition());
            return childAt != null && childAt.getBottom() <= ((AbsListView) this.b).getBottom();
        }
        return false;
    }
}
