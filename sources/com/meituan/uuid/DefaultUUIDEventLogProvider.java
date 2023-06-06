package com.meituan.uuid;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DefaultUUIDEventLogProvider implements UUIDEventLogProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.uuid.UUIDEventLogProvider
    public void commonInfoReport(String str) {
    }

    @Override // com.meituan.uuid.UUIDEventLogProvider
    public void getUUIDReturnReport(String str) {
    }

    @Override // com.meituan.uuid.UUIDEventLogProvider
    public void throwableReport(Throwable th) {
    }

    private static String getStackTraceString(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a47cad51bc9a32654bd9dc253e51a637", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a47cad51bc9a32654bd9dc253e51a637");
        }
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}
