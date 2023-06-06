package com.sankuai.waimai.business.page.home.utils;

import android.support.annotation.MainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a = null;
    private static List<a> b = null;
    private static boolean c = false;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    @MainThread
    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "645a5adfcc2cd407cf8f7f7787d0ccd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "645a5adfcc2cd407cf8f7f7787d0ccd2");
        } else if (c) {
        } else {
            com.sankuai.waimai.platform.utils.l.a("LaunchManager.registerObserver");
            if (b == null) {
                b = new ArrayList();
            }
            b.add(aVar);
        }
    }

    public static boolean a() {
        return c;
    }

    @MainThread
    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e458129afeb98500ec7e083f1f02defc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e458129afeb98500ec7e083f1f02defc");
        } else if (c) {
        } else {
            com.sankuai.waimai.platform.utils.l.a("LaunchManager.launchFinish");
            if (z) {
                com.sankuai.waimai.platform.utils.l.a(new Runnable() { // from class: com.sankuai.waimai.business.page.home.utils.i.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5903ad724ec1b92f27b301f079b15580", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5903ad724ec1b92f27b301f079b15580");
                        } else {
                            i.c();
                        }
                    }
                }, 5000, "launchFinish");
            } else {
                c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12f0c8146fcafce0c958f00dd885b687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12f0c8146fcafce0c958f00dd885b687");
            return;
        }
        c = true;
        if (b == null || b.size() == 0) {
            return;
        }
        for (a aVar : b) {
            aVar.a();
        }
        b = null;
    }
}
