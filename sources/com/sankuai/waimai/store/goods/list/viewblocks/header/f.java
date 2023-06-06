package com.sankuai.waimai.store.goods.list.viewblocks.header;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.detail.components.subroot.poiservice.SGPoiServiceDialogBlock;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends a {
    public static ChangeQuickRedirect c;
    protected View d;
    SGPoiServiceDialogBlock l;
    private ViewGroup m;
    private View n;
    private h o;
    private e p;
    private g q;

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final int c() {
        return R.layout.wm_st_goods_list_market_layout_header_b;
    }

    public static /* synthetic */ Poi.PoiImpressLabel a(f fVar, Poi poi) {
        String string;
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "2e5d90ab9b798ea1185c78317e1013e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Poi.PoiImpressLabel) PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "2e5d90ab9b798ea1185c78317e1013e5");
        }
        if (!TextUtils.isEmpty(poi.getRestBulletin())) {
            string = poi.getRestBulletin();
        } else {
            string = fVar.mContext.getString(R.string.wm_sc_common_welcome_content);
        }
        Poi.PoiImpressLabel poiImpressLabel = new Poi.PoiImpressLabel();
        poiImpressLabel.mLabelText = fVar.mContext.getString(R.string.wm_sc_goods_list_bulletin);
        poiImpressLabel.labelDescText = string;
        return poiImpressLabel;
    }

    public f(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "009740f325b72a2ecdcf0fa6a8211fe2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "009740f325b72a2ecdcf0fa6a8211fe2");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.b
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66e2ef8bd7bac53a16a0654a82beb652", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66e2ef8bd7bac53a16a0654a82beb652")).intValue() : this.m.getHeight() + b();
    }

    @Override // com.sankuai.waimai.store.goods.list.base.b
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e258599dd75001b7d3d1cb72204094c8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e258599dd75001b7d3d1cb72204094c8")).intValue() : u.a(this.mContext) + com.sankuai.shangou.stone.util.h.a(this.mContext, 48.0f);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3220655c29ba47240a4c17be0ea5d2ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3220655c29ba47240a4c17be0ea5d2ac");
            return;
        }
        this.d = view;
        this.m = (ViewGroup) this.d.findViewById(R.id.shop_header_info);
        this.n = this.d.findViewById(R.id.ll_actionbar);
        this.j = new com.sankuai.waimai.store.goods.list.viewblocks.header.widget.a(this.a, this.d.findViewById(R.id.shop_logo_layout));
        View view2 = this.d;
        Object[] objArr2 = {view2};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebb359ce40473f5f482b094abe51fcee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebb359ce40473f5f482b094abe51fcee");
        } else {
            this.o = new h(this.a);
            this.o.bindView(view2);
            this.q = new g(this.a);
            this.q.bindView(view2);
            this.p = new e(this.a);
            this.p.bindView(view2);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6152af22b4458901088a0d8b9fb6b494", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6152af22b4458901088a0d8b9fb6b494");
            return;
        }
        g gVar = this.q;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.f.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Object[] objArr4 = {view3};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "571edf774543469cdb843cee139c1f2e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "571edf774543469cdb843cee139c1f2e");
                    return;
                }
                f.this.g();
                f.this.a("b_92YYh");
            }
        };
        Object[] objArr4 = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect4 = g.c;
        if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "bcb5f7cc96761d87ba8dc7e48c1c80c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "bcb5f7cc96761d87ba8dc7e48c1c80c6");
        } else {
            gVar.d.setOnClickListener(onClickListener);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.a
    public final void a(@NonNull final Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88fefb96954c8ab4b3d829d67d3a74c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88fefb96954c8ab4b3d829d67d3a74c1");
            return;
        }
        h hVar = this.o;
        Object[] objArr2 = {poi};
        ChangeQuickRedirect changeQuickRedirect2 = h.c;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "07adb4593d66881ce9b2da0ea7e15143", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "07adb4593d66881ce9b2da0ea7e15143");
        } else {
            hVar.d.setText(poi.getName());
        }
        this.p.a(poi);
        g gVar = this.q;
        Object[] objArr3 = {poi};
        ChangeQuickRedirect changeQuickRedirect3 = g.c;
        if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "66370342ed9d9c72a5baaee8a1410d1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "66370342ed9d9c72a5baaee8a1410d1b");
        } else {
            double d = poi.score;
            long j = poi.commentNumber;
            if (j <= 0 || d <= 0.0d) {
                gVar.d.setVisibility(8);
                gVar.e.setVisibility(8);
            } else {
                String valueOf = String.valueOf(j);
                if (j > 9999) {
                    valueOf = "9999+";
                }
                gVar.f.setText(gVar.f.getContext().getString(R.string.wm_sc_goods_list_comment, valueOf));
                gVar.d.setVisibility(0);
                gVar.f.setVisibility(0);
                gVar.e.setVisibility(0);
                TextView textView = gVar.e;
                if (com.sankuai.shangou.stone.util.i.d(Double.valueOf(d), Double.valueOf(5.0d))) {
                    d = 5.0d;
                }
                textView.setText(Double.toString(d));
            }
        }
        this.j.a(poi);
        this.m.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.f.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Poi.PoiLabel newPoiLabels;
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "304d239441e6b8dea2b542c4b025dacf", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "304d239441e6b8dea2b542c4b025dacf");
                } else if (view.getId() != R.id.shop_header_info || (newPoiLabels = poi.getNewPoiLabels()) == null || com.sankuai.shangou.stone.util.a.b(newPoiLabels.labels)) {
                } else {
                    if (f.this.l == null) {
                        f.this.l = new SGPoiServiceDialogBlock(f.this.mContext);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(f.a(f.this, poi));
                    f.this.l.a(newPoiLabels.getFilterLabels(), arrayList, (SGPoiServiceDialogBlock.a) null);
                }
            }
        });
    }
}
