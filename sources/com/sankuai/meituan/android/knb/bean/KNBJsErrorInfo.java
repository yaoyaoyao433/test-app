package com.sankuai.meituan.android.knb.bean;

import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBJsErrorInfo {
    public static final int CODE_API_NOT_SUPPORT = 7;
    public static final int CODE_CONTAINER_TYPE_NOT_SUPPORT = 5;
    public static final int CODE_DENIED_PERMISSION = 544;
    public static final int CODE_PARAMS_MISS_OR_INVALID = 521;
    public static final int CODE_PARAMS_NOT_ENOUGH = 520;
    public static final int CODE_SUCCESS = 0;
    public static final int CODE_SYSTEM_API_ERROR = 8;
    public static final int CODE_UNKNOWN = -1;
    public static final int CODE_UNKNOWN_ERROR = 500;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int errorCode;
    private String errorMsg;
    public static final KNBJsErrorInfo Error_5_Container_Type_Not_Support = new KNBJsErrorInfo(5, "container type not support");
    public static final KNBJsErrorInfo Error_7_Api_Not_Support = new KNBJsErrorInfo(7, "func not support");
    public static final KNBJsErrorInfo Error_8_System_Api = new KNBJsErrorInfo(8, "system api error");
    public static final KNBJsErrorInfo Error_500_Unknown_Error = new KNBJsErrorInfo(500, RaptorConstants.ERROR_UNKNOWN_VALUE);
    public static final KNBJsErrorInfo Error_520_Params_Not_Enough = new KNBJsErrorInfo(520, "params not enough");
    public static final KNBJsErrorInfo Error_521_Params_Miss_or_Invalid = new KNBJsErrorInfo(521, "params miss or invalid");
    public static final int CODE_NO_PERMISSION = 543;
    public static final KNBJsErrorInfo Error_543_No_Permission = new KNBJsErrorInfo(CODE_NO_PERMISSION, "no permission");
    public static final KNBJsErrorInfo Error_UnKnown = new KNBJsErrorInfo(-1, "unknown");

    public KNBJsErrorInfo(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c5a9ff9000faac1e582ae975634bee8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c5a9ff9000faac1e582ae975634bee8");
            return;
        }
        this.errorCode = i;
        this.errorMsg = str;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public String getErrorMsg(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "feef8d2668842634fe2e7865b34be411", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "feef8d2668842634fe2e7865b34be411");
        }
        return this.errorMsg + str;
    }
}
