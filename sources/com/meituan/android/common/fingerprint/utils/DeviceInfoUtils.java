package com.meituan.android.common.fingerprint.utils;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class DeviceInfoUtils {
    private static final String FILENAME_PROC_VERSION = "/proc/version";
    private static String brandVersion = "unknown";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static String kernelVersion = "unknown";

    public static String getBrandVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d997a71e209f9eb70ab1f7e7af94762f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d997a71e209f9eb70ab1f7e7af94762f");
        }
        if (TextUtils.isEmpty(brandVersion) || TextUtils.equals("unknown", brandVersion)) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                brandVersion = (String) cls.getDeclaredMethod("get", String.class, String.class).invoke(cls, "gsm.version.baseband", "unknown");
            } catch (Throwable th) {
                StringUtils.setErrorLogan(th);
            }
        }
        return brandVersion;
    }

    public static String getFormattedKernelVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f436e2083c2668582dcff40c86bd037e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f436e2083c2668582dcff40c86bd037e");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return kernelVersion;
        }
        if (TextUtils.isEmpty(kernelVersion) || TextUtils.equals("unknown", kernelVersion)) {
            try {
                kernelVersion = formatKernelVersion(readLine(FILENAME_PROC_VERSION));
            } catch (Throwable th) {
                StringUtils.setErrorLogan(th);
            }
        }
        return kernelVersion;
    }

    private static String formatKernelVersion(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b97d1d51cbacf42b6b17579e99674143", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b97d1d51cbacf42b6b17579e99674143");
        }
        Matcher matcher = Pattern.compile("Linux version (\\S+) \\((\\S+?)\\) (?:\\(gcc.+? \\)) (#\\d+) (?:.*?)?((Sun|Mon|Tue|Wed|Thu|Fri|Sat).+)").matcher(str);
        if (!matcher.matches() || matcher.groupCount() >= 4) {
            return matcher.group(1) + "\n" + matcher.group(2) + StringUtil.SPACE + matcher.group(3) + "\n" + matcher.group(4);
        }
        return "unknown";
    }

    private static String readLine(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0e205aac86660d6a70c4998742ced782", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0e205aac86660d6a70c4998742ced782");
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str), 256);
        try {
            return bufferedReader.readLine();
        } finally {
            bufferedReader.close();
        }
    }
}
