package com.meituan.msc.common.config;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a<Config> {
    public static ChangeQuickRedirect a;
    private static final Gson c = new Gson();
    public volatile Config b;
    private final String d;
    private final Class<? extends Config> e;
    private boolean f;

    public Map<String, Object> b() {
        return null;
    }

    public void b(String str) {
    }

    public a(String str, Class<? extends Config> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ad56742a14679b9678f3b22fb4cbf0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ad56742a14679b9678f3b22fb4cbf0e");
            return;
        }
        this.f = false;
        this.d = str;
        this.e = cls;
        a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08dad9dddff69f8389770a36cf0f46a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08dad9dddff69f8389770a36cf0f46a9");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.b = a(Horn.accessCache(this.d));
        g.b("BaseMixedConfig", "Spend", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "ms to read horn config from local:", this.d);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49e09733cee0c7c523fc483d3e5855be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49e09733cee0c7c523fc483d3e5855be");
        } else if (this.f) {
        } else {
            Horn.register(this.d, new HornCallback() { // from class: com.meituan.msc.common.config.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "567b0f8e99374c74da31c0ed4e6fbdda", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "567b0f8e99374c74da31c0ed4e6fbdda");
                    } else if (!z || TextUtils.isEmpty(str)) {
                    } else {
                        a.this.b(str);
                    }
                }
            }, b());
            this.f = true;
        }
    }

    private Config d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33b52c30faf533213dc4c0d03049ef1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Config) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33b52c30faf533213dc4c0d03049ef1e");
        }
        try {
            return this.e.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    public final Config c() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Config a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.common.config.a.a
            java.lang.String r11 = "ddaf954dba3b7341640c6e4fe17ad420"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.Object r13 = (java.lang.Object) r13
            return r13
        L1e:
            java.lang.Class<? extends Config> r1 = r12.e
            r2 = 0
            boolean r3 = android.text.TextUtils.isEmpty(r13)
            if (r3 != 0) goto L3f
            com.google.gson.Gson r3 = com.meituan.msc.common.config.a.c     // Catch: com.google.gson.JsonSyntaxException -> L2e
            java.lang.Object r13 = r3.fromJson(r13, r1)     // Catch: com.google.gson.JsonSyntaxException -> L2e
            goto L40
        L2e:
            r13 = move-exception
            java.lang.String r1 = "BaseMixedConfig"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Failed to parse horn data with horn file: %s"
            r3[r9] = r4
            java.lang.String r4 = r12.d
            r3[r0] = r4
            com.meituan.msc.modules.reporter.g.b(r1, r13, r3)
        L3f:
            r13 = r2
        L40:
            if (r13 != 0) goto L46
            java.lang.Object r13 = r12.d()
        L46:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.common.config.a.a(java.lang.String):java.lang.Object");
    }
}
