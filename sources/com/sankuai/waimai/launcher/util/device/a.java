package com.sankuai.waimai.launcher.util.device;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        BufferedReader bufferedReader = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81b76e1c205274049870c8640c77b89c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81b76e1c205274049870c8640c77b89c");
        }
        try {
            Process start = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(start.getInputStream(), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                } catch (IOException unused) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            return "";
                        } catch (IOException e) {
                            e.printStackTrace();
                            return "";
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            String lowerCase = sb.toString().toLowerCase();
            try {
                bufferedReader2.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            return lowerCase;
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
