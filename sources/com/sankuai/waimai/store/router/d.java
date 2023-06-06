package com.sankuai.waimai.store.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.util.aa;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static String b = "sourcelevel";
    private static String c = "2";

    public static String a(Intent intent, String str, String str2, String str3) {
        Object[] objArr = {intent, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d27aa194c15eb5c5674c116efae7bff2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d27aa194c15eb5c5674c116efae7bff2");
        }
        Object[] objArr2 = {intent, str2, str, str3};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.foundation.router.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "292e4905c0bca1fc1d5d296da92853c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "292e4905c0bca1fc1d5d296da92853c5");
        }
        if (intent == null) {
            return str3;
        }
        if (com.sankuai.waimai.foundation.router.a.a(intent)) {
            return com.sankuai.waimai.foundation.router.a.a(intent, str, str3);
        }
        return com.sankuai.waimai.foundation.router.utils.a.a(intent, str2, str3);
    }

    public static boolean a(Intent intent, String str, String str2, boolean z) {
        Object[] objArr = {intent, str, str2, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7dc33dfd6f58c325ce8a9b500de77d66", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7dc33dfd6f58c325ce8a9b500de77d66")).booleanValue() : com.sankuai.waimai.foundation.router.a.a(intent, str2, str, false);
    }

    public static int a(Intent intent, String str, String str2, int i) {
        Object[] objArr = {intent, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60a95f00b65c99779c6a1c13c59417a4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60a95f00b65c99779c6a1c13c59417a4")).intValue() : com.sankuai.waimai.foundation.router.a.a(intent, str, str2, i);
    }

    public static long a(Intent intent, String str, String str2, long j) {
        Object[] objArr = {intent, str, str2, 0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff393d547828623644bada44e8e34c37", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff393d547828623644bada44e8e34c37")).longValue();
        }
        Object[] objArr2 = {intent, str, str2, new Long(0L)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.foundation.router.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bd3eff12a1c89a031b5b12f9ee810627", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bd3eff12a1c89a031b5b12f9ee810627")).longValue();
        }
        if (intent == null) {
            return 0L;
        }
        if (com.sankuai.waimai.foundation.router.a.a(intent)) {
            return com.sankuai.waimai.foundation.router.a.b(intent, str, 0L);
        }
        return com.sankuai.waimai.foundation.router.utils.a.a(intent, str2, 0L);
    }

    public static String a(Intent intent, String str, String str2) {
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "663e68a0c393501bd9022e796c8470a2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "663e68a0c393501bd9022e796c8470a2") : com.sankuai.waimai.foundation.router.a.a(intent, str, str2);
    }

    public static int a(Intent intent, String str, int i) {
        Object[] objArr = {intent, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "895a6f0f9f28936d5e0626f8296bd39f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "895a6f0f9f28936d5e0626f8296bd39f")).intValue() : com.sankuai.waimai.foundation.router.a.a(intent, str, i);
    }

    public static boolean a(Intent intent, String str, boolean z) {
        Object[] objArr = {intent, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "493021bb61bf18e8ecdf7e3f00256b2f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "493021bb61bf18e8ecdf7e3f00256b2f")).booleanValue() : com.sankuai.waimai.foundation.router.a.a(intent, str, z);
    }

    public static long a(Intent intent, String str, long j) {
        Object[] objArr = {intent, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18176c5b127127b362c8b0ef62c498f0", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18176c5b127127b362c8b0ef62c498f0")).longValue() : com.sankuai.waimai.foundation.router.a.a(intent, str, j);
    }

    public static boolean a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24f843b6eb668418fe2a65e158c2cdc6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24f843b6eb668418fe2a65e158c2cdc6")).booleanValue() : com.sankuai.waimai.foundation.router.a.a(intent);
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "491ebd090b8b16b0ea26525753aebab9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "491ebd090b8b16b0ea26525753aebab9")).booleanValue() : com.sankuai.waimai.foundation.router.a.a(str);
    }

    public static boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c224eec894e7315f5b4126384e87d6f4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c224eec894e7315f5b4126384e87d6f4")).booleanValue() : com.sankuai.waimai.foundation.router.a.a(uri);
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c8f719c8cbc88f92431dfd373178405", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c8f719c8cbc88f92431dfd373178405");
        } else if (str.contains("www.maicai.com")) {
            a a2 = a();
            Object[] objArr2 = {2};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "45c1ade6f437dcbafc6fc4ccc845499a", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (a) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "45c1ade6f437dcbafc6fc4ccc845499a");
            } else {
                a2.a().put("com.sankuai.waimai.router.from", 2);
            }
            a2.a(context, str);
        } else {
            a().a(context, str);
        }
    }

    public static void a(com.sankuai.waimai.router.core.j jVar, String str) {
        Object[] objArr = {jVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f4702234d84188a7150a3f3b5be9039", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f4702234d84188a7150a3f3b5be9039");
            return;
        }
        Object[] objArr2 = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "08ceabd3ae1f17492f310abd077b02c5", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "08ceabd3ae1f17492f310abd077b02c5") : new a(jVar)).a(jVar.c, str);
    }

    public static void a(Context context, String str, Bundle bundle) {
        Object[] objArr = {context, str, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af203f79951eb0482e3b17fffa86feb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af203f79951eb0482e3b17fffa86feb1");
        } else {
            a().a(bundle).a(context, str);
        }
    }

    public static void a(Context context, String str, @Nullable Bundle bundle, int i) {
        Object[] objArr = {context, str, bundle, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74af512b02f9d639e061e8df642e826f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74af512b02f9d639e061e8df642e826f");
        } else {
            a().a(bundle).a(i).a(context, str);
        }
    }

    public static void b(Context context, String str, @Nullable Bundle bundle, int i) {
        Object[] objArr = {context, str, bundle, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1b59de205af03447fa3490b05e96a1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1b59de205af03447fa3490b05e96a1a");
        } else {
            a().a(bundle).a(i).a(context, str);
        }
    }

    public static void a(Context context, String str, @Nullable Map<String, String> map) {
        Object[] objArr = {context, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c379468c2fc04bd5380930c23c670c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c379468c2fc04bd5380930c23c670c0");
        } else {
            a(context, str, map, (String) null);
        }
    }

    public static void a(Context context, String str, @Nullable Map<String, String> map, @Nullable String str2) {
        Object[] objArr = {context, str, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99aebeff93794567a86d41f7ff015e45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99aebeff93794567a86d41f7ff015e45");
        } else if (!t.a(str)) {
            if (a(str)) {
                a().a(map).a(context, str);
            } else {
                b(context, str, map, str2);
            }
        } else {
            com.sankuai.shangou.stone.util.log.a.d("SCRouter", "url is null", new Object[0]);
        }
    }

    private static void b(Context context, String str, Map<String, String> map, String str2) {
        Object[] objArr = {context, str, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b7a58bc63275d796092ba3a7d4c1a3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b7a58bc63275d796092ba3a7d4c1a3d");
        } else {
            a().a(map).a(str2).a(context, Uri.parse(str).buildUpon().appendQueryParameter(b, c).build().toString());
        }
    }

    public static <T> T a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b050712659f15f7d4368b43fa555988b", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b050712659f15f7d4368b43fa555988b");
        }
        if (t.a(str) || t.a(str2)) {
            return null;
        }
        return (T) f.a(str + CommonConstant.Symbol.UNDERLINE + str2);
    }

    public static <T> T a(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a344b378582204cc8479ce3ff802d02b", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a344b378582204cc8479ce3ff802d02b");
        }
        if (intent == null || t.a(str)) {
            return null;
        }
        String a2 = aa.a(intent, "store_memory_data_intent_extra_key");
        if (t.a(a2)) {
            return null;
        }
        return (T) f.b(a2 + CommonConstant.Symbol.UNDERLINE + str);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f48c65642fcbaff6327b0395cda0cc7", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f48c65642fcbaff6327b0395cda0cc7") : new a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private final HashMap<String, Object> b;
        private Map<String, Object> c;
        private com.sankuai.waimai.router.core.j d;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba15ed5c81264455db4efb3295aaaafe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba15ed5c81264455db4efb3295aaaafe");
            } else {
                this.b = new HashMap<>();
            }
        }

        public a(com.sankuai.waimai.router.core.j jVar) {
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c47ceb2f150bf904d304b96105d775", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c47ceb2f150bf904d304b96105d775");
                return;
            }
            this.b = new HashMap<>();
            this.d = jVar;
        }

        public final <T> a a(String str, T t) {
            Object[] objArr = {str, t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c6708defe91b069721f2ffcf1df147d", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c6708defe91b069721f2ffcf1df147d");
            }
            if (this.c == null) {
                this.c = new HashMap();
            }
            this.c.put(str, t);
            return this;
        }

        public final a a(Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "731af491a1dd904bde4cf9d763203808", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "731af491a1dd904bde4cf9d763203808");
            }
            a().put("com.sankuai.waimai.router.activity.intent_extra", bundle);
            return this;
        }

        public final a a(Map<String, String> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc00674d05326866aa72096923207ac", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc00674d05326866aa72096923207ac");
            }
            if (map != null) {
                a().put("com.sankuai.waimai.router.UriParamInterceptor.uri_append_params", map);
            }
            return this;
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0548a8b9cb8bffd63b8c37e6ab6bdb33", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0548a8b9cb8bffd63b8c37e6ab6bdb33");
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

        public final a a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9add192712d3ecd1eab1de84bed8e9b", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9add192712d3ecd1eab1de84bed8e9b");
            }
            if (i >= 0) {
                a().put("com.sankuai.waimai.router.activity.request_code", Integer.valueOf(i));
            }
            return this;
        }

        public final void a(Context context, String str) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79a944d47d4c2d670e090a4a52855d0f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79a944d47d4c2d670e090a4a52855d0f");
                return;
            }
            b(str);
            if (this.d == null) {
                com.sankuai.waimai.router.a.a(new com.sankuai.waimai.router.core.j(context, str, this.b));
                return;
            }
            this.d.a(TextUtils.isEmpty(str) ? Uri.EMPTY : Uri.parse(str));
            com.sankuai.waimai.router.a.a(this.d);
        }

        private void b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87180ecbbb79c5cd240fcfcc141456d7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87180ecbbb79c5cd240fcfcc141456d7");
            } else if (this.c != null) {
                for (String str2 : this.c.keySet()) {
                    f.a(str + CommonConstant.Symbol.UNDERLINE + str2, this.c.get(str2));
                }
                if (a().containsKey("com.sankuai.waimai.router.activity.intent_extra")) {
                    ((Bundle) a().get("com.sankuai.waimai.router.activity.intent_extra")).putString("store_memory_data_intent_extra_key", str);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("store_memory_data_intent_extra_key", str);
                a(bundle);
            }
        }

        public HashMap<String, Object> a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2e7a29bfff549645f3e37bbc2f5f2ee", RobustBitConfig.DEFAULT_VALUE)) {
                return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2e7a29bfff549645f3e37bbc2f5f2ee");
            }
            if (this.d == null) {
                return this.b;
            }
            return this.d.e;
        }
    }

    public static void a(Context context, String str, String str2, HashMap<String, String> hashMap) {
        Object[] objArr = {context, str, str2, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fc1a85fec5c984ef11185fa1efcfa38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fc1a85fec5c984ef11185fa1efcfa38");
        } else if (context != null) {
            a(context, com.sankuai.waimai.store.router.a.a(com.sankuai.waimai.store.router.a.a(false, str, str2), com.sankuai.waimai.store.router.a.a(hashMap)));
        }
    }

    public static void a(Context context, HashMap<String, String> hashMap, int i, String str, String str2, String str3) {
        Object[] objArr = {context, hashMap, Integer.valueOf(i), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c766657e3542bff5d3e922e4114c7cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c766657e3542bff5d3e922e4114c7cd");
        } else if (context == null || hashMap == null || t.a(str2)) {
        } else {
            Object[] objArr2 = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.router.a.a;
            a(context, com.sankuai.waimai.store.router.a.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f2047457652c42aa546d85f226a6e430", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f2047457652c42aa546d85f226a6e430") : com.sankuai.waimai.store.router.a.a(h.h, str, str2, str3), com.sankuai.waimai.store.router.a.a(hashMap)), (Bundle) null, i);
        }
    }

    public static void b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e9b4981e7f2d05cbe37fe22913fbed4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e9b4981e7f2d05cbe37fe22913fbed4");
        } else {
            a(context, str, str, (HashMap<String, String>) null);
        }
    }

    public static void b(com.sankuai.waimai.router.core.j jVar, String str) {
        Object[] objArr = {jVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "239f966ee9def258b676c0ef96b1aea7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "239f966ee9def258b676c0ef96b1aea7");
        } else if (jVar != null) {
            a(jVar, com.sankuai.waimai.store.router.a.a(com.sankuai.waimai.store.router.a.a(str), jVar.d.getEncodedQuery()));
        }
    }

    public static void c(com.sankuai.waimai.router.core.j jVar, String str) {
        Object[] objArr = {jVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e94c7d255df4850ebdc2331ecaf7d1fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e94c7d255df4850ebdc2331ecaf7d1fa");
        } else if (jVar != null) {
            a(jVar, com.sankuai.waimai.store.router.a.a(com.sankuai.waimai.store.router.a.a(true, str, str), jVar.d.getEncodedQuery()));
        }
    }
}
