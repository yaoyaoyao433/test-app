package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.ew;
import com.xiaomi.push.ey;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ag;
/* loaded from: classes6.dex */
public final class eu extends XMPushService.j {
    final /* synthetic */ et a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(et etVar, int i) {
        super(4);
        this.a = etVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "Handling bind stats";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Throwable] */
    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        eq eqVar;
        int i;
        et etVar = this.a;
        ag.b bVar = etVar.b;
        synchronized (bVar.o) {
            bVar.o.remove(etVar);
        }
        if (!etVar.f || etVar.e == 11) {
            return;
        }
        er c = ey.a.a.c();
        switch (etVar.d) {
            case unbind:
                if (etVar.e != 17) {
                    if (etVar.e != 21) {
                        try {
                            Exception exc = ey.a().c;
                            ew.a(exc);
                            boolean z = exc instanceof fy;
                            Exception exc2 = exc;
                            if (z) {
                                Throwable th = ((fy) exc).a;
                                exc2 = exc;
                                if (th != null) {
                                    exc2 = ((fy) exc).a;
                                }
                            }
                            ew.a aVar = new ew.a();
                            String message = exc2.getMessage();
                            if (exc2.getCause() != null) {
                                message = exc2.getCause().getMessage();
                            }
                            int a = fp.a(exc2);
                            String str = exc2.getClass().getSimpleName() + CommonConstant.Symbol.COLON + message;
                            if (a == 105) {
                                eqVar = eq.BIND_TCP_READ_TIMEOUT;
                            } else if (a == 199) {
                                eqVar = eq.BIND_TCP_ERR;
                            } else if (a == 499) {
                                aVar.a = eq.BIND_BOSH_ERR;
                                if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                                    eqVar = eq.BIND_BOSH_ITEM_NOT_FOUND;
                                }
                                if (aVar.a != eq.BIND_TCP_ERR || aVar.a == eq.BIND_XMPP_ERR || aVar.a == eq.BIND_BOSH_ERR) {
                                    aVar.b = str;
                                }
                                c.b = aVar.a.af;
                                c.g = aVar.b;
                                break;
                            } else {
                                switch (a) {
                                    case 109:
                                        eqVar = eq.BIND_TCP_CONNRESET;
                                        break;
                                    case 110:
                                        eqVar = eq.BIND_TCP_BROKEN_PIPE;
                                        break;
                                    default:
                                        eqVar = eq.BIND_XMPP_ERR;
                                        break;
                                }
                            }
                            aVar.a = eqVar;
                            if (aVar.a != eq.BIND_TCP_ERR) {
                            }
                            aVar.b = str;
                            c.b = aVar.a.af;
                            c.g = aVar.b;
                        } catch (NullPointerException unused) {
                            c = null;
                            break;
                        }
                    } else {
                        i = eq.BIND_TIMEOUT.af;
                    }
                } else {
                    i = eq.BIND_TCP_READ_TIMEOUT.af;
                }
                c.b = i;
                break;
            case binded:
                i = eq.BIND_SUCCESS.af;
                c.b = i;
                break;
        }
        if (c != null) {
            c.e = etVar.c.f();
            c.h = etVar.b.b;
            c.c = 1;
            try {
                c.a((byte) Integer.parseInt(etVar.b.h));
            } catch (NumberFormatException unused2) {
            }
            ey.a.a.a(c);
        }
    }
}
