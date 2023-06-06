package com.sankuai.xm.integration.knb.handler;

import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.bridge.base.util.a;
import com.sankuai.xm.im.bridge.business.proto.im.b;
import com.sankuai.xm.im.bridge.business.proto.im.c;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.im.message.history.HistoryController;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.integration.knb.result.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GetMessagesJsHandler extends BaseIMJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "gCi35caf9bh3ydWU2Wn2rrj/lHIfyeLgK6VCsS+DSeGJENiq8yhmy0mTYrgbYQIXY7Amy3jy/jHYlb8LTTeXQg==";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    @Trace(name = "start", traceName = "enter_session")
    public void innerExe() {
        ?? r4;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35ea1fcaffadf6119a2fe00304fe8952", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35ea1fcaffadf6119a2fe00304fe8952");
            return;
        }
        try {
            j.a(i.begin, "start", "enter_session", 0L, "single", new Object[0]);
            JSONObject jSONObject = jsBean().argsJson;
            final b bVar = new b(this);
            Object[] objArr2 = {jSONObject, bVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.bridge.business.proto.im.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "cf5ddd1eeee10d4ef76dba97d0bbf9b8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "cf5ddd1eeee10d4ef76dba97d0bbf9b8");
                r4 = 0;
            } else {
                try {
                    final SessionId d = c.d(jSONObject);
                    final String optString = jSONObject.optString("type", MessageStatisticsEntry.PARAM_MSG_ID);
                    int optInt = jSONObject.optInt("limit", 30);
                    if (optInt > 30) {
                        a.b("GetMessagesJsHandler::innerExe params limit", new Object[0]);
                        optInt = 30;
                    }
                    if (optInt <= 0) {
                        optInt = 30;
                    }
                    final long optLong = jSONObject.optLong(MessageStatisticsEntry.PARAM_MSG_ID, Long.MAX_VALUE);
                    try {
                        final long optLong2 = jSONObject.optLong("start", 0L);
                        long optLong3 = jSONObject.optLong("end", Long.MAX_VALUE);
                        long optLong4 = jSONObject.optLong("sts", Long.MAX_VALUE);
                        int optInt2 = jSONObject.optInt("direction", 0);
                        String optString2 = jSONObject.optString("queryType", "");
                        StringBuilder sb = new StringBuilder("GetMessagesJsHandler::innerExe sid:");
                        sb.append(d);
                        sb.append(" type:");
                        sb.append(optString);
                        sb.append(" limit:");
                        sb.append(optInt);
                        sb.append(" mid:");
                        sb.append(optLong);
                        sb.append(" st:");
                        sb.append(optLong2);
                        sb.append(" et:");
                        sb.append(optLong3);
                        sb.append(" sts:");
                        long j = optLong3;
                        sb.append(optLong4);
                        sb.append(" direction:");
                        sb.append(optInt2);
                        sb.append(" queryType:");
                        sb.append(optString2);
                        a.a(sb.toString(), new Object[0]);
                        if (optInt2 > 0) {
                            IMClient.a().a(d, optLong, optInt, 1, (HistoryController.HistoryMessageCallback) new b.a(bVar, new ArrayList()));
                        } else {
                            r4 = ac.a(optString, MessageStatisticsEntry.PARAM_MSG_ID, "timeRange");
                            try {
                                if (r4 != 0) {
                                    if (ac.a(optString, MessageStatisticsEntry.PARAM_MSG_ID)) {
                                        j = optLong4;
                                    }
                                    if (ac.a(optString2, PackageLoadReporter.LoadType.LOCAL)) {
                                        IMClient.g<List<IMMessage>> gVar = new IMClient.g<List<IMMessage>>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.3
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.xm.im.IMClient.g
                                            public final /* synthetic */ void a(List<IMMessage> list) {
                                                List<IMMessage> list2 = list;
                                                Object[] objArr3 = {list2};
                                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ea6d026191c9bd198cb5e359763f45f8", 6917529027641081856L)) {
                                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ea6d026191c9bd198cb5e359763f45f8");
                                                } else {
                                                    b.a(bVar, list2, null);
                                                }
                                            }
                                        };
                                        if (ac.a(optString, MessageStatisticsEntry.PARAM_MSG_ID)) {
                                            IMClient.a().a(d, j, optLong2, optInt, gVar);
                                        } else {
                                            IMClient.a().a(d, optLong2, j, optInt, (short) 0, gVar);
                                        }
                                    } else if (ac.a(optString2, LocalIdUtils.FROM_SERVER)) {
                                        HistoryController.HistoryMessageCallback historyMessageCallback = new HistoryController.HistoryMessageCallback() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.4
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.xm.im.message.history.HistoryController.HistoryMessageCallback
                                            public final void onFailure(int i, String str) {
                                                Object[] objArr3 = {Integer.valueOf(i), str};
                                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b7cb1beb680a0bdb3b80a3c1120de8a2", 6917529027641081856L)) {
                                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b7cb1beb680a0bdb3b80a3c1120de8a2");
                                                } else {
                                                    bVar.a(i, str);
                                                }
                                            }

                                            @Override // com.sankuai.xm.im.message.history.HistoryController.HistoryMessageCallback
                                            public final void onSuccess(SessionId sessionId, List<IMMessage> list, boolean z) {
                                                Object[] objArr3 = {sessionId, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1c6ab7e78f56ac3d95f4b6ba3c1ed62d", 6917529027641081856L)) {
                                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1c6ab7e78f56ac3d95f4b6ba3c1ed62d");
                                                } else {
                                                    b.a(bVar, list, Boolean.valueOf(z));
                                                }
                                            }
                                        };
                                        if (ac.a(optString, "timeRange")) {
                                            IMClient.a().a(d, optLong2, j, optInt, historyMessageCallback);
                                        } else if (ac.a(optString, MessageStatisticsEntry.PARAM_MSG_ID)) {
                                            IMClient.a().a(d, optLong, optLong2, optInt, false, historyMessageCallback);
                                        }
                                    } else {
                                        final int i = optInt;
                                        r4 = 0;
                                        r4 = 0;
                                        final long j2 = j;
                                        IMClient.g<List<IMMessage>> gVar2 = new IMClient.g<List<IMMessage>>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.5
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.xm.im.IMClient.g
                                            public final /* synthetic */ void a(List<IMMessage> list) {
                                                List<IMMessage> list2 = list;
                                                Object[] objArr3 = {list2};
                                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c21632f645a61b82fc16f4ab2cff8a64", 6917529027641081856L)) {
                                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c21632f645a61b82fc16f4ab2cff8a64");
                                                } else if (com.sankuai.xm.base.util.b.b(list2) < i) {
                                                    if (ac.a(optString, "timeRange")) {
                                                        IMClient.a().a(d, optLong2, j2, i, new a(bVar, list2));
                                                    } else if (ac.a(optString, MessageStatisticsEntry.PARAM_MSG_ID)) {
                                                        IMClient.a().a(d, optLong, optLong2, i, false, (HistoryController.HistoryMessageCallback) new a(bVar, list2));
                                                    }
                                                } else {
                                                    b.a(bVar, list2, null);
                                                }
                                            }
                                        };
                                        if (ac.a(optString, MessageStatisticsEntry.PARAM_MSG_ID)) {
                                            IMClient.a().a(d, j, optLong2, optInt, gVar2);
                                        } else {
                                            IMClient.a().a(d, optLong2, j, optInt, (short) 0, gVar2);
                                        }
                                    }
                                } else {
                                    r4 = 0;
                                    bVar.a(-1, "unknown type for getting messages.");
                                }
                            } catch (Throwable th) {
                                th = th;
                                a.c("getMessages exception:" + th, new Object[0]);
                                bVar.a(-1, "exception:" + th);
                                j.a((Object) r4);
                            }
                        }
                        r4 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        r4 = 0;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r4 = 0;
                }
            }
            j.a((Object) r4);
        } catch (Throwable th4) {
            j.a(th4);
            throw th4;
        }
    }
}
