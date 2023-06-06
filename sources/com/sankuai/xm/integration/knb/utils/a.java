package com.sankuai.xm.integration.knb.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.monitor.c;
import com.sankuai.xm.monitor.cat.b;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;
    private static boolean c = false;
    private static HashSet<String> d = new HashSet<>();

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fae538fc1ae899d194cf843af41f136", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fae538fc1ae899d194cf843af41f136")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "014526da1ac3b30742fc11bd694c39d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "014526da1ac3b30742fc11bd694c39d2");
        } else {
            synchronized (a.class) {
                if (!b) {
                    try {
                        String a2 = m.c().a("knb_native_report_whitelist");
                        if (!TextUtils.isEmpty(a2)) {
                            JSONObject jSONObject = new JSONObject(a2);
                            HashSet<String> hashSet = new HashSet<>();
                            JSONArray optJSONArray = jSONObject.optJSONArray("whitelist");
                            if (optJSONArray != null && optJSONArray.length() > 0) {
                                for (int i = 0; i < optJSONArray.length(); i++) {
                                    String string = optJSONArray.getString(i);
                                    if (!TextUtils.isEmpty(string)) {
                                        hashSet.add(string);
                                    }
                                }
                            }
                            synchronized (a.class) {
                                c = jSONObject.optInt("isopen") == 1;
                                d = hashSet;
                                b = true;
                            }
                        }
                    } catch (Exception e) {
                        com.sankuai.xm.im.utils.a.a(e, "KNBStatistics::checkWhiteListLoad", new Object[0]);
                    }
                }
            }
        }
        synchronized (a.class) {
            if (c) {
                return !d.contains(str);
            }
            return true;
        }
    }

    public static void a(String str, String str2, int i, long j, int i2, String str3) {
        Object[] objArr = {str, str2, Integer.valueOf(i), new Long(j), Integer.valueOf(i2), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fcf056e47d2c1345413c2caf8b2cd59a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fcf056e47d2c1345413c2caf8b2cd59a");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put("func", str2);
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("time", Long.valueOf(j));
        hashMap.put("code", Integer.valueOf(i2));
        hashMap.put("msg", str3);
        c.a("knb_info", hashMap);
    }

    public static void a(String str, int i, long j) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25abd27e034acd711d1fb1301be7f122", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25abd27e034acd711d1fb1301be7f122");
        } else if (a(str)) {
        } else {
            b bVar = new b();
            bVar.b = "api.neixin.cn/sdk/native/knb/" + str;
            bVar.c = i;
            bVar.d = 200;
            bVar.g = j;
            m.d().a(bVar);
        }
    }
}
