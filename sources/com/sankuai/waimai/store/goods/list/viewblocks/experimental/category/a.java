package com.sankuai.waimai.store.goods.list.viewblocks.experimental.category;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.widgets.recycler.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.widgets.recycler.a {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a c;
    public List<RestMenuResponse.NavigateItem> d;
    public int e;
    public boolean f;

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        return 1;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final void a(e eVar, int i) {
    }

    public a(com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.contract.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b66c8f02501d5cdf719f7b45acc5751", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b66c8f02501d5cdf719f7b45acc5751");
            return;
        }
        this.d = new ArrayList();
        this.c = aVar;
        this.b = this.c.i();
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b68fd7982b19bd331ef1d688c8260f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b68fd7982b19bd331ef1d688c8260f")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.d)) {
            return this.d.size();
        }
        return 0;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f065c1777ae18d2e22efb623055e3644", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f065c1777ae18d2e22efb623055e3644") : new C1194a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_tag_type_multi_item, viewGroup, false), this.f);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a, com.sankuai.waimai.store.widgets.recycler.i
    public final void a(Object obj, final int i) {
        Object[] objArr = {obj, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ad144393d3e012cab1410d88b72d032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ad144393d3e012cab1410d88b72d032");
            return;
        }
        final RestMenuResponse.NavigateItem navigateItem = (RestMenuResponse.NavigateItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.d, i);
        if (obj instanceof C1194a) {
            final C1194a c1194a = (C1194a) obj;
            Object[] objArr2 = {navigateItem, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = C1194a.a;
            if (PatchProxy.isSupport(objArr2, c1194a, changeQuickRedirect2, false, "a75d4e0036ebdd35c643131d89f263c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c1194a, changeQuickRedirect2, false, "a75d4e0036ebdd35c643131d89f263c0");
                return;
            }
            c1194a.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.category.a.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "39ca6ac1cd2bf3173376fc1517668150", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "39ca6ac1cd2bf3173376fc1517668150");
                    } else if (navigateItem != null) {
                        C1194a c1194a2 = C1194a.this;
                        RestMenuResponse.NavigateItem navigateItem2 = navigateItem;
                        int i2 = i;
                        Object[] objArr4 = {navigateItem2, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect4 = C1194a.a;
                        if (PatchProxy.isSupport(objArr4, c1194a2, changeQuickRedirect4, false, "754408fa2b4db9fab407ed760e67191a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, c1194a2, changeQuickRedirect4, false, "754408fa2b4db9fab407ed760e67191a");
                        } else {
                            b.a(a.this.c.k(), "b_waimai_6ahx3i39_mc").a(AppUtil.generatePageInfoKey(a.this.c.j())).a("poi_id", a.this.b.d()).a(KernelConfig.KEY_CONTAINER_TYPE, 4).a("index", Integer.valueOf(i2)).a(DataConstants.CATEGORY_ID, Long.valueOf(navigateItem2.tagId)).a("category_name", navigateItem2.name).a();
                        }
                        a.this.c.a(navigateItem);
                    }
                }
            });
            com.sankuai.waimai.store.expose.v2.entity.b bVar = c1194a.b;
            bVar.e = String.valueOf(c1194a.itemView.hashCode());
            bVar.a("poi_id", a.this.b.d()).a(KernelConfig.KEY_CONTAINER_TYPE, 4).a("index", Integer.valueOf(i)).a(DataConstants.CATEGORY_ID, Long.valueOf(navigateItem.tagId)).a("category_name", navigateItem.name);
            View view = c1194a.c;
            Object[] objArr3 = {view};
            ChangeQuickRedirect changeQuickRedirect3 = C1194a.a;
            if (PatchProxy.isSupport(objArr3, c1194a, changeQuickRedirect3, false, "d53e03629aea24914d0cbc56e7a49dfb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, c1194a, changeQuickRedirect3, false, "d53e03629aea24914d0cbc56e7a49dfb");
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = (h.a(view.getContext()) - h.a(view.getContext(), 54.5f)) / 4;
                view.setLayoutParams(layoutParams);
            }
            c1194a.d.setText(com.sankuai.waimai.store.goods.list.utils.b.a(navigateItem.name, 4));
            c1194a.d.setTextSize(2, 14.0f);
            if (navigateItem.isMoreTag && a.this.e == 2) {
                c1194a.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, com.sankuai.waimai.store.view.a.a(c1194a.d.getContext(), R.dimen.wm_sc_common_dimen_5, R.dimen.wm_sc_common_dimen_6, R.color.wm_sg_color_666460, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.RIGHT), (Drawable) null);
                c1194a.d.setCompoundDrawablePadding(0);
                c1194a.d.setTextColor(a.this.c.j().getResources().getColor(R.color.wm_sg_color_666460));
                c1194a.d.setBackgroundDrawable(c1194a.h);
                u.c(c1194a.e);
            } else if (a.this.e == 2) {
                c1194a.d.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                c1194a.d.setBackgroundDrawable(c1194a.g);
                c1194a.d.setTextColor(a.this.c.j().getResources().getColor(R.color.wm_sg_color_33312d));
                u.a(c1194a.e);
                c1194a.e.setBackgroundDrawable(c1194a.i);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.viewblocks.experimental.category.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C1194a extends e {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.store.expose.v2.entity.b b;
        public View c;
        public TextView d;
        public View e;
        public boolean f;
        public Drawable g;
        public Drawable h;
        public Drawable i;

        public C1194a(View view, boolean z) {
            super(view);
            Object[] objArr = {a.this, view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b896c85a8480cf6e00078453466ae8e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b896c85a8480cf6e00078453466ae8e");
                return;
            }
            this.c = view;
            this.f = z;
            this.d = (TextView) view.findViewById(R.id.cat_title);
            this.e = view.findViewById(R.id.view_shade);
            if (this.f) {
                SCBaseActivity j = a.this.c.j();
                int color = j.getResources().getColor(17170443);
                int color2 = j.getResources().getColor(R.color.wm_order_confirm_coupon_driver_color);
                int a2 = h.a(j, 80.0f);
                int a3 = h.a(j, 34.0f);
                this.g = new e.a().d(a2).e(a3).a(12.0f).c(color).a(color2).b(h.a(j, 0.5f)).a();
                int color3 = j.getResources().getColor(R.color.wm_sc_color_F2F1F0);
                this.h = new e.a().d(a2).e(a3).a(12.0f).c(color3).a(color3).b(h.a(j, 0.5f)).a();
                int[] iArr = {com.sankuai.waimai.store.util.b.b(j, R.color.wm_sc_black_transparent_5), com.sankuai.waimai.store.util.b.b(j, R.color.wm_st_common_transparent)};
                float a4 = h.a(j, 40.0f);
                this.i = new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, iArr).a(0.0f, 0.0f, a4, a4).a();
                this.b = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_6ahx3i39_mv", view);
                com.sankuai.waimai.store.expose.v2.b.a().a(a.this.c.j(), this.b);
            }
        }
    }
}
