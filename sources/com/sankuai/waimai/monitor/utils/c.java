package com.sankuai.waimai.monitor.utils;

import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.net.ConnectException;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static ErrorCode a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2dd0be7fe4b03b35173253ba8f0274f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ErrorCode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2dd0be7fe4b03b35173253ba8f0274f");
        }
        ErrorCode errorCode = new ErrorCode(ErrorCode.ERROR_TYPE_B, "-1");
        if (th instanceof com.sankuai.meituan.retrofit2.exception.c) {
            errorCode.setTypeAndCode(ErrorCode.ERROR_TYPE_H, String.valueOf(((com.sankuai.meituan.retrofit2.exception.c) th).a()));
        } else if ((th instanceof JsonParseException) || (th instanceof JSONException)) {
            errorCode.setTypeAndCode(ErrorCode.ERROR_TYPE_H, ErrorCode.ERROR_CODE_OKHTTP_EXCEPTION);
        } else if (th instanceof ConnectException) {
            errorCode.setTypeAndCode(ErrorCode.ERROR_TYPE_N, "10000");
        } else if (th instanceof SSLHandshakeException) {
            errorCode.setTypeAndCode(ErrorCode.ERROR_TYPE_H, "1005");
        }
        return errorCode;
    }
}
