package com.sankuai.meituan.kernel.net.singleton;

import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.knbbridge.StartBizJsHandler;
import java.net.URLEncoder;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static volatile a b = new a();
    private static volatile String c = "";

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("delete_location")
        public boolean a = true;
        @SerializedName("change_utm_deviceid")
        public boolean b = true;
        @SerializedName("change_msid_deviceid")
        public boolean c = true;
        @SerializedName("use_black_list")
        public boolean d;
        @SerializedName("location_white_list")
        public List<String> e;
        @SerializedName("utm_white_list")
        public List<String> f;
        @SerializedName("msid_white_list")
        public List<String> g;
        @SerializedName(StartBizJsHandler.PARAM_NAME_FILTER_BLACK_LIST)
        public List<String> h;
    }

    public static final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "074360d39af0156e84e1d685e7c5d3ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "074360d39af0156e84e1d685e7c5d3ed");
        }
        String str = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        if (com.sankuai.meituan.kernel.net.base.c.a() != null) {
            com.sankuai.meituan.kernel.net.base.b a2 = com.sankuai.meituan.kernel.net.base.c.a();
            String j = a2.j() != null ? a2.j() : "";
            String valueOf = String.valueOf(a2.k());
            String i = a2.i() != null ? a2.i() : "";
            str4 = a2.l() != null ? a2.l() : "";
            str = j;
            str2 = valueOf;
            str3 = i;
        }
        return "AiMeiTuan /" + (a(Build.BRAND) + CommonConstant.Symbol.MINUS + a(Build.VERSION.RELEASE) + CommonConstant.Symbol.MINUS + a(Build.MODEL) + CommonConstant.Symbol.MINUS + String.valueOf(com.sankuai.meituan.kernel.net.base.a.c) + CommonConstant.Symbol.MINUS + String.valueOf(com.sankuai.meituan.kernel.net.base.a.b) + CommonConstant.Symbol.MINUS + String.valueOf(com.sankuai.meituan.kernel.net.base.a.e) + CommonConstant.Symbol.MINUS + a(str) + CommonConstant.Symbol.MINUS + str2 + CommonConstant.Symbol.MINUS + a(str4) + CommonConstant.Symbol.MINUS + a(str3));
    }

    private static String a(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6bb67362c861654e31ebc2fa44c9e2c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6bb67362c861654e31ebc2fa44c9e2c3");
        }
        if (!TextUtils.isEmpty(str)) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e997196dada834a2ec9c5174f54f577e", RobustBitConfig.DEFAULT_VALUE)) {
                int length = str.length();
                int i = 0;
                while (true) {
                    if (i < length) {
                        char charAt = str.charAt(i);
                        if (charAt <= 31 || charAt >= 127) {
                            break;
                        }
                        i++;
                    } else {
                        z = false;
                        break;
                    }
                }
            } else {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e997196dada834a2ec9c5174f54f577e")).booleanValue();
            }
            if (z) {
                try {
                    return URLEncoder.encode(str, "UTF-8");
                } catch (Exception unused) {
                    return "";
                }
            }
        }
        return str;
    }

    @Nullable
    public static a b() {
        return b;
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96b14a9ace7086624a11ca79b88c4a68", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96b14a9ace7086624a11ca79b88c4a68") : TextUtils.isEmpty(c) ? "DeviceId0" : c;
    }
}
