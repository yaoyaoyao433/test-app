package com.meituan.android.common.locate.provider;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
/* loaded from: classes2.dex */
public class s {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile s d;
    private boolean a;
    private String b;
    private String c;

    public s(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0726a8dc94764797af88756fcc421bb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0726a8dc94764797af88756fcc421bb1");
            return;
        }
        this.b = ProcessUtils.getCurrentProcessName(context);
        if (this.b == null) {
            this.b = "";
        }
        this.c = this.b.replace(CommonConstant.Symbol.COLON, "");
        this.a = TextUtils.equals(context.getPackageName(), this.b);
    }

    public static s a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20a7cc1e69a8237ce6a8d105c391b64b", RobustBitConfig.DEFAULT_VALUE)) {
            return (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20a7cc1e69a8237ce6a8d105c391b64b");
        }
        if (d == null) {
            synchronized (s.class) {
                if (d == null) {
                    d = new s(context);
                }
            }
        }
        return d;
    }

    public boolean a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }
}
