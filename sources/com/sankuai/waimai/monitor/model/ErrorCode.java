package com.sankuai.waimai.monitor.model;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.a;
import com.sankuai.waimai.monitor.b;
import com.sankuai.waimai.monitor.c;
import com.sankuai.waimai.monitor.utils.d;
import com.sankuai.waimai.monitor.utils.f;
import java.lang.ref.WeakReference;
import java.util.Random;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ErrorCode implements c.a {
    public static final String ERROR_CODE_JSON_PARSE = "-997";
    public static final String ERROR_CODE_NOT_NETWORK = "10000";
    public static final String ERROR_CODE_OKHTTP_EXCEPTION = "1001";
    public static final String ERROR_CODE_PROTOCOL_EXCEPTION = "1000";
    public static final String ERROR_CODE_RESPONSE_NULL = "-2";
    public static final int ERROR_CODE_UNKNOWN = -1;
    public static final String ERROR_TYPE_B = "B";
    public static final String ERROR_TYPE_E = "E";
    public static final String ERROR_TYPE_F = "F";
    public static final String ERROR_TYPE_H = "H";
    public static final String ERROR_TYPE_M = "M";
    public static final String ERROR_TYPE_N = "N";
    public static final String ERROR_TYPE_W = "W";
    public static final String PAGE_TYPE_MRN = "mrn";
    public static final String PAGE_TYPE_NATIVE = "native";
    public static final String PAGE_TYPE_WEBVIEW = "webview";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String ERROR_CODE_SEPARATOR;
    private String area;
    private String businessCode;
    private String code;
    private boolean hasRandomPageId;
    private a.InterfaceC1031a mOnReportListener;
    private WeakReference<Context> mWRFContext;
    private String projectCode;
    private String randomPageId;
    private String type;

    public void setContext(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae9ed7c2f69498fdeac5ad8f3e357ed7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae9ed7c2f69498fdeac5ad8f3e357ed7");
        } else {
            this.mWRFContext = new WeakReference<>(context);
        }
    }

    public void setReportListener(a.InterfaceC1031a interfaceC1031a) {
        this.mOnReportListener = interfaceC1031a;
    }

    public String getExtras() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0d0f560a142ef03dc469c242a9df4b2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0d0f560a142ef03dc469c242a9df4b2") : this.mOnReportListener != null ? this.mOnReportListener.a() : "";
    }

    public ErrorCode(String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "161a6b0d41b87c6f1bee3106d23575c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "161a6b0d41b87c6f1bee3106d23575c9");
            return;
        }
        this.ERROR_CODE_SEPARATOR = "#";
        this.type = str;
        this.code = str2;
        this.projectCode = "";
        this.randomPageId = createRandomPageId();
        c.a().a(this);
    }

    public ErrorCode(String str, @NonNull String str2, @NonNull String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7486f26fed5e498394d0b37e419f537d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7486f26fed5e498394d0b37e419f537d");
            return;
        }
        this.ERROR_CODE_SEPARATOR = "#";
        this.type = str;
        this.code = str2;
        this.projectCode = str3;
        this.randomPageId = createRandomPageId();
        c.a().a(this);
    }

    public ErrorCode(String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4fa526af137b0bafe618ecadcb53504", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4fa526af137b0bafe618ecadcb53504");
            return;
        }
        this.ERROR_CODE_SEPARATOR = "#";
        this.type = str;
        this.code = str2;
        this.projectCode = str4;
        this.randomPageId = str3;
        c.a().a(this);
    }

    public String getType() {
        return this.type;
    }

    public String getCode() {
        return this.code;
    }

    public String getProjectCode() {
        return this.projectCode;
    }

    public String getBusinessCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30d02e71a5d324c83934385a4a3926b2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30d02e71a5d324c83934385a4a3926b2") : f.a(this.businessCode);
    }

    public String getBusinessCodeByLog() {
        return this.businessCode;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String str) {
        this.area = str;
    }

    public void setBusinessCode(String str) {
        this.businessCode = str;
    }

    public void setTypeAndCode(String str, @NonNull String str2) {
        this.type = str;
        this.code = str2;
    }

    public String getRandomPageId() {
        return this.randomPageId;
    }

    public boolean hasRandomPageId() {
        return this.hasRandomPageId;
    }

    public void hasRandomPageId(boolean z) {
        this.hasRandomPageId = z;
    }

    public String buildErrorCodeStr(boolean z) {
        Context context;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6168eeaeaf24bb5223a789cb7ae4f999", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6168eeaeaf24bb5223a789cb7ae4f999");
        }
        hasRandomPageId(z);
        if (TextUtils.isEmpty(getCode())) {
            return "";
        }
        StringBuilder sb = new StringBuilder(CommonConstant.Symbol.BRACKET_LEFT);
        sb.append(getType());
        sb.append(getCode());
        sb.append(this.ERROR_CODE_SEPARATOR);
        if (!TextUtils.isEmpty(getBusinessCode())) {
            sb.append(getBusinessCode());
        } else if (b.a() != null && (context = getContext()) != null) {
            setBusinessCode(b.a().a(context));
            if (!TextUtils.isEmpty(getBusinessCode())) {
                sb.append(getBusinessCode());
            }
        }
        sb.append(this.ERROR_CODE_SEPARATOR);
        if (hasRandomPageId() && !TextUtils.isEmpty(getRandomPageId())) {
            sb.append(getRandomPageId());
        }
        if (!TextUtils.isEmpty(getProjectCode())) {
            sb.append(this.ERROR_CODE_SEPARATOR);
            sb.append(getProjectCode());
        }
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }

    public String buildErrorCodeStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2814a0b378568fbde325f6e1ba3b350", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2814a0b378568fbde325f6e1ba3b350") : buildErrorCodeStr(true);
    }

    private String createRandomPageId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d52c7a6408432dca294bc38781863dda", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d52c7a6408432dca294bc38781863dda");
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append("12345689ABCDEGHJKLMNPQRSTUVWXYZ".charAt(random.nextInt("12345689ABCDEGHJKLMNPQRSTUVWXYZ".length())));
        }
        return sb.toString();
    }

    public static String generateRandomPageId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "87c7900cf1e8c5e9129728bfeb8a6e89", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "87c7900cf1e8c5e9129728bfeb8a6e89");
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append("12345689ABCDEGHJKLMNPQRSTUVWXYZ".charAt(random.nextInt("12345689ABCDEGHJKLMNPQRSTUVWXYZ".length())));
        }
        return sb.toString();
    }

    public void onScreenShotReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4ce7a666668e511b2d405e44a86067a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4ce7a666668e511b2d405e44a86067a");
        } else {
            b.a(this, "com.sankuai.wmcustomfront.diting.report", true);
        }
    }

    @Nullable
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "463805636f454e6f73115ab9e769c0d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "463805636f454e6f73115ab9e769c0d0");
        }
        if (this.mWRFContext != null) {
            return this.mWRFContext.get();
        }
        return null;
    }

    static {
        String str = HeadParamsInfo.NAME;
        String str2 = LoganInfo.NAME;
        String str3 = MRNParamsInfo.NAME;
        String str4 = NativeParamsInfo.NAME;
        String str5 = WebParamsInfo.NAME;
        String str6 = d.b;
    }
}
