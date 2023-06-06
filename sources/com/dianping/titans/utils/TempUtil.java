package com.dianping.titans.utils;

import android.content.Context;
import android.os.Process;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TempUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static File getTempFile(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "02517e1dbe2fc0559e5b5cf7a3ebfeeb", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "02517e1dbe2fc0559e5b5cf7a3ebfeeb");
        }
        File a = q.a(context, "TITANS", "TEMP", u.b);
        File file = new File(a, Process.myPid() + CommonConstant.Symbol.UNDERLINE + System.currentTimeMillis());
        file.mkdirs();
        return file;
    }
}
