package com.meituan.msc.modules.devtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.Keep;
import com.meituan.android.soloader.e;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class MSCV8InspectorUtil {
    private static final String APP_LIB_DIR = "debug_lib";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean sPreparedAppLibSoSource = false;

    public static void initV8DebugSo(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "675785e0b62be787ddc5db39760fff52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "675785e0b62be787ddc5db39760fff52");
        } else if (context == null) {
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            if (DebugHelper.g || defaultSharedPreferences.getBoolean("debug_v8_inspector", false)) {
                k.a(context, false);
                enableV8Inspector(context);
            }
        }
    }

    private static void enableV8Inspector(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "404bc2a798d14cab3cd7da3aa91f2a41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "404bc2a798d14cab3cd7da3aa91f2a41");
            return;
        }
        File workaroundLibDir = getWorkaroundLibDir(context);
        if (!sPreparedAppLibSoSource) {
            try {
                k.a(new e(workaroundLibDir, 1));
            } catch (IOException e) {
                e.printStackTrace();
            }
            sPreparedAppLibSoSource = true;
        }
        try {
            doCopy(context, "v8inspector");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        k.a(clearLibrarySo("libmtv8.so"));
    }

    public static void doCopy(Context context, String str) throws IOException {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a0fa8a01493afc9092ae475c685ec804", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a0fa8a01493afc9092ae475c685ec804");
            return;
        }
        String absolutePath = getWorkaroundLibDir(context).getAbsolutePath();
        String[] list = context.getAssets().list(str);
        int length = list.length;
        for (int i = 0; i < length; i++) {
            String str2 = list[i];
            String str3 = absolutePath + File.separator + str2;
            String str4 = str + File.separator + str2;
            if (!str.equals("")) {
                str2 = str4;
            }
            try {
                InputStream open = context.getAssets().open(str2);
                FileOutputStream fileOutputStream = new FileOutputStream(str3);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = open.read(bArr);
                    if (-1 == read) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                if (open != null) {
                    try {
                        open.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    fileOutputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                new File(str3).mkdir();
                doCopy(context, str2);
            }
        }
    }

    private static File getWorkaroundLibDir(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "42076857641d6f429f726f8a68e08cfc", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "42076857641d6f429f726f8a68e08cfc") : com.meituan.msc.common.utils.e.a(context, APP_LIB_DIR);
    }

    private static String clearLibrarySo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d562574d8819d0adfc6da591019e35a0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d562574d8819d0adfc6da591019e35a0") : (str.startsWith(APKStructure.Lib_Type) && str.endsWith(".so")) ? str.substring(3, str.indexOf(".so")) : str;
    }
}
