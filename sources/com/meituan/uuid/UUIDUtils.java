package com.meituan.uuid;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UUIDUtils {
    private static final String TAG = "UUIDUtils";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void logReport(Context context, String str, int i, String[] strArr) {
    }

    public static Context getAppContext(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb99360a15d6991bf2a32c5bb04f6f15", 6917529027641081856L)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb99360a15d6991bf2a32c5bb04f6f15");
        }
        if (context != null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            return context;
        }
        return null;
    }

    public static int getCurrentLineNumber() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4feb2abdcd923d10653f815f23fc2c29", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4feb2abdcd923d10653f815f23fc2c29")).intValue() : Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
