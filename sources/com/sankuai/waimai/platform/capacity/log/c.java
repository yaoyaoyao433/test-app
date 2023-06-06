package com.sankuai.waimai.platform.capacity.log;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends com.dianping.monitor.impl.a {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile c c;
    private static ExecutorService d;
    private HashMap<String, Long> b;

    private c(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "616ce4a33f5701123211f1f64a13a05b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "616ce4a33f5701123211f1f64a13a05b");
        } else {
            this.b = new HashMap<>();
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3f3217f08cdbd80abef3f3935abd139", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3f3217f08cdbd80abef3f3935abd139");
        }
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new c(com.meituan.android.singleton.b.a, com.sankuai.waimai.config.a.a().d());
                }
            }
        }
        return c;
    }

    @Override // com.dianping.monitor.impl.a
    public String getUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "340610d27d8f9e48350a75157dc1cb5d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "340610d27d8f9e48350a75157dc1cb5d") : com.sankuai.waimai.platform.b.A().c();
    }

    public final void a(int i, @NonNull String str, long j) {
        Object[] objArr = {Integer.valueOf(i), str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "051ba0cf4e2ab21e96c10c3a64e4f10f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "051ba0cf4e2ab21e96c10c3a64e4f10f");
        } else if (b()) {
            pv3(com.meituan.android.time.c.b(), str, 0, 0, i, 0, 0, (int) (SystemClock.elapsedRealtime() - j), null);
        }
    }

    public final void a(int i, int i2, @NonNull String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51a78a3797e14fb78ea5cbe457bf361b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51a78a3797e14fb78ea5cbe457bf361b");
        } else if (b()) {
            pv3(com.meituan.android.time.c.b(), str, 0, 0, i, 0, 0, i2, null);
        }
    }

    public boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00b837aaa1f29784d8995d0b3937952e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00b837aaa1f29784d8995d0b3937952e")).booleanValue() : "1".equals(com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.cat_switch, "0"));
    }

    public int a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb25e994a7ca0ec58e708c264e5fb35", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb25e994a7ca0ec58e708c264e5fb35")).intValue();
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            scheme = scheme.toLowerCase();
        }
        return (scheme != null && scheme.startsWith("http") && TextUtils.equals(scheme, "https")) ? 8 : 0;
    }

    public final void a(String str, int i, int i2, int i3, int i4, String str2, String str3) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f097737f0437f6d619645022a662338c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f097737f0437f6d619645022a662338c");
        } else if (TextUtils.isEmpty(str) || !b()) {
        } else {
            pv4(com.meituan.android.time.c.b(), String.format("_pic_%s", str), 0, a(Uri.parse(str)), i, i2, i3, i4, str2, str3, 5);
        }
    }

    public final void a(String str, int i, int i2, int i3, int i4, String str2, String str3, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, str3, hashMap, hashMap2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9af621ecc9ea63901445075525115b6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9af621ecc9ea63901445075525115b6c");
        } else if (TextUtils.isEmpty(str) || !b()) {
        } else {
            Uri parse = Uri.parse(str);
            long b = com.meituan.android.time.c.b();
            String str4 = parse.getHost() + parse.getPath();
            int a2 = i >= 0 ? 0 : new com.dianping.monitor.g(com.meituan.android.singleton.b.a).a();
            String str5 = "";
            if (hashMap2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("X-CAT-ROOT-ID", hashMap2.get("X-CAT-ROOT-ID"));
                    jSONObject.put("M-TraceId", hashMap2.get("M-TraceId"));
                    str5 = jSONObject.toString();
                } catch (Throwable th) {
                    com.sankuai.waimai.foundation.utils.log.a.a(th);
                }
            }
            super.pvCat(b, str4, a2, a(parse), 0, i, i2, i3, i4, str2, str5, 100, str, str, str3, hashMap, hashMap2, null, "");
        }
    }

    public final void a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f81a590d9fbeb0bc8e83699c471789c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f81a590d9fbeb0bc8e83699c471789c7");
        } else if (b()) {
            pv3(j, str, i, i2, i3, i4, i5, i6, null);
        }
    }

    public final void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cf26b7db884b9a127101e6c9a09ce09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cf26b7db884b9a127101e6c9a09ce09");
        } else if (!b() || TextUtils.isEmpty(str)) {
        } else {
            final String host = Uri.parse(str).getHost();
            long longValue = this.b.get(host) == null ? 0L : this.b.get(host).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue <= 30000) {
                return;
            }
            this.b.put(host, Long.valueOf(currentTimeMillis));
            if (d == null) {
                d = com.sankuai.android.jarvis.c.a("WM-DNS");
            }
            d.submit(new Runnable() { // from class: com.sankuai.waimai.platform.capacity.log.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e1bec706d556bd3799698ff11015fc1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e1bec706d556bd3799698ff11015fc1");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!TextUtils.isEmpty(host)) {
                        try {
                            for (InetAddress inetAddress : InetAddress.getAllByName(host)) {
                                String hostAddress = inetAddress.getHostAddress();
                                if (!TextUtils.isEmpty(hostAddress)) {
                                    arrayList.add(hostAddress);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    com.dianping.networklog.c.a("dns_info:" + host + StringUtil.SPACE + TextUtils.join(CommonConstant.Symbol.COMMA, arrayList), 3);
                    if (arrayList.size() > 0) {
                        c.this.uploadDNS(str, arrayList);
                    }
                }
            });
        }
    }

    public static int a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "450bc77681af37578d3fb843b87ae3e4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "450bc77681af37578d3fb843b87ae3e4")).intValue();
        }
        if (i2 != 200 && !com.sankuai.waimai.platform.domain.core.response.a.a(i)) {
            if (!(i == 406)) {
                return i2;
            }
        }
        return i + 10000;
    }
}
