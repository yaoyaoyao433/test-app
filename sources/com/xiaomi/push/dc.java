package com.xiaomi.push;

import android.content.Context;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class dc {
    public static void a(Context context, String str, int i, String str2) {
        m.a(context).a(new dd(context, str, i, str2), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, HashMap<String, String> hashMap) {
        dl dlVar = dh.a(context).e;
        if (dlVar != null) {
            dlVar.a(context, hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context, HashMap<String, String> hashMap) {
        dl dlVar = dh.a(context).e;
        if (dlVar != null) {
            dlVar.b(context, hashMap);
        }
    }
}
