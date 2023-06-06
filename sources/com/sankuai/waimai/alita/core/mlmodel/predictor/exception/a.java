package com.sankuai.waimai.alita.core.mlmodel.predictor.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends Exception {
    public static ChangeQuickRedirect a = null;
    public static String b = "ModelFileNotValidException";
    private String c;

    public a(String str, String str2) {
        super(str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed5e3b8691b1153da7e624cfe0478eb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed5e3b8691b1153da7e624cfe0478eb6");
        } else {
            this.c = str;
        }
    }
}
