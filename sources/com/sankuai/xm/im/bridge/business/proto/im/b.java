package com.sankuai.xm.im.bridge.business.proto.im;

import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.DataMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.im.message.d;
import com.sankuai.xm.im.message.history.HistoryController;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar, boolean z, List list, int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), list, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba09b9ac8a46c03ebc0904a236cc14fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba09b9ac8a46c03ebc0904a236cc14fb");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.sankuai.xm.im.session.entry.a aVar = (com.sankuai.xm.im.session.entry.a) it.next();
                if (aVar != null) {
                    SessionId c = aVar.c();
                    if (i == 0 || c.e == i) {
                        if (i != 0 && i2 != c.e()) {
                        }
                        if (i3 == 0 || (MessageUtils.isIMPeerService(c.e) && i3 == c.d)) {
                            arrayList.add(aVar);
                        }
                    }
                }
            }
        }
        if (z) {
            a(bVar, arrayList);
        } else if (i4 >= 0 && i4 < arrayList.size()) {
            int i6 = i4 + i5;
            if (i6 > arrayList.size()) {
                i6 = arrayList.size();
            }
            com.sankuai.xm.im.bridge.base.util.a.a("GetSessionsJsHandler::innerExe result sessions:" + com.sankuai.xm.base.util.b.b(list) + " filter sessions:" + com.sankuai.xm.base.util.b.b(arrayList), new Object[0]);
            a(bVar, new ArrayList(arrayList.subList(i4, i6)));
        } else {
            a(bVar, new ArrayList());
        }
    }

    public static void a(JSONObject jSONObject, final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar) {
        Object[] objArr = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf80ea08427d5b6f94e29f5e1190177c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf80ea08427d5b6f94e29f5e1190177c");
            return;
        }
        try {
            String optString = jSONObject.optString("uuid");
            long a2 = ac.a(jSONObject.optString(MessageStatisticsEntry.PARAM_MSG_ID), 0L);
            if (ac.a(optString) && a2 <= 0) {
                bVar.a(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT, "params error");
                return;
            }
            IMClient.g<IMMessage> gVar = new IMClient.g<IMMessage>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.12
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.g
                public final /* synthetic */ void a(IMMessage iMMessage) {
                    IMMessage iMMessage2 = iMMessage;
                    Object[] objArr2 = {iMMessage2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fed30c9f273a63d1df99b0bc859ed6f7", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fed30c9f273a63d1df99b0bc859ed6f7");
                    } else {
                        b.a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b.this, iMMessage2);
                    }
                }
            };
            if (!ac.a(optString)) {
                IMClient.a().a(c.a(jSONObject), optString, gVar);
                return;
            }
            IMClient a3 = IMClient.a();
            int a4 = c.a(jSONObject);
            Object[] objArr2 = {Integer.valueOf(a4), new Long(a2), gVar};
            ChangeQuickRedirect changeQuickRedirect2 = IMClient.a;
            if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "4029c585c572a29d9ccc381da25ff886", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "4029c585c572a29d9ccc381da25ff886");
            } else if (a3.a(gVar)) {
            } else {
                ((d) a3.C().a()).a(a4, a2, com.sankuai.xm.im.notifier.a.a(gVar, new IMMessage(), 1));
            }
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("getMessageByUUID exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }

    private static void a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar, List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {bVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30b6a31caaf18768573635829e6806aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30b6a31caaf18768573635829e6806aa");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sessions", c.c(list));
            bVar.a(jSONObject);
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("onSessionsResult exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }

    public static void a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar, IMMessage iMMessage, boolean z, final IMClient.m mVar) {
        int a2;
        Object[] objArr = {bVar, iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "910ce794c5ed3e80d4fefd51cdf2acb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "910ce794c5ed3e80d4fefd51cdf2acb8");
            return;
        }
        final IMClient.m mVar2 = com.sankuai.xm.im.bridge.a.a().c;
        IMClient.m mVar3 = new IMClient.m() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.20
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.IMClient.m
            public final void a(IMMessage iMMessage2, Callback<IMMessage> callback) {
                Object[] objArr2 = {iMMessage2, callback};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "350de5e739d86fe06111e6959b1c2e51", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "350de5e739d86fe06111e6959b1c2e51");
                } else {
                    IMClient.m.this.a(iMMessage2, callback);
                }
            }

            @Override // com.sankuai.xm.im.IMClient.SendMediaMessageCallback
            public final void onProgress(MediaMessage mediaMessage, double d, double d2) {
                Object[] objArr2 = {mediaMessage, Double.valueOf(d), Double.valueOf(d2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d5cb94760473d908e76bb67f5f765d1", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d5cb94760473d908e76bb67f5f765d1");
                    return;
                }
                IMClient.m.this.onProgress(mediaMessage, d, d2);
                mVar.onProgress(mediaMessage, d, d2);
            }

            @Override // com.sankuai.xm.im.IMClient.SendMediaMessageCallback
            public final void a(MediaMessage mediaMessage, int i) {
                Object[] objArr2 = {mediaMessage, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f538e30c2456a7c7af024d9ce430f691", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f538e30c2456a7c7af024d9ce430f691");
                    return;
                }
                IMClient.m.this.a(mediaMessage, i);
                mVar.a(mediaMessage, i);
            }

            @Override // com.sankuai.xm.im.IMClient.SendMessageCallback
            public final void a(IMMessage iMMessage2) {
                Object[] objArr2 = {iMMessage2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "243a889ec311e06b00338ab24bd5d5cf", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "243a889ec311e06b00338ab24bd5d5cf");
                    return;
                }
                IMClient.m.this.a(iMMessage2);
                mVar.a(iMMessage2);
            }

            @Override // com.sankuai.xm.im.IMClient.SendMessageCallback
            public final void onFailure(IMMessage iMMessage2, int i) {
                Object[] objArr2 = {iMMessage2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a0045dff9d47ec2dbf7bef73dbd1c6f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a0045dff9d47ec2dbf7bef73dbd1c6f");
                    return;
                }
                IMClient.m.this.onFailure(iMMessage2, i);
                mVar.onFailure(iMMessage2, i);
            }

            @Override // com.sankuai.xm.im.IMClient.SendMessageCallback
            public final void a(IMMessage iMMessage2, int i) {
                Object[] objArr2 = {iMMessage2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "818fe80fe20c7cc0ba6e094e35bfc172", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "818fe80fe20c7cc0ba6e094e35bfc172");
                    return;
                }
                IMClient.m.this.a(iMMessage2, i);
                mVar.a(iMMessage2, i);
            }
        };
        if (iMMessage instanceof DataMessage) {
            a2 = IMClient.a().a((DataMessage) iMMessage, (IMClient.SendMessageCallback) mVar);
        } else {
            IMClient a3 = IMClient.a();
            if (mVar2 != null) {
                mVar = mVar3;
            }
            a2 = a3.a(iMMessage, z, mVar);
        }
        if (a2 == 0) {
            a(bVar, iMMessage);
        } else {
            bVar.a(a2, "send message failed.");
        }
    }

    static void a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar, Message message) {
        Object[] objArr = {bVar, message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7176eeb6d54b7963f98038f94acc9343", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7176eeb6d54b7963f98038f94acc9343");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", c.a(message));
            bVar.a(jSONObject);
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("onMessageResult exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }

    public static void b(JSONObject jSONObject, final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar) {
        short[] sArr;
        int[] iArr;
        Object[] objArr = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9b4ff3a5ff4576d3d2b2a1c7f3780fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9b4ff3a5ff4576d3d2b2a1c7f3780fe");
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("channelIds");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("sessionTypes");
            long optLong = jSONObject.optLong("cleanTs");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                sArr = null;
            } else {
                short[] sArr2 = new short[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    sArr2[i] = (short) optJSONArray.optInt(i);
                }
                sArr = sArr2;
            }
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                iArr = null;
            } else {
                int[] iArr2 = new int[optJSONArray2.length()];
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    iArr2[i2] = c.a(optJSONArray2.optString(i2));
                }
                iArr = iArr2;
            }
            IMClient a2 = IMClient.a();
            com.sankuai.xm.im.a<Void> aVar = new com.sankuai.xm.im.a<Void>() { // from class: com.sankuai.xm.im.bridge.business.proto.im.b.22
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    Object[] objArr2 = {(Void) obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "016b41c71dd52471b011cd27c72bd356", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "016b41c71dd52471b011cd27c72bd356");
                    } else {
                        com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b.this.a(new JSONObject());
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i3, String str) {
                    Object[] objArr2 = {Integer.valueOf(i3), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e178156692acd496918fb286980e2ca1", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e178156692acd496918fb286980e2ca1");
                    } else {
                        com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b.this.a(i3, str);
                    }
                }
            };
            Object[] objArr2 = {sArr, iArr, new Long(optLong), aVar};
            ChangeQuickRedirect changeQuickRedirect2 = IMClient.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "0eb3a99f8db9be53b2da832b89289269", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "0eb3a99f8db9be53b2da832b89289269");
            } else if (!a2.a(aVar)) {
                com.sankuai.xm.im.utils.a.b("IMClient::cleanSessions,channels=%s,category=%s,before=%d", Arrays.toString(sArr), Arrays.toString(iArr), Long.valueOf(optLong));
                ((com.sankuai.xm.im.session.c) a2.E().a()).a(sArr, iArr, true, optLong, true, false, com.sankuai.xm.im.notifier.a.a(aVar, (Object) null, 1));
            }
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("cleanSessions exception:" + th, new Object[0]);
            bVar.a(-1, "exception:" + th);
        }
    }

    public static void a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar, List<IMMessage> list, Boolean bool) {
        Object[] objArr = {bVar, list, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0abad2d0cb9f7a0b1cfa3a07180bd133", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0abad2d0cb9f7a0b1cfa3a07180bd133");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            com.sankuai.xm.im.utils.c.a((List<? extends Message>) list, true);
            MessageUtils.printMsgIds(list);
            jSONObject.put("messages", c.a(list));
            if (bool != null) {
                jSONObject.put("hasMore", bool);
            }
            bVar.a(jSONObject);
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("onMessageResult exception:" + th, new Object[0]);
            bVar.a(-1, "onMessageResult exception:" + th);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a implements HistoryController.HistoryMessageCallback {
        public static ChangeQuickRedirect a;
        private List<IMMessage> b;
        private com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b c;

        public a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar, List<IMMessage> list) {
            Object[] objArr = {bVar, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7828e2b7dd0d13b173faab8499bc57e4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7828e2b7dd0d13b173faab8499bc57e4");
                return;
            }
            this.b = list == null ? new ArrayList<>() : list;
            this.c = bVar;
        }

        @Override // com.sankuai.xm.im.message.history.HistoryController.HistoryMessageCallback
        public final void onFailure(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5af02fa87d02a7c4f0debb38523e064", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5af02fa87d02a7c4f0debb38523e064");
            } else {
                this.c.a(i, str);
            }
        }

        @Override // com.sankuai.xm.im.message.history.HistoryController.HistoryMessageCallback
        public final void onSuccess(SessionId sessionId, List<IMMessage> list, boolean z) {
            Object[] objArr = {sessionId, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d0593d5287e4c1b8a664c01df9f0cf4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d0593d5287e4c1b8a664c01df9f0cf4");
                return;
            }
            if (!com.sankuai.xm.base.util.b.a(list)) {
                for (IMMessage iMMessage : this.b) {
                    if (!list.contains(iMMessage)) {
                        list.add(iMMessage);
                    }
                }
            } else {
                list = this.b;
            }
            b.a(this.c, list, Boolean.valueOf(z));
        }
    }

    public static void a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.b bVar, JSONObject jSONObject) {
        Object[] objArr = {bVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6445df673760df416e27007162915cbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6445df673760df416e27007162915cbf");
            return;
        }
        try {
            if (jSONObject == null) {
                bVar.a(-1, "param error");
                return;
            }
            String optString = jSONObject.optString("type", "");
            String optString2 = jSONObject.optString("subType", "");
            if (!ac.a(optString) && !ac.a(optString2)) {
                if (ac.a(optString, "magic")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("data");
                    if (optJSONArray != null) {
                        HashMap hashMap = new HashMap();
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                hashMap.put(optJSONObject.optString("key"), optJSONObject.optString("value"));
                            }
                        }
                        com.sankuai.xm.monitor.c.a(optString2, hashMap);
                    }
                } else {
                    com.sankuai.xm.im.bridge.base.util.a.c("not found type:" + optString, new Object[0]);
                }
                bVar.a(new JSONObject());
                return;
            }
            bVar.a(-1, "param error");
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("reportProcess exception:" + th, new Object[0]);
            bVar.a(-1, th.getMessage());
        }
    }
}
