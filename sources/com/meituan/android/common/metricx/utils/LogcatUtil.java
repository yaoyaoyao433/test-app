package com.meituan.android.common.metricx.utils;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LogcatUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getLogcat(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc8c4f53355d4f08f5349d6d2d225120", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc8c4f53355d4f08f5349d6d2d225120");
        }
        StringBuilder sb = new StringBuilder();
        getLogcatByBufferName(sb, i, "main", i2, 'D');
        getLogcatByBufferName(sb, i, "system", i2, 'W');
        getLogcatByBufferName(sb, i, "events", i2, 'I');
        sb.append("\n");
        return sb.toString();
    }

    private static void getLogcatByBufferName(StringBuilder sb, int i, String str, int i2, char c) {
        BufferedReader bufferedReader;
        Object[] objArr = {sb, Integer.valueOf(i), str, Integer.valueOf(i2), Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedReader bufferedReader2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c95053a309d4e6b58640413a6dfd2182", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c95053a309d4e6b58640413a6dfd2182");
            return;
        }
        boolean z = Build.VERSION.SDK_INT >= 24;
        String num = Integer.toString(i);
        String str2 = StringUtil.SPACE + num + StringUtil.SPACE;
        ArrayList arrayList = new ArrayList();
        arrayList.add("/system/bin/logcat");
        arrayList.add("-b");
        arrayList.add(str);
        arrayList.add("-d");
        arrayList.add("-v");
        arrayList.add("threadtime");
        arrayList.add("-t");
        arrayList.add(Integer.toString(z ? i2 : (int) (i2 * 1.2d)));
        if (z) {
            arrayList.add("--pid");
            arrayList.add(num);
        }
        arrayList.add("*:" + c);
        Object[] array = arrayList.toArray();
        sb.append("--------- tail end of log ");
        sb.append(str);
        sb.append(" (");
        sb.append(TextUtils.join(StringUtil.SPACE, array));
        sb.append(")\n");
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new ProcessBuilder(new String[0]).command(arrayList).start().getInputStream()));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (z || readLine.contains(str2)) {
                            sb.append(readLine);
                            sb.append("\n");
                        }
                    } else {
                        try {
                            bufferedReader.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                } catch (Exception unused2) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            return;
                        } catch (IOException unused3) {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
