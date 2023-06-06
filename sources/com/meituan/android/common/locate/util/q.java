package com.meituan.android.common.locate.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public class q {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fad67c9c88960ab8c59ae382213a0a43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fad67c9c88960ab8c59ae382213a0a43");
            return;
        }
        try {
            Class.forName("com.example.location.utils.ToastUtils").getMethod("toast", String.class).invoke(null, str);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }
}
