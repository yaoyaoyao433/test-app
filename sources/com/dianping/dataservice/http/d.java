package com.dianping.dataservice.http;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.dianping.util.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private final Context b;
    private ConnectivityManager c;

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18a3cfef85bb116969d95d21cd3715f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18a3cfef85bb116969d95d21cd3715f5");
        } else {
            this.b = context;
        }
    }

    private ConnectivityManager b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81a0a1d290ed077fea270d02402a206b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ConnectivityManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81a0a1d290ed077fea270d02402a206b");
        }
        if (this.c == null) {
            try {
                this.c = (ConnectivityManager) this.b.getSystemService("connectivity");
            } catch (Exception e) {
                h.a("network", "cannot get connectivity manager, maybe the permission is missing in AndroidManifest.xml?", e);
            }
        }
        return this.c;
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "437f55e577cd7b454e6cd4979cfc2efd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "437f55e577cd7b454e6cd4979cfc2efd")).intValue();
        }
        ConnectivityManager b = b();
        if (b != null) {
            try {
                NetworkInfo activeNetworkInfo = b.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return 0;
                }
                switch (activeNetworkInfo.getType()) {
                    case 0:
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                                return 2;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                                return 3;
                            case 13:
                                return 4;
                            default:
                                return 0;
                        }
                    case 1:
                        return 1;
                    default:
                        return 0;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
