package com.sankuai.waimai.store.widgets.filterbar.home.filter;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.QuickSortFilterBottomBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a = null;
    public static boolean h = false;
    public RecyclerView b;
    public a c;
    public QuickSortFilterBottomBean d;
    public com.sankuai.waimai.store.widgets.filterbar.home.model.a e;
    public com.sankuai.waimai.store.base.statistic.a f;
    public b g;
    private int i;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(View view, boolean z, String str, boolean z2, String str2);
    }

    public j(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad62bfb63c2bdc107a57b3c94526e4f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad62bfb63c2bdc107a57b3c94526e4f1");
            return;
        }
        this.d = new QuickSortFilterBottomBean();
        this.i = context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_8);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "441fcf52c25e29d90dadbdc190c880ad", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "441fcf52c25e29d90dadbdc190c880ad") : layoutInflater.inflate(R.layout.wm_sc_horizen_scroll_king_kong_list, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbe07944628a58283dbd3b6c173df1fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbe07944628a58283dbd3b6c173df1fe");
            return;
        }
        super.onViewCreated();
        this.b = (RecyclerView) this.mView.findViewById(R.id.wm_sc_horizen_scroll_king_kong_list);
        this.c = new a();
        this.b.addItemDecoration(new RecyclerView.f() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.filter.j.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Object[] objArr2 = {rect, view, recyclerView, state};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b7ed5293017fe52122afebae7ce09bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b7ed5293017fe52122afebae7ce09bb");
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView, state);
                rect.right = j.this.i;
            }
        });
        this.b.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.c.setHasStableIds(true);
        this.b.setAdapter(this.c);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.a<c> {
        public static ChangeQuickRedirect a;

        @Override // android.support.v7.widget.RecyclerView.a
        public final long getItemId(int i) {
            return i;
        }

        public a() {
            Object[] objArr = {j.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b90695548ffeeb763b3e966be6c99194", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b90695548ffeeb763b3e966be6c99194");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(@NonNull c cVar, final int i) {
            Drawable drawable;
            final c cVar2 = cVar;
            final boolean z = true;
            Object[] objArr = {cVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68f9bde7db900ff5ab72c7bd8f5017a6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68f9bde7db900ff5ab72c7bd8f5017a6");
                return;
            }
            final FilterConditionResponse.FilterGroup.FilterItem filterItem = (FilterConditionResponse.FilterGroup.FilterItem) com.sankuai.shangou.stone.util.a.a((List<Object>) j.this.d.filterList, i);
            Object[] objArr2 = {filterItem, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar2, changeQuickRedirect2, false, "28b3c31edbcbe46c5cd96767cb084b24", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect2, false, "28b3c31edbcbe46c5cd96767cb084b24");
            } else if (filterItem != null) {
                if (i == 0) {
                    ((ViewGroup.MarginLayoutParams) cVar2.itemView.getLayoutParams()).leftMargin = com.sankuai.shangou.stone.util.h.a(j.this.mContext, 12.0f);
                    if (cVar2.a().size() == 0 || !j.h) {
                        cVar2.a().add("-99");
                    }
                }
                b.C0608b a2 = m.a(filterItem.backgroundUrl, ImageQualityUtil.a());
                a2.i = R.drawable.wm_sc_common_poi_error;
                a2.a(cVar2.b);
                cVar2.c.setText(filterItem.name);
                if (cVar2.a().contains(filterItem.code)) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "3362f13632eaaf452d2af18c67408371", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "3362f13632eaaf452d2af18c67408371");
                    } else {
                        if (j.this.e != null) {
                            cVar2.c.setTextColor(j.this.e.c);
                            int dimensionPixelSize = j.this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_half);
                            int i2 = j.this.e.c;
                            LinearLayout linearLayout = cVar2.d;
                            com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar = j.this.e;
                            int i3 = cVar2.e;
                            Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(dimensionPixelSize), Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.widgets.filterbar.home.model.a.a;
                            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "780f80607af345c02e7270f4b1aa88b1", RobustBitConfig.DEFAULT_VALUE)) {
                                drawable = (Drawable) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "780f80607af345c02e7270f4b1aa88b1");
                            } else if (aVar.h == 0) {
                                drawable = null;
                            } else {
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setColor(aVar.h);
                                gradientDrawable.setCornerRadius(i3);
                                if (dimensionPixelSize != 0 && i2 != 0) {
                                    gradientDrawable.setStroke(dimensionPixelSize, i2);
                                }
                                drawable = gradientDrawable;
                            }
                            linearLayout.setBackground(drawable);
                        }
                        cVar2.c.getPaint().setFakeBoldText(true);
                    }
                } else {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = c.a;
                    if (PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "fb624a7b54d9a688303872bf41762f44", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "fb624a7b54d9a688303872bf41762f44");
                    } else {
                        if (j.this.e != null) {
                            cVar2.c.setTextColor(j.this.e.b);
                            cVar2.d.setBackground(j.this.e.a(cVar2.e));
                        }
                        cVar2.c.getPaint().setFakeBoldText(false);
                    }
                    z = false;
                }
                cVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.home.filter.j.c.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr6 = {view};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "67645e2d559d0f897112a8786843c10d", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "67645e2d559d0f897112a8786843c10d");
                            return;
                        }
                        if (j.this.g != null && !z) {
                            j.h = true;
                            j.this.g.a(j.this.getView(), false, j.this.d.group, !z, filterItem.code);
                        }
                        if (j.this.f != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("code", filterItem.code);
                            hashMap.put("index", Integer.valueOf(i));
                            j.this.f.a(hashMap);
                        }
                    }
                });
                if (j.this.f != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", filterItem.code);
                    hashMap.put("index", Integer.valueOf(i));
                    j.this.f.a(cVar2.f, i, hashMap);
                }
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        @NonNull
        public final /* synthetic */ c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e46f2e665730b4877a14d7ed33f1c68a", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e46f2e665730b4877a14d7ed33f1c68a") : new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_horizen_scroll_king_kong_list_item, viewGroup, false));
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d69a66890168076abebd75c547bdc552", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d69a66890168076abebd75c547bdc552")).intValue() : com.sankuai.shangou.stone.util.a.a((List) j.this.d.filterList);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class c extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        ImageView b;
        TextView c;
        LinearLayout d;
        int e;
        com.sankuai.waimai.store.expose.v2.entity.b f;
        private int h;

        public c(View view) {
            super(view);
            Object[] objArr = {j.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccae3fd8b3c4448e1e075d1376470a59", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccae3fd8b3c4448e1e075d1376470a59");
                return;
            }
            this.b = (ImageView) view.findViewById(R.id.wm_sc_horizen_scroll_king_kong_list_item_icon);
            this.c = (TextView) view.findViewById(R.id.wm_sc_horizen_scroll_king_kong_list_item_title);
            this.d = (LinearLayout) view.findViewById(R.id.ll_text_container);
            this.e = j.this.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_10);
            this.h = j.this.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_29);
            if (j.this.f == null || !(j.this.getContext() instanceof com.sankuai.waimai.store.expose.v2.a)) {
                return;
            }
            this.f = j.this.f.a(view);
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) j.this.getContext(), this.f);
        }

        @NonNull
        List<String> a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e03e114faf07ff61853e50071e14f31", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e03e114faf07ff61853e50071e14f31") : j.this.d.selectCodeList == null ? new ArrayList() : j.this.d.selectCodeList;
        }
    }
}
