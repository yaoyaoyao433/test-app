package com.sankuai.waimai.alita.core.mlmodel.predictor.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends Exception {
    public static ChangeQuickRedirect a = null;
    public static String b = "ModelTypeNotMatchedException";
    private String c;
    private String d;

    public b(String str, String str2, String str3) {
        super(str3);
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ce85f239be1ba3d1d59e8d4c33c899e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ce85f239be1ba3d1d59e8d4c33c899e");
            return;
        }
        this.c = str;
        this.d = str2;
    }
}
