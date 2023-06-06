package com.sankuai.xm.im.message.syncread;

import android.content.ContentValues;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBMessage;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.sankuai.xm.im.cache.f;
import com.sankuai.xm.im.cache.o;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c implements Runnable {
    public static ChangeQuickRedirect a;
    private int b;
    private long c;
    private long d;
    private Callback<List<com.sankuai.xm.im.session.entry.a>> e;
    private g f;

    public c(int i, long j, long j2, Callback<List<com.sankuai.xm.im.session.entry.a>> callback) {
        Object[] objArr = {Integer.valueOf(i), 2592000000L, new Long(j2), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c147e7165757f3b08e65ff67a9a4d08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c147e7165757f3b08e65ff67a9a4d08");
            return;
        }
        this.b = i;
        this.c = 2592000000L;
        this.d = j2;
        this.e = callback;
        this.f = j.a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf4a22b8285718cc770a8b203cdf0dab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf4a22b8285718cc770a8b203cdf0dab");
            return;
        }
        try {
            j.a(this.f);
            char c = 1;
            boolean z = true;
            if (this.c <= this.d) {
                StringBuilder sb = new StringBuilder("UpdateExpiredUnreadTask::task not need execute:");
                if (this.c > this.d) {
                    z = false;
                }
                sb.append(z);
                sb.append(", type:");
                sb.append(this.b);
                com.sankuai.xm.im.utils.a.b(sb.toString(), new Object[0]);
                com.sankuai.xm.base.callback.a.a(this.e, null);
                j.c(this.f);
                return;
            }
            com.sankuai.xm.base.db.c bR_ = DBProxy.l().bR_();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            DBProxy.l().a(bR_);
            final long a2 = com.sankuai.xm.login.c.a().a(System.currentTimeMillis()) - this.d;
            int[] a3 = a(this.b);
            List<DBSession> a4 = DBProxy.l().m.a(a2, true, a(this.b));
            if (!com.sankuai.xm.base.util.b.a(a4)) {
                for (DBSession dBSession : a4) {
                    sb2.append(dBSession.toString());
                    sb2.append(CommonConstant.Symbol.COMMA);
                    dBSession.setUnRead(0);
                    if (dBSession.getMsgStatus() == 7) {
                        dBSession.setMsgStatus(9);
                    }
                    arrayList.add(MessageUtils.dbSessionToSession(dBSession));
                    o.b.a.a(SessionId.a(dBSession));
                }
                DBProxy.l().m.a((com.sankuai.xm.base.db.c) null, a4, (Callback<List<DBSession>>) null);
                com.sankuai.xm.im.utils.a.b("UpdateExpiredUnreadTask::expires=" + a4.size() + ",max = " + a2, new Object[0]);
            }
            if (a3 != null) {
                int length = a3.length;
                int i = 0;
                while (i < length) {
                    final int i2 = a3[i];
                    final f fVar = DBProxy.l().k;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Integer.valueOf(i2);
                    objArr2[c] = new Long(a2);
                    ChangeQuickRedirect changeQuickRedirect2 = f.a;
                    if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "0399a23c18d1a92c744248b5b7b125b4", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "0399a23c18d1a92c744248b5b7b125b4");
                        obj = null;
                    } else {
                        obj = null;
                        fVar.d.a(j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.13
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z2 = false;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6b3bda21d32ac5353d8302e0586dc700", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6b3bda21d32ac5353d8302e0586dc700");
                                    return;
                                }
                                f fVar2 = fVar;
                                int i3 = i2;
                                long j = a2;
                                Object[] objArr4 = {Integer.valueOf(i3), new Long(j)};
                                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                                if (PatchProxy.isSupport(objArr4, fVar2, changeQuickRedirect4, false, "efae83eddb784eaabd871f5f75f89e40", 6917529027641081856L)) {
                                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, fVar2, changeQuickRedirect4, false, "efae83eddb784eaabd871f5f75f89e40")).booleanValue();
                                } else {
                                    c cVar = new c();
                                    cVar.a = "msgStatus=? AND category=? AND sts<=?";
                                    cVar.b = new String[]{"7", String.valueOf(i3), String.valueOf(j)};
                                    com.sankuai.xm.base.db.c bR_2 = fVar2.d.bR_();
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put(Message.MSG_STATUS, (Integer) 9);
                                    if (bR_2.a(fVar2.b(i3), contentValues, cVar.a, cVar.b) > 0) {
                                        z2 = true;
                                    }
                                }
                                if (z2) {
                                    synchronized (fVar.b) {
                                        if (!fVar.e.isEmpty()) {
                                            for (Map.Entry<String, a> entry : fVar.e.entrySet()) {
                                                a value = entry.getValue();
                                                if (value.b.e == i2 && value.f <= a2) {
                                                    for (Map.Entry<String, DBMessage> entry2 : value.e.entrySet()) {
                                                        if (entry2.getValue().getSts() <= a2) {
                                                            entry2.getValue().setMsgStatus(9);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }), (Callback) null);
                    }
                    i++;
                    c = 1;
                }
            }
            DBProxy.l().b(bR_);
            DBProxy.l().c(bR_);
            com.sankuai.xm.im.utils.a.b("UpdateExpiredUnreadTask::changed:list.size:" + arrayList.size() + ", old = " + ((Object) sb2) + ", type = " + this.b, new Object[0]);
            com.sankuai.xm.base.callback.a.a(this.e, arrayList);
            j.c(this.f);
        } catch (Throwable th) {
            j.a(this.f, th);
            throw th;
        }
    }

    private int[] a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0faf46372873fc2be22b51722cc2e053", 6917529027641081856L)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0faf46372873fc2be22b51722cc2e053");
        }
        switch (i) {
            case 1:
            case 5:
                return new int[]{1, 9, 2};
            case 2:
            case 6:
                return new int[]{3, 10, 11};
            case 3:
            case 4:
            default:
                return null;
        }
    }
}
