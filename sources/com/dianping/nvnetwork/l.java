package com.dianping.nvnetwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintWriter;
import java.io.StringWriter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class l<T> extends rx.j<T> {
    public static ChangeQuickRedirect a;

    @Override // rx.e
    public void onCompleted() {
    }

    @Override // rx.e
    public void onNext(T t) {
    }

    @Override // rx.e
    public void onError(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1adb6a99316b6a012e58a8be5a42599", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1adb6a99316b6a012e58a8be5a42599");
            return;
        }
        com.dianping.networklog.c.a("NvSafeSubscriber -> " + a(th), 4);
    }

    private static String a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85f75183d3f492e6fd9e6e7549967244", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85f75183d3f492e6fd9e6e7549967244");
        }
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            return stringWriter2;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }
}
