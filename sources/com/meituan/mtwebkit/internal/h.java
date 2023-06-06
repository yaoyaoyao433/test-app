package com.meituan.mtwebkit.internal;

import android.content.pm.PackageInfo;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static volatile Boolean b;
    private static Integer c;
    private static Integer d;
    private static com.meituan.android.cipstorage.q e = g.a(false);
    private static com.meituan.android.cipstorage.q f = g.a(a.b());
    private static com.meituan.android.cipstorage.q g = g.a(!a.b());

    public static synchronized void a(PackageInfo packageInfo) {
        synchronized (h.class) {
            Object[] objArr = {packageInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2bc7280413e7c19bb8df6411cd1da22", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2bc7280413e7c19bb8df6411cd1da22");
            } else {
                n.a(f, "mt_webview_new_packageinfo_store_key", packageInfo);
            }
        }
    }

    public static synchronized PackageInfo a() {
        synchronized (h.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91050cbcb065db51f34ccdd924438a53", RobustBitConfig.DEFAULT_VALUE)) {
                return (PackageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91050cbcb065db51f34ccdd924438a53");
            }
            StringBuilder sb = new StringBuilder("mt_webview_new_packageinfo_store_");
            sb.append(a.b() ? "64_key" : "32_key");
            String sb2 = sb.toString();
            PackageInfo a2 = n.a(e, sb2);
            if (a2 != null) {
                e.b(sb2);
                if (g.b(a2.versionCode).exists()) {
                    n.a(f, "mt_webview_new_packageinfo_store_key", a2);
                    return a2;
                }
                return null;
            }
            return n.a(f, "mt_webview_new_packageinfo_store_key");
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7dac2fea4171eac523ba2749baae19c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7dac2fea4171eac523ba2749baae19c");
        } else {
            f.b("mt_webview_new_packageinfo_store_key");
        }
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d65076c3b4d89ac6bba8755987cdcc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d65076c3b4d89ac6bba8755987cdcc7");
        } else {
            f.a("mt_webview_check_update_task_miss_key", i);
        }
    }

    public static int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7752504316274d11f0a28499ddd60fc1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7752504316274d11f0a28499ddd60fc1")).intValue() : f.b("mt_webview_check_update_task_miss_key", 1);
    }

    public static void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5283ac11cabf29af2da070bb9b3f9df3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5283ac11cabf29af2da070bb9b3f9df3");
        } else {
            f.a("mt_webview_download_task_miss_key", i);
        }
    }

    public static int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27a8c68bff22187825cb1096344a8a86", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27a8c68bff22187825cb1096344a8a86")).intValue() : f.b("mt_webview_download_task_miss_key", 0);
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2d4b73046ea43d3e213bb799aa7f44a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2d4b73046ea43d3e213bb799aa7f44a");
        } else {
            f.a("mt_webview_check_update_time_miss_key", str);
        }
    }

    public static String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40acbc4625480459da5e005765f18478", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40acbc4625480459da5e005765f18478") : f.b("mt_webview_check_update_time_miss_key", "0");
    }

    public static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62e710b780379e09aa7754b9b77fec3e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62e710b780379e09aa7754b9b77fec3e") : f.b("mt_webview_dd_host_url_key", "https://api.meituan.com/");
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b9f8298fbcc75116915332f316e700a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b9f8298fbcc75116915332f316e700a");
        } else {
            f.a("mt_webview_dex2oat_method_used_status_key", str);
        }
    }

    public static String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff923bb0ecf9df0365a992fc3ae5de90", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff923bb0ecf9df0365a992fc3ae5de90") : f.b("mt_webview_dex2oat_method_used_status_key", "100");
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22edb4e7e9e77fd878a5a8d628392cf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22edb4e7e9e77fd878a5a8d628392cf1");
        } else {
            f.a("mt_webview_dex2oat_method_order_status_key", str);
        }
    }

    public static String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0faa646799de965e4b0fff20482302b9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0faa646799de965e4b0fff20482302b9") : f.b("mt_webview_dex2oat_method_order_status_key", "A");
    }

    public static void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "110775b24739affa79cc8a418769df60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "110775b24739affa79cc8a418769df60");
        } else {
            f.a("mt_webview_force_downgrade_multi_process_key", true);
        }
    }

    public static boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb5b83438917b91dd1039314d7ac6693", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb5b83438917b91dd1039314d7ac6693")).booleanValue() : f.b("mt_webview_force_downgrade_multi_process_key", false);
    }

    public static void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "396c50bbc4dc02cf52aa982c2834b225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "396c50bbc4dc02cf52aa982c2834b225");
        } else {
            f.a("mt_webview_check_multi_process_error_key", j);
        }
    }

    public static long j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "290006a63e86fac16673d3162069fc85", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "290006a63e86fac16673d3162069fc85")).longValue() : f.b("mt_webview_check_multi_process_error_key", 0L);
    }

    public static void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ba792b0dce1fc39658c22a5c12c7b6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ba792b0dce1fc39658c22a5c12c7b6b");
            return;
        }
        f.b("mt_webview_dex2oat_method_used_status_key");
        f.b("mt_webview_dex2oat_method_order_status_key");
    }

    public static void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2925f7dbbd3d8efb184573e74978afe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2925f7dbbd3d8efb184573e74978afe");
        } else {
            f.a("mt_webview_sdk_version_store_key", j);
        }
    }

    public static long l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6367ef42d95f4a63c684a42ffe6f1074", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6367ef42d95f4a63c684a42ffe6f1074")).longValue() : f.b("mt_webview_sdk_version_store_key", 0L);
    }

    public static void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c58d09a35e9b960dbd3ca0b0d657b272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c58d09a35e9b960dbd3ca0b0d657b272");
        } else {
            f.a("mt_webview_last_init_date_key", j);
        }
    }

    public static long m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7669654e90e19c1c399840650b67db4a", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7669654e90e19c1c399840650b67db4a")).longValue() : f.b("mt_webview_last_init_date_key", 0L);
    }

    public static void d(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b31eaf9df7c7b911b6b71829e13a2e10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b31eaf9df7c7b911b6b71829e13a2e10");
        } else {
            f.a("mt_webview_last_check_update_key", j);
        }
    }

    public static long n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16e83fb431d6452bb41cca0e92351f99", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16e83fb431d6452bb41cca0e92351f99")).longValue() : f.b("mt_webview_last_check_update_key", 0L);
    }

    public static void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3e98cdf2a33401e1be862c045ba3351", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3e98cdf2a33401e1be862c045ba3351");
        } else {
            f.a("mt_webview_multi_process_error_count_key", i);
        }
    }

    public static int o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccdf80f0c27f7b4236f9503118dc242b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccdf80f0c27f7b4236f9503118dc242b")).intValue() : f.b("mt_webview_multi_process_error_count_key", 0);
    }

    public static synchronized boolean p() {
        synchronized (h.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb6ae2f257dcb0ebf594dd4d3f172405", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb6ae2f257dcb0ebf594dd4d3f172405")).booleanValue();
            }
            if (b == null) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                b = Boolean.valueOf(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e96a46263ca084cd1fd19f8048021d3f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e96a46263ca084cd1fd19f8048021d3f")).booleanValue() : f.b("mt_webview_shared_preference_enable_key", false));
            }
            return b.booleanValue();
        }
    }

    public static void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "526a33ef8b4c3cdfb9a84d18e24e76e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "526a33ef8b4c3cdfb9a84d18e24e76e0");
            return;
        }
        f.b("mt_webview_force_downgrade_multi_process_key");
        f.b("mt_webview_multi_process_error_count_key");
        f.b("mt_webview_check_multi_process_error_key");
    }

    public static synchronized boolean r() {
        synchronized (h.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "091cd3d909dd99c90028d62eb0864d47", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "091cd3d909dd99c90028d62eb0864d47")).booleanValue();
            }
            return f.b("mt_webview_force_downgrade_key", true);
        }
    }

    public static long s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fcd878ea12253b3d8a6daa2bca11c4d", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fcd878ea12253b3d8a6daa2bca11c4d")).longValue() : f.b("mt_webview_check_update_interval_key", 259200000L);
    }

    public static boolean b(@NonNull PackageInfo packageInfo) {
        Object[] objArr = {packageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2e83068d73ca7e38f5a3da986873f3b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2e83068d73ca7e38f5a3da986873f3b")).booleanValue();
        }
        Set<String> b2 = f.b("mt_webview_skip_versions_key", (Set<String>) null);
        return b2 != null && b2.contains(String.valueOf(packageInfo.versionCode));
    }

    public static boolean t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7c00a6bd1683255a15d356ee2bc45eb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7c00a6bd1683255a15d356ee2bc45eb")).booleanValue() : f.b("mt_webview_register_dex_module_key", false);
    }

    public static boolean u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a090097fc5fae5af108fd082e4bdbb6d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a090097fc5fae5af108fd082e4bdbb6d")).booleanValue() : f.b("mt_webview_notify_dex_load_key", false);
    }

    public static int v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "432cea81d403930c6cb6b61b18ea9150", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "432cea81d403930c6cb6b61b18ea9150")).intValue();
        }
        if (c == null) {
            c = Integer.valueOf(f.b("mt_webview_current_mode_key", 3));
        }
        return c.intValue();
    }

    public static boolean w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "498ffd0a16ff432f224a34939ee0a202", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "498ffd0a16ff432f224a34939ee0a202")).booleanValue() : f.b("mt_webview_download_only_wifi_key", true);
    }

    public static Set<String> x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1103d65b15946db9a4ade5420646dcc3", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1103d65b15946db9a4ade5420646dcc3") : f.b("mt_webview_no_samelayer_versions_key", (Set<String>) null);
    }

    public static int y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "642a8363a8a7ea10b4b7b5796751c6c1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "642a8363a8a7ea10b4b7b5796751c6c1")).intValue() : f.b("mt_webview_raptor_report_rate_key", 10000);
    }

    public static int z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f4963a363b212e928f35233c45d43e0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f4963a363b212e928f35233c45d43e0")).intValue() : f.b("mt_webview_babel_report_rate_key", 10000);
    }

    public static long A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0784dbf10d01c3d68829c3c1d243c914", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0784dbf10d01c3d68829c3c1d243c914")).longValue() : f.b("mt_webview_no_packageinfo_check_update_interval_key", 259200000L);
    }

    public static int B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e938ee65d3861965e486875de2d17502", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e938ee65d3861965e486875de2d17502")).intValue();
        }
        if (d == null) {
            d = Integer.valueOf(f.b("mt_webview_sandboxed_services_count_key", 10));
        }
        return d.intValue();
    }

    public static boolean C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acd235f6d9803fc2d7322fa835b02041", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acd235f6d9803fc2d7322fa835b02041")).booleanValue() : f.b("mt_webview_is_multi_process_enable_key", false);
    }

    public static int D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2850c512b40a77b524fc587dfa4a1a79", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2850c512b40a77b524fc587dfa4a1a79")).intValue() : f.b("mt_webview_max_multi_process_error_key", 3);
    }
}
