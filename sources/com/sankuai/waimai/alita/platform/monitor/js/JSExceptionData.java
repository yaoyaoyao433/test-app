package com.sankuai.waimai.alita.platform.monitor.js;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil;
import com.sankuai.waimai.alita.platform.init.c;
import com.sankuai.waimai.alita.platform.knbbridge.DownloadJsBundleJsHandler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class JSExceptionData {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Level {
        public static final int ERROR = 2;
        public static final int UNKNOWN = 0;
        public static final int WARN = 1;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public b d;
        private String e;
        private int f;

        private a(@NonNull String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9caf343ea823861fa72455f0a92bc2e1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9caf343ea823861fa72455f0a92bc2e1");
                return;
            }
            this.e = str;
            this.f = i;
            this.d = new b(str);
        }

        @Nullable
        public final JSONObject a() {
            String str;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b146f7fe77edb3656497d74ae9eb0146", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b146f7fe77edb3656497d74ae9eb0146");
            }
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("project", "com.sankuai.wmcapp.alita");
                    jSONObject.putOpt("category", "jsError");
                    jSONObject.putOpt("container", "Alita");
                    jSONObject.putOpt("os", "Android");
                    jSONObject.putOpt("unionId", c.a().h());
                    jSONObject.putOpt("pageUrl", this.e);
                    switch (this.f) {
                        case 1:
                            jSONObject.putOpt("level", "warn");
                            jSONObject.putOpt("sec_category", "JSBundleExecutionStepCalculateEndWithBizFailure");
                            jSONObject.putOpt("content", "JSBundleExecutionStepCalculateEndWithBizFailure");
                            break;
                        case 2:
                            jSONObject.putOpt("level", "error");
                            if (!TextUtils.isEmpty(this.b)) {
                                if (this.b.length() > 199) {
                                    str = this.b.substring(0, 199);
                                } else {
                                    str = this.b;
                                }
                                jSONObject.putOpt("sec_category", str);
                            } else {
                                jSONObject.putOpt("sec_category", "unkown");
                            }
                            jSONObject.putOpt("content", this.c);
                            break;
                        default:
                            throw new Exception("level is not valid");
                    }
                    if (this.d != null) {
                        jSONObject.putOpt("dynamicMetric", this.d.a());
                        return jSONObject;
                    }
                    return jSONObject;
                } catch (Exception unused) {
                    return jSONObject;
                }
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        private String d;

        private b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1a516e9280f13fbad9e7f89f8007203", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1a516e9280f13fbad9e7f89f8007203");
            } else {
                this.d = str;
            }
        }

        @Nullable
        JSONObject a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "018adfd68104188a7a376c7398ed5793", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "018adfd68104188a7a376c7398ed5793");
            }
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("appName", c.a().a());
                    jSONObject.putOpt("appVersion", c.a().c());
                    jSONObject.putOpt("bundleId", this.d);
                    jSONObject.putOpt("bundleVersion", this.b);
                    jSONObject.putOpt("taskType", this.c);
                    jSONObject.putOpt("biz", AlitaBundleUtil.a(this.d));
                    jSONObject.putOpt("userid", c.a().i());
                    jSONObject.putOpt("uuid", c.a().f());
                    jSONObject.putOpt("dpid", c.a().g());
                    jSONObject.putOpt("userName", c.a().j());
                    jSONObject.putOpt(DeviceInfo.OS_NAME, "android");
                    jSONObject.putOpt("version", com.sankuai.waimai.alita.core.common.a.a);
                    jSONObject.putOpt("osVersion", c.a().k());
                    String str = this.d;
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = AlitaBundleUtil.a;
                    switch (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b37e76aa2e7c33023a91f8f9305bc90c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b37e76aa2e7c33023a91f8f9305bc90c")).intValue() : AlitaBundleUtil.a(str, 0)) {
                        case 1:
                            jSONObject.putOpt(DownloadJsBundleJsHandler.PARAM_NAME_RESOURCE_TYPE, "js");
                            break;
                        case 2:
                            jSONObject.putOpt(DownloadJsBundleJsHandler.PARAM_NAME_RESOURCE_TYPE, "model");
                            break;
                        default:
                            jSONObject.putOpt(DownloadJsBundleJsHandler.PARAM_NAME_RESOURCE_TYPE, "unknown");
                            break;
                    }
                    if (c.b()) {
                        jSONObject.putOpt("env", "prod");
                        return jSONObject;
                    }
                    jSONObject.putOpt("env", "test");
                    return jSONObject;
                } catch (Exception unused) {
                    return jSONObject;
                }
            } catch (Exception unused2) {
                return null;
            }
        }
    }
}
