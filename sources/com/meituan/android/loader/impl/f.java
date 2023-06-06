package com.meituan.android.loader.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.loader.impl.bean.DynLocalContainerBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a = null;
    private static long b = -1;

    public static String a(String str) {
        int indexOf;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9d27b1012fac8b94b858419e66e2bc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9d27b1012fac8b94b858419e66e2bc2");
        }
        if (str != null && (indexOf = str.indexOf("/assets/")) > 0) {
            int indexOf2 = str.indexOf("/", indexOf + 8);
            return indexOf2 > 0 ? str.substring(0, indexOf2) : str;
        }
        return null;
    }

    public static String b(String str) {
        int i;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96ca35b6b47bb1ef71b63ee3e5fe2b57", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96ca35b6b47bb1ef71b63ee3e5fe2b57");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("dynloader_lib-")) {
            return str.startsWith("dynloader_assets-") ? str.substring(17) : "";
        }
        int indexOf = str.indexOf("-lib");
        return (indexOf <= 0 || (i = indexOf + 4) >= str.length()) ? "" : str.substring(i);
    }

    public static String c(String str) {
        int i;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "029965344059b65193223d2f76a72699", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "029965344059b65193223d2f76a72699");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf("-lib");
        return (!str.startsWith("dynloader_lib-") || indexOf <= 0 || (i = indexOf + 4) >= str.length()) ? "" : str.substring(i);
    }

    public static DynLocalContainerBean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aad59b5b88de1dff18e8c21f4da5dfa6", RobustBitConfig.DEFAULT_VALUE) ? (DynLocalContainerBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aad59b5b88de1dff18e8c21f4da5dfa6") : a(context, "dynloader");
    }

    private static DynLocalContainerBean a(Context context, String str) {
        BufferedReader bufferedReader;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "818840a7d86327587767df0757fd0ff6", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynLocalContainerBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "818840a7d86327587767df0757fd0ff6");
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
            try {
                DynLocalContainerBean dynLocalContainerBean = (DynLocalContainerBean) new Gson().fromJson(bufferedReader, new TypeToken<DynLocalContainerBean>() { // from class: com.meituan.android.loader.impl.f.1
                }.getType());
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return dynLocalContainerBean;
            } catch (JsonSyntaxException | IOException unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (JsonSyntaxException | IOException unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    public static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3c7e46ae24433065fba7a469bfa369c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3c7e46ae24433065fba7a469bfa369c");
            return;
        }
        com.dianping.networklog.c.a(str, 3, new String[]{"DynLoader"});
        if (a.d) {
            String str2 = a.b;
        }
    }

    public static void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee4b01913f85989beca6f21927639fa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee4b01913f85989beca6f21927639fa0");
            return;
        }
        com.dianping.networklog.c.a(str, 3, new String[]{"DynLoader"});
        if (a.d) {
            Log.e(a.b, str);
        }
    }

    public static void a(String str, String str2) {
        long currentTimeMillis;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2af449e36392f8802c1d76584e7cf639", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2af449e36392f8802c1d76584e7cf639");
            return;
        }
        b = System.currentTimeMillis();
        d(">>>DynLoaderTime, duration:" + (currentTimeMillis - b) + ", name:" + str + ", info:" + str2);
    }
}
