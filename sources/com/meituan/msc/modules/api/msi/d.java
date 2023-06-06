package com.meituan.msc.modules.api.msi;

import android.os.Vibrator;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.engine.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static Vibrator b;
    public static Boolean c;

    public static boolean a(String str, h hVar) {
        boolean z;
        Object[] objArr = {str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a798286e72b5c4e01f5ba0d57b4088c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a798286e72b5c4e01f5ba0d57b4088c")).booleanValue();
        }
        final Runnable runnable = new Runnable() { // from class: com.meituan.msc.modules.api.msi.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b64f2b9b292ed0ea4ee07cac7efd201f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b64f2b9b292ed0ea4ee07cac7efd201f");
                    return;
                }
                Vibrator vibrator = (Vibrator) MSCEnvHelper.getContext().getSystemService("vibrator");
                d.b = vibrator;
                vibrator.vibrate(new long[]{10, 200, 100, 200}, -1);
            }
        };
        Object[] objArr2 = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "51f89761682524b1a11382e79ef05abb", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "51f89761682524b1a11382e79ef05abb")).booleanValue();
        } else {
            z = (hVar == null || hVar.d == null || !hVar.d.a()) ? false : true;
        }
        if (z) {
            if (c == null) {
                Object[] objArr3 = {runnable};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4237bbbbff9e95736947567f0675ccf1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4237bbbbff9e95736947567f0675ccf1");
                } else {
                    com.meituan.msc.common.executor.a.a(new Runnable() { // from class: com.meituan.msc.modules.api.msi.d.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b7da43fd43cb56f0f17282399a69fb75", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b7da43fd43cb56f0f17282399a69fb75");
                                return;
                            }
                            try {
                                if (((HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL("https://portal-portm.sankuai.com/weapp/debug/auth").openConnection())).getResponseCode() == 200) {
                                    d.c = Boolean.TRUE;
                                    runnable.run();
                                    return;
                                }
                                d.c = Boolean.FALSE;
                            } catch (IOException unused) {
                                com.meituan.msc.modules.reporter.g.d("HandleMsiEvent", "getDebugAuth failed");
                            }
                        }
                    });
                }
            } else if (c.booleanValue()) {
                runnable.run();
            }
        }
        return false;
    }
}
