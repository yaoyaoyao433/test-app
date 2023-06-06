package com.sankuai.xm.im.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.annotation.NonNull;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.bean.DBMessage;
import com.sankuai.xm.im.cache.bean.DBSyncRead;
import com.sankuai.xm.im.cache.bean.GroupDBMessage;
import com.sankuai.xm.im.cache.bean.PersonalDBMessage;
import com.sankuai.xm.im.cache.bean.PubDBMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.login.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f {
    public static ChangeQuickRedirect a;
    final Object b;
    final Object c;
    public DBProxy d;
    HashMap<String, a> e;
    HashMap<String, Long> f;
    Map<String, List<d>> g;
    volatile boolean h;
    long i;
    int j;
    b k;
    volatile long l;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String b(int r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.im.cache.f.a
            java.lang.String r10 = "6a83d1fb989ea57ad6af12926ff9982b"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L22:
            java.lang.String r0 = ""
            switch(r12) {
                case 1: goto L31;
                case 2: goto L2e;
                case 3: goto L2b;
                default: goto L27;
            }
        L27:
            switch(r12) {
                case 9: goto L31;
                case 10: goto L2b;
                case 11: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L33
        L2b:
            java.lang.String r0 = "pub_msg_info"
            goto L33
        L2e:
            java.lang.String r0 = "grp_msg_info"
            goto L33
        L31:
            java.lang.String r0 = "msg_info"
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.f.b(int):java.lang.String");
    }

    public static /* synthetic */ void a(f fVar, Callback callback, DBMessage dBMessage) {
        Object[] objArr = {callback, dBMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "887a2b1bf1e68fe31faea3270dbc841e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "887a2b1bf1e68fe31faea3270dbc841e");
        } else if (callback != null) {
            callback.onSuccess(dBMessage);
        }
    }

    public static /* synthetic */ void a(f fVar, Callback callback, String str) {
        Object[] objArr = {callback, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "a9f48f44bd61efeb611a8f812a256865", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "a9f48f44bd61efeb611a8f812a256865");
        } else if (callback != null) {
            callback.onFailure(10019, str);
        }
    }

    public static /* synthetic */ void a(f fVar, com.sankuai.xm.base.db.c cVar, String str, int i) {
        Object[] objArr = {cVar, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "a463413e648480a6d4c6f0551ef4907b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "a463413e648480a6d4c6f0551ef4907b");
            return;
        }
        Cursor cursor = null;
        try {
            Cursor a2 = cVar.a("select count(1) from " + str, null);
            if (a2 != null) {
                try {
                    if (a2.getCount() > 0) {
                        a2.moveToFirst();
                        com.sankuai.xm.im.cache.c.a(a2.getInt(0), i);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = a2;
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (a2 == null || a2.isClosed()) {
                return;
            }
            a2.close();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static /* synthetic */ void a(f fVar, DBMessage dBMessage) {
        Object[] objArr = {dBMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "bf331681ae2e5180b5d9a3d0da3da588", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "bf331681ae2e5180b5d9a3d0da3da588");
            return;
        }
        SessionId a2 = SessionId.a(dBMessage);
        synchronized (fVar.b) {
            a aVar = fVar.e.get(a2.f());
            if (aVar != null && aVar.d != -1) {
                Object[] objArr2 = {dBMessage, (byte) 1};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "31374489f96571d02fc811316c7d3b3d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "31374489f96571d02fc811316c7d3b3d");
                } else if (aVar.e.containsKey(dBMessage.getMsgUuid())) {
                    aVar.e.put(dBMessage.getMsgUuid(), dBMessage);
                    aVar.a();
                    if (dBMessage.getSts() < aVar.f) {
                        aVar.f = dBMessage.getSts();
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(f fVar, DBMessage dBMessage, boolean z) {
        int i = 0;
        Object[] objArr = {dBMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "f4ba8730c2de5677ad8c1cd9e700c89f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "f4ba8730c2de5677ad8c1cd9e700c89f");
            return;
        }
        SessionId a2 = SessionId.a(dBMessage);
        synchronized (fVar.b) {
            a aVar = fVar.e.get(a2.f());
            if (aVar != null && aVar.d != -1) {
                if (z) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "b3cc48b3c5ac43a537cdab94607f6f9b", 6917529027641081856L)) {
                        i = ((Integer) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "b3cc48b3c5ac43a537cdab94607f6f9b")).intValue();
                    } else if (aVar.e != null) {
                        i = aVar.e.size();
                    }
                    if (i > 0 && dBMessage.getSts() <= aVar.f) {
                        if (aVar.d == 0) {
                            aVar.d = (short) 1;
                        }
                    }
                }
                aVar.a(dBMessage, true);
            }
        }
    }

    public static /* synthetic */ void a(f fVar, SessionId sessionId, long j, long j2) {
        Object[] objArr = {sessionId, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "51ead80016c9fa9fd048ce25d83c1a34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "51ead80016c9fa9fd048ce25d83c1a34");
            return;
        }
        synchronized (fVar.b) {
            if (fVar.e.containsKey(sessionId.f())) {
                for (Map.Entry<String, DBMessage> entry : fVar.e.get(sessionId.f()).e.entrySet()) {
                    DBMessage value = entry.getValue();
                    if (value != null && value.getMsgStatus() == 7) {
                        long sts = value.getSts();
                        if (sts <= j2 && sts >= j) {
                            value.setMsgStatus(9);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3 A[Catch: all -> 0x029d, Exception -> 0x02a2, TryCatch #8 {Exception -> 0x02a2, all -> 0x029d, blocks: (B:26:0x0068, B:28:0x0071, B:29:0x0075, B:31:0x007d, B:33:0x008d, B:38:0x0099, B:40:0x00a3, B:41:0x00b4, B:42:0x00be, B:44:0x00c4, B:46:0x00d4, B:49:0x00dc, B:50:0x00ed), top: B:133:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4 A[Catch: all -> 0x029d, Exception -> 0x02a2, TryCatch #8 {Exception -> 0x02a2, all -> 0x029d, blocks: (B:26:0x0068, B:28:0x0071, B:29:0x0075, B:31:0x007d, B:33:0x008d, B:38:0x0099, B:40:0x00a3, B:41:0x00b4, B:42:0x00be, B:44:0x00c4, B:46:0x00d4, B:49:0x00dc, B:50:0x00ed), top: B:133:0x0068 }] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.xm.im.cache.f r29, final java.lang.String[] r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.f.a(com.sankuai.xm.im.cache.f, java.lang.String[], boolean):void");
    }

    public static /* synthetic */ void a(f fVar, short[] sArr, int[] iArr) {
        Object[] objArr = {sArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "eb67e8e6fea01fcdc206c155ec1ee53e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "eb67e8e6fea01fcdc206c155ec1ee53e");
            return;
        }
        synchronized (fVar.b) {
            try {
                if (sArr == null && iArr == null) {
                    fVar.e.clear();
                } else {
                    if (sArr != null) {
                        Arrays.sort(sArr);
                        if (Arrays.binarySearch(sArr, (short) -1) != -1) {
                            sArr = null;
                        }
                    }
                    if (iArr != null) {
                        Arrays.sort(iArr);
                    }
                    Iterator<Map.Entry<String, a>> it = fVar.e.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, a> next = it.next();
                        if (sArr == null || Arrays.binarySearch(sArr, next.getValue().b.g) >= 0) {
                            if (iArr == null || Arrays.binarySearch(iArr, next.getValue().b.e) >= 0) {
                                it.remove();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean a(com.sankuai.xm.im.cache.f r12, com.sankuai.xm.im.cache.bean.DBMessage r13, java.lang.String[] r14, com.sankuai.xm.base.tinyorm.b r15) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            r9 = 1
            r0[r9] = r14
            r1 = 2
            r0[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.xm.im.cache.f.a
            java.lang.String r11 = "55771ac4c595ca69c5ca85f69fdc1842"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L28
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L28:
            com.sankuai.xm.im.cache.DBProxy r12 = r12.d
            com.sankuai.xm.base.db.c r12 = r12.bR_()
            int r0 = r13.getCategory()
            switch(r0) {
                case 1: goto L54;
                case 2: goto L47;
                case 3: goto L39;
                default: goto L35;
            }
        L35:
            switch(r0) {
                case 9: goto L54;
                case 10: goto L39;
                case 11: goto L39;
                default: goto L38;
            }
        L38:
            goto L61
        L39:
            com.sankuai.xm.im.cache.bean.PubDBMessage r13 = (com.sankuai.xm.im.cache.bean.PubDBMessage) r13
            com.sankuai.xm.base.tinyorm.f r0 = com.sankuai.xm.base.tinyorm.f.a()
            int r12 = r0.a(r12, r13, r14, r15)
            if (r12 <= 0) goto L61
        L45:
            r8 = 1
            goto L61
        L47:
            com.sankuai.xm.im.cache.bean.GroupDBMessage r13 = (com.sankuai.xm.im.cache.bean.GroupDBMessage) r13
            com.sankuai.xm.base.tinyorm.f r0 = com.sankuai.xm.base.tinyorm.f.a()
            int r12 = r0.a(r12, r13, r14, r15)
            if (r12 <= 0) goto L61
            goto L45
        L54:
            com.sankuai.xm.im.cache.bean.PersonalDBMessage r13 = (com.sankuai.xm.im.cache.bean.PersonalDBMessage) r13
            com.sankuai.xm.base.tinyorm.f r0 = com.sankuai.xm.base.tinyorm.f.a()
            int r12 = r0.a(r12, r13, r14, r15)
            if (r12 <= 0) goto L61
            goto L45
        L61:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.f.a(com.sankuai.xm.im.cache.f, com.sankuai.xm.im.cache.bean.DBMessage, java.lang.String[], com.sankuai.xm.base.tinyorm.b):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean b(com.sankuai.xm.im.cache.f r11, com.sankuai.xm.im.cache.bean.DBMessage r12, java.lang.String[] r13, com.sankuai.xm.base.tinyorm.b r14) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.im.cache.f.a
            java.lang.String r10 = "6890966fce20b593630c84e5a68d2f9b"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L28
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L28:
            if (r12 != 0) goto L32
            java.lang.String r11 = "MessageDBProxy.addOrUpdateOnQueue: DBMessage is null"
            java.lang.Object[] r12 = new java.lang.Object[r8]
            com.sankuai.xm.im.utils.a.d(r11, r12)
            return r8
        L32:
            com.sankuai.xm.im.cache.DBProxy r11 = r11.d
            com.sankuai.xm.base.db.c r11 = r11.bR_()
            int r0 = r12.getCategory()
            switch(r0) {
                case 1: goto L59;
                case 2: goto L4e;
                case 3: goto L43;
                default: goto L3f;
            }
        L3f:
            switch(r0) {
                case 9: goto L59;
                case 10: goto L43;
                case 11: goto L43;
                default: goto L42;
            }
        L42:
            goto L63
        L43:
            com.sankuai.xm.im.cache.bean.PubDBMessage r12 = (com.sankuai.xm.im.cache.bean.PubDBMessage) r12
            com.sankuai.xm.base.tinyorm.f r0 = com.sankuai.xm.base.tinyorm.f.a()
            boolean r8 = r0.b(r11, r12, r13, r14)
            goto L63
        L4e:
            com.sankuai.xm.im.cache.bean.GroupDBMessage r12 = (com.sankuai.xm.im.cache.bean.GroupDBMessage) r12
            com.sankuai.xm.base.tinyorm.f r0 = com.sankuai.xm.base.tinyorm.f.a()
            boolean r8 = r0.b(r11, r12, r13, r14)
            goto L63
        L59:
            com.sankuai.xm.im.cache.bean.PersonalDBMessage r12 = (com.sankuai.xm.im.cache.bean.PersonalDBMessage) r12
            com.sankuai.xm.base.tinyorm.f r0 = com.sankuai.xm.base.tinyorm.f.a()
            boolean r8 = r0.b(r11, r12, r13, r14)
        L63:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.f.b(com.sankuai.xm.im.cache.f, com.sankuai.xm.im.cache.bean.DBMessage, java.lang.String[], com.sankuai.xm.base.tinyorm.b):boolean");
    }

    public f(DBProxy dBProxy) {
        Object[] objArr = {dBProxy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26cdbd565da3986b008393f18b6b7ab0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26cdbd565da3986b008393f18b6b7ab0");
            return;
        }
        this.b = new Object();
        this.c = new Object();
        this.e = new HashMap<>();
        this.d = dBProxy;
    }

    public final void a(HashMap<String, DBSyncRead> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b15ec2e446f6a71f8b56708ece1d0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b15ec2e446f6a71f8b56708ece1d0f");
        } else if (hashMap != null) {
            synchronized (this.c) {
                if (this.f == null) {
                    this.f = new HashMap<>();
                }
                this.f.clear();
                for (Map.Entry<String, DBSyncRead> entry : hashMap.entrySet()) {
                    this.f.put(entry.getKey(), Long.valueOf(entry.getValue().getRsts()));
                }
            }
        }
    }

    private long i(SessionId sessionId) {
        Long l;
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6486f5979ec262ebf47067c6245afc6f", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6486f5979ec262ebf47067c6245afc6f")).longValue();
        }
        if (sessionId == null) {
            return 0L;
        }
        synchronized (this.c) {
            l = this.f != null ? this.f.get(String.valueOf(sessionId.f())) : null;
        }
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Boolean] */
    public final boolean a(final List<DBMessage> list, final int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fb4ebc263af87fbca69e21e0a19cec5", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fb4ebc263af87fbca69e21e0a19cec5")).booleanValue();
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        bVar.c = Boolean.FALSE;
        this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.26
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.Boolean] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a15e035cb400aadbb87c1f56ba902b89", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a15e035cb400aadbb87c1f56ba902b89");
                } else if (f.this.a(list)) {
                    if (i == 1 || i == 5 || i == 7) {
                        for (DBMessage dBMessage : list) {
                            f.a(f.this, dBMessage, true);
                        }
                    } else {
                        for (DBMessage dBMessage2 : list) {
                            f.a(f.this, dBMessage2, false);
                        }
                    }
                    bVar.c = Boolean.TRUE;
                } else {
                    com.sankuai.xm.im.utils.a.c("MessageDBProxy::::add addOnQueue failed!", new Object[0]);
                }
            }
        }), true, (Callback) null);
        return ((Boolean) bVar.c).booleanValue();
    }

    public final void a(DBMessage dBMessage, Callback<DBMessage> callback) {
        Object[] objArr = {dBMessage, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65bb9d957624437996decf348dc8b62c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65bb9d957624437996decf348dc8b62c");
        } else {
            a(dBMessage, (String[]) null, callback);
        }
    }

    public final DBMessage a(final DBMessage dBMessage, final String[] strArr) {
        Object[] objArr = {dBMessage, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7544547290097e619c9a043321d87714", 6917529027641081856L)) {
            return (DBMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7544547290097e619c9a043321d87714");
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.33
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r0v3, types: [com.sankuai.xm.im.cache.bean.DBMessage, T] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "daa1ffd467b93329a34847301bb81be9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "daa1ffd467b93329a34847301bb81be9");
                    return;
                }
                com.sankuai.xm.base.tinyorm.b bVar2 = new com.sankuai.xm.base.tinyorm.b();
                if (f.a(f.this, dBMessage, com.sankuai.xm.base.util.b.b(strArr) ? null : strArr, bVar2)) {
                    ?? r0 = (DBMessage) bVar2.c;
                    f.a(f.this, (DBMessage) r0);
                    bVar.c = r0;
                }
            }
        }), true, (Callback) null);
        return (DBMessage) bVar.c;
    }

    public final void a(final DBMessage dBMessage, final String[] strArr, final Callback<DBMessage> callback) {
        Object[] objArr = {dBMessage, strArr, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80386c1f8ec099a71873f2b6fafa33a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80386c1f8ec099a71873f2b6fafa33a8");
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.34
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ede2fc35b4aad186d54ba400fcc7c93a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ede2fc35b4aad186d54ba400fcc7c93a");
                        return;
                    }
                    com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
                    if (f.a(f.this, dBMessage, strArr, bVar)) {
                        DBMessage dBMessage2 = (DBMessage) bVar.c;
                        f.a(f.this, dBMessage2);
                        f.a(f.this, callback, dBMessage2);
                        return;
                    }
                    f.a(f.this, callback, "更新消息失败");
                }
            }), callback);
        }
    }

    public final void b(final DBMessage dBMessage, final String[] strArr, final Callback<DBMessage> callback) {
        Object[] objArr = {dBMessage, strArr, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5612671d1689c4f6f8a326d385d202b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5612671d1689c4f6f8a326d385d202b3");
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.35
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                @Trace(name = "save_msg", type = com.sankuai.xm.base.trace.i.normal)
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d33cd61a33f39b37f9e9d72f032d207e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d33cd61a33f39b37f9e9d72f032d207e");
                        return;
                    }
                    try {
                        com.sankuai.xm.base.trace.j.a(com.sankuai.xm.base.trace.i.normal, "save_msg", (String[]) null, new Object[0]);
                        com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
                        if (f.b(f.this, dBMessage, strArr, bVar)) {
                            DBMessage dBMessage2 = (DBMessage) bVar.c;
                            f.a(f.this, dBMessage2, false);
                            f.a(f.this, callback, dBMessage2);
                        } else {
                            f.a(f.this, callback, "添加消息失败");
                        }
                        com.sankuai.xm.base.trace.j.a((Object) null);
                    } catch (Throwable th) {
                        com.sankuai.xm.base.trace.j.a(th);
                        throw th;
                    }
                }
            }), callback);
        }
    }

    public final DBMessage a(final DBMessage dBMessage) {
        Object[] objArr = {dBMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28e30a862ee02544792250d6005bfccb", 6917529027641081856L)) {
            return (DBMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28e30a862ee02544792250d6005bfccb");
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r1v5, types: [com.sankuai.xm.im.cache.bean.DBMessage, T] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95175fc13d0a725f0009e7265e260c35", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95175fc13d0a725f0009e7265e260c35");
                    return;
                }
                com.sankuai.xm.base.tinyorm.b bVar2 = new com.sankuai.xm.base.tinyorm.b();
                if (f.b(f.this, dBMessage, (String[]) null, bVar2)) {
                    f.a(f.this, (DBMessage) bVar2.c, false);
                    bVar.c = dBMessage;
                }
            }
        }), true, (Callback) null);
        return (DBMessage) bVar.c;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.Boolean] */
    public final boolean a(final int i, SessionId sessionId, final String str) {
        boolean z;
        boolean booleanValue;
        Object[] objArr = {Integer.valueOf(i), sessionId, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8c51304a91f803930dc6097bc5737f9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8c51304a91f803930dc6097bc5737f9")).booleanValue();
        }
        synchronized (this.b) {
            z = (h(sessionId) && this.e.get(sessionId.f()).e.containsKey(str)) ? false : false;
            z = true;
        }
        if (z) {
            Object[] objArr2 = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22856dbf68cdb63d13ee4081fba643ad", 6917529027641081856L)) {
                booleanValue = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22856dbf68cdb63d13ee4081fba643ad")).booleanValue();
            } else {
                final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
                bVar.c = Boolean.FALSE;
                this.d.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.21
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
                    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
                    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Boolean] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            r11 = this;
                            r0 = 0
                            java.lang.Object[] r8 = new java.lang.Object[r0]
                            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.im.cache.f.AnonymousClass21.a
                            java.lang.String r10 = "94787dcf0f1636845de84eb0b568f427"
                            r4 = 0
                            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                            r1 = r8
                            r2 = r11
                            r3 = r9
                            r5 = r10
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                            if (r1 == 0) goto L18
                            com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
                            return
                        L18:
                            r0 = 0
                            int r1 = r2
                            switch(r1) {
                                case 1: goto L30;
                                case 2: goto L2a;
                                case 3: goto L22;
                                default: goto L1e;
                            }
                        L1e:
                            switch(r1) {
                                case 9: goto L30;
                                case 10: goto L22;
                                case 11: goto L22;
                                default: goto L21;
                            }
                        L21:
                            goto L37
                        L22:
                            com.sankuai.xm.im.cache.bean.PubDBMessage r0 = new com.sankuai.xm.im.cache.bean.PubDBMessage
                            int r1 = r2
                            r0.<init>(r1)
                            goto L37
                        L2a:
                            com.sankuai.xm.im.cache.bean.GroupDBMessage r0 = new com.sankuai.xm.im.cache.bean.GroupDBMessage
                            r0.<init>()
                            goto L37
                        L30:
                            com.sankuai.xm.im.cache.bean.PersonalDBMessage r0 = new com.sankuai.xm.im.cache.bean.PersonalDBMessage
                            int r1 = r2
                            r0.<init>(r1)
                        L37:
                            if (r0 == 0) goto L5b
                            java.lang.String r1 = r3
                            r0.setMsgUuid(r1)
                            int r1 = r2
                            r0.setCategory(r1)
                            com.sankuai.xm.im.cache.f r1 = com.sankuai.xm.im.cache.f.this
                            com.sankuai.xm.im.cache.DBProxy r1 = r1.d
                            com.sankuai.xm.base.db.c r1 = r1.bR_()
                            com.sankuai.xm.base.tinyorm.f r2 = com.sankuai.xm.base.tinyorm.f.a()
                            boolean r0 = r2.c(r1, r0)
                            com.sankuai.xm.base.tinyorm.b r1 = r4
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                            r1.c = r0
                        L5b:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.f.AnonymousClass21.run():void");
                    }
                }));
                booleanValue = ((Boolean) bVar.c).booleanValue();
            }
            if (!booleanValue) {
                return false;
            }
        }
        return true;
    }

    public final DBMessage a(final int i, final String str, boolean z) {
        DBMessage dBMessage;
        Object[] objArr = {Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e388bdf5a5eff86efbaed41c3e0ea29f", 6917529027641081856L)) {
            return (DBMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e388bdf5a5eff86efbaed41c3e0ea29f");
        }
        synchronized (this.b) {
            for (Map.Entry<String, a> entry : this.e.entrySet()) {
                if (entry.getValue().b.e == i && (dBMessage = entry.getValue().e.get(str)) != null) {
                    return dBMessage;
                }
            }
            if (z) {
                final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
                this.d.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.4
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        T t;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38482a85991b1c75147dbe04f614386c", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38482a85991b1c75147dbe04f614386c");
                            return;
                        }
                        f fVar = f.this;
                        int i2 = i;
                        String str2 = str;
                        Object[] objArr3 = {Integer.valueOf(i2), str2};
                        ChangeQuickRedirect changeQuickRedirect3 = f.a;
                        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "e5fd34bf68c0e1109783bb9d679fc4f1", 6917529027641081856L)) {
                            t = (DBMessage) PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "e5fd34bf68c0e1109783bb9d679fc4f1");
                        } else {
                            DBMessage dBMessage2 = null;
                            Cursor a2 = fVar.d.bR_().a(fVar.b(i2), null, "msgUuid=?", new String[]{str2}, null, null, null);
                            Class a3 = fVar.a(i2);
                            if (a2 != null) {
                                if (a2.getCount() > 0) {
                                    a2.moveToFirst();
                                    dBMessage2 = (DBMessage) com.sankuai.xm.base.tinyorm.f.a().a(a3, a2);
                                }
                                a2.close();
                            }
                            t = dBMessage2;
                        }
                        bVar.c = t;
                    }
                }));
                return (DBMessage) bVar.c;
            }
            return null;
        }
    }

    public final DBMessage a(final int i, final long j, boolean z) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e113a1b3ca23069f9e8b1de39fa9e39d", 6917529027641081856L)) {
            return (DBMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e113a1b3ca23069f9e8b1de39fa9e39d");
        }
        synchronized (this.b) {
            for (Map.Entry<String, a> entry : this.e.entrySet()) {
                if (entry.getValue().b.e == i) {
                    for (DBMessage dBMessage : entry.getValue().e.values()) {
                        if (dBMessage.getMsgId() == j) {
                            return dBMessage;
                        }
                    }
                    continue;
                }
            }
            final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
            this.d.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.5
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    T t;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "504e28667da970a9d0170f8b95f50f36", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "504e28667da970a9d0170f8b95f50f36");
                        return;
                    }
                    f fVar = f.this;
                    int i2 = i;
                    long j2 = j;
                    Object[] objArr3 = {Integer.valueOf(i2), new Long(j2)};
                    ChangeQuickRedirect changeQuickRedirect3 = f.a;
                    if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "b10cbc375468d6646020f4e31336f296", 6917529027641081856L)) {
                        t = (DBMessage) PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "b10cbc375468d6646020f4e31336f296");
                    } else {
                        DBMessage dBMessage2 = null;
                        Cursor a2 = fVar.d.bR_().a(fVar.b(i2), null, "msgId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                        Class a3 = fVar.a(i2);
                        if (a2 != null) {
                            if (a2.getCount() > 0) {
                                a2.moveToFirst();
                                dBMessage2 = (DBMessage) com.sankuai.xm.base.tinyorm.f.a().a(a3, a2);
                            }
                            a2.close();
                        }
                        t = dBMessage2;
                    }
                    bVar.c = t;
                }
            }));
            return (DBMessage) bVar.c;
        }
    }

    public final List<DBMessage> a(final SessionId sessionId, final long j, final long j2, final int i) {
        Object[] objArr = {sessionId, new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb4c70675d5b03c531b1b151e51d1466", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb4c70675d5b03c531b1b151e51d1466");
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.d.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.7
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, T] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e593d24f66b2fa294ca377d0a3bc093a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e593d24f66b2fa294ca377d0a3bc093a");
                } else {
                    bVar.c = f.this.b(sessionId, j, j2, i);
                }
            }
        }));
        return (List) bVar.c;
    }

    public final int a(SessionId sessionId) {
        int i = 0;
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06fc8cf0266310f5cafe6014163b18a8", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06fc8cf0266310f5cafe6014163b18a8")).intValue();
        }
        synchronized (this.b) {
            a aVar = this.e.get(sessionId.f());
            if (aVar != null && aVar.e != null) {
                i = aVar.e.size();
            }
        }
        return i;
    }

    public final long b(SessionId sessionId) {
        long j;
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f66d4250a040ead9cac8ec34e4ad896d", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f66d4250a040ead9cac8ec34e4ad896d")).longValue();
        }
        synchronized (this.b) {
            a aVar = this.e.get(sessionId.f());
            j = (aVar == null || aVar.e == null) ? 0L : aVar.f;
        }
        return j;
    }

    public final List<DBMessage> a(final SessionId sessionId, final long j, final long j2, final int i, final short s) {
        Object[] objArr = {sessionId, new Long(j), new Long(j2), Integer.valueOf(i), Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c6be43123232eb98ab2eafa2c90e3c5", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c6be43123232eb98ab2eafa2c90e3c5");
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.d.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.8
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, T] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dea4917c9373e430d6fa6dc7b265461a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dea4917c9373e430d6fa6dc7b265461a");
                    return;
                }
                ?? b2 = f.this.b(sessionId, j, j2, i, s);
                if (b2 != 0) {
                    com.sankuai.xm.im.utils.c.a((List<? extends Message>) b2, true);
                }
                bVar.c = b2;
            }
        }));
        return (List) bVar.c;
    }

    public final DBMessage c(final SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17e913d660f40bf3f32e6d2e9d34aaa5", 6917529027641081856L)) {
            return (DBMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17e913d660f40bf3f32e6d2e9d34aaa5");
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.d.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.10
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r0v4, types: [com.sankuai.xm.im.cache.bean.DBMessage, T] */
            /* JADX WARN: Type inference failed for: r2v6 */
            /* JADX WARN: Type inference failed for: r2v7, types: [com.sankuai.xm.im.cache.bean.DBMessage, T] */
            /* JADX WARN: Type inference failed for: r2v8 */
            /* JADX WARN: Type inference failed for: r2v9 */
            @Override // java.lang.Runnable
            public final void run() {
                a aVar;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d1eb1c8a874289f608b96f87d08755a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d1eb1c8a874289f608b96f87d08755a");
                    return;
                }
                synchronized (f.this.b) {
                    if (f.this.h(sessionId) && (aVar = f.this.e.get(sessionId.f())) != null && aVar.e.size() > 0) {
                        ?? r2 = 0;
                        for (DBMessage dBMessage : aVar.e.values()) {
                            if (dBMessage.getMsgStatus() != 13 && (r2 == 0 || r2.getSts() < dBMessage.getSts() || (r2.getSts() == dBMessage.getSts() && r2.getMsgId() < dBMessage.getMsgId()))) {
                                r2 = dBMessage;
                            }
                        }
                        if (r2 != 0) {
                            bVar.c = r2;
                            return;
                        }
                    }
                    bVar.c = f.this.g(sessionId);
                }
            }
        }));
        return (DBMessage) bVar.c;
    }

    public final void d(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1107e42a465d44ae32c1723c3ae9c639", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1107e42a465d44ae32c1723c3ae9c639");
            return;
        }
        synchronized (this.b) {
            if (h(sessionId)) {
                final a aVar = this.e.get(sessionId.f());
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d79b8d7a2bfaccafd2c8ea202d3e078a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d79b8d7a2bfaccafd2c8ea202d3e078a");
                } else if (aVar.e.size() > 100) {
                    ArrayList arrayList = new ArrayList(aVar.e.entrySet());
                    Collections.sort(arrayList, new Comparator<Map.Entry<String, DBMessage>>() { // from class: com.sankuai.xm.im.cache.f.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(Map.Entry<String, DBMessage> entry, Map.Entry<String, DBMessage> entry2) {
                            Map.Entry<String, DBMessage> entry3 = entry;
                            Map.Entry<String, DBMessage> entry4 = entry2;
                            Object[] objArr3 = {entry3, entry4};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f56a28d1beb7f0ba56c716e63b8e2c18", 6917529027641081856L)) {
                                return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f56a28d1beb7f0ba56c716e63b8e2c18")).intValue();
                            }
                            if (entry3.getValue().getSts() < entry4.getValue().getSts()) {
                                return 1;
                            }
                            return entry3.getValue().getSts() == entry4.getValue().getSts() ? 0 : -1;
                        }
                    });
                    for (int i = 50; i < arrayList.size(); i++) {
                        aVar.e.remove(((Map.Entry) arrayList.get(i)).getKey());
                    }
                    aVar.f = ((DBMessage) ((Map.Entry) arrayList.get(49)).getValue()).getSts();
                    aVar.g = false;
                    aVar.d = (short) 1;
                }
            }
        }
    }

    public final List<DBMessage> e(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5872c7373aaa1a2d804e33b43607d1dd", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5872c7373aaa1a2d804e33b43607d1dd");
        }
        synchronized (this.b) {
            if (h(sessionId)) {
                a aVar = this.e.get(sessionId.f());
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                return PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "011e16c794a5a126d45c5346801b379c", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "011e16c794a5a126d45c5346801b379c") : new ArrayList(aVar.e.values());
            }
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.Integer] */
    public final int a(final SessionId sessionId, long j) {
        long j2;
        boolean z;
        long j3 = j;
        Object[] objArr = {sessionId, new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978a23a2ddd94d759fe6e713846e8698", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978a23a2ddd94d759fe6e713846e8698")).intValue();
        }
        HashMap hashMap = null;
        synchronized (this.b) {
            if (!h(sessionId)) {
                c(sessionId, 0L, 0L, 100);
            }
            if (h(sessionId)) {
                a aVar = this.e.get(sessionId.f());
                hashMap = new HashMap();
                hashMap.putAll(aVar.e);
                j2 = aVar.f;
                z = aVar.g || aVar.d == 0;
            } else {
                j2 = 0;
            }
        }
        if (hashMap == null || hashMap.isEmpty()) {
            com.sankuai.xm.im.utils.a.b("MessageDBProxy::::calculateUnread, unreadAllLoad:" + z + ", db no message of this session, session = " + sessionId.f(), new Object[0]);
            return 0;
        }
        if (!z && j3 == 0) {
            j3 = f(sessionId);
        }
        if (z || j2 <= j3) {
            int i = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                DBMessage dBMessage = (DBMessage) entry.getValue();
                long sts = dBMessage.getSts();
                if (SessionId.a(dBMessage).equals(sessionId) && dBMessage.getMsgStatus() == 7 && sts >= j3) {
                    i++;
                }
            }
            com.sankuai.xm.im.utils.a.b("MessageDBProxy::::calculateUnread, unreadAllLoad: " + z + ", session = " + sessionId.f() + ", session unread = " + i + ", earliestUnreadTime = " + j3, new Object[0]);
            if (!z) {
                synchronized (this.b) {
                    if (h(sessionId)) {
                        this.e.get(sessionId.f()).g = true;
                    }
                }
            }
            return i;
        }
        synchronized (this.b) {
            if (h(sessionId)) {
                this.e.get(sessionId.f()).g = false;
            }
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        bVar.c = 0;
        final long j4 = j3;
        this.d.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.11
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Integer] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ec6cbd069999e00c9d4d5b5480cc4da", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ec6cbd069999e00c9d4d5b5480cc4da");
                    return;
                }
                int c2 = f.this.c(sessionId, j4);
                bVar.c = Integer.valueOf(c2);
                com.sankuai.xm.im.utils.a.b("MessageDBProxy::::calculateUnread, session=" + sessionId.f() + ",unread=" + c2, new Object[0]);
            }
        }));
        return ((Integer) bVar.c).intValue();
    }

    public final void b(final SessionId sessionId, final long j) {
        Object[] objArr = {sessionId, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "802b34936df8d90f0329a3862e62011e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "802b34936df8d90f0329a3862e62011e");
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.12
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass12 anonymousClass12;
                    boolean z;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0332f2cedd0fc69ca51d5c5b303670b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0332f2cedd0fc69ca51d5c5b303670b");
                        return;
                    }
                    long f = f.this.f(sessionId);
                    if (f > 0) {
                        f fVar = f.this;
                        SessionId sessionId2 = sessionId;
                        long j2 = j;
                        Object[] objArr3 = {sessionId2, new Long(f), new Long(j2)};
                        ChangeQuickRedirect changeQuickRedirect3 = f.a;
                        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "d0786cc69c2ae459a4a8744869da4ed0", 6917529027641081856L)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "d0786cc69c2ae459a4a8744869da4ed0")).booleanValue();
                        } else {
                            c cVar = new c();
                            cVar.a = "sts<=? AND sts>=? AND msgStatus=?";
                            cVar.b = new String[]{String.valueOf(j2), String.valueOf(f), "7"};
                            c a2 = f.a(sessionId2, cVar);
                            if (a2 != null) {
                                com.sankuai.xm.base.db.c bR_ = fVar.d.bR_();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put(Message.MSG_STATUS, (Integer) 9);
                                if (bR_.a(fVar.b(sessionId2.e), contentValues, a2.a, a2.b) > 0) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        if (z) {
                            anonymousClass12 = this;
                            f.a(f.this, sessionId, f, j);
                        } else {
                            anonymousClass12 = this;
                        }
                    } else {
                        anonymousClass12 = this;
                    }
                    synchronized (f.this.b) {
                        if (f.this.h(sessionId)) {
                            if (f.this.e.get(sessionId.f()).f <= f) {
                                f.this.e.get(sessionId.f()).g = true;
                            } else {
                                f.this.e.get(sessionId.f()).g = false;
                            }
                        }
                    }
                }
            }), (Callback) null);
        }
    }

    public final void a(final short[] sArr, final int[] iArr, final long j) {
        Object[] objArr = {sArr, iArr, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dd8844bec977f8dd158976cd5fcc29b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dd8844bec977f8dd158976cd5fcc29b");
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.14
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3913fca44dfc538bcc85ed201339a5a2", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3913fca44dfc538bcc85ed201339a5a2");
                        return;
                    }
                    com.sankuai.xm.base.db.c bR_ = f.this.d.bR_();
                    HashSet<String> hashSet = new HashSet();
                    if (iArr != null && iArr.length > 0) {
                        for (int i : iArr) {
                            hashSet.add(f.this.b(i));
                        }
                    } else {
                        hashSet.add(PersonalDBMessage.TABLE_NAME);
                        hashSet.add(GroupDBMessage.TABLE_NAME);
                        hashSet.add(PubDBMessage.TABLE_NAME);
                    }
                    String str = "";
                    if (sArr != null) {
                        Arrays.sort(sArr);
                        if (Arrays.binarySearch(sArr, (short) -1) < 0) {
                            Set<String> a2 = e.a(sArr);
                            str = "channel in (" + ac.a(a2, CommonConstant.Symbol.COMMA, false) + CommonConstant.Symbol.BRACKET_RIGHT;
                        }
                    }
                    if (j != Long.MAX_VALUE && j > 0) {
                        if (!ac.a(str)) {
                            str = str + " AND ";
                        }
                        str = str + "sts<" + j;
                    }
                    for (String str2 : hashSet) {
                        bR_.a(str2, str, null);
                    }
                    f.a(f.this, sArr, iArr);
                }
            }), true, (Callback) null);
        }
    }

    public final void a(final SessionId sessionId, final long j, boolean z) {
        Object[] objArr = {sessionId, new Long(j), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd4ab704a2614e9734ff5a1866c5cfae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd4ab704a2614e9734ff5a1866c5cfae");
        } else if (sessionId == null) {
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.16
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89b652201936aa6a25317c04302e4da3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89b652201936aa6a25317c04302e4da3");
                        return;
                    }
                    com.sankuai.xm.base.db.c bR_ = f.this.d.bR_();
                    c cVar = new c();
                    cVar.a = "cts<?";
                    cVar.b = new String[]{String.valueOf(j)};
                    c a2 = f.a(sessionId, cVar);
                    if (a2 == null) {
                        return;
                    }
                    if (bR_.a(f.this.b(sessionId.e), a2.a, a2.b) > 0) {
                        f fVar = f.this;
                        SessionId sessionId2 = sessionId;
                        long j2 = j;
                        Object[] objArr3 = {sessionId2, new Long(j2)};
                        ChangeQuickRedirect changeQuickRedirect3 = f.a;
                        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "450ecc038e6d7a7d865233db52d7a641", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "450ecc038e6d7a7d865233db52d7a641");
                            return;
                        }
                        synchronized (fVar.b) {
                            if (fVar.h(sessionId2)) {
                                a aVar = fVar.e.get(sessionId2.f());
                                ArrayList<DBMessage> arrayList = new ArrayList();
                                for (Map.Entry<String, DBMessage> entry : aVar.e.entrySet()) {
                                    if (entry.getValue().getCts() < j2) {
                                        arrayList.add(entry.getValue());
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    for (DBMessage dBMessage : arrayList) {
                                        aVar.b(dBMessage, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }), false, (Callback) null);
        }
    }

    public final List<DBMessage> a(final long j, final int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eeb45114d8fe1940dd1109d2b65426d", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eeb45114d8fe1940dd1109d2b65426d");
        }
        if (j <= 0) {
            return Collections.emptyList();
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.d.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.17
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, T] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf6eed5a64408b2544722b4259de9550", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf6eed5a64408b2544722b4259de9550");
                    return;
                }
                bVar.c = f.this.b(j, i);
            }
        }));
        return (List) bVar.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f7, code lost:
        com.sankuai.xm.im.utils.a.b("MessageDBProxy::cleanOldMessageBySession:: query timeout, queryTimeCost = %s", java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0249 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.sankuai.xm.im.cache.f.d> a(java.lang.String r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.f.a(java.lang.String, boolean, boolean):java.util.List");
    }

    private int a(String str, int i, int i2, d dVar, boolean z, boolean z2) {
        Cursor cursor;
        int i3;
        StringBuilder sb;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdc638dd6a377402de4b5f1781b73895", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdc638dd6a377402de4b5f1781b73895")).intValue();
        }
        com.sankuai.xm.base.db.c bR_ = this.d.bR_();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor cursor2 = null;
        try {
            sb = new StringBuilder();
            sb.append("chatId = ");
            sb.append(dVar.b.b);
            if (z) {
                try {
                    try {
                        sb.append(" and peerUid");
                        sb.append(" = ");
                        sb.append(dVar.b.c);
                    } catch (Exception e) {
                        e = e;
                        i3 = -1;
                        com.sankuai.xm.im.utils.a.a(e);
                        com.sankuai.xm.monitor.statistics.a.a("imlib", "MessageDBProxy::cleanOldMessageBySession", e);
                        com.sankuai.xm.base.util.m.a(cursor2);
                        return i3;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursor2;
                    com.sankuai.xm.base.util.m.a(cursor);
                    throw th;
                }
            }
            sb.append(" and channel");
            sb.append(" = ");
            sb.append((int) dVar.b.g);
            if (z2 && !ac.a(dVar.b.g())) {
                sb.append(" and sid");
                sb.append(" = '");
                sb.append(dVar.b.g());
                sb.append(CommonConstant.Symbol.SINGLE_QUOTES);
            }
            String format = String.format("select min(%s), max(%s) from ( select %s from %s where %s order by %s desc limit %s, %s)", "sts", "sts", "sts", str, sb, "sts", Integer.valueOf(i), Integer.valueOf(i2));
            com.sankuai.xm.im.utils.a.a("MessageDBProxy::cleanOldMessageBySession:: sql = %s", format);
            cursor = bR_.a(format, null);
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        try {
            cursor.moveToFirst();
            if (cursor.getCount() > 0) {
                long j = cursor.getLong(0);
                long j2 = cursor.getLong(1);
                String str2 = ((Object) sb) + " and sts>= " + j + " and sts <= " + j2;
                com.sankuai.xm.im.utils.a.a("MessageDBProxy::cleanOldMessageBySession:: where = %s, minTs = %s, maxTs = %s", str2, Long.valueOf(j), Long.valueOf(j2));
                i3 = bR_.a(str, str2, null);
                if (j2 > 0) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = d.a;
                    a(PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "888af453f5b4f26041c856d591dafa83", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "888af453f5b4f26041c856d591dafa83") : dVar.b.f(), j, j2);
                }
                com.sankuai.xm.im.utils.a.a("MessageDBProxy::cleanOldMessageBySession:: delete time cost = %s, count = %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(i3));
            } else {
                i3 = 0;
            }
            com.sankuai.xm.base.util.m.a(cursor);
        } catch (Exception e3) {
            e = e3;
            cursor2 = cursor;
            i3 = -1;
            com.sankuai.xm.im.utils.a.a(e);
            com.sankuai.xm.monitor.statistics.a.a("imlib", "MessageDBProxy::cleanOldMessageBySession", e);
            com.sankuai.xm.base.util.m.a(cursor2);
            return i3;
        } catch (Throwable th3) {
            th = th3;
            com.sankuai.xm.base.util.m.a(cursor);
            throw th;
        }
        return i3;
    }

    private boolean a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "293ab75a09fae68879a38dd162805c1f", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "293ab75a09fae68879a38dd162805c1f")).booleanValue() : IMClient.a().j().b(dVar.b);
    }

    boolean a() {
        int e;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e449251ebbe07c793cc50fd853efd1", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e449251ebbe07c793cc50fd853efd1")).booleanValue();
        }
        if (com.sankuai.xm.base.lifecycle.d.d().b == 0) {
            return false;
        }
        int i = b().k >= 0 ? b().k : 0;
        if (i <= 0 || (e = com.sankuai.xm.threadpool.scheduler.a.b().e(this.d.f())) <= i) {
            return true;
        }
        com.sankuai.xm.im.utils.a.c("MessageDBProxy::cleanOldMessageBySession:: pending count large than %s: %s", Integer.valueOf(i), Integer.valueOf(e));
        return false;
    }

    @NonNull
    b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a3702f734e8a1480330975890e4034a", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a3702f734e8a1480330975890e4034a");
        }
        if (this.k == null) {
            synchronized (this) {
                if (this.k != null) {
                    return this.k;
                }
                this.k = new b();
                String a2 = com.sankuai.xm.base.service.m.c().a(e.a.b);
                if (!ac.a(a2)) {
                    try {
                        JSONObject jSONObject = new JSONObject(a2);
                        this.k.b = jSONObject.optBoolean("enableClean", false);
                        this.k.c = jSONObject.optInt("stepLength", this.k.c);
                        this.k.d = jSONObject.optInt("retainCount", this.k.d);
                        this.k.e = jSONObject.optInt("prsRetainCount", this.k.e);
                        this.k.f = jSONObject.optInt("grpRetainCount", this.k.f);
                        this.k.g = jSONObject.optInt("pubRetainCount", this.k.g);
                        this.k.h = jSONObject.optLong("cleanInterval", this.k.h);
                        this.k.i = jSONObject.optLong("loopInterval", this.k.i);
                        this.k.j = jSONObject.optLong("collectTimeout", this.k.j);
                        this.k.k = jSONObject.optInt("pendingTaskLimit", this.k.k);
                    } catch (Exception e) {
                        com.sankuai.xm.im.utils.a.a(e);
                        com.sankuai.xm.monitor.statistics.a.a("imlib", "MessageDBProxy::getCleanConfig", e);
                    }
                }
                com.sankuai.xm.im.utils.a.b("MessageDBProxy::getCleanConfig:: clean config = %s", this.k.toString());
            }
        }
        return this.k;
    }

    List<DBMessage> b(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da89fc23573074ae560cca5120bdf978", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da89fc23573074ae560cca5120bdf978");
        }
        Cursor cursor = null;
        try {
            Cursor a2 = this.d.bR_().a(b(i), null, "fromUid=? AND msgStatus=? AND cts>?", new String[]{String.valueOf(j), "4", String.valueOf(System.currentTimeMillis() - 7200000)}, null, null, null);
            try {
                Class a3 = a(i);
                if (a2 != null && a2.getCount() > 0) {
                    ArrayList arrayList = new ArrayList();
                    while (a2.moveToNext()) {
                        arrayList.add((DBMessage) com.sankuai.xm.base.tinyorm.f.a().a(a3, a2));
                    }
                    if (a2 != null) {
                        a2.close();
                    }
                    return arrayList;
                }
                List<DBMessage> emptyList = Collections.emptyList();
                if (a2 != null) {
                    a2.close();
                }
                return emptyList;
            } catch (Throwable th) {
                th = th;
                cursor = a2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x011f, TryCatch #1 {all -> 0x011f, blocks: (B:7:0x002d, B:8:0x0035, B:9:0x0038, B:15:0x00ad, B:17:0x00b7, B:18:0x00d4, B:11:0x003d, B:12:0x006c, B:13:0x008c), top: B:39:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c A[Catch: all -> 0x011f, TryCatch #1 {all -> 0x011f, blocks: (B:7:0x002d, B:8:0x0035, B:9:0x0038, B:15:0x00ad, B:17:0x00b7, B:18:0x00d4, B:11:0x003d, B:12:0x006c, B:13:0x008c), top: B:39:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int c(com.sankuai.xm.im.session.SessionId r12, long r13) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.f.c(com.sankuai.xm.im.session.SessionId, long):int");
    }

    private boolean c(SessionId sessionId, long j, long j2, int i) {
        Object[] objArr = {sessionId, new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af14e9f609eadf68043153c6334c81be", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af14e9f609eadf68043153c6334c81be")).booleanValue();
        }
        int max = Math.max(i, 100);
        Cursor cursor = null;
        try {
            Cursor a2 = a(sessionId, j2, j, max, (short) 0, true, false, null);
            if (a2 == null) {
                if (a2 != null) {
                    a2.close();
                    return false;
                }
                return false;
            }
            try {
                boolean a3 = a(sessionId, max, a2);
                if (a2 != null) {
                    a2.close();
                }
                return a3;
            } catch (Throwable th) {
                th = th;
                cursor = a2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.sankuai.xm.im.session.SessionId r22, int r23, android.database.Cursor r24) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.f.a(com.sankuai.xm.im.session.SessionId, int, android.database.Cursor):boolean");
    }

    private Cursor a(SessionId sessionId, long j, long j2, int i, short s, boolean z, boolean z2, Collection<String> collection) {
        long j3 = j2;
        Object[] objArr = {sessionId, new Long(j), new Long(j3), Integer.valueOf(i), Short.valueOf(s), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae3c723bfca7afd77ddd7b893ffd310f", 6917529027641081856L)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae3c723bfca7afd77ddd7b893ffd310f");
        }
        if (j3 <= 0) {
            j3 = Long.MAX_VALUE;
        }
        if (j > j3) {
            return null;
        }
        c cVar = new c();
        cVar.a = "sts<? AND sts>?";
        cVar.b = new String[]{String.valueOf(j3), String.valueOf(j)};
        c a2 = a(sessionId, cVar);
        if (a2 == null) {
            return null;
        }
        String b2 = b(sessionId.e);
        String str = a2.a;
        String[] strArr = a2.b;
        String str2 = s == 0 ? "sts DESC" : "sts ASC";
        com.sankuai.xm.base.db.c bR_ = this.d.bR_();
        if (!z) {
            str = str + " AND msgStatus!=13";
        }
        String str3 = str;
        if (z2) {
            str3 = str3 + " AND seqid>0";
        }
        if (!com.sankuai.xm.base.util.b.a(collection)) {
            str3 = str3 + " AND type in (" + ac.a(collection, CommonConstant.Symbol.COMMA, false) + CommonConstant.Symbol.BRACKET_RIGHT;
        }
        return bR_.a(b2, null, str3, strArr, null, null, str2, String.valueOf(i));
    }

    long f(SessionId sessionId) {
        Cursor a2;
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6de9eee6cdea50e5383ea024420a799", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6de9eee6cdea50e5383ea024420a799")).longValue();
        }
        c cVar = new c();
        cVar.a = "sts>=? AND msgStatus=?";
        cVar.b = new String[]{String.valueOf(i(sessionId)), "7"};
        c a3 = a(sessionId, cVar);
        if (a3 == null || (a2 = this.d.bR_().a(b(sessionId.e), new String[]{"sts"}, a3.a, a3.b, null, null, "sts ASC", "1")) == null) {
            return 0L;
        }
        try {
            if (a2.getCount() > 0) {
                a2.moveToFirst();
                return a2.getLong(0);
            }
            return 0L;
        } finally {
            a2.close();
        }
    }

    private a a(SessionId sessionId, short s) {
        a aVar;
        Object[] objArr = {sessionId, (short) -1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35b459307e6fd7db16be3cd3b0f6e861", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35b459307e6fd7db16be3cd3b0f6e861");
        }
        synchronized (this.b) {
            if (this.e.containsKey(sessionId.f())) {
                aVar = this.e.get(sessionId.f());
            } else {
                aVar = new a();
                aVar.b = sessionId;
                aVar.d = (short) -1;
            }
            aVar.a();
            this.e.put(sessionId.f(), aVar);
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (com.sankuai.xm.base.tinyorm.f.a().a(r1, r4) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean a(java.util.List<com.sankuai.xm.im.cache.bean.DBMessage> r20) {
        /*
            r19 = this;
            r8 = r19
            r0 = r20
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.xm.im.cache.f.a
            java.lang.String r13 = "d57c4976dfcccbcf01790d0ff3a12ba1"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r10
            r2 = r19
            r3 = r12
            r5 = r13
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L27
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r8, r12, r11, r13)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L27:
            if (r0 == 0) goto Ld5
            boolean r1 = r20.isEmpty()
            if (r1 == 0) goto L31
            goto Ld5
        L31:
            com.sankuai.xm.im.cache.DBProxy r1 = r8.d
            com.sankuai.xm.base.db.c r1 = r1.bR_()
            com.sankuai.xm.im.cache.DBProxy r2 = r8.d     // Catch: java.lang.Throwable -> Lce
            r2.a(r1)     // Catch: java.lang.Throwable -> Lce
            boolean r2 = r8.a(r1, r0)     // Catch: java.lang.Throwable -> Lce
            int r3 = r20.size()     // Catch: java.lang.Throwable -> Lce
            if (r3 != 0) goto L4b
            if (r2 == 0) goto L4b
            r3 = 1
            goto Lc1
        L4b:
            java.util.Iterator r0 = r20.iterator()     // Catch: java.lang.Throwable -> Lce
            r3 = 0
        L50:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> Lce
            if (r4 == 0) goto Lc1
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> Lce
            com.sankuai.xm.im.cache.bean.DBMessage r4 = (com.sankuai.xm.im.cache.bean.DBMessage) r4     // Catch: java.lang.Throwable -> Lce
            int r5 = r4.getCategory()     // Catch: java.lang.Throwable -> Lce
            switch(r5) {
                case 1: goto L67;
                case 2: goto L67;
                case 3: goto L67;
                default: goto L63;
            }     // Catch: java.lang.Throwable -> Lce
        L63:
            switch(r5) {
                case 9: goto L67;
                case 10: goto L67;
                case 11: goto L67;
                default: goto L66;
            }     // Catch: java.lang.Throwable -> Lce
        L66:
            goto Lbe
        L67:
            if (r2 == 0) goto L7b
            com.sankuai.xm.base.tinyorm.f r3 = com.sankuai.xm.base.tinyorm.f.a()     // Catch: java.lang.Throwable -> Lce
            long r3 = r3.a(r1, r4)     // Catch: java.lang.Throwable -> Lce
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L79
        L77:
            r3 = 1
            goto Lbe
        L79:
            r3 = 0
            goto Lbe
        L7b:
            com.sankuai.xm.base.tinyorm.f r3 = com.sankuai.xm.base.tinyorm.f.a()     // Catch: java.lang.Throwable -> Lce
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lce
            r5[r11] = r1     // Catch: java.lang.Throwable -> Lce
            r5[r9] = r4     // Catch: java.lang.Throwable -> Lce
            com.meituan.robust.ChangeQuickRedirect r6 = com.sankuai.xm.base.tinyorm.f.a     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = "aebdab4b5fcfdc91efb215c5120aea9c"
            r15 = 0
            r17 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r12 = r5
            r13 = r3
            r14 = r6
            r16 = r7
            boolean r10 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lce
            if (r10 == 0) goto La3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r5, r3, r6, r11, r7)     // Catch: java.lang.Throwable -> Lce
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Lce
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Lce
            goto Lbe
        La3:
            if (r1 == 0) goto L79
            com.sankuai.xm.base.tinyorm.e r5 = r3.b     // Catch: java.lang.Throwable -> Lce
            com.sankuai.xm.base.tinyorm.d r5 = r5.a(r4)     // Catch: java.lang.Throwable -> Lce
            if (r5 == 0) goto L79
            boolean r5 = r3.c(r1, r4)     // Catch: java.lang.Throwable -> Lce
            if (r5 != 0) goto L77
            long r3 = r3.a(r1, r4)     // Catch: java.lang.Throwable -> Lce
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L79
            goto L77
        Lbe:
            if (r3 == 0) goto Lc1
            goto L50
        Lc1:
            if (r3 == 0) goto Lc8
            com.sankuai.xm.im.cache.DBProxy r0 = r8.d     // Catch: java.lang.Throwable -> Lce
            r0.b(r1)     // Catch: java.lang.Throwable -> Lce
        Lc8:
            com.sankuai.xm.im.cache.DBProxy r0 = r8.d
            r0.c(r1)
            return r3
        Lce:
            r0 = move-exception
            com.sankuai.xm.im.cache.DBProxy r2 = r8.d
            r2.c(r1)
            throw r0
        Ld5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.f.a(java.util.List):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    @android.annotation.SuppressLint({"UseSparseArrays"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.sankuai.xm.base.db.c r20, java.util.List<com.sankuai.xm.im.cache.bean.DBMessage> r21) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.f.a(com.sankuai.xm.base.db.c, java.util.List):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:11:0x0031, B:12:0x003a, B:14:0x0040, B:15:0x004a, B:16:0x004d, B:18:0x0051, B:19:0x005c, B:20:0x0067, B:25:0x0077), top: B:32:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:11:0x0031, B:12:0x003a, B:14:0x0040, B:15:0x004a, B:16:0x004d, B:18:0x0051, B:19:0x005c, B:20:0x0067, B:25:0x0077), top: B:32:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:11:0x0031, B:12:0x003a, B:14:0x0040, B:15:0x004a, B:16:0x004d, B:18:0x0051, B:19:0x005c, B:20:0x0067, B:25:0x0077), top: B:32:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean b(java.util.List<com.sankuai.xm.im.cache.bean.DBMessage> r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.xm.im.cache.f.a
            java.lang.String r11 = "aaa133068ac8e7d6f684920246b86921"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L22:
            if (r13 == 0) goto L89
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L2b
            goto L89
        L2b:
            com.sankuai.xm.im.cache.DBProxy r0 = r12.d
            com.sankuai.xm.base.db.c r0 = r0.bR_()
            com.sankuai.xm.im.cache.DBProxy r1 = r12.d     // Catch: java.lang.Throwable -> L82
            r1.a(r0)     // Catch: java.lang.Throwable -> L82
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L82
        L3a:
            boolean r1 = r13.hasNext()     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L75
            java.lang.Object r1 = r13.next()     // Catch: java.lang.Throwable -> L82
            com.sankuai.xm.im.cache.bean.DBMessage r1 = (com.sankuai.xm.im.cache.bean.DBMessage) r1     // Catch: java.lang.Throwable -> L82
            int r2 = r1.getCategory()     // Catch: java.lang.Throwable -> L82
            switch(r2) {
                case 1: goto L67;
                case 2: goto L5c;
                case 3: goto L51;
                default: goto L4d;
            }     // Catch: java.lang.Throwable -> L82
        L4d:
            switch(r2) {
                case 9: goto L67;
                case 10: goto L51;
                case 11: goto L51;
                default: goto L50;
            }     // Catch: java.lang.Throwable -> L82
        L50:
            goto L72
        L51:
            com.sankuai.xm.im.cache.bean.PubDBMessage r1 = (com.sankuai.xm.im.cache.bean.PubDBMessage) r1     // Catch: java.lang.Throwable -> L82
            com.sankuai.xm.base.tinyorm.f r2 = com.sankuai.xm.base.tinyorm.f.a()     // Catch: java.lang.Throwable -> L82
            boolean r1 = r2.d(r0, r1)     // Catch: java.lang.Throwable -> L82
            goto L71
        L5c:
            com.sankuai.xm.im.cache.bean.GroupDBMessage r1 = (com.sankuai.xm.im.cache.bean.GroupDBMessage) r1     // Catch: java.lang.Throwable -> L82
            com.sankuai.xm.base.tinyorm.f r2 = com.sankuai.xm.base.tinyorm.f.a()     // Catch: java.lang.Throwable -> L82
            boolean r1 = r2.d(r0, r1)     // Catch: java.lang.Throwable -> L82
            goto L71
        L67:
            com.sankuai.xm.im.cache.bean.PersonalDBMessage r1 = (com.sankuai.xm.im.cache.bean.PersonalDBMessage) r1     // Catch: java.lang.Throwable -> L82
            com.sankuai.xm.base.tinyorm.f r2 = com.sankuai.xm.base.tinyorm.f.a()     // Catch: java.lang.Throwable -> L82
            boolean r1 = r2.d(r0, r1)     // Catch: java.lang.Throwable -> L82
        L71:
            r9 = r1
        L72:
            if (r9 == 0) goto L75
            goto L3a
        L75:
            if (r9 == 0) goto L7c
            com.sankuai.xm.im.cache.DBProxy r13 = r12.d     // Catch: java.lang.Throwable -> L82
            r13.b(r0)     // Catch: java.lang.Throwable -> L82
        L7c:
            com.sankuai.xm.im.cache.DBProxy r13 = r12.d
            r13.c(r0)
            return r9
        L82:
            r13 = move-exception
            com.sankuai.xm.im.cache.DBProxy r1 = r12.d
            r1.c(r0)
            throw r13
        L89:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.f.b(java.util.List):boolean");
    }

    private DBMessage j(SessionId sessionId) {
        Cursor cursor;
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ef3b9a9b0546455000fee6a2f27260c", 6917529027641081856L)) {
            return (DBMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ef3b9a9b0546455000fee6a2f27260c");
        }
        DBMessage dBMessage = null;
        try {
            cursor = a(sessionId, 0L, 0L, 1, (short) 0, true, false, null);
            try {
                Class a2 = a(sessionId.e);
                if (cursor != null && cursor.getCount() > 0) {
                    cursor.moveToFirst();
                    dBMessage = (DBMessage) com.sankuai.xm.base.tinyorm.f.a().a(a2, cursor);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return dBMessage;
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    DBMessage g(SessionId sessionId) {
        Cursor cursor;
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bec4fe3cb2ee43b186c249d6d478b5c5", 6917529027641081856L)) {
            return (DBMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bec4fe3cb2ee43b186c249d6d478b5c5");
        }
        DBMessage dBMessage = null;
        try {
            cursor = a(sessionId, 0L, 0L, 1, (short) 0, false, false, null);
            try {
                Class a2 = a(sessionId.e);
                if (cursor != null && cursor.getCount() > 0) {
                    cursor.moveToFirst();
                    dBMessage = (DBMessage) com.sankuai.xm.base.tinyorm.f.a().a(a2, cursor);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return dBMessage;
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    DBMessage d(SessionId sessionId, long j) {
        Cursor cursor;
        Object[] objArr = {sessionId, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9a737332b08d880d8d124f50e31d73c", 6917529027641081856L)) {
            return (DBMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9a737332b08d880d8d124f50e31d73c");
        }
        if (j == 0 || j == Long.MAX_VALUE) {
            return j(sessionId);
        }
        long j2 = j + 1;
        DBMessage dBMessage = null;
        try {
            cursor = a(sessionId, 0L, j2, 1, (short) 0, true, false, null);
            try {
                Class a2 = a(sessionId.e);
                if (cursor != null && cursor.getCount() > 0) {
                    cursor.moveToFirst();
                    dBMessage = (DBMessage) com.sankuai.xm.base.tinyorm.f.a().a(a2, cursor);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return dBMessage;
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.Class a(int r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.im.cache.f.a
            java.lang.String r10 = "793835a95c09a84b74e00eda4af0775d"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.Class r12 = (java.lang.Class) r12
            return r12
        L22:
            switch(r12) {
                case 1: goto L31;
                case 2: goto L2e;
                case 3: goto L2b;
                default: goto L25;
            }
        L25:
            switch(r12) {
                case 9: goto L31;
                case 10: goto L2b;
                case 11: goto L2b;
                default: goto L28;
            }
        L28:
            java.lang.Class<com.sankuai.xm.im.cache.bean.DBMessage> r12 = com.sankuai.xm.im.cache.bean.DBMessage.class
            goto L33
        L2b:
            java.lang.Class<com.sankuai.xm.im.cache.bean.PubDBMessage> r12 = com.sankuai.xm.im.cache.bean.PubDBMessage.class
            goto L33
        L2e:
            java.lang.Class<com.sankuai.xm.im.cache.bean.GroupDBMessage> r12 = com.sankuai.xm.im.cache.bean.GroupDBMessage.class
            goto L33
        L31:
            java.lang.Class<com.sankuai.xm.im.cache.bean.PersonalDBMessage> r12 = com.sankuai.xm.im.cache.bean.PersonalDBMessage.class
        L33:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.f.a(int):java.lang.Class");
    }

    List<DBMessage> b(SessionId sessionId, long j, long j2, int i) {
        long j3 = j;
        Object[] objArr = {sessionId, new Long(j3), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cd0c54acdc46e744160d5ef0192cf49", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cd0c54acdc46e744160d5ef0192cf49");
        }
        if (j3 == 0) {
            j3 = Long.MAX_VALUE;
        }
        if (!(!h(sessionId) ? c(sessionId, j3, j2, i) : true)) {
            return Collections.emptyList();
        }
        synchronized (this.b) {
            a aVar = this.e.get(sessionId.f());
            if (aVar != null && aVar.e.isEmpty() && aVar.d == 0) {
                return new ArrayList();
            }
            return a(aVar, j3, j2, i, sessionId);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[Catch: all -> 0x00c5, Exception -> 0x00c7, TryCatch #4 {Exception -> 0x00c7, all -> 0x00c5, blocks: (B:12:0x006c, B:14:0x0072, B:18:0x007d, B:19:0x0082, B:21:0x0088, B:22:0x008a, B:23:0x008d, B:29:0x00bb, B:25:0x0093, B:26:0x00a0, B:27:0x00ad), top: B:49:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad A[Catch: all -> 0x00c5, Exception -> 0x00c7, TryCatch #4 {Exception -> 0x00c7, all -> 0x00c5, blocks: (B:12:0x006c, B:14:0x0072, B:18:0x007d, B:19:0x0082, B:21:0x0088, B:22:0x008a, B:23:0x008d, B:29:0x00bb, B:25:0x0093, B:26:0x00a0, B:27:0x00ad), top: B:49:0x006c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.util.List<com.sankuai.xm.im.cache.bean.DBMessage> b(com.sankuai.xm.im.session.SessionId r18, long r19, long r21, int r23, short r24) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.f.b(com.sankuai.xm.im.session.SessionId, long, long, int, short):java.util.List");
    }

    private List<DBMessage> a(a aVar, long j, long j2, int i, SessionId sessionId) {
        boolean z;
        int i2 = i;
        Object[] objArr = {aVar, new Long(j), new Long(j2), Integer.valueOf(i), sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ecdf34c01ac93489fdd6e8168e5443f", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ecdf34c01ac93489fdd6e8168e5443f");
        }
        ArrayList arrayList = new ArrayList();
        long j3 = j;
        int i3 = 0;
        for (Map.Entry<String, DBMessage> entry : aVar.e.entrySet()) {
            DBMessage value = entry.getValue();
            if (value.getSts() < j && value.getSts() >= j2) {
                arrayList.add(value);
                i3++;
                if (value.getSts() < j3) {
                    j3 = value.getSts();
                }
            }
        }
        if (i3 >= i2 || j3 < j2) {
            z = true;
        } else {
            z = true;
            if (aVar.d == 1) {
                c(sessionId, j3, j2, i2 - i3);
                for (Map.Entry<String, DBMessage> entry2 : aVar.e.entrySet()) {
                    DBMessage value2 = entry2.getValue();
                    if (value2.getSts() < j3) {
                        arrayList.add(value2);
                        i3++;
                    }
                }
            }
        }
        if (i3 > 0) {
            com.sankuai.xm.im.utils.c.a(arrayList, z);
            if (arrayList.size() <= i2) {
                i2 = arrayList.size();
            }
            return arrayList.subList(0, i2);
        }
        return Collections.emptyList();
    }

    boolean h(SessionId sessionId) {
        boolean z = true;
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e8734147c9bb09a9a0cf040c57c50fe", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e8734147c9bb09a9a0cf040c57c50fe")).booleanValue();
        }
        synchronized (this.b) {
            if (!this.e.containsKey(sessionId.f()) || this.e.get(sessionId.f()).d == -1) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j, long j2) {
        a value;
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f0bac6f22b114e26c660875563f97e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f0bac6f22b114e26c660875563f97e");
            return;
        }
        com.sankuai.xm.im.utils.a.a("MessageDBProxy::deleteFromCacheByTime:: key = %s, minTs = %s, maxTs = %s", str, Long.valueOf(j), Long.valueOf(j2));
        synchronized (this.b) {
            if (!ac.a(str)) {
                a aVar = this.e.get(str);
                if (aVar != null && aVar.d != -1) {
                    aVar.a(j, j2, true);
                }
            } else {
                com.sankuai.xm.im.utils.a.a("MessageDBProxy::deleteFromCacheByTime:: mCacheMap.size() = " + this.e.size(), new Object[0]);
                Iterator<Map.Entry<String, a>> it = this.e.entrySet().iterator();
                while (it.hasNext() && (value = it.next().getValue()) != null && value.d != -1) {
                    value.a(j, j2, true);
                }
            }
        }
    }

    public final void b(List<Long> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93eb6441a781a2c5bf8f25b59f8bf417", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93eb6441a781a2c5bf8f25b59f8bf417");
        } else {
            a(list, i, (Callback<Set<Long>>) null);
        }
    }

    public final void a(final Collection<Long> collection, final int i, final Callback<Set<Long>> callback) {
        Object[] objArr = {collection, Integer.valueOf(i), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d556e79748db486b7ca4c94c11541e34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d556e79748db486b7ca4c94c11541e34");
        } else if (com.sankuai.xm.base.util.b.a(collection)) {
            com.sankuai.xm.base.callback.a.a(callback, null);
        } else if (this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.23
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b1599f36b5f5288b309cc91c2866034", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b1599f36b5f5288b309cc91c2866034");
                    return;
                }
                HashSet hashSet = new HashSet();
                com.sankuai.xm.base.db.c bR_ = f.this.d.bR_();
                try {
                    f.this.d.a(bR_);
                    for (Long l : collection) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(Message.MSG_OPPOSITE_STATUS, Integer.valueOf(i));
                        if (bR_.a(PersonalDBMessage.TABLE_NAME, contentValues, "msgId=?", new String[]{Long.toString(l.longValue())}) > 0) {
                            hashSet.add(l);
                        }
                    }
                    f.this.d.b(bR_);
                    synchronized (f.this.b) {
                        for (Long l2 : collection) {
                            long longValue = l2.longValue();
                            for (String str : f.this.e.keySet()) {
                                a aVar = f.this.e.get(str);
                                if (aVar != null) {
                                    for (Map.Entry<String, DBMessage> entry : aVar.e.entrySet()) {
                                        DBMessage value = entry.getValue();
                                        if (value != null && value.getMsgId() == longValue) {
                                            value.setMsgOppositeStatus(i);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    if (bR_ != null) {
                        f.this.d.c(bR_);
                    }
                    com.sankuai.xm.base.callback.a.a(callback, hashSet);
                }
            }
        }), (Callback) null)) {
        } else {
            com.sankuai.xm.base.callback.a.a(callback, 10019, "DB task execute failed.");
        }
    }

    public final void a(final short s, final Long l) {
        Object[] objArr = {Short.valueOf(s), l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c795380e1209970a8b94dfeef454e19a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c795380e1209970a8b94dfeef454e19a");
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.24
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    String[] strArr;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e499739e7e1baa578c08adbd9dbe574a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e499739e7e1baa578c08adbd9dbe574a");
                        return;
                    }
                    com.sankuai.xm.base.db.c bR_ = f.this.d.bR_();
                    if (l.longValue() <= 0) {
                        str = "channel=?";
                        strArr = new String[]{String.valueOf((int) s)};
                    } else {
                        str = "channel=? AND cts<=?";
                        strArr = new String[]{String.valueOf((int) s), String.valueOf(l)};
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(Message.MSG_OPPOSITE_STATUS, (Integer) 1);
                    bR_.a(PersonalDBMessage.TABLE_NAME, contentValues, str, strArr);
                    synchronized (f.this.b) {
                        for (String str2 : f.this.e.keySet()) {
                            a aVar = f.this.e.get(str2);
                            if (aVar != null) {
                                for (Map.Entry<String, DBMessage> entry : aVar.e.entrySet()) {
                                    DBMessage value = entry.getValue();
                                    if (value != null && value.getCts() <= l.longValue() && MessageUtils.isIMPeerService(value.getCategory()) && value.getChannel() == s) {
                                        value.setMsgOppositeStatus(1);
                                    }
                                }
                            }
                        }
                    }
                }
            }), (Callback) null);
        }
    }

    public final void a(final short s, final Long l, int i, int i2, final Callback<List<DBMessage>> callback) {
        Object[] objArr = {Short.valueOf(s), l, 1000, 2, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b496e7c05201c5abfc1d32938a0ac7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b496e7c05201c5abfc1d32938a0ac7");
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.25
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    String[] strArr;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b4b5d4e2fa3ac245312a04ce3f26e7e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b4b5d4e2fa3ac245312a04ce3f26e7e");
                        return;
                    }
                    Cursor cursor = null;
                    ArrayList arrayList = new ArrayList();
                    try {
                        com.sankuai.xm.base.db.c bR_ = f.this.d.bR_();
                        long currentTimeMillis = System.currentTimeMillis() - l.longValue();
                        if (l.longValue() <= 0) {
                            str = "channel=? AND msgOppositeStatus=?";
                            strArr = new String[]{String.valueOf((int) s), String.valueOf(r4)};
                        } else {
                            str = "cts>=? AND channel=? AND msgOppositeStatus=?";
                            strArr = new String[]{String.valueOf(currentTimeMillis), String.valueOf((int) s), String.valueOf(r4)};
                        }
                        Cursor a2 = bR_.a(PersonalDBMessage.TABLE_NAME, null, str, strArr, null, null, null, String.valueOf(r5));
                        try {
                            if (a2 == null) {
                                callback.onFailure(10019, "");
                                if (a2 != null) {
                                    a2.close();
                                    return;
                                }
                                return;
                            }
                            while (a2.moveToNext()) {
                                arrayList.add((DBMessage) com.sankuai.xm.base.tinyorm.f.a().a(PersonalDBMessage.class, a2));
                            }
                            callback.onSuccess(arrayList);
                            if (a2 != null) {
                                a2.close();
                            }
                        } catch (Throwable th) {
                            cursor = a2;
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }), (Callback) null);
        }
    }

    public final void a(final SessionId sessionId, final long j, final long j2, final boolean z, int i) {
        Object[] objArr = {sessionId, new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0015a3923ed8d001d91d0f63df36a54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0015a3923ed8d001d91d0f63df36a54");
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.27
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    int i2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e73966b7cfcbf80fb8de1ac1085dc530", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e73966b7cfcbf80fb8de1ac1085dc530");
                    } else if (j <= j2) {
                        com.sankuai.xm.base.db.c bR_ = f.this.d.bR_();
                        String str = z ? "chatId=? AND peerUid=? AND channel=? AND sts<=? AND sts>? AND fromUid!=?" : "chatId=? AND peerUid=? AND channel=? AND sts<=? AND sts>? AND fromUid=?";
                        String[] strArr = {String.valueOf(sessionId.b), String.valueOf(sessionId.c), String.valueOf((int) sessionId.g), String.valueOf(j2), String.valueOf(j), String.valueOf(f.this.d.n)};
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(Message.MSG_OPPOSITE_STATUS, Integer.valueOf(r8));
                        bR_.a(PubDBMessage.TABLE_NAME, contentValues, str, strArr);
                        synchronized (f.this.b) {
                            a aVar = f.this.e.get(sessionId.f());
                            if (aVar != null && ((i2 = aVar.b.e) == 3 || i2 >= 10)) {
                                for (Map.Entry<String, DBMessage> entry : aVar.e.entrySet()) {
                                    DBMessage value = entry.getValue();
                                    if (value != null && value.getSts() <= j2) {
                                        if (z && value.getFromUid() != f.this.d.n) {
                                            value.setMsgOppositeStatus(1);
                                        } else if (!z && value.getFromUid() == f.this.d.n) {
                                            value.setMsgOppositeStatus(1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }), (Callback) null);
        }
    }

    public final void a(final short s, final Long l, final Long l2, final Callback<Void> callback) {
        Object[] objArr = {Short.valueOf(s), l, l2, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c56ef797baa6f9c77d2a49a901df3934", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c56ef797baa6f9c77d2a49a901df3934");
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.28
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    String[] strArr;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c9a85cdcebfd684692d5f11530213e1", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c9a85cdcebfd684692d5f11530213e1");
                    } else if (l2.longValue() > l.longValue()) {
                        callback.onSuccess(null);
                    } else {
                        com.sankuai.xm.base.db.c bR_ = f.this.d.bR_();
                        if (l.longValue() <= 0) {
                            str = "channel=?";
                            strArr = new String[]{String.valueOf((int) s)};
                        } else {
                            str = "channel=? AND sts<=? AND sts>?";
                            strArr = new String[]{String.valueOf((int) s), String.valueOf(l), String.valueOf(l2)};
                        }
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(Message.MSG_OPPOSITE_STATUS, (Integer) 1);
                        bR_.a(PubDBMessage.TABLE_NAME, contentValues, str, strArr);
                        synchronized (f.this.b) {
                            for (String str2 : f.this.e.keySet()) {
                                a aVar = f.this.e.get(str2);
                                if (aVar != null && aVar.b.g == s && (aVar.b.e == 3 || aVar.b.e >= 10)) {
                                    for (Map.Entry<String, DBMessage> entry : aVar.e.entrySet()) {
                                        DBMessage value = entry.getValue();
                                        if (value != null && value.getSts() <= l.longValue()) {
                                            value.setMsgOppositeStatus(1);
                                        }
                                    }
                                }
                            }
                        }
                        callback.onSuccess(null);
                    }
                }
            }), callback);
        }
    }

    public final void c(final List<Long> list, final int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64dd372d27db49c0e13be7230a076fe5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64dd372d27db49c0e13be7230a076fe5");
            return;
        }
        Object[] objArr2 = {2, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee2cea821a18084edf0f2cb87e1b4c18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee2cea821a18084edf0f2cb87e1b4c18");
        } else if (list == null || list.size() <= 0) {
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.29
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cae1df3eae1ec78b7bf8304366e4e942", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cae1df3eae1ec78b7bf8304366e4e942");
                        return;
                    }
                    com.sankuai.xm.base.db.c bR_ = f.this.d.bR_();
                    try {
                        f.this.d.a(bR_);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(Message.MSG_OPPOSITE_STATUS, Integer.valueOf(i));
                            bR_.a(f.this.b(r4), contentValues, "msgId=?", new String[]{Long.toString(((Long) it.next()).longValue())});
                        }
                        f.this.d.b(bR_);
                        synchronized (f.this.b) {
                            for (Long l : list) {
                                long longValue = l.longValue();
                                for (String str : f.this.e.keySet()) {
                                    a aVar = f.this.e.get(str);
                                    if (aVar != null) {
                                        if (aVar.b.e == r4) {
                                            for (Map.Entry<String, DBMessage> entry : aVar.e.entrySet()) {
                                                DBMessage value = entry.getValue();
                                                if (value != null && value.getMsgId() == longValue) {
                                                    value.setMsgOppositeStatus(i);
                                                    z = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z = false;
                                        if (!z) {
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        if (bR_ != null) {
                            f.this.d.c(bR_);
                        }
                    }
                }
            }), (Callback) null);
        }
    }

    public final void a(final short s, int i, int i2, final Callback<List<DBMessage>> callback) {
        Object[] objArr = {Short.valueOf(s), 1000, 2, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "094a8482181b360895e89d1e4783bc85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "094a8482181b360895e89d1e4783bc85");
            return;
        }
        Object[] objArr2 = {2, Short.valueOf(s), 1000, 2, callback};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb8613c96f8763d3e3e55dd51279c2dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb8613c96f8763d3e3e55dd51279c2dc");
        } else {
            this.d.a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.30
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e475da96db5ac23201895fbf7dacbdde", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e475da96db5ac23201895fbf7dacbdde");
                        return;
                    }
                    Cursor cursor = null;
                    ArrayList arrayList = new ArrayList();
                    try {
                        Cursor a2 = f.this.d.bR_().a(f.this.b(r4), null, "channel=? AND msgOppositeStatus=? ", new String[]{String.valueOf((int) s), String.valueOf(r3)}, null, null, "sts DESC", String.valueOf(r5));
                        try {
                            if (a2 == null) {
                                callback.onFailure(10019, "");
                                if (a2 != null) {
                                    a2.close();
                                    return;
                                }
                                return;
                            }
                            while (a2.moveToNext()) {
                                arrayList.add((DBMessage) com.sankuai.xm.base.tinyorm.f.a().a(PersonalDBMessage.class, a2));
                            }
                            callback.onSuccess(arrayList);
                            if (a2 != null) {
                                a2.close();
                            }
                        } catch (Throwable th) {
                            cursor = a2;
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }), callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<DBMessage> b(SessionId sessionId, long j, long j2, int i, short s, boolean z, boolean z2, Collection<String> collection) {
        Cursor cursor;
        Object[] objArr = {sessionId, new Long(j), new Long(j2), Integer.valueOf(i), Short.valueOf(s), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69dd020dc5ee4514faa8c6c06ed6fd1c", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69dd020dc5ee4514faa8c6c06ed6fd1c");
        }
        try {
            ArrayList arrayList = new ArrayList();
            cursor = a(sessionId, j, j2, i, s, z, z2, collection);
            if (cursor == null) {
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
            try {
                Class a2 = a(sessionId.e);
                if (cursor.getCount() > 0) {
                    while (cursor.moveToNext()) {
                        DBMessage dBMessage = (DBMessage) com.sankuai.xm.base.tinyorm.f.a().a(a2, cursor);
                        if (dBMessage != null) {
                            arrayList.add(dBMessage);
                        }
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    public final List<DBMessage> a(final SessionId sessionId, final long j, final long j2, int i, final short s, boolean z) {
        Object[] objArr = {sessionId, new Long(j), new Long(j2), 1, Short.valueOf(s), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2804d6a903c5c303044dca43fd22933", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2804d6a903c5c303044dca43fd22933");
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        this.d.c(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.31
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, T] */
            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a35359ae7daba4e9bed879b725b3e30", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a35359ae7daba4e9bed879b725b3e30");
                    return;
                }
                bVar.c = f.this.b(sessionId, j, j2, r8, s, r10, true, null);
            }
        }));
        return (List) bVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.sankuai.xm.im.cache.f.c a(com.sankuai.xm.im.session.SessionId r13, com.sankuai.xm.im.cache.f.c r14) {
        /*
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            r10 = 1
            r8[r10] = r14
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.xm.im.cache.f.a
            java.lang.String r12 = "61b7e3527d6e27727e486bcde7c86889"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r11, r10, r12)
            com.sankuai.xm.im.cache.f$c r13 = (com.sankuai.xm.im.cache.f.c) r13
            return r13
        L21:
            if (r13 != 0) goto L24
            return r2
        L24:
            com.sankuai.xm.im.cache.f$c r1 = new com.sankuai.xm.im.cache.f$c
            r1.<init>()
            int r3 = r13.e
            switch(r3) {
                case 1: goto L55;
                case 2: goto L55;
                case 3: goto L33;
                default: goto L2e;
            }
        L2e:
            switch(r3) {
                case 9: goto L55;
                case 10: goto L33;
                case 11: goto L33;
                default: goto L31;
            }
        L31:
            r1 = r2
            goto L6d
        L33:
            java.lang.String r2 = "chatId=? AND peerUid=? AND channel=?"
            r1.a = r2
            r2 = 3
            java.lang.String[] r2 = new java.lang.String[r2]
            long r3 = r13.b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2[r9] = r3
            long r3 = r13.c
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2[r10] = r3
            short r3 = r13.g
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2[r0] = r3
            r1.b = r2
            goto L6d
        L55:
            java.lang.String r2 = "chatId=? AND channel=?"
            r1.a = r2
            java.lang.String[] r0 = new java.lang.String[r0]
            long r2 = r13.b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0[r9] = r2
            short r2 = r13.g
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0[r10] = r2
            r1.b = r0
        L6d:
            if (r1 == 0) goto Ld4
            if (r14 == 0) goto Ld4
            java.lang.String r0 = r13.g()
            boolean r0 = com.sankuai.xm.base.util.ac.a(r0)
            if (r0 != 0) goto L9c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r1.a
            r0.append(r2)
            java.lang.String r2 = " AND sid='"
            r0.append(r2)
            java.lang.String r13 = r13.g()
            r0.append(r13)
            java.lang.String r13 = "'"
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r1.a = r13
        L9c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = r1.a
            r13.append(r0)
            java.lang.String r0 = " AND "
            r13.append(r0)
            java.lang.String r0 = r14.a
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r1.a = r13
            java.lang.String[] r13 = r1.b
            int r13 = r13.length
            java.lang.String[] r0 = r14.b
            int r0 = r0.length
            int r13 = r13 + r0
            java.lang.String[] r13 = new java.lang.String[r13]
            java.lang.String[] r0 = r1.b
            java.lang.String[] r2 = r1.b
            int r2 = r2.length
            java.lang.System.arraycopy(r0, r9, r13, r9, r2)
            java.lang.String[] r0 = r14.b
            java.lang.String[] r2 = r1.b
            int r2 = r2.length
            java.lang.String[] r14 = r14.b
            int r14 = r14.length
            java.lang.System.arraycopy(r0, r9, r13, r2, r14)
            r1.b = r13
        Ld4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.f.a(com.sankuai.xm.im.session.SessionId, com.sankuai.xm.im.cache.f$c):com.sankuai.xm.im.cache.f$c");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class c {
        public String a;
        public String[] b;

        public c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class d {
        public static ChangeQuickRedirect a;
        public SessionId b;
        public int c;

        public d() {
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1816482ec666d67ba157b4b59193f973", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1816482ec666d67ba157b4b59193f973")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.b.equals(dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9198ff0287aad7ebb00adbc37574d72", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9198ff0287aad7ebb00adbc37574d72")).intValue() : Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c)});
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19f6f65902256dec2ba1422f3c9238ca", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19f6f65902256dec2ba1422f3c9238ca");
            }
            return "SessionInfo{sessionid=" + this.b.f() + ", msgCount=" + this.c + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public long h;
        public long i;
        public long j;
        public int k;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e73cf33dd5e5d8ae58e14a08ad29cb30", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e73cf33dd5e5d8ae58e14a08ad29cb30");
                return;
            }
            this.b = true;
            this.c = 1000;
            this.d = 500;
            this.e = MapConstant.ANIMATION_DURATION_SHORT;
            this.f = 500;
            this.g = MapConstant.ANIMATION_DURATION_SHORT;
            this.h = 86400000L;
            this.i = MetricsAnrManager.ANR_THRESHOLD;
            this.j = 1000L;
            this.k = 5;
        }

        public final int a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ee0701fe48d190368043281259fa217", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ee0701fe48d190368043281259fa217")).intValue();
            }
            if (ac.a(str, PersonalDBMessage.TABLE_NAME) && this.e > 0) {
                return this.e;
            }
            if (ac.a(str, GroupDBMessage.TABLE_NAME) && this.f > 0) {
                return this.f;
            }
            if (ac.a(str, PubDBMessage.TABLE_NAME) && this.g > 0) {
                return this.g;
            }
            if (this.d > 0) {
                return this.d;
            }
            return 500;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "187070b75038a87afd6b265e96536397", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "187070b75038a87afd6b265e96536397");
            }
            return "CleanConfig{enableClean=" + this.b + ", stepLength=" + this.c + ", retainCount=" + this.d + ", prsRetainCount=" + this.e + ", grpRetainCount=" + this.f + ", pubRetainCount=" + this.g + ", cleanInterval=" + this.h + ", loopInterval=" + this.i + ", collectTimeout=" + this.j + ", pendingTaskLimit=" + this.k + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a {
        public static ChangeQuickRedirect a;
        SessionId b;
        long c;
        short d;
        Map<String, DBMessage> e;
        long f;
        boolean g;

        public a() {
            Object[] objArr = {f.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c31d26501087e67c1ffd28e8eec4488", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c31d26501087e67c1ffd28e8eec4488");
                return;
            }
            this.b = null;
            this.c = 0L;
            this.d = (short) -1;
            this.e = new HashMap();
            this.f = Long.MAX_VALUE;
            this.g = false;
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7112279c70aac3f59c4aff052f73f32", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7112279c70aac3f59c4aff052f73f32");
            } else {
                this.c = System.currentTimeMillis();
            }
        }

        public final void a(DBMessage dBMessage, boolean z) {
            Object[] objArr = {dBMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2834e5a7cd075c72c67a48997301c807", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2834e5a7cd075c72c67a48997301c807");
                return;
            }
            this.e.put(dBMessage.getMsgUuid(), dBMessage);
            if (z) {
                a();
            }
            if (dBMessage.getSts() < this.f) {
                this.f = dBMessage.getSts();
            }
        }

        public final void b(DBMessage dBMessage, boolean z) {
            Object[] objArr = {dBMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f6bdf6ed82a7336beedf12a15922769", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f6bdf6ed82a7336beedf12a15922769");
                return;
            }
            this.e.remove(dBMessage.getMsgUuid());
            if (z) {
                a();
            }
            b();
        }

        public final void a(long j, long j2, boolean z) {
            long j3 = j;
            long j4 = j2;
            Object[] objArr = {new Long(j3), new Long(j4), (byte) 1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa689fcf7a22f233ff7335233843d0a8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa689fcf7a22f233ff7335233843d0a8");
                return;
            }
            if (j3 <= 0) {
                j3 = 0;
            }
            if (j4 <= 0) {
                j4 = Long.MAX_VALUE;
            }
            if (j3 > j4) {
                com.sankuai.xm.im.utils.a.d("MessageDBProxy:Cache:delete: minTs > maxTs, %s, %s", Long.valueOf(j3), Long.valueOf(j4));
                return;
            }
            com.sankuai.xm.im.utils.a.a("MessageDBProxy:Cache:delete: before mMessageMap = %s", Integer.valueOf(this.e.size()));
            Iterator<Map.Entry<String, DBMessage>> it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                DBMessage value = it.next().getValue();
                if (value != null && value.getSts() >= j3 && value.getSts() <= j4) {
                    it.remove();
                }
            }
            com.sankuai.xm.im.utils.a.a("MessageDBProxy:Cache:delete:after mMessageMap = %s", Integer.valueOf(this.e.size()));
            a();
            b();
        }

        private void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab792d9313c82bb230b6d4b1fdb0f6fc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab792d9313c82bb230b6d4b1fdb0f6fc");
            } else if (this.e.size() > 0) {
                this.f = ((DBMessage) ((Map.Entry) Collections.min(this.e.entrySet(), new Comparator<Map.Entry<String, DBMessage>>() { // from class: com.sankuai.xm.im.cache.f.a.2
                    public static ChangeQuickRedirect a;

                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(Map.Entry<String, DBMessage> entry, Map.Entry<String, DBMessage> entry2) {
                        Map.Entry<String, DBMessage> entry3 = entry;
                        Map.Entry<String, DBMessage> entry4 = entry2;
                        Object[] objArr2 = {entry3, entry4};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abf3eb4f88d0ee295081b055e7c5855c", 6917529027641081856L)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abf3eb4f88d0ee295081b055e7c5855c")).intValue();
                        }
                        int i = ((entry3.getValue().getSts() - entry4.getValue().getSts()) > 0L ? 1 : ((entry3.getValue().getSts() - entry4.getValue().getSts()) == 0L ? 0 : -1));
                        if (i < 0) {
                            return -1;
                        }
                        return i == 0 ? 0 : 1;
                    }
                })).getValue()).getSts();
            } else {
                this.f = Long.MAX_VALUE;
            }
        }
    }
}
