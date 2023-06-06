package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class dd implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dd(Context context, String str, int i, String str2) {
        this.a = context;
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.a;
        String str = this.b;
        int i = this.c;
        String str2 = this.d;
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("awake_info", str);
            hashMap.put("event_type", String.valueOf(i));
            hashMap.put("description", str2);
            switch (dh.a(context).d) {
                case 1:
                    dc.a(context, hashMap);
                    break;
                case 3:
                    dc.a(context, hashMap);
                case 2:
                    dc.b(context, hashMap);
                    break;
            }
            dl dlVar = dh.a(context).e;
            if (dlVar != null) {
                dlVar.c(context, hashMap);
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
        }
    }
}
