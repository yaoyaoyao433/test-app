package com.dianping.live.live.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.SimpleDateFormat;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class k {
    public static ChangeQuickRedirect b;
    public static final SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd");

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "891db4f0780c878196d07af5d777d96d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "891db4f0780c878196d07af5d777d96d");
            return;
        }
        com.dianping.networklog.c.a(str, 3);
        i.a("MLive_Logan", str);
    }
}
