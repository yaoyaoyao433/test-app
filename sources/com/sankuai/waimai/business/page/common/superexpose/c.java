package com.sankuai.waimai.business.page.common.superexpose;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.pouch.unionanim.UnionAnimReporter;
import com.sankuai.waimai.pouch.unionanim.d;
import com.sankuai.waimai.pouch.unionanim.e;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static c n;
    public e b;
    public e c;
    public String d;
    public String e;
    public com.sankuai.waimai.pouch.unionanim.b f;
    public boolean g;
    public AtomicInteger h;
    public boolean i;
    public a j;
    public boolean k;
    public String l;
    public String m;
    private UnionAnimReporter o;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98a69d7cd6bdd3cefb994e879e2e4e82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98a69d7cd6bdd3cefb994e879e2e4e82");
            return;
        }
        this.g = false;
        this.h = new AtomicInteger(0);
        this.k = false;
        this.l = null;
        this.m = null;
        this.b = new e();
        this.c = new e();
        this.c.a(new d.a() { // from class: com.sankuai.waimai.business.page.common.superexpose.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.pouch.unionanim.d.a
            public final void a(@NonNull d dVar) {
            }

            @Override // com.sankuai.waimai.pouch.unionanim.d.a
            public final void c(@NonNull d dVar) {
            }

            @Override // com.sankuai.waimai.pouch.unionanim.d.a
            public final void b(@NonNull d dVar) {
                Object[] objArr2 = {dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62471a2b06985dd668d552c69e254a86", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62471a2b06985dd668d552c69e254a86");
                } else if (c.this.f != null) {
                    com.sankuai.waimai.pouch.unionanim.b unused = c.this.f;
                }
            }
        });
        this.j = new a();
        this.o = new UnionAnimReporter() { // from class: com.sankuai.waimai.business.page.common.superexpose.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.pouch.unionanim.UnionAnimReporter
            public final void a(int i, @Nullable Map<String, Object> map) {
                Object[] objArr2 = {Integer.valueOf(i), map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4759edcb73a493b40d6625c5d8802bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4759edcb73a493b40d6625c5d8802bd");
                } else if (i == 8) {
                    if (map == null || map.isEmpty()) {
                        return;
                    }
                    JudasManualManager.b("b_waimai_1q1bgljk_mv").a(map).a("c_m84bv26").a();
                } else {
                    switch (i) {
                        case 3:
                            JudasManualManager.b("b_waimai_bqh2yarl_mv").a("c_m84bv26").a();
                            return;
                        case 4:
                            JudasManualManager.b("b_waimai_c9ek3u97_mv").a("c_m84bv26").a();
                            return;
                        default:
                            return;
                    }
                }
            }
        };
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f91c95fe73a8f985a6d5b0352c6a9f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f91c95fe73a8f985a6d5b0352c6a9f5");
        }
        if (n == null) {
            synchronized (c.class) {
                if (n == null) {
                    n = new c();
                }
            }
        }
        return n;
    }

    public final boolean b() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b2e79d13dea1d281a9656b4937ff315", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b2e79d13dea1d281a9656b4937ff315")).booleanValue();
        }
        if (!this.g) {
            e eVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "23e2b1056a748853f30469c8d5c5f3ae", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "23e2b1056a748853f30469c8d5c5f3ae")).booleanValue();
            } else {
                z = eVar.i != null && eVar.i.b();
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a62c43cbc9ee66ebb31d42fa2e9647d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a62c43cbc9ee66ebb31d42fa2e9647d3")).booleanValue();
        }
        e eVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "50b7e3e28e45d94bedd75b49cb78256a", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "50b7e3e28e45d94bedd75b49cb78256a")).booleanValue();
        } else {
            z = eVar.f.size() > 0;
        }
        if (!z) {
            a(1);
            return false;
        } else if (this.b.d) {
            a(2);
            return false;
        } else if (!a().k) {
            a(3);
            return false;
        } else if (this.b.a()) {
            if (this.f != null) {
                this.g = this.f.a();
                return this.g;
            }
            return this.b.c();
        } else {
            return false;
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16143d856d7c56cf5b587948e41a1cb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16143d856d7c56cf5b587948e41a1cb9");
        } else {
            a(i, null);
        }
    }

    public final void a(int i, @Nullable Map<String, Object> map) {
        Object[] objArr = {Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e82e9796c6246dbcb3c80ac1bc426f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e82e9796c6246dbcb3c80ac1bc426f");
            return;
        }
        if (this.o != null) {
            this.o.a(i, map);
        }
        switch (i) {
            case 1:
                com.sankuai.waimai.pouch.monitor.c.a(0, "biz_animation_heaven_fall_linkage_count_is_zero", this.l, true);
                break;
            case 2:
                com.sankuai.waimai.pouch.monitor.c.a(0, "heaven_fall_exception_multiple_target_key", this.l, true);
                break;
            case 3:
                com.sankuai.waimai.pouch.monitor.c.a(0, "biz_condition_platinum_not_in_screen", this.l);
                break;
            case 4:
                com.sankuai.waimai.pouch.monitor.c.a(0, "biz_condition_feed_list_scrolled_before", this.l);
                break;
            case 5:
                com.sankuai.waimai.pouch.monitor.c.a(0, "biz_condition_platinum_hidden", this.l);
                break;
            case 6:
                com.sankuai.waimai.pouch.monitor.c.a(0, "biz_condition_platinum_single_frame", this.l);
                break;
            case 7:
                com.sankuai.waimai.pouch.monitor.c.a(0, "biz_animation_platinum_template_is_not_linkage", this.l);
                break;
            case 8:
                StringBuilder sb = new StringBuilder();
                sb.append("poi_id_list:");
                sb.append(this.d);
                sb.append(CommonConstant.Symbol.COMMA);
                sb.append(this.e);
                if (this.l != null) {
                    sb.append(";platinumTempID:");
                    sb.append(this.l);
                }
                if (this.m != null) {
                    sb.append(";platinumTempVersion:");
                    sb.append(this.m);
                }
                com.sankuai.waimai.pouch.monitor.c.a(0, "biz_condition_poi_id_diff", this.l, true, sb.toString());
                break;
            case 9:
                com.sankuai.waimai.pouch.monitor.c.a(0, "platinum_exception_multiple_target_key", this.l, true);
                break;
            case 10:
                com.sankuai.waimai.pouch.monitor.c.a(0, "biz_animation_intersect_number_is_zero", this.l);
                break;
        }
        this.g = false;
    }

    public final void d() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efd9c6ce2b154dffaec68a8a1bcceb37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efd9c6ce2b154dffaec68a8a1bcceb37");
            return;
        }
        int decrementAndGet = this.h.decrementAndGet();
        com.sankuai.waimai.foundation.utils.log.a.b("WMUnionTransition", "decremented:%s", Integer.valueOf(decrementAndGet));
        if (decrementAndGet == 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d735532b8261d23cfe3fb3cdc360d342", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d735532b8261d23cfe3fb3cdc360d342");
                return;
            }
            this.b.c();
            e eVar = this.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "e7e5a35ab541b687238444b3416c50c3", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "e7e5a35ab541b687238444b3416c50c3")).booleanValue();
            } else {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = e.a;
                if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "8ba33168009087863323c2abd1631bc3", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "8ba33168009087863323c2abd1631bc3")).booleanValue();
                } else {
                    z = ((eVar.b && eVar.c && eVar.f.size() > 0) || (eVar.b && eVar.h.size() > 0)) && eVar.a();
                }
                if (z) {
                    eVar.c();
                }
            }
            this.g = false;
        }
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a79a8a226ce75bf667753583a15777f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a79a8a226ce75bf667753583a15777f");
        }
        String a2 = com.sankuai.waimai.ad.superexpose.a.a();
        String str = com.sankuai.waimai.ad.superexpose.a.c;
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", str);
            JudasManualManager.b("b_waimai_tplr3ifr_mv").a("c_m84bv26").a((Map<String, Object>) hashMap).a();
        }
        return a2;
    }

    public final void a(@NonNull com.sankuai.waimai.pouch.unionanim.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "198669d8c637cd61a95022d295fb915d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "198669d8c637cd61a95022d295fb915d");
            return;
        }
        final e eVar = this.b;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "52f30d16ba341aad8629559bdcf1d219", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "52f30d16ba341aad8629559bdcf1d219");
        } else if (eVar.k.contains(aVar)) {
        } else {
            eVar.k.add(aVar);
            if (eVar.k.size() > 1) {
                Collections.sort(eVar.k, new Comparator<com.sankuai.waimai.pouch.unionanim.a>() { // from class: com.sankuai.waimai.pouch.unionanim.e.1
                    public static ChangeQuickRedirect a;

                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(a aVar2, a aVar3) {
                        a aVar4 = aVar2;
                        a aVar5 = aVar3;
                        Object[] objArr3 = {aVar4, aVar5};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f22e6ae83872dfd1469238dd4a091647", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f22e6ae83872dfd1469238dd4a091647")).intValue();
                        }
                        if (aVar4 == null && aVar5 == null) {
                            return 0;
                        }
                        if (aVar4 == null) {
                            return -1;
                        }
                        if (aVar5 == null) {
                            return 1;
                        }
                        return aVar4.b() - aVar5.b();
                    }
                });
            }
        }
    }

    public final void b(@NonNull com.sankuai.waimai.pouch.unionanim.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c98833d75a3dcd879c2f57d42fbb53e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c98833d75a3dcd879c2f57d42fbb53e3");
            return;
        }
        e eVar = this.b;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "91e50799dfb1c4944c653a401040eead", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "91e50799dfb1c4944c653a401040eead");
        } else if (aVar != null) {
            eVar.k.remove(aVar);
        }
    }
}
