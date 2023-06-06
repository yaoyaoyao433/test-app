package com.huawei.hms.opendevice;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.opendevice.OdidResp;
import com.huawei.hms.support.api.opendevice.HuaweiOpendeviceApiImpl;
import com.huawei.hms.support.api.opendevice.OdidResult;
import com.huawei.hms.support.log.HMSLog;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class u extends PendingResultImpl<OdidResult, OdidResp> {
    public final /* synthetic */ HuaweiOpendeviceApiImpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(HuaweiOpendeviceApiImpl huaweiOpendeviceApiImpl, ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        super(apiClient, str, iMessageEntity);
        this.a = huaweiOpendeviceApiImpl;
    }

    @Override // com.huawei.hms.support.api.PendingResultImpl
    /* renamed from: a */
    public OdidResult onComplete(OdidResp odidResp) {
        if (odidResp == null) {
            HMSLog.e("OpenIdentifierApiImpl", "getOdid OaidResp is null");
            return null;
        }
        Status commonStatus = odidResp.getCommonStatus();
        if (commonStatus == null) {
            HMSLog.e("OpenIdentifierApiImpl", "getOdid commonStatus is null");
            return null;
        }
        HMSLog.i("OpenIdentifierApiImpl", "getOdid onComplete:" + commonStatus.getStatusCode());
        OdidResult odidResult = new OdidResult();
        odidResult.setStatus(commonStatus);
        odidResult.setId(odidResp.getId());
        return odidResult;
    }
}
