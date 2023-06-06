package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.subscribe.SpuSubscribeResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class u extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    final View b;
    ViewGroup c;
    TextView d;
    TextView e;
    int f;
    boolean g;
    boolean h;
    private View i;

    public static /* synthetic */ void a(u uVar, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, GoodsSpu goodsSpu) {
        long j;
        Object[] objArr = {aVar, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, uVar, changeQuickRedirect, false, "2b12ef971e2699538932afef9b666b56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, uVar, changeQuickRedirect, false, "2b12ef971e2699538932afef9b666b56");
            return;
        }
        uVar.g = true;
        com.sankuai.waimai.store.base.net.sg.a a2 = com.sankuai.waimai.store.base.net.sg.a.a((Object) ((SCBaseActivity) uVar.getContext()).w());
        long f = aVar.f();
        String h = aVar.h();
        long id = goodsSpu.getId();
        List<GoodsSku> list = goodsSpu.skus;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, uVar, changeQuickRedirect2, false, "f7de7b0255ff08e9830c1d38c6c83c7b", RobustBitConfig.DEFAULT_VALUE)) {
            j = ((Long) PatchProxy.accessDispatch(objArr2, uVar, changeQuickRedirect2, false, "f7de7b0255ff08e9830c1d38c6c83c7b")).longValue();
        } else {
            GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0);
            j = goodsSku != null ? goodsSku.id : 0L;
        }
        a2.b(f, h, id, j, goodsSpu.name, uVar.f, new com.sankuai.waimai.store.base.net.j<SpuSubscribeResponse>() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.u.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8d54dfd05d4bfb86c915470e28ac6fbe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8d54dfd05d4bfb86c915470e28ac6fbe");
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(SpuSubscribeResponse spuSubscribeResponse) {
                SpuSubscribeResponse spuSubscribeResponse2 = spuSubscribeResponse;
                Object[] objArr3 = {spuSubscribeResponse2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f2fe83e80cb1684f8ce2305c6c9cdf3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f2fe83e80cb1684f8ce2305c6c9cdf3a");
                    return;
                }
                u.this.f = u.this.f == 4 ? 3 : 4;
                u.this.a();
                if (com.sankuai.shangou.stone.util.t.a(spuSubscribeResponse2.subTitle)) {
                    return;
                }
                am.a(u.this.getContext(), spuSubscribeResponse2.subTitle);
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8ac44cc75ec48d204a334faaac932a72", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8ac44cc75ec48d204a334faaac932a72");
                } else {
                    u.this.g = false;
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr3 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0903f5bcde4b5c9f84e7d459f51bdcc9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0903f5bcde4b5c9f84e7d459f51bdcc9");
                } else if (bVar == null || com.sankuai.shangou.stone.util.t.a(bVar.b)) {
                } else {
                    am.a(u.this.getContext(), bVar.b);
                }
            }
        });
    }

    public u(@NonNull Context context, View view) {
        super(context);
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4292ced9981068cf1c8a98ee5235e19b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4292ced9981068cf1c8a98ee5235e19b");
            return;
        }
        this.g = false;
        this.b = view;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c44b0618daace34f097f3ee9fb50ad32", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c44b0618daace34f097f3ee9fb50ad32") : layoutInflater.inflate(R.layout.wm_st_poi_market_warm_up_label, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a9001125c6fdcbc78a08b20c0780dc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a9001125c6fdcbc78a08b20c0780dc1");
            return;
        }
        super.onViewCreated();
        this.c = (ViewGroup) findView(R.id.container);
        this.d = (TextView) findView(R.id.tv_time);
        this.e = (TextView) findView(R.id.tv_subscribe);
        this.i = findView(R.id.v_line);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23673b1566023f96151c5bb9d2e781ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23673b1566023f96151c5bb9d2e781ab");
        } else if (this.f == 3) {
            com.sankuai.shangou.stone.util.u.a(this.e, (int) R.string.wm_sc_warm_up_wait_for_subscribe);
            this.c.setBackground(com.sankuai.waimai.store.util.e.b(getContext(), (int) R.color.wm_sg_color_FFF5DB, (int) R.dimen.wm_sc_common_dimen_4));
            this.i.setBackgroundColor(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_FF8000));
        } else if (this.f == 4) {
            com.sankuai.shangou.stone.util.u.a(this.e, (int) R.string.wm_sc_warm_up_subscribe);
            this.c.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(getContext(), 4.0f)).a(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_FF8000)).b(1).a());
            this.i.setBackgroundColor(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_FFCC99));
        }
    }
}
