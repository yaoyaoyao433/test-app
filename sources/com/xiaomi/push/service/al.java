package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.by;
import com.xiaomi.push.da;
import com.xiaomi.push.eq;
import com.xiaomi.push.ey;
import com.xiaomi.push.fa;
import com.xiaomi.push.fn;
import com.xiaomi.push.gq;
import com.xiaomi.push.jr;
import com.xiaomi.push.service.av;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes6.dex */
public final class al extends av.a implements by.a {
    private XMPushService a;
    private long b;

    /* loaded from: classes6.dex */
    static class a implements by.b {
        @Override // com.xiaomi.push.by.b
        public final String a(String str) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("sdkver", "47");
            buildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            buildUpon.appendQueryParameter("os", gq.a(Build.MODEL + CommonConstant.Symbol.COLON + Build.VERSION.INCREMENTAL));
            buildUpon.appendQueryParameter("mi", String.valueOf(jr.b()));
            String builder = buildUpon.toString();
            com.xiaomi.channel.commonutils.logger.c.c("fetch bucket from : " + builder);
            URL url = new URL(builder);
            int port = url.getPort() == -1 ? 80 : url.getPort();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String a = com.xiaomi.push.al.a(jr.a(), url);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                fa.a(url.getHost() + CommonConstant.Symbol.COLON + port, (int) currentTimeMillis2, null);
                return a;
            } catch (IOException e) {
                fa.a(url.getHost() + CommonConstant.Symbol.COLON + port, -1, e);
                throw e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public al(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    @Override // com.xiaomi.push.by.a
    public final com.xiaomi.push.by a(Context context, com.xiaomi.push.bx bxVar, by.b bVar, String str) {
        return new b(context, bxVar, bVar, str);
    }

    /* loaded from: classes6.dex */
    static class b extends com.xiaomi.push.by {
        protected b(Context context, com.xiaomi.push.bx bxVar, by.b bVar, String str) {
            super(context, bxVar, bVar, str);
        }

        @Override // com.xiaomi.push.by
        public final String a(ArrayList<String> arrayList, String str, String str2, boolean z) {
            try {
                if (ey.a.a.a) {
                    str2 = av.e();
                }
                return super.a(arrayList, str, str2, z);
            } catch (IOException e) {
                fa.a(0, eq.GSLB_ERR.af, 1, null, com.xiaomi.push.al.b(c) ? 1 : 0);
                throw e;
            }
        }
    }

    @Override // com.xiaomi.push.service.av.a
    public final void a(da.b bVar) {
        com.xiaomi.push.bu b2;
        if (bVar.a && bVar.b && System.currentTimeMillis() - this.b > DDLoadConstants.TIME_HOURS_MILLIS) {
            com.xiaomi.channel.commonutils.logger.c.a("fetch bucket :" + bVar.b);
            this.b = System.currentTimeMillis();
            com.xiaomi.push.by a2 = com.xiaomi.push.by.a();
            a2.c();
            a2.e();
            fn fnVar = this.a.c;
            if (fnVar == null || (b2 = a2.b(fnVar.e().c())) == null) {
                return;
            }
            ArrayList<String> b3 = b2.b();
            boolean z = true;
            Iterator<String> it = b3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().equals(fnVar.f())) {
                    z = false;
                    break;
                }
            }
            if (!z || b3.isEmpty()) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.a("bucket changed, force reconnect");
            this.a.a(0, (Exception) null);
            this.a.b(false);
        }
    }
}
