package com.sankuai.waimai.machpro.component.list;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.list.MPListComponent;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends FrameLayout implements com.sankuai.waimai.machpro.view.a {
    public static ChangeQuickRedirect a;
    RecyclerView b;
    FrameLayout c;
    boolean d;
    private final SparseArray<com.sankuai.waimai.machpro.component.d> e;
    private final int f;
    private final int g;
    private int h;
    private boolean i;
    private com.sankuai.waimai.machpro.component.d j;
    private FrameLayout k;
    private boolean l;

    public static /* synthetic */ void b(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "09f5c5bae881e1a132000b99909da2bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "09f5c5bae881e1a132000b99909da2bb");
        } else {
            gVar.postDelayed(new Runnable() { // from class: com.sankuai.waimai.machpro.component.list.g.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5d99a3db1ccff3e70d0655378b00696", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5d99a3db1ccff3e70d0655378b00696");
                    } else {
                        g.this.a(true);
                    }
                }
            }, 64L);
        }
    }

    public g(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ea0f002dcce7aafd61b390774a504e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ea0f002dcce7aafd61b390774a504e2");
            return;
        }
        this.e = new SparseArray<>();
        this.f = -101;
        this.g = -102;
        this.h = -1;
        this.d = false;
        this.i = false;
        this.l = true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6cc8a8029a10144427b84ae0ca978d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6cc8a8029a10144427b84ae0ca978d3");
        } else if (getChildCount() > 0 || !(view instanceof RecyclerView)) {
            throw new IllegalArgumentException("StickyHeaderLayout can host only one direct child --> RecyclerView");
        } else {
            super.addView(view, i, layoutParams);
            this.b = (RecyclerView) view;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7311eaa0cfe915393e7b484d88dc587", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7311eaa0cfe915393e7b484d88dc587");
            } else {
                this.b.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.machpro.component.list.g.1
                    public static ChangeQuickRedirect a;

                    @Override // android.support.v7.widget.RecyclerView.k
                    public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                        Object[] objArr3 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7890fadaee3a57851b1e235401082c0f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7890fadaee3a57851b1e235401082c0f");
                        } else if (g.this.d) {
                            g.this.a(false);
                        }
                    }
                });
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b2666f5c7cf27dc3b9928fb1a0fcc269", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b2666f5c7cf27dc3b9928fb1a0fcc269");
                return;
            }
            this.c = new FrameLayout(getContext());
            ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            this.c.setLayoutParams(layoutParams2);
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setClipChildren(true);
            frameLayout.addView(this.c);
            super.addView(frameLayout, 1, layoutParams2);
        }
    }

    public final FrameLayout getPendantLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b889dbc1fd5249a4f95114945d8f66d", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b889dbc1fd5249a4f95114945d8f66d");
        }
        if (this.k == null) {
            this.k = new FrameLayout(getContext());
            super.addView(this.k, 2, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.k;
    }

    public final void setSticky(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb24828e7f12022732e2850544aae7f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb24828e7f12022732e2850544aae7f2");
        } else if (this.d != z) {
            this.d = z;
            if (this.c != null) {
                if (this.d) {
                    this.c.setVisibility(0);
                    a(false);
                    return;
                }
                b();
                this.c.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "340093c654eb74f48af51953c0572129", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "340093c654eb74f48af51953c0572129");
            return;
        }
        try {
            RecyclerView.a adapter = this.b.getAdapter();
            if (adapter instanceof MPListComponent.a) {
                MPListComponent.a aVar = (MPListComponent.a) adapter;
                a(aVar);
                int firstVisibleItem = getFirstVisibleItem();
                if (firstVisibleItem == 0 && aVar.b()) {
                    if (this.c != null) {
                        this.c.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.c.setVisibility(0);
                int d = aVar.d(aVar.b(firstVisibleItem));
                if (z || this.h != d) {
                    this.h = d;
                    int e = aVar.e(d);
                    if (e != -1) {
                        int itemViewType = aVar.getItemViewType(e);
                        com.sankuai.waimai.machpro.component.d a2 = a(itemViewType);
                        boolean z2 = a2 != null;
                        if (a2 == null) {
                            a2 = b(itemViewType);
                        }
                        if (a2 == null) {
                            a2 = aVar.onCreateViewHolder(this.c, itemViewType);
                            if (a2.itemView != null) {
                                a2.itemView.setTag(-101, Integer.valueOf(itemViewType));
                                a2.itemView.setTag(-102, a2);
                            }
                        }
                        if (a2 != null && a2.itemView != null) {
                            aVar.onBindViewHolder(a2, e);
                            this.j = a2;
                            if (!z2) {
                                this.c.addView(a2.itemView);
                            }
                        }
                    } else {
                        b();
                    }
                }
                if (a()) {
                    b();
                }
                if (this.c.getChildCount() > 0 && this.c.getHeight() == 0) {
                    this.c.requestLayout();
                }
                this.c.setTranslationY(a(aVar, firstVisibleItem, d + 1));
            }
        } catch (Exception e2) {
            com.sankuai.waimai.machpro.util.a.a("StickyHeaderLayout-->" + e2.getMessage());
        }
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd98f2f0f2fb5866be23b71a820c5aee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd98f2f0f2fb5866be23b71a820c5aee")).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = this.b.getLayoutManager();
        return (layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0;
    }

    private void a(RecyclerView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ec677ae9dc42bf5b28b8fd75e5e636e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ec677ae9dc42bf5b28b8fd75e5e636e");
        } else if (this.i) {
        } else {
            this.i = true;
            aVar.registerAdapterDataObserver(new RecyclerView.c() { // from class: com.sankuai.waimai.machpro.component.list.g.2
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.c
                public final void onChanged() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "828b12659e2314ebd81998b5db550627", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "828b12659e2314ebd81998b5db550627");
                    } else {
                        g.b(g.this);
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.c
                public final void onItemRangeChanged(int i, int i2) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b1ddced1ad08449c7cd553d2e1ee25c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b1ddced1ad08449c7cd553d2e1ee25c");
                    } else {
                        g.b(g.this);
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.c
                public final void onItemRangeInserted(int i, int i2) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77325979bbc6204d243ea38f012358cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77325979bbc6204d243ea38f012358cc");
                    } else {
                        g.b(g.this);
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.c
                public final void onItemRangeRemoved(int i, int i2) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2320cc141945b15f9e56a59560d02850", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2320cc141945b15f9e56a59560d02850");
                    } else {
                        g.b(g.this);
                    }
                }
            });
        }
    }

    private int getFirstVisibleItem() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "143d38452af2cf7038ee01ab424af047", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "143d38452af2cf7038ee01ab424af047")).intValue();
        }
        RecyclerView.LayoutManager layoutManager = this.b.getLayoutManager();
        if (layoutManager != null) {
            if (layoutManager instanceof GridLayoutManager) {
                i = ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition();
            } else if (layoutManager instanceof LinearLayoutManager) {
                i = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            } else if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return -1;
            } else {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
                staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
                Object[] objArr2 = {iArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4353f25d0b7de3f78f570d771b8c1ef7", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4353f25d0b7de3f78f570d771b8c1ef7")).intValue();
                } else {
                    i = iArr[0];
                    for (int i2 = 1; i2 < iArr.length; i2++) {
                        if (iArr[i2] < i) {
                            i = iArr[i2];
                        }
                    }
                }
            }
            return i;
        }
        return -1;
    }

    private com.sankuai.waimai.machpro.component.d a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d231c227dd39a8f855e943e02d534fd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.machpro.component.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d231c227dd39a8f855e943e02d534fd7");
        }
        if (this.c.getChildCount() > 0) {
            View childAt = this.c.getChildAt(0);
            if (((Integer) childAt.getTag(-101)).intValue() == i) {
                return (com.sankuai.waimai.machpro.component.d) childAt.getTag(-102);
            }
            b();
            return null;
        }
        return null;
    }

    private void b() {
        View childAt;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee8ce0c9c194cf304df4ddd17c06105b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee8ce0c9c194cf304df4ddd17c06105b");
            return;
        }
        this.h = -1;
        this.j = null;
        if (this.c == null || this.c.getChildCount() <= 0 || (childAt = this.c.getChildAt(0)) == null) {
            return;
        }
        this.e.put(((Integer) childAt.getTag(-101)).intValue(), (com.sankuai.waimai.machpro.component.d) childAt.getTag(-102));
        this.c.removeAllViews();
    }

    public final int getCurrentStickySection() {
        return this.h;
    }

    public final com.sankuai.waimai.machpro.component.d getCurHolder() {
        return this.j;
    }

    private com.sankuai.waimai.machpro.component.d b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bea3ebecd87557b489ecb15483952a37", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.machpro.component.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bea3ebecd87557b489ecb15483952a37") : this.e.get(i);
    }

    private float a(MPListComponent.a aVar, int i, int i2) {
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77e8cdb178c4fe2670a1e237afcde5cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77e8cdb178c4fe2670a1e237afcde5cc")).floatValue();
        }
        int e = aVar.e(i2);
        if (e != -1) {
            View view = null;
            if (!this.l) {
                RecyclerView.s findViewHolderForAdapterPosition = this.b.findViewHolderForAdapterPosition(e);
                if (findViewHolderForAdapterPosition != null) {
                    view = findViewHolderForAdapterPosition.itemView;
                }
            } else {
                int i3 = e - i;
                if (this.b.getChildCount() > i3) {
                    view = this.b.getChildAt(i3);
                }
            }
            if (view != null && this.c != null) {
                float y = view.getY() - this.c.getHeight();
                if (y < 0.0f) {
                    return y;
                }
            }
        }
        return 0.0f;
    }

    public final void setFoodList(boolean z) {
        this.l = z;
    }
}
