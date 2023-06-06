package com.meituan.android.quickpass.qpdev;

import android.support.annotation.Keep;
import android.util.Log;
import com.meituan.android.quickpass.qpdev.bean.OnlineLogConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class QuickPassDevManager {
    public static ChangeQuickRedirect a;
    public OnlineLogConfig b;
    public HashMap c;

    public QuickPassDevManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2424b20f0507e19aaa22dd8d06d8ea91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2424b20f0507e19aaa22dd8d06d8ea91");
        } else if (this.b == null) {
            this.b = new OnlineLogConfig();
        }
    }

    public static QuickPassDevManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5226c7dde4884e9b3534860bfa0afe1b", RobustBitConfig.DEFAULT_VALUE) ? (QuickPassDevManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5226c7dde4884e9b3534860bfa0afe1b") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        private static QuickPassDevManager a = new QuickPassDevManager();
    }

    public final void a(int i, String str, String str2) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e9c455d7287a51f710a7b2182508ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e9c455d7287a51f710a7b2182508ef");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1797e3efa0a798134389f222420532d", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1797e3efa0a798134389f222420532d")).booleanValue();
        } else if (this.b != null) {
            z = this.b.isOnlineLogOn();
        }
        if (z) {
            String str3 = CommonConstant.Symbol.BRACKET_LEFT + getClassName() + CommonConstant.Symbol.COLON + getLineNumber() + CommonConstant.Symbol.BRACKET_RIGHT + str2;
            Log.println(i, str, str3);
            this.b.addOnlineLog(str3);
        }
    }

    @Keep
    private static int getLineNumber() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b01f43d01b8d2fee47e54cb60083d16", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b01f43d01b8d2fee47e54cb60083d16")).intValue();
        }
        try {
            return Thread.currentThread().getStackTrace()[4].getLineNumber();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    @Keep
    private static String getClassName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5c6a8f2abbc9783dffc881542716eff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5c6a8f2abbc9783dffc881542716eff");
        }
        try {
            String className = Thread.currentThread().getStackTrace()[4].getClassName();
            return className.substring(className.lastIndexOf(CommonConstant.Symbol.DOT) + 1);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
