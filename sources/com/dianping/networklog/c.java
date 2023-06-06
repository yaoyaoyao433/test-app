package com.dianping.networklog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.networklog.ac;
import com.dianping.titans.ble.TitansBleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.rtmp.TXLiveConstants;
import dianping.com.nvlinker.NVLinker;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c {
    private static a A;
    private static i B;
    private static Context C;
    private static String D;
    private static b E;
    public static ChangeQuickRedirect a;
    public static volatile boolean b;
    public static volatile boolean c;
    public static boolean e;
    public static boolean f;
    public static volatile String h;
    public static volatile boolean j;
    public static volatile boolean s;
    private static final AtomicBoolean z = new AtomicBoolean(false);
    public static int d = -1;
    public static s g = new n();
    private static final LinkedBlockingQueue<Object> F = new LinkedBlockingQueue<>();
    public static volatile int i = 512;
    public static volatile long k = -1;
    public static volatile long l = -1;
    public static volatile long m = -1;
    public static volatile boolean n = true;
    public static volatile boolean o = false;
    public static volatile long p = 2097152;
    public static volatile long q = 31457280;
    public static volatile boolean r = false;
    public static volatile int t = -1;
    public static volatile int u = -1;
    public static volatile boolean v = false;
    public static volatile boolean w = true;
    public static volatile int x = TitansBleManager.MAX_ADVERTISING_TIMEOUT;
    public static volatile Set<String> y = Collections.emptySet();

    /* loaded from: classes.dex */
    public interface a {
        void onLisenterUploadLogStatus(String str, int i);
    }

    public static Context a() {
        return C;
    }

    public static void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29b73cd8c758d842fb336c900d5e6893", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29b73cd8c758d842fb336c900d5e6893");
        } else if (NVLinker.isLinkerInit() && z.compareAndSet(false, true)) {
            d = NVLinker.getAppID();
            C = context.getApplicationContext();
            t.a().b();
        }
    }

    public static void a(a aVar) {
        A = aVar;
    }

    public static void a(i iVar) {
        B = iVar;
    }

    public static void a(String str, int i2) {
        Object[] objArr = {str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4c34078190f281c3769ca515668ff92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4c34078190f281c3769ca515668ff92");
        } else {
            a(str, i2, 1);
        }
    }

    public static void a(String str, int i2, int i3) {
        Object[] objArr = {str, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78ae69cfe3678dfcd7498dc1181bc30b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78ae69cfe3678dfcd7498dc1181bc30b");
        } else {
            a(str, i2, i3, null);
        }
    }

    private static void a(String str, int i2, int i3, String[] strArr) {
        Object[] objArr = {str, Integer.valueOf(i2), Integer.valueOf(i3), strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c520f657efda080b3dfdd7f37bf211df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c520f657efda080b3dfdd7f37bf211df");
        } else {
            a(str, i2, i3, strArr, aj.c(), aj.d());
        }
    }

    public static void a(String str, int i2, int i3, String[] strArr, long j2, long j3) {
        Object[] objArr = {str, Integer.valueOf(i2), Integer.valueOf(i3), strArr, new Long(j2), new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "095937421d68c4f612b150ac5a247c86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "095937421d68c4f612b150ac5a247c86");
        } else if (!g.a("logan")) {
            t.a().c();
        } else if (i3 == 3) {
        } else {
            t.a().a(str, i2, strArr, j2, j3);
        }
    }

    public static void a(String str, int i2, String[] strArr) {
        Object[] objArr = {str, Integer.valueOf(i2), strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04081e165dd229483723172c93fc61b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04081e165dd229483723172c93fc61b3");
        } else {
            a(str, i2, 1, strArr);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a24e9b88a82877164b2a103dd5dbf86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a24e9b88a82877164b2a103dd5dbf86");
            return;
        }
        Iterator<Object> it = F.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public static void a(String str, String str2, Map<String, String> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37530a2a06bbb9faa78b6bfed5f729b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37530a2a06bbb9faa78b6bfed5f729b1");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(map);
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("d", str2);
            }
            jSONObject2.put("f", jSONObject);
            a(jSONObject2.toString(), 23, new String[]{str});
        } catch (JSONException unused) {
        }
    }

    public static void a(String str, String str2, boolean z2, int i2, int i3, boolean z3, boolean z4, String str3) {
        Object[] objArr = {str, str2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db9798dddb04bc8895e279db80bf00e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db9798dddb04bc8895e279db80bf00e0");
        } else if (g.a("logan")) {
            t.a().a(new String[]{str}, str2, z2, i2, i3, z3, z4, str3, null, null);
        } else {
            t.a().c();
        }
    }

    public static void a(boolean z2) {
        e = true;
    }

    private static void a(String[] strArr, String str, int i2, d dVar, String str2) {
        Object[] objArr = {strArr, str, Integer.valueOf(i2), dVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ec5a752db465d9dd3a31f469cd38989", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ec5a752db465d9dd3a31f469cd38989");
        } else if (g.a("logan")) {
            t.a().a(strArr, str, i2, dVar, str2);
        } else {
            t.a().c();
        }
    }

    public static void a(String[] strArr, String str, String str2) {
        Object[] objArr = {strArr, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b06fb74672ea43d5149a28f098b8af69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b06fb74672ea43d5149a28f098b8af69");
        } else {
            a(strArr, str, 1, (d) null, str2);
        }
    }

    public static void b(String str, int i2) {
        Object[] objArr = {str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff0a5748f037820cd67a0ccaa0f1962b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff0a5748f037820cd67a0ccaa0f1962b");
        } else if (A != null) {
            A.onLisenterUploadLogStatus(str, i2);
        }
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa8da137071366fbdf7245c72cce261e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa8da137071366fbdf7245c72cce261e")).booleanValue() : y.contains("*") || y.contains(str);
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f446492268a7f2e50429ef47ea65a848", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f446492268a7f2e50429ef47ea65a848");
        } else if (!j) {
            String a2 = g.a();
            if (!TextUtils.isEmpty(a2) && !a2.equals(h)) {
                try {
                    JSONArray jSONArray = new JSONArray(a2);
                    if (jSONArray.length() > 0) {
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            if (jSONObject.has("configId") && "logan_maxLogFile".equals(jSONObject.get("configId"))) {
                                k = jSONObject.optInt("content", 10) * 1048576;
                            }
                            if (jSONObject.has("configId") && "logan_saveTime".equals(jSONObject.get("configId"))) {
                                l = jSONObject.optInt("content", 7) * 86400000;
                            }
                            if (jSONObject.has("configId") && "logan_minFreeSpace".equals(jSONObject.get("configId"))) {
                                m = jSONObject.optInt("content", 50) * 1048576;
                            }
                        }
                    }
                    h = a2;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            if (k < 0) {
                k = 10485760L;
            }
            if (l < 0) {
                l = 604800000L;
            }
            if (m < 0) {
                m = 52428800L;
            }
        }
    }

    public static void c(String str, int i2) {
        Object[] objArr = {str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b3e8be2bd296b601ae7d5f1b85db241", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b3e8be2bd296b601ae7d5f1b85db241");
        } else if (B != null) {
            B.a(str, i2);
        }
    }

    public static void d() {
        int optInt;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d97f87be22d3801c3f9174d8f29107a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d97f87be22d3801c3f9174d8f29107a6");
        } else if (!c) {
            b bVar = E;
            if (E == null) {
                bVar = new ad(Arrays.asList(new q(), new f(), new ab()));
            }
            JSONObject a2 = bVar.a();
            if (e) {
                String.format("handleGrayConfig[%s]%s", bVar.getClass().getCanonicalName(), a2);
            }
            if (a2 != null) {
                if (a2.has("logan_shard_enable")) {
                    n = a2.optBoolean("logan_shard_enable", true);
                }
                if (n) {
                    if (a2.has("logan_shard_single_file_size")) {
                        p = a2.optInt("logan_shard_single_file_size", 2) * 1048576;
                    }
                    if (a2.has("logan_all_file_size")) {
                        q = a2.optInt("logan_all_file_size", 30) * 1048576;
                    }
                    if (a2.has("logan_over_size_delete")) {
                        r = a2.optBoolean("logan_over_size_delete", false);
                    }
                    if (a2.has("logan_sub_process_enable")) {
                        s = a2.optBoolean("logan_sub_process_enable", false);
                    }
                    if (s && a2.has("logan_enabled_processes")) {
                        JSONArray optJSONArray = a2.optJSONArray("logan_enabled_processes");
                        HashSet hashSet = new HashSet(optJSONArray.length(), 1.0f);
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            String optString = optJSONArray.optString(i2);
                            if (optString != null) {
                                hashSet.add(optString);
                            }
                        }
                        y = hashSet;
                    }
                }
                if (a2.has("logan_max_queue") && (optInt = a2.optInt("logan_max_queue", -1)) > 0) {
                    i = optInt;
                }
                if (a2.has("logan_content_max_length")) {
                    t = a2.optInt("logan_content_max_length", -1);
                }
                if (a2.has("logan_monitor_content_length")) {
                    u = a2.optInt("logan_monitor_content_length", -1);
                }
                if (a2.has("print_action_logan_call_stacktrace")) {
                    v = a2.optBoolean("print_action_logan_call_stacktrace", false);
                }
                if (a2.has("logan_thread_num_use_pthread_id")) {
                    w = a2.optBoolean("logan_thread_num_use_pthread_id", true);
                }
                if (a2.optBoolean("logan_override_switcher", false)) {
                    j = true;
                    k = a2.optInt("logan_maxLogFile", 10) * 1048576;
                    l = a2.optInt("logan_saveTime", 7) * 86400000;
                    m = a2.optInt("logan_minFreeSpace", 50) * 1048576;
                }
                if (a2.has("upload_task_minimum_interval")) {
                    x = a2.optInt("upload_task_minimum_interval", TXLiveConstants.RENDER_ROTATION_180) * 1000;
                }
                if (a2.has("logan_close_upload_retry")) {
                    o = a2.optBoolean("logan_close_upload_retry", false);
                }
            }
        }
    }

    public static String e() {
        return D;
    }

    public static void a(@NonNull Context context, int i2, String str, String str2, @NonNull NVLinker.ILikner iLikner) {
        Object[] objArr = {context, Integer.valueOf(i2), str, str2, iLikner};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10bd4a60d94b0d380d5ff153315c81f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10bd4a60d94b0d380d5ff153315c81f9");
            return;
        }
        if (i2 == 10 && !b) {
            return;
        }
        if (!NVLinker.isLinkerInit()) {
            NVLinker.init(context, i2, str, str2, iLikner);
        }
        if (z.compareAndSet(false, true)) {
            d = i2;
            C = context.getApplicationContext();
            t.a().b();
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27c684e45bf14cadd2b3a0d1a83de265", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27c684e45bf14cadd2b3a0d1a83de265");
        } else if (!g.a("logan")) {
            t.a().c();
        } else {
            t a2 = t.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = t.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "72d5e8f16fbfe95a18dc47c2685ac346", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "72d5e8f16fbfe95a18dc47c2685ac346");
                return;
            }
            aa aaVar = a2.b;
            if (aaVar != null || a2.e) {
                ac acVar = new ac();
                acVar.b = ac.a.FLUSH;
                a2.c.add(acVar);
                if (aaVar != null) {
                    aaVar.a();
                }
            }
        }
    }

    @Deprecated
    public static void a(String[] strArr, String str) {
        Object[] objArr = {strArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "304ee0af520bc6e38d2c5792ec23f610", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "304ee0af520bc6e38d2c5792ec23f610");
            return;
        }
        Object[] objArr2 = {strArr, str, 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e2764ac0de602078000fa80b2245c68d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e2764ac0de602078000fa80b2245c68d");
            return;
        }
        Object[] objArr3 = {strArr, str, 1, null};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8eae669efc0aa47033e4ccd9928c8b48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8eae669efc0aa47033e4ccd9928c8b48");
        } else {
            a(strArr, str, 1, (d) null, (String) null);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7ee2236ef0d4c7b19652b78ed3240bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7ee2236ef0d4c7b19652b78ed3240bc");
        } else if (!g.a("logan")) {
            t.a().c();
        } else {
            t a2 = t.a();
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = t.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "503626ed33db1a70b278333a329615b8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "503626ed33db1a70b278333a329615b8");
                return;
            }
            aa aaVar = a2.b;
            if (aaVar != null || a2.e) {
                ac acVar = new ac();
                acVar.b = ac.a.ROLLOVER;
                acVar.e = str;
                a2.c.add(acVar);
                if (aaVar != null) {
                    aaVar.a();
                }
            }
        }
    }

    public static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "696525748c138b52266c7497a82a3cec", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "696525748c138b52266c7497a82a3cec") : t.a().d.b();
    }
}
