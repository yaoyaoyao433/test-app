package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ProfileTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.ProfileReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HmsProfile {
    public static final int CUSTOM_PROFILE = 2;
    public static final int HUAWEI_PROFILE = 1;
    public static final String a = "HmsProfile";
    public Context b;
    public HuaweiApi<Api.ApiOptions.NoOptions> c;

    public HmsProfile(Context context) {
        this.b = null;
        Preconditions.checkNotNull(context);
        this.b = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.c = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.c = new HuaweiApi<>(context, api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.c.setKitSdkVersion(50101300);
    }

    public static HmsProfile getInstance(Context context) {
        return new HmsProfile(context);
    }

    public final com.huawei.hmf.tasks.f<Void> a(int i, String str, int i2, String str2) {
        if (!isSupportProfile()) {
            com.huawei.hmf.tasks.g gVar = new com.huawei.hmf.tasks.g();
            gVar.a((Exception) ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException());
            return gVar.a;
        }
        if (!TextUtils.isEmpty(str)) {
            String a2 = a(this.b);
            if (TextUtils.isEmpty(a2)) {
                HMSLog.i(a, "agc connect services config missing project id.");
                com.huawei.hmf.tasks.g gVar2 = new com.huawei.hmf.tasks.g();
                gVar2.a((Exception) ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException());
                return gVar2.a;
            } else if (str.equals(a2)) {
                str = "";
            }
        }
        ProfileReq profileReq = new ProfileReq();
        if (i == 0) {
            profileReq.setOperation(0);
            profileReq.setType(i2);
        } else {
            profileReq.setOperation(1);
        }
        String reportEntry = PushBiUtil.reportEntry(this.b, PushNaming.PUSH_PROFILE);
        try {
            profileReq.setSubjectId(str);
            profileReq.setProfileId(com.huawei.secure.android.common.encrypt.hash.b.a(str2));
            profileReq.setPkgName(this.b.getPackageName());
            return this.c.doWrite(new ProfileTask(PushNaming.PUSH_PROFILE, JsonUtil.createJsonString(profileReq), reportEntry));
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                com.huawei.hmf.tasks.g gVar3 = new com.huawei.hmf.tasks.g();
                ApiException apiException = (ApiException) e.getCause();
                gVar3.a((Exception) apiException);
                PushBiUtil.reportExit(this.b, PushNaming.PUSH_PROFILE, reportEntry, apiException.getStatusCode());
                return gVar3.a;
            }
            com.huawei.hmf.tasks.g gVar4 = new com.huawei.hmf.tasks.g();
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_PROFILE, reportEntry, ErrorEnum.ERROR_INTERNAL_ERROR);
            gVar4.a((Exception) ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
            return gVar4.a;
        }
    }

    public com.huawei.hmf.tasks.f<Void> addProfile(int i, String str) {
        return addProfile("", i, str);
    }

    public final boolean b(Context context) {
        return s.b(context) >= 110001400;
    }

    public com.huawei.hmf.tasks.f<Void> deleteProfile(String str) {
        return deleteProfile("", str);
    }

    public boolean isSupportProfile() {
        if (s.d(this.b)) {
            if (s.c()) {
                HMSLog.i(a, "current EMUI version below 9.1, not support profile operation.");
                return false;
            } else if (b(this.b)) {
                return true;
            } else {
                HMSLog.i(a, "current HwPushService.apk version below 11.0.1.400,please upgrade your HwPushService.apk version.");
                return false;
            }
        }
        return true;
    }

    public com.huawei.hmf.tasks.f<Void> addProfile(String str, int i, String str2) {
        if (i != 1 && i != 2) {
            HMSLog.i(a, "add profile type undefined.");
            com.huawei.hmf.tasks.g gVar = new com.huawei.hmf.tasks.g();
            gVar.a((Exception) ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return gVar.a;
        } else if (TextUtils.isEmpty(str2)) {
            HMSLog.i(a, "add profile params is empty.");
            com.huawei.hmf.tasks.g gVar2 = new com.huawei.hmf.tasks.g();
            gVar2.a((Exception) ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return gVar2.a;
        } else {
            return a(0, str, i, str2);
        }
    }

    public com.huawei.hmf.tasks.f<Void> deleteProfile(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            HMSLog.e(a, "del profile params is empty.");
            com.huawei.hmf.tasks.g gVar = new com.huawei.hmf.tasks.g();
            gVar.a((Exception) ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return gVar.a;
        }
        return a(1, str, -1, str2);
    }

    public static String a(Context context) {
        return com.huawei.agconnect.config.a.a(context).a("client/project_id");
    }
}
