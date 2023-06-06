package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallGsidList extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long gid;
    private String legid;
    private String tenantId;

    public CSCallGsidList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "288f1e7e428ca64fedbf5308e822f3eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "288f1e7e428ca64fedbf5308e822f3eb");
        } else {
            setMethod(CSCallUris.SVID_CALL_GSIDLIST);
        }
    }

    public void setLegid(String str) {
        this.legid = str;
    }

    public void setGid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "862178206dfc2cf0f35c8d3184c71fec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "862178206dfc2cf0f35c8d3184c71fec");
        } else {
            this.gid = j;
        }
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }
}
