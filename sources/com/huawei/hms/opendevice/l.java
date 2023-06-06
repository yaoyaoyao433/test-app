package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResp;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class l extends TaskApiCall<PushClient, TokenResult> {
    public Context a;
    public TokenReq b;

    public l(String str, TokenReq tokenReq, Context context, String str2) {
        super(str, JsonUtil.createJsonString(tokenReq), str2);
        this.a = context;
        this.b = tokenReq;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, com.huawei.hmf.tasks.g<TokenResult> gVar) {
        if (responseErrorCode.getErrorCode() != 0) {
            String str2 = HmsInstanceId.TAG;
            HMSLog.e(str2, "TokenTask failed, ErrorCode: " + responseErrorCode.getErrorCode());
            ErrorEnum fromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
            if (fromCode != ErrorEnum.ERROR_UNKNOWN) {
                gVar.a(fromCode.toApiException());
            } else {
                gVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        } else {
            TokenResp tokenResp = (TokenResp) JsonUtil.jsonToEntity(str, new TokenResp());
            ErrorEnum fromCode2 = ErrorEnum.fromCode(tokenResp.getRetCode());
            if (fromCode2 != ErrorEnum.SUCCESS) {
                gVar.a(fromCode2.toApiException());
                String str3 = HmsInstanceId.TAG;
                HMSLog.e(str3, "TokenTask failed, StatusCode:" + fromCode2.getExternalCode());
            } else {
                TokenResult tokenResult = new TokenResult();
                tokenResult.setToken(tokenResp.getToken());
                tokenResult.setBelongId(tokenResp.getBelongId());
                tokenResult.setRetCode(ErrorEnum.fromCode(tokenResp.getRetCode()).getExternalCode());
                gVar.a((com.huawei.hmf.tasks.g<TokenResult>) tokenResult);
                String token = tokenResp.getToken();
                if (TextUtils.isEmpty(token)) {
                    HMSLog.i(HmsInstanceId.TAG, "GetTokenTask receive a empty token, please check HmsMessageService.onNewToken receive result.");
                    q.a(pushClient.getContext(), getUri(), responseErrorCode);
                    return;
                }
                a(token, this.b.getSubjectId());
                n.a(this.a, token);
            }
        }
        q.a(pushClient.getContext(), getUri(), responseErrorCode);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.b.isMultiSender() ? 50004300 : 30000000;
    }

    public final void a(String str, String str2) {
        if (i.a(this.a).b(str2).equals(str)) {
            return;
        }
        HMSLog.i(HmsInstanceId.TAG, "receive a token, refresh the local token");
        i.a(this.a).b(str2, str);
    }
}
