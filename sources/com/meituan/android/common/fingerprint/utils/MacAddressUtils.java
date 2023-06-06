package com.meituan.android.common.fingerprint.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MacAddressUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getMacAddressByFile() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b853866c71fa28bbf77cad26699c56f2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b853866c71fa28bbf77cad26699c56f2");
        }
        String systemPropertiesGet = systemPropertiesGet("wifi.interface", "wlan0");
        List<String> readLines = readLines(new File("/sys/class/net/" + systemPropertiesGet + "/address"));
        if (readLines == null || readLines.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : readLines) {
            sb.append(str);
            sb.append(CommonConstant.Symbol.MINUS);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private static String systemPropertiesGet(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ee34d7dff940c38804ef0f61b5e708ce", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ee34d7dff940c38804ef0f61b5e708ce");
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), str, str2);
        } catch (Throwable th) {
            StringUtils.setErrorLogan(th);
            return str2;
        }
    }

    private static List<String> readLines(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedReader bufferedReader = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f7c308d08f73384de97aac0ce209126", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f7c308d08f73384de97aac0ce209126");
        }
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Throwable th) {
            StringUtils.setErrorLogan(th);
        }
        if (file.exists()) {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        arrayList.add(readLine);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        try {
                            StringUtils.setErrorLogan(th);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return arrayList;
                        } catch (Throwable th3) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th4) {
                                    StringUtils.setErrorLogan(th4);
                                }
                            }
                            throw th3;
                        }
                    }
                }
                bufferedReader2.close();
            } catch (Throwable th5) {
                th = th5;
            }
            return arrayList;
        }
        return arrayList;
    }
}
