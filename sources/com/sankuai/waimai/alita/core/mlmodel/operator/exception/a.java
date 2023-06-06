package com.sankuai.waimai.alita.core.mlmodel.operator.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends Exception {
    public static ChangeQuickRedirect a = null;
    public static String b = "OperatorException";
    public String c;

    public a(String str) {
        this("EMPTY", str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "982b95cc970ba9a3a38ad8372ac254b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "982b95cc970ba9a3a38ad8372ac254b5");
        }
    }

    public a(String str, String str2) {
        super(str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a270e3472e1d16716c8884cad9a4ac9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a270e3472e1d16716c8884cad9a4ac9b");
        } else {
            this.c = str;
        }
    }
}
