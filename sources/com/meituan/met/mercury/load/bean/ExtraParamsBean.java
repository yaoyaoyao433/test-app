package com.meituan.met.mercury.load.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class ExtraParamsBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String key;
    private Object value;

    public ExtraParamsBean(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0267ca01e71cae257cd697782745cf4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0267ca01e71cae257cd697782745cf4c");
            return;
        }
        this.key = str;
        this.value = obj;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1f1b21914df2dce90b388a80f5636b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1f1b21914df2dce90b388a80f5636b4");
        }
        return "ExtraParamsBean{key='" + this.key + "', value=" + this.value + '}';
    }
}
