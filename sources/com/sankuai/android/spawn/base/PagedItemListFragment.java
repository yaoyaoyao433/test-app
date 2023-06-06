package com.sankuai.android.spawn.base;

import android.os.Bundle;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes3.dex */
public abstract class PagedItemListFragment<D, I> extends PullToRefreshListFragment<D, I> implements AbsListView.OnScrollListener {
    public static ChangeQuickRedirect m;
    protected int n;
    protected int o;
    protected int p;
    private boolean r;
    private PointsLoopView s;
    private int t;

    public PagedItemListFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6c78c9dc86ccc41c8a5601e44e7b6ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6c78c9dc86ccc41c8a5601e44e7b6ab");
            return;
        }
        this.t = 0;
        this.o = -1;
        this.p = -1;
    }

    @Override // com.sankuai.android.spawn.base.BaseListFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1af995f96a0766bc0bc07d65ed739f85", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1af995f96a0766bc0bc07d65ed739f85");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.s = (PointsLoopView) layoutInflater.inflate(R.layout.list_footer_more, (ViewGroup) ((ListView) onCreateView.findViewById(16908298)), false);
        this.s.setEnabled(false);
        this.s.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.android.spawn.base.PagedItemListFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d1b13ced31613eb32f7e46175175c4b", 6917529027641081858L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d1b13ced31613eb32f7e46175175c4b");
                } else {
                    PagedItemListFragment.this.e();
                }
            }
        });
        this.r = false;
        return onCreateView;
    }

    @Override // com.sankuai.android.spawn.base.BaseListFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5b0684c92979d0225179fd2a8ff30c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5b0684c92979d0225179fd2a8ff30c");
            return;
        }
        super.onViewCreated(view, bundle);
        a().setOnScrollListener(this);
    }

    @Override // com.sankuai.android.spawn.base.BaseListFragment
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f471e036731dcf7b9cce4d65850c25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f471e036731dcf7b9cce4d65850c25");
            return;
        }
        this.n = 0;
        this.o = -1;
        this.p = -1;
        if (isAdded()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("refresh", true);
            getLoaderManager().restartLoader(100, bundle, this);
        }
    }

    @Override // com.sankuai.android.spawn.base.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2a3518d19085daf9521c0baed854f5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2a3518d19085daf9521c0baed854f5a");
            return;
        }
        super.onResume();
        if (isVisible()) {
            this.o = this.p;
        }
    }

    @Override // com.sankuai.android.spawn.base.PullToRefreshListFragment, com.sankuai.android.spawn.base.BaseListFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c39921da65a7852720c50d7eb0ded28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c39921da65a7852720c50d7eb0ded28");
            return;
        }
        a().setOnScrollListener(null);
        super.onDestroyView();
        this.s.a();
        this.s = null;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b72e432c71fab279b312562333133c8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b72e432c71fab279b312562333133c8a");
            return;
        }
        this.n = this.b.getCount();
        this.s.setText(R.string.page_footer_loading);
        PointsLoopView pointsLoopView = this.s;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = PointsLoopView.a;
        if (PatchProxy.isSupport(objArr2, pointsLoopView, changeQuickRedirect2, false, "3bf13149d91243256e1872910dacd6d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, pointsLoopView, changeQuickRedirect2, false, "3bf13149d91243256e1872910dacd6d7");
        } else {
            pointsLoopView.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = PointsLoopView.a;
            if (PatchProxy.isSupport(objArr3, pointsLoopView, changeQuickRedirect3, false, "848e471f6bd93b64aed2132113880092", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, pointsLoopView, changeQuickRedirect3, false, "848e471f6bd93b64aed2132113880092");
            } else if (pointsLoopView.g) {
                pointsLoopView.g = false;
                if (pointsLoopView.e != null) {
                    pointsLoopView.d = pointsLoopView.getText().toString();
                    pointsLoopView.e.postDelayed(pointsLoopView.f, PointsLoopView.c);
                }
            }
        }
        this.s.setEnabled(false);
        getLoaderManager().restartLoader(100, null, this);
    }
}
