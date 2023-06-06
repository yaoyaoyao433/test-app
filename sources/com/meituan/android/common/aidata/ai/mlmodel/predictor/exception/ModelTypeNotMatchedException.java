package com.meituan.android.common.aidata.ai.mlmodel.predictor.exception;

import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ModelTypeNotMatchedException extends BlueException {
    private static final String UNKNOWN_NAME = "UNKNOWN";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mExpectName;
    private String mFactName;

    public ModelTypeNotMatchedException(String str, String str2, String str3) {
        super(str3);
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "070a12e5c02cd2aff0ae12dd4e2a48fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "070a12e5c02cd2aff0ae12dd4e2a48fb");
            return;
        }
        this.mExpectName = str;
        this.mFactName = str2;
    }

    public String getExpectName() {
        return this.mExpectName;
    }

    public String getFactName() {
        return this.mFactName;
    }
}
