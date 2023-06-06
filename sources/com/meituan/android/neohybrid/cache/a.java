package com.meituan.android.neohybrid.cache;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static Pair<StringBuffer, JSONObject> b = new Pair<>(new StringBuffer(), new JSONObject());
    private static final AtomicBoolean c = new AtomicBoolean(false);

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f16e589f1a0b6089cc24cfcb5db6bf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f16e589f1a0b6089cc24cfcb5db6bf5");
        } else if (c.compareAndSet(false, true)) {
            new com.meituan.android.paybase.asynctask.a<Object, Object, String>() { // from class: com.meituan.android.neohybrid.cache.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paybase.asynctask.b
                public final /* synthetic */ Object a(Object[] objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "6deab4f99f20940d6b4913e14aae3ae2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "6deab4f99f20940d6b4913e14aae3ae2") : com.meituan.android.neohybrid.init.a.c().o();
                }

                @Override // com.meituan.android.paybase.asynctask.b
                public final /* synthetic */ void a(Object obj) {
                    String str = (String) obj;
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7adb01312dfda1250997090814a16697", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7adb01312dfda1250997090814a16697");
                        return;
                    }
                    a.b(str);
                    a.c.set(false);
                }
            }.b(new Object[0]);
        }
    }

    public static synchronized String b() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d749c13b3fa79527ef474657abbee88", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d749c13b3fa79527ef474657abbee88");
            } else if (com.meituan.android.neohybrid.init.a.d() != null && !TextUtils.isEmpty((CharSequence) b.first) && a((JSONObject) b.second)) {
                return ((StringBuffer) b.first).toString();
            } else {
                String o = com.meituan.android.neohybrid.init.a.c().o();
                b(o);
                return o;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "856451643cbf5f24d8f7e65440eb4057", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "856451643cbf5f24d8f7e65440eb4057");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            b = new Pair<>(new StringBuffer(str), d());
        }
    }

    private static boolean a(@Nullable JSONObject jSONObject) {
        JSONObject d;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9e57c99c074713b737b1f6e5482f44a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9e57c99c074713b737b1f6e5482f44a")).booleanValue();
        }
        if (jSONObject == null || jSONObject.length() <= 0 || (d = d()) == null || d.length() <= 0) {
            return false;
        }
        Iterator<String> keys = d.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject.has(next)) {
                return false;
            }
            try {
                if (!jSONObject.get(next).equals(d.get(next))) {
                    if (DeviceInfo.TM.equals(next)) {
                        if (d.getLong(DeviceInfo.TM) - jSONObject.getLong(DeviceInfo.TM) <= 890000) {
                            return true;
                        }
                    }
                    return false;
                }
            } catch (JSONException unused) {
                return false;
            }
        }
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:20:0x0046
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @android.support.annotation.Nullable
    private static org.json.JSONObject d() {
        /*
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r8 = com.meituan.android.neohybrid.cache.a.a
            java.lang.String r9 = "424bc2140a96fb38bfc7cfa480271a8a"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r8
            r5 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1c
            r1 = 1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r8, r1, r9)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
        L1c:
            android.content.Context r0 = com.meituan.android.neohybrid.init.a.d()
            if (r0 != 0) goto L23
            return r2
        L23:
            java.lang.String r1 = "unknown"
            java.lang.String r3 = "unknown"
            java.lang.String r4 = "unknown"
            java.lang.String r5 = com.meituan.android.common.unionid.oneid.util.AppUtil.getIMEI1(r0)     // Catch: java.lang.Exception -> L4d
            if (r5 != 0) goto L34
            java.lang.String r5 = ""
        L34:
            java.lang.String r6 = "000000000000000"
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Exception -> L4d
            if (r6 != 0) goto L3d
            r1 = r5
        L3d:
            java.lang.String r5 = com.meituan.android.common.unionid.oneid.util.AppUtil.getIMSI(r0)     // Catch: java.lang.Exception -> L4d
            if (r5 != 0) goto L4b
            java.lang.String r3 = ""
            goto L63
        L46:
            r3 = move-exception
            r10 = r5
            r5 = r3
            r3 = r10
            goto L4e
        L4b:
            r3 = r5
            goto L63
        L4d:
            r5 = move-exception
        L4e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "HybridParamsCache_getFingerprintVerification_e: "
            r6.<init>(r7)
            java.lang.String r5 = r5.toString()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.meituan.android.neohybrid.util.f.a(r5)
        L63:
            java.lang.String r0 = com.meituan.android.common.statistics.utils.AppUtil.getNetWorkType(r0)     // Catch: java.lang.Exception -> L68
            goto L69
        L68:
            r0 = r4
        L69:
            java.lang.String r4 = "unknown"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L85
            java.lang.String r4 = "unknown"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L85
            java.lang.String r4 = "unknown"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L85
            return r2
        L85:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "imei"
            r4.put(r5, r1)     // Catch: org.json.JSONException -> La7
            java.lang.String r1 = "imsi"
            r4.put(r1, r3)     // Catch: org.json.JSONException -> La7
            java.lang.String r1 = "network"
            r4.put(r1, r0)     // Catch: org.json.JSONException -> La7
            java.lang.String r0 = "timestamp"
            long r5 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> La7
            r4.put(r0, r5)     // Catch: org.json.JSONException -> La7
            return r4
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.cache.a.d():org.json.JSONObject");
    }
}
