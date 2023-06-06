package com.sankuai.waimai.store.goods.list.viewblocks.newuser;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandAdapter;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGNewUserStickLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    SCRecyclerView b;
    private Context c;
    private FrameLayout d;
    private FrameLayout e;
    private final SparseArray<RecyclerView.s> f;
    private final int g;
    private final int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private a m;
    private RecyclerView.s n;
    private SGNewUserLandAdapter o;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i, int i2);
    }

    public static /* synthetic */ void d(SGNewUserStickLayout sGNewUserStickLayout) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, sGNewUserStickLayout, changeQuickRedirect, false, "97fa247e66741972b55397df4addadd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGNewUserStickLayout, changeQuickRedirect, false, "97fa247e66741972b55397df4addadd3");
        } else {
            sGNewUserStickLayout.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserStickLayout.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd992ac698dc4efd4f75757606d55dd1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd992ac698dc4efd4f75757606d55dd1");
                    } else {
                        SGNewUserStickLayout.this.a(true);
                    }
                }
            }, 64L);
        }
    }

    public void setmAdapter(SGNewUserLandAdapter sGNewUserLandAdapter) {
        this.o = sGNewUserLandAdapter;
    }

    public SGNewUserStickLayout(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d47e6f476fde8509f361f078dd204686", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d47e6f476fde8509f361f078dd204686");
            return;
        }
        this.f = new SparseArray<>();
        this.g = -101;
        this.h = -102;
        this.i = -1;
        this.j = -1;
        this.k = true;
        this.l = false;
        this.c = context;
    }

    public SGNewUserStickLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a91659850e85e473bf0e7db8fb1caff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a91659850e85e473bf0e7db8fb1caff");
            return;
        }
        this.f = new SparseArray<>();
        this.g = -101;
        this.h = -102;
        this.i = -1;
        this.j = -1;
        this.k = true;
        this.l = false;
        this.c = context;
    }

    public SGNewUserStickLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18cd07573e22548076ba70644cac8f35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18cd07573e22548076ba70644cac8f35");
            return;
        }
        this.f = new SparseArray<>();
        this.g = -101;
        this.h = -102;
        this.i = -1;
        this.j = -1;
        this.k = true;
        this.l = false;
        this.c = context;
    }

    public void setOnStickyChangedListener(a aVar) {
        this.m = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb1c3c6ef9d3d1c8e8b907a639e4a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb1c3c6ef9d3d1c8e8b907a639e4a04");
            return;
        }
        this.d = new FrameLayout(this.c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.d.setLayoutParams(layoutParams);
        super.addView(this.d, 1, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86126cf968df994a3e63cf3d69eb740a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86126cf968df994a3e63cf3d69eb740a");
            return;
        }
        this.e = new FrameLayout(this.c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = com.sankuai.shangou.stone.util.h.a(this.c, 0.0f);
        this.e.setLayoutParams(layoutParams);
        this.e.setBackgroundColor(-1);
        this.e.setPadding(com.sankuai.shangou.stone.util.h.a(this.c, 12.0f), 0, com.sankuai.shangou.stone.util.h.a(this.c, 12.0f), 0);
        super.addView(this.e, 0, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60ae5a677a70b6fbac63b9b8e00625e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60ae5a677a70b6fbac63b9b8e00625e1");
            return;
        }
        if ((this.b.getAdapter() instanceof com.sankuai.waimai.store.newwidgets.list.f) && this.o != null) {
            int i = this.i;
            SGNewUserLandAdapter sGNewUserLandAdapter = this.o;
            a(sGNewUserLandAdapter);
            int firstVisibleItem = getFirstVisibleItem();
            int b = sGNewUserLandAdapter.b(firstVisibleItem);
            if (z || this.i != b) {
                this.i = b;
                int d = sGNewUserLandAdapter.d(b);
                if (d != -1) {
                    int itemViewType = sGNewUserLandAdapter.getItemViewType(d);
                    this.n = c(itemViewType);
                    boolean z2 = this.n != null;
                    if (this.n == null) {
                        this.n = a(itemViewType);
                    }
                    if (this.n == null) {
                        this.n = sGNewUserLandAdapter.onCreateViewHolder(this.d, itemViewType);
                        this.n.itemView.setTag(-101, Integer.valueOf(itemViewType));
                        this.n.itemView.setTag(-102, this.n);
                    }
                    this.n.itemView.setTag(-103, "sticky");
                    sGNewUserLandAdapter.onBindViewHolder((f.c) this.n, d);
                    if (!z2) {
                        this.d.addView(this.n.itemView);
                    }
                } else {
                    c();
                }
            }
            if (this.b.computeVerticalScrollOffset() == 0) {
                c();
            }
            if (this.d.getChildCount() > 0 && this.d.getHeight() == 0) {
                this.d.requestLayout();
            }
            this.d.setTranslationY(a(sGNewUserLandAdapter, firstVisibleItem, sGNewUserLandAdapter.e(b)));
            if (this.m != null && i != this.i) {
                this.m.a(i, this.i);
            }
        }
        b(z);
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbefe6f674586ae2930feb23839ec0ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbefe6f674586ae2930feb23839ec0ac");
        } else if (!(this.b.getAdapter() instanceof com.sankuai.waimai.store.newwidgets.list.f) || this.o == null) {
        } else {
            int i = this.j;
            SGNewUserLandAdapter sGNewUserLandAdapter = this.o;
            a(sGNewUserLandAdapter);
            int firstVisibleItem = getFirstVisibleItem();
            int c = sGNewUserLandAdapter.c(firstVisibleItem);
            if (z || this.j != c) {
                this.j = c;
                int d = sGNewUserLandAdapter.d(c);
                if (d != -1) {
                    int itemViewType = sGNewUserLandAdapter.getItemViewType(d);
                    RecyclerView.s d2 = d(itemViewType);
                    boolean z2 = d2 != null;
                    if (d2 == null) {
                        d2 = a(itemViewType);
                    }
                    if (d2 == null) {
                        this.e.setTag(-103, "sticky");
                        d2 = sGNewUserLandAdapter.onCreateViewHolder(this.e, itemViewType);
                        d2.itemView.setTag(-101, Integer.valueOf(itemViewType));
                        d2.itemView.setTag(-102, d2);
                    }
                    d2.itemView.setTag(-103, "sticky");
                    sGNewUserLandAdapter.onBindViewHolder((f.c) d2, d);
                    if (!z2) {
                        u.b(this.e);
                        if (itemViewType == 16) {
                            this.e.setPadding(0, 0, 0, 0);
                            if (this.i == 1 && (this.n instanceof f.c) && ((f.c) this.n).b != null) {
                                com.sankuai.waimai.store.newwidgets.list.h hVar = ((f.c) this.n).b;
                                if (hVar instanceof SGNewUserLandAdapter.g) {
                                    ((SGNewUserLandAdapter.g) hVar).a(true);
                                }
                            }
                        } else {
                            this.e.setPadding(com.sankuai.shangou.stone.util.h.a(this.c, 12.0f), 0, com.sankuai.shangou.stone.util.h.a(this.c, 12.0f), 0);
                        }
                        this.e.addView(d2.itemView);
                        this.e.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserStickLayout.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                FrameLayout.LayoutParams layoutParams;
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32195e17a9285dcdaf677d2b25f9ebe9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32195e17a9285dcdaf677d2b25f9ebe9");
                                    return;
                                }
                                if (SGNewUserStickLayout.this.d != null && (layoutParams = (FrameLayout.LayoutParams) SGNewUserStickLayout.this.e.getLayoutParams()) != null) {
                                    layoutParams.topMargin = SGNewUserStickLayout.this.d.getHeight();
                                    SGNewUserStickLayout.this.e.setLayoutParams(layoutParams);
                                }
                                u.a(SGNewUserStickLayout.this.e);
                            }
                        }, 64L);
                    }
                } else {
                    d();
                }
            }
            if (this.b.computeVerticalScrollOffset() == 0) {
                d();
            }
            if ((this.e.getChildCount() > 0 && this.e.getHeight() == 0) || this.b.computeVerticalScrollOffset() == 0) {
                this.e.requestLayout();
            }
            this.e.setTranslationY(b(sGNewUserLandAdapter, firstVisibleItem, sGNewUserLandAdapter.f(c)));
            if (this.m == null || i == this.j) {
                return;
            }
            this.m.a(i, this.j);
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d7f429f8d50c9bb8967450a969e1df7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d7f429f8d50c9bb8967450a969e1df7");
        } else if (i == 16 && this.i == 1 && (this.n instanceof f.c) && ((f.c) this.n).b != null) {
            com.sankuai.waimai.store.newwidgets.list.h hVar = ((f.c) this.n).b;
            if (hVar instanceof SGNewUserLandAdapter.g) {
                ((SGNewUserLandAdapter.g) hVar).a(false);
            }
        }
    }

    private void a(SGNewUserLandAdapter sGNewUserLandAdapter) {
        Object[] objArr = {sGNewUserLandAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97e75e80a31f47ecb5c54350634cc7a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97e75e80a31f47ecb5c54350634cc7a5");
        } else if (this.l) {
        } else {
            this.l = true;
            sGNewUserLandAdapter.registerAdapterDataObserver(new RecyclerView.c() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserStickLayout.3
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.c
                public final void onChanged() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "718dc49810f92f63987c9df2b4a210d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "718dc49810f92f63987c9df2b4a210d1");
                    } else {
                        SGNewUserStickLayout.d(SGNewUserStickLayout.this);
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.c
                public final void onItemRangeChanged(int i, int i2) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7c3699cdd2d3a3a3030dc137855ea30", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7c3699cdd2d3a3a3030dc137855ea30");
                    } else {
                        SGNewUserStickLayout.d(SGNewUserStickLayout.this);
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.c
                public final void onItemRangeInserted(int i, int i2) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e3e2e846de70a21b3a9a1d1ca7d8783", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e3e2e846de70a21b3a9a1d1ca7d8783");
                    } else {
                        SGNewUserStickLayout.d(SGNewUserStickLayout.this);
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.c
                public final void onItemRangeRemoved(int i, int i2) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c40bbe4456c395d97c2783b2648e539", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c40bbe4456c395d97c2783b2648e539");
                    } else {
                        SGNewUserStickLayout.d(SGNewUserStickLayout.this);
                    }
                }
            });
        }
    }

    private RecyclerView.s c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ffe7ae11674da4c51c04653998e4a2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ffe7ae11674da4c51c04653998e4a2d");
        }
        if (this.d.getChildCount() > 0) {
            View childAt = this.d.getChildAt(0);
            if (((Integer) childAt.getTag(-101)).intValue() == i) {
                return (RecyclerView.s) childAt.getTag(-102);
            }
            c();
            return null;
        }
        return null;
    }

    private RecyclerView.s d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab0857272b2e3a940b9d3eba2faf0de2", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab0857272b2e3a940b9d3eba2faf0de2");
        }
        if (this.e.getChildCount() > 0) {
            View childAt = this.e.getChildAt(0);
            if (((Integer) childAt.getTag(-101)).intValue() == i) {
                return (RecyclerView.s) childAt.getTag(-102);
            }
            d();
            return null;
        }
        return null;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5106f8d9d9fb3f484da9e151cc2f791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5106f8d9d9fb3f484da9e151cc2f791");
            return;
        }
        this.i = -1;
        if (this.d.getChildCount() > 0) {
            View childAt = this.d.getChildAt(0);
            this.f.put(((Integer) childAt.getTag(-101)).intValue(), (RecyclerView.s) childAt.getTag(-102));
            this.d.removeAllViews();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e375c34cb60f22acf55ac40dc4cd7da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e375c34cb60f22acf55ac40dc4cd7da");
            return;
        }
        this.j = -1;
        if (this.e.getChildCount() > 0) {
            View childAt = this.e.getChildAt(0);
            this.f.put(((Integer) childAt.getTag(-101)).intValue(), (RecyclerView.s) childAt.getTag(-102));
            if (childAt.getTag(-102) != null) {
                b(((Integer) childAt.getTag(-101)).intValue());
            }
            this.e.removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.s a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20b82485b549b2e0afb92ba26e05a524", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20b82485b549b2e0afb92ba26e05a524") : this.f.get(i);
    }

    private float a(SGNewUserLandAdapter sGNewUserLandAdapter, int i, int i2) {
        int i3;
        Object[] objArr = {sGNewUserLandAdapter, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "267d7242f2a74f31b631838bebd31ba1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "267d7242f2a74f31b631838bebd31ba1")).floatValue();
        }
        int d = sGNewUserLandAdapter.d(i2);
        if (d != -1 && this.b.getChildCount() > (i3 = d - i) && i3 > 0) {
            float y = this.b.getChildAt(i3).getY() - this.d.getHeight();
            if (y < 0.0f) {
                return y;
            }
        }
        return 0.0f;
    }

    private float b(SGNewUserLandAdapter sGNewUserLandAdapter, int i, int i2) {
        int i3;
        Object[] objArr = {sGNewUserLandAdapter, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6091cc316498b9c670f89210b99745d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6091cc316498b9c670f89210b99745d2")).floatValue();
        }
        int d = sGNewUserLandAdapter.d(i2);
        if (d != -1 && this.b.getChildCount() > (i3 = d - i) && i3 > 0) {
            float y = (this.b.getChildAt(i3).getY() - this.e.getHeight()) - (this.d != null ? this.d.getHeight() : 0);
            if (y < 0.0f) {
                return y;
            }
        }
        return 0.0f;
    }

    private int getFirstVisibleItem() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d0f11115abb830a8f4391bba175ffcf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d0f11115abb830a8f4391bba175ffcf")).intValue();
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd48aae51591417770038b5807d79547", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd48aae51591417770038b5807d79547")).intValue();
                } else if (iArr.length <= 0) {
                    return 0;
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

    public void setSticky(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ea858a8ab8cfe194f59c230dbbb461f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ea858a8ab8cfe194f59c230dbbb461f");
        } else if (this.k != z) {
            this.k = z;
            if (this.d != null) {
                if (this.k) {
                    u.a(this.d);
                    u.a(this.e);
                    a(false);
                    return;
                }
                c();
                d();
                u.c(this.d);
                u.c(this.e);
            }
        }
    }
}
