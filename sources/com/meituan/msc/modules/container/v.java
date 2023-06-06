package com.meituan.msc.modules.container;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.msc.lib.interfaces.PageNotFoundCallback;
import com.meituan.msc.modules.apploader.PageNotFoundReporter;
import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class v {
    public static ChangeQuickRedirect a;
    private static final Set<String> b = new HashSet();
    private static final Set<String> c = new HashSet();

    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, byte] */
    public static boolean a(com.meituan.msc.modules.engine.h hVar, String str, String str2, boolean z, boolean z2) {
        int i;
        int i2;
        ?? r5;
        Object[] objArr = {hVar, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbbebc754bb8ec4c966bf4a4a6c66a7f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbbebc754bb8ec4c966bf4a4a6c66a7f")).booleanValue();
        }
        List<PageNotFoundCallback> a2 = com.sankuai.meituan.serviceloader.b.a(PageNotFoundCallback.class, str);
        if (a2 == null || a2.size() <= 0) {
            i = 3;
            i2 = 4;
            r5 = 0;
        } else {
            boolean z3 = true;
            for (PageNotFoundCallback pageNotFoundCallback : a2) {
                if (pageNotFoundCallback == null) {
                    com.meituan.msc.modules.reporter.g.d("PageNotFoundHelper", "callbackPageNotFound callback is null");
                } else {
                    z3 = z3;
                    if (!pageNotFoundCallback.a(str, str2, z, z2)) {
                        z3 = false;
                    }
                    com.meituan.msc.modules.reporter.g.d("PageNotFoundHelper", "callbackPageNotFound callback user", str, str2, "isWidget", Boolean.valueOf(z), "canReloadWidget", Boolean.valueOf(z2), "isUserHandled", Boolean.valueOf(z3));
                }
            }
            i = 3;
            i2 = 4;
            r5 = z3;
        }
        Object[] objArr2 = new Object[i2];
        objArr2[0] = hVar;
        objArr2[1] = Byte.valueOf((byte) r5);
        objArr2[2] = str2;
        objArr2[i] = Byte.valueOf(z2 ? (byte) 1 : (byte) 0);
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "410d9c27ca6779f93326e42347e60029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "410d9c27ca6779f93326e42347e60029");
        } else if (r5 != 0) {
            if (!z2) {
                i = -1;
            }
            new PageNotFoundReporter(hVar, str2).a(i, -1, true);
        } else {
            Object[] objArr3 = new Object[i];
            objArr3[0] = hVar;
            objArr3[1] = str2;
            objArr3[2] = Byte.valueOf(z2 ? (byte) 1 : (byte) 0);
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e3be70dc5c35b4184313628c3da16e38", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e3be70dc5c35b4184313628c3da16e38");
            } else {
                int i3 = z2 ? 3 : -1;
                AppMetaInfoWrapper appMetaInfoWrapper = hVar.r.h;
                if (appMetaInfoWrapper == null) {
                    i = -1;
                } else if (appMetaInfoWrapper.isFromCache()) {
                    i = !z2 ? 1 : 2;
                }
                new PageNotFoundReporter(hVar, str2).a(i3, i);
            }
        }
        return r5;
    }

    public static boolean a(com.meituan.msc.modules.engine.h hVar, String str) {
        Object[] objArr = {hVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c9b2cfb78c03075250cdae14adb837a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c9b2cfb78c03075250cdae14adb837a")).booleanValue();
        }
        if (!a(hVar)) {
            com.meituan.msc.modules.reporter.g.d("PageNotFoundHelper", "onlyWidgetAttachedAndOnSameActivity is false");
            return false;
        }
        AppMetaInfoWrapper appMetaInfoWrapper = hVar.r.h;
        if (appMetaInfoWrapper == null || !appMetaInfoWrapper.isFromCache()) {
            return false;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3e5c35b23bd7b6ea9e33dd78c06447f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3e5c35b23bd7b6ea9e33dd78c06447f0");
        } else if (!TextUtils.isEmpty(str)) {
            b.add(str);
        }
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7c7b249aa0a4a3c75e25fc0409985e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7c7b249aa0a4a3c75e25fc0409985e54");
        } else if (!TextUtils.isEmpty(str)) {
            c.add(str);
        }
        return true;
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a20e5dfd33df3345d5500a5696c43122", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a20e5dfd33df3345d5500a5696c43122");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            b.remove(str);
        }
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "104ad8ed9536abdf79c0f5ed08de0342", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "104ad8ed9536abdf79c0f5ed08de0342")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return b.contains(str);
    }

    public static boolean a(com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        Activity activity = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bccfff3b5030d4f9e8cee43a34d345b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bccfff3b5030d4f9e8cee43a34d345b4")).booleanValue();
        }
        List<p> d = hVar.b().d();
        if (com.meituan.msc.common.utils.f.a((List) d)) {
            return false;
        }
        for (p pVar : d) {
            if (activity != null && activity != pVar.C()) {
                return false;
            }
            activity = pVar.C();
            if (!pVar.A()) {
                return false;
            }
        }
        return true;
    }

    public static void a(com.meituan.msc.modules.engine.h hVar, String str, int i) {
        Object[] objArr = {hVar, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af31a1a0028aae0da98db5537bb9f5af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af31a1a0028aae0da98db5537bb9f5af");
        } else {
            new PageNotFoundReporter(hVar, str).a(i, -1);
        }
    }

    public static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3876c1676563a8c20bb97fdc1c6eedd9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3876c1676563a8c20bb97fdc1c6eedd9")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return c.contains(str);
    }

    public static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d0a4afc0baf51cc3d6103e7e8c31d1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d0a4afc0baf51cc3d6103e7e8c31d1e");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            c.remove(str);
        }
    }
}
