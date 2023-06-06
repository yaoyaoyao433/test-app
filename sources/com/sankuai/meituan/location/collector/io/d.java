package com.sankuai.meituan.location.collector.io;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.cipstorage.x;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static File c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c49277b24b4b0f35bdf107ef99fcecb9", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c49277b24b4b0f35bdf107ef99fcecb9");
        }
        File a2 = a(context);
        if (!a2.exists() || !a2.isDirectory()) {
            a2.mkdirs();
        }
        String str = "collector_store_dir/" + b(context);
        x.a(context, com.meituan.android.common.locate.util.a.a, u.e, str);
        File a3 = q.a(context, com.meituan.android.common.locate.util.a.a, str, u.e);
        LogUtils.a("FileNameProvider ensureSelfProcessLockExist " + a3.getPath());
        if (!a3.exists()) {
            try {
                a3.createNewFile();
            } catch (IOException e) {
                LogUtils.a(e);
            }
        }
        return a3;
    }

    public static File a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02f09b7185800f52297e2645989127e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02f09b7185800f52297e2645989127e2");
        }
        String str = "collector_store_dir/" + com.sankuai.meituan.location.collector.utils.h.a(context).b + "/";
        x.a(context, com.meituan.android.common.locate.util.a.a, u.e, str);
        LogUtils.a("FileNameProvider getSelfProcessStoreDire " + q.a(context, com.meituan.android.common.locate.util.a.a, str, u.e).getPath());
        return q.a(context, com.meituan.android.common.locate.util.a.a, str, u.e);
    }

    public static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ac905ce859b93b577a3e667b00a7cde", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ac905ce859b93b577a3e667b00a7cde");
        }
        return com.sankuai.meituan.location.collector.utils.h.a(context).b + ".lock";
    }
}
