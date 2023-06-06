package com.meituan.android.common.aidata.ai.mlmodel.predictor.exception;

import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PredictorCreateException extends BlueException {
    private static final String UNKNOWN_NAME = "UNKNOWN";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mName;

    public PredictorCreateException(String str) {
        this("UNKNOWN", str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cdba56ffcb526e55acb116c22c56579", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cdba56ffcb526e55acb116c22c56579");
        }
    }

    public PredictorCreateException(String str, String str2) {
        super(str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d9c0b3146d4501968fbaf36063e0d72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d9c0b3146d4501968fbaf36063e0d72");
        } else {
            this.mName = str;
        }
    }

    public String getPredictorType() {
        return this.mName;
    }
}
