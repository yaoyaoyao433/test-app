package com.unionpay.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.unionpay.UPQuerySEPayInfoCallback;
import com.unionpay.UPSEInfoResp;
import com.unionpay.tsmservice.mi.UPTsmAddon;
import com.unionpay.tsmservice.mi.request.QueryVendorPayStatusRequestParams;
import com.unionpay.utils.UPUtils;
import com.unionpay.utils.j;
/* loaded from: classes6.dex */
public final class e {
    private Context a;
    private UPQuerySEPayInfoCallback b;
    private UPTsmAddon c;
    private boolean f;
    private QueryVendorPayStatusRequestParams g;
    private String d = "";
    private String e = "";
    private final Handler.Callback h = new f(this);
    private final Handler i = new Handler(this.h);
    private final UPTsmAddon.UPTsmConnectionListener j = new g(this);

    public e(Context context, UPQuerySEPayInfoCallback uPQuerySEPayInfoCallback, boolean z) {
        this.f = false;
        this.a = context;
        this.b = uPQuerySEPayInfoCallback;
        this.f = z;
        if (this.f) {
            System.loadLibrary("entryexpro");
            String a = UPUtils.a(this.a, JsBridgeResult.ARG_KEY_LOCATION_MODE);
            a = a == null ? "" : a;
            try {
                Integer.decode(com.unionpay.utils.b.e(a) ? a : "02").intValue();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(e eVar, int i, String str) {
        if (i != 4000) {
            return;
        }
        eVar.a(eVar.d, eVar.e, UPSEInfoResp.ERROR_NOT_SUPPORT, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(e eVar, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        eVar.d = bundle.getString("vendorPayName");
        eVar.e = bundle.getString("vendorPayAliasType");
        int i = bundle.getInt("vendorPayStatus");
        String string = bundle.getString("errorDesc");
        int i2 = bundle.getInt("cardNumber", 0);
        if (!TextUtils.isEmpty(eVar.e) && eVar.a != null) {
            UPUtils.a(eVar.a, eVar.e, "se_type");
        }
        switch (i) {
            case 0:
                if (i2 <= 0) {
                    str = eVar.d;
                    str2 = eVar.e;
                    str3 = UPSEInfoResp.ERROR_NOT_READY;
                    str4 = "card number 0";
                    break;
                } else {
                    String str5 = eVar.d;
                    String str6 = eVar.e;
                    eVar.c();
                    if (eVar.f) {
                        new String[]{"name", "seType", "cardNumbers"};
                        String[] strArr = {str5, str6, String.valueOf(i2)};
                    }
                    if (eVar.b != null) {
                        eVar.b.onResult(str5, str6, i2, bundle);
                        return;
                    }
                    return;
                }
            case 1:
                str = eVar.d;
                str2 = eVar.e;
                str3 = UPSEInfoResp.ERROR_NOT_READY;
                str4 = "not ready";
                break;
            case 2:
            case 3:
            case 4:
                eVar.a(eVar.d, eVar.e, UPSEInfoResp.ERROR_NOT_SUPPORT, string);
                return;
            default:
                return;
        }
        eVar.a(str, str2, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, String str4) {
        c();
        if (this.f) {
            new String[]{"name", "seType", "errorCode", "errorDesp"};
            String[] strArr = {str, str2, str3, str4};
        }
        if (this.b != null) {
            this.b.onError(str, str2, str3, str4);
        }
    }

    private boolean a(String str) {
        PackageInfo packageInfo = null;
        try {
            packageInfo = this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        if (packageInfo != null) {
            j.a("tsm-client", "tsm version code=" + packageInfo.versionCode);
            return packageInfo.versionCode >= 8;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ UPQuerySEPayInfoCallback b(e eVar) {
        eVar.b = null;
        return null;
    }

    private void c() {
        if (this.c != null) {
            this.c.removeConnectionListener(this.j);
            this.c.unbind();
        }
    }

    public final int a() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.a == null || this.b == null) {
            return UPSEInfoResp.PARAM_ERROR;
        }
        if (a("com.unionpay.tsmservice.mi")) {
            this.c = UPTsmAddon.getInstance(this.a);
            this.c.addConnectionListener(this.j);
            j.b("uppay-spay", "type se  bind service");
            if (this.c != null && !this.c.isConnected()) {
                j.b("uppay", "bind service");
                if (!this.c.bind()) {
                    str = this.d;
                    str2 = this.e;
                    str3 = UPSEInfoResp.ERROR_NONE;
                    str4 = "Tsm service bind fail";
                }
            } else if (this.c != null && this.c.isConnected()) {
                j.b("uppay", "tsm service already connected");
                b();
            }
            return UPSEInfoResp.SUCCESS;
        } else if (com.unionpay.utils.b.d(this.a, "com.unionpay.tsmservice.mi")) {
            str = this.d;
            str2 = this.e;
            str3 = UPSEInfoResp.ERROR_NOT_SUPPORT;
            str4 = "Mi Tsm service apk version is low";
        } else {
            str = this.d;
            str2 = this.e;
            str3 = UPSEInfoResp.ERROR_TSM_UNINSTALLED;
            str4 = "Mi Tsm service apk is not installed";
        }
        a(str, str2, str3, str4);
        return UPSEInfoResp.SUCCESS;
    }

    public final boolean b() {
        try {
            j.b("uppay", "getVendorPayStatus()");
            if (this.g == null) {
                this.g = new QueryVendorPayStatusRequestParams();
            }
            if (this.c.queryVendorPayStatus(this.g, new h(this.i)) == 0) {
                this.i.sendMessageDelayed(Message.obtain(this.i, 4, 4000, 0, ""), MetricsAnrManager.ANR_THRESHOLD);
                return true;
            }
            j.b("uppay", "ret != 0");
            a(this.d, this.e, UPSEInfoResp.ERROR_NOT_SUPPORT, "Mi Tsm service apk version is low");
            return false;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }
}
