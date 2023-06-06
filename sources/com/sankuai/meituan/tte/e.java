package com.sankuai.meituan.tte;

import android.content.Context;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.tte.x;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class e {
    public static ChangeQuickRedirect a;
    private static volatile e h;
    final ConcurrentHashMap<String, Object> b;
    volatile boolean c;
    volatile int d;
    volatile int e;
    volatile int f;
    volatile int g;
    private final a i;
    private final a j;
    private volatile int k;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b6bb5a55046bcecabfc001232aa6daa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b6bb5a55046bcecabfc001232aa6daa");
            return;
        }
        this.b = new ConcurrentHashMap<>();
        this.i = new a();
        this.j = new a();
        this.c = false;
        this.k = 1800;
        this.d = 10;
        this.e = 0;
        this.f = 5;
        this.g = 604800;
    }

    public static e a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acf6aa3f739e9ad22e7f356f806e5558", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acf6aa3f739e9ad22e7f356f806e5558");
        }
        if (h == null) {
            synchronized (e.class) {
                if (h == null && context != null) {
                    e eVar = new e();
                    Object[] objArr2 = {context};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "8e2b755084b1eb24566f80055b5c811d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "8e2b755084b1eb24566f80055b5c811d");
                    } else {
                        Horn.init(context);
                        eVar.a(Horn.accessCache("TTEEncryption"));
                        Horn.register("TTEEncryption", new HornCallback() { // from class: com.sankuai.meituan.tte.e.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.common.horn.HornCallback
                            public final void onChanged(boolean z, String str) {
                                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8b010b5269792b0a141780f5dc260fd1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8b010b5269792b0a141780f5dc260fd1");
                                } else if (z) {
                                    e.this.a(str);
                                }
                            }
                        });
                    }
                    h = eVar;
                }
            }
        }
        return h;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        volatile boolean b;
        volatile boolean c;
        volatile boolean d;
        volatile boolean e;
        volatile boolean f;
        volatile boolean g;
        volatile boolean h;
        volatile boolean i;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56be9a05f5209fe82ad37fdc33fd3bff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56be9a05f5209fe82ad37fdc33fd3bff");
                return;
            }
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = false;
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
        }

        public final boolean a() {
            return this.b || this.e;
        }

        public final boolean b() {
            return this.b || this.f;
        }

        public final boolean c() {
            return this.b || this.g;
        }
    }

    @VisibleForTesting
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdb15932257ca1f971aa6303964bfb45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdb15932257ca1f971aa6303964bfb45");
            return;
        }
        try {
            u.b("ConfigManager", "config: " + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            a(jSONObject, this.i, "sm");
            a(jSONObject, this.j, "fips");
            this.c = jSONObject.optBoolean("tte.forceRSAKeyStore", false);
            this.k = jSONObject.optInt("ka.agreementInterval", 1800);
            this.d = jSONObject.optInt("ka.maxAgreementTimesPer24Hours", 10);
            this.e = jSONObject.optInt("ka.networkErrorMaxRetryTimes", 0);
            this.f = jSONObject.optInt("ka.networkErrorRetryIntervalBase", 5);
            this.g = jSONObject.optInt("ka.keyLifetime", 604800);
            u.a(jSONObject.optInt("tte.loggingLevel", 2));
            this.b.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.b.put(next, jSONObject.get(next));
            }
        } catch (Throwable unused) {
        }
    }

    private void a(JSONObject jSONObject, a aVar, String str) {
        Object[] objArr = {jSONObject, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f53bc7256964097a14e02a8fc9bd57e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f53bc7256964097a14e02a8fc9bd57e");
            return;
        }
        aVar.b = jSONObject.optBoolean("tte." + str + ".disabled", false);
        aVar.c = jSONObject.optBoolean("tte." + str + ".disableEncrypt", false);
        aVar.d = jSONObject.optBoolean("tte." + str + ".disableDecrypt", false);
        aVar.e = jSONObject.optBoolean("tte." + str + ".disableKeyStore", false);
        aVar.f = jSONObject.optBoolean("tte." + str + ".disableKeyAgreement", false);
        aVar.g = jSONObject.optBoolean("tte." + str + ".disableKeyVerification", false);
        aVar.h = jSONObject.optBoolean("tte." + str + ".disableLaunchTask", false);
        aVar.i = jSONObject.optBoolean("tte." + str + ".useEmbeddedKey", false);
    }

    public final a a(x.a aVar) {
        return aVar == x.a.SM ? this.i : this.j;
    }

    public final a a(x.c cVar) {
        return cVar == x.c.SM4_GCM ? this.i : this.j;
    }

    public final long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6649c9be6d97571d33f39cb994e5d01", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6649c9be6d97571d33f39cb994e5d01")).longValue() : this.k * 1000;
    }
}
