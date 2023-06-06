package com.sankuai.waimai.alita.core.mlmodel.predictor.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends Exception {
    public static ChangeQuickRedirect a = null;
    public static String b = "TensorParseException";
    public String c;

    public d(String str) {
        this("EMPTY", str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27b8cb320962028ef48e7f0b578037fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27b8cb320962028ef48e7f0b578037fe");
        }
    }

    public d(String str, String str2) {
        super(str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a399759a2fc2698520ea61a23d00b84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a399759a2fc2698520ea61a23d00b84");
        } else {
            this.c = str;
        }
    }
}
