package com.sankuai.xm.im.message.opposite;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.v4.util.LruCache;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.c;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.network.httpurlconnection.g;
import com.sankuai.xm.network.setting.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class OppositeController extends com.sankuai.xm.im.message.opposite.a {
    public static ChangeQuickRedirect b;
    public e c;
    public d d;
    private List<Long> e;
    private HashMap<Short, b> f;
    private volatile boolean g;
    private final LruCache<SessionId, Set<Long>> h;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes6.dex */
    public interface OnOppositeChangeListener {
        void onOppositeChanged(List<Long> list, List<Long> list2);

        void onOppositeConfigChanged();
    }

    public static /* synthetic */ void a(OppositeController oppositeController, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, oppositeController, changeQuickRedirect, false, "e0c472df60475b2230129899b74c4b5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, oppositeController, changeQuickRedirect, false, "e0c472df60475b2230129899b74c4b5c");
        } else {
            com.sankuai.xm.base.e.a().edit().putString(oppositeController.j(), str).apply();
        }
    }

    public static /* synthetic */ void a(OppositeController oppositeController, short s, List list, List list2, List list3, List list4) {
        Object[] objArr = {Short.valueOf(s), list, list2, list3, list4};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, oppositeController, changeQuickRedirect, false, "c1a3e534814f92a564e3a36ceb261cfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, oppositeController, changeQuickRedirect, false, "c1a3e534814f92a564e3a36ceb261cfe");
        } else if (oppositeController.a(s)) {
            ArrayList arrayList = new ArrayList();
            if (list3 != null) {
                arrayList.addAll(list3);
            }
            if (list4 != null) {
                arrayList.addAll(list4);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Long l = (Long) it.next();
                if (!arrayList.contains(l)) {
                    arrayList2.add(l);
                }
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Long l2 = (Long) it2.next();
                if (!arrayList.contains(l2)) {
                    arrayList2.add(l2);
                }
            }
            arrayList.removeAll(oppositeController.e);
            arrayList2.removeAll(oppositeController.e);
            DBProxy.l().k.b(arrayList, 0);
            DBProxy.l().k.b(arrayList2, 1);
            oppositeController.a(s, arrayList, arrayList2);
        }
    }

    public static /* synthetic */ void e(OppositeController oppositeController) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, oppositeController, changeQuickRedirect, false, "d8461784308987ebe8141f73920e6dd6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, oppositeController, changeQuickRedirect, false, "d8461784308987ebe8141f73920e6dd6");
        } else {
            ((l) m.a(l.class)).b(OnOppositeChangeListener.class).b().a(new b.a<OnOppositeChangeListener>() { // from class: com.sankuai.xm.im.message.opposite.OppositeController.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(OnOppositeChangeListener onOppositeChangeListener) {
                    OnOppositeChangeListener onOppositeChangeListener2 = onOppositeChangeListener;
                    Object[] objArr2 = {onOppositeChangeListener2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0342c4b591bfc764f6b55ac4310ff6c2", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0342c4b591bfc764f6b55ac4310ff6c2")).booleanValue();
                    }
                    onOppositeChangeListener2.onOppositeConfigChanged();
                    return false;
                }
            });
        }
    }

    public OppositeController() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7cbedfe2000b95eb28d7f598ef80aab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7cbedfe2000b95eb28d7f598ef80aab");
            return;
        }
        this.e = com.sankuai.xm.base.util.b.a(0L);
        this.h = new LruCache<>(500);
        this.f = new HashMap<>();
        this.c = new e();
        this.d = new d();
        this.g = false;
    }

    public final synchronized boolean a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efbf280f274ef9ce71828444b77bc9e5", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efbf280f274ef9ce71828444b77bc9e5")).booleanValue();
        }
        b bVar = this.f.get(Short.valueOf(s));
        return bVar != null && bVar.c;
    }

    private synchronized long b(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c6d8b7d2893019c28b1ca817f6ea23", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c6d8b7d2893019c28b1ca817f6ea23")).longValue();
        }
        b bVar = this.f.get(Short.valueOf(s));
        if (bVar == null) {
            return 0L;
        }
        return bVar.b;
    }

    private synchronized HashMap<Short, b> h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfeed9732922bcbb3b832e547c365031", 6917529027641081856L)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfeed9732922bcbb3b832e547c365031");
        }
        HashMap<Short, b> hashMap = new HashMap<>();
        hashMap.putAll(this.f);
        return hashMap;
    }

    @Trace(name = "notify_opposite", type = i.end)
    public void a(short s, final List<Long> list, final List<Long> list2) {
        Object[] objArr = {Short.valueOf(s), list, list2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fc234e5dd978478e98cefee0b138f75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fc234e5dd978478e98cefee0b138f75");
            return;
        }
        try {
            j.a(i.end, "notify_opposite", new String[]{"opposite_msg"}, new Object[]{new Short(s), list, list2});
            if (!a(s)) {
                com.sankuai.xm.im.utils.a.d("OppositeController::notifyReceiveOppositeInfo opposite not open", new Object[0]);
                j.a((Object) null);
                return;
            }
            ((l) m.a(l.class)).b(OnOppositeChangeListener.class).a(s).a(new b.a<OnOppositeChangeListener>() { // from class: com.sankuai.xm.im.message.opposite.OppositeController.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(OnOppositeChangeListener onOppositeChangeListener) {
                    OnOppositeChangeListener onOppositeChangeListener2 = onOppositeChangeListener;
                    Object[] objArr2 = {onOppositeChangeListener2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef6d667fe50c592ef88122553f92292d", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef6d667fe50c592ef88122553f92292d")).booleanValue();
                    }
                    onOppositeChangeListener2.onOppositeChanged(list, list2);
                    return false;
                }
            });
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    public final void a(SessionId sessionId, List<Long> list) {
        Object[] objArr = {sessionId, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16eaa82216f8521f98095cd2f4682a7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16eaa82216f8521f98095cd2f4682a7f");
        } else if (sessionId == null || !sessionId.i() || com.sankuai.xm.base.util.b.a(list) || IMClient.a().k() <= 0) {
            com.sankuai.xm.im.utils.a.c("OppositeController::sendOpposite param error", new Object[0]);
        } else if (!a(sessionId.g)) {
            com.sankuai.xm.im.utils.a.c("OppositeController::sendOpposite opposite func not open, channel = %d", Short.valueOf(sessionId.g));
        } else {
            List<Long> b2 = this.c.b(sessionId, list);
            DBProxy.l().k.b(b2, 2);
            this.c.a(sessionId, b2);
        }
    }

    @Trace(name = "handle_opposite", type = i.normal)
    public void a(final Collection<Long> collection, final SessionId sessionId) {
        Object[] objArr = {collection, sessionId};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcd2a443205accb83fc895367d32f432", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcd2a443205accb83fc895367d32f432");
            return;
        }
        try {
            j.a(i.normal, "handle_opposite", new String[]{"opposite_msg"}, new Object[]{collection, sessionId});
            DBProxy.l().k.a(collection, 1, new Callback<Set<Long>>() { // from class: com.sankuai.xm.im.message.opposite.OppositeController.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Set<Long> set) {
                    Set<Long> set2 = set;
                    Object[] objArr2 = {set2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e24e2947ce1a9d8ac9a67ca8c47b795a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e24e2947ce1a9d8ac9a67ca8c47b795a");
                    } else if (com.sankuai.xm.base.util.b.a(collection) || com.sankuai.xm.base.util.b.b(set2) == com.sankuai.xm.base.util.b.b(collection)) {
                    } else {
                        HashSet hashSet = new HashSet(collection);
                        if (!com.sankuai.xm.base.util.b.a(set2)) {
                            hashSet.removeAll(set2);
                        }
                        com.sankuai.xm.im.utils.a.b("OppositeController::dealOppositeStatus:: failed msg list = " + hashSet + ", cache: " + OppositeController.this.h.size(), new Object[0]);
                        Set set3 = (Set) OppositeController.this.h.get(sessionId);
                        if (set3 == null) {
                            set3 = new HashSet();
                            OppositeController.this.h.put(sessionId, set3);
                        }
                        set3.addAll(hashSet);
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(@TraceStatus int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c87d670153b7aa0ecb9035af5027655e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c87d670153b7aa0ecb9035af5027655e");
                        return;
                    }
                    j.a(new Integer(i), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
                    com.sankuai.xm.im.utils.a.d("OppositeController::dealOppositeStatus::onFailure,%d %s", Integer.valueOf(i), str);
                }
            });
            a(sessionId.g, new ArrayList(), new ArrayList(collection));
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    @Override // com.sankuai.xm.im.message.opposite.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21fe21e4b1288d9eca54b5cea05c9336", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21fe21e4b1288d9eca54b5cea05c9336");
            return;
        }
        this.h.evictAll();
        super.a();
    }

    public final void a(List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2f77440e985db6970bc80e7a1ee112b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2f77440e985db6970bc80e7a1ee112b");
        } else if (list != null && list.size() > 0) {
            long a2 = com.sankuai.xm.login.c.a().a(System.currentTimeMillis());
            for (IMMessage iMMessage : list) {
                if (MessageUtils.isIMPeerService(iMMessage.getCategory()) && a(iMMessage.getChannel()) && iMMessage.getSts() < a2 - b(iMMessage.getChannel())) {
                    iMMessage.setMsgOppositeStatus(1);
                }
            }
        }
    }

    public String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c11f0ce7afbeb7e75d7fc3488c57f1b2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c11f0ce7afbeb7e75d7fc3488c57f1b2");
        }
        return "opposite_config_last_request_time_" + f.a().e();
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fef043c3ab80498318e24a3deb0a6b33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fef043c3ab80498318e24a3deb0a6b33");
        } else {
            com.sankuai.xm.base.e.a().edit().putLong(c(), System.currentTimeMillis()).apply();
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53808b505503473588884e2781898993", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53808b505503473588884e2781898993");
            return;
        }
        HashMap<Short, b> h = h();
        for (Short sh : h.keySet()) {
            short shortValue = sh.shortValue();
            b bVar = h.get(Short.valueOf(shortValue));
            if (bVar.c) {
                DBProxy.l().k.a(shortValue, Long.valueOf(com.sankuai.xm.login.c.a().a(System.currentTimeMillis()) - bVar.b));
            }
        }
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd68f34190d77b04be3830c1f049e2a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd68f34190d77b04be3830c1f049e2a2");
            return;
        }
        HashMap<Short, b> h = h();
        for (Short sh : h.keySet()) {
            short shortValue = sh.shortValue();
            b bVar = h.get(Short.valueOf(shortValue));
            if (bVar.c) {
                DBProxy.l().k.a(shortValue, Long.valueOf(bVar.b), 1000, 2, new Callback<List<DBMessage>>() { // from class: com.sankuai.xm.im.message.opposite.OppositeController.4
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final /* synthetic */ void onSuccess(List<DBMessage> list) {
                        List<DBMessage> list2 = list;
                        Object[] objArr2 = {list2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06d150617e1dab06a3b2a3411d6a4652", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06d150617e1dab06a3b2a3411d6a4652");
                        } else if (list2 != null && list2.size() > 0) {
                            for (DBMessage dBMessage : list2) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(Long.valueOf(dBMessage.getMsgId()));
                                OppositeController.this.a(SessionId.a(dBMessage), arrayList);
                            }
                        }
                    }

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final void onFailure(int i, String str) {
                        Object[] objArr2 = {Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca78de0a50b255433b580221d2f31d38", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca78de0a50b255433b580221d2f31d38");
                        } else {
                            com.sankuai.xm.im.utils.a.d("OppositeController::resendLocalData::queryOppositeMsg error code:%d message:%s", Integer.valueOf(i), str);
                        }
                    }
                });
            }
        }
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bf2b8c0bbbcb491d1a0c0d4ddba010b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bf2b8c0bbbcb491d1a0c0d4ddba010b");
        } else if (com.sankuai.xm.im.c.a(c.b.PEER_CHAT)) {
            try {
                if (this.g) {
                    return;
                }
                i();
                this.g = true;
            } catch (Exception e2) {
                com.sankuai.xm.im.utils.a.a(e2, "OppositeController::loadOppositeConfig", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "097b22d56019c6c6f97abd5936785027", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "097b22d56019c6c6f97abd5936785027");
            return;
        }
        try {
            synchronized (this) {
                this.f.clear();
                if (TextUtils.isEmpty(k())) {
                    return;
                }
                JSONArray jSONArray = new JSONArray(k());
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject.optInt("svid") == 401) {
                        short optInt = (short) jSONObject.optInt("channel", -888);
                        if (!this.f.containsKey(Short.valueOf(optInt))) {
                            bVar = new b();
                            this.f.put(Short.valueOf(optInt), bVar);
                        } else {
                            bVar = this.f.get(Short.valueOf(optInt));
                        }
                        long optLong = jSONObject.optLong(RemoteMessageConst.TTL);
                        Object[] objArr2 = {new Long(optLong)};
                        ChangeQuickRedirect changeQuickRedirect2 = b.a;
                        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "07a95a8e38ccef76d0ed5c593e0f346f", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "07a95a8e38ccef76d0ed5c593e0f346f");
                        } else if (optLong > 0) {
                            bVar.b = optLong;
                        }
                        boolean z = true;
                        if (jSONObject.optInt("isopen") != 1) {
                            z = false;
                        }
                        bVar.c = z;
                    }
                }
            }
        } catch (Exception e2) {
            com.sankuai.xm.im.utils.a.a(e2, "OppositeController::loadConfigData", new Object[0]);
        }
    }

    private String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5922c9d7b4873284a75c45c99b76cfae", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5922c9d7b4873284a75c45c99b76cfae");
        }
        return "opposite_config_key_im_" + f.a().e();
    }

    private String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "465d3ea86b564aff9d34f93156bc93a6", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "465d3ea86b564aff9d34f93156bc93a6") : com.sankuai.xm.base.e.a().getString(j(), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.xm.im.message.opposite.a
    public final void a(List<IMMessage> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcf1711980dce08510b8d0bb9d3c3e4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcf1711980dce08510b8d0bb9d3c3e4b");
        } else if (!com.sankuai.xm.base.util.b.a(list) && !z && this.h.size() != 0) {
            HashMap hashMap = new HashMap();
            com.sankuai.xm.im.utils.a.b("OppositeController::onReceiveMessages:: deal for the delay messages, cache: " + this.h.size(), new Object[0]);
            for (IMMessage iMMessage : list) {
                if (iMMessage.getMsgId() != 0 && iMMessage.getDirection() == 1 && MessageUtils.isIMPeerService(iMMessage.getCategory())) {
                    SessionId a2 = SessionId.a(iMMessage);
                    Set set = (Set) hashMap.get(a2);
                    if (set == null) {
                        set = new HashSet();
                        hashMap.put(a2, set);
                    }
                    set.add(Long.valueOf(iMMessage.getMsgId()));
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                Collection collection = (Collection) this.h.get(entry.getKey());
                if (collection != null) {
                    collection.removeAll((Collection) entry.getValue());
                    if (com.sankuai.xm.base.util.b.a(collection)) {
                        this.h.remove(entry.getKey());
                    }
                    com.sankuai.xm.im.utils.a.b("OppositeController::onReceiveMessages:: msgIds: " + entry.getValue() + ", sid: entry.getKey()", new Object[0]);
                    a((Collection) entry.getValue(), (SessionId) entry.getKey());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class c extends com.sankuai.xm.network.httpurlconnection.d {
        public static ChangeQuickRedirect a;
        private SessionId c;
        private List<Long> d;
        private List<Long> e;

        public c(SessionId sessionId, @NonNull List<Long> list, @NonNull List<Long> list2) {
            Object[] objArr = {OppositeController.this, sessionId, list, list2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2691686575dbbd7995537833008b3959", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2691686575dbbd7995537833008b3959");
                return;
            }
            this.c = sessionId;
            this.d = list;
            this.e = list2;
        }

        @Override // com.sankuai.xm.network.httpurlconnection.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e61fc27aeffe4a8556aa45b194de2d3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e61fc27aeffe4a8556aa45b194de2d3");
            } else {
                super.a();
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            JSONArray jSONArray;
            JSONArray jSONArray2;
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fca6fc69a08cd4de64e684e14e9f9adc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fca6fc69a08cd4de64e684e14e9f9adc");
                return;
            }
            try {
                OppositeController.this.d.a(true, this.c, this.d, this.e);
                JSONObject g = new com.sankuai.xm.base.util.net.c(jSONObject).g("data");
                try {
                    jSONArray = g.getJSONArray("oppounread");
                } catch (Exception e) {
                    com.sankuai.xm.im.utils.a.a(e);
                    jSONArray = null;
                }
                try {
                    jSONArray2 = g.getJSONArray("selfunread");
                } catch (Exception e2) {
                    com.sankuai.xm.im.utils.a.a(e2);
                    jSONArray2 = null;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                    }
                }
                if (jSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        arrayList2.add(Long.valueOf(jSONArray2.getLong(i2)));
                    }
                }
                OppositeController.a(OppositeController.this, this.c.g, this.d, this.e, arrayList, arrayList2);
            } catch (Exception e3) {
                com.sankuai.xm.im.utils.a.a(e3);
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d468a4d47540ec40f1577825e84fdc6a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d468a4d47540ec40f1577825e84fdc6a");
                return;
            }
            com.sankuai.xm.im.utils.a.d("OppositeUnreadCallback::onFailure query unread fail code:%d message:%s", Integer.valueOf(i), str);
            OppositeController.this.d.a(false, this.c, this.d, this.e);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends com.sankuai.xm.network.httpurlconnection.d {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.sankuai.xm.network.httpurlconnection.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a38baeb4d396fbe3157d6c3a3140590", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a38baeb4d396fbe3157d6c3a3140590");
            } else {
                super.a();
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc671e9ca9d8cb86405bef8ba5574ea2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc671e9ca9d8cb86405bef8ba5574ea2");
                return;
            }
            try {
                com.sankuai.xm.im.utils.a.b("OppositeConfigCallback::onSuccess %s", jSONObject.toString());
                JSONArray f = new com.sankuai.xm.base.util.net.c(jSONObject).f("data");
                OppositeController.this.d();
                OppositeController.a(OppositeController.this, f.toString());
                OppositeController.this.i();
                OppositeController.e(OppositeController.this);
            } catch (Exception e) {
                com.sankuai.xm.im.utils.a.a(e);
            }
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2352b369e7e53ae44b5716791823bb67", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2352b369e7e53ae44b5716791823bb67");
            } else {
                com.sankuai.xm.im.utils.a.d("OppositeConfigCallback::onFailure query config fail code:%d message:%s", Integer.valueOf(i), str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class b {
        public static ChangeQuickRedirect a;
        long b;
        boolean c;

        private b() {
            Object[] objArr = {OppositeController.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c948c01079db2c64d0f3a9a789fbd92f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c948c01079db2c64d0f3a9a789fbd92f");
                return;
            }
            this.b = 604800000L;
            this.c = false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class e extends com.sankuai.xm.im.message.opposite.util.a<Long> {
        public static ChangeQuickRedirect a;
        private List<a> d;

        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public class a {
            public String a;
            public SessionId b;
            public List<Long> c;

            private a() {
                this.a = "";
                this.b = null;
                this.c = new ArrayList();
            }
        }

        public e() {
            super(300L);
            Object[] objArr = {OppositeController.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f536e182a1c7296c1c177b57d73fbbec", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f536e182a1c7296c1c177b57d73fbbec");
            } else {
                this.d = new ArrayList();
            }
        }

        public final synchronized short a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6723ffcbdf18a8681b4328a53b587bf", 6917529027641081856L)) {
                return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6723ffcbdf18a8681b4328a53b587bf")).shortValue();
            }
            short s = -888;
            Iterator<a> it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a next = it.next();
                if (TextUtils.equals(str, next.a)) {
                    s = next.b.g;
                    break;
                }
            }
            return s;
        }

        public final synchronized List<Long> b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2effe46db00401ff355f4c876f0305df", 6917529027641081856L)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2effe46db00401ff355f4c876f0305df");
            }
            ArrayList arrayList = new ArrayList();
            Iterator<a> it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a next = it.next();
                if (TextUtils.equals(str, next.a)) {
                    arrayList.addAll(next.c);
                    this.d.remove(next);
                    break;
                }
            }
            return arrayList;
        }

        @Override // com.sankuai.xm.im.message.opposite.util.a
        public final void a(Map<SessionId, List<Long>> map) {
            List<a> list;
            Map<SessionId, List<Long>> map2 = map;
            int i = 0;
            Object[] objArr = {map2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06391e6e8555c19f171be5d50472f2e2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06391e6e8555c19f171be5d50472f2e2");
                return;
            }
            Object[] objArr2 = {map2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc1c18e5ea7c96fa66fe275973e965d2", 6917529027641081856L)) {
                list = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc1c18e5ea7c96fa66fe275973e965d2");
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<SessionId> it = map.keySet().iterator();
                while (it.hasNext()) {
                    SessionId next = it.next();
                    List<Long> list2 = map2.get(next);
                    if (list2 != null && list2.size() > 0) {
                        int i2 = 0;
                        while (i2 < list2.size()) {
                            ArrayList arrayList2 = new ArrayList();
                            int i3 = i2;
                            while (i3 < list2.size() && arrayList2.size() < 50) {
                                arrayList2.add(list2.get(i3));
                                i3++;
                            }
                            a aVar = new a();
                            aVar.b = next;
                            Object[] objArr3 = new Object[i];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            Iterator<SessionId> it2 = it;
                            aVar.a = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ba4a1277ae47d470bc992d6729848946", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ba4a1277ae47d470bc992d6729848946") : UUID.randomUUID().toString();
                            aVar.c.addAll(arrayList2);
                            this.d.add(aVar);
                            arrayList.add(aVar);
                            i2 = i3;
                            it = it2;
                            i = 0;
                        }
                    }
                    map2 = map;
                }
                map.clear();
                list = arrayList;
            }
            a(list);
        }

        @Trace(name = "send_opposite", type = i.send)
        private void a(List<a> list) {
            byte[] bS_;
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "295502e457b3557cb710fad8cf1a1365", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "295502e457b3557cb710fad8cf1a1365");
                return;
            }
            try {
                j.a(i.send, "send_opposite", (String[]) null, new Object[]{list});
                if (list != null && list.size() > 0) {
                    for (a aVar : list) {
                        if (aVar.c.size() > 0 && !TextUtils.isEmpty(aVar.a)) {
                            if (aVar.b.e == 1) {
                                com.sankuai.xm.base.proto.opposite.e eVar = new com.sankuai.xm.base.proto.opposite.e();
                                eVar.a(IMClient.a().k());
                                eVar.a(aVar.a);
                                eVar.a((byte) 1);
                                eVar.c(com.sankuai.xm.login.a.a().m());
                                com.sankuai.xm.base.proto.opposite.f fVar = new com.sankuai.xm.base.proto.opposite.f();
                                fVar.a(aVar.b.b);
                                fVar.a((byte) aVar.b.e);
                                fVar.a(aVar.b.d);
                                fVar.b(aVar.b.g);
                                long[] jArr = new long[aVar.c.size()];
                                for (int i = 0; i < aVar.c.size(); i++) {
                                    jArr[i] = aVar.c.get(i).longValue();
                                }
                                fVar.a(jArr);
                                fVar.b(aVar.b.g);
                                fVar.c(com.sankuai.xm.login.a.a().m());
                                eVar.a(new byte[][]{fVar.bS_()});
                                com.sankuai.xm.im.utils.a.b("SendOppositeCache::sendProtocolData %s", fVar.toString());
                                bS_ = eVar.bS_();
                            } else {
                                com.sankuai.xm.base.proto.opposite.v2.a aVar2 = new com.sankuai.xm.base.proto.opposite.v2.a();
                                aVar2.a(IMClient.a().k());
                                aVar2.a(aVar.a);
                                aVar2.a((byte) 1);
                                aVar2.c(com.sankuai.xm.login.a.a().m());
                                com.sankuai.xm.base.proto.opposite.v2.b bVar = new com.sankuai.xm.base.proto.opposite.v2.b();
                                bVar.a(aVar.b.b);
                                bVar.a((byte) aVar.b.e);
                                bVar.a(aVar.b.d);
                                bVar.b(aVar.b.g);
                                bVar.a(aVar.b.g());
                                long[] jArr2 = new long[aVar.c.size()];
                                for (int i2 = 0; i2 < aVar.c.size(); i2++) {
                                    jArr2[i2] = aVar.c.get(i2).longValue();
                                }
                                bVar.a(jArr2);
                                bVar.b(aVar.b.g);
                                bVar.c(com.sankuai.xm.login.a.a().m());
                                aVar2.a(new byte[][]{bVar.bS_()});
                                com.sankuai.xm.im.utils.a.b("SendOppositeCache::sendProtocolData %s", bVar.toString());
                                bS_ = aVar2.bS_();
                            }
                            if (bS_ != null) {
                                com.sankuai.xm.im.connection.c.a((short) 401, bS_);
                            }
                        }
                    }
                    j.a((Object) null);
                    return;
                }
                com.sankuai.xm.im.utils.a.d("OppositeController::sendProtocolData, list empty", new Object[0]);
                j.a((Object) null);
            } catch (Throwable th) {
                j.a(th);
                throw th;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class d {
        public static ChangeQuickRedirect a;
        private HashMap<SessionId, a> c;
        private volatile boolean d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public class a {
            public List<Long> a;
            public List<Long> b;

            private a() {
                this.a = new ArrayList();
                this.b = new ArrayList();
            }
        }

        public d() {
            Object[] objArr = {OppositeController.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1429a6e750204fec5738e213444670f9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1429a6e750204fec5738e213444670f9");
                return;
            }
            this.d = false;
            this.c = new HashMap<>();
        }

        public synchronized void a(SessionId sessionId, List<Long> list, List<Long> list2) {
            a aVar;
            Object[] objArr = {sessionId, list, list2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "868f6424dd752375519b1495c4c6fd73", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "868f6424dd752375519b1495c4c6fd73");
            } else if (sessionId != null) {
                if (this.c.containsKey(sessionId)) {
                    aVar = this.c.get(sessionId);
                } else {
                    a aVar2 = new a();
                    this.c.put(sessionId, aVar2);
                    aVar = aVar2;
                }
                if (!com.sankuai.xm.base.util.b.a(list)) {
                    for (Long l : list) {
                        if (l.longValue() != 0 && !aVar.a.contains(l)) {
                            aVar.a.add(l);
                        }
                    }
                }
                if (!com.sankuai.xm.base.util.b.a(list2)) {
                    for (Long l2 : list2) {
                        if (l2.longValue() != 0 && !aVar.b.contains(l2)) {
                            aVar.b.add(l2);
                        }
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: Exception -> 0x009b, all -> 0x00a2, TryCatch #1 {Exception -> 0x009b, blocks: (B:9:0x0023, B:10:0x002d, B:12:0x0033, B:14:0x0047, B:16:0x004f, B:18:0x0059, B:22:0x006a, B:21:0x0064, B:23:0x0073, B:25:0x007b, B:29:0x008a, B:28:0x0084, B:30:0x0093), top: B:42:0x0023, outer: #0 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private synchronized com.sankuai.xm.im.session.SessionId a(java.util.List<java.lang.Long> r12, java.util.List<java.lang.Long> r13) {
            /*
                r11 = this;
                monitor-enter(r11)
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> La2
                r8 = 0
                r0[r8] = r12     // Catch: java.lang.Throwable -> La2
                r1 = 1
                r0[r1] = r13     // Catch: java.lang.Throwable -> La2
                com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.im.message.opposite.OppositeController.d.a     // Catch: java.lang.Throwable -> La2
                java.lang.String r10 = "766224e5bef137dfe11f6dba8e028a5b"
                r4 = 0
                r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                r1 = r0
                r2 = r11
                r3 = r9
                r5 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La2
                if (r1 == 0) goto L23
                java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)     // Catch: java.lang.Throwable -> La2
                com.sankuai.xm.im.session.SessionId r12 = (com.sankuai.xm.im.session.SessionId) r12     // Catch: java.lang.Throwable -> La2
                monitor-exit(r11)
                return r12
            L23:
                java.util.HashMap<com.sankuai.xm.im.session.SessionId, com.sankuai.xm.im.message.opposite.OppositeController$d$a> r0 = r11.c     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
            L2d:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                if (r1 == 0) goto L9f
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                com.sankuai.xm.im.message.opposite.OppositeController$d$a r2 = (com.sankuai.xm.im.message.opposite.OppositeController.d.a) r2     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                java.util.List<java.lang.Long> r3 = r2.a     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                int r3 = r3.size()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                if (r3 > 0) goto L4f
                java.util.List<java.lang.Long> r3 = r2.b     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                int r3 = r3.size()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                if (r3 <= 0) goto L2d
            L4f:
                java.util.List<java.lang.Long> r0 = r2.a     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                boolean r0 = com.sankuai.xm.base.util.b.a(r0)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                r3 = 30
                if (r0 != 0) goto L73
                java.util.List<java.lang.Long> r0 = r2.a     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                int r0 = r0.size()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                if (r0 <= r3) goto L64
                r0 = 30
                goto L6a
            L64:
                java.util.List<java.lang.Long> r0 = r2.a     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                int r0 = r0.size()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
            L6a:
                java.util.List<java.lang.Long> r4 = r2.a     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                java.util.List r0 = r4.subList(r8, r0)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                r12.addAll(r0)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
            L73:
                java.util.List<java.lang.Long> r12 = r2.b     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                boolean r12 = com.sankuai.xm.base.util.b.a(r12)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                if (r12 != 0) goto L93
                java.util.List<java.lang.Long> r12 = r2.b     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                int r12 = r12.size()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                if (r12 <= r3) goto L84
                goto L8a
            L84:
                java.util.List<java.lang.Long> r12 = r2.b     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                int r3 = r12.size()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
            L8a:
                java.util.List<java.lang.Long> r12 = r2.b     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                java.util.List r12 = r12.subList(r8, r3)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                r13.addAll(r12)     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
            L93:
                java.lang.Object r12 = r1.getKey()     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                com.sankuai.xm.im.session.SessionId r12 = (com.sankuai.xm.im.session.SessionId) r12     // Catch: java.lang.Exception -> L9b java.lang.Throwable -> La2
                monitor-exit(r11)
                return r12
            L9b:
                r12 = move-exception
                com.sankuai.xm.im.utils.a.a(r12)     // Catch: java.lang.Throwable -> La2
            L9f:
                r12 = 0
                monitor-exit(r11)
                return r12
            La2:
                r12 = move-exception
                monitor-exit(r11)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.opposite.OppositeController.d.a(java.util.List, java.util.List):com.sankuai.xm.im.session.SessionId");
        }

        private synchronized void b(SessionId sessionId, List<Long> list, List<Long> list2) {
            Object[] objArr = {sessionId, list, list2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e8da1c5003d31e7643e54401ca943ef", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e8da1c5003d31e7643e54401ca943ef");
                return;
            }
            a aVar = this.c.get(sessionId);
            if (aVar == null) {
                return;
            }
            if (!com.sankuai.xm.base.util.b.a(list)) {
                aVar.a.removeAll(list);
            }
            if (!com.sankuai.xm.base.util.b.a(list2)) {
                aVar.b.removeAll(list2);
            }
        }

        private synchronized void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6710cc0161b06c1340076f6c6a3e344", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6710cc0161b06c1340076f6c6a3e344");
            } else {
                this.c.clear();
            }
        }

        public void a() {
            ArrayList<Long> arrayList;
            ArrayList<Long> arrayList2;
            SessionId a2;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "962d55e08adc352a90caa724bd368aa4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "962d55e08adc352a90caa724bd368aa4");
            } else if (!this.d && (a2 = a((arrayList = new ArrayList()), (arrayList2 = new ArrayList()))) != null) {
                if (arrayList.size() > 0 || arrayList2.size() > 0) {
                    String a3 = com.sankuai.xm.im.http.a.a("/msg/api/read/v1/opposite/im/unread/bothchats");
                    HashMap hashMap = new HashMap();
                    hashMap.put("buddy", Long.valueOf(a2.b));
                    hashMap.put("svid", (short) 401);
                    hashMap.put("channel", Short.valueOf(a2.g));
                    hashMap.put(Message.SID, a2.g());
                    JSONArray jSONArray = new JSONArray();
                    for (Long l : arrayList) {
                        jSONArray.put(l);
                    }
                    hashMap.put("smsgids", jSONArray);
                    JSONArray jSONArray2 = new JSONArray();
                    for (Long l2 : arrayList2) {
                        jSONArray2.put(l2);
                    }
                    hashMap.put("bmsgids", jSONArray2);
                    com.sankuai.xm.base.d dVar = new com.sankuai.xm.base.d(a3, hashMap, new c(a2, arrayList, arrayList2));
                    dVar.a(new com.sankuai.xm.network.httpurlconnection.retry.a());
                    g.a().a((com.sankuai.xm.network.httpurlconnection.e) dVar, 0L);
                    this.d = true;
                }
            }
        }

        public final void a(boolean z, SessionId sessionId, List<Long> list, List<Long> list2) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), sessionId, list, list2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd8240d99f503d18b3dcc5d6e4b0ce58", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd8240d99f503d18b3dcc5d6e4b0ce58");
                return;
            }
            if (z) {
                b(sessionId, list, list2);
            } else {
                b();
            }
            this.d = false;
            a();
        }
    }
}
