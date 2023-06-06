package com.sankuai.meituan.mapsdk.api.module.http;

import android.net.Uri;
import com.meituan.mtmap.rendersdk.HttpCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapfoundation.starship.c;
import com.sankuai.meituan.mapfoundation.starship.j;
import com.sankuai.meituan.mapsdk.mapcore.net.d;
import com.sankuai.meituan.mapsdk.mapcore.net.e;
import com.sankuai.meituan.mapsdk.maps.MapsInitializer;
import com.sankuai.meituan.mapsdk.maps.model.MTMapEnv;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements HttpCallback.HttpRequest, c.a<byte[]> {
    public static ChangeQuickRedirect a;
    private volatile HttpCallback.HttpResponse b;
    private c c;
    private com.sankuai.meituan.mapfoundation.starship.interceptor.b d;
    private d e;

    @Override // com.meituan.mtmap.rendersdk.HttpCallback.HttpRequest
    public final void post(Uri uri, Map<String, Object> map, Map<String, Object> map2) {
    }

    @Override // com.sankuai.meituan.mapfoundation.starship.c.a
    public final /* synthetic */ void a(int i, Map map, byte[] bArr) {
        byte[] bArr2 = bArr;
        Object[] objArr = {Integer.valueOf(i), map, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b81048f8414ffaeba3c900e1dd18b37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b81048f8414ffaeba3c900e1dd18b37");
        } else if (this.b != null) {
            this.b.onResponse(i, map, bArr2);
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f91a27d62c6bf60715ec9bbd49183b34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f91a27d62c6bf60715ec9bbd49183b34");
            return;
        }
        this.d = new com.sankuai.meituan.mapfoundation.starship.interceptor.b(com.sankuai.meituan.mapsdk.mapcore.a.a(), MapsInitializer.getCatAppId(), com.sankuai.meituan.mapsdk.mapcore.a.c(), "4.1207.11");
        this.e = new d();
        this.c = j.a(MapsInitializer.getMTMapEnv() == MTMapEnv.RELEASE, this.d, this.e);
    }

    @Override // com.meituan.mtmap.rendersdk.HttpCallback.HttpRequest
    public final void setHttpResponse(HttpCallback.HttpResponse httpResponse) {
        this.b = httpResponse;
    }

    @Override // com.meituan.mtmap.rendersdk.HttpCallback.HttpRequest
    public final void get(Uri uri, Map<String, Object> map, Map<String, Object> map2) {
        Map<String, Object> map3;
        Object[] objArr = {uri, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b4dc5aaf2fd30ff699668c46a59f5a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b4dc5aaf2fd30ff699668c46a59f5a6");
            return;
        }
        Object[] objArr2 = {map2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f629c36cd99d2e5fa7a4e6dcf99e266a", RobustBitConfig.DEFAULT_VALUE)) {
            map3 = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f629c36cd99d2e5fa7a4e6dcf99e266a");
        } else {
            if (map2 != null) {
                String a2 = com.sankuai.meituan.mapfoundation.datacollector.a.a(com.sankuai.meituan.mapsdk.mapcore.a.a());
                map2.put("page_id", a2);
                map2.put("cid", com.sankuai.meituan.mapfoundation.datacollector.a.a(a2));
                map2.put("mapsdk_ver", "4.1207.11");
                map2.put("userid", com.sankuai.meituan.mapsdk.mapcore.a.c());
                map2.remove("custom_data");
            }
            map3 = map2;
        }
        Object obj = map3.get("containerBiz");
        map.putAll(e.a((String) map3.get("key"), (String) map3.get("containerPlatform"), obj != null ? (String) obj : null));
        this.c.a(uri.toString(), map, map3, new c.a<byte[]>() { // from class: com.sankuai.meituan.mapsdk.api.module.http.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mapfoundation.starship.c.a
            public final /* synthetic */ void a(int i, Map map4, byte[] bArr) {
                byte[] bArr2 = bArr;
                Object[] objArr3 = {Integer.valueOf(i), map4, bArr2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a13bb6095fe5efc81dcddef43f3cd5a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a13bb6095fe5efc81dcddef43f3cd5a6");
                } else {
                    b.this.b.onResponse(i, map4, bArr2);
                }
            }

            @Override // com.sankuai.meituan.mapfoundation.starship.c.a
            public final void a(Exception exc) {
                Object[] objArr3 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "019fa430b0a0eb76b0139a1f59ec27de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "019fa430b0a0eb76b0139a1f59ec27de");
                } else {
                    b.this.b.onFailure(exc);
                }
            }
        });
    }

    @Override // com.meituan.mtmap.rendersdk.HttpCallback.HttpRequest
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c095ce12f800d2a908a1dbf6dc293af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c095ce12f800d2a908a1dbf6dc293af");
        } else {
            this.c.cancel(this);
        }
    }

    @Override // com.sankuai.meituan.mapfoundation.starship.c.a
    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0be7cea7566bce52772a9771fd7df16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0be7cea7566bce52772a9771fd7df16");
        } else if (this.b != null) {
            this.b.onFailure(exc);
        }
    }
}
