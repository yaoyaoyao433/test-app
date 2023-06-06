package com.sankuai.meituan.location.collector.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
/* loaded from: classes4.dex */
public class h {
    public static ChangeQuickRedirect a;
    private static volatile h e;
    public String b;
    private boolean c;
    private String d;

    private h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48d4ae1eef9ff0bd55ac39e9d9aa4ecb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48d4ae1eef9ff0bd55ac39e9d9aa4ecb");
            return;
        }
        this.d = ProcessUtils.getCurrentProcessName(context);
        if (this.d == null) {
            this.d = "";
        }
        this.b = this.d.replaceAll(CommonConstant.Symbol.COLON, CommonConstant.Symbol.UNDERLINE).replaceAll("\\.", CommonConstant.Symbol.UNDERLINE);
        this.c = TextUtils.equals(context.getPackageName(), this.d);
        LogUtils.a("ProcessInfoProvider processName:" + this.d + "isMain:" + this.c);
    }

    public static h a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ddd131fd9a285995a48603418b9f26e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ddd131fd9a285995a48603418b9f26e9");
        }
        if (e == null) {
            synchronized (h.class) {
                if (e == null) {
                    e = new h(context);
                }
            }
        }
        return e;
    }
}
