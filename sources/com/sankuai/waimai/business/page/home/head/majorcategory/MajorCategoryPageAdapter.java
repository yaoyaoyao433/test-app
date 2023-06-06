package com.sankuai.waimai.business.page.home.head.majorcategory;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.common.view.nested.NestedGridLayoutManager;
import com.sankuai.waimai.business.page.home.model.NavigateItem;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.g;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MajorCategoryPageAdapter extends PagerAdapter {
    public static ChangeQuickRedirect a;
    b b;
    boolean c;
    MajorCategoryViewModel d;
    private final Context e;
    private final PageFragment f;
    private int g;
    private SparseArray<RecyclerView> h;

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public MajorCategoryPageAdapter(b bVar, PageFragment pageFragment, boolean z) {
        Object[] objArr = {bVar, pageFragment, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9fd95d5fce7f203a15db39564c93fef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9fd95d5fce7f203a15db39564c93fef");
            return;
        }
        this.h = new SparseArray<>();
        this.b = bVar;
        this.f = pageFragment;
        this.e = this.f.getContext();
        this.c = z;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c4d6e8cd506450782b9320bdf0ec511", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c4d6e8cd506450782b9320bdf0ec511");
        } else {
            this.g = ((g.a(this.e) - (g.a(this.e, 12.0f) * 2)) - (g.a(this.e, 5.0f) * 2)) / 5;
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4b13a8e9a2123a7ce16a6969ba50087", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4b13a8e9a2123a7ce16a6969ba50087")).intValue();
        }
        if (this.b == null || this.b.g == null) {
            return 0;
        }
        return this.b.g.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(@NonNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b334498650c614a732fd15a3c229dd26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b334498650c614a732fd15a3c229dd26")).intValue();
        }
        int indexOfValue = this.h != null ? this.h.indexOfValue((RecyclerView) obj) : -1;
        if (indexOfValue == -1 || indexOfValue >= getCount()) {
            return -2;
        }
        return indexOfValue;
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3a2d9e74b92e54336765dd2af2a8d00", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3a2d9e74b92e54336765dd2af2a8d00");
        }
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_page_home_head_kingkong_page_item, viewGroup, false).findViewById(R.id.gridview_major_category);
        Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44768fb90e5ceaf13f2b24419a239200", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44768fb90e5ceaf13f2b24419a239200");
        } else if (recyclerView != null && this.b.g != null && i < this.b.g.size()) {
            a aVar = new a(this.b.j, this.b.g.get(i), this.e, ColorUtils.a(this.b.d, this.e.getResources().getColor(R.color.wm_page_major_category_black)), this.f, this.b.i, this.b.e, this.g, this.c);
            aVar.h = i;
            aVar.i = this.b.c();
            aVar.j = this.b.h;
            recyclerView.setLayoutManager(new NestedGridLayoutManager(this.e, 5, 1, false));
            recyclerView.setItemAnimator(null);
            recyclerView.setAdapter(aVar);
        }
        viewGroup.addView(recyclerView);
        this.h.put(i, recyclerView);
        a(recyclerView);
        return recyclerView;
    }

    private void a(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7ec5a6d25dcfb864d7dac5b20f25b0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7ec5a6d25dcfb864d7dac5b20f25b0c");
        } else if (this.c) {
            recyclerView.setPadding(g.a(this.e, 10.0f), 0, g.a(this.e, 10.0f), 0);
        } else {
            recyclerView.setPadding(0, 0, 0, 0);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void notifyDataSetChanged() {
        int i;
        MajorCategoryPageAdapter majorCategoryPageAdapter = this;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f70781d187936ad39b4eb2c605a094d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, majorCategoryPageAdapter, changeQuickRedirect, false, "6f70781d187936ad39b4eb2c605a094d");
            return;
        }
        int size = majorCategoryPageAdapter.h.size();
        int i2 = 0;
        while (i2 < size) {
            RecyclerView recyclerView = majorCategoryPageAdapter.h.get(i2);
            if (recyclerView != null && majorCategoryPageAdapter.b != null && majorCategoryPageAdapter.b.g.size() > 0) {
                majorCategoryPageAdapter.a(recyclerView);
                RecyclerView.a adapter = recyclerView.getAdapter();
                if (adapter instanceof a) {
                    int a2 = ColorUtils.a(majorCategoryPageAdapter.b.d, majorCategoryPageAdapter.e.getResources().getColor(R.color.wm_page_major_category_black));
                    if (i2 < majorCategoryPageAdapter.b.g.size()) {
                        List<NavigateItem> list = majorCategoryPageAdapter.b.g.get(i2);
                        a aVar = (a) adapter;
                        boolean z = majorCategoryPageAdapter.b.j;
                        int i3 = majorCategoryPageAdapter.b.i;
                        String str = majorCategoryPageAdapter.b.e;
                        boolean z2 = majorCategoryPageAdapter.c;
                        Object[] objArr2 = new Object[6];
                        objArr2[c] = Byte.valueOf(z ? (byte) 1 : (byte) 0);
                        objArr2[1] = list;
                        objArr2[2] = Integer.valueOf(a2);
                        objArr2[3] = Integer.valueOf(i3);
                        objArr2[4] = str;
                        objArr2[5] = Byte.valueOf(z2 ? (byte) 1 : (byte) 0);
                        ChangeQuickRedirect changeQuickRedirect2 = a.a;
                        i = size;
                        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d3b8c2840001ea079a7e2eb15ed70846", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d3b8c2840001ea079a7e2eb15ed70846");
                        } else {
                            int size2 = com.sankuai.waimai.foundation.utils.d.a(aVar.b) ? 0 : aVar.b.size();
                            int size3 = com.sankuai.waimai.foundation.utils.d.a(list) ? 0 : list.size();
                            aVar.b = list;
                            aVar.e = a2;
                            aVar.f = str;
                            aVar.k = i3;
                            aVar.g = z2;
                            aVar.l = z;
                            if (size2 != size3) {
                                if (size2 != 0) {
                                    aVar.notifyItemRangeRemoved(0, size2);
                                }
                                if (size3 != 0) {
                                    aVar.notifyItemRangeInserted(0, size3);
                                }
                            } else if (!com.sankuai.waimai.foundation.utils.d.a(aVar.b)) {
                                aVar.notifyItemRangeChanged(0, aVar.b.size());
                            }
                            i2++;
                            size = i;
                            majorCategoryPageAdapter = this;
                            c = 0;
                        }
                        i2++;
                        size = i;
                        majorCategoryPageAdapter = this;
                        c = 0;
                    }
                }
            }
            i = size;
            i2++;
            size = i;
            majorCategoryPageAdapter = this;
            c = 0;
        }
        super.notifyDataSetChanged();
    }

    public final void a(int i) {
        List<NavigateItem> list;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690ade7c31cf0327906c1d901cca55dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690ade7c31cf0327906c1d901cca55dd");
        } else if (this.b.g != null && i < this.b.g.size() && !this.b.j && (list = this.b.g.get(i)) != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                NavigateItem navigateItem = list.get(i2);
                if (navigateItem != null) {
                    this.d.a(i2 + (this.b.i * i), navigateItem, this.b.e, AppUtil.generatePageInfoKey(this.f), this.b.c());
                }
            }
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c4c453d3916a872e819532959dc3485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c4c453d3916a872e819532959dc3485");
            return;
        }
        viewGroup.removeView((View) obj);
        this.h.remove(i);
    }
}
