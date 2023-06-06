package com.sankuai.waimai.store.goods.detail.components.subroot.actionbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.s;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.tip.SCShareTip;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.share.a;
import com.sankuai.waimai.store.util.v;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends c.a implements com.sankuai.waimai.store.i.share.a, com.sankuai.waimai.store.i.share.b {
    public static ChangeQuickRedirect c;
    String d;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    private GoodsSpu f;
    private String g;
    private String h;
    private String i;
    private String j;
    private a.InterfaceC1326a k;
    private com.sankuai.waimai.store.i.share.b l;

    public d(c.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70c78f1490872f034097de00f124dcb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70c78f1490872f034097de00f124dcb0");
            return;
        }
        this.k = new a.InterfaceC1326a() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.share.a.InterfaceC1326a
            public final void a(@Nullable String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "339978b8b1f66e6d76657290559bcecf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "339978b8b1f66e6d76657290559bcecf");
                    return;
                }
                d.this.b.q().v();
                d.this.c(str);
            }
        };
        this.l = new com.sankuai.waimai.store.share.d(this);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c.a
    public final void a(String str) {
        this.g = str;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c.a
    public final void a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, GoodsSpu goodsSpu, String str, String str2, String str3) {
        Object[] objArr = {aVar, goodsSpu, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "845d4474c8832507d5e296c39feccdb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "845d4474c8832507d5e296c39feccdb4");
            return;
        }
        this.e = aVar;
        this.f = goodsSpu;
        this.h = str;
        this.i = str2;
        this.j = str3;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d48ca9b1468aebf5db03e2821b47f0b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d48ca9b1468aebf5db03e2821b47f0b0");
            return;
        }
        com.sankuai.waimai.store.manager.judas.b.a(this.b.q(), "b_waimai_av3p7v9q_mc").a(com.sankuai.waimai.store.manager.judas.b.a((Object) this.b.q())).a("poi_id", Long.valueOf(b())).a("spu_id", Long.valueOf(c())).a("activity_id", "").a("new_old_user", "-1").a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6bb831521a097499aed0e82dd1422e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6bb831521a097499aed0e82dd1422e0");
        } else if (this.f == null || this.f.getShareTip() == null) {
        } else {
            e eVar = new e(this.b.q(), this.f.getShareTip().getIcon(), this.h);
            if (v.c || TextUtils.isEmpty(this.f.getShareTip().getMiniProgramId())) {
                c(null);
                return;
            }
            this.b.q().u();
            double minPrice = this.f.getMinPrice();
            double originPrice = this.f.getOriginPrice();
            Object[] objArr3 = {Double.valueOf(minPrice), Double.valueOf(originPrice)};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "ca10c0954a1bc947404ed1710c9a079f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "ca10c0954a1bc947404ed1710c9a079f");
            } else if (minPrice <= 0.0d) {
                eVar.b.setVisibility(8);
            } else {
                eVar.b.setVisibility(0);
                eVar.c.setText(eVar.g.getString(R.string.wm_sc_goods_detail_price_no_space, i.a(minPrice)));
                if (originPrice <= 0.0d) {
                    eVar.d.setVisibility(8);
                } else {
                    eVar.d.setVisibility(0);
                    eVar.d.setText(eVar.g.getString(R.string.wm_sc_goods_detail_price_no_space, i.a(originPrice)));
                }
            }
            eVar.a(this.k);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c.a
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a f() {
        return this.e;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c.a
    public final long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a21f0c3336e2738349a236b42e24fb35", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a21f0c3336e2738349a236b42e24fb35")).longValue();
        }
        if (this.e == null) {
            return -1L;
        }
        return this.e.f();
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c.a
    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1cd2da96c0aaa7e00b16dd6a04d2c35", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1cd2da96c0aaa7e00b16dd6a04d2c35")).longValue();
        }
        if (this.f == null) {
            return -1L;
        }
        return this.f.getId();
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c.a
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1772acb38c5280da3c29ce0b59bd0c0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1772acb38c5280da3c29ce0b59bd0c0") : t.a(this.g) ? "" : this.g;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c.a
    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd2bfea2e3a8d1871ac905c971487fff", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd2bfea2e3a8d1871ac905c971487fff") : (this.f == null || com.sankuai.shangou.stone.util.a.b(this.f.skus) || com.sankuai.shangou.stone.util.a.a((List<Object>) this.f.skus, 0) == null) ? "-1" : String.valueOf(((GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) this.f.skus, 0)).id);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94f896b5b66060cf2c674c6503327cc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94f896b5b66060cf2c674c6503327cc1");
        } else {
            g.a(this.b.q(), b(), this.e.h(), this.e.b, this.i, this.j);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c.a
    public final void b(String str) {
        this.d = str;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ea2c9f41a4cdbaa12f083b0c806c288", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ea2c9f41a4cdbaa12f083b0c806c288");
            return;
        }
        com.sankuai.waimai.store.manager.judas.b.a(this.b.q(), "b_WmEpH").a("index", 1).a("new_message_badge", Integer.valueOf(this.b.v())).a("poi_id", Long.valueOf(b())).a("spu_id", Long.valueOf(c())).a();
        if (com.sankuai.waimai.store.manager.user.a.a().b()) {
            com.sankuai.waimai.store.router.d.a(this.b.q(), this.d);
            return;
        }
        com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.NONE;
        com.sankuai.waimai.store.manager.user.a.a(this.b.q(), new Runnable() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.d.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9b741faf6b6075cd8450f5a07e69754", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9b741faf6b6075cd8450f5a07e69754");
                } else {
                    com.sankuai.waimai.store.router.d.a(d.this.b.q(), d.this.d);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9968c4654a2e674916ad05a7bf731d16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9968c4654a2e674916ad05a7bf731d16");
        } else if (this.f == null || this.f.getShareTip() == null) {
        } else {
            SCShareTip sCShareTip = (SCShareTip) s.a(this.f.getShareTip());
            if (sCShareTip != null) {
                if (!TextUtils.isEmpty(str)) {
                    sCShareTip.setIcon(str);
                }
            } else {
                sCShareTip = this.f.getShareTip();
            }
            SCShareTip sCShareTip2 = sCShareTip;
            if (k.b()) {
                sCShareTip2.setMiniprogramType(0);
            } else {
                sCShareTip2.setMiniprogramType(2);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("source", 5);
            HashMap hashMap = new HashMap();
            hashMap.put("channel_id", this.f.getShareTip().getChannels());
            hashMap.put("poi_id", Long.valueOf(b()));
            hashMap.put("spu_id", Long.valueOf(this.f.getId()));
            com.sankuai.waimai.store.manager.share.a.a(this.b.q(), sCShareTip2, this, this.l, bundle, hashMap);
        }
    }

    @Override // com.sankuai.waimai.store.i.share.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "007a50b611083840634be85508755693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "007a50b611083840634be85508755693");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.b.q(), "b_YO9GL").a("channel_id", String.valueOf(i)).a("poi_id", Long.valueOf(b())).a("spu_id", Long.valueOf(c())).a("activity_tag", this.f != null ? this.f.getActivityTag() : "").a();
        }
    }

    @Override // com.sankuai.waimai.store.i.share.b
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd06c2c752deca3836b9aa23bf68d96d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd06c2c752deca3836b9aa23bf68d96d");
            return;
        }
        com.sankuai.waimai.store.callback.a a = com.sankuai.waimai.store.manager.judas.b.a(this.b.q(), "b_a6x5me9v");
        if (1 == i2) {
            a.a("status", "1");
        } else {
            a.a("status", "0");
        }
        a.a("poi_id", Long.valueOf(b())).a("spu_id", Long.valueOf(c())).a("activity_id", "").a("new_old_user", "-1");
        a.a(AppUtil.generatePageInfoKey(this.b.q())).a();
    }
}
