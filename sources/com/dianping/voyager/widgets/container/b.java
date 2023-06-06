package com.dianping.voyager.widgets.container;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.dianping.shield.component.utils.PageContainerThemeManager;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends com.dianping.voyager.widgets.container.a<RecyclerView> {
    public static ChangeQuickRedirect h;
    protected boolean i;
    private a j;
    private RecyclerView k;
    private PageContainerThemePackage l;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void onScrollChanged(int i, int i2, int i3, int i4);
    }

    @Override // com.dianping.voyager.widgets.container.a
    public final /* synthetic */ RecyclerView a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce8a1a74ff36a36b636d188271593c3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce8a1a74ff36a36b636d188271593c3e");
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.needMultiStickyTop});
        if (obtainStyledAttributes != null && obtainStyledAttributes.hasValue(0)) {
            this.i = obtainStyledAttributes.getBoolean(0, false);
        }
        if (this.k == null) {
            this.k = new PageContainerRecyclerView(context, attributeSet);
        }
        return this.k;
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b0056145e91fe4643b17513d11bb34a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b0056145e91fe4643b17513d11bb34a");
            return;
        }
        this.i = false;
        this.l = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().createTheme();
        setHeaderLoadingView(this.l.getPageContainerViewResCreate().createHeaderView(context, null));
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24c71dc74aef8e1c17d379c18e5d366b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24c71dc74aef8e1c17d379c18e5d366b");
            return;
        }
        super.setVisibility(i);
        getRefreshableView().setVisibility(i);
    }

    @Override // com.dianping.voyager.widgets.container.a
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3713ef2953c3da1bd1a152a9aa9fcb06", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3713ef2953c3da1bd1a152a9aa9fcb06")).booleanValue();
        }
        if (((RecyclerView) this.e).getChildCount() <= 0) {
            return true;
        }
        return this.k.getLayoutManager() instanceof LinearLayoutManager ? ((LinearLayoutManager) ((RecyclerView) this.e).getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0 : ((RecyclerView) this.e).getChildPosition(((RecyclerView) this.e).getChildAt(0)) == 0 && ((RecyclerView) this.e).getChildAt(0).getTop() >= 0;
    }

    @Override // com.dianping.voyager.widgets.container.a
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5873cc044f7ae4d06191ed01ca89abdb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5873cc044f7ae4d06191ed01ca89abdb")).booleanValue() : ((RecyclerView) this.e).getChildPosition(((RecyclerView) this.e).getChildAt(((RecyclerView) this.e).getChildCount() - 1)) >= ((RecyclerView) this.e).getAdapter().getItemCount() - 1 && ((RecyclerView) this.e).getChildAt(((RecyclerView) this.e).getChildCount() - 1).getBottom() <= ((RecyclerView) this.e).getBottom();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b34e5d6474e2965e986720c6a0e7d3c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b34e5d6474e2965e986720c6a0e7d3c9");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.j != null) {
            this.j.onScrollChanged(i, i2, i3, i4);
        }
    }

    public final void setOnScrollChangedListener(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0f2866471b09905f974776860efe72d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0f2866471b09905f974776860efe72d");
            return;
        }
        this.j = aVar;
        if (this.e instanceof PageContainerRecyclerView) {
            ((PageContainerRecyclerView) this.e).setOnScrollChangedListener(new PageContainerRecyclerView.OnScrollChangedListener() { // from class: com.dianping.voyager.widgets.container.b.1
                public static ChangeQuickRedirect a;

                @Override // com.dianping.shield.component.widgets.PageContainerRecyclerView.OnScrollChangedListener
                public final void onScrollChanged(int i, int i2, int i3, int i4) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "480b5efb816567b28b99e2cdb3692039", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "480b5efb816567b28b99e2cdb3692039");
                    } else if (b.this.j != null) {
                        b.this.j.onScrollChanged(i, i2, i3, i4);
                    }
                }
            });
        }
    }

    public final void setFirstItemScrollListener(final com.dianping.agentsdk.pagecontainer.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f81244dee5a28c631108e37876c52da8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f81244dee5a28c631108e37876c52da8");
        } else if (this.e instanceof PageContainerRecyclerView) {
            ((PageContainerRecyclerView) this.e).setFirstItemScrollListener(new com.dianping.agentsdk.pagecontainer.a() { // from class: com.dianping.voyager.widgets.container.b.2
                public static ChangeQuickRedirect a;

                @Override // com.dianping.agentsdk.pagecontainer.a
                public final void onScrollChanged(int i, int i2, boolean z) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab736470a95fd2a4c3fb27894106131c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab736470a95fd2a4c3fb27894106131c");
                    } else if (aVar != null) {
                        aVar.onScrollChanged(i, i2, z);
                    }
                }
            });
        }
    }

    @Override // com.dianping.voyager.widgets.container.a, com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldPreload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2020d705f5d5f9d53e747e1478bce323", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2020d705f5d5f9d53e747e1478bce323");
        } else {
            super.shieldPreload();
        }
    }

    @Override // com.dianping.voyager.widgets.container.a, com.dianping.shield.preload.ShieldPreloadInterface
    public final void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98032f3adc8c9d6200a8ae72a3d5fc92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98032f3adc8c9d6200a8ae72a3d5fc92");
            return;
        }
        super.shieldRecycle();
        if (this.k instanceof PageContainerRecyclerView) {
            ((PageContainerRecyclerView) this.k).shieldRecycle();
        }
        this.i = false;
        this.j = null;
    }
}
