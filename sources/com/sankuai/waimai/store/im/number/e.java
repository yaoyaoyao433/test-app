package com.sankuai.waimai.store.im.number;

import android.support.annotation.NonNull;
import android.util.LongSparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiSimpleResultResponse;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements d.InterfaceC0965d {
    public static ChangeQuickRedirect a;
    private static final LongSparseArray<Integer> d = new LongSparseArray<>();
    private com.sankuai.waimai.store.base.d<Integer> b;
    private LongSparseArray<Integer> c;
    private String e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public static /* synthetic */ void a(e eVar, String str, PoiSimpleResultResponse poiSimpleResultResponse) {
        int i;
        Object[] objArr = {str, poiSimpleResultResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "2dd186ac0e15aca101ee777209e8795a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "2dd186ac0e15aca101ee777209e8795a");
            return;
        }
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        int a2 = com.sankuai.shangou.stone.util.a.a((List) poiSimpleResultResponse.poiSimpleList);
        if (split == null || split.length != a2) {
            com.dianping.judas.util.a.b("api return poiIds not match args,api must handle it", new Object[0]);
            i = 0;
        } else {
            i = 0;
            for (int i2 = 0; i2 < a2; i2++) {
                PoiSimpleResultResponse.PoiSimpleListResultEntity poiSimpleListResultEntity = poiSimpleResultResponse.poiSimpleList.get(i2);
                if (poiSimpleListResultEntity != null) {
                    long a3 = r.a(split[i2], -1L);
                    int localBizType = poiSimpleListResultEntity.getLocalBizType();
                    if (a3 != -1) {
                        d.put(a3, Integer.valueOf(localBizType));
                        if (localBizType == 1 && eVar.c.get(a3) != null) {
                            i += eVar.c.get(a3).intValue();
                        }
                    }
                }
            }
        }
        eVar.j = i;
    }

    public static /* synthetic */ void a(e eVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "7cf865eb2e85407af4ec98f45d8fbd22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "7cf865eb2e85407af4ec98f45d8fbd22");
            return;
        }
        eVar.c.clear();
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            com.sankuai.xm.im.session.entry.a aVar = (com.sankuai.xm.im.session.entry.a) it.next();
            if (aVar != null && aVar.d > 0 && aVar.b != null) {
                try {
                    JSONObject jSONObject = new JSONObject(aVar.b.getExtension());
                    if (jSONObject.has("poiType")) {
                        if (jSONObject.optInt("poiType", -1) == 1) {
                            i += aVar.d;
                        }
                    } else {
                        long optLong = jSONObject.optLong("poi_id", -1L);
                        if (optLong == -1) {
                            optLong = jSONObject.optLong("poiID", -1L);
                        }
                        if (optLong != -1) {
                            if (d.indexOfKey(optLong) >= 0) {
                                if (d.get(optLong).intValue() == 1) {
                                    i += aVar.d;
                                }
                            } else {
                                eVar.c.put(optLong, Integer.valueOf(aVar.d));
                                sb.append(optLong);
                                sb.append(CommonConstant.Symbol.COMMA);
                            }
                        }
                    }
                } catch (Exception e) {
                    com.dianping.judas.util.a.a(e);
                }
            }
        }
        eVar.i = i;
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            final String sb2 = sb.toString();
            Object[] objArr2 = {sb2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "17dce18d6fb1401f125238606ba6b87a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "17dce18d6fb1401f125238606ba6b87a");
                return;
            } else {
                com.sankuai.waimai.store.im.base.net.d.a(eVar.e).a(sb2, new k<PoiSimpleResultResponse>() { // from class: com.sankuai.waimai.store.im.number.e.5
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(@NonNull Object obj) {
                        PoiSimpleResultResponse poiSimpleResultResponse = (PoiSimpleResultResponse) obj;
                        Object[] objArr3 = {poiSimpleResultResponse};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7eaec699d310d851b27e519e82d8f54b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7eaec699d310d851b27e519e82d8f54b");
                        } else if (com.sankuai.shangou.stone.util.a.b(poiSimpleResultResponse.poiSimpleList)) {
                        } else {
                            e.a(e.this, sb2, poiSimpleResultResponse);
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                    public final void b() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7ee015dd643a5e10756362cfd135e8f6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7ee015dd643a5e10756362cfd135e8f6");
                        } else {
                            e.this.c();
                        }
                    }
                });
                return;
            }
        }
        eVar.c();
    }

    public e(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9e937dd34008f4e7d4c7027d2864626", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9e937dd34008f4e7d4c7027d2864626");
            return;
        }
        this.c = new LongSparseArray<>();
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.e = str;
    }

    public final void a(com.sankuai.waimai.store.base.d<Integer> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a6364a881fbf659ab0ae237a781941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a6364a881fbf659ab0ae237a781941");
            return;
        }
        this.b = dVar;
        com.sankuai.waimai.imbase.manager.b.a().a((short) 1001, (d.InterfaceC0965d) this);
        com.sankuai.waimai.imbase.manager.b.a().a((short) 1024, (d.InterfaceC0965d) this);
        com.sankuai.waimai.imbase.manager.b.a().a((short) 1031, (d.InterfaceC0965d) this);
        com.sankuai.waimai.imbase.manager.b.a().a((short) 1034, (d.InterfaceC0965d) this);
    }

    @Override // com.sankuai.waimai.imbase.manager.d.InterfaceC0965d
    public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96ad1c1e89048a1f6c24c6e2f5d34d43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96ad1c1e89048a1f6c24c6e2f5d34d43");
        } else {
            d();
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d.InterfaceC0965d
    public final void b(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58dad336d9d77b73066917d9d0dbdc14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58dad336d9d77b73066917d9d0dbdc14");
        } else {
            d();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c73ea6f03aa0ef31e0f27a762c4cf642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c73ea6f03aa0ef31e0f27a762c4cf642");
        } else {
            d();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3d0e2eaeda3189888b6d5bd90709e46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3d0e2eaeda3189888b6d5bd90709e46");
            return;
        }
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fba4435109cdd7e969e07c836671a0e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fba4435109cdd7e969e07c836671a0e7");
        } else if (this.b != null) {
            this.b.a(Integer.valueOf(this.f + this.g + this.h + this.i + this.j));
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd8ce5a66b10884ce2c1754ce73bb503", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd8ce5a66b10884ce2c1754ce73bb503");
            return;
        }
        b();
        com.sankuai.waimai.imbase.manager.b.a().a((short) 1024, new d.a() { // from class: com.sankuai.waimai.store.im.number.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.manager.d.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dda04622a97b4fd86285df136c2dfa84", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dda04622a97b4fd86285df136c2dfa84");
                    return;
                }
                e.this.f = i;
                e.this.c();
            }
        });
        com.sankuai.waimai.imbase.manager.b.a().a((short) 1031, new d.a() { // from class: com.sankuai.waimai.store.im.number.e.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.manager.d.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "128a1445b76adc0acc0d5bb29ce7b9a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "128a1445b76adc0acc0d5bb29ce7b9a1");
                    return;
                }
                e.this.g = i;
                e.this.c();
            }
        });
        com.sankuai.waimai.imbase.manager.b.a().a((short) 1034, new d.a() { // from class: com.sankuai.waimai.store.im.number.e.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.manager.d.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a207088c70e9561fc38853cb5134eb33", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a207088c70e9561fc38853cb5134eb33");
                    return;
                }
                e.this.h = i;
                e.this.c();
            }
        });
        com.sankuai.waimai.imbase.manager.b.a().a((short) 1001, new d.c() { // from class: com.sankuai.waimai.store.im.number.e.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.manager.d.c
            public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f60d5a234a0cf087c5910bcf4b83c1d0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f60d5a234a0cf087c5910bcf4b83c1d0");
                } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                    e.a(e.this, list);
                }
            }
        });
    }
}
