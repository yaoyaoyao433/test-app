package com.sankuai.xm.group;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.d;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.group.db.PersonalDBProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.CommonDBProxy;
import com.sankuai.xm.im.notice.bean.IMNotice;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.vcard.db.VCard;
import com.sankuai.xm.imui.controller.group.bean.GroupAnnouncement;
import com.sankuai.xm.imui.controller.group.bean.GroupMember;
import com.sankuai.xm.imui.controller.group.bean.GroupPermit;
import com.sankuai.xm.imui.controller.group.e;
import com.sankuai.xm.network.httpurlconnection.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends com.sankuai.xm.base.service.a implements b, IMClient.j {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ List a(c cVar, com.sankuai.xm.base.util.net.c cVar2, SessionId sessionId) throws JSONException {
        boolean z;
        Object[] objArr = {cVar2, sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "8f656e99eca6c9c6e03554527244d58d", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "8f656e99eca6c9c6e03554527244d58d");
        }
        JSONObject g = cVar2.g("members");
        ArrayList arrayList = new ArrayList();
        if (g != null) {
            Iterator<String> keys = g.keys();
            loop0: while (true) {
                z = false;
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject = g.optJSONObject(next);
                    if (optJSONObject != null) {
                        GroupMember groupMember = new GroupMember();
                        groupMember.setGid(sessionId.b);
                        groupMember.setUid(Long.valueOf(next).longValue());
                        groupMember.setRole(optJSONObject.optString(GroupMember.MEMBER_ROLE));
                        groupMember.setJoinTime(optJSONObject.optLong(GroupMember.MEMBER_JOIN_TIME));
                        arrayList.add(groupMember);
                        if (groupMember.getUid() == IMClient.a().k() || z) {
                            z = true;
                        }
                    }
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            arrayList.clear();
        }
        return arrayList;
    }

    public static /* synthetic */ void a(c cVar, int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "816f2defd8bfd3deed87097d6e0346d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "816f2defd8bfd3deed87097d6e0346d4");
        } else if (i == 4 || i == 15) {
            cVar.a(j, true);
        }
    }

    public static /* synthetic */ void d(c cVar, short s, final long j) {
        Object[] objArr = {Short.valueOf(s), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "a2ae58b000ad43061e330716d82893b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "a2ae58b000ad43061e330716d82893b2");
        } else if (IMClient.a().a(s)) {
            ((l) cVar.b_(l.class)).b(e.class).a(s, -1).a(new b.a<e>() { // from class: com.sankuai.xm.group.c.15
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fef84d4d6d6b5af5bd590f42a524dad2", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fef84d4d6d6b5af5bd590f42a524dad2")).booleanValue();
                    }
                    return false;
                }
            });
        }
    }

    @Override // com.sankuai.xm.base.service.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ecd9afddba54cc3be64eb652ee6fb61", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ecd9afddba54cc3be64eb652ee6fb61")).intValue();
        }
        IMClient.a().a(this);
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    @Override // com.sankuai.xm.im.IMClient.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List<com.sankuai.xm.im.notice.bean.IMNotice> r24) {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.group.c.a(java.util.List):void");
    }

    @Override // com.sankuai.xm.group.b
    public final void a(short s, com.sankuai.xm.imui.controller.group.a aVar) {
        Object[] objArr = {Short.valueOf(s), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6211ee1bf7a0766378ee2a5553e9c9b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6211ee1bf7a0766378ee2a5553e9c9b4");
        } else {
            ((l) b_(l.class)).a(com.sankuai.xm.imui.controller.group.a.class).a(s).a((l.a) aVar);
        }
    }

    @Override // com.sankuai.xm.group.b
    public final void b(short s, com.sankuai.xm.imui.controller.group.a aVar) {
        Object[] objArr = {Short.valueOf(s), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba1385e5d2b754af4bc58d20c4c9feb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba1385e5d2b754af4bc58d20c4c9feb1");
        } else {
            ((l) b_(l.class)).a(com.sankuai.xm.imui.controller.group.a.class).a(s).b(aVar);
        }
    }

    @Override // com.sankuai.xm.group.b
    public final void a(short s, com.sankuai.xm.imui.controller.group.b bVar) {
        Object[] objArr = {(short) 1025, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "430136f9ae53bb14f6c23e884bf519ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "430136f9ae53bb14f6c23e884bf519ae");
        } else {
            ((l) b_(l.class)).a(com.sankuai.xm.imui.controller.group.b.class).a((short) 1025).a((l.a) bVar);
        }
    }

    @Override // com.sankuai.xm.group.b
    public final void b(short s, com.sankuai.xm.imui.controller.group.b bVar) {
        Object[] objArr = {(short) 1025, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75e1f1050aed3597db7b5c842f59bccd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75e1f1050aed3597db7b5c842f59bccd");
        } else {
            ((l) b_(l.class)).a(com.sankuai.xm.imui.controller.group.b.class).a((short) 1025).b(bVar);
        }
    }

    @Override // com.sankuai.xm.group.b
    public final void a(SessionId sessionId, GroupAnnouncement groupAnnouncement) {
        Object[] objArr = {sessionId, groupAnnouncement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4213a17e6b654dadb335248ec3f1105", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4213a17e6b654dadb335248ec3f1105");
        } else if (groupAnnouncement == null && (groupAnnouncement = PersonalDBProxy.l().o().a(sessionId.b)) == null) {
            com.sankuai.xm.im.utils.a.d("GroupServiceImpl::updateGroupAnnouncementRead gaid is null and gid = %s", Long.valueOf(sessionId.b));
        } else {
            final long gid = groupAnnouncement.getGid();
            final HashMap hashMap = new HashMap();
            hashMap.put("gid", Long.valueOf(groupAnnouncement.getGid()));
            hashMap.put(GroupAnnouncement.GROUP_ANNOUNCEMENT_ID, Long.valueOf(groupAnnouncement.getAnnouncementId()));
            d dVar = new d(a.a("/mtinfo/api/v1/groupAnnouncement/read"), hashMap, new com.sankuai.xm.network.httpurlconnection.d() { // from class: com.sankuai.xm.group.c.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.network.httpurlconnection.d
                public final void a(JSONObject jSONObject) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96637c2f216733e635822a8dfac30066", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96637c2f216733e635822a8dfac30066");
                        return;
                    }
                    com.sankuai.xm.im.utils.a.b("GroupServiceImpl::updateGroupAnnouncementRead onSuccess, params = %s", hashMap);
                    c.this.b(gid);
                }

                @Override // com.sankuai.xm.network.httpurlconnection.d
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b7df8d6d8ad4e0e8d5536ed8c125101", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b7df8d6d8ad4e0e8d5536ed8c125101");
                        return;
                    }
                    com.sankuai.xm.im.utils.a.d("GroupServiceImpl::updateGroupAnnouncementRead code:%s, msg:%s", Integer.valueOf(i), str);
                    c.this.b(gid);
                }
            });
            StringBuilder sb = new StringBuilder();
            sb.append((int) sessionId.g);
            dVar.b("cnl", sb.toString());
            g.a().a((com.sankuai.xm.network.httpurlconnection.e) dVar, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cf6b2a8a16bfcf663347706aa8a337d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cf6b2a8a16bfcf663347706aa8a337d");
            return;
        }
        GroupAnnouncement groupAnnouncement = new GroupAnnouncement();
        groupAnnouncement.setGid(j);
        groupAnnouncement.setRead((short) 1);
        PersonalDBProxy.l().o().a(groupAnnouncement, new String[]{GroupAnnouncement.GROUP_ANNOUNCEMENT_READ});
    }

    @Override // com.sankuai.xm.group.b
    public final void a(SessionId sessionId, final long j, final List<String> list, boolean z, final Callback<Boolean> callback) {
        Object[] objArr = {sessionId, new Long(j), list, Byte.valueOf(z ? (byte) 1 : (byte) 0), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cdba6caab3b5a982e72e55763a7ddb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cdba6caab3b5a982e72e55763a7ddb3");
            return;
        }
        final Callback<List<GroupMember>> callback2 = new Callback<List<GroupMember>>() { // from class: com.sankuai.xm.group.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.Callback
            public final /* synthetic */ void onSuccess(List<GroupMember> list2) {
                List<GroupMember> list3 = list2;
                Object[] objArr2 = {list3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57bf46c97d23c18d5d27f80d60478152", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57bf46c97d23c18d5d27f80d60478152");
                    return;
                }
                if (!com.sankuai.xm.base.util.b.a(list3)) {
                    for (GroupMember groupMember : list3) {
                        if (groupMember != null && groupMember.getUid() == j) {
                            callback.onSuccess(Boolean.TRUE);
                            return;
                        }
                    }
                }
                callback.onSuccess(Boolean.FALSE);
            }

            @Override // com.sankuai.xm.base.callback.Callback
            public final void onFailure(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2169df2746d98c35868b1303a918232", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2169df2746d98c35868b1303a918232");
                } else {
                    callback.onFailure(i, str);
                }
            }
        };
        Object[] objArr2 = {sessionId, Byte.valueOf(z ? (byte) 1 : (byte) 0), list, callback2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "731872458a0eba5eb6015d450ea8bbb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "731872458a0eba5eb6015d450ea8bbb7");
        } else {
            a(sessionId, z, new Callback<List<GroupMember>>() { // from class: com.sankuai.xm.group.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(List<GroupMember> list2) {
                    List<GroupMember> list3 = list2;
                    Object[] objArr3 = {list3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c086cc56d1a4e91d19e6e8299eede684", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c086cc56d1a4e91d19e6e8299eede684");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!com.sankuai.xm.base.util.b.a((Collection<?>[]) new Collection[]{list3, list})) {
                        for (GroupMember groupMember : list3) {
                            if (groupMember != null && list.contains(groupMember.getRole())) {
                                arrayList.add(groupMember);
                            }
                        }
                    }
                    callback2.onSuccess(arrayList);
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr3 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cbd53a15d7e597fc1c5e808621badcd3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cbd53a15d7e597fc1c5e808621badcd3");
                    } else {
                        callback2.onFailure(i, str);
                    }
                }
            });
        }
    }

    private void a(final SessionId sessionId, final Callback<List<GroupMember>> callback) {
        Object[] objArr = {sessionId, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0268ce5b52c1dd0164e9c7e6bd075b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0268ce5b52c1dd0164e9c7e6bd075b6");
            return;
        }
        com.sankuai.xm.im.utils.b a2 = com.sankuai.xm.im.utils.b.a();
        final String string = a2.getString("gmember_request_version_" + sessionId.b, "");
        HashMap hashMap = new HashMap();
        hashMap.put(com.meituan.android.neohybrid.neo.bridge.presenter.g.n, Long.valueOf(sessionId.b));
        hashMap.put("ver", string);
        d dVar = new d(a.a("/ginfo/api/v2/occupant/members"), hashMap, new com.sankuai.xm.network.httpurlconnection.d() { // from class: com.sankuai.xm.group.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.network.httpurlconnection.d
            public final void a(JSONObject jSONObject) throws Exception {
                Object[] objArr2 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "533cfffdabb7916c6f2d2a4560f032aa", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "533cfffdabb7916c6f2d2a4560f032aa");
                    return;
                }
                com.sankuai.xm.base.util.net.c a3 = new com.sankuai.xm.base.util.net.c(jSONObject).a("data");
                if (a3 != null) {
                    com.sankuai.xm.im.utils.b a4 = com.sankuai.xm.im.utils.b.a();
                    com.sankuai.xm.im.utils.b.a(a4.a("gmember_request_last_time_" + sessionId.b, System.currentTimeMillis()));
                    final String b = a3.b("ver");
                    if (TextUtils.equals(string, b) && !TextUtils.isEmpty(b)) {
                        c.this.b(sessionId, callback);
                        return;
                    }
                    final List a5 = c.a(c.this, a3, sessionId);
                    final com.sankuai.xm.group.db.d m = PersonalDBProxy.l().m();
                    final long j = sessionId.b;
                    final Callback<Void> callback2 = new Callback<Void>() { // from class: com.sankuai.xm.group.c.3.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.base.callback.Callback
                        public final /* synthetic */ void onSuccess(Void r11) {
                            Object[] objArr3 = {r11};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7fb3080766d24825e0ab6669795c5873", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7fb3080766d24825e0ab6669795c5873");
                                return;
                            }
                            com.sankuai.xm.im.utils.b a6 = com.sankuai.xm.im.utils.b.a();
                            com.sankuai.xm.im.utils.b.a(a6.a("gmember_request_version_" + sessionId.b, b));
                        }

                        @Override // com.sankuai.xm.base.callback.Callback
                        public final void onFailure(int i, String str) {
                            Object[] objArr3 = {Integer.valueOf(i), str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c057ca5943c7225a587c55ae30e72f19", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c057ca5943c7225a587c55ae30e72f19");
                            } else {
                                com.sankuai.xm.im.utils.a.d("queryGroupMembers, db error", new Object[0]);
                            }
                        }
                    };
                    Object[] objArr3 = {new Long(j), a5, callback2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.group.db.d.b;
                    if (PatchProxy.isSupport(objArr3, m, changeQuickRedirect3, false, "f9dba2b91515bc037bcc4649f045ac07", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, m, changeQuickRedirect3, false, "f9dba2b91515bc037bcc4649f045ac07");
                    } else if (a5 != null && !a5.isEmpty()) {
                        m.c.a(new Runnable() { // from class: com.sankuai.xm.group.db.d.4
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1f74990beee3129133c01252a9ca6329", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1f74990beee3129133c01252a9ca6329");
                                    return;
                                }
                                try {
                                    m.c.bR_().a(GroupMember.TABLE_NAME, "gid=?", new String[]{String.valueOf(j)});
                                    m.a(a5, (String[]) null);
                                    m.a(callback2, null, 0, "replaceList");
                                } catch (Throwable th) {
                                    m.a(callback2, null, 10019, "replaceList");
                                    throw th;
                                }
                            }
                        }, callback2);
                    }
                    if (callback != null) {
                        callback.onSuccess(a5);
                    }
                } else if (callback != null) {
                    callback.onFailure(10100, "结果解析异常");
                }
            }

            @Override // com.sankuai.xm.network.httpurlconnection.d
            public final void a(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6778b2a25166e5cea1881ccae8673df1", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6778b2a25166e5cea1881ccae8673df1");
                    return;
                }
                c.a(c.this, i, sessionId.b);
                if (i == 10) {
                    c.this.a(sessionId.b, false);
                }
                if (callback != null) {
                    callback.onFailure(i, str);
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append((int) sessionId.g);
        dVar.b("cnl", sb.toString());
        g.a().a((com.sankuai.xm.network.httpurlconnection.e) dVar, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public GroupAnnouncement a(JSONObject jSONObject, SessionId sessionId) {
        Object[] objArr = {jSONObject, sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b94902f0d9f457b806c7ee77e06f9014", 6917529027641081856L)) {
            return (GroupAnnouncement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b94902f0d9f457b806c7ee77e06f9014");
        }
        if (jSONObject != null) {
            GroupAnnouncement groupAnnouncement = new GroupAnnouncement();
            groupAnnouncement.setGid(sessionId.b);
            groupAnnouncement.setAnnouncementId(jSONObject.optInt(GroupAnnouncement.GROUP_ANNOUNCEMENT_ID));
            groupAnnouncement.setContent(jSONObject.optString("content"));
            groupAnnouncement.setEditor(jSONObject.optString(GroupAnnouncement.GROUP_ANNOUNCEMENT_EDITOR));
            groupAnnouncement.setEditorTime(jSONObject.optLong("editorTime"));
            groupAnnouncement.setEditorUid(jSONObject.optLong("editorUid"));
            groupAnnouncement.setRead((short) jSONObject.optInt("unreand", 0));
            groupAnnouncement.setUnreadCount(jSONObject.optInt(GroupAnnouncement.GROUP_ANNOUNCEMENT_UNREAD_COUNT));
            return groupAnnouncement;
        }
        return null;
    }

    private List<GroupPermit> a(JSONObject jSONObject, long j) {
        Object[] objArr = {jSONObject, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90fdcfb1f0f316fb71f329714a45f5fa", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90fdcfb1f0f316fb71f329714a45f5fa");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject != null) {
                GroupPermit groupPermit = new GroupPermit();
                groupPermit.setGid(j);
                groupPermit.setName(next);
                groupPermit.setStringValue(optJSONObject.optString(Constants.TagConstants.TAG_VALUE));
                arrayList.add(groupPermit);
            }
        }
        return arrayList;
    }

    private void a(@NonNull final IMNotice iMNotice, SessionId sessionId) throws JSONException {
        boolean z;
        Object[] objArr = {iMNotice, sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51f36a13d91ef2b26d5b0e313af0453c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51f36a13d91ef2b26d5b0e313af0453c");
        } else if (a(iMNotice.getData(), iMNotice.getChatId())) {
            a(sessionId, new Callback<List<GroupMember>>() { // from class: com.sankuai.xm.group.c.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(List<GroupMember> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9007e48b2c083f8fe7378da1682e4a67", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9007e48b2c083f8fe7378da1682e4a67");
                    } else {
                        c.this.b(iMNotice.getChannel(), iMNotice.getChatId());
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f19fe8156a468b7ece0fe7bff83b3626", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f19fe8156a468b7ece0fe7bff83b3626");
                    } else if (i == 4) {
                        c.this.d(iMNotice.getChannel(), iMNotice.getChatId());
                    } else if (i != 10) {
                    } else {
                        c.this.c(iMNotice.getChannel(), iMNotice.getChatId());
                    }
                }
            });
        } else {
            List<GroupMember> b = b(iMNotice.getData(), iMNotice.getChatId());
            loop0: while (true) {
                for (GroupMember groupMember : b) {
                    z = groupMember.getUid() == IMClient.a().k() || z;
                }
            }
            if (z) {
                a(iMNotice.getChatId(), false);
                c(iMNotice.getChannel(), iMNotice.getChatId());
                a(iMNotice.getChannel(), iMNotice.getChatId());
                return;
            }
            PersonalDBProxy.l().m().a(b);
            d(iMNotice.getChannel(), iMNotice.getChatId());
        }
    }

    private boolean a(String str, long j) throws JSONException {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d54d901cdeabb3e2d60130f0aa8a9f3d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d54d901cdeabb3e2d60130f0aa8a9f3d")).booleanValue();
        }
        String b = new com.sankuai.xm.base.util.net.c(str).b("versionBefore");
        com.sankuai.xm.im.utils.b a2 = com.sankuai.xm.im.utils.b.a();
        StringBuilder sb = new StringBuilder("gmember_request_version_");
        sb.append(j);
        return !b.equals(a2.getString(sb.toString(), null));
    }

    private List<GroupMember> b(String str, long j) throws JSONException {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06a87b98ff94a19592bd715ba9df8817", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06a87b98ff94a19592bd715ba9df8817");
        }
        ArrayList arrayList = new ArrayList();
        com.sankuai.xm.base.util.net.c cVar = new com.sankuai.xm.base.util.net.c(str);
        String b = cVar.b("versionAfter");
        JSONArray f = cVar.f("ul");
        if (f != null && f.length() > 0) {
            for (int i = 0; i < f.length(); i++) {
                long j2 = f.getLong(i);
                if (j2 != 0) {
                    GroupMember groupMember = new GroupMember();
                    groupMember.setGid(j);
                    groupMember.setUid(j2);
                    arrayList.add(groupMember);
                }
            }
        }
        com.sankuai.xm.im.utils.b a2 = com.sankuai.xm.im.utils.b.a();
        com.sankuai.xm.im.utils.b.a(a2.a("gmember_request_version_" + j, b));
        return arrayList;
    }

    private List<GroupMember> a(long j, String str, String str2) throws JSONException {
        Object[] objArr = {new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b807690a1a2e3968d2d86f8fd85fbf15", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b807690a1a2e3968d2d86f8fd85fbf15");
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has(str2)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str2);
            if (jSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    GroupMember groupMember = new GroupMember();
                    groupMember.setGid(j);
                    groupMember.setUid(jSONArray.getLong(i));
                    groupMember.setRole(str2);
                    arrayList.add(groupMember);
                }
                return arrayList;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d15734479ab269c74dcbb71e2c369c57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d15734479ab269c74dcbb71e2c369c57");
            return;
        }
        if (z) {
            VCard vCard = new VCard();
            vCard.setInfoId(j);
            vCard.setStatus((short) 3);
            CommonDBProxy.l().k.a(vCard, new String[]{"status"}, null);
        }
        PersonalDBProxy.l().a(new Runnable() { // from class: com.sankuai.xm.group.c.9
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4348ca9e8ec030624716becc9b64d27", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4348ca9e8ec030624716becc9b64d27");
                    return;
                }
                final com.sankuai.xm.group.db.d m = PersonalDBProxy.l().m();
                final long j2 = j;
                Object[] objArr3 = {new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.group.db.d.b;
                if (PatchProxy.isSupport(objArr3, m, changeQuickRedirect3, false, "af55d72e520e0ce8468e305e1d3acf1c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, m, changeQuickRedirect3, false, "af55d72e520e0ce8468e305e1d3acf1c");
                } else {
                    m.c.a(new Runnable() { // from class: com.sankuai.xm.group.db.d.5
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5169b650eaa8b4cc8ae367b1c79a1635", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5169b650eaa8b4cc8ae367b1c79a1635");
                            } else {
                                m.c.bR_().a(GroupMember.TABLE_NAME, "gid=?", new String[]{String.valueOf(j2)});
                            }
                        }
                    }, (Callback) null);
                }
                PersonalDBProxy.l().o().b(j);
                final com.sankuai.xm.group.db.e n = PersonalDBProxy.l().n();
                final long j3 = j;
                Object[] objArr4 = {new Long(j3), null};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.group.db.e.b;
                if (PatchProxy.isSupport(objArr4, n, changeQuickRedirect4, false, "d5918e0d472c908db71794b798b24ccc", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, n, changeQuickRedirect4, false, "d5918e0d472c908db71794b798b24ccc");
                } else {
                    n.c.a(new Runnable() { // from class: com.sankuai.xm.group.db.e.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9765fc27445cf87f6555972ab23cfaa8", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9765fc27445cf87f6555972ab23cfaa8");
                                return;
                            }
                            try {
                                n.c.bR_().a(GroupPermit.TABLE_NAME, "gid=?", new String[]{String.valueOf(j3)});
                                n.a(r4, null, 0, "addOrUpdate");
                            } catch (Throwable th) {
                                n.a(r4, null, 10019, "addOrUpdate");
                                throw th;
                            }
                        }
                    }, (Callback) null);
                }
                com.sankuai.xm.im.utils.b a2 = com.sankuai.xm.im.utils.b.a();
                com.sankuai.xm.im.utils.b.a(a2.a("gmember_request_last_time_" + j));
                com.sankuai.xm.im.utils.b a3 = com.sankuai.xm.im.utils.b.a();
                com.sankuai.xm.im.utils.b.a(a3.a("gmember_request_version_" + j));
                com.sankuai.xm.im.utils.b a4 = com.sankuai.xm.im.utils.b.a();
                com.sankuai.xm.im.utils.b.a(a4.a("gannouncement_request_last_time_" + j));
                com.sankuai.xm.im.utils.b a5 = com.sankuai.xm.im.utils.b.a();
                com.sankuai.xm.im.utils.b.a(a5.a("gpermit_request_last_time_" + j));
                com.sankuai.xm.im.utils.b a6 = com.sankuai.xm.im.utils.b.a();
                com.sankuai.xm.im.utils.b.a(a6.a("gpermit_request_version_" + j));
            }
        }, (Callback) null);
    }

    private void a(short s, final long j) {
        Object[] objArr = {Short.valueOf(s), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71afbc6eae2a0856a60c57ff60c5c355", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71afbc6eae2a0856a60c57ff60c5c355");
        } else if (IMClient.a().a(s)) {
            ((l) b_(l.class)).b(com.sankuai.xm.imui.controller.group.a.class).a(s, -1).a(new b.a<com.sankuai.xm.imui.controller.group.a>() { // from class: com.sankuai.xm.group.c.10
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(com.sankuai.xm.imui.controller.group.a aVar) {
                    com.sankuai.xm.imui.controller.group.a aVar2 = aVar;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c35e460437f47a42af11465fdc379b7", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c35e460437f47a42af11465fdc379b7")).booleanValue();
                    }
                    aVar2.a(j);
                    return false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(short s, final long j) {
        Object[] objArr = {Short.valueOf(s), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5f4cd8f785b176dfd17f14eba2bdcd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5f4cd8f785b176dfd17f14eba2bdcd0");
        } else if (IMClient.a().a(s)) {
            ((l) b_(l.class)).b(com.sankuai.xm.imui.controller.group.b.class).a(s, -1).a(new b.a<com.sankuai.xm.imui.controller.group.b>() { // from class: com.sankuai.xm.group.c.11
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(com.sankuai.xm.imui.controller.group.b bVar) {
                    com.sankuai.xm.imui.controller.group.b bVar2 = bVar;
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "063e141f874d870259c0d373730819fb", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "063e141f874d870259c0d373730819fb")).booleanValue();
                    }
                    bVar2.c(j);
                    return false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(short s, final long j) {
        Object[] objArr = {Short.valueOf(s), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a940948e04e1e85c4ba46f3e6dc67171", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a940948e04e1e85c4ba46f3e6dc67171");
        } else if (IMClient.a().a(s)) {
            ((l) b_(l.class)).b(com.sankuai.xm.imui.controller.group.b.class).a(s, -1).a(new b.a<com.sankuai.xm.imui.controller.group.b>() { // from class: com.sankuai.xm.group.c.12
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(com.sankuai.xm.imui.controller.group.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15a64cf8ea5b63c01aefad5acc5adfd6", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15a64cf8ea5b63c01aefad5acc5adfd6")).booleanValue();
                    }
                    return false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(short s, final long j) {
        Object[] objArr = {Short.valueOf(s), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06f96f216d1849d07a1837926e9e504d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06f96f216d1849d07a1837926e9e504d");
        } else if (IMClient.a().a(s)) {
            ((l) b_(l.class)).b(com.sankuai.xm.imui.controller.group.d.class).a(s, -1).a(new b.a<com.sankuai.xm.imui.controller.group.d>() { // from class: com.sankuai.xm.group.c.14
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(com.sankuai.xm.imui.controller.group.d dVar) {
                    Object[] objArr2 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d0182ec4cb84714a391f3468bc6fb27", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d0182ec4cb84714a391f3468bc6fb27")).booleanValue();
                    }
                    return false;
                }
            });
        }
    }

    @Override // com.sankuai.xm.group.b
    public final void a(SessionId sessionId, boolean z, Callback<List<GroupMember>> callback) {
        Object[] objArr = {sessionId, Byte.valueOf(z ? (byte) 1 : (byte) 0), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3266497ed67ee6c66c53dc1aa39abd8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3266497ed67ee6c66c53dc1aa39abd8e");
        } else if (sessionId == null || sessionId.b <= 0 || sessionId.e != 2) {
            callback.onFailure(10011, "群信息异常");
        } else {
            if (!z) {
                com.sankuai.xm.im.utils.b a2 = com.sankuai.xm.im.utils.b.a();
                long j = a2.getLong("gmember_request_last_time_" + sessionId.b, 0L);
                if (j > 0 && j + 86400000 >= System.currentTimeMillis()) {
                    b(sessionId, callback);
                    return;
                }
            }
            a(sessionId, callback);
        }
    }

    @Override // com.sankuai.xm.group.b
    public final void b(final SessionId sessionId, boolean z, final Callback<GroupAnnouncement> callback) {
        Object[] objArr = {sessionId, (byte) 0, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f207d7a34457d5ee459177dfb30c6f01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f207d7a34457d5ee459177dfb30c6f01");
        } else if (sessionId == null || sessionId.b <= 0 || sessionId.e != 2) {
            callback.onFailure(10011, "群信息异常");
        } else {
            com.sankuai.xm.im.utils.b a2 = com.sankuai.xm.im.utils.b.a();
            long j = a2.getLong("gannouncement_request_last_time_" + sessionId.b, 0L);
            if (j <= 0 || j + 86400000 < System.currentTimeMillis()) {
                Object[] objArr2 = {sessionId, callback};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c77f08266ede793558e9c008668ece5c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c77f08266ede793558e9c008668ece5c");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("gid", Long.valueOf(sessionId.b));
                d dVar = new d(a.a("/mtinfo/api/v1/groupAnnouncement/getIndex"), hashMap, new com.sankuai.xm.network.httpurlconnection.d() { // from class: com.sankuai.xm.group.c.5
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.network.httpurlconnection.d
                    public final void a(JSONObject jSONObject) throws Exception {
                        Object[] objArr3 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "772ff6d0fe4bb04081569fbfe009d447", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "772ff6d0fe4bb04081569fbfe009d447");
                            return;
                        }
                        GroupAnnouncement a3 = c.this.a(new com.sankuai.xm.base.util.net.c(jSONObject).g("data"), sessionId);
                        if (a3 != null) {
                            com.sankuai.xm.im.utils.b a4 = com.sankuai.xm.im.utils.b.a();
                            com.sankuai.xm.im.utils.b.a(a4.a("gannouncement_request_last_time_" + sessionId.b, System.currentTimeMillis()));
                            if (!a3.equals(PersonalDBProxy.l().o().a(sessionId.b))) {
                                PersonalDBProxy.l().o().a(a3, null);
                            }
                            if (callback != null) {
                                callback.onSuccess(a3);
                                return;
                            }
                            return;
                        }
                        com.sankuai.xm.im.utils.a.d("GroupServiceImpl::queryGroupAnnouncement::onSuccess groupAnnouncement parse error: resJson = %s", jSONObject);
                        a(10100, "结果解析异常");
                    }

                    @Override // com.sankuai.xm.network.httpurlconnection.d
                    public final void a(int i, String str) {
                        Object[] objArr3 = {Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "77fd174a0534a79e7816798841dfc0a3", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "77fd174a0534a79e7816798841dfc0a3");
                            return;
                        }
                        com.sankuai.xm.im.utils.a.d("GroupServiceImpl::queryGroupAnnouncement::onFailure code = %s, msg = %s", Integer.valueOf(i), str);
                        if (i == 10) {
                            c.this.a(sessionId.b, false);
                        } else if (i == 401) {
                            c.this.a(sessionId.b, true);
                        } else if (i == 404) {
                            PersonalDBProxy.l().o().b(sessionId.b);
                        }
                        if (callback != null) {
                            callback.onFailure(i, str);
                        }
                    }
                });
                StringBuilder sb = new StringBuilder();
                sb.append((int) sessionId.g);
                dVar.b("cnl", sb.toString());
                g.a().a((com.sankuai.xm.network.httpurlconnection.e) dVar, 0L);
                return;
            }
            Object[] objArr3 = {sessionId, callback};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "267037bef468674908a360da1577e1ab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "267037bef468674908a360da1577e1ab");
            } else if (sessionId == null || sessionId.b <= 0 || sessionId.e != 2) {
                if (callback != null) {
                    callback.onFailure(10011, "群信息异常");
                }
            } else {
                GroupAnnouncement a3 = PersonalDBProxy.l().o().a(sessionId.b);
                if (callback != null) {
                    callback.onSuccess(a3);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SessionId sessionId, Callback<List<GroupMember>> callback) {
        Object[] objArr = {sessionId, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d023255db4e678a59ce33dc68817245", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d023255db4e678a59ce33dc68817245");
        } else if (sessionId != null && sessionId.b > 0 && sessionId.e == 2) {
            PersonalDBProxy.l().m().a(sessionId.b, callback);
        } else if (callback != null) {
            callback.onFailure(10011, "群信息异常");
        }
    }
}
