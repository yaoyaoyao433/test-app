package com.sankuai.waimai.platform.net.networkdiagnose.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44a45ff1420b00266f3ea0e80d010fb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44a45ff1420b00266f3ea0e80d010fb8");
        }
        StringBuilder sb = new StringBuilder("\n*********Ping Start:" + str + "*********\n");
        try {
            try {
                Process exec = Runtime.getRuntime().exec("ping -c 5 -w 5 " + str);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getErrorStream()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append("\n" + readLine);
                }
                while (true) {
                    String readLine2 = bufferedReader2.readLine();
                    if (readLine2 == null) {
                        break;
                    }
                    sb.append("\n" + readLine2);
                }
                bufferedReader.close();
                bufferedReader2.close();
                exec.destroy();
            } catch (Exception e) {
                sb.append(a.a(e));
            }
            sb.append("\n*********Ping End*********\n");
            return sb.toString();
        } catch (Throwable th) {
            sb.append("\n*********Ping End*********\n");
            throw th;
        }
    }
}
