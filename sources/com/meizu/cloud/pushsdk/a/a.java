package com.meizu.cloud.pushsdk.a;

import android.content.Context;
import com.meizu.cloud.pushsdk.a.b;
import com.meizu.cloud.pushsdk.d.a.c;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class a {
    private static final String a = "a";

    public static void b(final Context context) {
        com.meizu.cloud.pushsdk.b.c.a.a().execute(new Runnable() { // from class: com.meizu.cloud.pushsdk.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                com.meizu.cloud.pushsdk.a.a.b.a(context).a("POST", null, a.a(context).toString());
            }
        });
    }

    public static c a(Context context) {
        c cVar = new c();
        b.a aVar = new b.a();
        aVar.a = context;
        b bVar = new b(aVar);
        HashMap<String, String> hashMap = bVar.a;
        HashMap<String, String> hashMap2 = bVar.b;
        HashMap<String, Object> hashMap3 = bVar.c;
        HashMap<String, Object> hashMap4 = bVar.d;
        if (hashMap.size() > 0) {
            cVar.a("ui", hashMap);
        }
        if (hashMap2.size() > 0) {
            cVar.a(AppIconSetting.DEFAULT_LARGE_ICON, hashMap2);
        }
        if (hashMap3.size() > 0) {
            cVar.a("ai", hashMap3);
        }
        if (hashMap4.size() > 0) {
            cVar.a(AppIconSetting.LARGE_ICON_URL, hashMap4);
        }
        return cVar;
    }
}
