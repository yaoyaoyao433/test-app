package com.meituan.android.edfu.mbar.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.meituan.android.common.unionid.oneid.oaid.RouteSelector;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    private static final String b = "c";
    private static final FileFilter c = new FileFilter() { // from class: com.meituan.android.edfu.mbar.util.c.1
        public static ChangeQuickRedirect a;

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            Object[] objArr = {file};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cbbeacbe5cfb64a88dfbf86b33215c6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cbbeacbe5cfb64a88dfbf86b33215c6")).booleanValue();
            }
            String name = file.getName();
            if (name.startsWith(Constants.CPU)) {
                for (int i = 3; i < name.length(); i++) {
                    if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    };

    public static long a() {
        String[] split;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f010610de720fed770b858c81f2fb04", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f010610de720fed770b858c81f2fb04")).longValue();
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            for (String str : bufferedReader.readLine().split("\\s+")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("\t");
            }
            long longValue = new Long(Integer.valueOf(split[1]).intValue() * 1024).longValue();
            try {
                bufferedReader.close();
                return longValue;
            } catch (IOException unused) {
                return longValue;
            }
        } catch (IOException unused2) {
            return 0L;
        }
    }

    public static long a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24c509c44886ca045d08e69a045a75f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24c509c44886ca045d08e69a045a75f2")).longValue();
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
            return memoryInfo.availMem;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf423752e5588a1b7d2a33e656b55f93", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf423752e5588a1b7d2a33e656b55f93")).intValue();
        }
        try {
            return new File("/sys/devices/system/cpu/").listFiles(c).length;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b04d1e9590759361b9fa2824790ea521", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b04d1e9590759361b9fa2824790ea521")).booleanValue();
        }
        if (!m.u && !Build.MODEL.equals("M2011K2C") && !Build.MODEL.equals("M2012K11C")) {
            if (Build.BRAND.equals(RouteSelector.ROM_OPPO)) {
                if (Build.VERSION.SDK_INT > 30) {
                }
            }
            return true;
        }
        return false;
    }
}
