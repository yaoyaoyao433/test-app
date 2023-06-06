package com.meituan.android.common.dfingerprint.dfpid.oaid.helpers;

import android.content.Context;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class XiaomiDeviceIDHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Object idImpl;
    private Class idProvider;
    private Context mContext;
    private Method oaid;

    public XiaomiDeviceIDHelper(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2cd8549d76b12052b28a59c5ad1f29d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2cd8549d76b12052b28a59c5ad1f29d");
            return;
        }
        this.mContext = context;
        try {
            this.idProvider = Class.forName("com.android.id.impl.IdProviderImpl");
            this.idImpl = this.idProvider.newInstance();
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
        }
        try {
            this.oaid = this.idProvider.getMethod("getOAID", Context.class);
        } catch (Exception e2) {
            MTGuardLog.setErrorLogan(e2);
        }
    }

    private String invokeMethod(Context context, Method method) {
        Object[] objArr = {context, method};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ca83418df9f4aea0676a919c1a185fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ca83418df9f4aea0676a919c1a185fe");
        }
        if (this.idImpl != null && method != null) {
            try {
                return (String) method.invoke(this.idImpl, context);
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
            }
        }
        return null;
    }

    public String getOAID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "726ed0db8f5e43a1da3f17673d6c390d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "726ed0db8f5e43a1da3f17673d6c390d") : invokeMethod(this.mContext, this.oaid);
    }
}
