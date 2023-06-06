package com.sankuai.xm.ui.service.internal.impl;

import android.app.Application;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.group.db.PersonalDBProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.controller.group.bean.AtMeInfo;
import com.sankuai.xm.imui.controller.group.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends com.sankuai.xm.base.service.a implements com.sankuai.xm.ui.service.c {
    public static ChangeQuickRedirect a;
    private volatile com.sankuai.xm.base.sp.c b;

    @Override // com.sankuai.xm.base.service.a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf869176834bf522cc2c392bcb82f927", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf869176834bf522cc2c392bcb82f927");
            return;
        }
        d.b("GroupAtService::bindUser," + j, new Object[0]);
        super.a(j);
        if (j == 0) {
            return;
        }
        Application a2 = com.sankuai.xm.base.lifecycle.d.d().a();
        this.b = new com.sankuai.xm.base.sp.c(a2, "AT_ME_INFO_" + j, 0);
        final long j2 = IMClient.a().b;
        Object[] objArr2 = {300000L, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "376f5da319c44070988f16e71b688683", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "376f5da319c44070988f16e71b688683");
        } else {
            com.sankuai.xm.threadpool.scheduler.a.b().a(15, j.a(new Runnable() { // from class: com.sankuai.xm.ui.service.internal.impl.b.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4f5d21eef770cac0ad03ebe953a9d722", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4f5d21eef770cac0ad03ebe953a9d722");
                    } else if (b.this.b != null) {
                        SharedPreferences.Editor edit = b.this.b.edit();
                        Map<String, ?> all = b.this.b.getAll();
                        if (all == null) {
                            return;
                        }
                        try {
                            long currentTimeMillis = System.currentTimeMillis() - j2;
                            for (Map.Entry<String, ?> entry : all.entrySet()) {
                                if (!entry.getKey().equals("xm_sdk_loaded") && new JSONObject((String) entry.getValue()).optLong(AtMeInfo.TIME_STAMP) < currentTimeMillis) {
                                    edit.remove(entry.getKey());
                                }
                            }
                            edit.apply();
                        } catch (JSONException e) {
                            d.d("GroupAtService::cleanOldInfoOnDelay::error," + e, new Object[0]);
                        }
                    }
                }
            }), 300000L);
        }
    }

    @Override // com.sankuai.xm.ui.service.c
    public final void a(AtMeInfo atMeInfo) {
        Object[] objArr = {atMeInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "015fc46b55742837db8e9c329eb51ebf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "015fc46b55742837db8e9c329eb51ebf");
        } else if (this.b == null) {
            d.d("GroupAtService::insertAtMeInfo::sp file not ready," + atMeInfo, new Object[0]);
        } else {
            this.b.edit().putString(a(atMeInfo.getGid(), atMeInfo.getUuid()), atMeInfo.toJson()).apply();
        }
    }

    @Override // com.sankuai.xm.ui.service.c
    public final void a(SessionId sessionId, final String str) {
        Object[] objArr = {sessionId, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77fa35b9617be33294560bc3a66b0a88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77fa35b9617be33294560bc3a66b0a88");
        } else if (this.b == null) {
            d.d("GroupAtService::deleteAtMeInfo::sp file not ready," + str, new Object[0]);
        } else if (TextUtils.isEmpty(str) || sessionId == null || !sessionId.i()) {
            d.d("GroupAtService::deleteAtMeInfo::param error," + str + CommonConstant.Symbol.COMMA + sessionId, new Object[0]);
        } else {
            this.b.edit().remove(a(sessionId.b, str)).apply();
            if (this.b.getLong("xm_sdk_loaded", 0L) == 0) {
                final com.sankuai.xm.group.db.a aVar = PersonalDBProxy.l().k;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.group.db.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "aa92737628ddd7736396dbc9ccd964f2", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "aa92737628ddd7736396dbc9ccd964f2");
                } else if (str != null) {
                    aVar.b.a(new Runnable() { // from class: com.sankuai.xm.group.db.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "adf96dddd5660bec0d460923744d2ac8", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "adf96dddd5660bec0d460923744d2ac8");
                            } else {
                                aVar.b.bR_().a(AtMeInfo.TABLE_NAME, "uuid=?", new String[]{str});
                            }
                        }
                    }, (Callback) null);
                }
            }
        }
    }

    @Override // com.sankuai.xm.ui.service.c
    public final void a(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19019cbc256cc90048aa259e307a1260", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19019cbc256cc90048aa259e307a1260");
        } else if (this.b == null || sessionId == null || !sessionId.i()) {
            d.d("GroupAtService::deleteAtMeInfo::sp file not ready or params error," + sessionId, new Object[0]);
        } else {
            SharedPreferences.Editor edit = this.b.edit();
            Map<String, ?> all = this.b.getAll();
            if (all == null) {
                return;
            }
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (entry.getKey().contains(sessionId.b + "#")) {
                    edit.remove(entry.getKey());
                }
            }
            edit.apply();
            if (this.b.getLong("xm_sdk_loaded", 0L) == 0) {
                final com.sankuai.xm.group.db.a aVar = PersonalDBProxy.l().k;
                final long j = sessionId.b;
                Object[] objArr2 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.group.db.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "2d790a6e9cd41eba8bf1aba92637b217", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "2d790a6e9cd41eba8bf1aba92637b217");
                } else {
                    aVar.b.a(new Runnable() { // from class: com.sankuai.xm.group.db.a.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d89e2c28b16d5e11a98a14831e121186", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d89e2c28b16d5e11a98a14831e121186");
                            } else {
                                aVar.b.bR_().a(AtMeInfo.TABLE_NAME, "gid=?", new String[]{String.valueOf(j)});
                            }
                        }
                    }, (Callback) null);
                }
            }
        }
    }

    @Override // com.sankuai.xm.ui.service.c
    public final void a(@Nullable final SessionId sessionId, final Callback<List<AtMeInfo>> callback) {
        Object[] objArr = {sessionId, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03b55dac486edd40776c27e0f1abb100", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03b55dac486edd40776c27e0f1abb100");
        } else if (this.b == null) {
            if (callback != null) {
                callback.onFailure(-1, "GroupAtService::queryAtMeInfoList::sp file not ready");
            }
        } else {
            final IMClient.g<Void> gVar = new IMClient.g<Void>() { // from class: com.sankuai.xm.ui.service.internal.impl.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.g
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr2 = {r11};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5435613a93459b418c093dbb17ead24e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5435613a93459b418c093dbb17ead24e");
                        return;
                    }
                    Map<String, ?> all = b.this.b.getAll();
                    if (all == null) {
                        if (callback != null) {
                            callback.onSuccess(null);
                            return;
                        }
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    try {
                        for (Map.Entry<String, ?> entry : all.entrySet()) {
                            if (!entry.getKey().equals("xm_sdk_loaded")) {
                                if (sessionId != null) {
                                    if (entry.getKey().contains(sessionId.b + "#")) {
                                    }
                                }
                                if (entry.getValue() instanceof String) {
                                    arrayList.add(new AtMeInfo(new JSONObject((String) entry.getValue())));
                                } else {
                                    d.b("GroupAtService::queryAtMeInfoList::" + entry.getKey() + CommonConstant.Symbol.COMMA + entry.getValue(), new Object[0]);
                                }
                            }
                        }
                        if (callback != null) {
                            callback.onSuccess(arrayList);
                        }
                    } catch (JSONException unused) {
                        d.d("GroupAtService::queryAtMeInfoList::error," + sessionId, new Object[0]);
                        if (callback != null) {
                            Callback callback2 = callback;
                            callback2.onFailure(-1, "queryAtMeInfoList::error," + sessionId);
                        }
                    }
                }
            };
            Object[] objArr2 = {gVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16f7473402e11e39a5227de75ea79b5f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16f7473402e11e39a5227de75ea79b5f");
            } else if (this.b == null || this.b.getLong("xm_sdk_loaded", 0L) != 0) {
                gVar.a(null);
            } else {
                final Callback<List<AtMeInfo>> callback2 = new Callback<List<AtMeInfo>>() { // from class: com.sankuai.xm.ui.service.internal.impl.b.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final /* synthetic */ void onSuccess(List<AtMeInfo> list) {
                        List<AtMeInfo> list2 = list;
                        Object[] objArr3 = {list2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4b4133088b79b9b18db2e7309e1756a0", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4b4133088b79b9b18db2e7309e1756a0");
                        } else if (com.sankuai.xm.base.util.b.a(list2)) {
                            b.this.b.edit().putLong("xm_sdk_loaded", System.currentTimeMillis()).apply();
                            gVar.a(null);
                        } else {
                            SharedPreferences.Editor edit = b.this.b.edit();
                            for (AtMeInfo atMeInfo : list2) {
                                edit.putString(b.this.a(atMeInfo.getGid(), atMeInfo.getUuid()), atMeInfo.toJson());
                            }
                            edit.putLong("xm_sdk_loaded", System.currentTimeMillis());
                            edit.apply();
                            gVar.a(null);
                        }
                    }

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final void onFailure(int i, String str) {
                        Object[] objArr3 = {Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "621b35b7082e62111111a08ac956e510", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "621b35b7082e62111111a08ac956e510");
                            return;
                        }
                        d.d("GroupAtService::loadOldData::error," + i, new Object[0]);
                        gVar.a(null);
                    }
                };
                final com.sankuai.xm.group.db.a aVar = PersonalDBProxy.l().k;
                Object[] objArr3 = {callback2};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.group.db.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "e2b33f2483af46a5f9f8389affb7b1c4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "e2b33f2483af46a5f9f8389affb7b1c4");
                } else {
                    aVar.b.a(new Runnable() { // from class: com.sankuai.xm.group.db.a.3
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: Removed duplicated region for block: B:122:0x00bd  */
                        /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List, T, java.util.ArrayList] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                r12 = this;
                                r0 = 0
                                java.lang.Object[] r8 = new java.lang.Object[r0]
                                com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.group.db.a.AnonymousClass3.a
                                java.lang.String r10 = "ed1cf114195ecd1d65741fef85628276"
                                r4 = 0
                                r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                                r1 = r8
                                r2 = r12
                                r3 = r9
                                r5 = r10
                                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                                if (r1 == 0) goto L18
                                com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r9, r0, r10)
                                return
                            L18:
                                com.sankuai.xm.base.tinyorm.b r0 = new com.sankuai.xm.base.tinyorm.b
                                r0.<init>()
                                com.sankuai.xm.group.db.a r1 = r1
                                com.sankuai.xm.group.db.PersonalDBProxy r1 = r1.b
                                com.sankuai.xm.base.db.c r2 = r1.bR_()
                                r1 = 0
                                java.lang.String r3 = "at_me_info"
                                r4 = 0
                                r5 = 0
                                r6 = 0
                                r7 = 0
                                r8 = 0
                                r9 = 0
                                android.database.Cursor r2 = r2.a(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8d
                                if (r2 == 0) goto L71
                                int r1 = r2.getCount()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lad
                                if (r1 > 0) goto L3b
                                goto L71
                            L3b:
                                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lad
                                r1.<init>()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lad
                            L40:
                                boolean r3 = r2.moveToNext()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lad
                                if (r3 == 0) goto L56
                                com.sankuai.xm.base.tinyorm.f r3 = com.sankuai.xm.base.tinyorm.f.a()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lad
                                java.lang.Class<com.sankuai.xm.imui.controller.group.bean.AtMeInfo> r4 = com.sankuai.xm.imui.controller.group.bean.AtMeInfo.class
                                java.lang.Object r3 = r3.a(r4, r2)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lad
                                com.sankuai.xm.imui.controller.group.bean.AtMeInfo r3 = (com.sankuai.xm.imui.controller.group.bean.AtMeInfo) r3     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lad
                                r1.add(r3)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lad
                                goto L40
                            L56:
                                r0.c = r1     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> Lad
                                if (r2 == 0) goto L63
                                boolean r1 = r2.isClosed()
                                if (r1 != 0) goto L63
                                r2.close()
                            L63:
                                com.sankuai.xm.base.callback.Callback r1 = r2
                                if (r1 == 0) goto Lac
                                com.sankuai.xm.base.callback.Callback r1 = r2
                                T r0 = r0.c
                            L6b:
                                r1.onSuccess(r0)
                                return
                            L6f:
                                r1 = move-exception
                                goto L91
                            L71:
                                if (r2 == 0) goto L7c
                                boolean r1 = r2.isClosed()
                                if (r1 != 0) goto L7c
                                r2.close()
                            L7c:
                                com.sankuai.xm.base.callback.Callback r1 = r2
                                if (r1 == 0) goto L87
                                com.sankuai.xm.base.callback.Callback r1 = r2
                                T r0 = r0.c
                                r1.onSuccess(r0)
                            L87:
                                return
                            L88:
                                r2 = move-exception
                                r11 = r2
                                r2 = r1
                                r1 = r11
                                goto Lae
                            L8d:
                                r2 = move-exception
                                r11 = r2
                                r2 = r1
                                r1 = r11
                            L91:
                                java.lang.String r3 = "imui"
                                java.lang.String r4 = "AtMeInfoDBProxy::queryAll"
                                com.sankuai.xm.monitor.statistics.a.a(r3, r4, r1)     // Catch: java.lang.Throwable -> Lad
                                if (r2 == 0) goto La3
                                boolean r1 = r2.isClosed()
                                if (r1 != 0) goto La3
                                r2.close()
                            La3:
                                com.sankuai.xm.base.callback.Callback r1 = r2
                                if (r1 == 0) goto Lac
                                com.sankuai.xm.base.callback.Callback r1 = r2
                                T r0 = r0.c
                                goto L6b
                            Lac:
                                return
                            Lad:
                                r1 = move-exception
                            Lae:
                                if (r2 == 0) goto Lb9
                                boolean r3 = r2.isClosed()
                                if (r3 != 0) goto Lb9
                                r2.close()
                            Lb9:
                                com.sankuai.xm.base.callback.Callback r2 = r2
                                if (r2 == 0) goto Lc4
                                com.sankuai.xm.base.callback.Callback r2 = r2
                                T r0 = r0.c
                                r2.onSuccess(r0)
                            Lc4:
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.group.db.a.AnonymousClass3.run():void");
                        }
                    }, callback2);
                }
            }
        }
    }

    @Override // com.sankuai.xm.ui.service.c
    public final void a(short s, final List<IMMessage> list) {
        Object[] objArr = {Short.valueOf(s), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfd9f3d223647bffcfba7343d0a63322", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfd9f3d223647bffcfba7343d0a63322");
        } else {
            ((l) b_(l.class)).b(f.class).a(s).a(new b.a<f>() { // from class: com.sankuai.xm.ui.service.internal.impl.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(f fVar) {
                    Object[] objArr2 = {fVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2200ae6262fe095f5a8697a491eb4a9f", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2200ae6262fe095f5a8697a491eb4a9f")).booleanValue();
                    }
                    return false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fe34640293fc91f3cf843ba0324c657", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fe34640293fc91f3cf843ba0324c657");
        }
        return j + "#" + str;
    }
}
