package com.meituan.crashreporter.crash;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        String[] split;
        String str2;
        String str3;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97cc270899595498e7ce5d8de0ceb32f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97cc270899595498e7ce5d8de0ceb32f");
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (str.contains("Web") || str.contains("url")) {
                String str4 = "";
                for (String str5 : str.split(";")) {
                    try {
                        str2 = "";
                        if (str5.contains("_create")) {
                            str2 = str5.contains("data=") ? str5.split("data=")[1] : "";
                            if (str2.contains("url:")) {
                                str2 = str2.split("url:")[1];
                            } else if (str5.contains("url=")) {
                                str2 = str2.split("url=")[1];
                            }
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            try {
                                str3 = URLDecoder.decode(str2, "utf-8");
                            } catch (UnsupportedEncodingException unused) {
                                str3 = str2;
                            }
                            if (str3.startsWith("http")) {
                                if (str3.contains(CommonConstant.Symbol.QUESTION_MARK)) {
                                    str3 = str3.split("\\?")[0];
                                }
                                if (str3.contains(CommonConstant.Symbol.BRACKET_RIGHT)) {
                                    str3 = str3.split("\\)")[0];
                                }
                                if (str3.contains("flags=")) {
                                    str3 = str3.split("flags=")[0];
                                }
                                String trim = str3.trim();
                                if (trim.endsWith(CommonConstant.Symbol.COMMA)) {
                                    trim = trim.substring(0, trim.length() - 1);
                                }
                                if (trim.contains("&metrics_start_time")) {
                                    trim = trim.split("&metrics_start_time")[0];
                                }
                                str4 = trim;
                            }
                        }
                    } catch (Throwable unused2) {
                        return str4;
                    }
                }
                return str4;
            }
            return "";
        } catch (Throwable unused3) {
            return "";
        }
    }
}
