package com.sankuai.waimai.store.msi.view.soldout;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.newmarket.dot.b;
import com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e;
import com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.g;
import com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.d;
import com.sankuai.waimai.store.goods.subscribe.c;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.list.LoadingFooterView;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.n;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.z;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MscSoldOutDialog extends CustomDialog implements e, com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.e, c, n {
    public static ChangeQuickRedirect a;
    private final LoadingFooterView b;
    private final NetInfoLoadView c;
    private final ViewGroup d;
    private final a e;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a f;
    private final GoodsPoiCategory h;
    private final d i;
    private final b.a j;
    private final com.sankuai.waimai.store.goods.list.templet.newmarket.dot.b m;

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
    }

    public MscSoldOutDialog(@NonNull Activity activity, String str, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, GoodsPoiCategory goodsPoiCategory) {
        super(activity, 2131559277);
        Object[] objArr = {activity, str, aVar, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4048d06d7aabf8dc5c22b47d3d853cd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4048d06d7aabf8dc5c22b47d3d853cd0");
            return;
        }
        this.d = new RelativeLayout(activity);
        this.j = new b.a(activity, this.d);
        this.m = new com.sankuai.waimai.store.goods.list.templet.newmarket.dot.b(goodsPoiCategory, aVar, this.j, "c_waimai_qeknbhm9", str);
        this.i = new d(com.sankuai.waimai.store.msi.listener.a.a(activity));
        this.f = aVar;
        this.h = goodsPoiCategory;
        z.a(activity, R.layout.wm_st_poi_market_sold_out_list, this.d, true);
        SCRecyclerView sCRecyclerView = (SCRecyclerView) this.d.findViewById(R.id.sold_out_spu_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.d.getContext());
        this.c = (NetInfoLoadView) this.d.findViewById(R.id.sold_out_net_info);
        this.b = new LoadingFooterView(this.d.getContext());
        sCRecyclerView.b(this.b);
        sCRecyclerView.setOnScrollToBottomOrTopListener(this);
        sCRecyclerView.setLayoutManager(linearLayoutManager);
        this.e = new a(this, this.d);
        sCRecyclerView.setAdapter((f<?, ?>) this.e);
        com.sankuai.waimai.store.expose.v2.b.a().a(this.j);
    }

    private void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3739f2c1a31d46ec81b7ee639b538c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3739f2c1a31d46ec81b7ee639b538c");
        } else if (a(this.h, goodsSpu)) {
            a();
        } else {
            this.i.a(b(this.h, goodsSpu));
        }
    }

    private void a(List<GoodsSpu> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6805585a88163cb9224ddc2e4c11b67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6805585a88163cb9224ddc2e4c11b67");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            if (this.e.g()) {
                this.e.b_(list);
            } else {
                this.e.c_(list);
            }
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033b9a090655d7b6c7f3003ca85753b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033b9a090655d7b6c7f3003ca85753b3");
        } else {
            this.b.a();
        }
    }

    private boolean a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cc1652d38f231fd8abbf7a5dfaa8780", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cc1652d38f231fd8abbf7a5dfaa8780")).booleanValue() : goodsSpu != null && this.i.d(goodsPoiCategory, goodsSpu);
    }

    @NonNull
    private g b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d7f4eafd703ad2ff20761a7f3ad60a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d7f4eafd703ad2ff20761a7f3ad60a2");
        }
        g gVar = new g(this);
        gVar.a(goodsPoiCategory, goodsPoiCategory, goodsSpu);
        gVar.j = goodsPoiCategory;
        gVar.i = goodsPoiCategory;
        gVar.a(this.f.f(), this.f.h());
        return gVar;
    }

    @Override // android.app.Dialog
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e15e2e411d4d9b417abbbd4c2fbf99f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e15e2e411d4d9b417abbbd4c2fbf99f");
            return;
        }
        super.onStart();
        com.sankuai.waimai.store.expose.v2.b.a().c(this.j);
    }

    @Override // android.app.Dialog
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "195930f349da9ae3a16490ba0f11bcc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "195930f349da9ae3a16490ba0f11bcc1");
            return;
        }
        super.onStop();
        com.sankuai.waimai.store.expose.v2.b.a().f(this.j);
    }

    @Override // com.sankuai.waimai.store.ui.common.CustomDialog, com.sankuai.waimai.store.ui.common.SCBaseDialog, android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "268395cf5438c573c1d38184a2d3748b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "268395cf5438c573c1d38184a2d3748b");
            return;
        }
        this.d.setVisibility(0);
        setContentView(this.d);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.msi.view.soldout.MscSoldOutDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2648b3c382408d4f28c6ffbbb3cfd42", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2648b3c382408d4f28c6ffbbb3cfd42");
                } else {
                    MscSoldOutDialog.this.dismiss();
                }
            }
        });
        this.b.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da680eef1c895a48f96bd727d061cd0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da680eef1c895a48f96bd727d061cd0b");
        } else {
            this.e.b_(null);
        }
        this.i.d(this.h);
        com.sankuai.waimai.store.goods.subscribe.a.a().a(this);
        super.show();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "216d3b750d44ed540858a6df8032e60c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "216d3b750d44ed540858a6df8032e60c");
        } else {
            a((GoodsSpu) null);
        }
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bae7051c2aafbd90cb3b301b8c9c0b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bae7051c2aafbd90cb3b301b8c9c0b5");
            return;
        }
        super.onShow(dialogInterface);
        com.sankuai.waimai.store.goods.list.templet.newmarket.dot.b bVar = this.m;
        ViewGroup viewGroup = this.d;
        Object[] objArr2 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.dot.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "080a9587534c9f7a0c1503cac2b467e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "080a9587534c9f7a0c1503cac2b467e1");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", bVar.b.d());
        hashMap.put("stid", bVar.c);
        bVar.a("b_waimai_sg_xreeoi5s_mv", hashMap, viewGroup, bVar.d.getTagCode() + "-b_waimai_sg_xreeoi5s_mv");
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "341c8cd51dd17bfe04eddcf8ca9255ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "341c8cd51dd17bfe04eddcf8ca9255ce");
            return;
        }
        com.sankuai.waimai.store.goods.subscribe.a.a().b(this);
        com.sankuai.waimai.store.expose.v2.b.a().b(this.j);
        super.onDismiss(dialogInterface);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void a(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e633eafc72c5305a51a8a5a6f804b129", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e633eafc72c5305a51a8a5a6f804b129");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea76d2d27ec313949847e7fa637ee932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea76d2d27ec313949847e7fa637ee932");
        } else if (this.e.g()) {
            this.c.b();
        } else {
            this.b.d();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final List<Long> b(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d556b5a2b630085597c64a2e34713ecc", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d556b5a2b630085597c64a2e34713ecc") : this.i.a(gVar.a(), gVar.k);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void c(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "981dabb194dea94b3197ded3945c6f45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "981dabb194dea94b3197ded3945c6f45");
        } else {
            a(this.i.a(gVar.a(), b(gVar)));
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void d(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10dbaecebde2d377892087f7fd6bfd64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10dbaecebde2d377892087f7fd6bfd64");
        } else {
            a((List<GoodsSpu>) null);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.e
    public final void e(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b7917d029d8acc0db860451ae6202e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b7917d029d8acc0db860451ae6202e6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9023f01beaf083af1d6095997d5eba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9023f01beaf083af1d6095997d5eba4");
        } else if (this.e.g()) {
            this.c.c();
        } else {
            this.c.e();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.e
    public final GoodsPoiCategory f() {
        return this.h;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.e
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a g() {
        return this.f;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.e
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d0cb056da2e216371d18a87cd4e72a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d0cb056da2e216371d18a87cd4e72a5");
            return;
        }
        com.sankuai.waimai.store.goods.list.templet.newmarket.dot.b bVar = this.m;
        Object[] objArr2 = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.dot.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "7dde9d052d711ad894214412cfd937a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "7dde9d052d711ad894214412cfd937a8");
        } else if (goodsSpu == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", Long.valueOf(bVar.b.f()));
            hashMap.put("stid", bVar.c);
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            hashMap.put(DataConstants.INDEX, Integer.valueOf(i));
            bVar.a("b_waimai_sg_pkky1msa_mc", hashMap);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.e
    public final void a(GoodsSpu goodsSpu, int i, View view) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56fed84358b9047b7455e6b79cdb9be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56fed84358b9047b7455e6b79cdb9be5");
            return;
        }
        com.sankuai.waimai.store.goods.list.templet.newmarket.dot.b bVar = this.m;
        Object[] objArr2 = {goodsSpu, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.dot.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "3aef883630072f6c88b4103baa739dd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "3aef883630072f6c88b4103baa739dd7");
        } else if (goodsSpu == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", Long.valueOf(bVar.b.f()));
            hashMap.put("stid", bVar.c);
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            hashMap.put(DataConstants.INDEX, Integer.valueOf(i));
            bVar.a("b_waimai_sg_nzzeggnp_mv", hashMap, view, "b_waimai_sg_nzzeggnp_mv" + goodsSpu.getId());
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.e
    public final void b(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4802dbf1fd63ce49a416f1211bfcbac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4802dbf1fd63ce49a416f1211bfcbac7");
            return;
        }
        com.sankuai.waimai.store.goods.list.templet.newmarket.dot.b bVar = this.m;
        Object[] objArr2 = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.dot.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "213f76cdc96531a95b895ae852ac4f40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "213f76cdc96531a95b895ae852ac4f40");
        } else if (goodsSpu == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", Long.valueOf(bVar.b.f()));
            hashMap.put("stid", bVar.c);
            hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
            hashMap.put(DataConstants.INDEX, Integer.valueOf(i));
            bVar.a("b_waimai_sg_nzzeggnp_mc", hashMap);
        }
    }

    @Override // com.sankuai.waimai.store.goods.subscribe.c
    public final void a(long j, String str, long j2, long j3, int i) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a266d4ef422a1ee5bc4a5c03cee39736", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a266d4ef422a1ee5bc4a5c03cee39736");
            return;
        }
        this.i.a(j2, j3, i);
        this.e.notifyDataSetChanged();
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void bm_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc020c9ea0140511a80048a9f7b48d99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc020c9ea0140511a80048a9f7b48d99");
        } else {
            a(this.e.h(this.e.getItemCount() - 1));
        }
    }
}
