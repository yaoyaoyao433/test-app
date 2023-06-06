package com.dianping.live.live.utils;

import android.os.Environment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m {
    public static ChangeQuickRedirect a = null;
    public static int b = -1;

    public static int a() throws IOException {
        FileInputStream fileInputStream;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        char c = 1;
        FileInputStream fileInputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08c94d6911da6a13dcfa70c7cab7e1a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08c94d6911da6a13dcfa70c7cab7e1a4")).intValue();
        }
        if (b != -1) {
            return b;
        }
        try {
            try {
                fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            fileInputStream = fileInputStream2;
        }
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String property = properties.getProperty("ro.miui.ui.version.name", null);
            if (property == null) {
                b = 0;
            } else {
                switch (property.hashCode()) {
                    case 2719:
                        if (property.equals("V5")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2720:
                        if (property.equals("V6")) {
                            break;
                        }
                        c = 65535;
                        break;
                    case 2721:
                        if (property.equals("V7")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2722:
                        if (property.equals("V8")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        b = 5;
                        break;
                    case 1:
                        b = 6;
                        break;
                    case 2:
                        b = 7;
                        break;
                    case 3:
                        b = 8;
                        break;
                    default:
                        b = 0;
                        break;
                }
            }
            fileInputStream.close();
        } catch (Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            b = 0;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            return b;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
        return b;
    }
}
