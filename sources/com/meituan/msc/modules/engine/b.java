package com.meituan.msc.modules.engine;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.msc.common.utils.y;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.preload.PackageDebugHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67cae013321123de57f971c39d8ec196", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67cae013321123de57f971c39d8ec196");
        }
        if (hVar == null) {
            return "";
        }
        if (!TextUtils.isEmpty(hVar.a())) {
            return hVar.a();
        }
        return hVar.r.n();
    }

    public static void a(h hVar, String str, com.meituan.msc.modules.container.k kVar) {
        Object[] objArr = {hVar, str, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7b8be5cc3edf30482c1f98920430836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7b8be5cc3edf30482c1f98920430836");
        } else if (MSCEnvHelper.getEnvInfo().isProdEnv() || hVar == null) {
        } else {
            com.meituan.msc.modules.apploader.a aVar = (com.meituan.msc.modules.apploader.a) hVar.c(com.meituan.msc.modules.apploader.a.class);
            Object[] objArr2 = {str, kVar, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0a07106fca203b7e7fe491fb9121e102", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0a07106fca203b7e7fe491fb9121e102");
            } else if (aVar != null) {
                String str2 = kVar.e;
                aVar.b(kVar.a());
                aVar.b(PackageDebugHelper.b.a(str, kVar));
                aVar.c(str2);
            }
            String h = aVar.h();
            if (TextUtils.isEmpty(h)) {
                return;
            }
            com.meituan.msc.modules.reporter.g.d("Launch", "setPreviewCheckUpdateUrl:", h);
        }
    }

    public static boolean a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e9dc7ad7d05313f51f9efc22f6d9586", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e9dc7ad7d05313f51f9efc22f6d9586")).booleanValue() : MSCEnvHelper.isInited() && !MSCEnvHelper.getEnvInfo().isProdEnv() && y.a(intent, "reload", false);
    }
}
