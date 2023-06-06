package com.xiaomi.push;

import android.text.TextUtils;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallUris;
import com.xiaomi.push.da;
import java.io.IOException;
/* loaded from: classes6.dex */
public final class fk extends Thread {
    final /* synthetic */ fj a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(fj fjVar, String str) {
        super(str);
        this.a = fjVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        fe feVar;
        String str;
        fj fjVar;
        try {
            feVar = this.a.z;
            boolean z = false;
            try {
                feVar.c = false;
                fb a = feVar.a();
                if ("CONN".equals(a.a())) {
                    da.f fVar = (da.f) new da.f().b(a.i());
                    if (fVar.a) {
                        feVar.b.a(fVar.b);
                        z = true;
                    }
                    if (fVar.d) {
                        da.b bVar = fVar.e;
                        fb fbVar = new fb();
                        fbVar.a("SYNC", "CONF");
                        fbVar.a(bVar.d(), (String) null);
                        feVar.b.a(fbVar);
                    }
                    com.xiaomi.channel.commonutils.logger.c.a("[Slim] CONN: host = " + fVar.c);
                }
                if (!z) {
                    com.xiaomi.channel.commonutils.logger.c.a("[Slim] Invalid CONN");
                    throw new IOException("Invalid Connection");
                }
                feVar.d = feVar.b.a();
                while (!feVar.c) {
                    fb a2 = feVar.a();
                    feVar.b.m();
                    switch (a2.a) {
                        case 1:
                            fjVar = feVar.b;
                            fjVar.a(a2);
                            break;
                        case 2:
                            if (!"SECMSG".equals(a2.a()) || ((a2.c() != 2 && a2.c() != 3) || !TextUtils.isEmpty(a2.b()))) {
                                fjVar = feVar.b;
                                fjVar.a(a2);
                                break;
                            } else {
                                try {
                                    feVar.b.b(feVar.a.a(a2.c(com.xiaomi.push.service.ag.a().b(Integer.valueOf(a2.c()).toString(), a2.h()).i), feVar.b));
                                    break;
                                } catch (Exception e) {
                                    str = "[Slim] Parse packet from Blob chid=" + a2.c() + "; Id=" + a2.g() + " failure:" + e.getMessage();
                                    break;
                                }
                            }
                            break;
                        case 3:
                            try {
                                feVar.b.b(feVar.a.a(a2.i(), feVar.b));
                                break;
                            } catch (Exception e2) {
                                str = "[Slim] Parse packet from Blob chid=" + a2.c() + "; Id=" + a2.g() + " failure:" + e2.getMessage();
                                break;
                            }
                        default:
                            str = "[Slim] unknow blob type " + ((int) a2.a);
                            com.xiaomi.channel.commonutils.logger.c.a(str);
                            break;
                    }
                    if (!CSCallUris.SVID_CALL_PING.equals(a2.a())) {
                        feVar.b.d();
                    }
                }
            } catch (IOException e3) {
                if (!feVar.c) {
                    throw e3;
                }
            }
        } catch (Exception e4) {
            this.a.c(9, e4);
        }
    }
}
