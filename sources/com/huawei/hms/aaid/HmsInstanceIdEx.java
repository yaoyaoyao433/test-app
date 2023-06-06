package com.huawei.hms.aaid;

import android.app.Activity;
import android.content.Context;
import com.huawei.hmf.tasks.f;
import com.huawei.hmf.tasks.g;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.l;
import com.huawei.hms.opendevice.o;
import com.huawei.hms.opendevice.q;
import com.huawei.hms.support.log.HMSLog;
import java.util.UUID;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public class HmsInstanceIdEx {
    public static final String TAG = "HmsInstanceIdEx";
    public Context a;
    public PushPreferences b;
    public HuaweiApi<Api.ApiOptions.NoOptions> c;

    public HmsInstanceIdEx(Context context) {
        this.a = null;
        this.b = null;
        this.a = context;
        this.b = new PushPreferences(context, "aaid");
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.c = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.c = new HuaweiApi<>(context, api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.c.setKitSdkVersion(50101300);
    }

    public static HmsInstanceIdEx getInstance(Context context) {
        Preconditions.checkNotNull(context);
        return new HmsInstanceIdEx(context);
    }

    public final String a(String str) {
        return "creationTime" + str;
    }

    public void deleteAAID(String str) throws ApiException {
        if (str != null) {
            try {
                if (this.b.containsKey(str)) {
                    this.b.removeKey(str);
                    this.b.removeKey(a(str));
                    return;
                }
                return;
            } catch (RuntimeException unused) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            } catch (Exception unused2) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            }
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public String getAAId(String str) throws ApiException {
        if (str != null) {
            try {
                if (this.b.containsKey(str)) {
                    return this.b.getString(str);
                }
                String uuid = UUID.randomUUID().toString();
                this.b.saveString(str, uuid);
                this.b.saveLong(a(str), Long.valueOf(System.currentTimeMillis()));
                return uuid;
            } catch (RuntimeException unused) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            } catch (Exception unused2) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            }
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public long getCreationTime(String str) throws ApiException {
        if (str != null) {
            try {
                if (!this.b.containsKey(a(str))) {
                    getAAId(str);
                }
                return this.b.getLong(a(str));
            } catch (RuntimeException unused) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            } catch (Exception unused2) {
                throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            }
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public f<TokenResult> getToken() {
        if (ProxyCenter.getProxy() != null) {
            try {
                HMSLog.i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
                ProxyCenter.getProxy().getToken(this.a, null, null);
                g gVar = new g();
                gVar.a((g) new TokenResult());
                return gVar.a;
            } catch (ApiException e) {
                return a(e);
            } catch (Exception unused) {
                return a(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
            }
        }
        String a = q.a(this.a, "push.gettoken");
        try {
            TokenReq b = o.b(this.a, null, null);
            b.setAaid(HmsInstanceId.getInstance(this.a).getId());
            return this.c.doWrite(new l("push.gettoken", b, this.a, a));
        } catch (RuntimeException unused2) {
            q.a(this.a, "push.gettoken", a, ErrorEnum.ERROR_INTERNAL_ERROR);
            return a(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
        } catch (Exception unused3) {
            q.a(this.a, "push.gettoken", a, ErrorEnum.ERROR_INTERNAL_ERROR);
            return a(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
        }
    }

    public final f<TokenResult> a(Exception exc) {
        g gVar = new g();
        gVar.a(exc);
        return gVar.a;
    }
}
