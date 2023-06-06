package com.meituan.android.ptcommonim.base.manager;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.ptcommonim.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a;
    static String b;
    private static volatile b d;
    private static final Map<String, String> e = new HashMap();
    private static final Map<String, String> f = new HashMap();
    public static final Set<String> c = new HashSet();
    private static boolean g = false;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "992985b94c888bc289cdc14be43bef98", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "992985b94c888bc289cdc14be43bef98");
        }
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    d = new b();
                }
            }
        }
        return d;
    }

    public static /* synthetic */ void a(b bVar, boolean z, String str) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "549eeb007204a913af61d760684470b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "549eeb007204a913af61d760684470b1");
        } else if (!z || TextUtils.isEmpty(str)) {
        } else {
            bVar.a(str);
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1e207b16392ad9d8553af9af3c1446a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1e207b16392ad9d8553af9af3c1446a");
            return;
        }
        JsonObject jsonObject = JsonHelper.toJsonObject(str);
        g = JsonHelper.getBoolean(jsonObject, "enableWithdraw", false);
        JsonArray jsonArray = JsonHelper.getJsonArray(jsonObject, "ptimWithdrawConfig/messageTimeliness");
        if (jsonArray != null) {
            int size = jsonArray.size();
            for (int i = 0; i < size; i++) {
                JsonObject jsonObject2 = JsonHelper.getJsonObject(jsonArray, String.valueOf(i));
                e.put(JsonHelper.getString(jsonObject2, "type"), JsonHelper.getString(jsonObject2, "value"));
            }
        }
        JsonArray jsonArray2 = JsonHelper.getJsonArray(jsonObject, "ptimWithdrawConfig/reeditTimeliness");
        if (jsonArray2 != null) {
            int size2 = jsonArray2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                JsonObject jsonObject3 = JsonHelper.getJsonObject(jsonArray2, String.valueOf(i2));
                f.put(JsonHelper.getString(jsonObject3, "type"), JsonHelper.getString(jsonObject3, "value"));
            }
        }
        c.clear();
        JsonArray jsonArray3 = JsonHelper.getJsonArray(jsonObject, "ptimWithdrawConfig/blackList");
        if (jsonArray3 != null) {
            int size3 = jsonArray3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                JsonObject jsonObject4 = JsonHelper.getJsonObject(jsonArray3, String.valueOf(i3));
                c.add(g.a(JsonHelper.getString(jsonObject4, "buid"), JsonHelper.getString(jsonObject4, "channel")));
            }
        }
    }

    public final void b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81fca67f2f858941f6463443e30c9e1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81fca67f2f858941f6463443e30c9e1d");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e5739b1d494ffa1300be641700d996d", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e5739b1d494ffa1300be641700d996d")).booleanValue();
        } else if (e.size() > 0 && f.size() > 0) {
            z = true;
        }
        if (z) {
            return;
        }
        String accessCache = Horn.accessCache(b);
        if (TextUtils.isEmpty(accessCache)) {
            return;
        }
        a(accessCache);
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82387293436ef91ed75bd65321a6ca4e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82387293436ef91ed75bd65321a6ca4e")).booleanValue();
        }
        b();
        return g;
    }

    public final Map<String, String> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05cb6da5b22a7543968851a1e62751c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05cb6da5b22a7543968851a1e62751c8");
        }
        b();
        if (g && !e.containsKey("default")) {
            e.put("default", "120");
        }
        return e;
    }

    private Map<String, String> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb0ab6e6a11d5ae3387cb053f570a3b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb0ab6e6a11d5ae3387cb053f570a3b6");
        }
        b();
        if (g && !f.containsKey("default")) {
            f.put("default", "600");
        }
        return f;
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d16be84cf3f4d4cfe6ea421ea7dd422a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d16be84cf3f4d4cfe6ea421ea7dd422a") : f().containsKey("default") ? f().get("default") : "0";
    }
}
