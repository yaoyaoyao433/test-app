package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.ha;
import com.xiaomi.push.hf;
import com.xiaomi.push.hl;
import com.xiaomi.push.ho;
import com.xiaomi.push.ia;
import com.xiaomi.push.jj;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class j implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        Context context3;
        String b;
        Context context4;
        Context context5;
        Context context6;
        Context context7;
        if (jj.f()) {
            return;
        }
        context = g.a;
        if (hf.b(context) == null) {
            context7 = g.a;
            if (!com.xiaomi.push.ab.a(context7).a()) {
                return;
            }
        }
        ia iaVar = new ia();
        context2 = g.a;
        iaVar.d = ap.a(context2).b.a;
        iaVar.e = hl.ClientInfoUpdate.ah;
        iaVar.c = com.xiaomi.push.service.ad.a();
        iaVar.h = new HashMap();
        String str = "";
        context3 = g.a;
        if (!TextUtils.isEmpty(hf.b(context3))) {
            str = "" + com.xiaomi.push.ar.a(b);
        }
        context4 = g.a;
        String d = hf.d(context4);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(d)) {
            str = str + CommonConstant.Symbol.COMMA + d;
        }
        if (!TextUtils.isEmpty(str)) {
            iaVar.h.put("imei_md5", str);
        }
        context5 = g.a;
        com.xiaomi.push.ab.a(context5).a(iaVar.h);
        int a = hf.a();
        if (a >= 0) {
            iaVar.h.put("space_id", Integer.toString(a));
        }
        context6 = g.a;
        ag.a(context6).a((ag) iaVar, ha.Notification, false, (ho) null);
    }
}
