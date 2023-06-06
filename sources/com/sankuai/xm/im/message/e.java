package com.sankuai.xm.im.message;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imextra.impl.sessionpresent.db.DBSessionMsgSpecialTag;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static void a(SessionId sessionId, long j, long j2, long j3, long j4) {
        Object[] objArr = {sessionId, new Long(j), new Long(j2), new Long(j3), new Long(j4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb220e2585aaf725c79b610c8ea155da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb220e2585aaf725c79b610c8ea155da");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("action", "message_disconnect");
            hashMap.put(DBSessionMsgSpecialTag.CHAT, sessionId == null ? "" : sessionId.f());
            hashMap.put("id", Long.valueOf(j));
            hashMap.put("count", Long.valueOf(j2));
            hashMap.put("seqId", Long.valueOf(j3));
            hashMap.put("search_count", Long.valueOf(j4));
            com.sankuai.xm.monitor.c.a("message_repair", hashMap);
        } catch (Exception e) {
            com.sankuai.xm.im.utils.a.a(e);
        }
    }

    public static void a(SessionId sessionId, long j, int i) {
        Object[] objArr = {sessionId, new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af39389040d21705c5345cb361764d23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af39389040d21705c5345cb361764d23");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("action", "message_history_repair");
            hashMap.put(DBSessionMsgSpecialTag.CHAT, sessionId == null ? "" : sessionId.f());
            hashMap.put("id", Long.valueOf(j));
            hashMap.put("type", Integer.valueOf(i));
            com.sankuai.xm.monitor.c.a("message_repair", hashMap);
        } catch (Exception e) {
            com.sankuai.xm.im.utils.a.a(e);
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4cea12c629a0c80ed6aa2cf92b77688", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4cea12c629a0c80ed6aa2cf92b77688");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("action", "device_changed");
            com.sankuai.xm.monitor.c.a("message_repair", hashMap);
        } catch (Exception e) {
            com.sankuai.xm.im.utils.a.a(e);
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57d748356ed9b3a5f62bc83f1d82d621", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57d748356ed9b3a5f62bc83f1d82d621");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("action", "offline_over");
            com.sankuai.xm.monitor.c.a("message_repair", hashMap);
        } catch (Exception e) {
            com.sankuai.xm.im.utils.a.a(e);
        }
    }
}
