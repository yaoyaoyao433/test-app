package com.meituan.passport.utils;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.common.horn.Horn;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class r {
    public static ChangeQuickRedirect a;
    private static r c;
    public String b;

    public static r a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3235e5580cd14f5ec042235c67e81441", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3235e5580cd14f5ec042235c67e81441");
        }
        if (c == null) {
            synchronized (r.class) {
                if (c == null) {
                    c = new r();
                }
            }
        }
        return c;
    }

    public final String a(String str) {
        StackTraceElement stackTraceElement;
        String[] split;
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aff250f535b4bbceea550720e1adaa1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aff250f535b4bbceea550720e1adaa1");
        }
        if (b()) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace.length == 0) {
                return null;
            }
            int i = 0;
            while (true) {
                if (i >= stackTrace.length) {
                    i = 0;
                    break;
                }
                StackTraceElement stackTraceElement2 = stackTrace[i];
                if (stackTraceElement2 != null && TextUtils.equals(stackTraceElement2.getClassName(), str)) {
                    break;
                }
                i++;
            }
            while (true) {
                if (i >= stackTrace.length) {
                    stackTraceElement = null;
                    break;
                }
                stackTraceElement = stackTrace[i];
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (getClass().getPackage().getName().split("[.]").length >= 3) {
                        str2 = split[0] + CommonConstant.Symbol.DOT + split[1] + CommonConstant.Symbol.DOT + split[2];
                    } else {
                        str2 = "com.meituan.passport";
                    }
                    if (!TextUtils.isEmpty(className) && !className.contains(str2)) {
                        break;
                    }
                }
                i++;
            }
            if (stackTraceElement != null) {
                return stackTraceElement.getClassName() + CommonConstant.Symbol.UNDERLINE + stackTraceElement.getMethodName();
            }
            return "";
        }
        return null;
    }

    private boolean b() {
        JsonObject jsonObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44f29b04d2272fe4a51b8e4718da4388", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44f29b04d2272fe4a51b8e4718da4388")).booleanValue();
        }
        String accessCache = Horn.accessCache("android_logout_report");
        if (TextUtils.isEmpty(accessCache)) {
            return true;
        }
        try {
            jsonObject = new JsonParser().parse(accessCache).getAsJsonObject();
        } catch (Exception unused) {
            jsonObject = null;
        }
        if (jsonObject == null || jsonObject.get("caller_info_report") == null) {
            return true;
        }
        try {
            return jsonObject.get("caller_info_report").getAsBoolean();
        } catch (Exception unused2) {
            return true;
        }
    }
}
