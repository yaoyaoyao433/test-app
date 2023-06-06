package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.m;
import com.sankuai.waimai.store.platform.domain.core.activities.MutilReceiveCouponTip;
import com.sankuai.waimai.store.platform.domain.core.activities.MutliPoiCouponItem;
import com.sankuai.waimai.store.platform.domain.core.activities.ReceiveCouponTip;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.am;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class n extends m implements View.OnClickListener {
    public static ChangeQuickRedirect o;
    protected View p;
    protected View q;
    protected TextView r;
    public com.sankuai.waimai.store.expose.v2.entity.b s;
    public j t;
    public MutilReceiveCouponTip u;

    public static /* synthetic */ void a(n nVar, List list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, nVar, changeQuickRedirect, false, "573bbc81e2381c8a46a6244f0608bc7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, nVar, changeQuickRedirect, false, "573bbc81e2381c8a46a6244f0608bc7b");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MutliPoiCouponItem mutliPoiCouponItem = (MutliPoiCouponItem) it.next();
            if (mutliPoiCouponItem.code == 0) {
                Poi.PoiCouponItem poiCouponItem = mutliPoiCouponItem.data;
                if (poiCouponItem != null) {
                    com.sankuai.waimai.store.manager.coupon.c.a().a(poiCouponItem);
                }
            } else if (z) {
                am.a(nVar.mContext, "领取失败，请稍后再试");
            }
        }
    }

    public n(Context context, j jVar) {
        super(context, jVar);
        Object[] objArr = {context, jVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9e62559b38c05af3c0fb963aac24ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9e62559b38c05af3c0fb963aac24ae");
        } else {
            this.t = jVar;
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.m, com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5c3c222c49c2a962c9bb6d8814a50fe", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5c3c222c49c2a962c9bb6d8814a50fe") : layoutInflater.inflate(R.layout.wm_st_poi_market_adapter_slogen_header_v3, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.m, com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84a60d1b50f56e297f4daade7dd2185d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84a60d1b50f56e297f4daade7dd2185d");
            return;
        }
        super.onViewCreated();
        this.p = this.mView.findViewById(R.id.slogan_header_left_container);
        this.q = this.mView.findViewById(R.id.slogan_header_left_container_multi);
        this.r = (TextView) this.mView.findViewById(R.id.txt_slogan_header_desc_multi);
        this.s = new com.sankuai.waimai.store.expose.v2.entity.b(a() ? m.a.e : m.a.a, this.c);
        if (this.mContext instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.mContext, this.s);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.m
    public void a(k kVar, int i, int i2) {
        Object[] objArr = {kVar, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e886b921386fec68148f9c15d3831cb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e886b921386fec68148f9c15d3831cb6");
        } else if (kVar == null) {
        } else {
            this.k = kVar.b;
            this.j = this.t.m();
            if (this.k == null || this.k.mutilReceiveCouponTip == null) {
                return;
            }
            this.u = this.k.mutilReceiveCouponTip;
            if (this.j != null && this.j.type == 25) {
                this.s = new com.sankuai.waimai.store.expose.v2.entity.b(m.a.c, this.c);
                if (this.mContext instanceof com.sankuai.waimai.store.expose.v2.a) {
                    com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.mContext, this.s);
                }
                this.s.b(c(this.u));
            } else {
                if (this.s == null) {
                    this.s = new com.sankuai.waimai.store.expose.v2.entity.b(a() ? m.a.e : m.a.a, this.c);
                }
                this.s.b(b(this.u));
            }
            a(this.u);
        }
    }

    public void a(MutilReceiveCouponTip mutilReceiveCouponTip) {
        int i;
        boolean z;
        Object[] objArr = {mutilReceiveCouponTip};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc7736d593e0d91bac92dc4f0dc19a96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc7736d593e0d91bac92dc4f0dc19a96");
            return;
        }
        super.a((ReceiveCouponTip) mutilReceiveCouponTip);
        if (mutilReceiveCouponTip.couponStatus == 0) {
            i = -1;
        } else if (mutilReceiveCouponTip.couponStatus == 1) {
            i = -40093;
        } else if (mutilReceiveCouponTip.couponStatus != 4) {
            return;
        } else {
            i = -6711404;
        }
        this.r.setTextColor(i);
        if (!com.sankuai.shangou.stone.util.t.a(mutilReceiveCouponTip.price)) {
            String str = mutilReceiveCouponTip.price;
            if (mutilReceiveCouponTip.showType == 1) {
                this.i.setVisibility(8);
                this.h.setVisibility(0);
                this.h.setText("¥");
            } else if (mutilReceiveCouponTip.showType == 2) {
                this.h.setVisibility(8);
                this.i.setVisibility(0);
                this.i.setText("折");
            }
            this.d.setVisibility(0);
            this.d.setText(str);
        } else {
            this.d.setVisibility(8);
        }
        Object[] objArr2 = {mutilReceiveCouponTip};
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93faaa659b86ea7d172a9711ba3fc597", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93faaa659b86ea7d172a9711ba3fc597")).booleanValue();
        } else {
            z = mutilReceiveCouponTip.multiCouponNum > 1 && com.sankuai.shangou.stone.util.a.a((List) mutilReceiveCouponTip.multiStepCouponList) > 1;
        }
        if (!z) {
            com.sankuai.shangou.stone.util.u.a(this.p);
            com.sankuai.shangou.stone.util.u.c(this.q);
            return;
        }
        com.sankuai.shangou.stone.util.u.a(this.r, mutilReceiveCouponTip.activityDesc);
        com.sankuai.shangou.stone.util.u.c(this.p);
        com.sankuai.shangou.stone.util.u.a(this.q);
    }

    private Map<String, Object> b(MutilReceiveCouponTip mutilReceiveCouponTip) {
        Object[] objArr = {mutilReceiveCouponTip};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4d1b77d7185a01e7d18aa2b0e7be9a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4d1b77d7185a01e7d18aa2b0e7be9a2");
        }
        Map<String, Object> b = super.b((ReceiveCouponTip) mutilReceiveCouponTip);
        b.put("coupon_id", b());
        return b;
    }

    private Map<String, Object> c(MutilReceiveCouponTip mutilReceiveCouponTip) {
        Object[] objArr = {mutilReceiveCouponTip};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2db7a126c43adb4521380823b2b8c0ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2db7a126c43adb4521380823b2b8c0ff");
        }
        Map<String, Object> c = super.c((ReceiveCouponTip) mutilReceiveCouponTip);
        c.put("coupon_id", b());
        return c;
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85e18fc7321f9600b64d8eaf0ca30e98", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85e18fc7321f9600b64d8eaf0ca30e98");
        }
        StringBuilder sb = new StringBuilder();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.u.multiStepCouponList)) {
            for (int i = 0; i < com.sankuai.shangou.stone.util.a.a((List) this.u.multiStepCouponList); i++) {
                Poi.PoiCouponItem poiCouponItem = (Poi.PoiCouponItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.u.multiStepCouponList, i);
                if (poiCouponItem != null) {
                    sb.append(poiCouponItem.mCouponId);
                    if (i != com.sankuai.shangou.stone.util.a.a((List) this.u.multiStepCouponList) - 1) {
                        sb.append(CommonConstant.Symbol.COMMA);
                    }
                }
            }
        }
        return sb.toString();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.m, android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa62363f81c0bb926850c1b32bca01a9", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa62363f81c0bb926850c1b32bca01a9");
        } else if (this.k != null && this.u != null) {
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = o;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5bdef56217124dce1429afdbd254e3c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5bdef56217124dce1429afdbd254e3c");
                } else if (this.mContext instanceof SCBaseActivity) {
                    final Dialog a = com.sankuai.waimai.store.util.d.a(this.mContext);
                    String w = ((SCBaseActivity) this.mContext).w();
                    ArrayList arrayList = new ArrayList();
                    for (Poi.PoiCouponItem poiCouponItem : this.u.multiStepCouponList) {
                        if (poiCouponItem != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("coupon_id", Long.valueOf(poiCouponItem.mCouponId));
                            hashMap.put("coupon_id_str", poiCouponItem.mCouponIdStr);
                            hashMap.put("activity_id", Long.valueOf(poiCouponItem.mActivityId));
                            hashMap.put("activity_id_str", poiCouponItem.mActivityIdStr);
                            hashMap.put("coupon_type", Integer.valueOf(poiCouponItem.mCouponType));
                            arrayList.add(hashMap);
                        }
                    }
                    com.sankuai.waimai.store.base.net.sg.a.a((Object) w).a(this.t.p().f(), this.t.p().h(), com.sankuai.waimai.store.util.i.a(arrayList), "inner_sd", a() ? "inner_sd_04" : "inner_sd_06", new com.sankuai.waimai.store.base.net.k<Map<String, MutliPoiCouponItem>>() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.n.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final /* synthetic */ void a(Object obj) {
                            Map map = (Map) obj;
                            Object[] objArr3 = {map};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "87a7351e17fd84410bbd6186e476491a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "87a7351e17fd84410bbd6186e476491a");
                                return;
                            }
                            super.a((AnonymousClass1) map);
                            com.sankuai.waimai.store.util.d.a(a);
                            if (map == null) {
                                am.a(n.this.mContext, "领取失败");
                                return;
                            }
                            ArrayList<MutliPoiCouponItem> arrayList2 = new ArrayList();
                            for (Map.Entry entry : map.entrySet()) {
                                if (entry != null) {
                                    arrayList2.add((MutliPoiCouponItem) entry.getValue());
                                }
                            }
                            if (com.sankuai.shangou.stone.util.a.a((List) arrayList2) == 1) {
                                n.a(n.this, (List) arrayList2, true);
                            } else if (com.sankuai.shangou.stone.util.a.a((List) arrayList2) > 1) {
                                n.a(n.this, (List) arrayList2, false);
                                boolean z = true;
                                boolean z2 = true;
                                for (MutliPoiCouponItem mutliPoiCouponItem : arrayList2) {
                                    if (mutliPoiCouponItem != null) {
                                        if (mutliPoiCouponItem.code != 0) {
                                            z = false;
                                        }
                                        if (!TextUtils.equals(mutliPoiCouponItem.msg, "券已领完或者活动已结束") || !TextUtils.equals(mutliPoiCouponItem.msg, "已抢光")) {
                                            z2 = false;
                                        }
                                    }
                                }
                                if (z) {
                                    com.sankuai.waimai.store.manager.coupon.c.a().a(arrayList2, n.this.k.tag, 1);
                                } else if (!z2) {
                                    am.a(n.this.mContext, "领取失败，请稍后再试");
                                } else {
                                    com.sankuai.waimai.store.manager.coupon.c.a().a(arrayList2, n.this.k.tag, 4);
                                }
                            }
                        }

                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                            Object[] objArr3 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9dc8940883d68126d8a226de6eb946c3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9dc8940883d68126d8a226de6eb946c3");
                                return;
                            }
                            super.a(bVar);
                            com.sankuai.waimai.store.util.d.a(a);
                            String message = bVar.getMessage();
                            if (TextUtils.isEmpty(message)) {
                                message = n.this.mContext.getString(R.string.wm_sc_coupon_receive_failed);
                            }
                            am.a(n.this.mContext, message);
                        }
                    });
                }
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
            com.sankuai.waimai.store.manager.judas.b.a(this.mContext, a() ? m.a.f : (this.j == null || this.j.type != 25) ? m.a.b : m.a.d).b((this.j == null || this.j.type != 25) ? b(this.u) : c(this.u)).a();
        }
    }
}
