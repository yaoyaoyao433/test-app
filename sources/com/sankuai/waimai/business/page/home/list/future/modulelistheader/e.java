package com.sankuai.waimai.business.page.home.list.future.modulelistheader;

import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    private static boolean b = true;

    public static boolean a() {
        return b;
    }

    public static void a(boolean z) {
        b = z;
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93db034f68d40dd6d4be00d74baf475e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93db034f68d40dd6d4be00d74baf475e");
            return;
        }
        String d = d();
        Object[] objArr2 = {"personized_tips_key", d};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bcb0ecc0f809ee58e59d7c9c956dd3d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bcb0ecc0f809ee58e59d7c9c956dd3d5");
        } else {
            q.a(com.meituan.android.singleton.b.a, "personized_tips_channel").a("personized_tips_key", d);
        }
    }

    public static String c() {
        String b2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aaa910ae72f2339158b6be4a124a7ac0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aaa910ae72f2339158b6be4a124a7ac0");
        }
        String d = d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b2dddb5053c881a10107a0a0b08fd2a0", RobustBitConfig.DEFAULT_VALUE)) {
            b2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b2dddb5053c881a10107a0a0b08fd2a0");
        } else {
            Object[] objArr3 = {"personized_tips_key"};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            b2 = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4dad2558de6c7cdcd166a64c746ade69", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4dad2558de6c7cdcd166a64c746ade69") : q.a(com.meituan.android.singleton.b.a, "personized_tips_channel").b("personized_tips_key", "");
        }
        return TextUtils.equals(d, b2) ? "0" : "1";
    }

    private static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c0898c0f9c233be15e250534fb794c0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c0898c0f9c233be15e250534fb794c0") : new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
}
