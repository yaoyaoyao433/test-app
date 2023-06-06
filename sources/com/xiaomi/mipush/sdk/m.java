package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.ap;
import com.xiaomi.push.ep;
import com.xiaomi.push.hf;
import com.xiaomi.push.ic;
import com.xiaomi.push.ii;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class m {
    private static Map<String, ap.a> a = new HashMap();
    private static Map<String, Long> b = new HashMap();

    public static void a(Context context, ii iiVar) {
        r.a(ep.COMMAND_UNREGISTER.k, null, iiVar.e, iiVar.f, null);
    }

    public static void a(Context context, ic icVar) {
        ap.a aVar;
        String str = icVar.i;
        if (icVar.e == 0 && (aVar = a.get(str)) != null) {
            String str2 = icVar.g;
            String str3 = icVar.h;
            aVar.c = str2;
            aVar.d = str3;
            aVar.f = hf.g(aVar.l);
            aVar.e = aVar.b();
            aVar.i = true;
            ap a2 = ap.a(context);
            a2.c.put(str, aVar);
            String a3 = ap.a.a(aVar);
            ap.b(a2.a).edit().putString("hybrid_app_info_" + str, a3).commit();
        }
        ArrayList arrayList = null;
        if (!TextUtils.isEmpty(icVar.g)) {
            arrayList = new ArrayList();
            arrayList.add(icVar.g);
        }
        r.a(ep.COMMAND_REGISTER.k, arrayList, icVar.e, icVar.f, null);
    }
}
