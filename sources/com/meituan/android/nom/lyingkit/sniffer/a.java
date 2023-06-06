package com.meituan.android.nom.lyingkit.sniffer;

import android.util.Log;
import com.meituan.android.nom.lyingkit.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.meituan.skyeye.library.core.e;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final ExecutorService b = c.a("lyingkit-sniffer", 5);

    public static void a(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77d5e3eaf6ca6ea8fc5a4bd84ead260d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77d5e3eaf6ca6ea8fc5a4bd84ead260d");
        } else {
            b.submit(new Runnable() { // from class: com.meituan.android.nom.lyingkit.sniffer.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e29e6e90f875f779fa3c7a72596fccc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e29e6e90f875f779fa3c7a72596fccc");
                        return;
                    }
                    if (d.a(com.meituan.android.nom.lyingkit.b.b)) {
                        Log.e("lyingkit-sniffer-tag", "sniffer上报异常，type:" + str + ",describe:" + str2);
                    }
                    e.a("sdk_lyingkit", "service_invocation_monitor", str, str2, null);
                }
            });
        }
    }

    public static void a(final String str, final String str2, final b bVar) {
        Object[] objArr = {str, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4942c2de3e9f4c45b4a20d1a8dec8e4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4942c2de3e9f4c45b4a20d1a8dec8e4b");
        } else {
            b.submit(new Runnable() { // from class: com.meituan.android.nom.lyingkit.sniffer.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e28574181c2b52be179719f0dd3181b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e28574181c2b52be179719f0dd3181b");
                        return;
                    }
                    if (d.a(com.meituan.android.nom.lyingkit.b.b)) {
                        StringBuilder sb = new StringBuilder("sniffer上报异常，type:");
                        sb.append(str);
                        sb.append(",describe:");
                        sb.append(str2);
                        sb.append(",snifferParams:");
                        sb.append(bVar != null ? bVar.a() : null);
                        Log.e("lyingkit-sniffer-tag", sb.toString());
                    }
                    e.a("sdk_lyingkit", "service_invocation_monitor", str, str2, bVar != null ? bVar.a() : null);
                }
            });
        }
    }

    public static void b(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "406b4eefdcd3b49c6307f41260a25866", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "406b4eefdcd3b49c6307f41260a25866");
        } else {
            b.submit(new Runnable() { // from class: com.meituan.android.nom.lyingkit.sniffer.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4b7c8f2a0596bf7b4e36597f173a1f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4b7c8f2a0596bf7b4e36597f173a1f1");
                        return;
                    }
                    if (d.a(com.meituan.android.nom.lyingkit.b.b)) {
                        StringBuilder sb = new StringBuilder("sniffer上报正常，type:");
                        sb.append(str);
                        sb.append(",describe:");
                        sb.append(str2);
                    }
                    e.a("sdk_lyingkit", "service_invocation_monitor", str, null);
                }
            });
        }
    }
}
