package com.sankuai.meituan.takeoutnew.util.aop;

import android.os.Process;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k {
    public static ChangeQuickRedirect a;

    public static void a(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1263dfc2953a0f64a2cfb7724c8d291e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1263dfc2953a0f64a2cfb7724c8d291e");
            return;
        }
        Exception exc = new Exception("exit with code: 0");
        com.sankuai.waimai.foundation.utils.log.a.a(exc);
        com.dianping.networklog.c.a(exc.getMessage(), 3);
        System.exit(0);
    }

    public static void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a16de46a47d3fa41ac4816d23c8d19d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a16de46a47d3fa41ac4816d23c8d19d5");
            return;
        }
        Exception exc = new Exception("exit with killProcess");
        com.sankuai.waimai.foundation.utils.log.a.a(exc);
        com.dianping.networklog.c.a(exc.getMessage(), 3);
        Process.killProcess(i);
    }
}
