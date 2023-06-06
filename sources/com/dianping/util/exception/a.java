package com.dianping.util.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "379710a70b7f129b62da92ec6c3d313f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "379710a70b7f129b62da92ec6c3d313f");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            th.printStackTrace(new PrintStream(byteArrayOutputStream));
            byteArrayOutputStream.close();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return byteArrayOutputStream.toString();
    }
}
