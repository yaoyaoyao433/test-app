package com.meituan.passport.interceptor;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.common.horn.Horn;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.trafficcontroller.bean.TrafficStrategy;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static volatile JsonObject b;
    private static volatile String c;
    private static int d;
    private static ArrayList<String> e;

    public static com.sankuai.meituan.trafficcontroller.b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81f1eff62d08b031bdee0d5d449ae3e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.trafficcontroller.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81f1eff62d08b031bdee0d5d449ae3e4");
        }
        com.sankuai.meituan.trafficcontroller.b bVar = new com.sankuai.meituan.trafficcontroller.b();
        bVar.a().a(new TrafficStrategy(c(), b()));
        return bVar;
    }

    private static synchronized ArrayList<String> b() {
        JsonArray jsonArray;
        synchronized (c.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fe55f84358e1b149e0f1520f9c29ed8", RobustBitConfig.DEFAULT_VALUE)) {
                return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fe55f84358e1b149e0f1520f9c29ed8");
            } else if (e != null && e.size() > 0) {
                return e;
            } else {
                if (e == null) {
                    e = new ArrayList<>();
                }
                JsonObject d2 = d();
                if (d2 != null && d2.get("requests") != null) {
                    try {
                        jsonArray = d2.get("requests").getAsJsonArray();
                    } catch (Exception unused) {
                        jsonArray = null;
                    }
                    if (jsonArray != null) {
                        Iterator<JsonElement> it = jsonArray.iterator();
                        while (it.hasNext()) {
                            e.add(it.next().getAsString());
                        }
                    }
                }
                return e;
            }
        }
    }

    private static int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23d2feca3378c8fbf88578bf13c2c04b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23d2feca3378c8fbf88578bf13c2c04b")).intValue();
        }
        if (d != 0) {
            return d;
        }
        JsonObject d2 = d();
        if (d2 != null && d2.get("timeInterval") != null) {
            try {
                d = d2.get("timeInterval").getAsInt();
            } catch (Exception unused) {
            }
        }
        return d;
    }

    private static JsonObject d() {
        JsonObject jsonObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba543460fc66120c7de83fc01fa84bad", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba543460fc66120c7de83fc01fa84bad");
        }
        if (b != null) {
            return b;
        }
        if (TextUtils.isEmpty(c) || TextUtils.equals(c, StringUtil.NULL)) {
            c = Horn.accessCache("meituan_platform_business_traffic_limit");
        }
        if (!TextUtils.isEmpty(c)) {
            try {
                jsonObject = new JsonParser().parse(c).getAsJsonObject();
            } catch (Exception unused) {
                jsonObject = null;
            }
            if (jsonObject == null) {
                return null;
            }
            if (jsonObject.get("passport_requests_traffic_limit") != null) {
                try {
                    b = jsonObject.get("passport_requests_traffic_limit").getAsJsonObject();
                } catch (Exception unused2) {
                }
            }
        }
        return b;
    }
}
