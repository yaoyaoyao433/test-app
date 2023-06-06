package com.sankuai.titans.protocol.jsbridge;

import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum JsHandlerResultInfo {
    None(0, "success"),
    Error_2_JsBridgeInvalid(2, "js bridge is invalid"),
    Error_2_JsBridgeInvalid_RequestFailed(2, "桥调用失败，此次发起网络请求或等待中，网络请求失败"),
    Error_2_JsBridgeInvalid_RequestSuccessNotInWhiteList(2, "桥调用失败，此次桥调用发起网络请求或等待中，网络请求成功，但该桥不在白名单中"),
    Error_2_JsBridgeInvalid_CachedNotInWhiteList(2, "桥调用失败，url加载时的网络请求有缓存，该桥不在缓存列表中"),
    Error_2_JsBridgeInvalid_RequestSuccessWithoutData(2, "桥调用失败，此次发起网络请求或等待中，网络请求成功，但网络回调无数据，原因可能是该url没有配置可用桥列表"),
    Error_3_ParamsInvalid(3, "params is invalid"),
    Error_4_NoBridge(4, "no register bridge"),
    Error_5_ContextError(5, "context is not support"),
    Error_7_FuncNotSupport(7, "function is not support"),
    Error_8_SystemApiError(8, "system api error"),
    Error_9_SignatureError(9, "js bridge signature is invalid"),
    Error_10_HasNoPermission(10, "has no permission"),
    Error_521_Param_Miss_or_Invalid(521, "param miss or invalid"),
    Error_543_permission_ont_enable(KNBJsErrorInfo.CODE_NO_PERMISSION, "permission ont enable - one time"),
    Error_544_permission_ont_enable_Persistence(KNBJsErrorInfo.CODE_DENIED_PERMISSION, "permission ont enable - persistence"),
    Error_2060_scheme_not_in_whitelist(2060, "Cannot find matched activity"),
    Error_2061_scheme_not_in_whitelist(2061, "scheme not in white list"),
    Error_N10(-10, "select nobody"),
    Error_N100(-100, "no contact or no auth to read the contact"),
    Error_N200(-200, StringUtil.NULL),
    Error_N304(-304, "无法找到系统日历"),
    Error_N404_implement(-404, "no implement"),
    Error_N500_implement(-500, "show keyboard failed"),
    Error_UNKNOWN_EmptyUrl(-1, "url is empty"),
    Error_UNKNOWN(-1, RaptorConstants.ERROR_UNKNOWN_VALUE);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private int code;
    private String msg;

    public static JsHandlerResultInfo valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0662452f97f7dd9044d311f6e38492f6", RobustBitConfig.DEFAULT_VALUE) ? (JsHandlerResultInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0662452f97f7dd9044d311f6e38492f6") : (JsHandlerResultInfo) Enum.valueOf(JsHandlerResultInfo.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static JsHandlerResultInfo[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f619973f1be5a6c1190632d0aa6773fe", RobustBitConfig.DEFAULT_VALUE) ? (JsHandlerResultInfo[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f619973f1be5a6c1190632d0aa6773fe") : (JsHandlerResultInfo[]) values().clone();
    }

    JsHandlerResultInfo(int i, String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89825bd097eaa197a3a25bcb4e649607", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89825bd097eaa197a3a25bcb4e649607");
            return;
        }
        this.code = i;
        this.msg = str;
    }

    public final int code() {
        return this.code;
    }

    public final String msg() {
        return this.msg;
    }
}
