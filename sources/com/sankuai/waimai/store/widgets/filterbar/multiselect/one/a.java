package com.sankuai.waimai.store.widgets.filterbar.multiselect.one;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
import com.sankuai.waimai.store.widgets.filterbar.multiselect.one.c;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.widgets.filterbar.multiselect.a implements c.b, com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub.b {
    public static ChangeQuickRedirect b;
    b c;
    boolean d;
    private TextView e;
    private ImageView f;
    private ViewGroup g;
    private com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub.c h;
    private c.a i;
    private View.OnClickListener j;
    private View.OnClickListener k;

    public a(@NonNull Context context, @NonNull ViewGroup viewGroup, b bVar) {
        super(context);
        Object[] objArr = {context, viewGroup, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97fd998017ea2227ead851fcd7019231", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97fd998017ea2227ead851fcd7019231");
            return;
        }
        this.j = new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.multiselect.one.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bfbc832436a88458ad50778d37c2693f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bfbc832436a88458ad50778d37c2693f");
                } else if (a.this.c != null) {
                    a.this.c.b();
                    a.this.c.a(true ^ a.this.d);
                }
            }
        };
        this.k = new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.multiselect.one.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eba492a49ec949a16ca0d307e42a79c2", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eba492a49ec949a16ca0d307e42a79c2");
                } else if (a.this.c != null) {
                    a.this.c.a(true ^ a.this.d);
                }
            }
        };
        this.g = viewGroup;
        this.i = new d(this);
        this.c = bVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06060ed533f486692a8d54d763766efc", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06060ed533f486692a8d54d763766efc") : layoutInflater.inflate(R.layout.wm_sc_common_multiselect_style_one, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ea266da3fa53644f7a9082293ddf289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ea266da3fa53644f7a9082293ddf289");
            return;
        }
        super.onViewCreated();
        this.f = (ImageView) findView(R.id.iv_filter_arrow);
        this.e = (TextView) findView(R.id.tv_filter_text);
        this.h = new com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub.c(getContext(), this);
        this.h.createView(this.g);
        getView().setOnClickListener(this.j);
    }

    public final void a(List<Long> list, SGSortModel sGSortModel) {
        Object[] objArr = {list, sGSortModel};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "837ae5d1446e0395ca1e9ef40df04373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "837ae5d1446e0395ca1e9ef40df04373");
        } else if (sGSortModel == null || t.a(sGSortModel.text) || com.sankuai.shangou.stone.util.a.b(sGSortModel.subFilterList)) {
            getView().setVisibility(8);
        } else {
            getView().setVisibility(0);
            this.i.a(list, sGSortModel);
            if (this.c != null) {
                this.c.b(this.e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.c.b
    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9cbdb0b0b0cdd5a4a5db70fbbbf9d6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9cbdb0b0b0cdd5a4a5db70fbbbf9d6a");
            return;
        }
        if (!t.a(str) && str.length() > 6) {
            str = str.substring(0, 6) + "...";
        }
        this.e.setText(str);
        this.e.setTextColor(ContextCompat.getColor(this.e.getContext(), z ? R.color.wm_st_common_text_title : R.color.wm_sg_color_999999));
        this.e.getPaint().setFakeBoldText(z);
        this.f.setSelected(z);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.c.b
    public final void a(List<com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub.d> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66c398786de9f9f48019810dd0a28cfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66c398786de9f9f48019810dd0a28cfc");
        } else if (this.h != null) {
            com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub.c cVar = this.h;
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "e338cf506b7a0ef72a693972a73f54c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "e338cf506b7a0ef72a693972a73f54c7");
            } else {
                cVar.b.b_(list);
            }
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4773addf699157f5431fa64739fde425", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4773addf699157f5431fa64739fde425");
            return;
        }
        this.d = z;
        if (z) {
            this.f.setImageResource(R.drawable.wm_st_goods_list_market_ic_sort_up);
        } else {
            this.f.setImageResource(R.drawable.wm_st_goods_list_market_ic_sort_down);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a741166291e3c798dabf3dcf690fe2b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a741166291e3c798dabf3dcf690fe2b9");
        } else if (this.g.getVisibility() == 0) {
        } else {
            this.g.removeAllViews();
            this.g.addView(this.h.getView());
            this.g.setVisibility(0);
            this.g.setOnClickListener(this.k);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d17e0999f81652117453e98facf19e09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d17e0999f81652117453e98facf19e09");
        } else if (this.g.getVisibility() != 0) {
        } else {
            this.g.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub.b
    public final void a(View view, SGSortModel sGSortModel, int i) {
        Object[] objArr = {view, sGSortModel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "209f325ba07142898d872f2d1e2c5431", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "209f325ba07142898d872f2d1e2c5431");
        } else if (this.c == null || sGSortModel == null) {
        } else {
            this.c.a(view, i, sGSortModel.text);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub.b
    public final void a(SGSortModel sGSortModel, int i) {
        Object[] objArr = {sGSortModel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d773f41199dc9ac7d1ec9ba7f9a0e4a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d773f41199dc9ac7d1ec9ba7f9a0e4a3");
        } else if (this.c == null || sGSortModel == null) {
        } else {
            this.c.a(!this.d);
            this.c.a(i, sGSortModel.text, sGSortModel.typeList);
        }
    }
}
