package com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.q;
import com.sankuai.waimai.foundation.utils.r;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c, C0923a, com.sankuai.waimai.bussiness.order.detailnew.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cfe83a5db4d692f6a390fc0e16a6731", RobustBitConfig.DEFAULT_VALUE) ? (C0923a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cfe83a5db4d692f6a390fc0e16a6731") : new C0923a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d98e30a852c8f1e3699e909c18316d55", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d98e30a852c8f1e3699e909c18316d55") : new com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c(m(), this.h, ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).u.a().b);
    }

    public a(com.sankuai.waimai.bussiness.order.detailnew.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d3b1902649d5ee9543aeef90d9135a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d3b1902649d5ee9543aeef90d9135a7");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abcd2947d73fc550ffac4f6cfe1b8109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abcd2947d73fc550ffac4f6cfe1b8109");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).X.a(new com.meituan.android.cube.pga.action.b<i.c<Float, Boolean>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.c<Float, Boolean> cVar) {
                i.c<Float, Boolean> cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9819b9cf114fa129bd8ce4c9f247a343", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9819b9cf114fa129bd8ce4c9f247a343");
                } else if (cVar2 != null) {
                    com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c cVar3 = (com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c) a.this.g;
                    float floatValue = cVar2.c.floatValue();
                    boolean booleanValue = cVar2.d.booleanValue();
                    Object[] objArr3 = {Float.valueOf(floatValue), Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.d;
                    if (PatchProxy.isSupport(objArr3, cVar3, changeQuickRedirect3, false, "4200a455d5b4f6a8ef4469d7f5297bb1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar3, changeQuickRedirect3, false, "4200a455d5b4f6a8ef4469d7f5297bb1");
                        return;
                    }
                    if (booleanValue && cVar3.j != null && cVar3.j.getVisibility() == 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cVar3.j.getLayoutParams();
                        marginLayoutParams.rightMargin = (int) (cVar3.l + ((cVar3.k - cVar3.l) * floatValue));
                        cVar3.j.setLayoutParams(marginLayoutParams);
                    }
                    float f = 1.0f - floatValue;
                    cVar3.h.setAlpha(f);
                    cVar3.g.setAlpha(f);
                    cVar3.i.setAlpha(f);
                    cVar3.f.setAlpha(f);
                    if (Float.compare(floatValue, 0.9f) > 0) {
                        cVar3.f.setClickable(false);
                    } else {
                        cVar3.f.setClickable(true);
                    }
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).ac.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                int i = 0;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "769e185344ed58122b7b331dfcfeed5f", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "769e185344ed58122b7b331dfcfeed5f");
                }
                com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c cVar = (com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c) a.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.d;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "1d62d9f6023712c3260da913c195af03", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "1d62d9f6023712c3260da913c195af03")).intValue();
                } else if (cVar.e != null) {
                    i = cVar.e.getBottom();
                }
                return Integer.valueOf(i);
            }
        };
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).ar.b = new com.meituan.android.cube.pga.action.d<Integer>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.a.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Integer a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a31cadbd4fdf0be4c1c5bbd9820be483", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a31cadbd4fdf0be4c1c5bbd9820be483") : Integer.valueOf(((com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c) a.this.g).a().getHeight());
            }
        };
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).i.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.a.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91a23f354e38c83dbf0a589b20ed4dba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91a23f354e38c83dbf0a589b20ed4dba");
                } else if (bool2.booleanValue()) {
                    com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c cVar = (com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c) a.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.d;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "1beac6e063a2488fcd3c2e06c90dc57f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "1beac6e063a2488fcd3c2e06c90dc57f");
                    } else {
                        cVar.e();
                    }
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).l.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.a.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e95d217485c874084919033a526901f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e95d217485c874084919033a526901f3");
                } else if (bool2.booleanValue()) {
                    com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c cVar = (com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c) a.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.d;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "95c90c73997e4f13c7b0626cd215e112", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "95c90c73997e4f13c7b0626cd215e112");
                    } else if (cVar.m == null || cVar.m.isUnsubscribed()) {
                    } else {
                        cVar.m.unsubscribe();
                    }
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).as.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.a.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "000782497ae4a304cebd2ddad7bde953", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "000782497ae4a304cebd2ddad7bde953");
                    return;
                }
                com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c cVar = (com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c) a.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.d;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "c4276e75953abab500227639971fd523", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "c4276e75953abab500227639971fd523");
                } else if (cVar.j == null || cVar.j.getVisibility() != 0) {
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cVar.j.getLayoutParams();
                    marginLayoutParams.rightMargin = cVar.l;
                    cVar.j.setLayoutParams(marginLayoutParams);
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9017f9f905c4bd9a4112de0eeddc9c92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9017f9f905c4bd9a4112de0eeddc9c92");
            return;
        }
        super.I();
        ((com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c) this.g).n = ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).A.a();
        ((com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c) this.g).o = ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).aq;
        ((com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c) this.g).a(((C0923a) this.n).p);
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31506d77281df9d2803d3ce66ca52bc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31506d77281df9d2803d3ce66ca52bc3");
            return;
        }
        super.bE_();
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c cVar = (com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c) this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "a5e82fd15f693a958ddb85d28b4c4377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "a5e82fd15f693a958ddb85d28b4c4377");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.c.d;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "cd98944c39dfdf496679b71c7c71932e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "cd98944c39dfdf496679b71c7c71932e");
        } else {
            com.sankuai.waimai.business.im.api.msgcenter.a.a().unregisterMsgCenterUnreadChangeListener(cVar);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0923a extends com.meituan.android.cube.pga.viewmodel.a<Map<String, Object>> {
        public static ChangeQuickRedirect o;
        @NonNull
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.b p;

        public C0923a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0c8638fc880d85fea3e71ab080ae84a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0c8638fc880d85fea3e71ab080ae84a");
            } else {
                this.p = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.b();
            }
        }

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final void d() {
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.b bVar;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30200c714f23b2e5b6abf788352a401f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30200c714f23b2e5b6abf788352a401f");
                return;
            }
            super.d();
            if (this.c != 0) {
                Map map = (Map) this.c;
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.b.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5403ff7f17f6ac3c1c035a83be489608", RobustBitConfig.DEFAULT_VALUE)) {
                    bVar = (com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5403ff7f17f6ac3c1c035a83be489608");
                } else {
                    com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.b bVar2 = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.b();
                    bVar2.b = String.valueOf(map.get("id"));
                    StringBuilder sb = new StringBuilder();
                    sb.append(map.get("wm_poi_id"));
                    bVar2.d = r.a(sb.toString(), 0L);
                    bVar2.e = String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(map.get("business_type"));
                    bVar2.c = r.a(sb2.toString(), 0);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(map.get("biz_type"));
                    bVar2.g = r.a(sb3.toString(), 0);
                    bVar2.h = true;
                    bVar2.p = (q) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(String.valueOf(map.get("tracking_info")), (Class<Object>) q.class);
                    Map map2 = (Map) map.get("order_common_info");
                    if (map2 != null) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(map2.get("status_code"));
                        bVar2.m = r.a(sb4.toString(), 0);
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(map2.get("weather_type"));
                        bVar2.l = r.a(sb5.toString(), 0);
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(map2.get("rider_delivery_code"));
                        bVar2.n = r.a(sb6.toString(), 0);
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(map2.get("poi_prepare_code"));
                        bVar2.o = r.a(sb7.toString(), 0);
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(map2.get("order_status"));
                        bVar2.f = r.a(sb8.toString(), 0);
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(map2.get("pay_status"));
                        bVar2.i = r.a(sb9.toString(), 0);
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(map2.get("delivery_type"));
                        bVar2.k = r.a(sb10.toString(), 0);
                        bVar2.j = String.valueOf(map2.get("expected_arrival_time"));
                    }
                    bVar2.q = (List) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(map.get("navigate_bar")), new TypeToken<List<com.sankuai.waimai.bussiness.order.detailnew.network.response.h>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.actionbar.b.1
                    }.getType());
                    bVar = bVar2;
                }
                this.p = bVar;
            }
        }
    }
}
