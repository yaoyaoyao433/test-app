package com.sankuai.xm.im.session;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.h;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.network.httpurlconnection.e;
import com.sankuai.xm.network.httpurlconnection.g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect a;
    private final c b;

    public b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15213d25a8d3543764433d38f2fd717c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15213d25a8d3543764433d38f2fd717c");
        } else {
            this.b = cVar;
        }
    }

    public final void a(boolean z, int i) {
        long j;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af9b5660c95f638231293ad06e0bddea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af9b5660c95f638231293ad06e0bddea");
            return;
        }
        String str = "";
        if (i == 1) {
            str = com.sankuai.xm.im.http.a.a("/msg/api/chat/v3/chatlist/info");
        } else if (i == 2) {
            str = com.sankuai.xm.im.http.a.a("/msg/api/pub/v1/chatlist/info");
        }
        String str2 = str;
        if (ac.a(str2) || !z) {
            com.sankuai.xm.im.utils.a.b("SessionInfoController", "syncRemoteSessionInfoWithType", "no need query,type = %d", Integer.valueOf(i));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f06ad8cce1cd78c74ca21abdeef3e067", 6917529027641081856L)) {
                j = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f06ad8cce1cd78c74ca21abdeef3e067")).longValue();
            } else {
                com.sankuai.xm.im.utils.b a2 = com.sankuai.xm.im.utils.b.a();
                j = a2.getLong("chat_info_last_query_" + i, 0L);
            }
            jSONObject.put("st", j);
            jSONObject.put("et", com.sankuai.xm.login.c.a().a(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("del");
            jSONArray.put("ext");
            jSONObject.put("fields", jSONArray);
            com.sankuai.xm.base.d dVar = new com.sankuai.xm.base.d(str2, jSONObject, (com.sankuai.xm.network.httpurlconnection.d) null);
            dVar.a(new a(dVar, i, z));
            g.a().a((e) dVar, 0L);
        } catch (JSONException e) {
            com.sankuai.xm.im.utils.a.a("SessionInfoController", "syncRemoteSessionInfoWithType", e, "no need query,type = %d", Integer.valueOf(i));
        }
    }

    public final Pair<SessionId, JSONObject> a(int i, JSONObject jSONObject) {
        Object[] objArr = {Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efe9db4f16b3ddef18b821da26844bbc", 6917529027641081856L)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efe9db4f16b3ddef18b821da26844bbc");
        }
        SessionId sessionIdFromApiJson = MessageUtils.sessionIdFromApiJson(i, jSONObject);
        if (sessionIdFromApiJson == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            String optString = jSONObject.optString("ext");
            if (!ac.a(optString)) {
                jSONObject2.put("ext", new JSONObject(optString));
            }
            jSONObject2.put("extTs", jSONObject.optLong("extTs"));
            return new Pair<>(sessionIdFromApiJson, jSONObject2);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends com.sankuai.xm.network.httpurlconnection.d {
        public static ChangeQuickRedirect a;
        private final int c;
        private final boolean d;
        private final com.sankuai.xm.base.d e;
        private Map<SessionId, Long[]> f;
        private Map<Long, Set<Short>> g;
        private Map<SessionId, JSONObject> m;
        private int n;
        private long o;

        public a(com.sankuai.xm.base.d dVar, int i, boolean z) {
            Object[] objArr = {b.this, dVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "427cb3ea8e696df890dc05b6ec2f9ebe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "427cb3ea8e696df890dc05b6ec2f9ebe");
                return;
            }
            this.e = dVar;
            this.c = i;
            this.d = z;
            this.o = ((Long) dVar.c("et")).longValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(JSONObject jSONObject) throws Exception {
            long j;
            long j2;
            boolean z;
            int i;
            boolean z2;
            int i2 = 1;
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a73139f4328f6e97f44f17b68ea5cf7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a73139f4328f6e97f44f17b68ea5cf7");
                return;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                a(0, this.n);
                return;
            }
            Object[] objArr2 = {optJSONArray};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            long j3 = 0;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6a026cefd468f35a9c5253ab0134115", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6a026cefd468f35a9c5253ab0134115");
                j = 0;
            } else {
                int i3 = 0;
                while (i3 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("type");
                        if (!ac.a(optString)) {
                            char c = 65535;
                            int hashCode = optString.hashCode();
                            if (hashCode != -1335493226) {
                                if (hashCode != 100897) {
                                    if (hashCode == 1549438467 && optString.equals("delChat")) {
                                        c = 1;
                                    }
                                } else if (optString.equals("ext")) {
                                    c = 2;
                                }
                            } else if (optString.equals("delAll")) {
                                c = 0;
                            }
                            switch (c) {
                                case 0:
                                    Object[] objArr3 = {optJSONObject};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d4a3dc49f7f8c95c2c1b25b8c8f8c969", 6917529027641081856L)) {
                                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d4a3dc49f7f8c95c2c1b25b8c8f8c969")).booleanValue();
                                        j2 = 0;
                                    } else {
                                        short optInt = (short) optJSONObject.optInt(MessageStatisticsEntry.PARAM_CHANNEL);
                                        long optLong = optJSONObject.optLong("cleanTs");
                                        j2 = 0;
                                        if (optLong <= 0) {
                                            z = false;
                                        } else {
                                            if (this.g == null) {
                                                this.g = new HashMap();
                                            }
                                            Set<Short> set = this.g.get(Long.valueOf(optLong));
                                            if (set == null) {
                                                set = new HashSet<>();
                                                this.g.put(Long.valueOf(optLong), set);
                                            }
                                            set.add(Short.valueOf(optInt));
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        this.n++;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1:
                                    Object[] objArr4 = new Object[i2];
                                    objArr4[0] = optJSONObject;
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5049543f8297744a1159c79a33f0e3fb", 6917529027641081856L)) {
                                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5049543f8297744a1159c79a33f0e3fb")).booleanValue();
                                        i = 1;
                                    } else {
                                        SessionId sessionIdFromApiJson = MessageUtils.sessionIdFromApiJson(this.c, optJSONObject);
                                        if (sessionIdFromApiJson == null) {
                                            i = 1;
                                            z2 = false;
                                        } else {
                                            if (this.f == null) {
                                                this.f = new HashMap();
                                            }
                                            Long[] lArr = this.f.get(sessionIdFromApiJson);
                                            long optLong2 = optJSONObject.optLong(MessageStatisticsEntry.PARAM_MSG_ID);
                                            if (lArr == null || lArr[0].longValue() < optLong2) {
                                                i = 1;
                                                this.f.put(sessionIdFromApiJson, new Long[]{Long.valueOf(optLong2), Long.valueOf(optJSONObject.optLong("delTs"))});
                                            } else {
                                                i = 1;
                                            }
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        this.n += i;
                                    }
                                    j2 = 0;
                                    break;
                                case 2:
                                    Object[] objArr5 = new Object[i2];
                                    objArr5[0] = optJSONObject;
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "42b31bc6e95d73fa3138ff8d6074608d", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "42b31bc6e95d73fa3138ff8d6074608d");
                                    } else {
                                        Pair<SessionId, JSONObject> a2 = b.this.a(this.c, optJSONObject);
                                        if (a2 != null) {
                                            if (this.m == null) {
                                                this.m = new HashMap();
                                            }
                                            this.m.put(a2.first, a2.second);
                                        }
                                    }
                                    j2 = 0;
                                    break;
                            }
                            i3++;
                            j3 = j2;
                            i2 = 1;
                        }
                    }
                    j2 = j3;
                    i3++;
                    j3 = j2;
                    i2 = 1;
                }
                j = j3;
                if (this.g != null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<Long, Set<Short>> entry : this.g.entrySet()) {
                        Long l = (Long) hashMap.get(entry.getValue());
                        if (l == null || l.longValue() < entry.getKey().longValue()) {
                            hashMap.put(entry.getValue(), entry.getKey());
                        }
                    }
                    com.sankuai.xm.im.utils.a.a("SessionInfoController", "parseAndHandleSessionInfo", "del_all size=%d,filter=%d,sessionType=%d", Integer.valueOf(this.g.size()), Integer.valueOf(hashMap.size()), Integer.valueOf(this.c));
                    int[] a3 = com.sankuai.xm.base.util.b.a(this.c == 1 ? MessageUtils.getAllCategoryOfService(1, 2) : MessageUtils.getAllCategoryOfService(3));
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        Set<Short> set2 = (Set) entry2.getKey();
                        short[] sArr = new short[set2.size()];
                        int i4 = 0;
                        for (Short sh : set2) {
                            sArr[i4] = sh.shortValue();
                            i4++;
                        }
                        b.this.b.a(sArr, a3, true, ((Long) entry2.getValue()).longValue(), true, true, null);
                    }
                    this.g = null;
                }
                if (this.f != null) {
                    b.this.b.a(this.f);
                    this.g = null;
                }
                if (this.m != null) {
                    com.sankuai.xm.im.utils.a.a("%s tags query from api:", "SessionInfoController");
                    b.this.b.b(this.m);
                }
            }
            long optLong3 = jSONObject.optLong("next");
            if (optLong3 > j) {
                com.sankuai.xm.im.utils.a.b("SessionInfoHttpCallback::onSuccess,next=%d,sessionType=%d", Long.valueOf(optLong3), Integer.valueOf(this.c));
                this.e.a("et", Long.valueOf(optLong3));
                g.a().a(this.e, j);
                return;
            }
            a(0, this.n);
        }

        @Override // com.sankuai.xm.network.httpurlconnection.d
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2315e9517fd87232b4708970034af46", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2315e9517fd87232b4708970034af46");
                return;
            }
            com.sankuai.xm.im.utils.a.d("SessionInfoHttpCallback::onFailure,code=%d,sessionType=%d", Integer.valueOf(i), Integer.valueOf(this.c));
            a(i, this.n);
        }

        private void a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0835bd6f26b194d8781ca2473850347f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0835bd6f26b194d8781ca2473850347f");
                return;
            }
            if (h.a(i)) {
                com.sankuai.xm.im.utils.b a2 = com.sankuai.xm.im.utils.b.a();
                a2.a("chat_info_last_query_" + this.c, this.o).apply();
            }
            b(i, i2);
        }

        private void b(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a904cd1a0880f3069501496225e37ad", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a904cd1a0880f3069501496225e37ad");
            } else if (this.d) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", 4);
                hashMap.put("count", Integer.valueOf(i2));
                hashMap.put("result", Integer.valueOf(i));
                hashMap.put(MessageStatisticsEntry.PARAM_MSG_CATEGORY, Integer.valueOf(this.c));
                com.sankuai.xm.monitor.c.a("delete_chat", hashMap);
            }
        }
    }
}
