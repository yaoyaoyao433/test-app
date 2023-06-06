package com.sankuai.waimai.alita.core.mlmodel.predictor.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends Exception {
    public static ChangeQuickRedirect a = null;
    public static String b = "PredictorCreateException";
    private String c;

    public c(String str, String str2) {
        super(str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67320a1484ea99d072773e7c936af951", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67320a1484ea99d072773e7c936af951");
        } else {
            this.c = str;
        }
    }
}
