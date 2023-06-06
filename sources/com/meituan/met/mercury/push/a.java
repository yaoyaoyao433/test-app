package com.meituan.met.mercury.push;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.sdk.pike.d;
import com.dianping.sdk.pike.e;
import com.dianping.sdk.pike.f;
import com.dianping.sdk.pike.h;
import com.dianping.sdk.pike.message.b;
import com.dianping.sdk.pike.packet.aj;
import com.dianping.sdk.pike.packet.al;
import com.dianping.sdk.pike.packet.am;
import com.dianping.sdk.pike.service.PikeSyncManager;
import com.meituan.met.mercury.load.core.j;
import com.meituan.met.mercury.load.core.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a implements com.dianping.sdk.pike.a, b, j {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private String c;
    private ExecutorService d;
    private d e;
    private q f;

    private a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd70ce6e55aa91b7ff6b9013033dbbde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd70ce6e55aa91b7ff6b9013033dbbde");
            return;
        }
        this.d = c.a("DDD-pike-push");
        this.c = str;
    }

    public static a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc58ae9c33796f25f628335cb81dbeb9", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc58ae9c33796f25f628335cb81dbeb9");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a(str);
                }
            }
        }
        return b;
    }

    @Override // com.meituan.met.mercury.load.core.j
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "766ca53e678e8cda410a96b112b4ae08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "766ca53e678e8cda410a96b112b4ae08");
        } else {
            h.b(z);
        }
    }

    @Override // com.meituan.met.mercury.load.core.j
    public final void a(Context context, q qVar) {
        Object[] objArr = {context, qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea8a25a9e73f7342f9a6dcfc1eead155", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea8a25a9e73f7342f9a6dcfc1eead155");
            return;
        }
        this.f = qVar;
        e.a aVar = new e.a();
        aVar.b = this.d;
        this.e = d.a(context, aVar.a("dd_bundle_offline").a());
        this.e.s = this;
        this.e.a();
        final d dVar = this.e;
        Object[] objArr2 = {"offlineInfo", this};
        ChangeQuickRedirect changeQuickRedirect2 = d.q;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "7a755a29ef353f26fc7d21b973276add", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "7a755a29ef353f26fc7d21b973276add");
            return;
        }
        final ArrayList arrayList = new ArrayList(Arrays.asList("offlineInfo"));
        Object[] objArr3 = {arrayList, this};
        ChangeQuickRedirect changeQuickRedirect3 = d.q;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "b3f1cdf32f79035fafbf1b1675138d31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "b3f1cdf32f79035fafbf1b1675138d31");
        } else if (dVar.a((com.dianping.sdk.pike.a) this)) {
            if (arrayList.isEmpty()) {
                dVar.a(this, -82, "topic is empty.");
                return;
            }
            Object[] objArr4 = {arrayList, (byte) 1, this};
            ChangeQuickRedirect changeQuickRedirect4 = d.q;
            if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "25fac96b105360e74c77175aed467c12", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "25fac96b105360e74c77175aed467c12");
            } else {
                dVar.a(new Runnable() { // from class: com.dianping.sdk.pike.d.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5bda246b58b47274190619f2d1b4349b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5bda246b58b47274190619f2d1b4349b");
                            return;
                        }
                        final al alVar = new al();
                        alVar.b = dVar.c.a;
                        alVar.d = r2 ? 0 : arrayList.isEmpty() ? 2 : 1;
                        alVar.e = arrayList;
                        final com.dianping.sdk.pike.service.q qVar2 = dVar.d;
                        final a aVar2 = this;
                        Object[] objArr6 = {alVar, aVar2};
                        ChangeQuickRedirect changeQuickRedirect6 = com.dianping.sdk.pike.service.q.a;
                        if (PatchProxy.isSupport(objArr6, qVar2, changeQuickRedirect6, false, "f6baf1fae35ebe35d4d31b8daebc39b0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, qVar2, changeQuickRedirect6, false, "f6baf1fae35ebe35d4d31b8daebc39b0");
                        } else {
                            qVar2.a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.16
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass16 anonymousClass16;
                                    PikeSyncManager.TopicRecord topicRecord;
                                    char c = 0;
                                    Object[] objArr7 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "1a82a2021d489a3ef6e983e8266e0482", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "1a82a2021d489a3ef6e983e8266e0482");
                                        return;
                                    }
                                    PikeSyncManager pikeSyncManager = qVar2.m;
                                    al alVar2 = alVar;
                                    char c2 = 1;
                                    Object[] objArr8 = {alVar2};
                                    ChangeQuickRedirect changeQuickRedirect8 = PikeSyncManager.a;
                                    if (PatchProxy.isSupport(objArr8, pikeSyncManager, changeQuickRedirect8, false, "085c53dc6fc4d5b6e38eccbd7fd091fa", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr8, pikeSyncManager, changeQuickRedirect8, false, "085c53dc6fc4d5b6e38eccbd7fd091fa");
                                        anonymousClass16 = this;
                                    } else {
                                        pikeSyncManager.a();
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator<String> it = alVar2.e.iterator();
                                        while (it.hasNext()) {
                                            String next = it.next();
                                            if (!com.dianping.nvtunnelkit.utils.f.a(next)) {
                                                am amVar = new am();
                                                String str = alVar2.b;
                                                Object[] objArr9 = new Object[2];
                                                objArr9[c] = str;
                                                objArr9[c2] = next;
                                                ChangeQuickRedirect changeQuickRedirect9 = PikeSyncManager.a;
                                                Iterator<String> it2 = it;
                                                if (PatchProxy.isSupport(objArr9, pikeSyncManager, changeQuickRedirect9, false, "90b307b93eead4a5d90139ef3c659499", RobustBitConfig.DEFAULT_VALUE)) {
                                                    topicRecord = (PikeSyncManager.TopicRecord) PatchProxy.accessDispatch(objArr9, pikeSyncManager, changeQuickRedirect9, false, "90b307b93eead4a5d90139ef3c659499");
                                                } else {
                                                    String str2 = "";
                                                    if (com.dianping.sdk.pike.f.j == f.a.Beta) {
                                                        str2 = "beta/";
                                                    } else if (com.dianping.sdk.pike.f.j == f.a.Stage) {
                                                        str2 = "stage/";
                                                    }
                                                    topicRecord = (PikeSyncManager.TopicRecord) com.meituan.android.cipstorage.q.a(pikeSyncManager.b, pikeSyncManager.c, 2).a(str2 + str + "/" + next, PikeSyncManager.TopicRecord.CREATOR);
                                                }
                                                if (topicRecord != null) {
                                                    amVar.b = topicRecord.b;
                                                    amVar.c = topicRecord.c;
                                                    pikeSyncManager.a(str).a(next, Integer.valueOf(topicRecord.b));
                                                } else {
                                                    amVar.a = next;
                                                }
                                                arrayList2.add(amVar);
                                                it = it2;
                                                c2 = 1;
                                                c = 0;
                                            }
                                        }
                                        alVar2.c = arrayList2;
                                        anonymousClass16 = this;
                                    }
                                    qVar2.a(alVar, aVar2);
                                }
                            });
                        }
                    }
                }, this);
            }
        }
    }

    @Override // com.dianping.sdk.pike.message.b
    public final void a(List<com.dianping.sdk.pike.message.e> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "634fe3f54c9830648a5f1d921f8c6b05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "634fe3f54c9830648a5f1d921f8c6b05");
            return;
        }
        for (com.dianping.sdk.pike.message.e eVar : list) {
            try {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a05fbfbf396e8df2febfb1319e5fbe46", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a05fbfbf396e8df2febfb1319e5fbe46");
                } else {
                    com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("handleMessage");
                    bVar.a("topic", eVar.f);
                    com.meituan.met.mercury.load.utils.c.a(bVar);
                    if ("offlineInfo".equals(eVar.f)) {
                        a(eVar);
                    }
                    final com.dianping.sdk.pike.message.f fVar = new com.dianping.sdk.pike.message.f(eVar.e);
                    fVar.c = "reply rrpc message!".getBytes();
                    final d dVar = this.e;
                    Object[] objArr3 = {fVar};
                    ChangeQuickRedirect changeQuickRedirect3 = d.q;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "6fc4c32fdb521f6d2ce62ae04e2dba9a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "6fc4c32fdb521f6d2ce62ae04e2dba9a");
                    } else if (dVar.a((com.dianping.sdk.pike.a) null)) {
                        Object[] objArr4 = {fVar};
                        ChangeQuickRedirect changeQuickRedirect4 = d.q;
                        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "fbdb930e10233a85c8276eae8e2eec08", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "fbdb930e10233a85c8276eae8e2eec08");
                        } else {
                            dVar.a(new Runnable() { // from class: com.dianping.sdk.pike.d.3
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "58d8e11f558d8e931f3bb7c72213d9d1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "58d8e11f558d8e931f3bb7c72213d9d1");
                                        return;
                                    }
                                    final aj ajVar = new aj();
                                    ajVar.e = dVar.c.a;
                                    ajVar.f = fVar.h;
                                    ajVar.b = fVar.c;
                                    final com.dianping.sdk.pike.service.q qVar = dVar.d;
                                    final String str = fVar.b;
                                    Object[] objArr6 = {str, ajVar};
                                    ChangeQuickRedirect changeQuickRedirect6 = com.dianping.sdk.pike.service.q.a;
                                    if (PatchProxy.isSupport(objArr6, qVar, changeQuickRedirect6, false, "68bad0b788bdf1fc54bcb11d3c9c065a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, qVar, changeQuickRedirect6, false, "68bad0b788bdf1fc54bcb11d3c9c065a");
                                    } else {
                                        qVar.a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.15
                                            public static ChangeQuickRedirect a;

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Object[] objArr7 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "4e0ac766c6f381dbf1801d2bf7639285", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "4e0ac766c6f381dbf1801d2bf7639285");
                                                    return;
                                                }
                                                q.a(qVar, str, ajVar);
                                                q.a(qVar, ajVar);
                                            }
                                        });
                                    }
                                }
                            }, (com.dianping.sdk.pike.a) null);
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void a(com.dianping.sdk.pike.message.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0124f47072a6778fa2244663a9510dcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0124f47072a6778fa2244663a9510dcc");
            return;
        }
        try {
            String str = new String(eVar.d);
            com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("handleOfflineMessage");
            bVar.a("msg", str);
            com.meituan.met.mercury.load.utils.c.a(bVar);
            JSONObject jSONObject = new JSONObject(str);
            if (a(jSONObject)) {
                String optString = jSONObject.optString("dynamicAppType");
                String optString2 = jSONObject.optString("name");
                String optString3 = jSONObject.optString("version");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                    this.f.a(optString, optString2, optString3);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean a(JSONObject jSONObject) {
        boolean z;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91f0ea43f2610664ef03f5be56942fd2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91f0ea43f2610664ef03f5be56942fd2")).booleanValue();
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("platformList");
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    z = false;
                    break;
                } else if (TextUtils.equals("Android", jSONArray.getString(i))) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("appList");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    String string = jSONArray2.getString(i2);
                    if (TextUtils.equals(this.c, string)) {
                        return true;
                    }
                    if (TextUtils.equals("Nova", this.c) && TextUtils.equals("dianping_robust_patch", string)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.dianping.sdk.pike.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53aeebc018887ce3c65cc15fa15ac716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53aeebc018887ce3c65cc15fa15ac716");
            return;
        }
        com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("pike-onSuccess");
        bVar.a("response", str);
        com.meituan.met.mercury.load.utils.c.a(bVar);
    }

    @Override // com.dianping.sdk.pike.a
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4068f5b827a9d7983c74209697cc7d0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4068f5b827a9d7983c74209697cc7d0b");
            return;
        }
        com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("pike-onFailed");
        bVar.a("errorMessage", str);
        bVar.a("errorCode", Integer.valueOf(i));
        com.meituan.met.mercury.load.utils.c.a(bVar);
    }
}
