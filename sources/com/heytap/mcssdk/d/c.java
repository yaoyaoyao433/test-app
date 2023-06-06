package com.heytap.mcssdk.d;

import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.mode.BaseMode;
import com.sankuai.waimai.platform.utils.f;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class c implements d {
    protected abstract BaseMode a(Intent intent);

    public static List<BaseMode> a(Context context, Intent intent) {
        BaseMode a;
        if (intent == null) {
            return null;
        }
        int i = 4096;
        try {
            i = Integer.parseInt(com.heytap.mcssdk.f.a.a(f.a(intent, "type")));
        } catch (Exception e) {
            com.heytap.mcssdk.f.b.b("MessageParser--getMessageByIntent--Exception:" + e.getMessage());
        }
        com.heytap.mcssdk.f.b.a("MessageParser--getMessageByIntent--type:" + i);
        ArrayList arrayList = new ArrayList();
        for (d dVar : com.heytap.mcssdk.b.a().c) {
            if (dVar != null && (a = dVar.a(context, i, intent)) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
