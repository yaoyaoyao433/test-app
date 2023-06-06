package com.meituan.android.common.mtguard.utils;

import android.os.Build;
import android.os.Process;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
/* loaded from: classes2.dex */
public final class c {
    private static int a = -1;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f346c0648b999078f8f2fc5a1fd021e6", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f346c0648b999078f8f2fc5a1fd021e6")).booleanValue();
        }
        if (a >= 0) {
            return a == 1;
        }
        a = Build.VERSION.SDK_INT >= 23 ? Process.is64Bit() : Build.VERSION.SDK_INT >= 21 ? Build.CPU_ABI.contains("64") : b();
        return a == 1;
    }

    private static boolean b() {
        BufferedReader bufferedReader;
        String readLine;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedReader bufferedReader2 = null;
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c421ad265eedd64bb77f082711f0f316", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c421ad265eedd64bb77f082711f0f316")).booleanValue();
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/maps")));
        } catch (Throwable th2) {
            th = th2;
        }
        do {
            try {
                readLine = bufferedReader.readLine();
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                try {
                    th.printStackTrace();
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return false;
                } catch (Throwable th4) {
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                    }
                    throw th4;
                }
            }
            if (readLine == null) {
                bufferedReader.close();
                return false;
            } else if (readLine.contains("/system/lib64/")) {
                try {
                    bufferedReader.close();
                } catch (Throwable th6) {
                    th6.printStackTrace();
                }
                return true;
            }
        } while (!readLine.contains("/system/lib/"));
        try {
            bufferedReader.close();
        } catch (Throwable th7) {
            th7.printStackTrace();
        }
        return false;
    }
}
