package com.meituan.android.common.dfingerprint.dfpid.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces.LenovoIDInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class LenovoDeviceIDHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    public LenovoIDInterface lenovoIDInterface;
    private Context mContext;
    public ServiceConnection serviceConnection;

    public LenovoDeviceIDHelper(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58f974093f134092485aaab4de18335d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58f974093f134092485aaab4de18335d");
            return;
        }
        this.serviceConnection = new ServiceConnection() { // from class: com.meituan.android.common.dfingerprint.dfpid.oaid.helpers.LenovoDeviceIDHelper.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Object[] objArr2 = {componentName, iBinder};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d46371c1edc7c7bf030cab964654b3a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d46371c1edc7c7bf030cab964654b3a7");
                } else {
                    LenovoDeviceIDHelper.this.lenovoIDInterface = new LenovoIDInterface.len_up.len_down(iBinder);
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        };
        this.mContext = context;
    }

    public String getIdRun() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2a067fab991da659e37243543b4a1a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2a067fab991da659e37243543b4a1a9");
        }
        String packageName = this.mContext.getPackageName();
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        if (!this.mContext.bindService(intent, this.serviceConnection, 1) || this.lenovoIDInterface == null) {
            return "";
        }
        String a = this.lenovoIDInterface.a();
        this.lenovoIDInterface.b();
        this.lenovoIDInterface.b(packageName);
        this.lenovoIDInterface.b(packageName);
        return a;
    }
}
