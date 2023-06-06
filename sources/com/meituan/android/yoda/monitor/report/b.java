package com.meituan.android.yoda.monitor.report;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(String str, int i, int i2, int i3, int i4, YodaResult yodaResult, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), 0, 0, Integer.valueOf(i4), yodaResult, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str3 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a569cb0aefd3dd5a14516221972086b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a569cb0aefd3dd5a14516221972086b7");
            return;
        }
        if ("yoda_pagedata".equals(str)) {
            str3 = "yoda_request_pagedata";
        } else if ("yoda_info".equals(str)) {
            str3 = "yoda_request_info";
        } else if ("yoda_verify".equals(str)) {
            str3 = "yoda_request_verify";
        }
        String str4 = str3;
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        a.a(str4, i, 0, 0, i4, yodaResult, str2);
    }

    public static void a(String str, int i, long j, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69440edac40477be2cc402983a703b39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69440edac40477be2cc402983a703b39");
        } else if (TextUtils.isEmpty(str) || i <= 0) {
        } else {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str2);
            a.a(str, i, (int) j, jsonObject);
        }
    }

    public static void a(String str, long j, String str2, String str3) {
        Object[] objArr = {str, new Long(j), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e947ee6414d101944ed75729f1ce559", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e947ee6414d101944ed75729f1ce559");
            return;
        }
        int i = (TextUtils.isEmpty(str2) || !str2.equals(str3)) ? 721 : 720;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str2);
        jsonObject.addProperty("callback_requestCode", str3);
        a.a(str, i, (int) j, jsonObject);
    }

    public static void a(String str, long j, int i, String str2) {
        Object[] objArr = {str, 0L, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfcd8cbd3fecfb045bb2e73916466a7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfcd8cbd3fecfb045bb2e73916466a7d");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str2);
            jsonObject.addProperty("type", Integer.valueOf(i));
            a.a(str, 0, 0, jsonObject);
        }
    }

    public static void a(String str, int i, long j, int i2, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), 0L, 0, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9af23eed59ba19009c1fabd6912de14e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9af23eed59ba19009c1fabd6912de14e");
        } else if (TextUtils.isEmpty(str) || i <= 0) {
        } else {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str2);
            jsonObject.addProperty("type", (Number) 0);
            a.a(str, i, 0, jsonObject);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82f855d688ba1ad652b4461849befc07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82f855d688ba1ad652b4461849befc07");
            return;
        }
        JsonObject jsonObject = new JsonObject();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        jsonObject.addProperty("preRequestCode", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        jsonObject.addProperty(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str2);
        a.a("yoda_verify_protected", 0, 10, jsonObject);
    }
}
