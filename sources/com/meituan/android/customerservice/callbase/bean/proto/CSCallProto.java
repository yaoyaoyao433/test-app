package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallProto implements Serializable {
    public static final String VERSION = "1.0.0";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String method;
    private long ts;
    private String ver;

    public CSCallProto() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b219ac5be970e10af0d30fdf0ede6168", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b219ac5be970e10af0d30fdf0ede6168");
        } else {
            setVer("1.0.0");
        }
    }

    public void setVer(String str) {
        this.ver = str;
    }

    public void setTs(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "345f0edd0515b6c057daf0ced8343cf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "345f0edd0515b6c057daf0ced8343cf2");
        } else {
            this.ts = j;
        }
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public long getTs() {
        return this.ts;
    }

    public String getMethod() {
        return this.method;
    }
}
