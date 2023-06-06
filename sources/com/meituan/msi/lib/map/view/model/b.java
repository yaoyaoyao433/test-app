package com.meituan.msi.lib.map.view.model;

import com.BV.LinearGradient.LinearGradientManager;
import com.google.gson.JsonObject;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public int b;
    private final MTMap c;
    private final MsiContext d;
    private final JsonObject e;
    private final Map<Integer, a> f;
    private int g;

    public b(MTMap mTMap, MsiContext msiContext, JsonObject jsonObject, HashMap<Integer, a> hashMap) {
        Object[] objArr = {mTMap, msiContext, jsonObject, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda63ab25a237491452a759d17869589", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda63ab25a237491452a759d17869589");
            return;
        }
        this.b = 0;
        this.c = mTMap;
        this.d = msiContext;
        this.e = jsonObject;
        this.f = hashMap;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb7bd69234c54870453bb7aa37b137f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb7bd69234c54870453bb7aa37b137f9");
        } else if (this.c == null) {
            this.d.onError(1201, "MTMap is null");
        } else if (!this.e.has("id")) {
            this.d.onError(1201, "id is null");
        } else {
            this.g = this.e.get("id").getAsInt();
            boolean containsKey = this.f.containsKey(Integer.valueOf(this.g));
            if (3 == this.b) {
                a(containsKey, this.g);
                return;
            }
            if (containsKey) {
                this.f.get(Integer.valueOf(this.g)).g.remove();
                this.f.remove(Integer.valueOf(this.g));
            }
            if (!this.e.has("start") || !this.e.has("end")) {
                this.d.onError(1201, "start or end, is null");
                return;
            }
            LatLng b = com.meituan.msi.lib.map.utils.e.b(this.e.get("start").getAsJsonObject());
            LatLng b2 = com.meituan.msi.lib.map.utils.e.b(this.e.get("end").getAsJsonObject());
            if (b == null || b2 == null) {
                this.d.onError(1201, "start or end, is unvalid");
                return;
            }
            a aVar = new a(this.c);
            aVar.b = b;
            aVar.d = b2;
            if (!this.e.has("pass")) {
                if (this.e.has(LinearGradientManager.PROP_ANGLE)) {
                    this.d.onError(1201, "not support angle");
                    return;
                } else {
                    this.d.onError(1201, "pass is null");
                    return;
                }
            }
            aVar.c = com.meituan.msi.lib.map.utils.e.b(this.e.get("pass").getAsJsonObject());
            if (this.e.has("color")) {
                aVar.f = com.meituan.msi.lib.map.utils.a.a(this.e.get("color").getAsString(), "arc");
            }
            if (this.e.has("width")) {
                aVar.e = this.e.get("width").getAsFloat();
            }
            aVar.a();
            if (aVar.g == null) {
                this.d.onError(1201, "sdk error");
                return;
            }
            this.f.put(Integer.valueOf(this.g), aVar);
            this.d.onSuccess(null);
        }
    }

    private void a(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3190ebf42ed63246f3fd5af243502a3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3190ebf42ed63246f3fd5af243502a3c");
        } else if (!z) {
            this.d.onError(1201, "id not exist");
        } else {
            this.f.get(Integer.valueOf(i)).b();
            this.f.remove(Integer.valueOf(i));
            this.d.onSuccess(null);
        }
    }
}
