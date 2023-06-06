package com.sankuai.waimai.foundation.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.interfaces.d;
import com.sankuai.waimai.router.components.i;
import com.sankuai.waimai.router.core.e;
import com.sankuai.waimai.router.core.j;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbaa3f0e332807b4b46ca1e3e4cb18a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbaa3f0e332807b4b46ca1e3e4cb18a3");
        } else {
            com.sankuai.waimai.router.a.a(new j(context, str));
        }
    }

    public static void a(Context context, String str, @Nullable Bundle bundle) {
        Object[] objArr = {context, str, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a74e33960499b1b6ea40cac6ccbe05a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a74e33960499b1b6ea40cac6ccbe05a");
        } else {
            a().a(bundle).a(context, str);
        }
    }

    public static void a(Context context, String str, @Nullable Bundle bundle, int i) {
        Object[] objArr = {context, str, bundle, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a20355bdf83b67264ad98c62395135a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a20355bdf83b67264ad98c62395135a5");
        } else {
            a().a(bundle).a(i).a(context, str);
        }
    }

    public static void a(Context context, String str, @Nullable String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3e7a263320a7aee0042faa3d04a67fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3e7a263320a7aee0042faa3d04a67fd");
        } else {
            a().a(str2).a(context, str);
        }
    }

    public static void a(Context context, String str, @Nullable Map<String, String> map) {
        Object[] objArr = {context, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ea66b5537b239710a03e456cdb7b2f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ea66b5537b239710a03e456cdb7b2f1");
        } else {
            a().a(map).a(context, str);
        }
    }

    public static C0950a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2928705a05b53a33f60a79be59c452f1", RobustBitConfig.DEFAULT_VALUE) ? (C0950a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2928705a05b53a33f60a79be59c452f1") : new C0950a();
    }

    public static boolean a(@Nullable Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cdbc42fb6032e2f17df6deb6546b620", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cdbc42fb6032e2f17df6deb6546b620")).booleanValue() : intent != null && a(intent.getData());
    }

    public static boolean a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90a62f18d546580754490ab891b73a4f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90a62f18d546580754490ab891b73a4f")).booleanValue() : !TextUtils.isEmpty(str) && a(Uri.parse(str));
    }

    public static boolean a(@NonNull Context context, @Nullable String str, @StringRes int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "269c78e3cb2e88fc210b7aa91c1ad293", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "269c78e3cb2e88fc210b7aa91c1ad293")).booleanValue() : (context == null || TextUtils.isEmpty(str) || !a(context, Uri.parse(str), i)) ? false : true;
    }

    private static boolean a(@NonNull Context context, @Nullable Uri uri, @StringRes int i) {
        Object[] objArr = {context, uri, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6e0fe61c725f822b092601e2a79bfa8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6e0fe61c725f822b092601e2a79bfa8")).booleanValue() : context != null && uri != null && a(uri) && TextUtils.equals(uri.getPath(), context.getString(i));
    }

    @Deprecated
    public static boolean b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3018b7847f04d41e4c77bf92fe20356", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3018b7847f04d41e4c77bf92fe20356")).booleanValue() : i.a(intent, 2) == 4;
    }

    public static boolean a(Intent intent, String str, String str2, boolean z) {
        Object[] objArr = {intent, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ffafb4fccc3cacb33a0e78f5794ba33", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ffafb4fccc3cacb33a0e78f5794ba33")).booleanValue();
        }
        if (intent == null) {
            return z;
        }
        if (a(intent)) {
            return a(intent, str2, z);
        }
        return com.sankuai.waimai.foundation.router.utils.a.a(intent, str, z);
    }

    public static int a(Intent intent, String str, String str2, int i) {
        Object[] objArr = {intent, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43c66c088868441ed69da64ba8e155f3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43c66c088868441ed69da64ba8e155f3")).intValue();
        }
        if (intent == null) {
            return i;
        }
        if (a(intent)) {
            return a(intent, str, i);
        }
        return com.sankuai.waimai.foundation.router.utils.a.a(intent, str2, i);
    }

    public static String a(Intent intent, String str, String str2) {
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c11c9d32fa6bd74eca809cbb667799c4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c11c9d32fa6bd74eca809cbb667799c4") : (str == null || !a(intent)) ? str2 : b(intent, str, str2);
    }

    private static String b(Intent intent, String str, String str2) {
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0e4d0293e747de79635705c67261214", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0e4d0293e747de79635705c67261214");
        }
        Uri data = intent.getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter(str);
            if (!TextUtils.isEmpty(queryParameter)) {
                return queryParameter;
            }
        }
        return str2;
    }

    public static int a(Intent intent, String str, int i) {
        Object[] objArr = {intent, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7a9a128d3f771b37ab0e66c00d267c1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7a9a128d3f771b37ab0e66c00d267c1")).intValue() : (str == null || !a(intent)) ? i : b(intent, str, i);
    }

    public static boolean a(Intent intent, String str, boolean z) {
        Object[] objArr = {intent, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f29f687f1b86fc9a5d5cb9c3fc0bfca0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f29f687f1b86fc9a5d5cb9c3fc0bfca0")).booleanValue() : (str == null || !a(intent)) ? z : b(intent, str, z);
    }

    private static boolean b(Intent intent, String str, boolean z) {
        Object[] objArr = {intent, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fda6da4c9679f0f99b62b5f53156937f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fda6da4c9679f0f99b62b5f53156937f")).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter(str);
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    return Boolean.parseBoolean(queryParameter);
                } catch (Exception e) {
                    if (d.a()) {
                        throw e;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("WMRouter", e);
                }
            }
        }
        return z;
    }

    private static int b(Intent intent, String str, int i) {
        Object[] objArr = {intent, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fef5f70cca8675e7d2214bd50f23269d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fef5f70cca8675e7d2214bd50f23269d")).intValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter(str);
            if (!TextUtils.isEmpty(queryParameter) && !TextUtils.equals(Constants.UNDEFINED, queryParameter)) {
                try {
                    return Integer.parseInt(queryParameter);
                } catch (Exception e) {
                    if (d.a()) {
                        throw e;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("WMRouter", e);
                }
            }
        }
        return i;
    }

    public static long a(Intent intent, String str, long j) {
        Object[] objArr = {intent, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f73f215441b707a70f3aceef1e42794b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f73f215441b707a70f3aceef1e42794b")).longValue() : (str == null || !a(intent)) ? j : b(intent, str, j);
    }

    public static long b(@NonNull Intent intent, String str, long j) {
        Object[] objArr = {intent, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f3b712541ec9521f42835def0d94536", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f3b712541ec9521f42835def0d94536")).longValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter(str);
            if (!TextUtils.isEmpty(queryParameter) && !TextUtils.equals(Constants.UNDEFINED, queryParameter)) {
                try {
                    return Long.parseLong(queryParameter);
                } catch (Exception e) {
                    if (d.a()) {
                        throw e;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("WMRouter", e);
                }
            }
        }
        return j;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.foundation.router.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0950a {
        public static ChangeQuickRedirect a;
        public final HashMap<String, Object> b;

        public C0950a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45885213fc49149e58cf1636a4e607dd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45885213fc49149e58cf1636a4e607dd");
            } else {
                this.b = new HashMap<>();
            }
        }

        public final C0950a a(e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01aff1abc6788100c56f7a4395d3d889", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0950a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01aff1abc6788100c56f7a4395d3d889");
            }
            this.b.put("com.sankuai.waimai.router.core.CompleteListener", eVar);
            return this;
        }

        public final C0950a a(Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8c1a5d9b5d63e8c3dfdd31be00088b1", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0950a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8c1a5d9b5d63e8c3dfdd31be00088b1");
            }
            this.b.put("com.sankuai.waimai.router.activity.intent_extra", bundle);
            return this;
        }

        public final C0950a a(com.sankuai.waimai.router.activity.d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "564b9acbcb3253bc53854db070f38a37", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0950a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "564b9acbcb3253bc53854db070f38a37");
            }
            this.b.put("com.sankuai.waimai.router.activity.start_activity_action", dVar);
            return this;
        }

        public final C0950a a(Map<String, String> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35bbd470fe3f74ebb83aa75c92e78112", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0950a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35bbd470fe3f74ebb83aa75c92e78112");
            }
            if (map != null) {
                this.b.put("com.sankuai.waimai.router.UriParamInterceptor.uri_append_params", map);
            }
            return this;
        }

        public final C0950a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f22651ed84d1164369685f88064f9af6", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0950a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f22651ed84d1164369685f88064f9af6");
            }
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = (Bundle) this.b.get("com.sankuai.waimai.router.activity.intent_extra");
                if (bundle == null) {
                    bundle = new Bundle();
                    this.b.put("com.sankuai.waimai.router.activity.intent_extra", bundle);
                }
                bundle.putString("title", str);
            }
            return this;
        }

        public final C0950a a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dd0fcdc9a45c7ab40029e9aaea79d9e", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0950a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dd0fcdc9a45c7ab40029e9aaea79d9e");
            }
            if (i >= 0) {
                this.b.put("com.sankuai.waimai.router.activity.request_code", Integer.valueOf(i));
            }
            return this;
        }

        public final void a(Context context, String str) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec9e0f2b0853b230639ccf6808dda47f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec9e0f2b0853b230639ccf6808dda47f");
            } else {
                com.sankuai.waimai.router.a.a(new j(context, str, this.b));
            }
        }

        public final void a(Context context, Uri uri) {
            Object[] objArr = {context, uri};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "642e168519396fb50d21d54ccbe9c90b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "642e168519396fb50d21d54ccbe9c90b");
            } else {
                com.sankuai.waimai.router.a.a(new j(context, uri, this.b));
            }
        }
    }

    public static boolean a(@Nullable Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c91167e853467fa42984ec08c98ae6e4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c91167e853467fa42984ec08c98ae6e4")).booleanValue();
        }
        com.sankuai.waimai.foundation.router.interfaces.e eVar = com.sankuai.waimai.foundation.router.impl.a.b;
        return eVar != null && eVar.a(uri);
    }
}
