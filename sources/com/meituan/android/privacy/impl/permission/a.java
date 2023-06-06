package com.meituan.android.privacy.impl.permission;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.q;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    public static final Integer b = 1;
    public static final Integer c = 2;
    private static volatile a e;
    @NonNull
    private final q d;

    private a(@NonNull Context context, @NonNull PermissionGuard permissionGuard) {
        Object[] objArr = {context, permissionGuard};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e98d5053b562875203392626c086fe6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e98d5053b562875203392626c086fe6");
            return;
        }
        this.d = q.a(context, "permission", 2);
        if (this.d.b("version", 1) != 1) {
            this.d.c();
        }
        this.d.a("version", 1);
    }

    public static a a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "266297951305554b28dca043a0159b1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "266297951305554b28dca043a0159b1e");
        }
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    e = new a(context, PermissionGuard.a.a);
                }
            }
        }
        return e;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.privacy.impl.permission.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0351a {
        public static ChangeQuickRedirect a;
        final Map<String, C0352a> b;
        private final String d;
        private final ag<C0351a> e;

        /* compiled from: ProGuard */
        /* renamed from: com.meituan.android.privacy.impl.permission.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0352a {
            public static ChangeQuickRedirect a;
            int b;
            long c;

            private C0352a() {
                Object[] objArr = {C0351a.this};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "578257e62e65bca3cdf71991a70a4b8f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "578257e62e65bca3cdf71991a70a4b8f");
                }
            }
        }

        public C0351a(String str) {
            Object[] objArr = {a.this, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a002246be0b817975664b5671ec0cb7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a002246be0b817975664b5671ec0cb7");
                return;
            }
            this.b = new ConcurrentHashMap();
            this.e = new ag<C0351a>() { // from class: com.meituan.android.privacy.impl.permission.a.a.1
                public static ChangeQuickRedirect a;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.meituan.android.cipstorage.ag
                /* renamed from: a */
                public C0351a deserializeFromString(String str2) {
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "792248b27e6e3b7770781a8c52017ba2", RobustBitConfig.DEFAULT_VALUE)) {
                        return (C0351a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "792248b27e6e3b7770781a8c52017ba2");
                    }
                    try {
                        if (!TextUtils.isEmpty(str2)) {
                            JSONObject jSONObject = new JSONObject(str2);
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                                C0352a c0352a = new C0352a();
                                c0352a.b = jSONObject2.getInt("state");
                                c0352a.c = jSONObject2.getLong("lastTs");
                                C0351a.this.b.put(next, c0352a);
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    return null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.meituan.android.cipstorage.ag
                /* renamed from: a */
                public String serializeAsString(C0351a c0351a) {
                    Object[] objArr2 = {c0351a};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b484de4ae6bc2f97b795bfeb609addde", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b484de4ae6bc2f97b795bfeb609addde");
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, C0352a> entry : C0351a.this.b.entrySet()) {
                            C0352a value = entry.getValue();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("state", value.b);
                            jSONObject2.put("lastTs", value.c);
                            jSONObject.put(entry.getKey(), jSONObject2);
                        }
                        return jSONObject.toString();
                    } catch (Throwable th) {
                        th.printStackTrace();
                        return null;
                    }
                }
            };
            this.d = str;
        }

        @WorkerThread
        void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6066ea7c0401ccbda7212af47d5debe9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6066ea7c0401ccbda7212af47d5debe9");
                return;
            }
            q qVar = a.this.d;
            qVar.a("businessId:" + this.d, this.e);
        }

        public final boolean a(com.meituan.android.privacy.interfaces.def.permission.a aVar) {
            C0352a c0352a;
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "795cfb1498bc83f8619abf08a50dd72b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "795cfb1498bc83f8619abf08a50dd72b")).booleanValue();
            }
            String[] strArr = {aVar.f(), aVar.a()};
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                if (!TextUtils.isEmpty(str) && (c0352a = this.b.get(str)) != null && a.c.equals(Integer.valueOf(c0352a.b))) {
                    return true;
                }
            }
            return false;
        }

        public final void a(String str, Integer num) {
            Object[] objArr = {str, num};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b081871c4e69434244bc942ddb541b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b081871c4e69434244bc942ddb541b8");
                return;
            }
            C0352a c0352a = new C0352a();
            if (num == null) {
                C0352a c0352a2 = this.b.get(str);
                if (c0352a2 != null) {
                    c0352a.b = c0352a2.b;
                }
            } else {
                c0352a.b = num.intValue();
            }
            c0352a.c = System.currentTimeMillis();
            this.b.put(str, c0352a);
            q qVar = a.this.d;
            qVar.a("businessId:" + this.d, (String) this, (ag<String>) this.e);
        }

        public final boolean a(int i, com.meituan.android.privacy.interfaces.def.permission.a aVar) {
            C0352a c0352a;
            Object[] objArr = {Integer.valueOf(i), aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c86060c574fc4f917c297d9ffa893e2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c86060c574fc4f917c297d9ffa893e2")).booleanValue();
            }
            if (aVar == null) {
                return false;
            }
            return i <= 0 || (c0352a = this.b.get(aVar.f())) == null || System.currentTimeMillis() - c0352a.c > ((long) i) * DDLoadConstants.TIME_HOURS_MILLIS;
        }
    }

    @WorkerThread
    public final C0351a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87a7d9c64264f5a93bc77713a9dacea7", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0351a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87a7d9c64264f5a93bc77713a9dacea7");
        }
        C0351a c0351a = new C0351a(str);
        c0351a.a();
        return c0351a;
    }

    @WorkerThread
    public final C0351a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52ffcd1cb717a127640b5c9b3090f445", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0351a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52ffcd1cb717a127640b5c9b3090f445");
        }
        C0351a c0351a = new C0351a(str);
        c0351a.a();
        return c0351a;
    }
}
