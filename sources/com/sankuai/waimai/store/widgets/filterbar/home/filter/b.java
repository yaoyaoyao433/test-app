package com.sankuai.waimai.store.widgets.filterbar.home.filter;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.QuickSortFilterBottomBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public RecyclerView b;
    int c;
    public a d;
    public QuickSortFilterBottomBean e;
    com.sankuai.waimai.store.widgets.filterbar.home.model.a f;
    public com.sankuai.waimai.store.base.statistic.a g;
    public InterfaceC1341b h;
    public boolean i;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.widgets.filterbar.home.filter.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1341b {
        void a(View view, boolean z, String str, boolean z2, String str2, boolean z3);
    }

    public b(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a83f54b3bc04bd961109acf210d3de1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a83f54b3bc04bd961109acf210d3de1");
            return;
        }
        this.e = new QuickSortFilterBottomBean();
        this.c = context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_8);
        this.i = false;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4110f88e74951da3133167914b983c8e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4110f88e74951da3133167914b983c8e") : layoutInflater.inflate(R.layout.wm_sc_horizen_scroll_king_kong_list, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c925bf2eb85ba5d97a12ad5db91530b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c925bf2eb85ba5d97a12ad5db91530b9");
            return;
        }
        super.onViewCreated();
        this.b = (RecyclerView) this.mView.findViewById(R.id.wm_sc_horizen_scroll_king_kong_list);
        this.d = new a();
        this.b.addItemDecoration(new RecyclerView.f() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.filter.b.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Object[] objArr2 = {rect, view, recyclerView, state};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c54a40ed01eb5b04228725bbb3b72eb0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c54a40ed01eb5b04228725bbb3b72eb0");
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView, state);
                rect.right = b.this.c;
            }
        });
        this.b.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.b.setAdapter(this.d);
    }

    public final void a(com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0d3bfe399e72e6ec7b50c941d399b65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0d3bfe399e72e6ec7b50c941d399b65");
            return;
        }
        this.f = aVar;
        if (this.d != null) {
            this.d.notifyDataSetChanged();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.a<c> {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cbb3ee056755e38a982cafb8ee75c6b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cbb3ee056755e38a982cafb8ee75c6b");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(@NonNull c cVar, final int i) {
            final c cVar2 = cVar;
            final boolean z = false;
            Object[] objArr = {cVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc3a6bd6684f781114b47b680b1b656", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc3a6bd6684f781114b47b680b1b656");
                return;
            }
            final FilterConditionResponse.FilterGroup.FilterItem filterItem = (FilterConditionResponse.FilterGroup.FilterItem) com.sankuai.shangou.stone.util.a.a((List<Object>) b.this.e.filterList, i);
            Object[] objArr2 = {filterItem, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar2, changeQuickRedirect2, false, "361432cb2b8f95cd061e3b63a0cbad28", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect2, false, "361432cb2b8f95cd061e3b63a0cbad28");
            } else if (filterItem != null) {
                cVar2.b.setText(filterItem.name);
                if (cVar2.a().contains(filterItem.code)) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "a0382c730f7e20633001fa923879130b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "a0382c730f7e20633001fa923879130b");
                    } else {
                        if (b.this.f != null) {
                            cVar2.b.setTextColor(b.this.f.c);
                            cVar2.c.setBackground(b.this.f.d());
                        }
                        cVar2.b.getPaint().setFakeBoldText(true);
                    }
                    z = true;
                } else {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "69a4cb45777016f4311f4a15b245d402", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "69a4cb45777016f4311f4a15b245d402");
                    } else {
                        if (b.this.f != null) {
                            cVar2.b.setTextColor(b.this.f.b);
                            if (b.this.i) {
                                cVar2.c.setBackground(b.this.f.b());
                            } else {
                                cVar2.c.setBackground(b.this.f.a(cVar2.d));
                            }
                        }
                        cVar2.b.getPaint().setFakeBoldText(false);
                    }
                }
                cVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.filter.b.c.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a0d8e7dfff4745a12d22992f1457af94", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a0d8e7dfff4745a12d22992f1457af94");
                        } else if (c.this.a().contains(filterItem.code)) {
                        } else {
                            if (b.this.h != null) {
                                b.this.h.a(b.this.getView(), b.this.e.canMultiSelect, b.this.e.group, !z, filterItem.code, true);
                            }
                            if (b.this.g != null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("code", filterItem.code);
                                hashMap.put("index", Integer.valueOf(i));
                                b.this.g.a(hashMap);
                            }
                        }
                    }
                });
                if (b.this.g != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", filterItem.code);
                    hashMap.put("index", Integer.valueOf(i));
                    b.this.g.a(cVar2.e, i, hashMap);
                }
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        @NonNull
        public final /* synthetic */ c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6acb74ff628b4651684b320d884a5bf", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6acb74ff628b4651684b320d884a5bf") : new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_horizen_scroll_drug_king_kong_list_item, viewGroup, false));
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dbe8e6f9cba7a2ed4d0f6247aaed8c0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dbe8e6f9cba7a2ed4d0f6247aaed8c0")).intValue() : com.sankuai.shangou.stone.util.a.a((List) b.this.e.filterList);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class c extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        TextView b;
        LinearLayout c;
        int d;
        com.sankuai.waimai.store.expose.v2.entity.b e;

        public c(View view) {
            super(view);
            Object[] objArr = {b.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f0e0000240f021d1df73454a4f15d47", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f0e0000240f021d1df73454a4f15d47");
                return;
            }
            this.b = (TextView) view.findViewById(R.id.wm_sc_horizen_scroll_king_kong_list_item_title);
            this.c = (LinearLayout) view.findViewById(R.id.ll_text_container);
            this.d = b.this.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_6);
            if (b.this.g == null || !(b.this.getContext() instanceof com.sankuai.waimai.store.expose.v2.a)) {
                return;
            }
            this.e = b.this.g.a(view);
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) b.this.getContext(), this.e);
        }

        @NonNull
        List<String> a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69288b25119136046bf0becfd88ba776", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69288b25119136046bf0becfd88ba776") : b.this.e.selectCodeList == null ? new ArrayList() : b.this.e.selectCodeList;
        }
    }
}
