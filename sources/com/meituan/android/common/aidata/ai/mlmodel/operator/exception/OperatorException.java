package com.meituan.android.common.aidata.ai.mlmodel.operator.exception;

import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OperatorException extends BlueException {
    private static final String EMPTY_NAME = "EMPTY";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mName;

    public OperatorException(String str) {
        this(EMPTY_NAME, str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d84545b625ed5cd9aedbb33058ca61e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d84545b625ed5cd9aedbb33058ca61e4");
        }
    }

    public OperatorException(String str, String str2) {
        super(str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eaaab5d82d2b73af432643ea2b21da32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eaaab5d82d2b73af432643ea2b21da32");
        } else {
            this.mName = str;
        }
    }

    public OperatorException(String str, String str2, String str3) {
        super(str, str2);
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36d4d25372d2a2d479a6ab92cf0cd531", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36d4d25372d2a2d479a6ab92cf0cd531");
        } else {
            this.mName = str3;
        }
    }

    public String getName() {
        return this.mName;
    }
}
