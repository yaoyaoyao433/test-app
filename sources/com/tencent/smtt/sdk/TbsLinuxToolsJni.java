package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;
/* loaded from: classes6.dex */
public class TbsLinuxToolsJni {
    private static boolean a = false;
    private static boolean b = false;

    public TbsLinuxToolsJni(Context context) {
        a(context);
    }

    private native int ChmodInner(String str, String str2);

    private void a(Context context) {
        synchronized (TbsLinuxToolsJni.class) {
            TbsLog.i("TbsLinuxToolsJni", "TbsLinuxToolsJni init mbIsInited is " + b);
            if (b) {
                return;
            }
            b = true;
            File file = TbsShareManager.isThirdPartyApp(context) ? new File(TbsShareManager.a()) : p.a().r(context);
            if (file != null) {
                if (!new File(file.getAbsolutePath() + File.separator + "liblinuxtoolsfortbssdk_jni.so").exists() && !TbsShareManager.isThirdPartyApp(context)) {
                    file = p.a().q(context);
                }
                if (file != null) {
                    TbsLog.i("TbsLinuxToolsJni", "TbsLinuxToolsJni init tbsSharePath is " + file.getAbsolutePath());
                    System.load(file.getAbsolutePath() + File.separator + "liblinuxtoolsfortbssdk_jni.so");
                    a = true;
                }
            }
            ChmodInner("/checkChmodeExists", "700");
        }
    }

    public int a(String str, String str2) {
        if (a) {
            return ChmodInner(str, str2);
        }
        TbsLog.e("TbsLinuxToolsJni", "jni not loaded!", true);
        return -1;
    }
}
