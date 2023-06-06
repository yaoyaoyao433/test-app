package com.sankuai.waimai.platform.widget.filterbar.view.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.CategoryBean;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiFilterCategoryDialogFragment extends DialogFragment implements AdapterView.OnItemClickListener {
    public static ChangeQuickRedirect a;
    private static int k;
    private static int l;
    private static int m;
    public DynamicHeightListView b;
    public DynamicHeightListView c;
    public List<CategoryBean.Category> d;
    public int e;
    public int f;
    public int g;
    public int h;
    public b.InterfaceC1095b i;
    public e j;
    private View n;
    private View o;
    private View p;
    private View q;
    private e r;
    private View.OnClickListener s;
    private int t;
    private View u;

    public PoiFilterCategoryDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ceb3deb3771dbfc37da22d498f78a46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ceb3deb3771dbfc37da22d498f78a46");
            return;
        }
        this.e = 0;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.s = new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterCategoryDialogFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6cb3f563770ed624cdec8e2d34f261bc", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6cb3f563770ed624cdec8e2d34f261bc");
                } else if (PoiFilterCategoryDialogFragment.this.i != null) {
                    PoiFilterCategoryDialogFragment.this.i.a();
                }
            }
        };
        this.t = 0;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "994e4a247f4c4c31fb7cf3c0a6aa0088", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "994e4a247f4c4c31fb7cf3c0a6aa0088");
            return;
        }
        super.onAttach(context);
        if (k == 0) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                k = displayMetrics.heightPixels;
            } catch (Exception unused) {
            }
            m = (int) (k * 0.5f);
            l = (int) (k * 0.4f);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5055087279e7be56478ffab11039db36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5055087279e7be56478ffab11039db36");
            return;
        }
        super.onDetach();
        this.i = null;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d86c7f807255f287415ae8e7280e4659", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d86c7f807255f287415ae8e7280e4659");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92898f177277934db609dc96e5cc69ae", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92898f177277934db609dc96e5cc69ae") : layoutInflater.inflate(R.layout.wm_widget_filter_bar_category_dialog_fragment, (ViewGroup) null);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29c4efce95d7e177cc878189b34d7555", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29c4efce95d7e177cc878189b34d7555");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "385c58d7095ea041ad88dcc62629d1ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "385c58d7095ea041ad88dcc62629d1ec");
        } else {
            view.setOnClickListener(this.s);
            view.findViewById(R.id.block_filter).setOnClickListener(this.s);
            this.o = view.findViewById(R.id.ll_cond_container);
            this.b = (DynamicHeightListView) view.findViewById(R.id.list_category);
            this.b.setMaxHeight(m);
            this.b.setOnItemClickListener(this);
            this.c = (DynamicHeightListView) view.findViewById(R.id.list_sub_category);
            this.c.setMaxHeight(m);
            this.c.setMinHeight(m);
            this.c.setOnItemClickListener(this);
            this.n = view.findViewById(R.id.page_load);
            this.n.getLayoutParams().height = l;
            this.p = view.findViewById(R.id.page_error);
            this.p.getLayoutParams().height = l;
            this.q = view.findViewById(R.id.ll_no_result);
            this.q.getLayoutParams().height = l;
            this.u = view.findViewById(R.id.footer_view);
            c();
        }
        b();
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bce8f1afebdd02cc60c775da98bdc21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bce8f1afebdd02cc60c775da98bdc21");
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        b();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        CategoryBean.Category category;
        CategoryBean.Category category2;
        Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3931ce54143026ed5f9a470f77cdc521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3931ce54143026ed5f9a470f77cdc521");
        } else if (adapterView == this.b) {
            this.e = i;
            if (this.e == this.g) {
                this.f = this.h;
            } else {
                this.f = -1;
            }
            a(i, this.f);
            if (this.d == null || this.d.size() <= i || (category2 = this.d.get(i)) == null) {
                return;
            }
            if (category2.subList == null || category2.subList.isEmpty()) {
                a(category2, (CategoryBean.Category) null);
                return;
            }
            this.r.a(category2.subList);
            this.c.setSelection(0);
            a(this.c, this.f);
        } else if (adapterView == this.c) {
            this.r.a(i);
            if (this.e < 0 || this.e >= this.d.size() || (category = this.d.get(this.e)) == null || category.subList == null || category.subList.size() <= i) {
                return;
            }
            a(category, category.subList.get(i));
        }
    }

    private void a(CategoryBean.Category category, CategoryBean.Category category2) {
        com.sankuai.waimai.platform.widget.filterbar.domain.model.f fVar;
        Object[] objArr = {category, category2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce9426699d1c33db25d17fa7d59bbf0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce9426699d1c33db25d17fa7d59bbf0f");
        } else if (this.i == null) {
        } else {
            if (category == null || category.code == 0) {
                fVar = new com.sankuai.waimai.platform.widget.filterbar.domain.model.f();
            } else if (category.code != 0 && (category2 == null || category2.code == 0)) {
                fVar = new com.sankuai.waimai.platform.widget.filterbar.domain.model.f(category.code, 0, category.name);
            } else if (category.code != 0 && category2.code != 0) {
                fVar = new com.sankuai.waimai.platform.widget.filterbar.domain.model.f(category.code, category2.code, category2.name);
            } else {
                fVar = new com.sankuai.waimai.platform.widget.filterbar.domain.model.f();
            }
            this.i.a(this, fVar);
        }
    }

    public void a(final ListView listView, final int i) {
        Object[] objArr = {listView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "520bb96fbf9fae9f6c8697f010f7f8b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "520bb96fbf9fae9f6c8697f010f7f8b0");
        } else {
            listView.post(new Runnable() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterCategoryDialogFragment.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d6fc3e2c67390e5bff0e664b467d988", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d6fc3e2c67390e5bff0e664b467d988");
                        return;
                    }
                    int lastVisiblePosition = listView.getLastVisiblePosition();
                    if (lastVisiblePosition <= 0 || i <= lastVisiblePosition) {
                        return;
                    }
                    listView.setSelectionFromTop(i, PoiFilterCategoryDialogFragment.m / 2);
                }
            });
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56971e30dfa4a63954facd33e9da0bfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56971e30dfa4a63954facd33e9da0bfd");
            return;
        }
        this.j = new e(getContext(), this.u);
        this.b.setAdapter((ListAdapter) this.j);
        this.j.a(this.d);
        this.r = new e(getContext(), null);
        this.c.setAdapter((ListAdapter) this.r);
        a(this.e, this.f);
    }

    public void a(int i, int i2) {
        CategoryBean.Category category;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8207153294d8bcf4c2d3193458b065b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8207153294d8bcf4c2d3193458b065b3");
            return;
        }
        this.j.a(i);
        this.r.a(i2);
        if (this.d == null || this.d.size() <= i || i < 0 || (category = this.d.get(i)) == null) {
            return;
        }
        this.r.a(category.subList);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "159edfe8fb57ba79982e71ad7d0f6a71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "159edfe8fb57ba79982e71ad7d0f6a71");
            return;
        }
        this.t = i;
        c();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f87271b8ad3da940fb3070dac5847db4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f87271b8ad3da940fb3070dac5847db4");
        } else if (this.o == null) {
        } else {
            this.o.setVisibility(this.t == 1 ? 0 : 8);
            this.n.setVisibility(this.t == 2 ? 0 : 8);
            this.p.setVisibility(this.t == 3 ? 0 : 8);
            this.q.setVisibility(this.t != 4 ? 8 : 0);
        }
    }
}
