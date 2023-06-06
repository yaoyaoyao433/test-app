package com.meituan.android.msc.csslib;

import android.util.DisplayMetrics;
import android.util.Log;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class CSSParserNative {
    public static ChangeQuickRedirect a;
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static final Map<String, Integer> d = new ConcurrentHashMap();
    public static final Object b = new Object();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        String a();
    }

    private static native String cascade(String str, long j);

    private static native byte[] cascade2(String str, long j);

    private static native void clearRenderStyle(long j);

    private static native void destroy(String str);

    private static native void initCSS(int i, int i2, float f);

    private static native void parse(String str, String str2);

    private static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db11df8518aae043403c1693050d67e6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db11df8518aae043403c1693050d67e6") : str.split("\\?")[0];
    }

    public static void a(String str, a aVar) {
        int i = 1;
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "181b61d4c75cbe69c7c53d5fc6da6147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "181b61d4c75cbe69c7c53d5fc6da6147");
            return;
        }
        try {
            String b2 = b(str);
            synchronized (b) {
                Integer num = d.get(b2);
                if (num == null || num.intValue() == 0) {
                    parse(b2, aVar.a());
                }
                if (num != null && num.intValue() > 0) {
                    i = 1 + num.intValue();
                }
                d.put(b2, Integer.valueOf(i));
            }
        } catch (Exception e) {
            Log.e("CSSParserNative", "parseCSS exception " + e.getLocalizedMessage());
        }
    }

    public static void a(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63f355c7226e2a3347978e3a64683e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63f355c7226e2a3347978e3a64683e51");
            return;
        }
        String b2 = b(str);
        synchronized (b) {
            Integer num = d.get(b2);
            if (num == null || num.intValue() <= 1) {
                destroy(b2);
            }
            if (num != null && num.intValue() >= 0) {
                i = num.intValue() - 1;
            }
            d.put(b2, Integer.valueOf(i));
        }
    }

    public static String a(String str, long j, a aVar) {
        String cascade;
        Object[] objArr = {str, new Long(j), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8dcff031ef57b913953f216e7baaf26", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8dcff031ef57b913953f216e7baaf26");
        }
        String b2 = b(str);
        synchronized (b) {
            Integer num = d.get(b2);
            if (num == null || num.intValue() == 0) {
                parse(b2, aVar.a());
                d.put(b2, 1);
            }
            cascade = cascade(b2, j);
        }
        return cascade;
    }

    public static byte[] b(String str, long j, a aVar) {
        byte[] cascade2;
        Object[] objArr = {str, new Long(j), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19574f7086c2bc54b2cb220d5310ea40", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19574f7086c2bc54b2cb220d5310ea40");
        }
        String b2 = b(str);
        synchronized (b) {
            Integer num = d.get(b2);
            if (num == null || num.intValue() == 0) {
                parse(b2, aVar.a());
                d.put(b2, 1);
            }
            cascade2 = cascade2(b2, j);
        }
        return cascade2;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2bec4b41b431ba2e8fe2b636fa9daea3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2bec4b41b431ba2e8fe2b636fa9daea3");
            return;
        }
        if (com.meituan.android.msc.csslib.a.b == null) {
            Log.e("CSSParserNative", "please init CSSParserHelper first");
        }
        if (c.getAndSet(true)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        k.a("msccsslib", arrayList);
        DisplayMetrics displayMetrics = com.meituan.android.msc.csslib.a.b.getResources().getDisplayMetrics();
        synchronized (b) {
            initCSS(displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density);
        }
    }
}
