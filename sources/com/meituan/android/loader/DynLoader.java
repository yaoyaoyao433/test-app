package com.meituan.android.loader;

import android.content.Context;
import android.content.res.AssetManager;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DynLoader {
    public static ChangeQuickRedirect a;
    private static volatile e c;
    private static volatile a d;
    private static f e = new d();
    public static final Map<String, b> b = new ConcurrentHashMap();
    private static final Object f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public volatile boolean a = false;
    }

    @Keep
    public static void setLoader(e eVar) {
        HashMap hashMap;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4cd7001fe5c4fa293a99741baf6382c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4cd7001fe5c4fa293a99741baf6382c2");
        } else if (eVar != null) {
            synchronized (f) {
                c = eVar;
                hashMap = new HashMap(b);
                b.clear();
            }
            a(hashMap);
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ad6cde771a5076c39340fd8c7eaec86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ad6cde771a5076c39340fd8c7eaec86");
        } else if (c != null) {
            c.b();
        }
    }

    private static void a(Map<String, b> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c864d3c5fb5ddc655aa51743241b396d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c864d3c5fb5ddc655aa51743241b396d");
        } else if (map.size() != 0) {
            for (Map.Entry<String, b> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    f fVar = e;
                    fVar.a("deliverInitCallback, key: " + entry.getKey());
                }
            }
        }
    }

    @Keep
    public static boolean available(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad59826f425d5d1597f4e7ce47f076f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad59826f425d5d1597f4e7ce47f076f9")).booleanValue();
        }
        if (c != null) {
            return c.a(str, i);
        }
        return true;
    }

    @Keep
    public static boolean available(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "661b26e097bb972f770e1a91bd69c1d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "661b26e097bb972f770e1a91bd69c1d5")).booleanValue();
        }
        if (c != null) {
            return c.a(str, i);
        }
        return !a(context);
    }

    private static boolean a(Context context) {
        AssetManager assets;
        String[] list;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6073b0f4741d7b6c23c54cb47844b2aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6073b0f4741d7b6c23c54cb47844b2aa")).booleanValue();
        }
        if (d != null) {
            return d.a;
        }
        if (context == null || (assets = context.getAssets()) == null) {
            return false;
        }
        try {
            list = assets.list("");
        } catch (Throwable unused) {
        }
        if (list != null && list.length != 0) {
            for (String str : list) {
                if (str.equals("dynloader")) {
                    a aVar = new a();
                    d = aVar;
                    aVar.a = true;
                    return true;
                }
            }
            return false;
        }
        a aVar2 = new a();
        d = aVar2;
        aVar2.a = false;
        return false;
    }

    @Keep
    public static InputStream open(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ec5fb02adaf24141ce8b61f46361fdd", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ec5fb02adaf24141ce8b61f46361fdd");
        }
        if (c != null) {
            return c.a(context, str);
        }
        try {
            return context.getApplicationContext().getAssets().open(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Keep
    public static boolean load(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7329e105c48f9a3cb80faf599f62faef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7329e105c48f9a3cb80faf599f62faef")).booleanValue();
        }
        if (c != null) {
            return c.a(str);
        }
        try {
            k.b(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Keep
    @Deprecated
    public static boolean toggleDownload(com.meituan.android.loader.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "686c9c7260d9df4e37c99c415eda6e0a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "686c9c7260d9df4e37c99c415eda6e0a")).booleanValue();
        }
        if (c != null) {
            c.a(aVar);
            return true;
        }
        return false;
    }

    @Keep
    @Deprecated
    public static boolean toggleDownload(com.meituan.android.loader.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8ed797cc0e5e527af2148b3c790a744", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8ed797cc0e5e527af2148b3c790a744")).booleanValue();
        }
        if (c != null) {
            c.a(aVar, z);
            return true;
        }
        return false;
    }

    @Keep
    public static boolean toggleDownload(com.meituan.android.loader.a aVar, c cVar, boolean z) {
        Object[] objArr = {aVar, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5c5c204f8f1ae32526bd30364a51faf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5c5c204f8f1ae32526bd30364a51faf")).booleanValue();
        }
        if (c != null) {
            c.a(aVar, cVar, z);
            return true;
        }
        return false;
    }

    @Keep
    public static void debug(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a380ac2ca3ec46fd9ab016962df51ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a380ac2ca3ec46fd9ab016962df51ec");
        } else if (c != null) {
            c.a(z);
        }
    }

    @Keep
    public static int downloadSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c3f0a9bd165a79837b213f8c472f6f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c3f0a9bd165a79837b213f8c472f6f6")).intValue();
        }
        if (c != null) {
            return c.a();
        }
        return -1;
    }

    @Keep
    public static String getPath(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7dcbdfdf5bb970c5208eca6f01ad3978", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7dcbdfdf5bb970c5208eca6f01ad3978");
        }
        if (c != null) {
            return c.b(str, i);
        }
        return null;
    }

    public static void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef167470704ae0bf2941cb146d0783d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef167470704ae0bf2941cb146d0783d4");
            return;
        }
        e = fVar;
        k.a(fVar);
    }

    public static f b() {
        return e;
    }
}
