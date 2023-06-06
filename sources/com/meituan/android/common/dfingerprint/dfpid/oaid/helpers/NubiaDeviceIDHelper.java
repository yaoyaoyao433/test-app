package com.meituan.android.common.dfingerprint.dfpid.oaid.helpers;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class NubiaDeviceIDHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mConetxt;

    public NubiaDeviceIDHelper(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec189a89fa1c9982bafba10d84cc4445", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec189a89fa1c9982bafba10d84cc4445");
        } else {
            this.mConetxt = context;
        }
    }

    public String getNubiaID() {
        Bundle call;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a52feb040e0400e9326af4f57bf6707", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a52feb040e0400e9326af4f57bf6707");
        }
        Uri parse = Uri.parse("content://cn.nubia.identity/identity");
        try {
            if (Build.VERSION.SDK_INT > 17) {
                ContentProviderClient acquireContentProviderClient = this.mConetxt.getContentResolver().acquireContentProviderClient(parse);
                call = acquireContentProviderClient.call("getOAID", null, null);
                if (acquireContentProviderClient != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        acquireContentProviderClient.close();
                    } else {
                        acquireContentProviderClient.release();
                    }
                }
            } else {
                call = this.mConetxt.getContentResolver().call(parse, "getOAID", (String) null, (Bundle) null);
            }
            if (call.getInt("code", -1) == 0) {
                return call.getString("id");
            }
            call.getString("message");
            return null;
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
            return null;
        }
    }
}
