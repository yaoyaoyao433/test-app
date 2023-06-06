package com.sankuai.xm.im.vcard;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.db.c;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.CommonDBProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.vcard.db.VCard;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h {
    public static ChangeQuickRedirect a;
    private static h b;
    private final Object c;
    private final LinkedHashMap<String, Long> d;
    private final HashMap<String, List<com.sankuai.xm.im.a<VCard>>> e;
    private final HashMap<Short, c> f;
    private volatile c g;

    private static short a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f3aaaf2eba15b91dba7e834fb667ee4", 6917529027641081856L)) {
            return ((Short) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f3aaaf2eba15b91dba7e834fb667ee4")).shortValue();
        }
        switch (i) {
            case 2:
                return (short) 2;
            case 3:
            case 10:
            case 11:
                return (short) 3;
            default:
                return (short) 1;
        }
    }

    public static /* synthetic */ com.sankuai.xm.im.vcard.entity.a a(h hVar, VCard vCard) {
        Object[] objArr = {vCard};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "bd8ac888eaa42b96c9bf98d89c21cb46", 6917529027641081856L)) {
            return (com.sankuai.xm.im.vcard.entity.a) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "bd8ac888eaa42b96c9bf98d89c21cb46");
        }
        if (vCard == null) {
            return null;
        }
        com.sankuai.xm.im.vcard.entity.a aVar = new com.sankuai.xm.im.vcard.entity.a();
        aVar.b = vCard.getAvatarUrl();
        Object[] objArr2 = {vCard, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "c17da34491f8ea4e9e842d4dcbe5ed8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "c17da34491f8ea4e9e842d4dcbe5ed8e");
        } else if (vCard.getStatus() == 3) {
            int type = vCard.getType();
            if (type == 2) {
                aVar.d = IMClient.a().f().getString(R.string.xm_sdk_group);
            } else {
                if (type != 4) {
                    switch (type) {
                        case 10:
                        case 11:
                            break;
                        default:
                            aVar.d = IMClient.a().f().getString(R.string.xm_sdk_invalid_user);
                            break;
                    }
                }
                aVar.d = IMClient.a().f().getString(R.string.xm_sdk_invalid_pub);
            }
        } else {
            aVar.d = vCard.getName();
        }
        aVar.d = vCard.getName();
        aVar.e = vCard.getInfoId();
        aVar.f = (short) vCard.getType();
        aVar.j = vCard.getStatus();
        aVar.g = vCard.getInGroup();
        return aVar;
    }

    public static /* synthetic */ void a(h hVar, int i, HashMap hashMap, final com.sankuai.xm.im.a aVar) {
        Object[] objArr = {Integer.valueOf(i), hashMap, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "432fa2ae5ee18a17c271ba5bf9685767", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "432fa2ae5ee18a17c271ba5bf9685767");
        } else if (hashMap == null || hashMap.isEmpty()) {
            StringBuilder sb = new StringBuilder("VCardController=>onQueryVCardRes=>vCardHashMap =>");
            sb.append(hashMap == null ? "1" : "0");
            com.sankuai.xm.im.utils.a.d(sb.toString(), new Object[0]);
        } else {
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getValue() == null) {
                    arrayList2.add(VCard.obtain(((Long) entry.getKey()).longValue(), i));
                } else {
                    arrayList.add(entry.getValue());
                }
            }
            CommonDBProxy.l().a(j.a(new Runnable() { // from class: com.sankuai.xm.im.vcard.h.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38c3a2f49ea34d154c8780baa73a7a9c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38c3a2f49ea34d154c8780baa73a7a9c");
                        return;
                    }
                    com.sankuai.xm.base.entity.a aVar2 = new com.sankuai.xm.base.entity.a();
                    if (!arrayList2.isEmpty()) {
                        final com.sankuai.xm.im.vcard.db.a aVar3 = CommonDBProxy.l().k;
                        final List<VCard> list = arrayList2;
                        Object[] objArr3 = {list};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.vcard.db.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar3, changeQuickRedirect3, false, "bbaaa37f3f72db92c4bebba2464c9c0a", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, aVar3, changeQuickRedirect3, false, "bbaaa37f3f72db92c4bebba2464c9c0a");
                        } else if (aVar3.e) {
                            synchronized (aVar3.b) {
                                for (VCard vCard : list) {
                                    aVar3.d.remove(aVar3.b(vCard.getInfoId(), vCard.getType()));
                                }
                            }
                        } else {
                            aVar3.c.a(j.a(new Runnable() { // from class: com.sankuai.xm.im.vcard.db.a.6
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aab8a640a6aa9d77f1e721dfce585e3c", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aab8a640a6aa9d77f1e721dfce585e3c");
                                        return;
                                    }
                                    c bR_ = aVar3.c.bR_();
                                    if (list == null) {
                                        bR_.a(VCard.TABLE_NAME, null, null);
                                        aVar3.a();
                                        return;
                                    }
                                    try {
                                        try {
                                            bR_.b();
                                            for (VCard vCard2 : list) {
                                                bR_.a(VCard.TABLE_NAME, "info_id=? AND type=?", new String[]{String.valueOf(vCard2.getInfoId()), String.valueOf(vCard2.getType())});
                                            }
                                            bR_.d();
                                            synchronized (aVar3.b) {
                                                for (VCard vCard3 : list) {
                                                    aVar3.d.remove(aVar3.b(vCard3.getInfoId(), vCard3.getType()));
                                                }
                                            }
                                            if (bR_.g() && bR_.e()) {
                                                bR_.c();
                                            }
                                        } catch (Exception e) {
                                            com.sankuai.xm.monitor.statistics.a.a("imui", "VCardDBProxy::delete", e);
                                            if (bR_.g() && bR_.e()) {
                                                bR_.c();
                                            }
                                        }
                                    } catch (Throwable th) {
                                        if (bR_.g() && bR_.e()) {
                                            bR_.c();
                                        }
                                        throw th;
                                    }
                                }
                            }), (Callback) null);
                        }
                        ArrayList arrayList3 = new ArrayList(arrayList2.size());
                        for (VCard vCard2 : arrayList2) {
                            arrayList3.add(Long.valueOf(vCard2.getInfoId()));
                            synchronized (h.this.d) {
                                h.this.d.put(vCard2.getVCardKey(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                        aVar2.b(arrayList3);
                    }
                    if (!arrayList.isEmpty()) {
                        CommonDBProxy.l().k.a(arrayList);
                        aVar2.a(arrayList);
                        for (VCard vCard3 : arrayList) {
                            synchronized (h.this.d) {
                                h.this.d.put(vCard3.getVCardKey(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                    }
                    aVar.onSuccess(aVar2);
                }
            }), aVar);
        }
    }

    public static /* synthetic */ void a(h hVar, Collection collection, int i, com.sankuai.xm.im.a aVar) {
        Object[] objArr = {collection, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "9e752680b5fdcb4f10d03cf5514b2d33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "9e752680b5fdcb4f10d03cf5514b2d33");
        } else if (com.sankuai.xm.base.util.b.a(collection)) {
            aVar.onSuccess(null);
        } else {
            switch (i) {
                case 1:
                    hVar.a(new g(collection), aVar);
                    return;
                case 2:
                    hVar.a(new com.sankuai.xm.im.vcard.a(collection), aVar);
                    return;
                case 3:
                    hVar.a(new f(collection), aVar);
                    return;
                default:
                    com.sankuai.xm.im.utils.a.c("VCardController::queryMultiVCard::ERR_PARAM, type is %d, ids=%s", Integer.valueOf(i), collection);
                    aVar.onFailure(10011, "error type, type is " + i);
                    return;
            }
        }
    }

    public static /* synthetic */ boolean a(h hVar, final IMMessage iMMessage, final com.sankuai.xm.im.a aVar) {
        Object[] objArr = {iMMessage, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "f85ecdd89f03b34e2284a544f33e245d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "f85ecdd89f03b34e2284a544f33e245d")).booleanValue();
        }
        c a2 = hVar.a(iMMessage.getChannel(), true);
        if (a2 == null) {
            return false;
        }
        return a2.a(iMMessage, new IMClient.g<com.sankuai.xm.im.vcard.entity.a>() { // from class: com.sankuai.xm.im.vcard.h.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.IMClient.g
            public final /* synthetic */ void a(com.sankuai.xm.im.vcard.entity.a aVar2) {
                com.sankuai.xm.im.vcard.entity.a aVar3 = aVar2;
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2db07fa1d9e06c5ccc9830c8ef273988", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2db07fa1d9e06c5ccc9830c8ef273988");
                } else if (aVar3 == null) {
                    aVar.onSuccess(null);
                } else {
                    com.sankuai.xm.im.desensitization.a.a().a(aVar3, d.a(aVar3.e, aVar3.f, iMMessage.getChannel(), iMMessage.getMsgUuid(), iMMessage.getCategory()), aVar);
                }
            }

            @Override // com.sankuai.xm.im.IMClient.g, com.sankuai.xm.base.callback.Callback
            public final void onFailure(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1555b682b59161a8eeb53d1ec5a5b407", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1555b682b59161a8eeb53d1ec5a5b407");
                    return;
                }
                aVar.onFailure(i, str);
                com.sankuai.xm.im.utils.a.d("VCardController=>queryWithProviderByMessage=>onFailure=>code:" + i + ", message:" + str, new Object[0]);
            }
        });
    }

    public static /* synthetic */ boolean a(h hVar, final d dVar, final com.sankuai.xm.im.a aVar) {
        Object[] objArr = {dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "f76f736439b063dece471d10b3bd0c6d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "f76f736439b063dece471d10b3bd0c6d")).booleanValue();
        }
        c a2 = hVar.a(dVar.d, true);
        if (a2 != null) {
            com.sankuai.xm.im.vcard.entity.a a3 = a2.a(dVar);
            if (a3 != null) {
                aVar.onSuccess(a3);
                return true;
            }
            boolean a4 = a2.a(dVar, new com.sankuai.xm.im.a<com.sankuai.xm.im.vcard.entity.a>() { // from class: com.sankuai.xm.im.vcard.h.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    com.sankuai.xm.im.vcard.entity.a aVar2 = (com.sankuai.xm.im.vcard.entity.a) obj;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "423f6f8a7127cf7b43b8c3869ceb626a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "423f6f8a7127cf7b43b8c3869ceb626a");
                    } else {
                        com.sankuai.xm.im.desensitization.a.a().a(aVar2, dVar, aVar);
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "103505597a3ac3d9f927a23644f1105c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "103505597a3ac3d9f927a23644f1105c");
                        return;
                    }
                    aVar.onFailure(i, str);
                    com.sankuai.xm.im.utils.a.d("VCardController=>queryWithProvider=>onFailure=>code:" + i + ", message:" + str, new Object[0]);
                }
            });
            if (a4 || dVar.g < 9) {
                return a4;
            }
            aVar.onFailure(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT, "该账号不支持查询");
            return true;
        } else if (dVar.g >= 9 || !ac.a(dVar.e)) {
            aVar.onFailure(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT, "该账号不支持查询");
            return true;
        } else {
            return false;
        }
    }

    public static /* synthetic */ void b(h hVar, final d dVar, final com.sankuai.xm.im.a aVar) {
        Object[] objArr = {dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "699ac4094cc51b1e144e8a3e7e4366c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "699ac4094cc51b1e144e8a3e7e4366c6");
            return;
        }
        int a2 = hVar.a(dVar.a(), dVar.c, dVar.d, dVar.h, new com.sankuai.xm.im.a<VCard>() { // from class: com.sankuai.xm.im.vcard.h.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.Callback
            public final /* synthetic */ void onSuccess(Object obj) {
                com.sankuai.xm.im.vcard.entity.a a3;
                VCard vCard = (VCard) obj;
                Object[] objArr2 = {vCard};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf445b78643b808d2fef7c27efa42c64", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf445b78643b808d2fef7c27efa42c64");
                    return;
                }
                if (vCard == null) {
                    long a4 = dVar.a();
                    int i = dVar.c;
                    String str = dVar.e;
                    Object[] objArr3 = {new Long(a4), Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.im.vcard.entity.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b28ba51c0aaebb311fc4d616f0f92cae", 6917529027641081856L)) {
                        a3 = (com.sankuai.xm.im.vcard.entity.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b28ba51c0aaebb311fc4d616f0f92cae");
                    } else {
                        com.sankuai.xm.im.vcard.entity.a aVar2 = new com.sankuai.xm.im.vcard.entity.a();
                        aVar2.e = a4;
                        aVar2.f = (short) i;
                        if (str == null) {
                            str = "";
                        }
                        aVar2.h = str;
                        a3 = aVar2;
                    }
                } else {
                    a3 = h.a(h.this, vCard);
                }
                com.sankuai.xm.im.desensitization.a.a().a(a3, dVar, aVar);
            }

            @Override // com.sankuai.xm.base.callback.Callback
            public final void onFailure(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc50a17cc8e95db8dee805c61f16e6c2", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc50a17cc8e95db8dee805c61f16e6c2");
                    return;
                }
                aVar.onFailure(i, str);
                com.sankuai.xm.im.utils.a.d("VCardController=>getVCardFromIm=>queryVCard=>code:" + i + ", message:" + str, new Object[0]);
            }
        });
        if (a2 != 0) {
            aVar.onFailure(a2, "获取用户信息出错");
            com.sankuai.xm.im.utils.a.d("VCardController=>getVCardFromIm=>queryVCard=>code:" + a2 + " ,message:获取用户信息出错", new Object[0]);
        }
    }

    public static /* synthetic */ void b(h hVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "8ee3f4fab10e3b6696655b9665e1e101", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "8ee3f4fab10e3b6696655b9665e1e101");
            return;
        }
        synchronized (hVar.c) {
            hVar.e.remove(str);
        }
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b2b3a78980741a240b1c38229e1975", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b2b3a78980741a240b1c38229e1975");
            return;
        }
        this.c = new Object();
        this.e = new HashMap<>();
        this.f = new HashMap<>();
        this.d = new LinkedHashMap<String, Long>() { // from class: com.sankuai.xm.im.vcard.h.1
            public static ChangeQuickRedirect a;

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
                Object[] objArr2 = {entry};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a71eeca6e7411efbf29582b4e4d1c90", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a71eeca6e7411efbf29582b4e4d1c90")).booleanValue() : ((long) size()) > 200;
            }
        };
    }

    @Deprecated
    public static h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af2d5a840742c8361e9edd973ad865d4", 6917529027641081856L)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af2d5a840742c8361e9edd973ad865d4");
        }
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    b = new h();
                }
            }
        }
        return b;
    }

    @Deprecated
    public final void a(@NonNull d dVar, @NonNull final com.sankuai.xm.im.a<com.sankuai.xm.im.vcard.entity.a> aVar) {
        Object[] objArr = {dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2020f666f1f79269bdf5b32a4dbb1f8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2020f666f1f79269bdf5b32a4dbb1f8a");
            return;
        }
        final d a2 = new d().a(dVar);
        a2.c = a(dVar.c);
        com.sankuai.xm.threadpool.scheduler.a.b().b(j.a(new Runnable() { // from class: com.sankuai.xm.im.vcard.h.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1eadd4dc13210e01a3734d7b904b5044", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1eadd4dc13210e01a3734d7b904b5044");
                } else if (!h.a(h.this, a2, aVar) || a2.d == -1) {
                    h.b(h.this, a2, aVar);
                }
            }
        }));
    }

    private int a(long j, int i, short s, long j2, @NonNull com.sankuai.xm.im.a<VCard> aVar) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Short.valueOf(s), new Long(j2), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ba110495ad0ad56b42a87ef89e9dbc1", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ba110495ad0ad56b42a87ef89e9dbc1")).intValue();
        }
        if (j == 0) {
            return 10011;
        }
        if (!a(j, i, j2)) {
            aVar.onSuccess(CommonDBProxy.l().k.a(j, i));
            return 0;
        }
        String vCardKey = VCard.obtain(j, i).getVCardKey();
        if (a(vCardKey)) {
            synchronized (this) {
                if (a(vCardKey)) {
                    a(vCardKey, aVar);
                    return 0;
                }
            }
        }
        com.sankuai.xm.im.utils.a.b("VCardController::queryVCard online, type is " + i + " peer is " + j + " channel is " + ((int) s), new Object[0]);
        switch (i) {
            case 1:
                a(vCardKey, aVar);
                g gVar = new g(j);
                a(gVar, new a(gVar));
                return 0;
            case 2:
                a(vCardKey, aVar);
                com.sankuai.xm.im.vcard.a aVar2 = new com.sankuai.xm.im.vcard.a(j);
                a(aVar2, new a(aVar2));
                return 0;
            case 3:
                a(vCardKey, aVar);
                f fVar = new f(j);
                a(fVar, new a(fVar));
                return 0;
            default:
                com.sankuai.xm.im.utils.a.c("VCardController::queryVCard::ERR_PARAM, type is " + i, new Object[0]);
                return 10011;
        }
    }

    private void a(final g gVar, final com.sankuai.xm.im.a<com.sankuai.xm.base.entity.a<VCard, Long>> aVar) {
        Object[] objArr = {gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea3e3fdbb3ad01908b73f63aaf367705", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea3e3fdbb3ad01908b73f63aaf367705");
        } else {
            com.sankuai.xm.network.httpurlconnection.g.a().a(gVar.a(new com.sankuai.xm.network.httpurlconnection.d() { // from class: com.sankuai.xm.im.vcard.h.10
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.network.httpurlconnection.d
                public final void a(JSONObject jSONObject) throws Exception {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f9a4a52b2c89611221f63d60b0d9f83", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f9a4a52b2c89611221f63d60b0d9f83");
                        return;
                    }
                    JSONArray f = new com.sankuai.xm.base.util.net.c(jSONObject).f("data");
                    HashMap hashMap = new HashMap();
                    for (Long l : ((e) gVar).d) {
                        hashMap.put(Long.valueOf(l.longValue()), null);
                    }
                    if (f != null && f.length() > 0) {
                        for (int i = 0; i < f.length(); i++) {
                            com.sankuai.xm.base.util.net.c cVar = new com.sankuai.xm.base.util.net.c(f.getJSONObject(i));
                            VCard vCard = new VCard();
                            vCard.setInfoId(cVar.d("uid"));
                            vCard.setType(1);
                            vCard.setName(cVar.b("name"));
                            vCard.setAvatarUrl(cVar.b("avatarUrl"));
                            vCard.setBigAvatarUrl(cVar.b("bigAvatarUrl"));
                            vCard.setUpdateStamp(System.currentTimeMillis());
                            vCard.setExtension(cVar.b("extend"));
                            short c = (short) cVar.c("status");
                            if (c == 0) {
                                c = 1;
                            }
                            vCard.setStatus(c);
                            hashMap.put(Long.valueOf(vCard.getInfoId()), vCard);
                        }
                    }
                    h.a(h.this, 1, hashMap, aVar);
                }

                @Override // com.sankuai.xm.network.httpurlconnection.d
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5503c42fc5cdfa4f13d35393629e4462", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5503c42fc5cdfa4f13d35393629e4462");
                    } else {
                        aVar.onFailure(i, str);
                    }
                }
            }), 0L);
        }
    }

    private void a(final com.sankuai.xm.im.vcard.a aVar, final com.sankuai.xm.im.a<com.sankuai.xm.base.entity.a<VCard, Long>> aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd39cf43d12fa99e880df13d60b520e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd39cf43d12fa99e880df13d60b520e1");
        } else {
            com.sankuai.xm.network.httpurlconnection.g.a().a(aVar.a(new com.sankuai.xm.network.httpurlconnection.d() { // from class: com.sankuai.xm.im.vcard.h.11
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.network.httpurlconnection.d
                public final void a(JSONObject jSONObject) throws Exception {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f2ffd7048a284a5cef9f885560640ef", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f2ffd7048a284a5cef9f885560640ef");
                        return;
                    }
                    JSONArray f = new com.sankuai.xm.base.util.net.c(jSONObject).f("data");
                    HashMap hashMap = new HashMap();
                    for (Long l : ((e) aVar).d) {
                        hashMap.put(Long.valueOf(l.longValue()), null);
                    }
                    if (f != null && f.length() > 0) {
                        for (int i = 0; i < f.length(); i++) {
                            com.sankuai.xm.base.util.net.c cVar = new com.sankuai.xm.base.util.net.c(f.getJSONObject(i));
                            String b2 = cVar.b("avatarUrl");
                            String b3 = cVar.b("info");
                            String b4 = cVar.b("name");
                            VCard vCard = new VCard();
                            vCard.setType(2);
                            vCard.setInfoId(cVar.d("id"));
                            vCard.setUpdateStamp(System.currentTimeMillis());
                            vCard.setAvatarUrl(b2);
                            vCard.setName(b4);
                            vCard.setDescription(b3);
                            short c = (short) cVar.c("status");
                            if (c == 0) {
                                c = 1;
                            }
                            vCard.setStatus(c);
                            vCard.setInGroup((short) cVar.c("ingroup"));
                            hashMap.put(Long.valueOf(vCard.getInfoId()), vCard);
                        }
                    }
                    h.a(h.this, 2, hashMap, aVar2);
                }

                @Override // com.sankuai.xm.network.httpurlconnection.d
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d11105f54e4fde6af9f8ce764f3090d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d11105f54e4fde6af9f8ce764f3090d");
                    } else {
                        aVar2.onFailure(i, str);
                    }
                }
            }), 0L);
        }
    }

    private void a(final f fVar, final com.sankuai.xm.im.a<com.sankuai.xm.base.entity.a<VCard, Long>> aVar) {
        Object[] objArr = {fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3d5332b3c5c4f827e9d2f996fdcca0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3d5332b3c5c4f827e9d2f996fdcca0a");
        } else {
            com.sankuai.xm.network.httpurlconnection.g.a().a(fVar.a(new com.sankuai.xm.network.httpurlconnection.d() { // from class: com.sankuai.xm.im.vcard.h.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.network.httpurlconnection.d
                public final void a(JSONObject jSONObject) throws Exception {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b04fc5c5c9d74e84c7d8cfdbda47ce96", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b04fc5c5c9d74e84c7d8cfdbda47ce96");
                        return;
                    }
                    JSONArray f = new com.sankuai.xm.base.util.net.c(jSONObject).f("data");
                    HashMap hashMap = new HashMap();
                    for (Long l : ((e) fVar).d) {
                        hashMap.put(Long.valueOf(l.longValue()), null);
                    }
                    for (int i = 0; i < f.length(); i++) {
                        com.sankuai.xm.base.util.net.c cVar = new com.sankuai.xm.base.util.net.c(f.getJSONObject(i));
                        VCard vCard = new VCard();
                        vCard.setInfoId(cVar.d("pubId"));
                        vCard.setAvatarUrl(cVar.b("avatarUrl"));
                        vCard.setName(cVar.b("name"));
                        short c = (short) cVar.c("status");
                        if (c == 0) {
                            c = 1;
                        }
                        vCard.setStatus(c);
                        vCard.setType(3);
                        vCard.setUpdateStamp(System.currentTimeMillis());
                        hashMap.put(Long.valueOf(vCard.getInfoId()), vCard);
                    }
                    h.a(h.this, 3, hashMap, aVar);
                }

                @Override // com.sankuai.xm.network.httpurlconnection.d
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69e817710f49dff65699fcf89af4c049", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69e817710f49dff65699fcf89af4c049");
                    } else {
                        aVar.onFailure(i, str);
                    }
                }
            }), 0L);
        }
    }

    private boolean a(long j, int i, long j2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "394a5a085db00184aeaedba31b48642c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "394a5a085db00184aeaedba31b48642c")).booleanValue();
        }
        String vCardKey = VCard.obtain(j, i).getVCardKey();
        synchronized (this.d) {
            if (this.d.containsKey(vCardKey)) {
                long longValue = this.d.get(vCardKey).longValue();
                if (longValue != 0 && System.currentTimeMillis() - longValue < 10000) {
                    return false;
                }
            }
            VCard a2 = CommonDBProxy.l().k.a(j, i);
            if (a2 != null) {
                long updateStamp = a2.getUpdateStamp();
                return updateStamp == 0 || System.currentTimeMillis() - updateStamp >= ((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) <= 0 ? 86400000L : Math.max(600000L, j2));
            }
            return true;
        }
    }

    private void a(String str, com.sankuai.xm.im.a<VCard> aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a45f9beaf446de33397f7efd5737f41e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a45f9beaf446de33397f7efd5737f41e");
            return;
        }
        synchronized (this.c) {
            List<com.sankuai.xm.im.a<VCard>> list = this.e.get(str);
            if (list != null) {
                list.add(aVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                this.e.put(str, arrayList);
            }
        }
    }

    private boolean a(String str) {
        boolean containsKey;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f69edae245f37b86a261a08abd640d76", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f69edae245f37b86a261a08abd640d76")).booleanValue();
        }
        synchronized (this.c) {
            containsKey = this.e.containsKey(str);
        }
        return containsKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.sankuai.xm.im.a<VCard>> b(String str) {
        List<com.sankuai.xm.im.a<VCard>> list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc98b18ac246fe83a40849b89dc0a9cc", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc98b18ac246fe83a40849b89dc0a9cc");
        }
        synchronized (this.c) {
            list = this.e.get(str);
            if (list != null) {
                list = new ArrayList(list);
            }
        }
        return list;
    }

    private synchronized c a(short s, boolean z) {
        Object[] objArr = {Short.valueOf(s), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f73ecdfb33c0be5500b419fa03df660", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f73ecdfb33c0be5500b419fa03df660");
        }
        c cVar = this.f.get(Short.valueOf(s));
        if (cVar == null && z) {
            cVar = this.g;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements com.sankuai.xm.im.a<com.sankuai.xm.base.entity.a<VCard, Long>> {
        public static ChangeQuickRedirect a;
        private e c;

        @Override // com.sankuai.xm.base.callback.Callback
        public final /* synthetic */ void onSuccess(Object obj) {
            com.sankuai.xm.base.entity.a aVar = (com.sankuai.xm.base.entity.a) obj;
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4c2fbfed47f11891271fe36448b5b21", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4c2fbfed47f11891271fe36448b5b21");
                return;
            }
            int i = this.c.e;
            if (!com.sankuai.xm.base.util.b.a(aVar.a())) {
                for (VCard vCard : aVar.a()) {
                    List<com.sankuai.xm.im.a> b = h.this.b(vCard.getVCardKey());
                    if (b != null) {
                        h.b(h.this, vCard.getVCardKey());
                        for (com.sankuai.xm.im.a aVar2 : b) {
                            aVar2.onSuccess(vCard);
                        }
                    }
                }
            }
            if (com.sankuai.xm.base.util.b.a(aVar.b())) {
                return;
            }
            for (Long l : aVar.b()) {
                String str = l.longValue() + CommonConstant.Symbol.UNDERLINE + i;
                List<com.sankuai.xm.im.a> b2 = h.this.b(str);
                if (b2 != null) {
                    h.b(h.this, str);
                    for (com.sankuai.xm.im.a aVar3 : b2) {
                        aVar3.onFailure(1, "没有用户相关数据");
                    }
                }
            }
            com.sankuai.xm.im.utils.a.d("VCardDispatchCallback.onFailure, code=404, ids=%s", aVar.b());
        }

        public a(e eVar) {
            Object[] objArr = {h.this, eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91200d0098f95c98f93f59b194da84e6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91200d0098f95c98f93f59b194da84e6");
            } else {
                this.c = eVar;
            }
        }

        @Override // com.sankuai.xm.base.callback.Callback
        public final void onFailure(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48cab1565f364779870322ab08f64ff3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48cab1565f364779870322ab08f64ff3");
                return;
            }
            Set<Long> set = this.c.d;
            int i2 = this.c.e;
            Iterator<Long> it = set.iterator();
            while (it.hasNext()) {
                String str2 = it.next() + CommonConstant.Symbol.UNDERLINE + i2;
                List<com.sankuai.xm.im.a> b = h.this.b(str2);
                if (b != null) {
                    h.b(h.this, str2);
                    for (com.sankuai.xm.im.a aVar : b) {
                        aVar.onFailure(i, str);
                    }
                }
            }
            com.sankuai.xm.im.utils.a.d("VCardDispatchCallback.onFailure, code=%d, ids=%s", Integer.valueOf(i), set);
        }
    }

    public final void b(@NonNull final d dVar, @NonNull final com.sankuai.xm.im.a<com.sankuai.xm.base.entity.a<com.sankuai.xm.im.vcard.entity.a, Long>> aVar) {
        Object[] objArr = {dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91610772ad67e6a7de0a56efe51a6f39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91610772ad67e6a7de0a56efe51a6f39");
        } else if (a(dVar.d, false) != null) {
            aVar.onFailure(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_AD_EVENT, "this channel don't support multi infos query");
        } else {
            if (dVar.b.contains(0L)) {
                com.sankuai.xm.im.utils.a.c("VCardController::queryUIInfos, 查询列表中包含 id = 0 账号，已被移除", new Object[0]);
                dVar.b.remove((Object) 0L);
            }
            if (dVar.b.isEmpty()) {
                aVar.onFailure(10011, "no valid id list");
            } else {
                com.sankuai.xm.threadpool.scheduler.a.b().b(j.a(new Runnable() { // from class: com.sankuai.xm.im.vcard.h.6
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f7e92b6a8c62d73965cfe5fa1333aa5", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f7e92b6a8c62d73965cfe5fa1333aa5");
                            return;
                        }
                        final com.sankuai.xm.base.entity.a<VCard, Long> a2 = CommonDBProxy.l().k.a(dVar.b, dVar.c);
                        ArrayList arrayList = new ArrayList();
                        if (a2 == null) {
                            arrayList.addAll(dVar.b);
                        } else {
                            arrayList.addAll(a2.b());
                            for (VCard vCard : a2.a()) {
                                long updateStamp = vCard.getUpdateStamp();
                                long max = dVar.h <= 0 ? 86400000L : Math.max(600000L, dVar.h);
                                if (updateStamp == 0 || System.currentTimeMillis() - updateStamp >= max) {
                                    arrayList.add(Long.valueOf(vCard.getInfoId()));
                                }
                            }
                        }
                        h.a(h.this, arrayList, dVar.c, new com.sankuai.xm.im.a<com.sankuai.xm.base.entity.a<VCard, Long>>() { // from class: com.sankuai.xm.im.vcard.h.6.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.xm.base.callback.Callback
                            public final /* synthetic */ void onSuccess(Object obj) {
                                com.sankuai.xm.base.entity.a aVar2 = (com.sankuai.xm.base.entity.a) obj;
                                Object[] objArr3 = {aVar2};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b347fcf55568448579981ff5bbb6ab5f", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b347fcf55568448579981ff5bbb6ab5f");
                                    return;
                                }
                                com.sankuai.xm.base.entity.a aVar3 = new com.sankuai.xm.base.entity.a();
                                HashSet hashSet = new HashSet();
                                if (a2 != null) {
                                    for (VCard vCard2 : a2.a()) {
                                        hashSet.add(h.a(h.this, vCard2));
                                    }
                                }
                                if (aVar2 != null) {
                                    aVar3.b(aVar2.b());
                                    for (VCard vCard3 : aVar2.a()) {
                                        hashSet.add(h.a(h.this, vCard3));
                                    }
                                }
                                aVar3.a(hashSet);
                                aVar.onSuccess(aVar3);
                            }

                            @Override // com.sankuai.xm.base.callback.Callback
                            public final void onFailure(int i, String str) {
                                Object[] objArr3 = {Integer.valueOf(i), str};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c62a74f1be4b0e8692b5a97ab9277a67", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c62a74f1be4b0e8692b5a97ab9277a67");
                                    return;
                                }
                                com.sankuai.xm.im.utils.a.d("VCardController::batchQueryVCard, onFailure, code=%d", Integer.valueOf(i));
                                if (a2 == null || com.sankuai.xm.base.util.b.a(a2.a())) {
                                    aVar.onFailure(i, str);
                                    return;
                                }
                                com.sankuai.xm.base.entity.a aVar2 = new com.sankuai.xm.base.entity.a();
                                HashSet hashSet = new HashSet(a2.a().size());
                                for (VCard vCard2 : a2.a()) {
                                    hashSet.add(h.a(h.this, vCard2));
                                }
                                aVar2.a(hashSet);
                                aVar2.b(a2.b());
                                aVar.onSuccess(aVar2);
                            }
                        });
                    }
                }));
            }
        }
    }
}
