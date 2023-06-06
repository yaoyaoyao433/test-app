package com.sankuai.xm.im.message.history;

import android.content.SharedPreferences;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBMessage;
import com.sankuai.xm.im.message.bean.CancelMessage;
import com.sankuai.xm.im.message.bean.ForceCancelMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.history.e;
import com.sankuai.xm.im.notifier.a;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.network.httpurlconnection.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class HistoryController {
    public static ChangeQuickRedirect a;
    public Map<SessionId, Set<Long>> b;
    private com.sankuai.xm.im.message.d c;
    private ConcurrentHashMap<Long, Long> d;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes6.dex */
    public interface HistoryMessageCallback {
        @Keep
        void onFailure(int i, String str);

        @Keep
        void onSuccess(SessionId sessionId, List<IMMessage> list, boolean z);
    }

    public static /* synthetic */ void a(HistoryController historyController, int i, List list, int i2, SessionId sessionId, HistoryMessageCallback historyMessageCallback) {
        Object[] objArr = {Integer.valueOf(i), list, Integer.valueOf(i2), sessionId, historyMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, historyController, changeQuickRedirect, false, "929a8b87e98cc4d0e6f520db4386bf67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, historyController, changeQuickRedirect, false, "929a8b87e98cc4d0e6f520db4386bf67");
        } else if (i != 0) {
            if (historyMessageCallback != null) {
                historyMessageCallback.onFailure(i, "查询失败");
            }
        } else if (list == null || list.isEmpty()) {
            if (historyMessageCallback != null) {
                historyMessageCallback.onSuccess(sessionId, null, i2 > 0);
            }
        } else {
            MessageUtils.printMsgIds(list);
            List<IMMessage> a2 = historyController.c.a((List<IMMessage>) list, 3);
            if (a2 == null) {
                if (historyMessageCallback != null) {
                    historyMessageCallback.onFailure(-1, "查询失败");
                }
            } else if (historyMessageCallback != null) {
                historyMessageCallback.onSuccess(sessionId, a2, i2 > 0);
            }
        }
    }

    public static /* synthetic */ void a(HistoryController historyController, e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, historyController, changeQuickRedirect, false, "114837facac75e2814a42ef640c4090a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, historyController, changeQuickRedirect, false, "114837facac75e2814a42ef640c4090a");
            return;
        }
        long[] jArr = (long[]) eVar.d.j.get("st-msgidB");
        if (jArr == null || jArr.length < 2) {
            return;
        }
        long j = jArr[1];
        HashMap hashMap = new HashMap();
        hashMap.put("count", Integer.valueOf(i));
        hashMap.put("net", Integer.valueOf(com.sankuai.xm.base.util.net.d.c(IMClient.a().f())));
        if (eVar.d.c.e == 2) {
            com.sankuai.xm.monitor.c.a("gphsss", Long.toString(j), (Map<String, Object>) hashMap);
        } else if (MessageUtils.isIMPeerService(eVar.d.c.e)) {
            com.sankuai.xm.monitor.c.a("imhsss", Long.toString(j), (Map<String, Object>) hashMap);
        } else {
            com.sankuai.xm.monitor.c.a("pbhsss", Long.toString(j), (Map<String, Object>) hashMap);
        }
    }

    public static /* synthetic */ void b(HistoryController historyController, e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, historyController, changeQuickRedirect, false, "1543bc29af0b5e92e5b2137d4604fefc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, historyController, changeQuickRedirect, false, "1543bc29af0b5e92e5b2137d4604fefc");
            return;
        }
        long[] jArr = (long[]) eVar.d.j.get("st-msgidB");
        if (jArr == null || jArr.length < 2) {
            return;
        }
        long j = jArr[1];
        HashMap hashMap = new HashMap();
        hashMap.put("reason", Integer.valueOf(i));
        hashMap.put("net", Integer.valueOf(com.sankuai.xm.base.util.net.d.c(IMClient.a().f())));
        if (eVar.d.c.e == 2) {
            com.sankuai.xm.monitor.c.a("gphser", hashMap);
            com.sankuai.xm.monitor.c.b("gphsss", Long.toString(j));
        } else if (MessageUtils.isIMPeerService(eVar.d.c.e)) {
            com.sankuai.xm.monitor.c.a("imhser", hashMap);
            com.sankuai.xm.monitor.c.b("imhsss", Long.toString(j));
        } else {
            com.sankuai.xm.monitor.c.a("pbhser", hashMap);
            com.sankuai.xm.monitor.c.b("pbhsss", Long.toString(j));
        }
    }

    public HistoryController(com.sankuai.xm.im.message.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8d4f41ecd7aa465e6d4bedee886d79b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8d4f41ecd7aa465e6d4bedee886d79b");
            return;
        }
        this.d = new ConcurrentHashMap<>();
        this.b = new HashMap();
        this.c = dVar;
    }

    public final void a(SessionId sessionId, long j, long j2, int i, boolean z, HistoryMessageCallback historyMessageCallback) {
        int i2;
        int i3;
        long j3 = j;
        Object[] objArr = {sessionId, new Long(j3), new Long(j2), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), historyMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e3fae3d31ec671e0428b4a4caaf3f24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e3fae3d31ec671e0428b4a4caaf3f24");
            return;
        }
        if (j3 == 0) {
            j3 = Long.MAX_VALUE;
        }
        e.a aVar = new e.a();
        aVar.d = i;
        aVar.c = sessionId;
        if (a(sessionId, j3, "id")) {
            aVar.g = (short) 3;
            i2 = 1;
            aVar.h = 1;
        } else {
            i2 = 1;
        }
        aVar.b = a("st-msgidB", sessionId);
        long max = Math.max(0L, j2);
        long a2 = IMClient.a().j().a(sessionId);
        int i4 = (a2 > 0L ? 1 : (a2 == 0L ? 0 : -1));
        if (i4 < 0) {
            aVar.b("fields", Collections.singletonList("chatTs"));
            Object[] objArr2 = new Object[i2];
            objArr2[0] = sessionId;
            com.sankuai.xm.im.utils.a.b("HistoryController::queryMessageHistoryByID: request for chatTs: %s.", objArr2);
        } else if (i4 > 0) {
            max = Math.max(max, a2 + 1);
            long msgIdToStamp = MessageUtils.msgIdToStamp(j3);
            i3 = 2;
            com.sankuai.xm.im.utils.a.b("HistoryController::queryMessageHistoryByID: request is not need, url: %s, st: %s, mid: %s, msgSts: %s, earliest: %s.", aVar.b, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(msgIdToStamp), Long.valueOf(a2));
            if (msgIdToStamp <= a2 || msgIdToStamp < max) {
                historyMessageCallback.onSuccess(sessionId, Collections.emptyList(), false);
                return;
            }
            long[] jArr = new long[i3];
            jArr[0] = max;
            jArr[1] = j3;
            aVar.a("st-msgidB", jArr);
            a(aVar, sessionId, new b(historyMessageCallback, z, true));
        }
        i3 = 2;
        long[] jArr2 = new long[i3];
        jArr2[0] = max;
        jArr2[1] = j3;
        aVar.a("st-msgidB", jArr2);
        a(aVar, sessionId, new b(historyMessageCallback, z, true));
    }

    public final List<IMMessage> a(List<IMMessage> list, int i, List<IMMessage> list2, List<IMMessage> list3) {
        int i2 = 0;
        Object[] objArr = {list, Integer.valueOf(i), list2, list3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4548e68231be2b136d2c9d4b0543c97f", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4548e68231be2b136d2c9d4b0543c97f");
        }
        if (com.sankuai.xm.base.util.b.a(list) || this.c == null) {
            return Collections.emptyList();
        }
        if (list.get(0).getMsgId() < list.get(list.size() - 1).getMsgId()) {
            Collections.reverse(list);
        }
        SessionId a2 = SessionId.a(list.get(0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        IMMessage iMMessage = null;
        for (IMMessage iMMessage2 : list) {
            if (this.c.b(iMMessage2.getMsgType()) == null && !(iMMessage2 instanceof CancelMessage)) {
                com.sankuai.xm.im.utils.a.c("HistoryController::onReceiveMessages.processHistoryMessages => unknown msginfo:" + iMMessage2.keyParamToString(), new Object[i2]);
            } else {
                DBMessage a3 = DBProxy.l().k.a(iMMessage2.getCategory(), iMMessage2.getMsgUuid(), true);
                if (a3 != null) {
                    IMMessage dbMessageToIMMessage = MessageUtils.dbMessageToIMMessage(a3);
                    if ((iMMessage2 instanceof CancelMessage) && a3.getMsgType() != 12) {
                        com.sankuai.xm.im.utils.a.c("HistoryController::onReceiveMessages.processHistoryMessages => message is cancel message msginfo:" + iMMessage2.keyParamToString(), new Object[i2]);
                        arrayList2.add(iMMessage2);
                    } else {
                        com.sankuai.xm.im.utils.a.c("HistoryController::onReceiveMessages.processHistoryMessages => message is duplicate message msginfo:" + iMMessage2.keyParamToString(), new Object[i2]);
                        list3.add(dbMessageToIMMessage);
                    }
                    boolean z = iMMessage2 instanceof ForceCancelMessage;
                    if (!z && iMMessage != null && !MessageUtils.isContinuityMsg(iMMessage2.getMsgSeqid(), iMMessage2.getMsgFlag(), iMMessage.getMsgSeqid(), iMMessage.getMsgFlag()) && dbMessageToIMMessage.getMsgId() != list.get(list.size() - 1).getMsgId()) {
                        com.sankuai.xm.im.utils.a.c("HistoryController::onReceiveMessages.processHistoryMessages => message is border message msginfo:" + iMMessage2.keyParamToString() + " premsginfo:" + iMMessage.keyParamToString(), new Object[0]);
                        dbMessageToIMMessage.setMsgFlag(1L);
                        iMMessage.setMsgFlag(1L);
                        arrayList.add(dbMessageToIMMessage);
                        if (!arrayList.contains(iMMessage)) {
                            arrayList.add(iMMessage);
                        }
                    }
                    if (!z) {
                        iMMessage = dbMessageToIMMessage;
                    }
                } else {
                    this.c.b(iMMessage2);
                    if (iMMessage2 instanceof CancelMessage) {
                        arrayList2.add(iMMessage2);
                    } else {
                        list2.add(iMMessage2);
                    }
                    if (!(iMMessage2 instanceof ForceCancelMessage)) {
                        iMMessage = iMMessage2;
                    }
                }
            }
            i2 = 0;
        }
        com.sankuai.xm.im.utils.a.b("HistoryController::onReceiveMessages.processHistoryMessages => processed=" + list2.size() + ",cancel=" + arrayList2.size() + ",duplicate=" + list3.size() + ",session=" + a2.f(), new Object[0]);
        if (!arrayList2.isEmpty()) {
            this.c.b(arrayList2, 3);
        }
        return arrayList;
    }

    public void a(e.a aVar, SessionId sessionId, HistoryMessageCallback historyMessageCallback) {
        e dVar;
        Object[] objArr = {aVar, sessionId, historyMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8f0c5f89010c7f825300e6955547b1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8f0c5f89010c7f825300e6955547b1b");
        } else if (ac.a(aVar.b)) {
            if (historyMessageCallback != null) {
                historyMessageCallback.onFailure(10011, "调用参数出错，请检查");
            }
        } else {
            if (ac.a(aVar.i, "st-et") || ac.a(aVar.i, "st-msgidB")) {
                dVar = new d(aVar.b, null);
            } else {
                dVar = new e(aVar.b, null);
            }
            e eVar = dVar;
            if (IMClient.a().k() == 0) {
                if (historyMessageCallback != null) {
                    historyMessageCallback.onFailure(10007, "用户信息异常，拉取历史消息失败，请稍后重试");
                    return;
                }
                return;
            }
            try {
                eVar.a(new com.sankuai.xm.network.httpurlconnection.retry.a());
                eVar.a(aVar);
                eVar.a(new com.sankuai.xm.im.message.history.a(eVar, 0, aVar, eVar, sessionId, historyMessageCallback) { // from class: com.sankuai.xm.im.message.history.HistoryController.1
                    public static ChangeQuickRedirect b;
                    public final /* synthetic */ e.a c;
                    public final /* synthetic */ e d;
                    public final /* synthetic */ SessionId e;
                    public final /* synthetic */ HistoryMessageCallback f;

                    {
                        this.c = aVar;
                        this.d = eVar;
                        this.e = sessionId;
                        this.f = historyMessageCallback;
                    }

                    @Override // com.sankuai.xm.im.message.history.a
                    public final void a(int i, int i2, List<IMMessage> list) {
                        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), list};
                        ChangeQuickRedirect changeQuickRedirect2 = b;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01412620e145d42ffe48cb56b337691d", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01412620e145d42ffe48cb56b337691d");
                            return;
                        }
                        if (this.c.j != null && this.c.j.containsKey("st-msgidB")) {
                            if (i == 0) {
                                HistoryController.a(HistoryController.this, this.d, list != null ? list.size() : 0);
                            } else {
                                HistoryController.b(HistoryController.this, this.d, i);
                            }
                        }
                        int i3 = (this.e.e != 3 || i2 >= this.c.d) ? i2 : -1;
                        if (!(this.f instanceof b) || ((b) this.f).b != 3) {
                            HistoryController.this.a(i, list, i3, this.e, this.f, this.d);
                        } else {
                            HistoryController.a(HistoryController.this, i, list, i3, this.e, this.f);
                        }
                    }
                });
                g.a().a((com.sankuai.xm.network.httpurlconnection.e) eVar, 0L);
            } catch (JSONException unused) {
                a(1, (List<IMMessage>) null, -1, sessionId, historyMessageCallback, eVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0166, code lost:
        r0 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016b, code lost:
        if (r27 <= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016d, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x016f, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0170, code lost:
        r0 = a(r28, r30, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0174, code lost:
        if (r27 <= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0177, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0178, code lost:
        r29.onSuccess(r28, r0, r4);
     */
    @com.sankuai.xm.base.trace.annotation.Trace(name = "history_parse", type = com.sankuai.xm.base.trace.i.normal)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(@com.sankuai.xm.base.trace.annotation.TraceStatus int r25, java.util.List<com.sankuai.xm.im.message.bean.IMMessage> r26, int r27, com.sankuai.xm.im.session.SessionId r28, com.sankuai.xm.im.message.history.HistoryController.HistoryMessageCallback r29, com.sankuai.xm.im.message.history.e r30) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.history.HistoryController.a(int, java.util.List, int, com.sankuai.xm.im.session.SessionId, com.sankuai.xm.im.message.history.HistoryController$HistoryMessageCallback, com.sankuai.xm.im.message.history.e):void");
    }

    private void a(SessionId sessionId, e eVar, List<IMMessage> list) {
        int i = 0;
        Object[] objArr = {sessionId, eVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0f1af25bb8361aeae42547161d3f857", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0f1af25bb8361aeae42547161d3f857");
        } else if (sessionId == null || eVar == null || eVar.d() == null || com.sankuai.xm.base.util.b.a(list)) {
        } else {
            e.a d = eVar.d();
            if (d.h != 1) {
                return;
            }
            long j = 0;
            if (ac.a(d.i, "st-et") || ac.a(d.i, "st-msgidB") || ac.a(d.i, "id")) {
                if (ac.a(d.i, "st-et")) {
                    long[] jArr = (long[]) d.j.get(d.i);
                    if (jArr != null && jArr.length >= 2) {
                        j = jArr[1];
                        i = 2;
                    }
                } else {
                    j = eVar.c();
                    i = 1;
                }
            }
            com.sankuai.xm.im.message.e.a(sessionId, j, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115 A[Catch: all -> 0x026c, Exception -> 0x026f, TRY_ENTER, TryCatch #4 {Exception -> 0x026f, all -> 0x026c, blocks: (B:8:0x0040, B:10:0x005c, B:23:0x00a0, B:25:0x00ad, B:42:0x0115, B:44:0x015c, B:45:0x0165, B:28:0x00b6, B:29:0x00c7, B:32:0x00cf, B:34:0x00da, B:11:0x0067, B:13:0x0073, B:14:0x0084, B:17:0x008e, B:19:0x0096), top: B:84:0x0040 }] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.sankuai.xm.im.message.bean.IMMessage> a(final com.sankuai.xm.im.session.SessionId r34, com.sankuai.xm.im.message.history.e r35, java.util.List<com.sankuai.xm.im.message.bean.IMMessage> r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.history.HistoryController.a(com.sankuai.xm.im.session.SessionId, com.sankuai.xm.im.message.history.e, java.util.List, boolean):java.util.List");
    }

    private boolean a(List<IMMessage> list, e eVar, int i, SessionId sessionId) {
        e.a d;
        IMMessage iMMessage;
        Object[] objArr = {list, eVar, Integer.valueOf(i), sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cfebdea03f1f2a45759be18b20e513e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cfebdea03f1f2a45759be18b20e513e")).booleanValue();
        }
        try {
            if (!com.sankuai.xm.base.util.b.a(list) && eVar != null) {
                eVar.a(list);
                if (i > 0 && (d = eVar.d()) != null) {
                    List<IMMessage> unDeleteMessages = MessageUtils.getUnDeleteMessages(eVar.g());
                    if (d.d == 0 || com.sankuai.xm.base.util.b.b(unDeleteMessages) < d.d) {
                        List<IMMessage> g = eVar.g();
                        String e = eVar.e();
                        if (ac.a(e, "id")) {
                            if (ac.a(a("id_reverse", sessionId), eVar.d().b)) {
                                iMMessage = g.get(0);
                            } else {
                                iMMessage = g.get(g.size() - 1);
                            }
                        } else {
                            if (!ac.a(e, "st-et") && !ac.a(e, "st-msgidB")) {
                                if (!ac.a(e, "last_normal")) {
                                    return false;
                                }
                                iMMessage = g.get(g.size() - 1);
                            }
                            iMMessage = g.get(g.size() - 1);
                        }
                        if (iMMessage.getMsgStatus() != 13) {
                            return false;
                        }
                        boolean a2 = eVar.a(iMMessage);
                        if (a2) {
                            StringBuilder sb = new StringBuilder("HistoryController::continueHistoryRequest param:");
                            sb.append(eVar.F() == null ? "" : eVar.F().toString());
                            com.sankuai.xm.im.utils.a.b(sb.toString(), new Object[0]);
                        }
                        return a2;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } catch (Exception e2) {
            com.sankuai.xm.im.utils.a.a(e2, "%s::continueHistoryRequest", "HistoryController::");
            return false;
        }
    }

    private void a(SessionId sessionId, List<IMMessage> list, int i, HistoryMessageCallback historyMessageCallback) {
        Object[] objArr = {sessionId, list, Integer.valueOf(i), historyMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6707538aa97464691fab2b1f8fb6ece", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6707538aa97464691fab2b1f8fb6ece");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!com.sankuai.xm.base.util.b.a(list)) {
            arrayList.addAll(list);
        }
        List<IMMessage> unDeleteMessages = MessageUtils.getUnDeleteMessages(arrayList);
        com.sankuai.xm.im.utils.a.b("HistoryController::notifyHistoryCallback messages:" + unDeleteMessages.size() + " next:" + i, new Object[0]);
        historyMessageCallback.onSuccess(sessionId, unDeleteMessages, i > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.xm.im.session.SessionId r12, long r13, com.sankuai.xm.im.message.history.HistoryController.HistoryMessageCallback r15) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r13)
            r2 = 1
            r0[r2] = r1
            r1 = 2
            r0[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.im.message.history.HistoryController.a
            java.lang.String r10 = "e281f67bc26fe53c7e2db567b70432d3"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L26:
            com.sankuai.xm.im.message.history.e$a r0 = new com.sankuai.xm.im.message.history.e$a
            r0.<init>()
            r0.f = r13
            r0.c = r12
            int r12 = r12.e
            switch(r12) {
                case 1: goto L3f;
                case 2: goto L3f;
                case 3: goto L38;
                default: goto L34;
            }
        L34:
            switch(r12) {
                case 9: goto L3f;
                case 10: goto L38;
                case 11: goto L38;
                default: goto L37;
            }
        L37:
            return
        L38:
            java.lang.String r12 = "/msg/api/pub/v3/message/previous"
            java.lang.String r12 = com.sankuai.xm.im.http.a.a(r12)
            goto L45
        L3f:
            java.lang.String r12 = "/msg/api/chat/v3/message/previous"
            java.lang.String r12 = com.sankuai.xm.im.http.a.a(r12)
        L45:
            com.sankuai.xm.im.message.history.c r13 = new com.sankuai.xm.im.message.history.c
            r14 = 0
            r13.<init>(r12, r14)
            r11.a(r13, r0, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.history.HistoryController.a(com.sankuai.xm.im.session.SessionId, long, com.sankuai.xm.im.message.history.HistoryController$HistoryMessageCallback):void");
    }

    private void a(c cVar, e.a aVar, HistoryMessageCallback historyMessageCallback) {
        Object[] objArr = {cVar, aVar, historyMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "306bd1c82078c73f1dfc219d60641e65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "306bd1c82078c73f1dfc219d60641e65");
            return;
        }
        try {
            cVar.a(aVar);
            cVar.a(new com.sankuai.xm.im.message.history.a(cVar, 1, aVar, historyMessageCallback, cVar) { // from class: com.sankuai.xm.im.message.history.HistoryController.2
                public static ChangeQuickRedirect b;
                public final /* synthetic */ e.a c;
                public final /* synthetic */ HistoryMessageCallback d;
                public final /* synthetic */ c e;

                {
                    this.c = aVar;
                    this.d = historyMessageCallback;
                    this.e = cVar;
                }

                @Override // com.sankuai.xm.im.message.history.a
                public final void a(int i, int i2, List<IMMessage> list) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), list};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60bee3557b5954a7a4975a86d13e73c3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60bee3557b5954a7a4975a86d13e73c3");
                    } else {
                        HistoryController.this.a(i, list, i2, this.c.c, this.d, this.e);
                    }
                }
            });
            g.a().a((com.sankuai.xm.network.httpurlconnection.e) cVar, 0L);
        } catch (JSONException unused) {
            a(1, (List<IMMessage>) null, -1, aVar.c, historyMessageCallback, cVar);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94c823454a5fe9bc2fb71aac69b8c4a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94c823454a5fe9bc2fb71aac69b8c4a5");
        } else {
            this.d.clear();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b27130af57392195076c27264ad37b03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b27130af57392195076c27264ad37b03");
            return;
        }
        this.d.clear();
        SharedPreferences.Editor edit = com.sankuai.xm.im.utils.b.a().edit();
        if (edit == null) {
            com.sankuai.xm.im.utils.a.d("HistoryController::cleanVersion, SharedPreferences.Editor == null", new Object[0]);
            return;
        }
        Map<String, ?> all = com.sankuai.xm.im.utils.b.a().getAll();
        if (all != null) {
            HashSet<String> hashSet = new HashSet(all.keySet());
            for (String str : hashSet) {
                if (str.contains("imlib_grp_jts")) {
                    edit.remove(str);
                }
            }
            hashSet.clear();
        }
        com.sankuai.xm.im.utils.b.a(edit);
    }

    public String a(String str, SessionId sessionId) {
        Object[] objArr = {str, sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa1f4ab3a27f4d5a520e10176aa0fe2d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa1f4ab3a27f4d5a520e10176aa0fe2d");
        }
        if (ac.a(str)) {
            return "";
        }
        if (ac.a(str, "st-et", "st-msgidB")) {
            if (MessageUtils.isPubService(sessionId.e)) {
                return com.sankuai.xm.im.http.a.a("/msg/api/pub/v3/history/chat/range");
            }
            return com.sankuai.xm.im.http.a.a("/msg/api/chat/v3/history/channel/range");
        } else if (ac.a(str, "id_reverse")) {
            if (sessionId.e == 2 || MessageUtils.isIMPeerService(sessionId.e)) {
                return com.sankuai.xm.im.http.a.a("/msg/api/chat/v1/history/reverse/byid");
            }
            return MessageUtils.isPubService(sessionId.e) ? com.sankuai.xm.im.http.a.a("/msg/api/pub/v1/history/chat/reverse/byid") : "";
        } else {
            return "";
        }
    }

    public final void a(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27d6b4ddb80cb4e83dc2acd6b5196e52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27d6b4ddb80cb4e83dc2acd6b5196e52");
            return;
        }
        synchronized (this) {
            try {
                if (sessionId == null) {
                    this.b.clear();
                } else {
                    this.b.remove(sessionId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(SessionId sessionId, long j, String str) {
        Object[] objArr = {sessionId, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa4aa8116eada862940b5e2a1c7f9fac", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa4aa8116eada862940b5e2a1c7f9fac")).booleanValue();
        }
        synchronized (this) {
            if (this.b.containsKey(sessionId)) {
                Set<Long> set = this.b.get(sessionId);
                if (set == null) {
                    return false;
                }
                if ("id".equals(str)) {
                    return set.remove(Long.valueOf(j));
                }
                for (Long l : set) {
                    if (MessageUtils.msgIdToStamp(l.longValue()) == j) {
                        set.remove(l);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends a.AbstractC1394a<HistoryMessageCallback> implements HistoryMessageCallback {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.xm.im.message.history.HistoryController.HistoryMessageCallback
        public void onSuccess(SessionId sessionId, List<IMMessage> list, boolean z) {
            Object[] objArr = {sessionId, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d130db728d3ad6d10e917f32fb5dd08", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d130db728d3ad6d10e917f32fb5dd08");
            } else if (a()) {
                onFailure(19100, "account changed during requesting.");
            } else {
                ((HistoryMessageCallback) this.c).onSuccess(sessionId, list, z);
            }
        }

        @Override // com.sankuai.xm.im.message.history.HistoryController.HistoryMessageCallback
        public void onFailure(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94a69028000e214cd632547b0983f9c9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94a69028000e214cd632547b0983f9c9");
            } else {
                ((HistoryMessageCallback) this.c).onFailure(i, str);
            }
        }
    }
}
