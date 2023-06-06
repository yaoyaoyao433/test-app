package com.sankuai.waimai.platform.net.weaknetwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public boolean b;
    public boolean c;
    public Map<String, Integer> d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Map<String, Integer> i;
    public int j;
    public int k;
    public int l;
    public int m;
    public double n;
    public double o;
    public double p;
    public double q;
    public boolean r;
    public int s;
    public int t;
    public int u;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6361f87cd811d5f314dba165399f6c80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6361f87cd811d5f314dba165399f6c80");
            return;
        }
        this.c = true;
        this.e = 500;
        this.f = 30000;
        this.g = 4;
        this.h = 30000;
        this.j = 1500;
        this.k = 60000;
        this.l = 2;
        this.m = 10;
        this.n = 100.0d;
        this.o = 200.0d;
        this.p = 50.0d;
        this.q = 100.0d;
        this.r = false;
        this.s = 10000;
        this.t = 10000;
        this.u = 60000;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48a5d40ac63b8cf70d5ed2468ea0bdc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48a5d40ac63b8cf70d5ed2468ea0bdc0");
        }
        return "ConfigInfo{weakNetSwitch=" + this.b + ", useSharkPing=" + this.c + ", goodRttConfigList=" + this.d + ", commonGoodRtt=" + this.e + ", goodRttIntervalTime=" + this.f + ", averageRttCountConfig=" + this.g + ", averageRttIntervalTime=" + this.h + ", weakRttConfigList=" + this.i + ", commonWeakRtt=" + this.j + ", weakRttIntervalTime=" + this.k + ", failCountConfig=" + this.l + ", failCountLimit=" + this.m + ", weakPingRtt=" + this.n + ", weakSharkPingRtt=" + this.o + ", activeSwitch=" + this.r + ", activeIntervalTime=" + this.s + ", activeMinIntervalTime=" + this.t + ", activeMaxIntervalTime=" + this.u + '}';
    }

    public final Map a(JSONObject jSONObject) {
        Iterator<String> keys;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "422fda792634a9f91c56f1011753f9d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "422fda792634a9f91c56f1011753f9d1");
        }
        HashMap hashMap = null;
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return null;
        }
        while (keys.hasNext()) {
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            String next = keys.next();
            hashMap.put(next, Integer.valueOf(jSONObject.optInt(next, -1)));
        }
        return hashMap;
    }
}
