package com.sankuai.xm.im.message;

import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.a;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f extends a {
    public static ChangeQuickRedirect c;
    private d d;

    public static /* synthetic */ void a(f fVar, long j, int i, int i2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "f0be8efd1ecc51127502fdb2201cc566", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "f0be8efd1ecc51127502fdb2201cc566");
            return;
        }
        Map<String, a.C1389a> a = fVar.a();
        if (a == null || a.size() <= 0) {
            return;
        }
        com.sankuai.xm.im.utils.a.b("RetryController::onRetryAllTask time:%d count:%d", Long.valueOf(j), Integer.valueOf(i));
        for (Map.Entry<String, a.C1389a> entry : a.entrySet()) {
            if (fVar.b(entry.getKey()) != a.b.SYNC) {
                a.C1389a value = entry.getValue();
                if (value.c instanceof IMMessage) {
                    IMMessage iMMessage = (IMMessage) entry.getValue().c;
                    if (iMMessage.getCts() < j) {
                        if (iMMessage.getRetries() >= i) {
                            value.g -= com.sankuai.xm.im.localconfig.a.c().h();
                            j.a(value.h);
                            try {
                                fVar.a(entry.getKey(), (IMMessage) entry.getValue().c, value, false);
                            } finally {
                                j.c(value.h);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    public f(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "293c7640b7c2da0b08f53699ebfa2b5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "293c7640b7c2da0b08f53699ebfa2b5b");
        } else {
            this.d = dVar;
        }
    }

    public final void a(String str, IMMessage iMMessage) {
        Object[] objArr = {str, iMMessage};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12a07840443af329d5b6cd8dbdda0cff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12a07840443af329d5b6cd8dbdda0cff");
            return;
        }
        a.C1389a c1389a = new a.C1389a();
        c1389a.b = str;
        c1389a.c = iMMessage;
        c1389a.d = com.sankuai.xm.im.localconfig.a.c().h();
        if (b(c1389a.b) == a.b.NORMAL) {
            c1389a.e = com.sankuai.xm.im.localconfig.a.c().k();
        } else {
            c1389a.e = 6;
        }
        a(c1389a);
    }

    @Override // com.sankuai.xm.im.message.a
    public final void b(a.C1389a c1389a) {
        Object[] objArr = {c1389a};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b762e34acee0d4c8ce5e5d6e37ee4177", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b762e34acee0d4c8ce5e5d6e37ee4177");
        } else if (c1389a == null || !(c1389a.c instanceof IMMessage)) {
        } else {
            IMMessage iMMessage = (IMMessage) c1389a.c;
            if (iMMessage.getRetries() >= c1389a.e - 1 || IMClient.a().m() - iMMessage.getCts() >= com.sankuai.xm.im.localconfig.a.c().j() || !com.sankuai.xm.im.localconfig.a.c().e()) {
                if (IMClient.a().m() - iMMessage.getCts() < com.sankuai.xm.im.localconfig.a.c().j() && com.sankuai.xm.im.localconfig.a.c().e() && b(c1389a.b) == a.b.NORMAL) {
                    return;
                }
                String str = c1389a.b;
                Object[] objArr2 = {str, iMMessage};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd10be2c34889ead05b5bc48a2a9c9f7", 6917529027641081856L)) {
                    switch (b(str)) {
                        case NORMAL:
                            this.d.a(10020, iMMessage.getMsgUuid(), 0L, iMMessage.getCts(), iMMessage.getCategory(), 0L);
                            break;
                        case CANCEL:
                            this.d.a(10020, iMMessage.getMsgUuid());
                            break;
                    }
                } else {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd10be2c34889ead05b5bc48a2a9c9f7");
                }
                com.sankuai.xm.im.utils.a.c("RetryController::onTimer=>TimeOut=>key:%s, current/total retries: %s/ %s, message uuid: %s", c1389a.b, Integer.valueOf(iMMessage.getRetries()), Integer.valueOf(c1389a.e), iMMessage.getMsgUuid());
                if (b(c1389a.b) == a.b.NORMAL) {
                    com.sankuai.xm.threadpool.scheduler.a.b().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.message.f.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "14f83cf5cc0f22695a8353a9ca703b8a", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "14f83cf5cc0f22695a8353a9ca703b8a");
                            } else {
                                ad.a(IMClient.a().f(), (int) R.string.xm_sdk_net_error_send_msg_fail);
                            }
                        }
                    }));
                    return;
                }
                return;
            }
            a(c1389a.b, iMMessage, c1389a, true);
        }
    }

    public final void e() {
        Map<String, a.C1389a> a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "498b384cc2b5abe32871465429060b92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "498b384cc2b5abe32871465429060b92");
        } else if (com.sankuai.xm.im.localconfig.a.c().g() && (a = a()) != null && a.size() > 0) {
            long j = 0;
            for (Map.Entry<String, a.C1389a> entry : a.entrySet()) {
                if (b(entry.getKey()) != a.b.SYNC && (entry.getValue().c instanceof IMMessage)) {
                    IMMessage iMMessage = (IMMessage) entry.getValue().c;
                    if (iMMessage.getCts() > j) {
                        j = iMMessage.getCts();
                    }
                }
            }
            this.b = System.currentTimeMillis();
            a(j + 1, 0, 1);
        }
    }

    public final void a(IMMessage iMMessage) {
        Map<String, a.C1389a> a;
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3677cd5442747731e6f844c05e403e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3677cd5442747731e6f844c05e403e1");
        } else if (com.sankuai.xm.im.localconfig.a.c().f() && iMMessage != null && (a = a()) != null && a.size() > 0) {
            if (this.b <= 0 || System.currentTimeMillis() - this.b >= com.sankuai.xm.im.localconfig.a.c().i()) {
                this.b = System.currentTimeMillis();
                a(iMMessage.getCts(), 1, 2);
            }
        }
    }

    private void a(final long j, final int i, final int i2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "635ff9b40b7c127bd6a9713d180307f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "635ff9b40b7c127bd6a9713d180307f3");
        } else {
            d().a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.im.message.f.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.login.net.taskqueue.base.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e23d78ae8d61e69ed6fd17a40cde1e61", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e23d78ae8d61e69ed6fd17a40cde1e61");
                    } else {
                        f.a(f.this, j, i, i2);
                    }
                }
            });
        }
    }

    private void a(String str, IMMessage iMMessage, a.C1389a c1389a, boolean z) {
        Object[] objArr = {str, iMMessage, c1389a, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1954aad14fc5a9bb468c87effc64e278", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1954aad14fc5a9bb468c87effc64e278");
        } else if (TextUtils.isEmpty(str) || c1389a == null || iMMessage == null) {
        } else {
            if (c1389a.g <= 0 || System.currentTimeMillis() - c1389a.g >= c1389a.d) {
                com.sankuai.xm.im.utils.a.b("RetryController::retry:key:%s ,message uuid: %s retryCount:%d activeRetry:%b cts:%d", str, iMMessage.getMsgUuid(), Integer.valueOf(iMMessage.getRetries()), Boolean.valueOf(z), Long.valueOf(iMMessage.getCts()));
                a.b b = b(str);
                c1389a.g = System.currentTimeMillis();
                iMMessage.setRetries(iMMessage.getRetries() + 1);
                switch (b) {
                    case NORMAL:
                        this.d.a(iMMessage, true);
                        return;
                    case CANCEL:
                        this.d.b(iMMessage, true);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    private a.b b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fb667d7dbee6ffaa5f191d8632b0211", 6917529027641081856L)) {
            return (a.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fb667d7dbee6ffaa5f191d8632b0211");
        }
        if (TextUtils.isEmpty(str)) {
            return a.b.UNKNOWN;
        }
        return a.b.valueOf(str.substring(0, str.indexOf(58)));
    }
}
