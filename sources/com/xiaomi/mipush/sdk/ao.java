package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.xiaomi.push.fd;
import com.xiaomi.push.ha;
import com.xiaomi.push.hf;
import com.xiaomi.push.hl;
import com.xiaomi.push.ho;
import com.xiaomi.push.ia;
import com.xiaomi.push.jj;
import com.xiaomi.push.jk;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class ao implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ao(Context context, boolean z) {
        this.a = context;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String c;
        String c2;
        Map<String, String> map;
        String str;
        String c3;
        com.xiaomi.channel.commonutils.logger.c.a("do sync info");
        ia iaVar = new ia(com.xiaomi.push.service.ad.a(), false);
        ap a = ap.a(this.a);
        iaVar.e = hl.SyncInfo.ah;
        iaVar.d = a.b.a;
        iaVar.i = this.a.getPackageName();
        iaVar.h = new HashMap();
        jk.a(iaVar.h, AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, fd.a(this.a, this.a.getPackageName()));
        jk.a(iaVar.h, "app_version_code", Integer.toString(fd.b(this.a, this.a.getPackageName())));
        jk.a(iaVar.h, "push_sdk_vn", "4_8_2");
        jk.a(iaVar.h, "push_sdk_vc", Integer.toString(40082));
        jk.a(iaVar.h, "token", a.b.b);
        if (!jj.f()) {
            String a2 = com.xiaomi.push.ar.a(hf.b(this.a));
            String d = hf.d(this.a);
            if (!TextUtils.isEmpty(d)) {
                a2 = a2 + CommonConstant.Symbol.COMMA + d;
            }
            if (!TextUtils.isEmpty(a2)) {
                jk.a(iaVar.h, "imei_md5", a2);
            }
        }
        com.xiaomi.push.ab.a(this.a).a(iaVar.h);
        jk.a(iaVar.h, "reg_id", a.b.c);
        jk.a(iaVar.h, "reg_secret", a.b.d);
        jk.a(iaVar.h, "accept_time", g.x(this.a).replace(CommonConstant.Symbol.COMMA, CommonConstant.Symbol.MINUS));
        if (this.b) {
            jk.a(iaVar.h, "aliases_md5", an.a(g.b(this.a)));
            jk.a(iaVar.h, "topics_md5", an.a(g.c(this.a)));
            map = iaVar.h;
            str = "accounts_md5";
            c3 = an.a(g.d(this.a));
        } else {
            Map<String, String> map2 = iaVar.h;
            c = an.c(g.b(this.a));
            jk.a(map2, "aliases", c);
            Map<String, String> map3 = iaVar.h;
            c2 = an.c(g.c(this.a));
            jk.a(map3, "topics", c2);
            map = iaVar.h;
            str = "user_accounts";
            c3 = an.c(g.d(this.a));
        }
        jk.a(map, str, c3);
        ag.a(this.a).a((ag) iaVar, ha.Notification, false, (ho) null);
    }
}
