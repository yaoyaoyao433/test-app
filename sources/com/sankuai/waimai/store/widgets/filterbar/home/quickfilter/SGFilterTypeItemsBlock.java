package com.sankuai.waimai.store.widgets.filterbar.home.quickfilter;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.widgets.SCMaxHeightRecyclerView;
import com.sankuai.waimai.store.widgets.filterbar.home.filter.e;
import com.sankuai.waimai.store.widgets.filterbar.home.model.BubbleInfoBean;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.recycler.ExtendedGridLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGFilterTypeItemsBlock extends com.sankuai.waimai.store.base.b implements c {
    public static ChangeQuickRedirect a;
    @NonNull
    public com.sankuai.waimai.store.widgets.filterbar.home.model.a b;
    public com.sankuai.waimai.store.widgets.filterbar.home.quickfilter.a c;
    public ExtendedGridLayoutManager d;
    public int e;
    public b f;
    public int g;
    public boolean h;
    private final List<String> i;
    private e j;
    private boolean k;
    private String l;
    private Map<String, Integer> m;
    private com.sankuai.waimai.store.param.a n;
    private boolean o;

    public SGFilterTypeItemsBlock(@NonNull Context context, com.sankuai.waimai.store.param.a aVar) {
        this(context, 4);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4d6a13e820ee52f2c1d07699a81693b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4d6a13e820ee52f2c1d07699a81693b");
        } else {
            this.n = aVar;
        }
    }

    private SGFilterTypeItemsBlock(@NonNull Context context, int i) {
        this(context, 4, com.sankuai.waimai.store.widgets.filterbar.home.model.a.a(context, false, (PoiChannelBackgroundConfig) null));
        Object[] objArr = {context, 4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ee4f75bbf20906c4daad762a3aae76a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ee4f75bbf20906c4daad762a3aae76a");
        }
    }

    private SGFilterTypeItemsBlock(@NonNull Context context, int i, @NonNull com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e1096d636c4544c06110b7605e8d32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e1096d636c4544c06110b7605e8d32");
            return;
        }
        this.i = new ArrayList();
        this.j = null;
        this.h = false;
        this.o = false;
        this.e = i;
        this.b = aVar;
    }

    public SGFilterTypeItemsBlock(@NonNull Context context, int i, @NonNull e eVar) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i), eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7eb85246049c1649fbaa1d10bd3fc14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7eb85246049c1649fbaa1d10bd3fc14");
            return;
        }
        this.i = new ArrayList();
        this.j = null;
        this.h = false;
        this.o = false;
        this.o = true;
        this.e = i;
        this.j = eVar;
        this.b = eVar.d();
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93232f40dbe539dcdf77158fa23c41ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93232f40dbe539dcdf77158fa23c41ff");
        }
        SCMaxHeightRecyclerView sCMaxHeightRecyclerView = new SCMaxHeightRecyclerView(viewGroup.getContext());
        sCMaxHeightRecyclerView.setNestedScrollingEnabled(false);
        sCMaxHeightRecyclerView.setFocusable(false);
        sCMaxHeightRecyclerView.setFocusableInTouchMode(false);
        this.d = new ExtendedGridLayoutManager(viewGroup.getContext(), this.e);
        sCMaxHeightRecyclerView.setLayoutManager(this.d);
        sCMaxHeightRecyclerView.addItemDecoration(new a());
        this.c = new com.sankuai.waimai.store.widgets.filterbar.home.quickfilter.a(this, this.o);
        sCMaxHeightRecyclerView.setAdapter(this.c);
        sCMaxHeightRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return sCMaxHeightRecyclerView;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf2f718a1804f3ad5e534513be54c08b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf2f718a1804f3ad5e534513be54c08b");
            return;
        }
        super.onViewCreated();
        com.meituan.android.bus.a.a().a(this);
    }

    @Subscribe
    public void onCategoryBackgroundChanged(com.sankuai.waimai.store.widgets.filterbar.event.a aVar) {
        boolean z = true;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4909e53e0aa6124dd2a6a67631b22520", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4909e53e0aa6124dd2a6a67631b22520");
        } else if (aVar == null || aVar.c != System.identityHashCode(this.mView.getContext())) {
        } else {
            if (!aVar.a && (!this.n.f() || !aVar.b)) {
                z = false;
            }
            a(z);
            if (this.c != null) {
                this.c.notifyDataSetChanged();
            }
        }
    }

    @Subscribe
    public void onSGFilterDropDownGridViewHolderDestroy(com.sankuai.waimai.store.widgets.filterbar.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9080e4f61a261dc38c23ad6b0fece1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9080e4f61a261dc38c23ad6b0fece1c");
        } else if (this.o) {
            onDestroy();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.quickfilter.c
    public final Map<String, Integer> a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bef6ce2841191e43f72bd68a2c71f38f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bef6ce2841191e43f72bd68a2c71f38f");
        }
        if (this.n != null && this.m == null) {
            if (this.n.W || (this.n.f() && this.n.X)) {
                z = true;
            }
            a(z);
        }
        return this.m;
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c5c1e9ae8d38d59f0ac654d483b438e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c5c1e9ae8d38d59f0ac654d483b438e");
            return;
        }
        if (this.m == null) {
            this.m = new HashMap(2);
        }
        if (z) {
            this.m.put("KEY_QUICK_FILTER_TEXT_COLOR", -11052967);
            this.m.put("KEY_QUICK_FILTER_BG_COLOR", -657930);
            return;
        }
        this.m.put("KEY_QUICK_FILTER_TEXT_COLOR", -14539738);
        this.m.put("KEY_QUICK_FILTER_BG_COLOR", -1);
    }

    public final void a(boolean z, String str, List<String> list, List<FilterConditionResponse.FilterGroup.FilterItem> list2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c841bc42e57bbdf50f67bb9a79dd35b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c841bc42e57bbdf50f67bb9a79dd35b");
            return;
        }
        this.k = z;
        this.l = str;
        this.i.clear();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            this.i.addAll(list);
        }
        this.c.b_(list2);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.quickfilter.c
    public final boolean b() {
        return this.h;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.quickfilter.c
    @NonNull
    public final List<String> c() {
        return this.i;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.quickfilter.c
    public final void a(boolean z, String str, BubbleInfoBean bubbleInfoBean) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, bubbleInfoBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8bedb79057c19585608eab57e358666", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8bedb79057c19585608eab57e358666");
        } else if (this.f != null) {
            this.f.a(this.k, this.l, z, str, bubbleInfoBean);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.quickfilter.c
    @NonNull
    public final com.sankuai.waimai.store.widgets.filterbar.home.model.a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ef8ff3acee29c4471dc0720706da09", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.widgets.filterbar.home.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ef8ff3acee29c4471dc0720706da09") : this.j != null ? this.j.d() : this.b;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03ae82d038f2d1879d34c21bf48759a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03ae82d038f2d1879d34c21bf48759a6");
            return;
        }
        super.onDestroy();
        com.meituan.android.bus.a.a().b(this);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.f {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {SGFilterTypeItemsBlock.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aeb8747659b39d2b28e47c16ca6d789", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aeb8747659b39d2b28e47c16ca6d789");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Object[] objArr = {rect, view, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8113a1041b858129435171c379f6c39d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8113a1041b858129435171c379f6c39d");
                return;
            }
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.left = SGFilterTypeItemsBlock.this.g;
            rect.right = SGFilterTypeItemsBlock.this.g;
        }
    }
}
