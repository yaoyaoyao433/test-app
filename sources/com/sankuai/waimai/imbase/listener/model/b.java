package com.sankuai.waimai.imbase.listener.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public int d;
    public String e;
    public com.sankuai.waimai.imbase.register.b f;
    public Map<String, String> g;
    public JSONObject h;

    public b(String str, String str2, int i, String str3, com.sankuai.waimai.imbase.register.b bVar, Map<String, String> map) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3, bVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ade39b0f5c0d89e9a2c67b4cee466123", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ade39b0f5c0d89e9a2c67b4cee466123");
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = bVar;
        this.g = map;
    }

    public final JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9460defd9d1b6991fa75e0c23405b4", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9460defd9d1b6991fa75e0c23405b4") : this.h == null ? new JSONObject() : this.h;
    }
}
