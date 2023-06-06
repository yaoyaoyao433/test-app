package com.meituan.android.httpdns.business;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.google.gson.Gson;
import com.meituan.android.cipstorage.q;
import com.meituan.android.httpdns.d;
import com.meituan.android.httpdns.h;
import com.meituan.android.httpdns.i;
import com.meituan.android.httpdns.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.smtt.sdk.TbsReaderView;
import java.io.File;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static volatile String b = null;
    private static volatile String c = null;
    private static volatile boolean d = false;
    private static volatile long e = 0;
    private static volatile String f = null;
    private static volatile String g = null;
    private static volatile boolean h = false;
    private static volatile long i = 0;
    private static volatile int j = -1;
    private static volatile long k = 0;
    private static volatile int l = -1;
    private static Context m;
    private static Gson n = new Gson();

    public static void a(d dVar, m mVar) {
        Object[] objArr = {dVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77cf47ca3544f2e4275d0cb9bd15c74d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77cf47ca3544f2e4275d0cb9bd15c74d");
        } else if (dVar == null || dVar.j == null) {
        } else {
            Map<String, Object> map = dVar.j;
            map.put("firstOpen", Integer.valueOf(l));
            Object[] objArr2 = {map};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bb6c86214dfbacf4dac49213c17c8d62", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bb6c86214dfbacf4dac49213c17c8d62");
            } else if (b() != null && map != null) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                if (k == 0) {
                    k = currentTimeMillis;
                }
                map.put("useTime", Long.valueOf(currentTimeMillis - k));
            }
            Object[] objArr3 = {dVar, map};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a9f1f77dbf5748da8f1ce81060cf8882", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a9f1f77dbf5748da8f1ce81060cf8882");
            } else {
                map.put("isUseHorn", Boolean.valueOf(dVar.c));
                map.put("hornJson", b);
                map.put("hornCacheResult", c);
                map.put("hornFetchResult", g);
                map.put("hornFirstSuccessTime", Long.valueOf(i));
                map.put("firstHornLen", Integer.valueOf(a()));
                map.put("cacheEmpty", Boolean.valueOf(h));
                map.put(TbsReaderView.KEY_FILE_PATH, f);
                map.put("fileExists", Boolean.valueOf(d));
                map.put("fileLen", Long.valueOf(e));
            }
            mVar.a("extra_not_use", n.toJson(map));
        }
    }

    private static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "913fc5e2ba719be38d92734b1b7bb213", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "913fc5e2ba719be38d92734b1b7bb213");
        } else if (b() == null || TextUtils.isEmpty(str)) {
        } else {
            q a2 = l.a(b());
            if (a() == -1) {
                a2.a("httpdns_first_result_len", str.length());
            }
        }
    }

    private static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41cb7b0df5db4caf63b98757f2fb58d2", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41cb7b0df5db4caf63b98757f2fb58d2")).intValue();
        }
        if (b() == null) {
            return -2;
        }
        if (j == -1) {
            j = l.a(b()).b("httpdns_first_result_len", -1);
        }
        return j;
    }

    public static void a(h.a aVar, boolean z, String str) {
        int i2 = 0;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c9b18352c54d71d347ee69b6cc7aac3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c9b18352c54d71d347ee69b6cc7aac3");
            return;
        }
        boolean z2 = aVar != null;
        if (z2) {
            a(str);
            if (i == 0) {
                i = System.currentTimeMillis();
            }
        }
        if (!TextUtils.isEmpty(str)) {
            b = str;
            i2 = str.length();
        }
        g = "horn:from fetch, parseResult=" + z2 + ";enable=" + z + ";resultLen=" + i2 + ";time:" + System.currentTimeMillis();
    }

    public static void a(h.a aVar, String str) {
        int i2;
        Context b2;
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        File file = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e42a3173e609b3c53acb901ade2e16f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e42a3173e609b3c53acb901ade2e16f4");
        } else if (b() == null) {
        } else {
            if (l == -1) {
                q a2 = l.a(b());
                if (a2.b("httpdnsFirstOpen", true)) {
                    l = 1;
                    a2.a("httpdnsFirstOpen", false);
                } else {
                    l = 0;
                }
            }
            h = TextUtils.isEmpty(str);
            boolean z = aVar != null;
            if (z) {
                a(str);
                if (i == 0) {
                    i = System.currentTimeMillis();
                }
            }
            if (TextUtils.isEmpty(str)) {
                i2 = 0;
            } else {
                b = str;
                i2 = str.length();
            }
            c = "horn:from cache, parseResult=" + z + ";resultLen=" + i2 + ";time=" + System.currentTimeMillis();
            if (f == null) {
                Object[] objArr2 = {"httpdns_sdk"};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "418c1c620f98c7fd4473fed11bb91e91", 6917529027641081856L)) {
                    file = (File) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "418c1c620f98c7fd4473fed11bb91e91");
                } else {
                    if (b() != null) {
                        file = new File(b2.getFilesDir() + "/horn", "final_horn_config_httpdns_sdk");
                    }
                }
                if (file != null) {
                    f = file.getAbsolutePath();
                    d = file.exists();
                    e = file.length();
                }
            }
        }
    }

    private static Context b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84cc5713808299154d39c6789cfa9661", 6917529027641081856L)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84cc5713808299154d39c6789cfa9661");
        }
        if (m == null) {
            m = i.c;
        }
        return m;
    }
}
