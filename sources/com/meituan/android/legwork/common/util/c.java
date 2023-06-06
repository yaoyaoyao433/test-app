package com.meituan.android.legwork.common.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.legwork.utils.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final c d = new c();
    public boolean b;
    public int c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "352720ef6545cb995b0d204898b53e86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "352720ef6545cb995b0d204898b53e86");
            return;
        }
        this.b = false;
        this.c = 0;
    }

    public static c a() {
        return d;
    }

    public static /* synthetic */ void a(c cVar, boolean z, String str) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d23bad952791d1bd0f14b71494e93729", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d23bad952791d1bd0f14b71494e93729");
            return;
        }
        try {
            x.d("HornManager.init()", "get legwork switch result:" + str);
            cVar.b = false;
            Map map = (Map) new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() { // from class: com.meituan.android.legwork.common.util.c.1
            }.getType());
            if (map.get("fingerprint_switch") != null && (map.get("fingerprint_switch") instanceof Boolean) && ((Boolean) map.get("fingerprint_switch")).booleanValue()) {
                cVar.b = true;
            }
            if (map.containsKey("send_page_type")) {
                cVar.c = ((Double) map.get("send_page_type")).intValue();
                y a2 = y.a();
                int i = cVar.c;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = y.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "83e1f18bd8591886902d11a66d4ebd40", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "83e1f18bd8591886902d11a66d4ebd40");
                } else {
                    a2.a("pt_send_page_type", i);
                }
            }
        } catch (Exception e) {
            x.e("HornManager.init()", "get legwork switch error,result:" + str + ",exception msg:", e);
            x.a(e);
        }
    }
}
