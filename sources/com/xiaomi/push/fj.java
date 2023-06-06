package com.xiaomi.push;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallUris;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.xiaomi.push.da;
import com.xiaomi.push.fn;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ag;
import java.util.HashMap;
import java.util.Locale;
/* loaded from: classes6.dex */
public final class fj extends fu {
    private ff A;
    private byte[] B;
    private Thread y;
    private fe z;

    public fj(XMPushService xMPushService, fo foVar) {
        super(xMPushService, foVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(fb fbVar) {
        if (fbVar == null) {
            return;
        }
        if (fbVar.d()) {
            com.xiaomi.channel.commonutils.logger.c.a("[Slim] RCV blob chid=" + fbVar.c() + "; id=" + fbVar.g() + "; errCode=" + fbVar.e() + "; err=" + fbVar.f());
        }
        if (fbVar.c() == 0) {
            if (CSCallUris.SVID_CALL_PING.equals(fbVar.a())) {
                com.xiaomi.channel.commonutils.logger.c.a("[Slim] RCV ping id=" + fbVar.g());
                q();
            } else if ("CLOSE".equals(fbVar.a())) {
                c(13, null);
            }
        }
        for (fn.a aVar : this.h.values()) {
            aVar.a(fbVar);
        }
    }

    @Override // com.xiaomi.push.fn
    @Deprecated
    public final void a(gf gfVar) {
        b(fb.a(gfVar, (String) null));
    }

    @Override // com.xiaomi.push.fu, com.xiaomi.push.fn
    public final void a(fb[] fbVarArr) {
        for (fb fbVar : fbVarArr) {
            b(fbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized byte[] a() {
        if (this.B == null && !TextUtils.isEmpty(this.k)) {
            String e = com.xiaomi.push.service.av.e();
            this.B = com.xiaomi.push.service.ap.a(this.k.getBytes(), (this.k.substring(this.k.length() / 2) + e.substring(e.length() / 2)).getBytes());
        }
        return this.B;
    }

    @Override // com.xiaomi.push.fn
    public final boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        dy.a(this.p.getApplicationContext()).a(SystemClock.elapsedRealtime());
    }

    @Override // com.xiaomi.push.fu
    protected final void a(boolean z) {
        if (this.A == null) {
            throw new fy("The BlobWriter is null.");
        }
        fi fiVar = new fi();
        if (z) {
            fiVar.a("1");
        }
        byte[] c = fa.c();
        if (c != null) {
            da.j jVar = new da.j();
            jVar.a(a.a(c));
            fiVar.a(jVar.d(), (String) null);
        }
        com.xiaomi.channel.commonutils.logger.c.a("[Slim] SND ping id=" + fiVar.g());
        b(fiVar);
        p();
    }

    @Override // com.xiaomi.push.fn
    public final synchronized void a(ag.b bVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String a;
        String n = n();
        da.c cVar = new da.c();
        if (!TextUtils.isEmpty(bVar.c)) {
            cVar.a(bVar.c);
        }
        if (!TextUtils.isEmpty(bVar.f)) {
            cVar.d(bVar.f);
        }
        if (!TextUtils.isEmpty(bVar.g)) {
            cVar.e(bVar.g);
        }
        cVar.b(bVar.e ? "1" : "0");
        cVar.c(!TextUtils.isEmpty(bVar.d) ? bVar.d : "XIAOMI-SASL");
        fb fbVar = new fb();
        fbVar.b(bVar.b);
        fbVar.a(Integer.parseInt(bVar.h));
        fbVar.b = bVar.a;
        fbVar.a("BIND", (String) null);
        fbVar.a(fbVar.g());
        com.xiaomi.channel.commonutils.logger.c.a("[Slim]: bind id=" + fbVar.g());
        HashMap hashMap = new HashMap();
        hashMap.put("challenge", n);
        hashMap.put("token", bVar.c);
        hashMap.put(MessageStatisticsEntry.PARAM_CHANNEL, bVar.h);
        hashMap.put("from", bVar.b);
        hashMap.put("id", fbVar.g());
        hashMap.put(RemoteMessageConst.TO, "xiaomi.com");
        if (bVar.e) {
            str = "kick";
            str2 = "1";
        } else {
            str = "kick";
            str2 = "0";
        }
        hashMap.put(str, str2);
        if (TextUtils.isEmpty(bVar.f)) {
            str3 = "client_attrs";
            str4 = "";
        } else {
            str3 = "client_attrs";
            str4 = bVar.f;
        }
        hashMap.put(str3, str4);
        if (TextUtils.isEmpty(bVar.g)) {
            str5 = "cloud_attrs";
            str6 = "";
        } else {
            str5 = "cloud_attrs";
            str6 = bVar.g;
        }
        hashMap.put(str5, str6);
        if (!bVar.d.equals("XIAOMI-PASS") && !bVar.d.equals("XMPUSH-PASS")) {
            bVar.d.equals("XIAOMI-SASL");
            a = null;
            cVar.f(a);
            fbVar.a(cVar.d(), (String) null);
            b(fbVar);
        }
        a = ap.a(bVar.d, null, hashMap, bVar.i);
        cVar.f(a);
        fbVar.a(cVar.d(), (String) null);
        b(fbVar);
    }

    @Override // com.xiaomi.push.fn
    public final synchronized void a(String str, String str2) {
        fb fbVar = new fb();
        fbVar.b(str2);
        fbVar.a(Integer.parseInt(str));
        fbVar.a("UBND", (String) null);
        b(fbVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.push.fu
    public final synchronized void a(int i, Exception exc) {
        if (this.z != null) {
            this.z.c = true;
            this.z = null;
        }
        if (this.A != null) {
            try {
                ff ffVar = this.A;
                fb fbVar = new fb();
                fbVar.a("CLOSE", (String) null);
                ffVar.a(fbVar);
                ffVar.c.close();
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.a(e);
            }
            this.A = null;
        }
        this.B = null;
        super.a(i, exc);
    }

    @Override // com.xiaomi.push.fu
    protected final synchronized void c() {
        try {
            this.z = new fe(this.s.getInputStream(), this);
            this.A = new ff(this.s.getOutputStream(), this);
            this.y = new fk(this, "Blob Reader (" + this.n + CommonConstant.Symbol.BRACKET_RIGHT);
            this.y.start();
            ff ffVar = this.A;
            da.e eVar = new da.e();
            eVar.a(106);
            eVar.a(Build.MODEL);
            eVar.b(jr.e());
            eVar.c(com.xiaomi.push.service.av.e());
            eVar.b(47);
            eVar.d(ffVar.b.g());
            eVar.e(ffVar.b.f());
            eVar.f(Locale.getDefault().toString());
            eVar.c(Build.VERSION.SDK_INT);
            byte[] b = ffVar.b.e().b();
            if (b != null) {
                eVar.a(da.b.a(b));
            }
            fb fbVar = new fb();
            fbVar.a(0);
            fbVar.a("CONN", (String) null);
            fbVar.a(0L, "xiaomi.com", null);
            fbVar.a(eVar.d(), (String) null);
            ffVar.a(fbVar);
            com.xiaomi.channel.commonutils.logger.c.a("[slim] open conn: andver=" + Build.VERSION.SDK_INT + " sdk=47 tz=" + ffVar.d + CommonConstant.Symbol.COLON + ffVar.e + " Model=" + Build.MODEL + " os=" + Build.VERSION.INCREMENTAL);
        } catch (Exception e) {
            throw new fy("Error to init reader and writer", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(gf gfVar) {
        if (gfVar == null) {
            return;
        }
        for (fn.a aVar : this.h.values()) {
            aVar.a.a(gfVar);
        }
    }

    @Override // com.xiaomi.push.fn
    public final void b(fb fbVar) {
        if (this.A == null) {
            throw new fy("the writer is null.");
        }
        try {
            int a = this.A.a(fbVar);
            this.q = SystemClock.elapsedRealtime();
            String str = fbVar.b;
            if (!TextUtils.isEmpty(str)) {
                gt.a(this.p, str, a, false, true, System.currentTimeMillis());
            }
            for (fn.a aVar : this.i.values()) {
                aVar.a(fbVar);
            }
            if (CSCallUris.SVID_CALL_PING.equals(fbVar.a())) {
                return;
            }
            dy.a(this.u.getApplicationContext()).a(SystemClock.elapsedRealtime());
        } catch (Exception e) {
            throw new fy(e);
        }
    }
}
