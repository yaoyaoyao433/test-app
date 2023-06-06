package com.huawei.hms.support.api.opendevice;

import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.opendevice.u;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.entity.opendevice.HuaweiOpendeviceNaming;
import com.huawei.hms.support.api.entity.opendevice.OdidReq;
import com.huawei.hms.support.log.HMSLog;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HuaweiOpendeviceApiImpl implements HuaweiOpendeviceApi {
    @Override // com.huawei.hms.support.api.opendevice.HuaweiOpendeviceApi
    public PendingResult<OdidResult> getOdid(HuaweiApiClient huaweiApiClient) {
        HMSLog.i("OpenIdentifierApiImpl", "Enter getOdid");
        return new u(this, huaweiApiClient, HuaweiOpendeviceNaming.getOdid, new OdidReq());
    }
}
