package com.sankuai.xm.imextra.impl.sessionpresent;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.c;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.sankuai.xm.im.cache.j;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.SyncRead;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imextra.db.IMExtraDBProxy;
import com.sankuai.xm.imextra.impl.sessionpresent.db.DBSessionMsgSpecialTag;
import com.sankuai.xm.imextra.service.chatpresent.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends com.sankuai.xm.base.service.a implements b {
    public static ChangeQuickRedirect a;
    private volatile IMExtraDBProxy b;
    private volatile Pair<SessionId, LinkedList<com.sankuai.xm.imextra.service.chatpresent.a<SessionId>>> c;
    private final Map<IMMessage, Set<com.sankuai.xm.imextra.service.chatpresent.a<SessionId>>> d;
    private final Set<com.sankuai.xm.imextra.service.chatpresent.a<SessionId>> e;
    private final c<com.sankuai.xm.im.session.listener.b> f;
    private final c<com.sankuai.xm.im.session.listener.a> j;
    private final IMClient.f k;
    private final IMClient.i l;
    private final IMClient.b m;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "203d949c3f59e3554e3249510fce5e3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "203d949c3f59e3554e3249510fce5e3b");
            return;
        }
        this.d = new HashMap();
        this.e = new HashSet();
        this.f = new AnonymousClass1();
        this.j = new c<com.sankuai.xm.im.session.listener.a>() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.a.3
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.sankuai.xm.base.callback.c
            public boolean a(com.sankuai.xm.im.session.listener.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e0640d4db385f52e8610a86682ec32d", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e0640d4db385f52e8610a86682ec32d")).booleanValue();
                }
                if (aVar.a(1)) {
                    synchronized (a.this) {
                        a.this.c = new Pair(aVar.a(), new LinkedList());
                    }
                } else {
                    synchronized (a.this) {
                        if (a.this.c != null && ((SessionId) a.this.c.first).equals(aVar.a())) {
                            com.sankuai.xm.log.c.b("SessionPresentService", "current session leave, curr=%d/%s", Integer.valueOf(com.sankuai.xm.base.util.b.b((Collection) a.this.c.second)), aVar.a());
                            a.this.c = null;
                        }
                    }
                }
                return false;
            }
        };
        this.k = new IMClient.f() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.a.4
            public static ChangeQuickRedirect a;

            public static /* synthetic */ void a(AnonymousClass4 anonymousClass4, List list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, anonymousClass4, changeQuickRedirect2, false, "5a7aabd2d4a4b20dab51d0afeb099da9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, anonymousClass4, changeQuickRedirect2, false, "5a7aabd2d4a4b20dab51d0afeb099da9");
                } else if (!a.this.d.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        com.sankuai.xm.im.session.entry.a aVar = (com.sankuai.xm.im.session.entry.a) it.next();
                        if (a.this.d.isEmpty()) {
                            break;
                        } else if (aVar.d()) {
                            Iterator it2 = a.this.d.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                if (SessionId.a((IMMessage) entry.getKey()).equals(aVar.c())) {
                                    Set<com.sankuai.xm.imextra.service.chatpresent.a> set = (Set) entry.getValue();
                                    it2.remove();
                                    if (set != null && aVar.d != 0) {
                                        for (com.sankuai.xm.imextra.service.chatpresent.a aVar2 : set) {
                                            arrayList.add(new DBSessionMsgSpecialTag(aVar2));
                                            List list2 = (List) hashMap.get(aVar);
                                            if (list2 == null) {
                                                list2 = new ArrayList();
                                                hashMap.put(aVar, list2);
                                            }
                                            list2.add(new com.sankuai.xm.imextra.service.chatpresent.a(aVar2, aVar));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    com.sankuai.xm.log.c.b("SessionPresentService", "chat tag part saved, %s", hashMap.keySet());
                    a.a(a.this).a(arrayList);
                    a.this.a((Map<com.sankuai.xm.im.session.entry.a, List<com.sankuai.xm.imextra.service.chatpresent.a<com.sankuai.xm.im.session.entry.a>>>) hashMap, false);
                }
            }

            public static /* synthetic */ void a(AnonymousClass4 anonymousClass4, List list, boolean z) {
                List<DBSessionMsgSpecialTag> list2;
                char c = 1;
                Object[] objArr2 = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, anonymousClass4, changeQuickRedirect2, false, "f63304214e189755642968e3e965ecdf", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, anonymousClass4, changeQuickRedirect2, false, "f63304214e189755642968e3e965ecdf");
                    return;
                }
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                if (!a.this.e.isEmpty()) {
                    Iterator it = a.this.e.iterator();
                    while (it.hasNext()) {
                        com.sankuai.xm.imextra.service.chatpresent.a aVar = (com.sankuai.xm.imextra.service.chatpresent.a) it.next();
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                com.sankuai.xm.im.session.entry.a aVar2 = (com.sankuai.xm.im.session.entry.a) it2.next();
                                if (aVar2.c().equals(aVar.getSession())) {
                                    List list3 = (List) hashMap.get(aVar2);
                                    if (list3 == null) {
                                        list3 = new ArrayList();
                                        hashMap.put(aVar2, list3);
                                    }
                                    list3.add(new com.sankuai.xm.imextra.service.chatpresent.a(aVar, aVar2));
                                    it.remove();
                                }
                            }
                        }
                    }
                }
                HashMap hashMap3 = new HashMap();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    com.sankuai.xm.im.session.entry.a aVar3 = (com.sankuai.xm.im.session.entry.a) it3.next();
                    if ((aVar3.d == 0 && aVar3.d()) || z) {
                        hashMap3.put(aVar3.c, aVar3);
                    } else {
                        if (aVar3.d()) {
                            SyncRead c2 = IMClient.a().c(aVar3.c());
                            if (c2 != null) {
                                final long max = Math.max(c2.getLsts(), c2.getRsts());
                                final com.sankuai.xm.imextra.impl.sessionpresent.db.a a2 = a.a(a.this);
                                final String str = aVar3.c;
                                Object[] objArr3 = new Object[2];
                                objArr3[0] = str;
                                objArr3[c] = new Long(max);
                                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.imextra.impl.sessionpresent.db.a.a;
                                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "502b4ebbe074e3849bdb749756350b74", 6917529027641081856L)) {
                                    list2 = (List) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "502b4ebbe074e3849bdb749756350b74");
                                } else {
                                    final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
                                    a2.b.a(new Runnable() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.db.a.6
                                        public static ChangeQuickRedirect a;

                                        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, T] */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr4 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "15e56193bdb9fa88293b02ce5b9a2ea6", 6917529027641081856L)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "15e56193bdb9fa88293b02ce5b9a2ea6");
                                                return;
                                            }
                                            j a3 = j.a(DBSessionMsgSpecialTag.CHAT, str, true);
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(max);
                                            bVar.c = a.a(a2, new j[]{a3, j.a("sts", sb.toString(), "<", false)});
                                        }
                                    }, (com.sankuai.xm.im.a<Void>) null);
                                    list2 = (List) bVar.c;
                                }
                                if (!com.sankuai.xm.base.util.b.a((Collection<?>) list2)) {
                                    ArrayList arrayList = new ArrayList();
                                    for (DBSessionMsgSpecialTag dBSessionMsgSpecialTag : list2) {
                                        arrayList.add(new com.sankuai.xm.imextra.service.chatpresent.a(dBSessionMsgSpecialTag, aVar3));
                                    }
                                    hashMap2.put(aVar3, arrayList);
                                }
                            }
                        }
                        c = 1;
                    }
                }
                if (!hashMap3.isEmpty()) {
                    List<DBSessionMsgSpecialTag> a3 = a.a(a.this).a(hashMap3.keySet(), 0);
                    if (!com.sankuai.xm.base.util.b.a(a3)) {
                        for (DBSessionMsgSpecialTag dBSessionMsgSpecialTag2 : a3) {
                            com.sankuai.xm.im.session.entry.a aVar4 = (com.sankuai.xm.im.session.entry.a) hashMap3.get(dBSessionMsgSpecialTag2.getChatKey());
                            List list4 = (List) hashMap.get(aVar4);
                            if (list4 == null) {
                                list4 = new ArrayList();
                                hashMap.put(aVar4, list4);
                            }
                            list4.add(new com.sankuai.xm.imextra.service.chatpresent.a(dBSessionMsgSpecialTag2, aVar4));
                        }
                    }
                }
                if (hashMap.isEmpty() && hashMap2.isEmpty()) {
                    return;
                }
                com.sankuai.xm.log.c.b("SessionPresentService", "chat tag all deleted, %s, part deleted, %s", hashMap.keySet(), hashMap2.keySet());
                a.a(a.this, hashMap);
                hashMap.putAll(hashMap2);
                a.this.a((Map<com.sankuai.xm.im.session.entry.a, List<com.sankuai.xm.imextra.service.chatpresent.a<com.sankuai.xm.im.session.entry.a>>>) hashMap, true);
            }

            public static /* synthetic */ void b(AnonymousClass4 anonymousClass4, List list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, anonymousClass4, changeQuickRedirect2, false, "21399ac8152ca7c1311ed73ca776f01f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, anonymousClass4, changeQuickRedirect2, false, "21399ac8152ca7c1311ed73ca776f01f");
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.sankuai.xm.im.session.entry.a aVar = (com.sankuai.xm.im.session.entry.a) it.next();
                    if (a.this.d.isEmpty()) {
                        return;
                    }
                    Iterator it2 = a.this.d.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (SessionId.a((IMMessage) ((Map.Entry) it2.next()).getKey()).equals(aVar.c())) {
                            it2.remove();
                        }
                    }
                }
            }

            @Override // com.sankuai.xm.im.IMClient.f
            public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52df9e40c9c14e215ef2e04a73029ac9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52df9e40c9c14e215ef2e04a73029ac9");
                } else if (com.sankuai.xm.base.util.b.a(list)) {
                    com.sankuai.xm.log.c.c("SessionPresentService", "session change is null, %d", Integer.valueOf(a.this.d.size()));
                } else {
                    a(list, false);
                }
            }

            @Override // com.sankuai.xm.im.IMClient.f
            public final void b(List<com.sankuai.xm.im.session.entry.a> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83b22077392aa4e5fe43e39347c7c41b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83b22077392aa4e5fe43e39347c7c41b");
                } else if (com.sankuai.xm.base.util.b.a(list)) {
                    com.sankuai.xm.log.c.c("SessionPresentService", "session deleted is null, %d", Integer.valueOf(a.this.d.size()));
                } else {
                    a(list, true);
                }
            }

            private void a(final List<com.sankuai.xm.im.session.entry.a> list, final boolean z) {
                Object[] objArr2 = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4197ea7cd2cf5c4e19434ee03093735", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4197ea7cd2cf5c4e19434ee03093735");
                } else {
                    a.a(a.this, new Runnable() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.a.4.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8eff6f2940c6209c77efb133dd4756be", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8eff6f2940c6209c77efb133dd4756be");
                                return;
                            }
                            if (!z) {
                                AnonymousClass4.a(AnonymousClass4.this, list);
                            }
                            AnonymousClass4.a(AnonymousClass4.this, list, z);
                            AnonymousClass4.b(AnonymousClass4.this, list);
                            if (a.this.d.isEmpty() && a.this.e.isEmpty()) {
                                return;
                            }
                            com.sankuai.xm.log.c.c("SessionPresentService", "session change not match received msg, normal:%d, recall:%d", Integer.valueOf(a.this.d.size()), Integer.valueOf(a.this.e.size()));
                        }
                    });
                }
            }
        };
        this.l = new IMClient.i() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.a.5
            public static ChangeQuickRedirect a;

            public static /* synthetic */ Map a(AnonymousClass5 anonymousClass5, List list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, anonymousClass5, changeQuickRedirect2, false, "10761613a26958ae5bc8d68b0726834d", 6917529027641081856L)) {
                    return (Map) PatchProxy.accessDispatch(objArr2, anonymousClass5, changeQuickRedirect2, false, "10761613a26958ae5bc8d68b0726834d");
                }
                final ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    IMMessage iMMessage = (IMMessage) it.next();
                    if (iMMessage.getMsgStatus() == 7) {
                        arrayList.add(iMMessage);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                final HashMap hashMap = new HashMap();
                ((l) a.this.b_(l.class)).b(b.InterfaceC1397b.class).c().a(new b.a<b.InterfaceC1397b>() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.a.5.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.util.b.a
                    public final /* synthetic */ boolean a(b.InterfaceC1397b interfaceC1397b) {
                        b.InterfaceC1397b interfaceC1397b2 = interfaceC1397b;
                        Object[] objArr3 = {interfaceC1397b2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b554458fd8363a7236b9eee7b1e9c465", 6917529027641081856L)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b554458fd8363a7236b9eee7b1e9c465")).booleanValue();
                        }
                        for (IMMessage iMMessage2 : arrayList) {
                            com.sankuai.xm.imextra.service.chatpresent.a<SessionId> a2 = interfaceC1397b2.a(iMMessage2);
                            if (com.sankuai.xm.imextra.service.chatpresent.a.isValid(a2)) {
                                Set set = (Set) hashMap.get(iMMessage2);
                                if (set == null) {
                                    set = new HashSet();
                                    hashMap.put(iMMessage2, set);
                                }
                                set.add(a2);
                            }
                        }
                        return false;
                    }
                });
                return hashMap;
            }

            @Override // com.sankuai.xm.im.IMClient.i
            public final void a(final List<IMMessage> list, boolean z) {
                Object[] objArr2 = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a386afa38188033c403b2d7f199605d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a386afa38188033c403b2d7f199605d");
                } else {
                    a.a(a.this, new Runnable() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.a.5.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "03e1f055f842e1145e4e3388aa1da088", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "03e1f055f842e1145e4e3388aa1da088");
                                return;
                            }
                            Map a2 = AnonymousClass5.a(AnonymousClass5.this, list);
                            if (a2 == null || a2.isEmpty()) {
                                return;
                            }
                            for (Map.Entry entry : a2.entrySet()) {
                                Set set = (Set) a.this.d.get(entry.getKey());
                                if (set == null) {
                                    set = new HashSet();
                                }
                                set.addAll((Collection) entry.getValue());
                                a.this.d.put(entry.getKey(), set);
                            }
                        }
                    });
                }
            }
        };
        this.m = new IMClient.b() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.a.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.IMClient.b
            public final void a(final List<IMClient.a> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd5fb515a762b06cd1dcb290f6a71e97", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd5fb515a762b06cd1dcb290f6a71e97");
                } else {
                    a.a(a.this, new Runnable() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.a.6.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "972a39c51dc2c45d2d52b62f84e555bb", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "972a39c51dc2c45d2d52b62f84e555bb");
                            } else if (!com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
                                final HashSet hashSet = new HashSet(list.size());
                                for (IMClient.a aVar : list) {
                                    a.this.d.remove(aVar.b);
                                    hashSet.add(aVar.b.getMsgUuid());
                                }
                                final com.sankuai.xm.imextra.impl.sessionpresent.db.a a2 = a.a(a.this);
                                Object[] objArr4 = {hashSet};
                                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.imextra.impl.sessionpresent.db.a.a;
                                List list2 = null;
                                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "3b267e67ea3f95e0ad7d421da4d365c3", 6917529027641081856L)) {
                                    list2 = (List) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "3b267e67ea3f95e0ad7d421da4d365c3");
                                } else if (!com.sankuai.xm.base.util.b.a(hashSet)) {
                                    final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
                                    a2.b.a(new Runnable() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.db.a.4
                                        public static ChangeQuickRedirect a;

                                        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, T] */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr5 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "78f0014654232989d2a583838c5f72c8", 6917529027641081856L)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "78f0014654232989d2a583838c5f72c8");
                                                return;
                                            }
                                            bVar.c = a.a(a2, new j[]{j.a("msgUuid", (Set<String>) hashSet, true), j.a("source", "0", false)});
                                        }
                                    }, (com.sankuai.xm.im.a<Void>) null);
                                    list2 = (List) bVar.c;
                                }
                                if (com.sankuai.xm.base.util.b.a((Collection<?>) list2)) {
                                    return;
                                }
                                a.this.e.addAll(list2);
                            }
                        }
                    });
                }
            }
        };
    }

    public static /* synthetic */ com.sankuai.xm.imextra.impl.sessionpresent.db.a a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "05d53654f4064cc84b38fb5a9c45e725", 6917529027641081856L) ? (com.sankuai.xm.imextra.impl.sessionpresent.db.a) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "05d53654f4064cc84b38fb5a9c45e725") : aVar.b.k;
    }

    public static /* synthetic */ Map a(a aVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "6ed488692c0e253cb4ea081fc1e5e261", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "6ed488692c0e253cb4ea081fc1e5e261");
        }
        if (com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.sankuai.xm.imextra.service.chatpresent.a aVar2 = (com.sankuai.xm.imextra.service.chatpresent.a) it.next();
            List list2 = (List) hashMap.get(aVar2.getSession());
            if (list2 == null) {
                list2 = new ArrayList();
                hashMap.put(aVar2.getSession(), list2);
            }
            list2.add(aVar2);
        }
        return hashMap;
    }

    public static /* synthetic */ Map a(a aVar, List list, boolean z, Pair pair) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), pair};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "4491fc1f3129c972b36f3beeed0c9d99", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "4491fc1f3129c972b36f3beeed0c9d99");
        }
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DBSessionMsgSpecialTag dBSessionMsgSpecialTag = (DBSessionMsgSpecialTag) it.next();
            boolean z2 = !z || IMClient.a().a(dBSessionMsgSpecialTag.getChannel());
            if (z2 && z && pair != null) {
                String str = (String) pair.first;
                if (((str.hashCode() == 738950403 && str.equals("channel")) ? (char) 0 : (char) 65535) == 0) {
                    short shortValue = ((Short) pair.second).shortValue();
                    z2 &= shortValue == -1 || shortValue == dBSessionMsgSpecialTag.getChannel();
                }
            }
            if (z2) {
                List list2 = (List) hashMap.get(dBSessionMsgSpecialTag.getSession());
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(dBSessionMsgSpecialTag.getSession(), list2);
                }
                list2.add(dBSessionMsgSpecialTag);
            }
        }
        return hashMap;
    }

    public static /* synthetic */ void a(a aVar, Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "6fe8dafd95a36e64c9615f491de06113", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "6fe8dafd95a36e64c9615f491de06113");
        } else {
            aVar.b.a(runnable, false, null);
        }
    }

    public static /* synthetic */ void a(a aVar, Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "3505ea2283c22998fc3357b681c56463", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "3505ea2283c22998fc3357b681c56463");
        } else if (map != null && map.size() == 1) {
            SessionId c = ((com.sankuai.xm.im.session.entry.a) map.keySet().iterator().next()).c();
            synchronized (aVar) {
                if (aVar.c == null || !((SessionId) aVar.c.first).equals(c)) {
                    return;
                }
                List<com.sankuai.xm.imextra.service.chatpresent.a> list = (List) map.get(map.keySet().iterator().next());
                if (list != null) {
                    for (com.sankuai.xm.imextra.service.chatpresent.a aVar2 : list) {
                        ((LinkedList) aVar.c.second).add(new com.sankuai.xm.imextra.service.chatpresent.a(aVar2, c));
                    }
                }
                com.sankuai.xm.log.c.b("SessionPresentService", "in session %d , has %d unread tags", c, Integer.valueOf(((LinkedList) aVar.c.second).size()));
            }
        }
    }

    public static /* synthetic */ void a(a aVar, Map map, boolean z) {
        Object[] objArr = {map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "216f6ebb4b05c01d39f32579b5a98589", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "216f6ebb4b05c01d39f32579b5a98589");
        } else if (map != null && !map.isEmpty()) {
            List<DBSession> b = DBProxy.l().m.b(map.keySet());
            if (com.sankuai.xm.base.util.b.a(b)) {
                com.sankuai.xm.im.utils.a.b("%s tags notifyListenerWithSessionId no session, map=%s, deleted=%s", "SessionPresentService", map.values(), Boolean.valueOf(z));
                return;
            }
            HashMap hashMap = new HashMap();
            for (DBSession dBSession : b) {
                com.sankuai.xm.im.session.entry.a dbSessionToSession = MessageUtils.dbSessionToSession(dBSession);
                ArrayList arrayList = new ArrayList();
                for (com.sankuai.xm.imextra.service.chatpresent.a aVar2 : (List) map.get(dbSessionToSession.c())) {
                    arrayList.add(new com.sankuai.xm.imextra.service.chatpresent.a<>(aVar2, dbSessionToSession));
                }
                hashMap.put(dbSessionToSession, arrayList);
            }
            aVar.a(hashMap, z);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.imextra.impl.sessionpresent.a$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass1 implements c<com.sankuai.xm.im.session.listener.b> {
        public static ChangeQuickRedirect a;

        public AnonymousClass1() {
        }

        @Override // com.sankuai.xm.base.callback.c
        public final /* synthetic */ boolean a(com.sankuai.xm.im.session.listener.b bVar) {
            final com.sankuai.xm.im.session.listener.b bVar2 = bVar;
            Object[] objArr = {bVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7adfb4852cfc478a7579aebe307daa70", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7adfb4852cfc478a7579aebe307daa70")).booleanValue();
            }
            if (bVar2 == null || bVar2.a() == null) {
                return true;
            }
            a.a(a.this, new Runnable() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.a.1.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Map hashMap;
                    ArrayList arrayList;
                    char c;
                    char c2 = 0;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d2b592056330b051d9f21d78074b0fc", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d2b592056330b051d9f21d78074b0fc");
                        return;
                    }
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    Map<SessionId, JSONObject> a2 = bVar2.a();
                    Object[] objArr3 = {a2};
                    ChangeQuickRedirect changeQuickRedirect3 = AnonymousClass1.a;
                    if (PatchProxy.isSupport(objArr3, anonymousClass1, changeQuickRedirect3, false, "284253a49046a5fe0e91b18106b2050e", 6917529027641081856L)) {
                        hashMap = (Map) PatchProxy.accessDispatch(objArr3, anonymousClass1, changeQuickRedirect3, false, "284253a49046a5fe0e91b18106b2050e");
                    } else {
                        hashMap = new HashMap();
                        for (Map.Entry<SessionId, JSONObject> entry : a2.entrySet()) {
                            SessionId key = entry.getKey();
                            JSONObject value = entry.getValue();
                            if (value != null) {
                                Object[] objArr4 = new Object[3];
                                objArr4[c2] = "SessionPresentService";
                                objArr4[1] = key;
                                objArr4[2] = value;
                                com.sankuai.xm.im.utils.a.a("%s parseFromExt, %s:%s", objArr4);
                                JSONObject optJSONObject = value.optJSONObject("ext");
                                JSONArray optJSONArray = optJSONObject == null ? null : optJSONObject.optJSONArray("imTags");
                                if (optJSONArray == null || optJSONArray.length() <= 0) {
                                    com.sankuai.xm.im.utils.a.b("%s parseFromExt, tags of %s need clear", "SessionPresentService", key);
                                    arrayList = null;
                                } else {
                                    arrayList = new ArrayList();
                                    for (int i = 0; i < optJSONArray.length(); i++) {
                                        DBSessionMsgSpecialTag dBSessionMsgSpecialTag = new DBSessionMsgSpecialTag(new com.sankuai.xm.imextra.service.chatpresent.a(optJSONArray.optString(i), key.f(), Long.MAX_VALUE, key));
                                        dBSessionMsgSpecialTag.setSource(1);
                                        arrayList.add(dBSessionMsgSpecialTag);
                                    }
                                }
                                hashMap.put(key.f(), arrayList);
                                c2 = 0;
                            }
                        }
                    }
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    HashMap hashMap3 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    Map a3 = a.a(a.this, a.a(a.this).a(hashMap.keySet(), 1));
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        SessionId a4 = SessionId.a((String) entry2.getKey());
                        List<DBSessionMsgSpecialTag> list = (List) entry2.getValue();
                        if (com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
                            if (a3 != null && a3.containsKey(a4)) {
                                hashMap3.put(a4, a3.get(a4));
                            }
                        } else {
                            arrayList2.addAll(list);
                            List list2 = a3 == null ? null : (List) a3.get(a4);
                            if (com.sankuai.xm.base.util.b.a((Collection<?>) list2)) {
                                hashMap2.put(a4, list);
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (DBSessionMsgSpecialTag dBSessionMsgSpecialTag2 : list) {
                                    if (!list2.remove(dBSessionMsgSpecialTag2)) {
                                        arrayList3.add(dBSessionMsgSpecialTag2);
                                    }
                                }
                                if (!list2.isEmpty()) {
                                    hashMap3.put(a4, list2);
                                }
                                if (!arrayList3.isEmpty()) {
                                    hashMap2.put(a4, arrayList3);
                                }
                            }
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        c = 0;
                    } else {
                        a.a(a.this).a(arrayList2);
                        c = 0;
                        com.sankuai.xm.im.utils.a.b("%s update session tags:%s", "SessionPresentService", hashMap2.keySet());
                        a.a(a.this, (Map) hashMap2, false);
                    }
                    if (hashMap3.isEmpty()) {
                        return;
                    }
                    Object[] objArr5 = new Object[2];
                    objArr5[c] = "SessionPresentService";
                    objArr5[1] = hashMap3.keySet();
                    com.sankuai.xm.im.utils.a.b("%s delete session tags:%s", objArr5);
                    a.a(a.this, (Map) hashMap3, true);
                }
            });
            return true;
        }
    }

    @Override // com.sankuai.xm.base.service.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "100d10843921f0b6d98ad2b78c7541fb", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "100d10843921f0b6d98ad2b78c7541fb")).intValue();
        }
        com.sankuai.xm.log.c.b("SessionPresentService", "init", new Object[0]);
        this.b = (IMExtraDBProxy) m.a(IMExtraDBProxy.class);
        ((com.sankuai.xm.base.service.c) m.a(com.sankuai.xm.base.service.c.class)).a_(com.sankuai.xm.im.session.listener.a.class).a(this.j);
        ((com.sankuai.xm.base.service.c) m.a(com.sankuai.xm.base.service.c.class)).a_(com.sankuai.xm.im.session.listener.b.class).a(this.f);
        IMClient.a().a((short) -1, this.l);
        IMClient.a().a((short) -1, this.k);
        IMClient a2 = IMClient.a();
        IMClient.b bVar = this.m;
        Object[] objArr2 = {(short) -1, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = IMClient.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "8c86db673cdf116b192ff0b6fd4cbb86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "8c86db673cdf116b192ff0b6fd4cbb86");
        } else {
            ((l) a2.D().a()).a(IMClient.b.class).a((short) -1).a((l.a) bVar);
        }
        return super.a();
    }

    @Override // com.sankuai.xm.imextra.service.chatpresent.b
    public final Map<SessionId, List<com.sankuai.xm.imextra.service.chatpresent.a<SessionId>>> a(long j, final List<SessionId> list) {
        Object[] objArr = {0L, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3b747a981ed83ea37178a197789f865", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3b747a981ed83ea37178a197789f865");
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        a(new Runnable() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.a.7
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r0v11, types: [T, java.util.Map] */
            @Override // java.lang.Runnable
            public final void run() {
                List list2;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12a979f22f2ab6bcdfd9e5813f28391f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12a979f22f2ab6bcdfd9e5813f28391f");
                    return;
                }
                final com.sankuai.xm.imextra.impl.sessionpresent.db.a a2 = a.a(a.this);
                final List list3 = list;
                final long j2 = r3;
                Object[] objArr3 = {list3, new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.imextra.impl.sessionpresent.db.a.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "9db5f0d8c02ecf7e3cfe2d7d7535061f", 6917529027641081856L)) {
                    list2 = (List) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "9db5f0d8c02ecf7e3cfe2d7d7535061f");
                } else if (com.sankuai.xm.base.util.b.a((Collection<?>) list3)) {
                    list2 = null;
                } else {
                    final com.sankuai.xm.base.tinyorm.b bVar2 = new com.sankuai.xm.base.tinyorm.b();
                    a2.b.a(new Runnable() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.db.a.2
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, T] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1fda1f2c9f377d469fed34c32c054be5", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1fda1f2c9f377d469fed34c32c054be5");
                                return;
                            }
                            HashSet hashSet = new HashSet(list3.size());
                            for (SessionId sessionId : list3) {
                                if (sessionId != null) {
                                    hashSet.add(sessionId.f());
                                }
                            }
                            j a3 = j.a(DBSessionMsgSpecialTag.CHAT, (Set<String>) hashSet, true);
                            StringBuilder sb = new StringBuilder();
                            sb.append(j2);
                            j a4 = j.a("sts", sb.toString(), ">", false);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(System.currentTimeMillis());
                            bVar2.c = a2.a(a3, a4, j.a(com.sankuai.xm.imextra.service.chatpresent.a.TERMINAL, sb2.toString(), ">", false));
                        }
                    }, (com.sankuai.xm.im.a<Void>) null);
                    list2 = (List) bVar2.c;
                }
                com.sankuai.xm.log.c.a("SessionPresentService", "batchGet, get chat %s, size:%s", list, list2);
                if (com.sankuai.xm.base.util.b.a((Collection<?>) list2)) {
                    return;
                }
                bVar.c = a.a(a.this, list2, false, null);
            }
        });
        return (Map) bVar.c;
    }

    @Override // com.sankuai.xm.imextra.service.chatpresent.b
    public final List<com.sankuai.xm.im.session.entry.a> a(long j, final short s, final Set<String> set) {
        Object[] objArr = {0L, Short.valueOf(s), set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69bd67d6fc60a1288d2132e6d27c03d", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69bd67d6fc60a1288d2132e6d27c03d");
        }
        final com.sankuai.xm.base.tinyorm.b bVar = new com.sankuai.xm.base.tinyorm.b();
        a(new Runnable() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.a.8
            public static ChangeQuickRedirect a;

            /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List, T] */
            @Override // java.lang.Runnable
            public final void run() {
                List list;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9c17538e85df258311a6c8376fc5400", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9c17538e85df258311a6c8376fc5400");
                    return;
                }
                final com.sankuai.xm.imextra.impl.sessionpresent.db.a a2 = a.a(a.this);
                final Set set2 = set;
                final long j2 = r3;
                Object[] objArr3 = {set2, new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.imextra.impl.sessionpresent.db.a.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "be993b3fdaef1f9545ff54a93b2c5d50", 6917529027641081856L)) {
                    list = (List) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "be993b3fdaef1f9545ff54a93b2c5d50");
                } else {
                    final com.sankuai.xm.base.tinyorm.b bVar2 = new com.sankuai.xm.base.tinyorm.b();
                    a2.b.a(new Runnable() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.db.a.1
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, T] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8b9477b9a3ff1788423d5a3c488c8ceb", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8b9477b9a3ff1788423d5a3c488c8ceb");
                                return;
                            }
                            j a3 = com.sankuai.xm.base.util.b.a(set2) ? null : j.a("tag", (Set<String>) set2, true);
                            StringBuilder sb = new StringBuilder();
                            sb.append(j2);
                            j a4 = j.a("sts", sb.toString(), ">", false);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(System.currentTimeMillis());
                            bVar2.c = a2.a(a3, a4, j.a(com.sankuai.xm.imextra.service.chatpresent.a.TERMINAL, sb2.toString(), ">", false));
                        }
                    }, (com.sankuai.xm.im.a<Void>) null);
                    list = (List) bVar2.c;
                }
                com.sankuai.xm.log.c.a("SessionPresentService", "getByTag, get chat %s, size:%s", set, list);
                if (com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
                    return;
                }
                bVar.c = MessageUtils.dbSessionToSession(DBProxy.l().m.b(a.a(a.this, list, true, new Pair("channel", Short.valueOf(s))).keySet()));
            }
        });
        return (List) bVar.c;
    }

    @Override // com.sankuai.xm.imextra.service.chatpresent.b
    public final void a(short s, b.a aVar) {
        Object[] objArr = {Short.valueOf(s), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c80be314bc12e323b88be54e6d0b588", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c80be314bc12e323b88be54e6d0b588");
        } else {
            ((l) b_(l.class)).a(b.a.class).a(s).a((l.a) aVar);
        }
    }

    @Override // com.sankuai.xm.imextra.service.chatpresent.b
    public final void b(short s, b.a aVar) {
        Object[] objArr = {Short.valueOf(s), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65fc1fac322b0e7098dc5cd784800091", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65fc1fac322b0e7098dc5cd784800091");
        } else {
            ((l) b_(l.class)).a(b.a.class).b(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<com.sankuai.xm.im.session.entry.a, List<com.sankuai.xm.imextra.service.chatpresent.a<com.sankuai.xm.im.session.entry.a>>> map, boolean z) {
        Object[] objArr = {map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2ed28f3665e8379d8ca9e107971dd3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2ed28f3665e8379d8ca9e107971dd3b");
        } else if (map != null && !map.isEmpty()) {
            com.sankuai.xm.im.utils.a.a("%s notifyListener: tags:%s, delete:%s", "SessionPresentService", map.values(), Boolean.valueOf(z));
            HashMap hashMap = new HashMap();
            for (com.sankuai.xm.im.session.entry.a aVar : map.keySet()) {
                Map map2 = (Map) hashMap.get(Short.valueOf(aVar.c().g));
                if (map2 == null) {
                    map2 = new HashMap();
                    hashMap.put(Short.valueOf(aVar.c().g), map2);
                }
                map2.put(aVar, map.get(aVar));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                a(((Short) entry.getKey()).shortValue(), (Map) entry.getValue(), z);
                if (!IMClient.a().a(((Short) entry.getKey()).shortValue())) {
                    map.entrySet().removeAll(((Map) entry.getValue()).entrySet());
                }
            }
            a((short) -1, map, z);
        }
    }

    private void a(short s, final Map<com.sankuai.xm.im.session.entry.a, List<com.sankuai.xm.imextra.service.chatpresent.a<com.sankuai.xm.im.session.entry.a>>> map, final boolean z) {
        Object[] objArr = {Short.valueOf(s), map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f5a3e7069edff2d70e8d524d205017b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f5a3e7069edff2d70e8d524d205017b");
        } else if (map == null || map.isEmpty()) {
        } else {
            ((l) b_(l.class)).b(b.a.class).a(s).a(new b.a<b.a>() { // from class: com.sankuai.xm.imextra.impl.sessionpresent.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(b.a aVar) {
                    b.a aVar2 = aVar;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ac2b85436d7d69bf48d9386c4362050", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ac2b85436d7d69bf48d9386c4362050")).booleanValue();
                    }
                    if (z) {
                        aVar2.b(map);
                    } else {
                        aVar2.a(map);
                    }
                    return false;
                }
            });
        }
    }

    private void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4b634fa73456b6a661a8c56481b3f02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4b634fa73456b6a661a8c56481b3f02");
        } else {
            this.b.a(runnable, (com.sankuai.xm.im.a<Void>) null);
        }
    }
}
