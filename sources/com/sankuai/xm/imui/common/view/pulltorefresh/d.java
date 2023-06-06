package com.sankuai.xm.imui.common.view.pulltorefresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.view.pulltorefresh.e;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class d<T extends AbsListView> extends e<T> implements AbsListView.OnScrollListener {
    public static ChangeQuickRedirect a;
    private boolean f;
    private AbsListView.OnScrollListener g;
    private e.d h;
    private View i;
    private com.sankuai.xm.imui.common.view.pulltorefresh.internal.b j;
    private com.sankuai.xm.imui.common.view.pulltorefresh.internal.b k;
    private boolean l;
    private boolean m;

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2bfc71278c14a321aa41fe047d937f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2bfc71278c14a321aa41fe047d937f7");
            return;
        }
        this.m = true;
        ((AbsListView) this.d).setOnScrollListener(this);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c1dd6fe36e396e5b2250d4eee7f3804", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c1dd6fe36e396e5b2250d4eee7f3804");
            return;
        }
        this.m = true;
        ((AbsListView) this.d).setOnScrollListener(this);
    }

    public d(Context context, e.c cVar) {
        super(context, cVar);
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beb7d189f4661be28e55b6de0b606217", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beb7d189f4661be28e55b6de0b606217");
            return;
        }
        this.m = true;
        ((AbsListView) this.d).setOnScrollListener(this);
    }

    public d(Context context, e.c cVar, e.a aVar) {
        super(context, cVar, aVar);
        Object[] objArr = {context, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbde07f518077e26b26c203a6640a6da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbde07f518077e26b26c203a6640a6da");
            return;
        }
        this.m = true;
        ((AbsListView) this.d).setOnScrollListener(this);
    }

    public boolean getShowIndicator() {
        return this.l;
    }

    public void setShowIndicator(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e63ebb9158ce30777116e74b58a8309", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e63ebb9158ce30777116e74b58a8309");
            return;
        }
        this.l = z;
        if (getShowIndicatorInternal()) {
            j();
        } else {
            k();
        }
    }

    public int getFirstVisiblePosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc3ec3e04d6bfbb9c11fb77d5b4d97dd", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc3ec3e04d6bfbb9c11fb77d5b4d97dd")).intValue() : ((AbsListView) this.d).getFirstVisiblePosition();
    }

    public int getLastVisiblePosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36cffc6a3dec3c47b08c9bdf23a4874e", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36cffc6a3dec3c47b08c9bdf23a4874e")).intValue() : ((AbsListView) this.d).getLastVisiblePosition();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        boolean z = false;
        Object[] objArr = {absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d80f58870726f5c210502d58c1756b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d80f58870726f5c210502d58c1756b5");
            return;
        }
        if (c) {
            com.sankuai.xm.imui.common.util.d.a("PullToRefresh.First Visible: " + i + ". Visible Count: " + i2 + ". Total Items:" + i3, new Object[0]);
        }
        if (this.h != null) {
            if (i3 > 0 && i + i2 >= i3 - 1) {
                z = true;
            }
            this.f = z;
        }
        if (getShowIndicatorInternal()) {
            l();
        }
        if (this.g != null) {
            this.g.onScroll(absListView, i, i2, i3);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        Object[] objArr = {absListView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6db57e46c6c8a9dea32376f7407babcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6db57e46c6c8a9dea32376f7407babcc");
        } else if (this.g != null) {
            this.g.onScrollStateChanged(absListView, i);
        }
    }

    public void setAdapter(ListAdapter listAdapter) {
        Object[] objArr = {listAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5adf1fcb806ad27605542e53b83e2fa4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5adf1fcb806ad27605542e53b83e2fa4");
        } else {
            ((AbsListView) this.d).setAdapter(listAdapter);
        }
    }

    public final void setEmptyView(View view) {
        FrameLayout.LayoutParams layoutParams;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b67f57dd2c3b92ec9de5fa44c504de13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b67f57dd2c3b92ec9de5fa44c504de13");
            return;
        }
        FrameLayout refreshableViewWrapper = getRefreshableViewWrapper();
        if (view != null) {
            view.setClickable(true);
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(view);
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            Object[] objArr2 = {layoutParams2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            FrameLayout.LayoutParams layoutParams3 = null;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b24d1cc4506b7541f2789e6943070565", 6917529027641081856L)) {
                layoutParams = (FrameLayout.LayoutParams) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b24d1cc4506b7541f2789e6943070565");
            } else {
                if (layoutParams2 != null) {
                    layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
                    if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                        layoutParams3.gravity = ((LinearLayout.LayoutParams) layoutParams2).gravity;
                    } else {
                        layoutParams3.gravity = 17;
                    }
                }
                layoutParams = layoutParams3;
            }
            if (layoutParams != null) {
                refreshableViewWrapper.addView(view, layoutParams);
            } else {
                refreshableViewWrapper.addView(view);
            }
        }
        if (this.d instanceof com.sankuai.xm.imui.common.view.pulltorefresh.internal.a) {
            ((com.sankuai.xm.imui.common.view.pulltorefresh.internal.a) this.d).setEmptyViewInternal(view);
        } else {
            ((AbsListView) this.d).setEmptyView(view);
        }
        this.i = view;
    }

    public final void setOnLastItemVisibleListener(e.d dVar) {
        this.h = dVar;
    }

    public final void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.g = onScrollListener;
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e8e9aa3240074b0eed48c6b83130343", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e8e9aa3240074b0eed48c6b83130343");
            return;
        }
        super.a();
        if (getShowIndicatorInternal()) {
            switch (getCurrentMode()) {
                case PULL_FROM_END:
                    this.k.e();
                    return;
                case PULL_FROM_START:
                    this.j.e();
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.e
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a28b55f7741e4bd3cf54fdb42ac7432", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a28b55f7741e4bd3cf54fdb42ac7432");
            return;
        }
        super.a(z);
        if (getShowIndicatorInternal()) {
            l();
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.e
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "153aeccf24e3f8c0cdaf53bf86c7eca5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "153aeccf24e3f8c0cdaf53bf86c7eca5");
            return;
        }
        super.b();
        if (getShowIndicatorInternal()) {
            switch (getCurrentMode()) {
                case PULL_FROM_END:
                    this.k.d();
                    return;
                case PULL_FROM_START:
                    this.j.d();
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.e
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dce315f3d6edb8dc7ac7c9bcf70a5a81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dce315f3d6edb8dc7ac7c9bcf70a5a81");
            return;
        }
        super.c();
        if (getShowIndicatorInternal()) {
            l();
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.e
    public void a(TypedArray typedArray) {
        Object[] objArr = {typedArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fd696bb927c947eb43777192377188e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fd696bb927c947eb43777192377188e");
        } else {
            this.l = typedArray.getBoolean(5, true ^ h());
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.e
    public final boolean d() {
        View childAt;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c50b22a18df941dd9a4b92f814b853", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c50b22a18df941dd9a4b92f814b853")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "463b9e82607bb11b59620b6427f4e9c8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "463b9e82607bb11b59620b6427f4e9c8")).booleanValue();
        }
        Adapter adapter = ((AbsListView) this.d).getAdapter();
        if (adapter != null && !adapter.isEmpty()) {
            return ((AbsListView) this.d).getFirstVisiblePosition() <= 1 && (childAt = ((AbsListView) this.d).getChildAt(0)) != null && childAt.getTop() >= ((AbsListView) this.d).getTop();
        }
        if (c) {
            com.sankuai.xm.imui.common.util.d.a("PullToRefresh.isFirstItemVisible. Empty View.", new Object[0]);
        }
        return true;
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.e
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c650bd82dae7f8001f621a335864401d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c650bd82dae7f8001f621a335864401d")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7231a6cd5ab7c7386250a4c1c538a777", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7231a6cd5ab7c7386250a4c1c538a777")).booleanValue();
        }
        Adapter adapter = ((AbsListView) this.d).getAdapter();
        if (adapter == null || adapter.isEmpty()) {
            if (c) {
                com.sankuai.xm.imui.common.util.d.a("PullToRefresh.isLastItemVisible. Empty View.", new Object[0]);
            }
            return true;
        }
        int count = ((AbsListView) this.d).getCount() - 1;
        int lastVisiblePosition = ((AbsListView) this.d).getLastVisiblePosition();
        if (c) {
            com.sankuai.xm.imui.common.util.d.a("PullToRefresh.isLastItemVisible. Last Item Position: " + count + " Last Visible Pos: " + lastVisiblePosition, new Object[0]);
        }
        if (lastVisiblePosition >= count - 1) {
            View childAt = ((AbsListView) this.d).getChildAt(lastVisiblePosition - ((AbsListView) this.d).getFirstVisiblePosition());
            return childAt != null && childAt.getBottom() <= ((AbsListView) this.d).getBottom();
        }
        return false;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d93ae0f777688f53b5a2e70ad861afd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d93ae0f777688f53b5a2e70ad861afd");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.i == null || this.m) {
            return;
        }
        this.i.scrollTo(-i, -i2);
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.e
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "615fb37b4334b564c3884b3439fa3a0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "615fb37b4334b564c3884b3439fa3a0b");
            return;
        }
        super.f();
        if (getShowIndicatorInternal()) {
            j();
        } else {
            k();
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c51fc52bf563b31f1fce3675e15e324", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c51fc52bf563b31f1fce3675e15e324");
            return;
        }
        e.c mode = getMode();
        FrameLayout refreshableViewWrapper = getRefreshableViewWrapper();
        if (mode.c() && this.j == null) {
            this.j = new com.sankuai.xm.imui.common.view.pulltorefresh.internal.b(getContext(), e.c.PULL_FROM_START);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = getResources().getDimensionPixelSize(R.dimen.xm_sdk_indicator_right_padding);
            layoutParams.gravity = 53;
            refreshableViewWrapper.addView(this.j, layoutParams);
        } else if (!mode.c() && this.j != null) {
            refreshableViewWrapper.removeView(this.j);
            this.j = null;
        }
        if (mode.d() && this.k == null) {
            this.k = new com.sankuai.xm.imui.common.view.pulltorefresh.internal.b(getContext(), e.c.PULL_FROM_END);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.rightMargin = getResources().getDimensionPixelSize(R.dimen.xm_sdk_indicator_right_padding);
            layoutParams2.gravity = 85;
            refreshableViewWrapper.addView(this.k, layoutParams2);
        } else if (mode.d() || this.k == null) {
        } else {
            refreshableViewWrapper.removeView(this.k);
            this.k = null;
        }
    }

    private boolean getShowIndicatorInternal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4752e853265e52706ae015ef177b70b3", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4752e853265e52706ae015ef177b70b3")).booleanValue() : this.l && g();
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6129b46d0a7933d369550524675689a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6129b46d0a7933d369550524675689a");
            return;
        }
        if (this.j != null) {
            getRefreshableViewWrapper().removeView(this.j);
            this.j = null;
        }
        if (this.k != null) {
            getRefreshableViewWrapper().removeView(this.k);
            this.k = null;
        }
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbe861846a10e323f745dbef7174827d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbe861846a10e323f745dbef7174827d");
            return;
        }
        if (this.j != null) {
            if (!i() && d()) {
                if (!this.j.a()) {
                    this.j.c();
                }
            } else if (this.j.a()) {
                this.j.b();
            }
        }
        if (this.k != null) {
            if (!i() && e()) {
                if (this.k.a()) {
                    return;
                }
                this.k.c();
            } else if (this.k.a()) {
                this.k.b();
            }
        }
    }
}
