package com.sankuai.waimai.store.poi.list.newp.presenter;

import android.os.Build;
import com.google.gson.reflect.TypeToken;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.poi.list.model.e;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.monitor.monitor.SGAPIBusinessSuccessRate;
import com.sankuai.waimai.store.util.monitor.monitor.SGParseAll;
import com.sankuai.waimai.store.util.monitor.monitor.SGRequestAll;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.poi.list.newp.contract.b b;
    public PoiVerticalityDataResponse c;
    public com.sankuai.waimai.store.param.a d;
    public boolean e;
    public com.sankuai.waimai.store.poi.list.model.c f;
    public int g;
    public boolean h;
    private e i;

    public static /* synthetic */ void a(c cVar, String str, PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {str, poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "ca0c0e307c6b3e4324155eeaf1c852b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "ca0c0e307c6b3e4324155eeaf1c852b4");
        } else if (o.j() && cVar.d != null && poiVerticalityDataResponse != null && !com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.poiCardInfos)) {
            ArrayList arrayList = (ArrayList) j.h().a(SCConfigPath.EXPOSE_TARGET_MODULE, new TypeToken<List<Map<String, String>>>() { // from class: com.sankuai.waimai.store.poi.list.newp.presenter.c.3
            }.getType(), new ArrayList());
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                return;
            }
            List<PoiCardInfo> list = poiVerticalityDataResponse.poiCardInfos;
            for (int i = 0; i < com.sankuai.shangou.stone.util.a.c(list); i++) {
                PoiCardInfo poiCardInfo = (PoiCardInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
                if (poiCardInfo != null && poiCardInfo.moduleDesc != null && !t.a(poiCardInfo.moduleDesc.templateId)) {
                    String str2 = poiCardInfo.moduleDesc.templateId;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        Map map = (Map) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, i2);
                        if (map != null && map.get("templateID") != null && ((String) map.get("templateID")).equals(str2)) {
                            com.sankuai.waimai.store.util.monitor.b.a().a(SGParseAll.SGParseAll).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(cVar.d.c)).a("module_name", str2).a("interface_name", str).a();
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(c cVar, String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "72dc4f39d2f83da6d7bef6b1ff904156", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "72dc4f39d2f83da6d7bef6b1ff904156");
        } else if (!o.j() || com.meituan.android.singleton.b.a == null || cVar.d == null) {
        } else {
            com.sankuai.waimai.store.util.monitor.b.a().a(SGAPIBusinessSuccessRate.SGAPIBusinessSuccessRate).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(cVar.d.c)).a("interface_name", str).a(NetLogConstants.Tags.NETWORK_TYPE, p.b(com.meituan.android.singleton.b.a)).a("device_type", Build.MODEL).a(z).a();
        }
    }

    public c(com.sankuai.waimai.store.poi.list.newp.contract.b bVar, com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.poi.list.model.c cVar) {
        Object[] objArr = {bVar, aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4243f3ae3f79b77fa059e6198ec3084", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4243f3ae3f79b77fa059e6198ec3084");
            return;
        }
        this.e = false;
        this.i = new e();
        this.g = -1;
        this.b = bVar;
        this.d = aVar;
        this.f = cVar;
    }

    private String d() {
        if (this.f != null) {
            return this.f.e;
        }
        return null;
    }

    private String e() {
        if (this.c != null) {
            return this.c.extraParam;
        }
        return null;
    }

    public void a(com.sankuai.waimai.store.param.a aVar, boolean z, boolean z2) {
        Object[] objArr = {aVar, (byte) 0, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc0d8cbfef23b7db37e8ed828cf2c801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc0d8cbfef23b7db37e8ed828cf2c801");
            return;
        }
        this.b.a(aVar, false);
        this.e = true;
        if ((this.b.a() == 3 || this.b.a() == 1 || this.b.a() == 2) && aVar.b > 0 && (this.b.a() != 1 || aVar.K != 3)) {
            a(aVar, false);
        } else {
            a(aVar, false, true, aVar.f);
        }
        Object[] objArr2 = {"v9/poi/supermarket/channelpage"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23c8f4f1da4d8d53cc77ca7d7fdd9f8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23c8f4f1da4d8d53cc77ca7d7fdd9f8e");
        } else if (!o.j() || this.d == null) {
        } else {
            com.sankuai.waimai.store.util.monitor.b.a().a(SGRequestAll.SGRequestAll).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(this.d.c)).a("interface_name", "v9/poi/supermarket/channelpage").a();
        }
    }

    private void a(final com.sankuai.waimai.store.param.a aVar, final boolean z, boolean z2, final String str) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaddb8d92a3e69e1e2ec0d668734bad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaddb8d92a3e69e1e2ec0d668734bad6");
        } else {
            this.i.a(this.b.b(), aVar, z, this.b.c(), this.b.d(), this.b.f(), this.b.g(), z2, e(), d(), new e.b() { // from class: com.sankuai.waimai.store.poi.list.newp.presenter.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.poi.list.model.e.b, com.sankuai.waimai.store.poi.list.model.e.a
                public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
                    boolean z3 = true;
                    Object[] objArr2 = {poiVerticalityDataResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b04b4c1c81e9b09ad293df605e156f7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b04b4c1c81e9b09ad293df605e156f7");
                        return;
                    }
                    c.this.e = false;
                    c.this.c = poiVerticalityDataResponse;
                    c.this.c.isShelfToFeed = c.this.h;
                    c cVar = c.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "279d22a55304373cc62e5f1cf1e87056", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "279d22a55304373cc62e5f1cf1e87056");
                    } else if (cVar.d.K == 1) {
                        cVar.a();
                    } else {
                        cVar.d.u = cVar.c.hasNextPage;
                    }
                    if (c.this.c.judasField != null && c.this.c.judasField.rankTraceId != null) {
                        if (!t.a(c.this.d.f) && c.this.d.f.equals(str)) {
                            c.this.d.k = c.this.c.judasField.rankTraceId;
                        }
                        c.this.d.l.put(str, c.this.c.judasField.rankTraceId);
                    }
                    c.this.b.a(c.this.c, aVar, z);
                    c.a(c.this, "v9/poi/supermarket/channelpage", true);
                    c.a(c.this, "v9/poi/supermarket/channelpage", poiVerticalityDataResponse);
                    c.this.d.bz = (poiVerticalityDataResponse == null || com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.poiCardInfos)) ? false : false;
                }

                @Override // com.sankuai.waimai.store.poi.list.model.e.b, com.sankuai.waimai.store.poi.list.model.e.a
                public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse, com.sankuai.waimai.store.repository.net.b bVar) {
                    boolean z3 = false;
                    Object[] objArr2 = {poiVerticalityDataResponse, bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d809115d283cf87ce5cf63253e3d237", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d809115d283cf87ce5cf63253e3d237");
                        return;
                    }
                    c.this.e = false;
                    c.this.c = poiVerticalityDataResponse;
                    c.this.b.a("", z, false, bVar);
                    c.a(c.this, "v9/poi/supermarket/channelpage", true);
                    c.a(c.this, "v9/poi/supermarket/channelpage", poiVerticalityDataResponse);
                    com.sankuai.waimai.store.param.a aVar2 = c.this.d;
                    if (poiVerticalityDataResponse != null && !com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.poiCardInfos)) {
                        z3 = true;
                    }
                    aVar2.bz = z3;
                }

                @Override // com.sankuai.waimai.store.poi.list.model.e.b, com.sankuai.waimai.store.poi.list.model.e.a
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    boolean z3 = true;
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "881b692ebc47a0a46630f50530c20b95", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "881b692ebc47a0a46630f50530c20b95");
                        return;
                    }
                    c.this.e = false;
                    c.this.b.a(bVar == null ? "" : bVar.b, z, (bVar == null || !bVar.a()) ? false : false, bVar);
                    c.a(c.this, "v9/poi/supermarket/channelpage", false);
                }
            });
        }
    }

    private void a(final com.sankuai.waimai.store.param.a aVar, final boolean z) {
        boolean z2;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "577f931382d8bdc91e0f16e326da8929", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "577f931382d8bdc91e0f16e326da8929");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35fd05d8023d1331f0052719dd22ffe3", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35fd05d8023d1331f0052719dd22ffe3")).booleanValue();
        } else {
            z2 = this.c == null || com.sankuai.shangou.stone.util.a.b(this.c.poiCardInfos) || com.sankuai.shangou.stone.util.a.b(this.c.allSortedSpuIds);
        }
        if (z2) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str = this.c.lastRenderId;
        List<String> list = this.c.allSortedSpuIds;
        int size = list.size();
        int indexOf = list.indexOf(str);
        if (indexOf < 0 || indexOf >= size - 1) {
            this.d.u = false;
            return;
        }
        sb.append("[");
        int i = indexOf + 1;
        for (int i2 = i; i2 < size && i2 < indexOf + 20 + 1; i2++) {
            if (i2 > i) {
                sb.append(CommonConstant.Symbol.COMMA);
            }
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
            sb.append(list.get(i2));
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        String a2 = this.d.a(this.c);
        final e eVar = this.i;
        String b = this.b.b();
        String sb2 = sb.toString();
        long j = this.d.c;
        String str2 = this.d.f;
        boolean g = this.d.g();
        final e.b bVar = new e.b() { // from class: com.sankuai.waimai.store.poi.list.newp.presenter.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poi.list.model.e.b, com.sankuai.waimai.store.poi.list.model.e.a
            public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
                boolean z3 = true;
                Object[] objArr3 = {poiVerticalityDataResponse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b10cc5b2c9aa8d785d78e9df5171630a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b10cc5b2c9aa8d785d78e9df5171630a");
                    return;
                }
                c.this.e = false;
                if (c.this.c == null) {
                    c.this.c = poiVerticalityDataResponse;
                }
                c.this.c.spuList = poiVerticalityDataResponse.spuList;
                c.this.c.poiCardInfos = poiVerticalityDataResponse.poiCardInfos;
                c.this.c.lastRenderId = poiVerticalityDataResponse.lastRenderId;
                c.this.a();
                c.this.b.a(c.this.c, aVar, z);
                c.a(c.this, "v9/poi/supermarket/channelpage", true);
                c.a(c.this, "v9/poi/supermarket/channelpage", poiVerticalityDataResponse);
                c.this.d.bz = (poiVerticalityDataResponse == null || com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.poiCardInfos)) ? false : false;
            }

            @Override // com.sankuai.waimai.store.poi.list.model.e.b, com.sankuai.waimai.store.poi.list.model.e.a
            public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse, com.sankuai.waimai.store.repository.net.b bVar2) {
                boolean z3 = false;
                Object[] objArr3 = {poiVerticalityDataResponse, bVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b8d5171f3a8ee9b29c26f74071626f6c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b8d5171f3a8ee9b29c26f74071626f6c");
                    return;
                }
                c.a(c.this, "v9/poi/supermarket/channelpage", true);
                c.a(c.this, "v9/poi/supermarket/channelpage", poiVerticalityDataResponse);
                com.sankuai.waimai.store.param.a aVar2 = c.this.d;
                if (poiVerticalityDataResponse != null && !com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.poiCardInfos)) {
                    z3 = true;
                }
                aVar2.bz = z3;
            }

            @Override // com.sankuai.waimai.store.poi.list.model.e.b, com.sankuai.waimai.store.poi.list.model.e.a
            public final void a(com.sankuai.waimai.store.repository.net.b bVar2) {
                boolean z3 = true;
                Object[] objArr3 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "15c35f1228f5264dd809f4dd5d74a3a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "15c35f1228f5264dd809f4dd5d74a3a9");
                    return;
                }
                c.this.e = false;
                z3 = (bVar2 == null || !bVar2.a()) ? false : false;
                c.this.b.a((bVar2 == null || z3) ? "" : bVar2.b, z, z3, bVar2);
                c.a(c.this, "v9/poi/supermarket/channelpage", false);
            }
        };
        Object[] objArr3 = {b, sb2, new Long(j), str2, a2, Byte.valueOf(g ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "fed4fdfe497d5de429f64faf88269bd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "fed4fdfe497d5de429f64faf88269bd7");
        } else if (!eVar.b) {
            eVar.b = true;
            com.sankuai.waimai.store.base.net.sg.a.a((Object) b).a(sb2, j, str2, a2, new k<PoiVerticalityDataResponse>() { // from class: com.sankuai.waimai.store.poi.list.model.e.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    PoiVerticalityDataResponse poiVerticalityDataResponse = (PoiVerticalityDataResponse) obj;
                    Object[] objArr4 = {poiVerticalityDataResponse};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8cc1cf88fe348e30f6bdba4ef45b6743", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8cc1cf88fe348e30f6bdba4ef45b6743");
                        return;
                    }
                    super.a((AnonymousClass2) poiVerticalityDataResponse);
                    eVar.b = false;
                    e.a(eVar, poiVerticalityDataResponse);
                    bVar.a(poiVerticalityDataResponse);
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar2) {
                    Object[] objArr4 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6e5d26b913b01a3a6b9d5c18dac13425", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6e5d26b913b01a3a6b9d5c18dac13425");
                        return;
                    }
                    super.a(bVar2);
                    eVar.b = false;
                    bVar.a(bVar2);
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "345f35271a58acd0b9fcac3a898ae4b6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "345f35271a58acd0b9fcac3a898ae4b6");
                        return;
                    }
                    super.b();
                    eVar.b = false;
                }
            });
        }
    }

    void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04d51370b6db346e4c6af436d309e50d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04d51370b6db346e4c6af436d309e50d");
            return;
        }
        this.d.u = b();
    }

    public boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "722fdacf1ae60fd961b8a4841c0b10d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "722fdacf1ae60fd961b8a4841c0b10d0")).booleanValue();
        }
        if (com.sankuai.shangou.stone.util.a.a((List) this.c.allSortedSpuIds) > 0) {
            String str = (String) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c.allSortedSpuIds, this.c.allSortedSpuIds.size() - 1);
            String str2 = this.c.lastRenderId;
            if (t.a(str2) || t.a(str)) {
                return false;
            }
            return !str.equals(str2);
        }
        return false;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "692bc7e1e86e80301a1bc8d7dd8b4647", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "692bc7e1e86e80301a1bc8d7dd8b4647");
            return;
        }
        this.d.n = 2;
        this.d.b = 0L;
        this.d.q();
        a(this.d, false, true);
    }
}
