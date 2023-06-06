package com.huawei.hms.push.ups;

import android.content.Context;
import com.huawei.hmf.tasks.c;
import com.huawei.hmf.tasks.f;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.HmsMessaging;
import com.huawei.hms.push.s;
import com.huawei.hms.push.ups.entity.CodeResult;
import com.huawei.hms.push.ups.entity.TokenResult;
import com.huawei.hms.push.ups.entity.UPSRegisterCallBack;
import com.huawei.hms.push.ups.entity.UPSTurnCallBack;
import com.huawei.hms.push.ups.entity.UPSUnRegisterCallBack;
import com.huawei.hms.support.log.HMSLog;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class UPSService {
    public static void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallBack uPSRegisterCallBack) {
        HMSLog.i("UPSService", "invoke registerToken");
        Preconditions.checkNotNull(uPSRegisterCallBack);
        if (!s.b()) {
            uPSRegisterCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
            return;
        }
        try {
            uPSRegisterCallBack.onResult(new TokenResult(HmsInstanceId.getInstance(context).getToken(str, null)));
        } catch (ApiException e) {
            uPSRegisterCallBack.onResult(new TokenResult(e.getStatusCode(), e.getMessage()));
        }
    }

    public static void turnOffPush(Context context, final UPSTurnCallBack uPSTurnCallBack) {
        HMSLog.i("UPSService", "invoke turnOffPush");
        Preconditions.checkNotNull(uPSTurnCallBack);
        if (!s.b()) {
            uPSTurnCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
        } else {
            HmsMessaging.getInstance(context).turnOffPush().a(new c<Void>() { // from class: com.huawei.hms.push.ups.UPSService.2
                @Override // com.huawei.hmf.tasks.c
                public final void onComplete(f<Void> fVar) {
                    if (fVar.b()) {
                        UPSTurnCallBack.this.onResult(new CodeResult());
                        return;
                    }
                    ApiException apiException = (ApiException) fVar.e();
                    UPSTurnCallBack.this.onResult(new CodeResult(apiException.getStatusCode(), apiException.getMessage()));
                }
            });
        }
    }

    public static void turnOnPush(Context context, final UPSTurnCallBack uPSTurnCallBack) {
        HMSLog.i("UPSService", "invoke turnOnPush");
        Preconditions.checkNotNull(uPSTurnCallBack);
        if (!s.b()) {
            uPSTurnCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
        } else {
            HmsMessaging.getInstance(context).turnOnPush().a(new c<Void>() { // from class: com.huawei.hms.push.ups.UPSService.1
                @Override // com.huawei.hmf.tasks.c
                public final void onComplete(f<Void> fVar) {
                    if (fVar.b()) {
                        UPSTurnCallBack.this.onResult(new CodeResult());
                        return;
                    }
                    ApiException apiException = (ApiException) fVar.e();
                    UPSTurnCallBack.this.onResult(new CodeResult(apiException.getStatusCode(), apiException.getMessage()));
                }
            });
        }
    }

    public static void unRegisterToken(Context context, UPSUnRegisterCallBack uPSUnRegisterCallBack) {
        HMSLog.i("UPSService", "invoke unRegisterToken");
        Preconditions.checkNotNull(uPSUnRegisterCallBack);
        if (!s.b()) {
            uPSUnRegisterCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
            return;
        }
        try {
            HmsInstanceId.getInstance(context).deleteToken(null, null);
            uPSUnRegisterCallBack.onResult(new TokenResult());
        } catch (ApiException e) {
            uPSUnRegisterCallBack.onResult(new TokenResult(e.getStatusCode(), e.getMessage()));
        }
    }
}
