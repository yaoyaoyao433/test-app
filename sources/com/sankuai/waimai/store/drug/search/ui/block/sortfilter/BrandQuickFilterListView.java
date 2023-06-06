package com.sankuai.waimai.store.drug.search.ui.block.sortfilter;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.search.model.BrandFilterItem;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BrandQuickFilterListView extends RecyclerView {
    public static ChangeQuickRedirect a;
    public b b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(BrandFilterItem brandFilterItem, boolean z);
    }

    public BrandQuickFilterListView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd44330481058948cfe26b5864da632d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd44330481058948cfe26b5864da632d");
        } else {
            a(context);
        }
    }

    public BrandQuickFilterListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f9da9e9e8992c1ab044e74b97655b5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f9da9e9e8992c1ab044e74b97655b5d");
        } else {
            a(context);
        }
    }

    public BrandQuickFilterListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a89939b311babbf6dfc874db41cb35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a89939b311babbf6dfc874db41cb35");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97b17fe37d423234dbbe01a8ae9ba45a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97b17fe37d423234dbbe01a8ae9ba45a");
            return;
        }
        this.b = new b();
        setAdapter(this.b);
        setLayoutManager(new LinearLayoutManager(context, 0, false));
    }

    public void setCommonLxReportData(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50c3b95fac97e3ffc357876e0df106f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50c3b95fac97e3ffc357876e0df106f3");
        } else {
            this.b.c = map;
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ce8e9afe284799009eba5391d2bf88e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ce8e9afe284799009eba5391d2bf88e");
            return;
        }
        Pair<Integer, Boolean> a2 = this.b.a();
        this.b.a(z);
        if (((Integer) a2.first).intValue() <= 0 || ((Boolean) a2.second).booleanValue() == z) {
            return;
        }
        scrollToPosition(((Integer) a2.first).intValue());
    }

    public void setFilterItemClickListener(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f8127fdeb4daeb0e6bb3ad6c6e2c671", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f8127fdeb4daeb0e6bb3ad6c6e2c671");
        } else {
            this.b.b = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class c extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        ImageView b;
        TextView c;

        public c(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fc8380fa47f236948d807c2884b45cb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fc8380fa47f236948d807c2884b45cb");
                return;
            }
            LinearLayout linearLayout = (LinearLayout) view;
            linearLayout.removeAllViews();
            Context context = view.getContext();
            this.b = new ImageView(context);
            int a2 = h.a(context, 52.0f);
            int a3 = h.a(context, 4.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, a2);
            layoutParams.topMargin = a3;
            layoutParams.leftMargin = a3;
            layoutParams.rightMargin = a3;
            this.b.setLayoutParams(layoutParams);
            linearLayout.addView(this.b, layoutParams);
            this.c = new TextView(context);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = a3;
            this.c.setLayoutParams(layoutParams2);
            this.c.setGravity(17);
            linearLayout.addView(this.c, layoutParams2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class b extends RecyclerView.a<c> {
        public static ChangeQuickRedirect a;
        a b;
        Map<String, Object> c;
        public List<BrandFilterItem> d;
        public int e;
        private boolean f;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b8a39384be09c544e19096e8640a8f3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b8a39384be09c544e19096e8640a8f3");
                return;
            }
            this.f = false;
            this.e = -1;
        }

        /* JADX WARN: Type inference failed for: r15v1 */
        /* JADX WARN: Type inference failed for: r15v2, types: [boolean, byte] */
        /* JADX WARN: Type inference failed for: r15v4 */
        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(c cVar, int i) {
            c cVar2 = cVar;
            Object[] objArr = {cVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cfaac845131bf83c3a13ce8943b32ca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cfaac845131bf83c3a13ce8943b32ca");
                return;
            }
            BrandFilterItem brandFilterItem = (BrandFilterItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.d, i);
            boolean z = this.f;
            ?? r15 = this.e == i ? 1 : 0;
            byte b = com.sankuai.shangou.stone.util.a.a((List) this.d) - 1 == i ? (byte) 1 : (byte) 0;
            Object[] objArr2 = {brandFilterItem, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf((byte) r15), Byte.valueOf(b)};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar2, changeQuickRedirect2, false, "4eaf1803234c1e09c0a42b9007e1744a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect2, false, "4eaf1803234c1e09c0a42b9007e1744a");
            } else if (brandFilterItem != null) {
                if (z) {
                    Object[] objArr3 = {Integer.valueOf(i), Byte.valueOf((byte) r15), Byte.valueOf(b)};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "c00b077fa7d0391cb1b373e09d40f288", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "c00b077fa7d0391cb1b373e09d40f288");
                    } else {
                        Context context = cVar2.itemView.getContext();
                        u.c(cVar2.b);
                        e.a aVar = new e.a();
                        aVar.a(h.a(context, 14.0f));
                        if (r15 != 0) {
                            aVar.a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-7859, -15539});
                        } else {
                            aVar.c(-1);
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cVar2.itemView.getLayoutParams();
                        cVar2.itemView.setMinimumWidth(h.a(context, 72.0f));
                        marginLayoutParams.height = h.a(context, 28.0f);
                        marginLayoutParams.leftMargin = h.a(context, i == 0 ? 12.0f : 8.0f);
                        marginLayoutParams.rightMargin = h.a(context, b != 0 ? 12.0f : 0.0f);
                        cVar2.itemView.setLayoutParams(marginLayoutParams);
                        cVar2.itemView.setBackground(aVar.a());
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) cVar2.c.getLayoutParams();
                        int a2 = h.a(context, 8.0f);
                        layoutParams.height = -1;
                        layoutParams.topMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.leftMargin = a2;
                        layoutParams.rightMargin = a2;
                        cVar2.c.setTextColor(r15 != 0 ? -14539738 : -11052967);
                        cVar2.c.setTextSize(2, 12.0f);
                        cVar2.c.getPaint().setFakeBoldText(r15);
                        cVar2.c.setLayoutParams(layoutParams);
                    }
                } else {
                    Object[] objArr4 = {brandFilterItem, Integer.valueOf(i), Byte.valueOf((byte) r15), Byte.valueOf(b)};
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "ef22a02e7856b58a17ee9c980756c9c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "ef22a02e7856b58a17ee9c980756c9c6");
                    } else {
                        Context context2 = cVar2.itemView.getContext();
                        e.a aVar2 = new e.a();
                        aVar2.a(r15 != 0 ? -32768 : -1).b(h.a(context2, 1.0f)).a(h.a(context2, 8.0f)).c(-1);
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) cVar2.itemView.getLayoutParams();
                        cVar2.itemView.setMinimumWidth(h.a(context2, 60.0f));
                        marginLayoutParams2.height = h.a(context2, 81.0f);
                        marginLayoutParams2.leftMargin = h.a(context2, i == 0 ? 12.0f : 8.0f);
                        marginLayoutParams2.rightMargin = h.a(context2, b != 0 ? 12.0f : 0.0f);
                        cVar2.itemView.setLayoutParams(marginLayoutParams2);
                        cVar2.itemView.setBackground(aVar2.a());
                        u.a(cVar2.b);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) cVar2.c.getLayoutParams();
                        int a3 = h.a(context2, 4.0f);
                        layoutParams2.height = -2;
                        layoutParams2.topMargin = a3;
                        layoutParams2.bottomMargin = 0;
                        layoutParams2.leftMargin = a3;
                        layoutParams2.rightMargin = a3;
                        cVar2.c.setTextColor(-14539738);
                        cVar2.c.setTextSize(2, 12.0f);
                        cVar2.c.getPaint().setFakeBoldText(r15);
                        cVar2.c.setLayoutParams(layoutParams2);
                        m.a(brandFilterItem.icon, cVar2.b, h.a(context2, 52.0f));
                    }
                }
                cVar2.c.setText(brandFilterItem.showText);
            }
            cVar2.itemView.setOnClickListener(d.a(this, brandFilterItem, cVar2, i));
            if (cVar2.itemView.getContext() instanceof SCBaseActivity) {
                SCBaseActivity sCBaseActivity = (SCBaseActivity) cVar2.itemView.getContext();
                com.sankuai.waimai.store.expose.v2.entity.a aVar3 = new com.sankuai.waimai.store.expose.v2.entity.a(cVar2.itemView, String.valueOf(System.identityHashCode(brandFilterItem)));
                Object[] objArr5 = {this, sCBaseActivity, brandFilterItem, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect5 = e.a;
                aVar3.a(PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "235953a957f7f2e0796f6063f77d1561", RobustBitConfig.DEFAULT_VALUE) ? (c.a) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "235953a957f7f2e0796f6063f77d1561") : new e(this, sCBaseActivity, brandFilterItem, i));
                com.sankuai.waimai.store.expose.v2.b.a().a(sCBaseActivity, aVar3);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ c onCreateViewHolder(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "914dffe196ab587acbbf4d4cfb907f4c", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "914dffe196ab587acbbf4d4cfb907f4c");
            }
            LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            return new c(linearLayout);
        }

        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c579fdd2a8e968046c6b157b9bcf8105", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c579fdd2a8e968046c6b157b9bcf8105");
            } else if (com.sankuai.shangou.stone.util.a.b(this.d)) {
            } else {
                this.f = z;
                notifyDataSetChanged();
            }
        }

        @NonNull
        public final Pair<Integer, Boolean> a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d9e0bab848e4beb900ef42657bd1338", RobustBitConfig.DEFAULT_VALUE) ? (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d9e0bab848e4beb900ef42657bd1338") : Pair.create(Integer.valueOf(this.e), Boolean.valueOf(this.f));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Map<String, Object> a(BrandFilterItem brandFilterItem, int i) {
            Object[] objArr = {brandFilterItem, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b81a3cecbe84387acb19e79b71eb3e28", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b81a3cecbe84387acb19e79b71eb3e28");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("picture_select_index", Integer.valueOf(i));
            hashMap.put("brand_name", brandFilterItem == null ? "" : brandFilterItem.showText);
            hashMap.put("brand_code", brandFilterItem == null ? "" : brandFilterItem.secondGuidedQuery);
            if (this.c != null && !this.c.isEmpty()) {
                hashMap.putAll(this.c);
            }
            return hashMap;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31c94d4b389e8761a512cf1c9fb3de2a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31c94d4b389e8761a512cf1c9fb3de2a")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.d);
        }
    }
}
