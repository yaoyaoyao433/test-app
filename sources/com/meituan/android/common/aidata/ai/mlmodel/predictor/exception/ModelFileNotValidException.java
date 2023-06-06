package com.meituan.android.common.aidata.ai.mlmodel.predictor.exception;

import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ModelFileNotValidException extends BlueException {
    private static final String UNKNOWN_NAME = "UNKNOWN";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mName;

    public ModelFileNotValidException(String str) {
        this("UNKNOWN", str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "496ea10ef1498c92696803afeab61aa5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "496ea10ef1498c92696803afeab61aa5");
        }
    }

    public ModelFileNotValidException(String str, String str2) {
        super(str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e236c1a2b64de842f4aa001546d3a218", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e236c1a2b64de842f4aa001546d3a218");
        } else {
            this.mName = str;
        }
    }

    public String getModelFileName() {
        return this.mName;
    }
}
