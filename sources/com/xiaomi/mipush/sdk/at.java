package com.xiaomi.mipush.sdk;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public class at implements a {
    private static volatile at d;
    Context a;
    q b;
    boolean c = false;
    private Map<as, a> e = new HashMap();

    private at(Context context) {
        this.a = context.getApplicationContext();
    }

    public static at a(Context context) {
        if (d == null) {
            synchronized (at.class) {
                if (d == null) {
                    d = new at(context);
                }
            }
        }
        return d;
    }

    private void a(as asVar, a aVar) {
        if (aVar != null) {
            if (this.e.containsKey(asVar)) {
                this.e.remove(asVar);
            }
            this.e.put(asVar, aVar);
        }
    }

    private void c(as asVar) {
        this.e.remove(asVar);
    }

    private boolean d(as asVar) {
        return this.e.containsKey(asVar);
    }

    public final a a(as asVar) {
        return this.e.get(asVar);
    }

    @Override // com.xiaomi.mipush.sdk.a
    public final void b() {
        com.xiaomi.channel.commonutils.logger.c.a("ASSEMBLE_PUSH : assemble push unregister");
        for (a aVar : this.e.values()) {
            if (aVar != null) {
                aVar.b();
            }
        }
        this.e.clear();
    }

    @Override // com.xiaomi.mipush.sdk.a
    public final void a() {
        a a;
        a a2;
        a a3;
        a a4;
        com.xiaomi.channel.commonutils.logger.c.a("ASSEMBLE_PUSH : assemble push register");
        if (this.e.size() <= 0 && this.b != null) {
            if (this.b.a) {
                StringBuilder sb = new StringBuilder("ASSEMBLE_PUSH : ");
                sb.append(" HW user switch : " + this.b.a + " HW online switch : " + aw.a(this.a, as.ASSEMBLE_PUSH_HUAWEI) + " HW isSupport : " + y.HUAWEI.equals(bb.a(this.a)));
                com.xiaomi.channel.commonutils.logger.c.a(sb.toString());
            }
            if (this.b.a && aw.a(this.a, as.ASSEMBLE_PUSH_HUAWEI) && y.HUAWEI.equals(bb.a(this.a))) {
                if (!d(as.ASSEMBLE_PUSH_HUAWEI)) {
                    a(as.ASSEMBLE_PUSH_HUAWEI, ab.a(this.a, as.ASSEMBLE_PUSH_HUAWEI));
                }
                com.xiaomi.channel.commonutils.logger.c.c("hw manager add to list");
            } else if (d(as.ASSEMBLE_PUSH_HUAWEI) && (a = a(as.ASSEMBLE_PUSH_HUAWEI)) != null) {
                c(as.ASSEMBLE_PUSH_HUAWEI);
                a.b();
            }
            if (this.b.b) {
                StringBuilder sb2 = new StringBuilder("ASSEMBLE_PUSH : ");
                sb2.append(" FCM user switch : " + this.b.b + " FCM online switch : " + aw.a(this.a, as.ASSEMBLE_PUSH_FCM) + " FCM isSupport : " + bb.b(this.a));
                com.xiaomi.channel.commonutils.logger.c.a(sb2.toString());
            }
            if (this.b.b && aw.a(this.a, as.ASSEMBLE_PUSH_FCM) && bb.b(this.a)) {
                if (!d(as.ASSEMBLE_PUSH_FCM)) {
                    a(as.ASSEMBLE_PUSH_FCM, ab.a(this.a, as.ASSEMBLE_PUSH_FCM));
                }
                com.xiaomi.channel.commonutils.logger.c.c("fcm manager add to list");
            } else if (d(as.ASSEMBLE_PUSH_FCM) && (a2 = a(as.ASSEMBLE_PUSH_FCM)) != null) {
                c(as.ASSEMBLE_PUSH_FCM);
                a2.b();
            }
            if (this.b.c) {
                StringBuilder sb3 = new StringBuilder("ASSEMBLE_PUSH : ");
                sb3.append(" COS user switch : " + this.b.c + " COS online switch : " + aw.a(this.a, as.ASSEMBLE_PUSH_COS) + " COS isSupport : " + bb.c(this.a));
                com.xiaomi.channel.commonutils.logger.c.a(sb3.toString());
            }
            if (this.b.c && aw.a(this.a, as.ASSEMBLE_PUSH_COS) && bb.c(this.a)) {
                a(as.ASSEMBLE_PUSH_COS, ab.a(this.a, as.ASSEMBLE_PUSH_COS));
            } else if (d(as.ASSEMBLE_PUSH_COS) && (a3 = a(as.ASSEMBLE_PUSH_COS)) != null) {
                c(as.ASSEMBLE_PUSH_COS);
                a3.b();
            }
            if (this.b.d && aw.a(this.a, as.ASSEMBLE_PUSH_FTOS) && bb.d(this.a)) {
                a(as.ASSEMBLE_PUSH_FTOS, ab.a(this.a, as.ASSEMBLE_PUSH_FTOS));
            } else if (d(as.ASSEMBLE_PUSH_FTOS) && (a4 = a(as.ASSEMBLE_PUSH_FTOS)) != null) {
                c(as.ASSEMBLE_PUSH_FTOS);
                a4.b();
            }
        }
        if (this.e.size() > 0) {
            for (a aVar : this.e.values()) {
                if (aVar != null) {
                    aVar.a();
                }
            }
            aw.a(this.a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean b(as asVar) {
        boolean z = false;
        switch (asVar) {
            case ASSEMBLE_PUSH_HUAWEI:
                if (this.b != null) {
                    return this.b.a;
                }
                return false;
            case ASSEMBLE_PUSH_FCM:
                if (this.b != null) {
                    return this.b.b;
                }
                return false;
            case ASSEMBLE_PUSH_COS:
                if (this.b != null) {
                    z = this.b.c;
                    break;
                }
                break;
            case ASSEMBLE_PUSH_FTOS:
                break;
            default:
                return false;
        }
        return this.b != null ? this.b.d : z;
    }
}
