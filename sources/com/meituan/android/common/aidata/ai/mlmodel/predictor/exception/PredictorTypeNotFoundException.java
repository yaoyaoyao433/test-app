package com.meituan.android.common.aidata.ai.mlmodel.predictor.exception;

import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PredictorTypeNotFoundException extends BlueException {
    private static final String UNKNOWN_NAME = "UNKNOWN";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mName;

    public PredictorTypeNotFoundException(String str) {
        this("UNKNOWN", str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f31d87d5563923c411814ff752ac5a06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f31d87d5563923c411814ff752ac5a06");
        }
    }

    public PredictorTypeNotFoundException(String str, String str2) {
        super(str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7974040cf3b4e9bbba2af42163fd4349", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7974040cf3b4e9bbba2af42163fd4349");
        } else {
            this.mName = str;
        }
    }

    public PredictorTypeNotFoundException(String str, String str2, String str3) {
        super(str2, str3);
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e06fedda995ad13a1eefb0eaee02fa8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e06fedda995ad13a1eefb0eaee02fa8");
        } else {
            this.mName = str;
        }
    }

    public String getName() {
        return this.mName;
    }
}
