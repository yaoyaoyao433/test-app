package com.dianping.networklog;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private final Context b;
    private ConnectivityManager c;

    public h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33cd250797de1f8ca672be07a99225c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33cd250797de1f8ca672be07a99225c7");
        } else {
            this.b = context;
        }
    }

    private ConnectivityManager c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e699b1f05c79c99ffb6eaa8a796fa48", 6917529027641081856L)) {
            return (ConnectivityManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e699b1f05c79c99ffb6eaa8a796fa48");
        }
        if (this.c == null) {
            try {
                this.c = (ConnectivityManager) this.b.getSystemService("connectivity");
            } catch (Exception unused) {
            }
        }
        return this.c;
    }

    public final NetworkInfo a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5f033d87be89fff0fdc19705765a949", 6917529027641081856L)) {
            return (NetworkInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5f033d87be89fff0fdc19705765a949");
        }
        ConnectivityManager c = c();
        if (c == null) {
            return null;
        }
        return c.getActiveNetworkInfo();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5c157eb4421d22fdc11b332247bf509", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5c157eb4421d22fdc11b332247bf509")).booleanValue();
        }
        try {
            NetworkInfo a2 = a();
            if (a2 != null) {
                if (a2.getType() == 1) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
