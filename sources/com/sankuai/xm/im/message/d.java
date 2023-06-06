package com.sankuai.xm.im.message;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Base64;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.component.anno.Component;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.file.bean.FileInfoBean;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBMessage;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.sankuai.xm.im.cache.bean.DBSyncRead;
import com.sankuai.xm.im.cache.bean.GroupDBMessage;
import com.sankuai.xm.im.cache.bean.PersonalDBMessage;
import com.sankuai.xm.im.cache.bean.PubDBMessage;
import com.sankuai.xm.im.cache.o;
import com.sankuai.xm.im.message.a;
import com.sankuai.xm.im.message.bean.CancelMessage;
import com.sankuai.xm.im.message.bean.ForceCancelMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.im.message.bean.UNKnownMessage;
import com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler;
import com.sankuai.xm.im.message.handler.h;
import com.sankuai.xm.im.message.handler.k;
import com.sankuai.xm.im.message.handler.m;
import com.sankuai.xm.im.message.handler.n;
import com.sankuai.xm.im.message.handler.p;
import com.sankuai.xm.im.message.handler.q;
import com.sankuai.xm.im.message.handler.r;
import com.sankuai.xm.im.message.handler.s;
import com.sankuai.xm.im.message.handler.t;
import com.sankuai.xm.im.message.handler.u;
import com.sankuai.xm.im.message.handler.v;
import com.sankuai.xm.im.message.handler.w;
import com.sankuai.xm.im.message.history.HistoryController;
import com.sankuai.xm.im.message.opposite.GroupOppositeController;
import com.sankuai.xm.im.message.opposite.OppositeController;
import com.sankuai.xm.im.message.opposite.PubOppositeController;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
@Component
/* loaded from: classes6.dex */
public class d implements com.sankuai.xm.base.component.a, com.sankuai.xm.base.component.d {
    public static ChangeQuickRedirect a;
    private final Object b;
    private final TreeMap<String, Boolean> c;
    private HashMap<Integer, m> d;
    private com.sankuai.xm.base.component.e e;
    private com.sankuai.xm.base.component.e f;
    private com.sankuai.xm.base.component.e g;
    private com.sankuai.xm.im.message.voice.a h;
    private f i;
    private g j;
    private com.sankuai.xm.base.component.e k;
    private OppositeController l;
    private PubOppositeController m;
    private GroupOppositeController n;
    private HashMap<String, c> o;
    private HashMap<String, c> p;
    private b q;
    private volatile long r;
    private volatile Boolean s;
    private AtomicBoolean t;
    private volatile Boolean u;
    private final ConcurrentHashMap<String, Object> v;
    private final Object w;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public CancelMessage a;
        public IMMessage b;
        public int c;
    }

    private com.sankuai.xm.base.component.e p() {
        if (this.k == null) {
            synchronized (this.w) {
                if (this.k == null) {
                    this.k = new com.sankuai.xm.base.component.e(com.sankuai.xm.im.message.data.a.class, "mDataMsgController", this);
                }
            }
        }
        return this.k;
    }

    @Override // com.sankuai.xm.base.component.d
    public final <T> T a(String str, Class<T> cls, com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {str, cls, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fdeb60996b1155b5ca0ae9742e1e062", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fdeb60996b1155b5ca0ae9742e1e062");
        }
        Object bVar2 = ("mSyncReadController".equals(str) && cls == com.sankuai.xm.im.message.syncread.b.class) ? new com.sankuai.xm.im.message.syncread.b() : ("mDataMsgController".equals(str) && cls == com.sankuai.xm.im.message.data.a.class) ? new com.sankuai.xm.im.message.data.a((d) ((Object[]) this.v.remove("mDataMsgController"))[0]) : ("mRecentMsgController".equals(str) && cls == com.sankuai.xm.im.message.newmsg.b.class) ? new com.sankuai.xm.im.message.newmsg.b((d) ((Object[]) this.v.remove("mRecentMsgController"))[0]) : ("mHistoryController".equals(str) && cls == HistoryController.class) ? new HistoryController((d) ((Object[]) this.v.remove("mHistoryController"))[0]) : null;
        if (bVar2 instanceof com.sankuai.xm.base.component.a) {
            ((com.sankuai.xm.base.component.a) bVar2).a(bVar);
        }
        if (cls.isInstance(bVar2)) {
            return cls.cast(bVar2);
        }
        return null;
    }

    @Override // com.sankuai.xm.base.component.a
    public final void a(com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5f42a6586a0eb35c00d5cf727f22698", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5f42a6586a0eb35c00d5cf727f22698");
        } else if (bVar != null) {
            j().a(bVar);
            p().a(bVar);
            k().a(bVar);
            l().a(bVar);
        }
    }

    public final com.sankuai.xm.base.component.e j() {
        if (this.e == null) {
            synchronized (this.w) {
                if (this.e == null) {
                    this.e = new com.sankuai.xm.base.component.e(com.sankuai.xm.im.message.syncread.b.class, "mSyncReadController", this);
                }
            }
        }
        return this.e;
    }

    public final com.sankuai.xm.base.component.e k() {
        if (this.f == null) {
            synchronized (this.w) {
                if (this.f == null) {
                    this.f = new com.sankuai.xm.base.component.e(com.sankuai.xm.im.message.newmsg.b.class, "mRecentMsgController", this);
                }
            }
        }
        return this.f;
    }

    public final com.sankuai.xm.base.component.e l() {
        if (this.g == null) {
            synchronized (this.w) {
                if (this.g == null) {
                    this.g = new com.sankuai.xm.base.component.e(HistoryController.class, "mHistoryController", this);
                }
            }
        }
        return this.g;
    }

    public static /* synthetic */ long a(d dVar, SessionId sessionId, long j) {
        Object[] objArr = {sessionId, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "173b0e819054c8c84fe3723872f70f0f", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "173b0e819054c8c84fe3723872f70f0f")).longValue();
        }
        long a2 = IMClient.a().j().a(sessionId);
        return (a2 <= 0 || a2 <= j) ? j : a2;
    }

    public static /* synthetic */ DBMessage a(d dVar, DBMessage dBMessage, List list) {
        Object[] objArr = {dBMessage, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "429fc20d0d62ee7067b8ce107fbd3804", 6917529027641081856L)) {
            return (DBMessage) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "429fc20d0d62ee7067b8ce107fbd3804");
        }
        if (dBMessage == null || com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IMMessage iMMessage = (IMMessage) it.next();
            if (TextUtils.equals(iMMessage.getMsgUuid(), dBMessage.getMsgUuid()) && iMMessage.getMsgId() != dBMessage.getMsgId()) {
                com.sankuai.xm.im.utils.a.b("MessageProcessor::getMsgUuidNotDuplicateResponse msgUuid equal: " + iMMessage.getMsgUuid() + " msgId1: " + iMMessage.getMsgId() + " dbMsgId2:" + dBMessage.getMsgId(), new Object[0]);
            } else {
                return MessageUtils.imMessageToDBMessage(iMMessage);
            }
        }
        return null;
    }

    public static /* synthetic */ b a(d dVar, b bVar) {
        dVar.q = null;
        return null;
    }

    public static /* synthetic */ void a(d dVar, DBMessage dBMessage) {
        Object[] objArr = {dBMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "3aa7eb216013b387876a79c425220369", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "3aa7eb216013b387876a79c425220369");
            return;
        }
        try {
            j.a(i.normal, "update_session", (String[]) null, new Object[]{dBMessage});
            IMClient.a().j().a(dBMessage);
            com.sankuai.xm.im.session.c j = IMClient.a().j();
            Object[] objArr2 = {dBMessage};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.session.c.a;
            if (PatchProxy.isSupport(objArr2, j, changeQuickRedirect2, false, "196aab0996d0e391c82587f35781b9c6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, j, changeQuickRedirect2, false, "196aab0996d0e391c82587f35781b9c6");
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dBMessage);
                j.d(arrayList);
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public static /* synthetic */ void a(d dVar, IMMessage iMMessage, int i) {
        Object[] objArr = {iMMessage, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "64a1ccb226fe801b39fbaa469085e77b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "64a1ccb226fe801b39fbaa469085e77b");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(MessageStatisticsEntry.PARAM_MSG_ID, iMMessage.getMsgUuid());
        hashMap.put(MessageStatisticsEntry.PARAM_CHAT, SessionId.a(iMMessage).f());
        hashMap.put(MessageStatisticsEntry.PARAM_CHANNEL, Short.valueOf(iMMessage.getChannel()));
        hashMap.put(MessageStatisticsEntry.PARAM_MSG_CATEGORY, Integer.valueOf(iMMessage.getCategory()));
        hashMap.put("result", Integer.valueOf(i));
        com.sankuai.xm.monitor.c.a("delete_message", hashMap);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.Long] */
    public static /* synthetic */ void a(d dVar, final SessionId sessionId, final long j, com.sankuai.xm.base.tinyorm.b bVar, com.sankuai.xm.base.tinyorm.b bVar2) {
        DBMessage dBMessage;
        Object[] objArr = {sessionId, new Long(j), bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "cd3e4272f87568e8c19432e30d9cc22d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "cd3e4272f87568e8c19432e30d9cc22d");
            return;
        }
        if (sessionId != null) {
            if (j == Long.MAX_VALUE || j == 0) {
                DBSession a2 = DBProxy.l().m.a(sessionId.f());
                if (a2 != null) {
                    if (DBProxy.l().k.a(a2.getCategory(), a2.getMsgUuid(), true) == null) {
                        bVar.c = Long.MAX_VALUE;
                        bVar2.c = 0L;
                        return;
                    }
                    bVar.c = Long.valueOf(a2.getMsgSeqid());
                    bVar2.c = 0L;
                    return;
                }
                bVar.c = Long.MAX_VALUE;
                bVar2.c = 0L;
                return;
            }
            final com.sankuai.xm.im.cache.f fVar = DBProxy.l().k;
            Object[] objArr2 = {sessionId, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.cache.f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "58c95c005e9ced8e5e799d6a08847ccd", 6917529027641081856L)) {
                dBMessage = (DBMessage) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "58c95c005e9ced8e5e799d6a08847ccd");
            } else {
                final com.sankuai.xm.base.tinyorm.b bVar3 = new com.sankuai.xm.base.tinyorm.b();
                fVar.d.c(j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.9
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Type inference failed for: r1v8, types: [com.sankuai.xm.im.cache.bean.DBMessage, T] */
                    /* JADX WARN: Type inference failed for: r2v7, types: [T, java.lang.Object] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fad64d189cf87c8d1a35601f558299b5", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fad64d189cf87c8d1a35601f558299b5");
                            return;
                        }
                        synchronized (f.this.b) {
                            a aVar = f.this.e.get(sessionId.f());
                            if (aVar != null) {
                                for (Map.Entry<String, DBMessage> entry : aVar.e.entrySet()) {
                                    if (entry.getValue().getSts() == j) {
                                        bVar3.c = entry.getValue();
                                        return;
                                    }
                                }
                            }
                            bVar3.c = f.this.d(sessionId, j);
                        }
                    }
                }));
                dBMessage = (DBMessage) bVar3.c;
            }
            if (dBMessage != null) {
                bVar.c = Long.valueOf(dBMessage.getMsgSeqid());
                bVar2.c = Long.valueOf(dBMessage.getMsgFlag());
                return;
            }
        }
        bVar.c = Long.MAX_VALUE;
        bVar2.c = 0L;
    }

    public static /* synthetic */ void a(d dVar, String str, long j, int i, String str2) {
        Object[] objArr = {str, new Long(j), 0, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "d6cb168945dc5a14cdd27786a43b76bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "d6cb168945dc5a14cdd27786a43b76bd");
            return;
        }
        dVar.m().a(str, MessageStatisticsEntry.PARAM_MSG_ID, Long.valueOf(j));
        dVar.m().a(str, "net", Integer.valueOf(com.sankuai.xm.base.util.net.d.c(IMClient.a().f())));
        dVar.m().a(str, "result", 0);
        if (!TextUtils.isEmpty(str2)) {
            dVar.m().a(str, "msg", str2);
        }
        dVar.m().b(str);
    }

    public static /* synthetic */ void a(d dVar, List list, int i, List list2, List list3) {
        Object[] objArr = {list, Integer.valueOf(i), list2, list3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "76cccd48a4a96ce71ab8dbbd3852f428", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "76cccd48a4a96ce71ab8dbbd3852f428");
        } else if (i == 2 || i == 4) {
            List<IMMessage> a2 = ((HistoryController) dVar.l().a()).a(list, i, list2, list3);
            if (com.sankuai.xm.base.util.b.a(a2)) {
                return;
            }
            dVar.a(a2, i, false);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                IMMessage iMMessage = (IMMessage) it.next();
                if (dVar.b(iMMessage.getMsgType()) == null) {
                    com.sankuai.xm.im.utils.a.c("MessageProcessor::onReceiveMessages => unknown msg type msginfo:" + iMMessage.keyParamToString(), new Object[0]);
                } else {
                    if (i != 3 && DBProxy.l().k.a(iMMessage.getCategory(), SessionId.a(iMMessage), iMMessage.getMsgUuid())) {
                        if (i == 0) {
                            iMMessage.setDuplicateMsg(true);
                        }
                        list3.add(iMMessage);
                        com.sankuai.xm.im.utils.a.b("MessageProcessor::onReceiveMessages => duplicate msg msginfo:" + iMMessage.keyParamToString(), new Object[0]);
                    } else {
                        CancelMessage a3 = o.b.a.a(iMMessage.getMsgUuid());
                        if (a3 != null) {
                            list2.add(a3);
                        } else {
                            dVar.b(iMMessage);
                            list2.add(iMMessage);
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ boolean a(d dVar, final MediaMessage mediaMessage, final m mVar, final IMClient.SendMediaMessageCallback sendMediaMessageCallback) {
        Object[] objArr = {mediaMessage, mVar, sendMediaMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "738eff1568506c9f101192774b309bee", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "738eff1568506c9f101192774b309bee")).booleanValue();
        }
        if (mVar == null) {
            com.sankuai.xm.im.utils.a.d("MessageProcessor::handleMediaOperation::handleUpload::onFailure, handler is null, msg uuid: %s", mediaMessage.getMsgUuid());
            mediaMessage.setErrorCode(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT);
            dVar.a(mediaMessage, RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT, 2, sendMediaMessageCallback);
            return true;
        }
        AbstractMediaMsgHandler abstractMediaMsgHandler = (AbstractMediaMsgHandler) mVar;
        if (mediaMessage.getOperationType() == 4) {
            int a2 = abstractMediaMsgHandler.a(mediaMessage);
            mediaMessage.setErrorCode(a2);
            if (a2 != 0) {
                com.sankuai.xm.im.utils.a.d("MessageProcessor::handleMediaOperation::handleUpload::onFailure,create upload file error, msg uuid: %s", mediaMessage.getMsgUuid());
                dVar.a(mediaMessage, a2, 2, sendMediaMessageCallback);
                return true;
            }
            abstractMediaMsgHandler.a(mediaMessage, new AbstractMediaMsgHandler.UploadOperationCallback() { // from class: com.sankuai.xm.im.message.d.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler.b
                @Trace(name = "upload_msg", type = i.normal)
                public final void a(MediaMessage mediaMessage2, FileInfoBean fileInfoBean) {
                    Object[] objArr2 = {mediaMessage2, fileInfoBean};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9beed90e30a1eb4d8608726c9d74a7c3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9beed90e30a1eb4d8608726c9d74a7c3");
                        return;
                    }
                    try {
                        j.a(i.normal, "upload_msg", (String[]) null, new Object[]{mediaMessage2, fileInfoBean});
                        mediaMessage2.setFileStatus(3);
                        mediaMessage2.setOperationType(0);
                        d.this.d(mediaMessage2);
                        sendMediaMessageCallback.a(mediaMessage2, 3);
                        d.this.a((IMMessage) mediaMessage2, false);
                        com.sankuai.xm.im.utils.a.b("MessageProcessor::handleMediaOperation::handleUpload::onSuccess, msg uuid: %s", mediaMessage.getMsgUuid());
                        j.a((Object) null);
                    } catch (Throwable th) {
                        j.a(th);
                        throw th;
                    }
                }

                @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler.b
                @Trace(name = "upload_msg", type = i.normal)
                public final void a(MediaMessage mediaMessage2, @TraceStatus int i, String str) {
                    Object[] objArr2 = {mediaMessage2, Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c896108453374b7c9e9cd5acabd63b7", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c896108453374b7c9e9cd5acabd63b7");
                        return;
                    }
                    try {
                        j.a(i.normal, "upload_msg", (String[]) null, new Object[]{mediaMessage2, new Integer(i), str});
                        j.a(new Integer(i), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                        mediaMessage2.setFileStatus(4);
                        mediaMessage2.setMsgStatus(4);
                        mediaMessage2.setErrorCode(i);
                        d.this.d(mediaMessage2);
                        sendMediaMessageCallback.a(mediaMessage2, 4);
                        sendMediaMessageCallback.onFailure(mediaMessage2, i);
                        d.this.a(mediaMessage2.getMsgUuid());
                        com.sankuai.xm.im.utils.a.d("MessageProcessor::handleMediaOperation::handleUpload::onFailure, msg uuid: " + mediaMessage2.getMsgUuid() + ", code: " + i + ",message: " + str, new Object[0]);
                        d.this.a(mediaMessage2.getMsgUuid(), mediaMessage2, str, i, 2);
                        j.a((Object) null);
                    } catch (Throwable th) {
                        j.a(th);
                        throw th;
                    }
                }

                @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler.UploadOperationCallback
                public final void a(MediaMessage mediaMessage2, int i) {
                    Object[] objArr2 = {mediaMessage2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a64bacb742966cdc93180a4117788ff", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a64bacb742966cdc93180a4117788ff");
                    } else if (i == 1) {
                        mediaMessage2.setFileStatus(2);
                        d.this.d(mediaMessage2);
                        sendMediaMessageCallback.a(mediaMessage2, 2);
                    } else if (i == 3) {
                        mediaMessage2.setFileStatus(1);
                        d.this.d(mediaMessage2);
                        sendMediaMessageCallback.a(mediaMessage2, 1);
                    } else if (i != 5) {
                    } else {
                        mediaMessage2.setFileStatus(4);
                        d.b(d.this, mediaMessage2);
                        sendMediaMessageCallback.a(mediaMessage2, 4);
                    }
                }

                @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler.UploadOperationCallback
                public final void onProgress(MediaMessage mediaMessage2, double d, double d2) {
                    Object[] objArr2 = {mediaMessage2, Double.valueOf(d), Double.valueOf(d2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4a5a6961316a047bb8da7cf9c6e9a75", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4a5a6961316a047bb8da7cf9c6e9a75");
                    } else {
                        sendMediaMessageCallback.onProgress(mediaMessage2, d, d2);
                    }
                }
            });
            return true;
        } else if (mediaMessage.getOperationType() == 1 || mediaMessage.getOperationType() == 2 || mediaMessage.getOperationType() == 3) {
            abstractMediaMsgHandler.a(mediaMessage, new AbstractMediaMsgHandler.b() { // from class: com.sankuai.xm.im.message.d.9
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler.b
                public final void a(MediaMessage mediaMessage2, FileInfoBean fileInfoBean) {
                    Object[] objArr2 = {mediaMessage2, fileInfoBean};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4a6782dedc9eadc6d26a43cc87426ee", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4a6782dedc9eadc6d26a43cc87426ee");
                        return;
                    }
                    mediaMessage2.setFileStatus(3);
                    mediaMessage2.setOperationType(0);
                    d.this.d(mediaMessage2);
                    sendMediaMessageCallback.a(mediaMessage2, 3);
                    d.this.a((IMMessage) mediaMessage2, false);
                }

                @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler.b
                public final void a(MediaMessage mediaMessage2, int i, String str) {
                    Object[] objArr2 = {mediaMessage2, Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65c328573291a4d808214a1d7a5795b0", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65c328573291a4d808214a1d7a5795b0");
                        return;
                    }
                    mediaMessage2.setFileStatus(4);
                    mediaMessage2.setMsgStatus(4);
                    mediaMessage2.setErrorCode(i);
                    d.this.d(mediaMessage2);
                    sendMediaMessageCallback.a(mediaMessage2, 4);
                    sendMediaMessageCallback.onFailure(mediaMessage2, i);
                    d.this.a(mediaMessage2.getMsgUuid());
                    com.sankuai.xm.im.utils.a.c("MessageProcessor::handleMediaOperation::handleUpload::onFailure::Forward, msg uuid: %s, code: %s, message: %s", mediaMessage2.getMsgUuid(), Integer.valueOf(i), str);
                    d.this.a(mediaMessage2.getMsgUuid(), mediaMessage2, str, i, 2);
                }
            });
            return true;
        } else if (mediaMessage.getOperationType() == 5) {
            final AbstractMediaMsgHandler.a aVar = new AbstractMediaMsgHandler.a() { // from class: com.sankuai.xm.im.message.d.11
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.message.handler.AbstractMediaMsgHandler.a
                public final void a(MediaMessage mediaMessage2, int i) {
                    Object[] objArr2 = {mediaMessage2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db2d8cfcd02ded51f3979b98a0b7ea69", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db2d8cfcd02ded51f3979b98a0b7ea69");
                        return;
                    }
                    switch (i) {
                        case 10:
                            mediaMessage2.setOperationType(4);
                            mediaMessage2.setFileStatus(i);
                            d.this.d(mediaMessage2);
                            sendMediaMessageCallback.a(mediaMessage2, i);
                            d.a(d.this, mediaMessage2, mVar, sendMediaMessageCallback);
                            return;
                        case 11:
                            mediaMessage2.setMsgStatus(4);
                            mediaMessage2.setFileStatus(i);
                            mediaMessage2.setErrorCode(i);
                            d.this.d(mediaMessage2);
                            sendMediaMessageCallback.a(mediaMessage2, i);
                            sendMediaMessageCallback.onFailure(mediaMessage2, i);
                            d.this.a(mediaMessage2.getMsgUuid());
                            com.sankuai.xm.im.utils.a.c("MessageProcessor::handleMediaOperation::handleUpload::onFailure, msg uuid: %s, code: %s, message: %s", mediaMessage2.getMsgUuid(), Integer.valueOf(i), mediaMessage2);
                            d.this.a(mediaMessage2.getMsgUuid(), mediaMessage2, "", i, 2);
                            return;
                        case 12:
                            mediaMessage2.setFileStatus(i);
                            d.this.d(mediaMessage2);
                            sendMediaMessageCallback.a(mediaMessage2, i);
                            return;
                        default:
                            return;
                    }
                }
            };
            Object[] objArr2 = {mediaMessage, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = AbstractMediaMsgHandler.a;
            if (PatchProxy.isSupport(objArr2, abstractMediaMsgHandler, changeQuickRedirect2, false, "ecde827d4ea74243ebcafe8147356a2a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, abstractMediaMsgHandler, changeQuickRedirect2, false, "ecde827d4ea74243ebcafe8147356a2a");
            } else {
                final com.sankuai.xm.im.transfer.upload.a a3 = com.sankuai.xm.im.transfer.upload.a.a();
                Object[] objArr3 = {mediaMessage, aVar};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.transfer.upload.a.a;
                if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "294cf5633e873eb1c218a8981d96e2cc", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "294cf5633e873eb1c218a8981d96e2cc");
                } else if (mediaMessage != null) {
                    com.sankuai.xm.threadpool.scheduler.a.b().a(14, j.a(new Runnable() { // from class: com.sankuai.xm.im.transfer.upload.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ff9c6acfad9967cc2fcaa44d567b768c", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ff9c6acfad9967cc2fcaa44d567b768c");
                                return;
                            }
                            IMClient.c a4 = a.this.a(mediaMessage);
                            if (a4 != null) {
                                aVar.a(mediaMessage, 12);
                                i = a4.a(mediaMessage);
                                aVar.a(mediaMessage, i == 0 ? 10 : 11);
                            } else {
                                i = -1;
                                aVar.a(mediaMessage, 11);
                            }
                            com.sankuai.xm.im.utils.a.b("compress result:uuid=%s state=%s", mediaMessage.getMsgUuid(), String.valueOf(i));
                        }
                    }));
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static /* synthetic */ void b(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "cc745a93c31a85fd23a125e9d8746d3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "cc745a93c31a85fd23a125e9d8746d3a");
            return;
        }
        try {
            j.a(i.end, "sync_end", (String[]) null, new Object[0]);
            dVar.u = Boolean.TRUE;
            com.sankuai.xm.im.e.a();
            ((l) com.sankuai.xm.base.service.m.a(l.class)).b(IMClient.n.class).a(new b.a<IMClient.n>() { // from class: com.sankuai.xm.im.message.d.23
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(IMClient.n nVar) {
                    IMClient.n nVar2 = nVar;
                    Object[] objArr2 = {nVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4fd0d9464ae4f21561dfb54dd22c1f9", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4fd0d9464ae4f21561dfb54dd22c1f9")).booleanValue();
                    }
                    nVar2.a();
                    return false;
                }
            });
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public static /* synthetic */ boolean b(d dVar, IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "5eb0ada7b0ee38134d019c8002e2d465", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "5eb0ada7b0ee38134d019c8002e2d465")).booleanValue();
        }
        DBMessage imMessageToDBMessage = MessageUtils.imMessageToDBMessage(iMMessage);
        com.sankuai.xm.im.cache.f fVar = DBProxy.l().k;
        Object[] objArr2 = {imMessageToDBMessage};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.cache.f.a;
        DBMessage a2 = PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "686d493308b24474d44bb73091f04000", 6917529027641081856L) ? (DBMessage) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "686d493308b24474d44bb73091f04000") : fVar.a(imMessageToDBMessage, new String[0]);
        if (a2 != null) {
            IMClient.a().j().a(imMessageToDBMessage);
        }
        return a2 != null;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c13f30d517afe27611c2de23107dd7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c13f30d517afe27611c2de23107dd7b");
            return;
        }
        this.v = new ConcurrentHashMap<>();
        this.w = new Object();
        this.t = new AtomicBoolean(false);
        this.u = Boolean.FALSE;
        this.e = null;
        this.v.put("mRecentMsgController", com.sankuai.xm.base.component.c.a(this));
        this.f = null;
        this.v.put("mDataMsgController", com.sankuai.xm.base.component.c.a(this));
        this.k = null;
        this.v.put("mHistoryController", com.sankuai.xm.base.component.c.a(this));
        this.g = null;
        this.b = new Object();
        this.d = new HashMap<>();
        this.o = new HashMap<>();
        this.p = new HashMap<>();
        this.c = new TreeMap<>();
        this.r = 0L;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b25ccce192f0d93ed856c56b0fdbcc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b25ccce192f0d93ed856c56b0fdbcc8");
            return;
        }
        ((com.sankuai.xm.im.message.syncread.b) j().a()).a();
        ((HistoryController) l().a()).a();
        if (this.i != null) {
            this.i.b();
            com.sankuai.xm.im.message.a.c();
        }
        synchronized (this.b) {
            this.p.clear();
            this.o.clear();
        }
    }

    public final HistoryController b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b50b67e84fd2822de361b9cb6b8b74d6", 6917529027641081856L) ? (HistoryController) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b50b67e84fd2822de361b9cb6b8b74d6") : (HistoryController) l().a();
    }

    public final com.sankuai.xm.im.message.newmsg.b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a9a2212ad3882b4ab87823b2960a0aa", 6917529027641081856L) ? (com.sankuai.xm.im.message.newmsg.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a9a2212ad3882b4ab87823b2960a0aa") : (com.sankuai.xm.im.message.newmsg.b) k().a();
    }

    public final com.sankuai.xm.im.message.data.a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a9d401d98d0583df3f4228ed897b0d", 6917529027641081856L) ? (com.sankuai.xm.im.message.data.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a9d401d98d0583df3f4228ed897b0d") : (com.sankuai.xm.im.message.data.a) p().a();
    }

    public final OppositeController e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4445c9e12d5712ef9e56be2c5d29b633", 6917529027641081856L)) {
            return (OppositeController) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4445c9e12d5712ef9e56be2c5d29b633");
        }
        if (this.l == null) {
            synchronized (this) {
                if (this.l == null) {
                    this.l = new OppositeController();
                }
            }
        }
        return this.l;
    }

    public final PubOppositeController f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6706ee5fef4bfcce15401c39b539e3ca", 6917529027641081856L)) {
            return (PubOppositeController) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6706ee5fef4bfcce15401c39b539e3ca");
        }
        if (this.m == null) {
            synchronized (this) {
                if (this.m == null) {
                    this.m = new PubOppositeController();
                }
            }
        }
        return this.m;
    }

    public final GroupOppositeController g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07e7d17a883b048680fa4d1f75a074c4", 6917529027641081856L)) {
            return (GroupOppositeController) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07e7d17a883b048680fa4d1f75a074c4");
        }
        if (this.n == null) {
            synchronized (this) {
                if (this.n == null) {
                    this.n = new GroupOppositeController();
                }
            }
        }
        return this.n;
    }

    private g m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7335908580db5779b81de3327af1d208", 6917529027641081856L)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7335908580db5779b81de3327af1d208");
        }
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    this.j = new g();
                }
            }
        }
        return this.j;
    }

    public final void a(long j, boolean z, boolean z2) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "409a28abb118e9f0af584d3bdd8d2124", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "409a28abb118e9f0af584d3bdd8d2124");
            return;
        }
        com.sankuai.xm.im.utils.a.b("MessageProcessor::remoteSync: deviceChange: %s", Boolean.valueOf(z));
        final com.sankuai.xm.network.a aVar = new com.sankuai.xm.network.a();
        aVar.a(new Callback<Void>() { // from class: com.sankuai.xm.im.message.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.Callback
            public final /* synthetic */ void onSuccess(Void r11) {
                Object[] objArr2 = {r11};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "841d8322be000c68372226682a503ddc", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "841d8322be000c68372226682a503ddc");
                    return;
                }
                com.sankuai.xm.im.utils.a.b("MessageProcessor::remoteSync::onSuccess", new Object[0]);
                a();
            }

            @Override // com.sankuai.xm.base.callback.Callback
            public final void onFailure(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52523fc1b1e4262bf5a40e0f65cf2486", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52523fc1b1e4262bf5a40e0f65cf2486");
                    return;
                }
                com.sankuai.xm.im.utils.a.b("MessageProcessor::remoteSync::onFailure: %s, msg: %s", Integer.valueOf(i), str);
                a();
            }

            private void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f980c7335962c6d6c04efc78cca5381c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f980c7335962c6d6c04efc78cca5381c");
                } else if (d.this.t.compareAndSet(true, false)) {
                    com.sankuai.xm.im.utils.a.b("MessageProcessor::remoteSync: notifyRemoteSyncComplete, job id: %s", aVar.a());
                    d.b(d.this);
                }
            }
        });
        if (this.t.compareAndSet(false, true)) {
            com.sankuai.xm.im.utils.a.b("MessageProcessor::remoteSync: notifyRemoteSyncStart, job id: %s", aVar.a());
            a(z, z2);
        }
        ((com.sankuai.xm.im.message.newmsg.b) k().a()).a();
        ((com.sankuai.xm.im.message.newmsg.b) k().a()).a(aVar, z);
        ((com.sankuai.xm.im.message.syncread.b) j().a()).a(aVar);
        aVar.b();
        n();
    }

    public final int a(IMMessage iMMessage, boolean z, IMClient.SendMessageCallback sendMessageCallback) {
        IMClient.SendMessageCallback sendMessageCallback2;
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), sendMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8abc1c32cda7e5410fe1ad347af7a9a3", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8abc1c32cda7e5410fe1ad347af7a9a3")).intValue();
        }
        com.sankuai.waimai.imbase.monitor.a.a(this, iMMessage, z, sendMessageCallback);
        if (sendMessageCallback instanceof IMClient.SendMediaMessageCallback) {
            sendMessageCallback2 = (IMClient.SendMessageCallback) com.sankuai.xm.im.notifier.a.a(sendMessageCallback, IMClient.SendMediaMessageCallback.class, 0);
        } else {
            sendMessageCallback2 = (IMClient.SendMessageCallback) com.sankuai.xm.im.notifier.a.a(sendMessageCallback, IMClient.SendMessageCallback.class, 0);
        }
        int a2 = a(iMMessage, z, true);
        if (a2 != 0) {
            return a2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        b(iMMessage, sendMessageCallback2);
        b(iMMessage, true, sendMessageCallback2);
        a(currentTimeMillis);
        return a2;
    }

    public int a(IMMessage iMMessage, boolean z, boolean z2) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24557b33a1048dda4f1d58ce9c63ba73", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24557b33a1048dda4f1d58ce9c63ba73")).intValue();
        }
        com.sankuai.xm.im.utils.a.b("%s checkMessageForSending::time: %s:", "MessageProcessor::", Long.valueOf(System.currentTimeMillis()));
        m b2 = b(iMMessage.getMsgType());
        if (b2 == null) {
            com.sankuai.xm.im.utils.a.d("%s checkMessageForSending::ERR_NOT_SUPPORT, %s:", iMMessage.keyParamToString());
            return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT;
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.sankuai.xm.im.utils.a.b("%s checkMessageForSending::time: %s", "MessageProcessor::", Long.valueOf(currentTimeMillis));
        if (z2 && b(currentTimeMillis)) {
            com.sankuai.xm.im.utils.a.d("%s checkMessageForSending::ERR_TOO_FREQUENTLY, msg: %s", "MessageProcessor::", iMMessage.keyParamToString());
            return 10004;
        } else if (z) {
            iMMessage.setRetries(0);
            iMMessage.setCts(IMClient.a().m());
            iMMessage.setMsgStatus(3);
            if ((iMMessage instanceof MediaMessage) && iMMessage.getFileStatus() == 3) {
                ((MediaMessage) iMMessage).setOperationType(0);
            }
            return 0;
        } else {
            int a2 = b2.a(iMMessage);
            if (a2 != 0) {
                com.sankuai.xm.im.utils.a.d("%s checkMessageForSending::ret: %s, msg uuid: %s", "MessageProcessor::", Integer.valueOf(a2), iMMessage.getMsgUuid());
                return a2;
            } else if (iMMessage instanceof MediaMessage) {
                return a2;
            } else {
                iMMessage.setFileStatus(0);
                return a2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(@com.sankuai.xm.base.trace.annotation.TraceStatus final int r31, final java.lang.String r32, long r33, long r35, int r37, long r38) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.d.a(int, java.lang.String, long, long, int, long):boolean");
    }

    public final List<IMMessage> a(List<IMMessage> list, int i) {
        boolean z = false;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92b0f9cf5f1dbbdd3538a5bff43614a6", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92b0f9cf5f1dbbdd3538a5bff43614a6");
        }
        if (list == null) {
            return new ArrayList();
        }
        if (i == 3) {
            com.sankuai.xm.im.utils.a.b("MessageProcessor::onReceiveMessages => source = IMConstant.RECEIVE_TYPE_NOT_SAVE_DB", new Object[0]);
            return list;
        }
        long a2 = com.sankuai.xm.login.c.a().a(System.currentTimeMillis());
        com.sankuai.xm.im.utils.c.a(list);
        List<IMMessage> arrayList = new ArrayList<>();
        List<IMMessage> arrayList2 = new ArrayList<>();
        if (a(list, i, arrayList, arrayList2)) {
            c(arrayList);
            if (!arrayList2.isEmpty()) {
                com.sankuai.xm.im.utils.a.b("MessageProcessor::onReceiveMessages => duplicateMessages message=" + arrayList2.size(), new Object[0]);
                z = true;
            }
            arrayList2.addAll(arrayList);
            if (i == 1 || i == 0) {
                a(arrayList2, a2);
            }
        } else if (!arrayList2.isEmpty()) {
            com.sankuai.xm.im.utils.a.c("MessageProcessor::onReceiveMessages => process message failed", new Object[0]);
        }
        if (i != 2) {
            return i == 0 ? arrayList2 : arrayList;
        }
        if (z) {
            com.sankuai.xm.im.utils.c.a((List<? extends Message>) arrayList2, true);
        }
        return arrayList2;
    }

    @Trace(name = "save_mgs", type = i.normal)
    @TraceStatus
    private boolean a(final List<IMMessage> list, final int i, final List<IMMessage> list2, final List<IMMessage> list3) {
        Object[] objArr = {list, Integer.valueOf(i), list2, list3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96acbcbf73c006f2846f5aa79eedcfa3", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96acbcbf73c006f2846f5aa79eedcfa3")).booleanValue();
        }
        try {
            j.a(i.normal, "save_mgs", (String[]) null, new Object[]{list, new Integer(i), list2, list3});
            final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b(Boolean.FALSE);
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.message.d.21
                public static ChangeQuickRedirect a;

                /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Boolean] */
                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a13ec35bb054ca6ebc14f01791655ba0", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a13ec35bb054ca6ebc14f01791655ba0");
                        return;
                    }
                    d.a(d.this, list, i, list2, list3);
                    bVar.c = Boolean.valueOf(d.this.a((List<IMMessage>) list2, i, true));
                }
            }), true, (Callback) null);
            boolean booleanValue = ((Boolean) bVar.c).booleanValue();
            j.a(new Boolean(booleanValue), (String[]) null, new int[]{0}, new String[]{"false"}, new int[]{10019}, (int[]) null);
            j.a(new Boolean(booleanValue));
            return booleanValue;
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public final void b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd8bd0f3e55bb849410db6caf19cf38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd8bd0f3e55bb849410db6caf19cf38");
            return;
        }
        m b2 = b(iMMessage.getMsgType());
        com.sankuai.xm.im.message.c cVar = (com.sankuai.xm.im.message.c) com.sankuai.xm.base.service.m.a(com.sankuai.xm.im.message.c.class);
        if (cVar != null && cVar.a(iMMessage)) {
            cVar.b(iMMessage);
        } else if (b2 instanceof AbstractMediaMsgHandler) {
            ((AbstractMediaMsgHandler) b2).b(iMMessage);
        } else {
            iMMessage.setFileStatus(8);
        }
    }

    public final int a(IMMessage iMMessage, IMClient.SendMessageCallback sendMessageCallback) {
        Object[] objArr = {iMMessage, sendMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d887c4ef6920b3c30174bab61394c5a0", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d887c4ef6920b3c30174bab61394c5a0")).intValue();
        }
        if (iMMessage.getMsgStatus() == 4 || iMMessage.getMsgStatus() == 15) {
            com.sankuai.xm.im.utils.a.d("MessageProcessor::cancelMessage param error:" + iMMessage.getCategory(), new Object[0]);
            return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT;
        } else if (iMMessage.getMsgId() == 0) {
            com.sankuai.xm.im.utils.a.d("MessageProcessor::local message cannot be cancelled:" + iMMessage.getMsgUuid(), new Object[0]);
            return RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT;
        } else {
            iMMessage.setMsgStatus(14);
            DBProxy.l().k.a(MessageUtils.imMessageToDBMessage(iMMessage), new String[]{Message.MSG_STATUS}, (Callback<DBMessage>) null);
            if (sendMessageCallback != null) {
                sendMessageCallback.a(iMMessage, 14);
                synchronized (this.b) {
                    if (!this.p.containsKey(iMMessage.getMsgUuid())) {
                        this.p.put(iMMessage.getMsgUuid(), new c(iMMessage, sendMessageCallback));
                    }
                }
            }
            com.sankuai.xm.im.utils.a.b("MessageProcessor::cancelMessage ok info:" + iMMessage.keyParamToString(), new Object[0]);
            b(iMMessage, false);
            return 0;
        }
    }

    public final void a(@TraceStatus int i, String str) {
        c cVar;
        AbstractMediaMsgHandler abstractMediaMsgHandler;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abf1c9dbd1a1402e2c0c326aac11352b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abf1c9dbd1a1402e2c0c326aac11352b");
            return;
        }
        j.a(new Integer(i), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
        f h = h();
        h.a(a.b.CANCEL + CommonConstant.Symbol.COLON + str);
        synchronized (this.b) {
            cVar = this.p.get(str);
            this.p.remove(str);
        }
        if (cVar == null) {
            return;
        }
        IMMessage iMMessage = cVar.b;
        iMMessage.setErrorCode(i);
        IMClient.SendMessageCallback sendMessageCallback = cVar.c;
        if (i == 0 || i == 984) {
            CancelMessage cancelMessage = new CancelMessage();
            iMMessage.copyTo((IMMessage) cancelMessage);
            Context f = IMClient.a().f();
            if (iMMessage.getAdminUid() <= 0) {
                cancelMessage.setText(f.getString(R.string.xm_sdk_u_recall_a_msg));
            } else {
                cancelMessage.setText(f.getString(R.string.xm_sdk_group_manager_recall_a_msg));
            }
            cancelMessage.setMsgType(12);
            cancelMessage.setMsgStatus(15);
            DBProxy.l().k.b(MessageUtils.imMessageToDBMessage(cancelMessage), new String[]{"content", "type", Message.MSG_STATUS}, null);
            com.sankuai.xm.im.session.c j = IMClient.a().j();
            Object[] objArr2 = {cancelMessage, 5, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.session.c.a;
            if (PatchProxy.isSupport(objArr2, j, changeQuickRedirect2, false, "96b41da971deeb3bc0dbc33731ec09af", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, j, changeQuickRedirect2, false, "96b41da971deeb3bc0dbc33731ec09af");
            } else {
                try {
                    j.a(i.normal, "update_session", (String[]) null, new Object[]{cancelMessage, new Integer(5), new Boolean(false)});
                    com.sankuai.xm.im.session.entry.a aVar = new com.sankuai.xm.im.session.entry.a();
                    aVar.c = SessionId.a(cancelMessage).f();
                    aVar.b = cancelMessage;
                    j.a(aVar);
                    j.a((Object) null);
                } catch (Throwable th) {
                    j.a(th);
                    throw th;
                }
            }
            if ((iMMessage instanceof MediaMessage) && (abstractMediaMsgHandler = (AbstractMediaMsgHandler) b(iMMessage.getMsgType())) != null) {
                abstractMediaMsgHandler.c((MediaMessage) iMMessage);
            }
            sendMessageCallback.a(cancelMessage);
            Object[] objArr3 = {iMMessage, cancelMessage};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f0fc5c0f575b0232ddd07ad4626114d9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f0fc5c0f575b0232ddd07ad4626114d9");
                return;
            }
            ArrayList arrayList = new ArrayList();
            IMClient.a aVar2 = new IMClient.a();
            aVar2.a = iMMessage;
            aVar2.b = cancelMessage;
            arrayList.add(aVar2);
            a(arrayList);
            return;
        }
        com.sankuai.xm.im.utils.a.d("%s onCancelMessageResult::code: %s, msg uuid: %s", "MessageProcessor::", Integer.valueOf(i), str);
        iMMessage.setMsgStatus(16);
        DBMessage imMessageToDBMessage = MessageUtils.imMessageToDBMessage(iMMessage);
        DBProxy.l().k.b(imMessageToDBMessage, new String[]{Message.MSG_STATUS}, null);
        IMClient.a().j().a(imMessageToDBMessage);
        sendMessageCallback.onFailure(iMMessage, i);
    }

    public final void b(List<IMMessage> list, int i) {
        int i2 = 0;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a23fe52e091563fd3340e33f829dd49d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a23fe52e091563fd3340e33f829dd49d");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
        } else {
            if (list.size() > 200) {
                int size = (list.size() / 200) + 1;
                while (i2 < size) {
                    int i3 = i2 * 200;
                    i2++;
                    int min = Math.min(list.size(), i2 * 200);
                    if (i3 < min) {
                        c(list.subList(i3, min), i);
                    }
                }
                return;
            }
            c(list, i);
        }
    }

    @Trace(name = "notify_msg", type = i.end)
    public final void a(List<IMMessage> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8ed774857ba76333bca718993fb1762", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8ed774857ba76333bca718993fb1762");
            return;
        }
        try {
            j.a(i.end, "notify_msg", (String[]) null, new Object[]{list, new Boolean(z)});
            HashMap hashMap = new HashMap();
            for (IMMessage iMMessage : list) {
                if (hashMap.containsKey(Short.valueOf(iMMessage.getChannel()))) {
                    ((List) hashMap.get(Short.valueOf(iMMessage.getChannel()))).add(iMMessage);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(iMMessage);
                    hashMap.put(Short.valueOf(iMMessage.getChannel()), arrayList);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                a(((Short) entry.getKey()).shortValue(), z, (List) entry.getValue());
                if (IMClient.a().a(((Short) entry.getKey()).shortValue())) {
                    arrayList2.addAll((Collection) entry.getValue());
                }
            }
            a((short) -1, z, (List<IMMessage>) arrayList2);
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    private void a(short s, final boolean z, final List<IMMessage> list) {
        Object[] objArr = {Short.valueOf(s), Byte.valueOf(z ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e71a68a825e807c612d290b5835769a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e71a68a825e807c612d290b5835769a");
            return;
        }
        com.sankuai.xm.im.utils.a.b("MessageProcessor::notifyReceiveMessage channel = " + ((int) s) + " offline = " + z + " message count = " + list.size(), new Object[0]);
        ((l) com.sankuai.xm.base.service.m.a(l.class)).b(IMClient.i.class).a(s).a(new b.a<IMClient.i>() { // from class: com.sankuai.xm.im.message.d.22
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.util.b.a
            public final /* synthetic */ boolean a(IMClient.i iVar) {
                IMClient.i iVar2 = iVar;
                Object[] objArr2 = {iVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b20f621d5b61457579dcd4e8669cda0", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b20f621d5b61457579dcd4e8669cda0")).booleanValue();
                }
                iVar2.a(list, z);
                return false;
            }
        });
    }

    @Trace(name = "sync_start", type = i.normal)
    private void a(final boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45ba2b3d7887a09dca446f9dc09be9bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45ba2b3d7887a09dca446f9dc09be9bb");
            return;
        }
        try {
            j.a(i.normal, "sync_start", (String[]) null, new Object[]{new Boolean(z), new Boolean(z2)});
            this.u = Boolean.FALSE;
            com.sankuai.xm.im.e.a(z2);
            ((l) com.sankuai.xm.base.service.m.a(l.class)).b(IMClient.n.class).a(new b.a<IMClient.n>() { // from class: com.sankuai.xm.im.message.d.24
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(IMClient.n nVar) {
                    IMClient.n nVar2 = nVar;
                    Object[] objArr2 = {nVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9793efbcd0d9aa7543d8742a6c4c2b60", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9793efbcd0d9aa7543d8742a6c4c2b60")).booleanValue();
                    }
                    nVar2.a(z);
                    return false;
                }
            });
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Boolean] */
    public boolean a(List<IMMessage> list, int i, boolean z) {
        boolean booleanValue;
        Object[] objArr = {list, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fb0652719b17ed1d3748925338e9875", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fb0652719b17ed1d3748925338e9875")).booleanValue();
        }
        if (list == null || list.isEmpty() || i == 3) {
            return true;
        }
        e().a(list);
        PubOppositeController f = f();
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = PubOppositeController.b;
        if (PatchProxy.isSupport(objArr2, f, changeQuickRedirect2, false, "d51a9ea339afb63ee71a1c9cd70b3f22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, f, changeQuickRedirect2, false, "d51a9ea339afb63ee71a1c9cd70b3f22");
        } else if (f.c()) {
            f.a(list);
            f.b(list);
        }
        long currentTimeMillis = System.currentTimeMillis();
        b(list);
        final ArrayList arrayList = new ArrayList();
        for (IMMessage iMMessage : list) {
            arrayList.add(MessageUtils.imMessageToDBMessage(iMMessage));
            if (z) {
                o.b.a.a((Message) iMMessage);
            }
        }
        if (i != 2 && i != 4) {
            booleanValue = DBProxy.l().k.a(arrayList, i);
        } else {
            final com.sankuai.xm.im.cache.f fVar = DBProxy.l().k;
            Object[] objArr3 = {arrayList};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.cache.f.a;
            if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "d93b3824a62f09074beb1a19180a3ac3", 6917529027641081856L)) {
                booleanValue = ((Boolean) PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "d93b3824a62f09074beb1a19180a3ac3")).booleanValue();
            } else {
                final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
                bVar.c = Boolean.FALSE;
                fVar.d.a(j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.3
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Boolean] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e982ac8c0d77a4844518b06fc11879f2", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e982ac8c0d77a4844518b06fc11879f2");
                        } else if (f.this.b(arrayList)) {
                            for (DBMessage dBMessage : arrayList) {
                                f.a(f.this, dBMessage, false);
                            }
                            bVar.c = Boolean.TRUE;
                        }
                    }
                }), true, (Callback) null);
                booleanValue = ((Boolean) bVar.c).booleanValue();
            }
        }
        com.sankuai.xm.im.cache.c.a("ReceiveMessageInsertDB", System.currentTimeMillis() - currentTimeMillis, arrayList.size(), -1);
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.List<com.sankuai.xm.im.message.bean.IMMessage> r19, long r20) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.d.a(java.util.List, long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r19, int r20, java.util.List<java.lang.Long> r21, long r22) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.d.a(int, int, java.util.List, long):void");
    }

    private List<long[]> d(List<Long> list, int i) {
        Object[] objArr = {list, 500};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec43bf97bfa89c4a0810cab6a79ccade", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec43bf97bfa89c4a0810cab6a79ccade");
        }
        ArrayList arrayList = new ArrayList();
        int size = (list.size() / 500) + (list.size() % 500 == 0 ? 0 : 1);
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            int i4 = i3 + 500;
            List<Long> subList = list.subList(i3, i4 > list.size() ? list.size() : i4);
            long[] jArr = new long[subList.size()];
            for (int i5 = 0; i5 < subList.size(); i5++) {
                jArr[i5] = subList.get(i5).longValue();
            }
            arrayList.add(jArr);
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    private void b(List<IMMessage> list) {
        char c2 = 1;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27cdeb000d1b645e523c0a5bd53e07bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27cdeb000d1b645e523c0a5bd53e07bf");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            ArrayList arrayList = new ArrayList();
            for (IMMessage iMMessage : list) {
                if (iMMessage.getMsgType() == 12) {
                    iMMessage.setMsgStatus(9);
                    com.sankuai.xm.im.utils.a.b("MessageProcessor::checkMsgStatus, msgUuid=" + iMMessage.getMsgUuid() + ", event msg, set read", new Object[0]);
                } else if (iMMessage.getFromUid() != IMClient.a().k()) {
                    if (IMClient.a().j().b(SessionId.a(iMMessage)) && iMMessage.getMsgStatus() == 7) {
                        iMMessage.setMsgStatus(9);
                        com.sankuai.xm.im.utils.a.b("MessageProcessor::checkMsgStatus, msgUuid=" + iMMessage.getMsgUuid() + ", in session, set read", new Object[0]);
                    } else {
                        arrayList.add(SessionId.a(iMMessage).f());
                    }
                }
            }
            if (com.sankuai.xm.base.util.b.a((Collection<?>) arrayList)) {
                return;
            }
            Map<String, DBSyncRead> a2 = DBProxy.l().l.a(arrayList);
            if (a2 == null) {
                a2 = new HashMap<>();
            }
            Map<String, DBSyncRead> map = a2;
            for (IMMessage iMMessage2 : list) {
                DBSyncRead dBSyncRead = map.get(SessionId.a(iMMessage2).f());
                Object[] objArr2 = new Object[2];
                objArr2[0] = iMMessage2;
                objArr2[c2] = dBSyncRead;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c98467923bc57911a38babc94a7a4293", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c98467923bc57911a38babc94a7a4293");
                } else if (dBSyncRead != null && dBSyncRead.getRsts() >= iMMessage2.getSts()) {
                    if (iMMessage2.getMsgStatus() == 7) {
                        iMMessage2.setMsgStatus(9);
                    }
                } else if (dBSyncRead == null && a(iMMessage2.getCategory(), iMMessage2.getSts()) && iMMessage2.getMsgStatus() == 7) {
                    iMMessage2.setMsgStatus(9);
                    com.sankuai.xm.im.utils.a.c("MessageProcessor::checkMsgStatus => 1个月前消息且没有获取到已读同步信息，设置已读。msg: " + iMMessage2.getMsgUuid() + "/" + iMMessage2.getMsgId(), new Object[0]);
                }
                c2 = 1;
            }
        }
    }

    @Trace(name = "notify_msg", type = i.end)
    public final void a(List<IMClient.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3ed7ca8d5c9fedadf6330f9f804e12d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3ed7ca8d5c9fedadf6330f9f804e12d");
            return;
        }
        try {
            j.a(i.end, "notify_msg", (String[]) null, new Object[]{list});
            HashMap hashMap = new HashMap();
            for (IMClient.a aVar : list) {
                CancelMessage cancelMessage = aVar.b;
                if (cancelMessage != null) {
                    if (hashMap.containsKey(Short.valueOf(cancelMessage.getChannel()))) {
                        ((List) hashMap.get(Short.valueOf(cancelMessage.getChannel()))).add(aVar);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(aVar);
                        hashMap.put(Short.valueOf(cancelMessage.getChannel()), arrayList);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                a(((Short) entry.getKey()).shortValue(), (List) entry.getValue());
                if (IMClient.a().a(((Short) entry.getKey()).shortValue())) {
                    arrayList2.addAll((Collection) entry.getValue());
                }
            }
            a((short) -1, (List<IMClient.a>) arrayList2);
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    private void a(short s, final List<IMClient.a> list) {
        Object[] objArr = {Short.valueOf(s), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6aea969f67254e6b145f31057f5f4b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6aea969f67254e6b145f31057f5f4b5");
        } else {
            ((l) com.sankuai.xm.base.service.m.a(l.class)).b(IMClient.b.class).a(s).a(new b.a<IMClient.b>() { // from class: com.sankuai.xm.im.message.d.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(IMClient.b bVar) {
                    IMClient.b bVar2 = bVar;
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54c3cd845158fc060f0a495526a9a224", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54c3cd845158fc060f0a495526a9a224")).booleanValue();
                    }
                    bVar2.a(list);
                    return false;
                }
            });
        }
    }

    public final void a(List<SessionId> list, Callback<String> callback) {
        Object[] objArr = {list, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc760c5d2199c1e08e1b85c40cddb77f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc760c5d2199c1e08e1b85c40cddb77f");
        } else {
            ((com.sankuai.xm.im.message.syncread.b) j().a()).a(list, callback);
        }
    }

    public final void a(com.sankuai.xm.base.proto.syncread.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a134814c7dd494047af1214c15f69a60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a134814c7dd494047af1214c15f69a60");
        } else {
            ((com.sankuai.xm.im.message.syncread.b) j().a()).a(aVar);
        }
    }

    public final void a(final SessionId sessionId, final long j, final long j2, final int i, final short s, @NonNull final Callback<List<IMMessage>> callback) {
        Object[] objArr = {sessionId, new Long(j), new Long(j2), Integer.valueOf(i), Short.valueOf(s), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be53cf5d5cc365794b0d9ea614d1d252", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be53cf5d5cc365794b0d9ea614d1d252");
        } else {
            DBProxy.l().b(j.a(new Runnable() { // from class: com.sankuai.xm.im.message.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    List arrayList;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31773e15c71031a8fc488246e2974841", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31773e15c71031a8fc488246e2974841");
                        return;
                    }
                    long a2 = d.a(d.this, sessionId, j);
                    if (a2 > j2 && j2 > 0) {
                        com.sankuai.xm.base.callback.a.a(callback, Collections.emptyList());
                        return;
                    }
                    List<DBMessage> a3 = DBProxy.l().k.a(sessionId, a2, j2, i, s);
                    if (MessageUtils.haveDeleteMessage(a3)) {
                        a3 = DBProxy.l().k.a(sessionId, a2, j2, i * 2, s);
                    }
                    List<DBMessage> list = a3;
                    List<IMMessage> emptyList = Collections.emptyList();
                    if (!com.sankuai.xm.base.util.b.a(list)) {
                        if (s == 0) {
                            com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b(Long.MAX_VALUE);
                            com.sankuai.xm.base.tinyorm.b bVar2 = new com.sankuai.xm.base.tinyorm.b(0L);
                            d.a(d.this, sessionId, j2, bVar, bVar2);
                            arrayList = d.this.a(list, sessionId, ((Long) bVar.c).longValue(), ((Long) bVar2.c).longValue());
                        } else {
                            arrayList = new ArrayList();
                            for (DBMessage dBMessage : list) {
                                IMMessage dbMessageToIMMessage = MessageUtils.dbMessageToIMMessage(dBMessage);
                                if (dbMessageToIMMessage instanceof UNKnownMessage) {
                                    dbMessageToIMMessage = d.this.a((UNKnownMessage) dbMessageToIMMessage);
                                }
                                arrayList.add(dbMessageToIMMessage);
                            }
                        }
                        emptyList = MessageUtils.getUnDeleteMessages(arrayList, i);
                    }
                    com.sankuai.xm.im.utils.a.b("MessageProcessor::getMessagesByTimeRange messages:" + emptyList.size() + " sessionid:" + sessionId.f() + " start:" + a2 + " endStamp:" + j2 + " limit:" + i + " direction:" + ((int) s), new Object[0]);
                    com.sankuai.xm.base.callback.a.a(callback, emptyList);
                }
            }), callback);
        }
    }

    public final void a(IMMessage iMMessage, final boolean z, final Callback<IMMessage> callback) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7056609398eb72d6d5f09d2d6074e47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7056609398eb72d6d5f09d2d6074e47");
        } else {
            DBProxy.l().k.a(MessageUtils.imMessageToDBMessage(iMMessage), new Callback<DBMessage>() { // from class: com.sankuai.xm.im.message.d.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(DBMessage dBMessage) {
                    DBMessage dBMessage2 = dBMessage;
                    Object[] objArr2 = {dBMessage2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46e5ee1f5263fc1de9147004095b9f1f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46e5ee1f5263fc1de9147004095b9f1f");
                    } else if (dBMessage2 != null) {
                        d.a(d.this, dBMessage2);
                        IMMessage dbMessageToIMMessage = MessageUtils.dbMessageToIMMessage(dBMessage2);
                        if (z) {
                            d.this.a(com.sankuai.xm.im.utils.c.a(dbMessageToIMMessage), false);
                        }
                        if (callback != null) {
                            callback.onSuccess(dbMessageToIMMessage);
                        }
                    } else if (callback != null) {
                        callback.onSuccess(null);
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e91e75297ee8022ea4de5b57291e8c5a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e91e75297ee8022ea4de5b57291e8c5a");
                        return;
                    }
                    com.sankuai.xm.im.utils.a.c("MessageProcessor::updateMessage, code = " + i + ",message = " + str, new Object[0]);
                    if (callback != null) {
                        callback.onFailure(i, str);
                    }
                }
            });
        }
    }

    private void a(int i, Collection<? extends Message> collection) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i), collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02e80eb346bf36c4cfe7ddcac020e43a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02e80eb346bf36c4cfe7ddcac020e43a");
        } else if (collection == null || collection.isEmpty()) {
        } else {
            if (collection.size() <= 10) {
                b(i, collection);
                return;
            }
            int size = (collection.size() / 10) + 1;
            List asList = Arrays.asList(collection.toArray(new Message[collection.size()]));
            do {
                ArrayList arrayList = new ArrayList();
                int i3 = i2 * 10;
                arrayList.addAll(asList.subList(i3, Math.min(i3 + 10, asList.size())));
                b(i, arrayList);
                i2++;
            } while (i2 < size);
        }
    }

    @Trace(name = "send_msg_start", type = i.send)
    public final void a(IMMessage iMMessage, boolean z) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70797d479eeb05cdb4c8f005ce5dd2bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70797d479eeb05cdb4c8f005ce5dd2bb");
            return;
        }
        try {
            j.a(i.send, "send_msg_start", (String[]) null, new Object[]{iMMessage, new Boolean(z)});
            synchronized (this.c) {
                if (this.c.containsKey(iMMessage.getMsgUuid())) {
                    this.c.remove(iMMessage.getMsgUuid());
                    j.a((Object) null);
                    return;
                }
                com.sankuai.xm.base.proto.send.a imMessageToSendProto = MessageUtils.imMessageToSendProto(iMMessage);
                if (a(iMMessage, imMessageToSendProto)) {
                    j.a((Object) null);
                } else if (c(iMMessage)) {
                    j.a((Object) null);
                } else {
                    if (!z) {
                        m().a(iMMessage.getMsgUuid());
                        f h = h();
                        h.a(a.b.NORMAL + CommonConstant.Symbol.COLON + iMMessage.getMsgUuid(), iMMessage);
                    } else {
                        Object[] objArr2 = {iMMessage};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49450aae65e59ab8b59f54c8d88e52e9", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49450aae65e59ab8b59f54c8d88e52e9");
                        } else if ((MessageUtils.isIMPeerService(iMMessage.getCategory()) || iMMessage.getCategory() == 2) && iMMessage.getRetries() % 3 == 1 && !IMClient.a().h().f()) {
                            a();
                        }
                        m().a(iMMessage.getMsgUuid(), MessageStatisticsEntry.PARAM_RETRY, Integer.valueOf(iMMessage.getRetries()));
                    }
                    short s = MessageUtils.isPubService(iMMessage.getCategory()) ? (short) 410 : (short) 401;
                    byte[] bS_ = imMessageToSendProto.bS_();
                    com.sankuai.xm.im.utils.a.b("MessageProcessor::sendMessage, CRC32 check : uuid = " + iMMessage.getMsgUuid() + ", category = " + iMMessage.getCategory() + ", crc32 = " + com.sankuai.xm.base.util.c.a(bS_), new Object[0]);
                    com.sankuai.xm.im.connection.c.a(s, bS_);
                    j.a((Object) null);
                }
            }
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    @Trace(name = "send_recall_start", type = i.send)
    public final void b(IMMessage iMMessage, boolean z) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4664728d3386d7b40f303178af1da6ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4664728d3386d7b40f303178af1da6ec");
            return;
        }
        try {
            j.a(i.send, "send_recall_start", (String[]) null, new Object[]{iMMessage, new Boolean(z)});
            if (iMMessage == null) {
                j.a((Object) null);
                return;
            }
            if (MessageUtils.isIMPeerService(iMMessage.getCategory()) || iMMessage.getCategory() == 2 || MessageUtils.isPubService(iMMessage.getCategory())) {
                if (!z) {
                    f h = h();
                    h.a(a.b.CANCEL + CommonConstant.Symbol.COLON + iMMessage.getMsgUuid(), iMMessage);
                }
                com.sankuai.xm.im.connection.c.a(MessageUtils.isPubService(iMMessage.getCategory()) ? (short) 410 : (short) 401, MessageUtils.imMessageToCancelProto(iMMessage).bS_());
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(final int r12, java.util.Collection<? extends com.sankuai.xm.im.message.bean.Message> r13) {
        /*
            r11 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r8 = 0
            r0[r8] = r1
            r1 = 1
            r0[r1] = r13
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.im.message.d.a
            java.lang.String r10 = "37ae963ab42d522344e72fb698b12b80"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L22:
            switch(r12) {
                case 1: goto L32;
                case 2: goto L32;
                case 3: goto L29;
                default: goto L25;
            }
        L25:
            switch(r12) {
                case 9: goto L32;
                case 10: goto L29;
                case 11: goto L29;
                default: goto L28;
            }
        L28:
            return
        L29:
            java.lang.String r0 = "/msg/api/pub/v3/message/exist"
            java.lang.String r0 = com.sankuai.xm.im.http.a.a(r0)
            r1 = 410(0x19a, float:5.75E-43)
            goto L3a
        L32:
            java.lang.String r0 = "/msg/api/chat/v3/message/exist"
            java.lang.String r0 = com.sankuai.xm.im.http.a.a(r0)
            r1 = 401(0x191, float:5.62E-43)
        L3a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb7
            r3.<init>()     // Catch: org.json.JSONException -> Lb7
            java.lang.String r4 = "u"
            com.sankuai.xm.im.IMClient r5 = com.sankuai.xm.im.IMClient.a()     // Catch: org.json.JSONException -> Lb7
            long r5 = r5.k()     // Catch: org.json.JSONException -> Lb7
            r3.put(r4, r5)     // Catch: org.json.JSONException -> Lb7
            java.lang.String r4 = "ai"
            com.sankuai.xm.login.a r5 = com.sankuai.xm.login.a.a()     // Catch: org.json.JSONException -> Lb7
            short r5 = r5.m()     // Catch: org.json.JSONException -> Lb7
            r3.put(r4, r5)     // Catch: org.json.JSONException -> Lb7
            java.lang.String r4 = "svid"
            r3.put(r4, r1)     // Catch: org.json.JSONException -> Lb7
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lb7
            r1.<init>()     // Catch: org.json.JSONException -> Lb7
            java.util.Iterator r13 = r13.iterator()     // Catch: org.json.JSONException -> Lb7
        L6c:
            boolean r4 = r13.hasNext()     // Catch: org.json.JSONException -> Lb7
            if (r4 == 0) goto L87
            java.lang.Object r4 = r13.next()     // Catch: org.json.JSONException -> Lb7
            com.sankuai.xm.im.message.bean.Message r4 = (com.sankuai.xm.im.message.bean.Message) r4     // Catch: org.json.JSONException -> Lb7
            java.lang.String r5 = r4.getMsgUuid()     // Catch: org.json.JSONException -> Lb7
            r1.put(r5)     // Catch: org.json.JSONException -> Lb7
            java.lang.String r4 = r4.getMsgUuid()     // Catch: org.json.JSONException -> Lb7
            r2.add(r4)     // Catch: org.json.JSONException -> Lb7
            goto L6c
        L87:
            java.lang.String r13 = "msguuid"
            r3.put(r13, r1)     // Catch: org.json.JSONException -> Lb7
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lb7
            java.lang.String r1 = "MessageProcessor::queryMessageSendResult, json = "
            r13.<init>(r1)     // Catch: org.json.JSONException -> Lb7
            java.lang.String r1 = r3.toString()     // Catch: org.json.JSONException -> Lb7
            r13.append(r1)     // Catch: org.json.JSONException -> Lb7
            java.lang.String r13 = r13.toString()     // Catch: org.json.JSONException -> Lb7
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: org.json.JSONException -> Lb7
            com.sankuai.xm.im.utils.a.a(r13, r1)     // Catch: org.json.JSONException -> Lb7
            com.sankuai.xm.base.d r13 = new com.sankuai.xm.base.d
            com.sankuai.xm.im.message.d$6 r1 = new com.sankuai.xm.im.message.d$6
            r1.<init>()
            r13.<init>(r0, r3, r1)
            com.sankuai.xm.network.httpurlconnection.g r12 = com.sankuai.xm.network.httpurlconnection.g.a()
            r0 = 0
            r12.a(r13, r0)
            return
        Lb7:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "MessageProcessor::queryMessageSendResult, json = "
            r13.<init>(r0)
            java.lang.String r12 = r12.getLocalizedMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.Object[] r13 = new java.lang.Object[r8]
            com.sankuai.xm.im.utils.a.c(r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.d.b(int, java.util.Collection):void");
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9406905bad01df8ab67dca2213dc4d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9406905bad01df8ab67dca2213dc4d3");
            return;
        }
        List<DBMessage> a2 = DBProxy.l().k.a(IMClient.a().k(), i);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        a(i, a2);
    }

    public f h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0474fbe2c42f541007fd4e7e51c3e1a5", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0474fbe2c42f541007fd4e7e51c3e1a5");
        }
        if (this.i == null) {
            synchronized (this.b) {
                if (this.i == null) {
                    this.i = new f(this);
                }
            }
        }
        return this.i;
    }

    @TraceStatus
    private boolean a(IMMessage iMMessage, com.sankuai.xm.base.proto.send.a aVar) {
        c remove;
        Object[] objArr = {iMMessage, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "960d327b46d511f40c9cea89f575223d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "960d327b46d511f40c9cea89f575223d")).booleanValue();
        }
        if (!((aVar == null || aVar.g() == null) ? false : true)) {
            synchronized (this.b) {
                remove = this.o.containsKey(iMMessage.getMsgUuid()) ? this.o.remove(iMMessage.getMsgUuid()) : null;
                f h = h();
                h.a(a.b.NORMAL + CommonConstant.Symbol.COLON + iMMessage.getMsgUuid());
            }
            iMMessage.setMsgStatus(4);
            iMMessage.setErrorCode(10022);
            d(iMMessage);
            com.sankuai.xm.im.utils.a.d("%s sendMediaMessage::ERROR CATEGORY, %s:", "MessageProcessor::", iMMessage.keyParamToString());
            a(iMMessage.getMsgUuid(), iMMessage, iMMessage.keyParamToString(), 10022, 4);
            if (remove != null && remove.c != null) {
                remove.c.onFailure(iMMessage, 10022);
            }
            j.a(new Boolean(true), (String[]) null, new int[]{0}, new String[]{"true"}, new int[]{10022}, (int[]) null);
            return true;
        }
        j.a(new Boolean(false), (String[]) null, new int[]{0}, new String[]{"true"}, new int[]{10022}, (int[]) null);
        return false;
    }

    @TraceStatus
    private boolean c(IMMessage iMMessage) {
        c remove;
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8545f91cce57107e0ffd2c377a01ac8b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8545f91cce57107e0ffd2c377a01ac8b")).booleanValue();
        }
        if (IMClient.a().h() == null || IMClient.a().h().i() || IMClient.a().h().j() || IMClient.a().h().k()) {
            synchronized (this.b) {
                remove = this.o.containsKey(iMMessage.getMsgUuid()) ? this.o.remove(iMMessage.getMsgUuid()) : null;
                f h = h();
                h.a(a.b.NORMAL + CommonConstant.Symbol.COLON + iMMessage.getMsgUuid());
            }
            iMMessage.setMsgStatus(4);
            iMMessage.setErrorCode(10007);
            d(iMMessage);
            com.sankuai.xm.im.utils.a.d("%s sendMediaMessage::ERROR NOT LOGIN, %s:", "MessageProcessor::", iMMessage.keyParamToString());
            a(iMMessage.getMsgUuid(), iMMessage, iMMessage.keyParamToString(), 10007, 4);
            if (remove != null && remove.c != null) {
                remove.c.onFailure(iMMessage, 10007);
            }
            j.a(new Boolean(true), (String[]) null, new int[]{0}, new String[]{"true"}, new int[]{10007}, (int[]) null);
            return true;
        }
        j.a(new Boolean(false), (String[]) null, new int[]{0}, new String[]{"true"}, new int[]{10007}, (int[]) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aa8e149d7c441df59cb02712dce3511", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aa8e149d7c441df59cb02712dce3511");
            return;
        }
        IMClient.a().j().a(list);
        IMClient.a().j().d(list);
    }

    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0074203540be45151509aae280b45c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0074203540be45151509aae280b45c7");
        } else {
            this.r = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf708f2f25a8929e3a74b52cae525f6f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf708f2f25a8929e3a74b52cae525f6f")).booleanValue();
        }
        DBMessage imMessageToDBMessage = MessageUtils.imMessageToDBMessage(iMMessage);
        DBMessage a2 = DBProxy.l().k.a(imMessageToDBMessage);
        if (a2 != null) {
            IMClient.a().j().a(imMessageToDBMessage);
        }
        return a2 != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final IMMessage iMMessage, final boolean z, final IMClient.SendMessageCallback sendMessageCallback) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), sendMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20d9b142176e4440cd8c7c8c561c115d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20d9b142176e4440cd8c7c8c561c115d");
            return;
        }
        m().a(iMMessage.getMsgUuid(), iMMessage);
        com.sankuai.xm.im.utils.a.b("%s sendMessageOnQueue::msg key: %s", "MessageProcessor::", iMMessage.keyParamToString());
        com.sankuai.xm.threadpool.scheduler.a.b().a(11, j.a(new Runnable() { // from class: com.sankuai.xm.im.message.d.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            @Trace(name = "save_msg", type = i.normal)
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0338c62ebfd1d17454f8c1b6dbdc58e1", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0338c62ebfd1d17454f8c1b6dbdc58e1");
                    return;
                }
                try {
                    j.a(i.normal, "save_msg", (String[]) null, new Object[0]);
                    iMMessage.setMsgStatus(3);
                    if (!d.this.d(iMMessage)) {
                        d.this.a(iMMessage, 10019, 1, sendMessageCallback);
                    } else {
                        if (z) {
                            sendMessageCallback.a(iMMessage, iMMessage.getMsgStatus());
                        }
                        if ((iMMessage instanceof MediaMessage) && (sendMessageCallback instanceof IMClient.SendMediaMessageCallback)) {
                            if (!d.a(d.this, (MediaMessage) iMMessage, d.this.b(iMMessage.getMsgType()), (IMClient.SendMediaMessageCallback) sendMessageCallback)) {
                                d.this.a(iMMessage, false);
                            }
                        } else {
                            d.this.a(iMMessage, false);
                        }
                    }
                    j.a((Object) null);
                } catch (Throwable th) {
                    j.a(th);
                    throw th;
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IMMessage iMMessage, @TraceStatus int i, int i2, IMClient.SendMessageCallback sendMessageCallback) {
        Object[] objArr = {iMMessage, Integer.valueOf(i), Integer.valueOf(i2), sendMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9029cdb9078b942b585639579d3e8951", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9029cdb9078b942b585639579d3e8951");
            return;
        }
        j.a(new Integer(i), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
        com.sankuai.xm.im.utils.a.d("MessageProcessor::onSendMessageFailed::STATE_SEND_FAILED, msg uuid：" + iMMessage.getMsgUuid(), new Object[0]);
        iMMessage.setMsgStatus(4);
        iMMessage.setErrorCode(i);
        if (i2 != 1) {
            d(iMMessage);
        }
        if (sendMessageCallback != null) {
            sendMessageCallback.onFailure(iMMessage, i);
        }
        a(iMMessage.getMsgUuid());
        a(iMMessage.getMsgUuid(), iMMessage, iMMessage.keyParamToString(), i, i2);
    }

    public final c a(String str) {
        c remove;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bd616718ff5166bfca8785ff7bb2178", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bd616718ff5166bfca8785ff7bb2178");
        }
        synchronized (this.b) {
            remove = this.o.remove(str);
        }
        return remove;
    }

    public final void b(IMMessage iMMessage, IMClient.SendMessageCallback sendMessageCallback) {
        Object[] objArr = {iMMessage, sendMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "933e93503f42144747b3ed16a0cf8013", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "933e93503f42144747b3ed16a0cf8013");
        } else if (sendMessageCallback != null) {
            synchronized (this.b) {
                if (!this.o.containsKey(iMMessage.getMsgUuid())) {
                    this.o.put(iMMessage.getMsgUuid(), new c(iMMessage, sendMessageCallback));
                }
            }
        }
    }

    public void c(final List<IMMessage> list, final int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69be07f32455511fc6abf6b998f38a71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69be07f32455511fc6abf6b998f38a71");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
            com.sankuai.xm.im.utils.a.c("MessageProcessor::processCancelMessages,list null, source:" + i, new Object[0]);
        } else {
            final long a2 = com.sankuai.xm.login.c.a().a(System.currentTimeMillis());
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.message.d.12
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43784cdc24194e58316b8f525aaabc8e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43784cdc24194e58316b8f525aaabc8e");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    List<a> list2 = null;
                    try {
                        DBProxy.l().a(DBProxy.l().bR_());
                        List<a> e = d.this.e(list, i);
                        try {
                            DBProxy.l().b(DBProxy.l().bR_());
                            DBProxy.l().c(DBProxy.l().bR_());
                            com.sankuai.xm.im.utils.a.b("MessageProcessor::processCancelMessages finally, time = " + (System.currentTimeMillis() - currentTimeMillis) + ",recv size:" + list.size() + ",succ size:" + com.sankuai.xm.base.util.b.b(e) + ",source:" + i, new Object[0]);
                            if (com.sankuai.xm.base.util.b.a(e)) {
                                com.sankuai.xm.im.utils.a.d("MessageProcessor::processCancelMessages, success size = 0", new Object[0]);
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            for (a aVar : e) {
                                arrayList.add(aVar.a);
                            }
                            if (i != 1 && i != 3) {
                                d.this.a(arrayList, a2);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (a aVar2 : e) {
                                IMClient.a aVar3 = new IMClient.a();
                                aVar3.a = aVar2.b;
                                aVar3.b = aVar2.a;
                                arrayList2.add(aVar3);
                            }
                            d.this.a(arrayList, i != 0);
                            d.this.a(arrayList2);
                            IMClient.a().j().b(e);
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            com.sankuai.xm.im.utils.a.b("MessageProcessor::processCancelMessages, time = " + currentTimeMillis2 + ", message size = " + list.size() + ", source = " + i + ", success size = " + e.size(), new Object[0]);
                        } catch (Throwable th) {
                            th = th;
                            list2 = e;
                            DBProxy.l().c(DBProxy.l().bR_());
                            com.sankuai.xm.im.utils.a.b("MessageProcessor::processCancelMessages finally, time = " + (System.currentTimeMillis() - currentTimeMillis) + ",recv size:" + list.size() + ",succ size:" + com.sankuai.xm.base.util.b.b(list2) + ",source:" + i, new Object[0]);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }), (Callback) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Trace(name = "handle_recall", type = i.normal)
    @TraceStatus
    public List<a> e(List<IMMessage> list, int i) {
        DBMessage a2;
        DBMessage dBMessage;
        int i2;
        AbstractMediaMsgHandler abstractMediaMsgHandler;
        char c2 = 2;
        int i3 = 1;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8679becbe8b9b3591f678e8dcb1afbc", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8679becbe8b9b3591f678e8dcb1afbc");
        }
        try {
            DBMessage dBMessage2 = null;
            j.a(i.normal, "handle_recall", (String[]) null, new Object[]{list, new Integer(i)});
            ArrayList arrayList = new ArrayList();
            for (IMMessage iMMessage : list) {
                final DBMessage a3 = DBProxy.l().k.a(iMMessage.getCategory(), iMMessage.getMsgUuid(), (boolean) i3);
                int msgStatus = a3 == null ? 9 : a3.getMsgStatus();
                if (!(iMMessage instanceof ForceCancelMessage)) {
                    iMMessage.setCts(a3 == null ? iMMessage.getCts() : a3.getCts());
                    a2 = DBProxy.l().k.a(MessageUtils.imMessageToDBMessage(iMMessage));
                } else {
                    final com.sankuai.xm.im.cache.f fVar = DBProxy.l().k;
                    Object[] objArr2 = new Object[i3];
                    objArr2[0] = a3;
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.cache.f.a;
                    if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "7cc16c4dfedd1e1e5e7cd42ab1ecb2a9", 6917529027641081856L)) {
                        a2 = (DBMessage) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "7cc16c4dfedd1e1e5e7cd42ab1ecb2a9");
                    } else if (a3 == null) {
                        a2 = dBMessage2;
                    } else {
                        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
                        fVar.d.c(j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.6
                            public static ChangeQuickRedirect a;

                            /* JADX WARN: Type inference failed for: r1v10, types: [com.sankuai.xm.im.cache.bean.DBMessage, T] */
                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cd3802364ea9cc79be31891df1dd9d7a", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cd3802364ea9cc79be31891df1dd9d7a");
                                    return;
                                }
                                f fVar2 = f.this;
                                DBMessage dBMessage3 = a3;
                                Object[] objArr4 = {dBMessage3};
                                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                                if (PatchProxy.isSupport(objArr4, fVar2, changeQuickRedirect4, false, "91a6e54dc048e161206820e1d6eae520", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr4, fVar2, changeQuickRedirect4, false, "91a6e54dc048e161206820e1d6eae520")).booleanValue() : com.sankuai.xm.base.tinyorm.f.a().b(fVar2.d.bR_(), dBMessage3)) {
                                    f fVar3 = f.this;
                                    DBMessage dBMessage4 = a3;
                                    Object[] objArr5 = {dBMessage4};
                                    ChangeQuickRedirect changeQuickRedirect5 = f.a;
                                    if (PatchProxy.isSupport(objArr5, fVar3, changeQuickRedirect5, false, "4bc7765e8241368a441a02d3d52d3a9e", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr5, fVar3, changeQuickRedirect5, false, "4bc7765e8241368a441a02d3d52d3a9e");
                                    } else {
                                        SessionId a4 = SessionId.a(dBMessage4);
                                        synchronized (fVar3.b) {
                                            a aVar = fVar3.e.get(a4.f());
                                            if (aVar != null && aVar.d != -1) {
                                                aVar.b(dBMessage4, true);
                                            }
                                        }
                                    }
                                    bVar.c = a3;
                                }
                            }
                        }));
                        a2 = (DBMessage) bVar.c;
                    }
                }
                if (a2 == null && a3 != null) {
                    dBMessage = dBMessage2;
                    dBMessage2 = dBMessage;
                    c2 = 2;
                    i3 = 1;
                }
                IMMessage dbMessageToIMMessage = MessageUtils.dbMessageToIMMessage(a3);
                CancelMessage cancelMessage = (CancelMessage) iMMessage;
                Object[] objArr3 = new Object[4];
                objArr3[0] = Integer.valueOf(i);
                objArr3[i3] = cancelMessage;
                objArr3[c2] = dbMessageToIMMessage;
                objArr3[3] = Integer.valueOf(msgStatus);
                ChangeQuickRedirect changeQuickRedirect3 = a;
                int i4 = msgStatus;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "468bc0d832a6a97594b4b5ef16f7566d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "468bc0d832a6a97594b4b5ef16f7566d");
                    i2 = i4;
                    dBMessage = null;
                } else {
                    if (dbMessageToIMMessage == null && i == 1 && (cancelMessage instanceof ForceCancelMessage)) {
                        dBMessage = null;
                        ((HistoryController) l().a()).a(SessionId.a(cancelMessage), cancelMessage.getMsgId(), (HistoryController.HistoryMessageCallback) null);
                        i2 = i4;
                    }
                    dBMessage = null;
                    if (dbMessageToIMMessage == null) {
                        o.b.a.a(cancelMessage);
                    }
                    if ((dbMessageToIMMessage instanceof MediaMessage) && (abstractMediaMsgHandler = (AbstractMediaMsgHandler) b(dbMessageToIMMessage.getMsgType())) != null) {
                        abstractMediaMsgHandler.c((MediaMessage) dbMessageToIMMessage);
                    }
                    i2 = i4;
                    if (i2 == 7) {
                        o.b.a.a((IMMessage) cancelMessage);
                    }
                }
                a aVar = new a();
                aVar.a = (CancelMessage) iMMessage;
                aVar.b = dbMessageToIMMessage;
                aVar.c = i2;
                arrayList.add(aVar);
                dBMessage2 = dBMessage;
                c2 = 2;
                i3 = 1;
            }
            j.a(arrayList);
            return arrayList;
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public final m b(int i) {
        m mVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b62c043c2a2768466ed2c604458e5c53", 6917529027641081856L)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b62c043c2a2768466ed2c604458e5c53");
        }
        synchronized (this.b) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4170a431d083d4c66330e84f7e83389", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4170a431d083d4c66330e84f7e83389");
            } else if (this.d.isEmpty()) {
                this.d.put(1, new t(this));
                this.d.put(4, new n(this));
                this.d.put(11, new h(this));
                this.d.put(8, new com.sankuai.xm.im.message.handler.j(this));
                this.d.put(2, new com.sankuai.xm.im.message.handler.b(this));
                this.d.put(3, new w(this));
                this.d.put(5, new com.sankuai.xm.im.message.handler.c(this));
                this.d.put(6, new com.sankuai.xm.im.message.handler.o(this));
                this.d.put(7, new p(this));
                this.d.put(9, new k(this));
                this.d.put(10, new v(this));
                this.d.put(18, new v(this));
                this.d.put(12, new com.sankuai.xm.im.message.handler.i(this));
                this.d.put(13, new com.sankuai.xm.im.message.handler.f(this));
                this.d.put(15, new com.sankuai.xm.im.message.handler.d(this));
                this.d.put(14, new q(this));
                this.d.put(16, new s(this));
                this.d.put(17, new com.sankuai.xm.im.message.handler.l(this));
                this.d.put(19, new com.sankuai.xm.im.message.handler.e(this));
                this.d.put(20, new r(this));
                this.d.put(21, new com.sankuai.xm.im.message.handler.g(this));
                this.d.put(100, new u());
            }
            mVar = this.d.get(Integer.valueOf(i));
        }
        return mVar;
    }

    public final com.sankuai.xm.im.message.voice.a i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad68cc3d0138ee78b08c87bf6d858ba1", 6917529027641081856L)) {
            return (com.sankuai.xm.im.message.voice.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad68cc3d0138ee78b08c87bf6d858ba1");
        }
        if (this.h == null) {
            synchronized (this.b) {
                if (this.h == null) {
                    this.h = new com.sankuai.xm.im.message.voice.a();
                }
            }
        }
        return this.h;
    }

    public final void a(final int i, final long j, final Callback<IMMessage> callback) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fd336a17b830b0d7fb9ca66712f1f70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fd336a17b830b0d7fb9ca66712f1f70");
        } else {
            DBProxy.l().b(j.a(new Runnable() { // from class: com.sankuai.xm.im.message.d.14
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5e3f8c3bb103b0484d2393010aa3d35", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5e3f8c3bb103b0484d2393010aa3d35");
                        return;
                    }
                    DBMessage a2 = DBProxy.l().k.a(i, j, true);
                    callback.onSuccess(a2 == null ? null : MessageUtils.dbMessageToIMMessage(a2));
                }
            }), callback);
        }
    }

    public final void a(final SessionId sessionId, final long j, final long j2, final int i, boolean z, final Callback<List<IMMessage>> callback) {
        Object[] objArr = {sessionId, new Long(j), new Long(j2), Integer.valueOf(i), (byte) 0, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ef49999d0c9e8db378843979e174a71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ef49999d0c9e8db378843979e174a71");
        } else {
            DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.message.d.15
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e24f3acd1838cde8f7963aef2ac2bfa4", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e24f3acd1838cde8f7963aef2ac2bfa4");
                        return;
                    }
                    long a2 = d.a(d.this, sessionId, j2);
                    if (a2 > j && j > 0) {
                        com.sankuai.xm.base.callback.a.a(callback, Collections.emptyList());
                        return;
                    }
                    List<DBMessage> a3 = DBProxy.l().k.a(sessionId, j, a2, i);
                    if (MessageUtils.haveDeleteMessage(a3)) {
                        a3 = DBProxy.l().k.a(sessionId, j, a2, i * 2);
                    }
                    List<DBMessage> list = a3;
                    List<IMMessage> emptyList = Collections.emptyList();
                    if (!com.sankuai.xm.base.util.b.a(list)) {
                        com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b(Long.MAX_VALUE);
                        com.sankuai.xm.base.tinyorm.b bVar2 = new com.sankuai.xm.base.tinyorm.b(0L);
                        d.a(d.this, sessionId, j, bVar, bVar2);
                        emptyList = MessageUtils.getUnDeleteMessages(d.this.a(list, sessionId, ((Long) bVar.c).longValue(), ((Long) bVar2.c).longValue()), i);
                    }
                    com.sankuai.xm.im.utils.a.b("MessageProcessor::getMessages messages size: %s sessionId: %s endStamp: %s, limit: %s, dbQueue: %s", Integer.valueOf(emptyList.size()), sessionId.f(), Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(r9));
                    com.sankuai.xm.base.callback.a.a(callback, emptyList);
                }
            }), callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IMMessage a(UNKnownMessage uNKnownMessage) {
        IMMessage transformToIMMessageFromProto;
        Object[] objArr = {uNKnownMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c40eb19c4bc23c194a3df0d8401ca55b", 6917529027641081856L)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c40eb19c4bc23c194a3df0d8401ca55b");
        }
        byte[] data = uNKnownMessage.getData();
        if (data == null || (transformToIMMessageFromProto = MessageUtils.transformToIMMessageFromProto(data)) == null || (transformToIMMessageFromProto instanceof UNKnownMessage)) {
            return uNKnownMessage;
        }
        int msgType = transformToIMMessageFromProto.getMsgType();
        uNKnownMessage.copyTo(transformToIMMessageFromProto);
        transformToIMMessageFromProto.setMsgType(msgType);
        d(transformToIMMessageFromProto);
        return transformToIMMessageFromProto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, IMMessage iMMessage, String str2, int i, int i2) {
        Object[] objArr = {str, iMMessage, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "230e987efe9488afe61c3a40e9847b81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "230e987efe9488afe61c3a40e9847b81");
            return;
        }
        m().a(str, MessageStatisticsEntry.PARAM_MSG_ID, iMMessage.getMsgUuid());
        m().a(str, "net", String.valueOf(com.sankuai.xm.base.util.net.d.c(IMClient.a().f())));
        if (i == 10020) {
            m().a(str, "result", 15);
        } else {
            m().a(str, "result", Integer.valueOf(i2));
            if (i2 == 3) {
                m().a(str, "code", Integer.valueOf(i));
            }
        }
        if (!TextUtils.isEmpty(str2) && str2.contains(CommonConstant.Symbol.BIG_BRACKET_LEFT)) {
            m().a(str, "msg", Base64.encodeToString(str2.getBytes(), 2));
        } else {
            m().a(str, "msg", str2);
        }
        m().b(str);
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8687b48c1727ab11924172ba93c42ec6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8687b48c1727ab11924172ba93c42ec6");
            return;
        }
        com.sankuai.xm.im.utils.b a2 = com.sankuai.xm.im.utils.b.a();
        if (System.currentTimeMillis() - a2.getLong("MessageCountReportTime_" + IMClient.a().k(), 0L) > DDLoadConstants.TIME_HOURS_MILLIS) {
            com.sankuai.xm.threadpool.scheduler.a.b().b(j.a(new Runnable() { // from class: com.sankuai.xm.im.message.d.18
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a746b0d12328f976ece07a5d4ae5c334", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a746b0d12328f976ece07a5d4ae5c334");
                        return;
                    }
                    final com.sankuai.xm.im.cache.f fVar = DBProxy.l().k;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.cache.f.a;
                    if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "fe0647c42f1e8e592974e4bcdfcbdf90", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "fe0647c42f1e8e592974e4bcdfcbdf90");
                    } else {
                        DBProxy.l().c(j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.f.18
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b3e9a6f87cac7d159609df9ab183f231", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b3e9a6f87cac7d159609df9ab183f231");
                                    return;
                                }
                                com.sankuai.xm.base.db.c bR_ = f.this.d.bR_();
                                f.a(f.this, bR_, PersonalDBMessage.TABLE_NAME, 1);
                                f.a(f.this, bR_, GroupDBMessage.TABLE_NAME, 2);
                                f.a(f.this, bR_, PubDBMessage.TABLE_NAME, 3);
                            }
                        }));
                    }
                    com.sankuai.xm.im.utils.b a3 = com.sankuai.xm.im.utils.b.a();
                    com.sankuai.xm.im.utils.b.a(a3.a("MessageCountReportTime_" + IMClient.a().k(), System.currentTimeMillis()));
                }
            }), 300000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Trace(name = "msg_continuity", type = i.normal)
    @NonNull
    public List<IMMessage> a(List<DBMessage> list, SessionId sessionId, long j, long j2) {
        boolean z = true;
        Object[] objArr = {list, sessionId, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5af2b6b54200ea30f8c7bd8f0f1ef86f", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5af2b6b54200ea30f8c7bd8f0f1ef86f");
        }
        try {
            j.a(i.normal, "msg_continuity", (String[]) null, new Object[]{list, sessionId, new Long(j), new Long(j2)});
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = 0;
            try {
                try {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19aea57cf0b021d3927d90b81fe6867c", 6917529027641081856L)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19aea57cf0b021d3927d90b81fe6867c")).booleanValue();
                    } else {
                        o();
                        if (this.s == null || !this.s.booleanValue()) {
                            z = false;
                        }
                    }
                    if (z) {
                        List<IMMessage> dbMessageToIMMessage = MessageUtils.dbMessageToIMMessage(list);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        com.sankuai.xm.im.utils.a.b("MessageProcessor::filterIMMessages execute time:" + (currentTimeMillis2 - currentTimeMillis) + " filterMsgWithoutSeqId execute time:" + (currentTimeMillis2 - 0), new Object[0]);
                        j.a(dbMessageToIMMessage);
                        return dbMessageToIMMessage;
                    }
                    List<IMMessage> b2 = b(list, sessionId, j, j2);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    try {
                        List<IMMessage> a2 = a(b2, sessionId);
                        long currentTimeMillis4 = System.currentTimeMillis();
                        com.sankuai.xm.im.utils.a.b("MessageProcessor::filterIMMessages execute time:" + (currentTimeMillis4 - currentTimeMillis) + " filterMsgWithoutSeqId execute time:" + (currentTimeMillis4 - currentTimeMillis3), new Object[0]);
                        j.a(a2);
                        return a2;
                    } catch (Exception e) {
                        e = e;
                        j3 = currentTimeMillis3;
                        j.b(e);
                        com.sankuai.xm.im.utils.a.a(e, "MessageProcessor::filterIMMessages", new Object[0]);
                        long currentTimeMillis5 = System.currentTimeMillis();
                        com.sankuai.xm.im.utils.a.b("MessageProcessor::filterIMMessages execute time:" + (currentTimeMillis5 - currentTimeMillis) + " filterMsgWithoutSeqId execute time:" + (currentTimeMillis5 - j3), new Object[0]);
                        ArrayList arrayList = new ArrayList();
                        j.a(arrayList);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        j3 = currentTimeMillis3;
                        j.b(th);
                        long currentTimeMillis6 = System.currentTimeMillis();
                        com.sankuai.xm.im.utils.a.b("MessageProcessor::filterIMMessages execute time:" + (currentTimeMillis6 - currentTimeMillis) + " filterMsgWithoutSeqId execute time:" + (currentTimeMillis6 - j3), new Object[0]);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            j.a(th3);
            throw th3;
        }
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beb609f23f042e9b520bbd7186e12e29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beb609f23f042e9b520bbd7186e12e29");
        } else if (this.s == null) {
            synchronized (this) {
                if (this.s == null) {
                    this.s = Boolean.FALSE;
                }
                String a2 = com.sankuai.xm.base.hornconfig.a.a().a("close_message_repair");
                if (!TextUtils.isEmpty(a2)) {
                    this.s = Boolean.valueOf(TextUtils.equals(a2, "1"));
                }
            }
        }
    }

    private List<IMMessage> b(List<DBMessage> list, SessionId sessionId, long j, long j2) {
        int i;
        Set<Long> set;
        Object[] objArr = {list, sessionId, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e53fa4f01e0c142f753c194f45e0d75", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e53fa4f01e0c142f753c194f45e0d75");
        }
        if (list == null) {
            return new LinkedList();
        }
        com.sankuai.xm.im.utils.a.b("MessageProcessor::filterIMMessagesWithSeqId targetSeqId = " + j + " targetFlag = " + j2, new Object[0]);
        LinkedList linkedList = new LinkedList();
        Iterator<DBMessage> it = list.iterator();
        long j3 = 0L;
        long j4 = j;
        long j5 = j2;
        while (true) {
            if (!it.hasNext()) {
                i = 0;
                break;
            }
            DBMessage next = it.next();
            if (next.getMsgId() <= 0) {
                linkedList.add(MessageUtils.dbMessageToIMMessage(next));
                com.sankuai.xm.im.utils.a.c("MessageProcessor::filterIMMessagesWithSeqId => msgId 0  uuid = " + next.getMsgUuid() + " MsgSeqId = " + next.getMsgSeqid() + " MsgFlag = " + next.getMsgFlag(), new Object[0]);
            } else if (MessageUtils.isContinuityMsg(next.getMsgSeqid(), next.getMsgFlag(), j4, j5)) {
                IMMessage dbMessageToIMMessage = MessageUtils.dbMessageToIMMessage(next);
                if (dbMessageToIMMessage instanceof UNKnownMessage) {
                    dbMessageToIMMessage = a((UNKnownMessage) dbMessageToIMMessage);
                }
                linkedList.add(dbMessageToIMMessage);
                if (dbMessageToIMMessage.getMsgSeqid() != 0) {
                    j4 = dbMessageToIMMessage.getMsgSeqid();
                    j5 = dbMessageToIMMessage.getMsgFlag();
                    j3 = dbMessageToIMMessage.getMsgId();
                }
            } else {
                int i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (i2 > 0) {
                    HistoryController historyController = (HistoryController) l().a();
                    Object[] objArr2 = {sessionId, new Long(j3)};
                    ChangeQuickRedirect changeQuickRedirect2 = HistoryController.a;
                    if (PatchProxy.isSupport(objArr2, historyController, changeQuickRedirect2, false, "d5ecd1f0b924a988341860c5d5c679ca", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, historyController, changeQuickRedirect2, false, "d5ecd1f0b924a988341860c5d5c679ca");
                    } else if (sessionId != null && i2 != 0) {
                        synchronized (historyController) {
                            if (!historyController.b.containsKey(sessionId)) {
                                set = new HashSet<>();
                                historyController.b.put(sessionId, set);
                            } else {
                                set = historyController.b.get(sessionId);
                            }
                            if (set != null) {
                                set.add(Long.valueOf(j3));
                            }
                        }
                    }
                }
                i = 0;
                e.a(sessionId, next.getMsgSeqid(), next.getMsgFlag(), j4, j5);
                com.sankuai.xm.im.utils.a.d("MessageProcessor::filterIMMessagesWithSeqId => discontinuity  uuid = " + next.getMsgUuid() + " MsgSeqId = " + next.getMsgSeqid() + " MsgFlag = " + next.getMsgFlag() + " targetSeqId = " + j4 + " targetFlag = " + j5 + ", targetMsgId = " + j3, new Object[0]);
            }
        }
        com.sankuai.xm.im.utils.a.b("MessageProcessor::filterIMMessagesWithSeqId => return size = " + linkedList.size(), new Object[i]);
        return linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        com.sankuai.xm.im.utils.a.b("MessageProcessor::filterMsgWithoutSeqId => find need deal message:" + r21.get(r3).keyParamToString(), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (r3 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        com.sankuai.xm.im.utils.a.b("MessageProcessor::filterMsgWithoutSeqId => all message seqid = 0", new java.lang.Object[0]);
        r1 = com.sankuai.xm.im.cache.DBProxy.l().k.a(r22, r21.get(0).getSts(), Long.MAX_VALUE, 1, (short) 1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
        if (com.sankuai.xm.base.util.b.a(r1) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
        com.sankuai.xm.im.utils.a.b("MessageProcessor::filterMsgWithoutSeqId => not found messageSecond info:" + r21.get(0).keyParamToString(), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
        return new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00da, code lost:
        r1 = r1.get(0);
        r3 = com.sankuai.xm.im.cache.DBProxy.l().k.a(r22, 0L, r21.get(0).getSts(), 1, (short) 0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0102, code lost:
        if (com.sankuai.xm.base.util.b.a(r3) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0104, code lost:
        com.sankuai.xm.im.utils.a.b("MessageProcessor::filterMsgWithoutSeqId => not found messageFirst info:" + r21.get(0).keyParamToString(), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0126, code lost:
        return new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0127, code lost:
        r3 = r3.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0141, code lost:
        if (com.sankuai.xm.im.utils.MessageUtils.isContinuityMsg(r3.getMsgSeqid(), r3.getMsgFlag(), r1.getMsgSeqid(), r1.getMsgFlag()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0143, code lost:
        return r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0144, code lost:
        com.sankuai.xm.im.utils.a.d("MessageProcessor::filterMsgWithoutSeqId => message not continuity messageSecond:" + r1.keyParamToString() + " messageFirst:" + r3.keyParamToString(), new java.lang.Object[0]);
        com.sankuai.xm.im.message.e.a(r22, r3.getMsgSeqid(), r3.getMsgFlag(), r1.getMsgSeqid(), r1.getMsgFlag());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0181, code lost:
        return new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0182, code lost:
        r1 = r21.get(r3 - 1);
        r4 = com.sankuai.xm.im.cache.DBProxy.l().k.a(r22, 0L, r1.getSts(), 1, (short) 0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a6, code lost:
        if (com.sankuai.xm.base.util.b.a(r4) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a8, code lost:
        com.sankuai.xm.im.utils.a.b("MessageProcessor::filterMsgWithoutSeqId => not found messageFirst info:" + r1.keyParamToString(), new java.lang.Object[0]);
        r1 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c4, code lost:
        if (r9 >= r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c6, code lost:
        r1.add(r21.get(r9));
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d0, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d1, code lost:
        r4 = r4.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01eb, code lost:
        if (com.sankuai.xm.im.utils.MessageUtils.isContinuityMsg(r4.getMsgSeqid(), r4.getMsgFlag(), r1.getMsgSeqid(), r1.getMsgFlag()) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ed, code lost:
        return r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ee, code lost:
        r5 = new java.util.ArrayList();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f4, code lost:
        if (r6 >= r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01f6, code lost:
        r5.add(r21.get(r6));
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0200, code lost:
        com.sankuai.xm.im.utils.a.d("MessageProcessor::filterMsgWithoutSeqId => return size = " + r5.size() + " message not continuity messageSecond:" + r1.keyParamToString() + " messageFirst:" + r4.keyParamToString(), new java.lang.Object[0]);
        com.sankuai.xm.im.message.e.a(r22, r4.getMsgSeqid(), r4.getMsgFlag(), r1.getMsgSeqid(), r1.getMsgFlag());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0244, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.sankuai.xm.im.message.bean.IMMessage> a(java.util.List<com.sankuai.xm.im.message.bean.IMMessage> r21, com.sankuai.xm.im.session.SessionId r22) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.d.a(java.util.List, com.sankuai.xm.im.session.SessionId):java.util.List");
    }

    public final void a(SessionId sessionId, final long j, final List<IMMessage> list) {
        Object[] objArr = {sessionId, new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c5cf771d387129f2bda66546908f05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c5cf771d387129f2bda66546908f05");
        } else if (sessionId == null || j <= 0 || com.sankuai.xm.base.util.b.a(list)) {
        } else {
            int i = (j > Long.MAX_VALUE ? 1 : (j == Long.MAX_VALUE ? 0 : -1));
            if (i == 0) {
                final IMMessage maxMsgSeqIdNormalMessage = MessageUtils.getMaxMsgSeqIdNormalMessage(list);
                if (maxMsgSeqIdNormalMessage == null) {
                    com.sankuai.xm.im.utils.a.b("MessageProcessor::processHistoryMsgFlagContinuity getMaxMsgSeqIdNormalMessage null", new Object[0]);
                    return;
                }
                com.sankuai.xm.im.utils.a.b("MessageProcessor::processHistoryMsgFlagContinuity updateMaxMsgSeqId msg:" + maxMsgSeqIdNormalMessage.toString(), new Object[0]);
                final com.sankuai.xm.im.session.c j2 = IMClient.a().j();
                Object[] objArr2 = {maxMsgSeqIdNormalMessage};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.session.c.a;
                if (PatchProxy.isSupport(objArr2, j2, changeQuickRedirect2, false, "017466369adc360f5866c6bc361f099d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, j2, changeQuickRedirect2, false, "017466369adc360f5866c6bc361f099d");
                } else if (maxMsgSeqIdNormalMessage != null && maxMsgSeqIdNormalMessage.getMsgSeqid() > 0) {
                    DBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.13
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1a7bab346d15e3e21002ac4ac646211e", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1a7bab346d15e3e21002ac4ac646211e");
                                return;
                            }
                            DBSession a2 = DBProxy.l().m.a(SessionId.a(maxMsgSeqIdNormalMessage).f());
                            if (a2 == null || a2.getMsgSeqid() == maxMsgSeqIdNormalMessage.getMsgSeqid()) {
                                return;
                            }
                            a2.setMsgSeqid(maxMsgSeqIdNormalMessage.getMsgSeqid());
                            DBProxy.l().m.a(a2, (Callback<DBSession>) null);
                        }
                    }), (Callback) null);
                }
            }
            if (i != 0) {
                a(sessionId.e, j, new Callback<IMMessage>() { // from class: com.sankuai.xm.im.message.d.19
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final /* synthetic */ void onSuccess(IMMessage iMMessage) {
                        IMMessage iMMessage2 = iMMessage;
                        Object[] objArr3 = {iMMessage2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "afe2afecc26d50f894b1a2b3b0703a22", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "afe2afecc26d50f894b1a2b3b0703a22");
                        } else if (iMMessage2 == null) {
                            com.sankuai.xm.im.utils.a.b("MessageProcessor::processHistoryMsgFlagContinuity not found msgQuery:" + j, new Object[0]);
                        } else {
                            DBMessage imMessageToDBMessage = MessageUtils.imMessageToDBMessage(iMMessage2);
                            DBMessage a2 = d.a(d.this, imMessageToDBMessage, list);
                            if (a2 == null || imMessageToDBMessage == null || MessageUtils.isContinuityMsg(a2.getMsgSeqid(), a2.getMsgFlag(), imMessageToDBMessage.getMsgSeqid(), imMessageToDBMessage.getMsgFlag())) {
                                long msgId = a2 == null ? 0L : a2.getMsgId();
                                com.sankuai.xm.im.utils.a.b("MessageProcessor::processHistoryMsgFlagContinuity msg is continuity msgQuery:" + j + " msgResponse:" + msgId, new Object[0]);
                                return;
                            }
                            com.sankuai.xm.im.utils.a.b("MessageProcessor::processHistoryMsgFlagContinuity set msg continuity update flag msgQuery:" + imMessageToDBMessage.toString() + " msgResponse:" + a2.toString(), new Object[0]);
                            imMessageToDBMessage.setMsgFlag(1L);
                            a2.setMsgFlag(1L);
                            DBProxy.l().k.a(imMessageToDBMessage, new String[]{"flag"});
                            DBProxy.l().k.a(a2, new String[]{"flag"});
                        }
                    }

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final void onFailure(int i2, String str) {
                        Object[] objArr3 = {Integer.valueOf(i2), str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d6da55b2b03df3512e4246b1d433ad89", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d6da55b2b03df3512e4246b1d433ad89");
                        } else {
                            com.sankuai.xm.im.utils.a.d("MessageProcessor::processHistoryMsgFlagContinuity error", new Object[0]);
                        }
                    }
                });
            }
        }
    }

    boolean a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a1fc021eb4e1dfa10fe4810734d26ec", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a1fc021eb4e1dfa10fe4810734d26ec")).booleanValue();
        }
        if (MessageUtils.isIMPeerService(i) || MessageUtils.isGroupService(i)) {
            return ((com.sankuai.xm.im.message.syncread.b) j().a()).a(1, j);
        }
        if (MessageUtils.isPubService(i)) {
            return ((com.sankuai.xm.im.message.syncread.b) j().a()).a(2, j);
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public IMMessage b;
        public IMClient.SendMessageCallback c;

        public c(IMMessage iMMessage, IMClient.SendMessageCallback sendMessageCallback) {
            Object[] objArr = {iMMessage, sendMessageCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "495a683b22f1bd6193a2aeb312a22023", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "495a683b22f1bd6193a2aeb312a22023");
                return;
            }
            this.b = iMMessage;
            this.c = sendMessageCallback;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class b implements Runnable {
        public static ChangeQuickRedirect a;
        private List<IMMessage> c;
        private com.sankuai.xm.base.trace.f d;
        private com.sankuai.xm.base.trace.g e;

        public b(IMMessage iMMessage) {
            Object[] objArr = {d.this, iMMessage};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c6a99d49433fdb520c11b6ad183824", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c6a99d49433fdb520c11b6ad183824");
                return;
            }
            this.c = new ArrayList();
            this.d = new com.sankuai.xm.base.trace.f();
            a(iMMessage);
            this.e = j.a();
        }

        public final boolean a(IMMessage iMMessage) {
            Object[] objArr = {iMMessage};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62a47b521fe3e005c17357812b70b30c", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62a47b521fe3e005c17357812b70b30c")).booleanValue();
            }
            if (iMMessage == null) {
                return false;
            }
            synchronized (d.this.b) {
                if (this.c.size() > 100) {
                    return true;
                }
                this.c.add(iMMessage);
                this.d.a();
                return false;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            List<IMMessage> list;
            ArrayList arrayList;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6da670c0e6802d55a5653f70e719885a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6da670c0e6802d55a5653f70e719885a");
                return;
            }
            try {
                j.a(this.e);
                this.d.b();
                synchronized (d.this.b) {
                    com.sankuai.xm.im.utils.a.b("MessageProcessor::ReceiveMessageCollectionTask, collection: " + this.c.size(), new Object[0]);
                    list = null;
                    if (this.c.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(this.c);
                        this.c.clear();
                    }
                    d.a(d.this, (b) null);
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    MessageUtils.checkAndSupplyChannel(arrayList, (short) -1);
                    list = d.this.a((List<IMMessage>) arrayList, 0);
                }
                if (!com.sankuai.xm.base.util.b.a(list)) {
                    d.this.a(list, false);
                }
                this.d.c();
                j.c(this.e);
            } catch (Throwable th) {
                j.a(this.e, th);
                throw th;
            }
        }
    }

    public final void a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a193bc1618754c17cbb46f1997b4c03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a193bc1618754c17cbb46f1997b4c03");
            return;
        }
        Object[] objArr2 = {this, iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.imbase.monitor.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9b69b2ccabf7597816f19c86a3c225c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9b69b2ccabf7597816f19c86a3c225c6");
        } else {
            com.sankuai.waimai.imbase.monitor.a.a(iMMessage, false, 2);
        }
        synchronized (this.b) {
            if (this.q == null) {
                this.q = new b(iMMessage);
                com.sankuai.xm.threadpool.scheduler.a.b().a(11, this.q, 0L);
            } else if (this.q.a(iMMessage)) {
                this.q = new b(iMMessage);
                com.sankuai.xm.threadpool.scheduler.a.b().a(11, this.q, 0L);
            }
        }
    }

    private boolean b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a946b71b59513f32a5a31fbb7942c80b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a946b71b59513f32a5a31fbb7942c80b")).booleanValue() : this.r != 0 && j < this.r + 100 && j > this.r - 100;
    }
}
