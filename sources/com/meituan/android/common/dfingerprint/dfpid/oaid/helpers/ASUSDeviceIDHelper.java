package com.meituan.android.common.dfingerprint.dfpid.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces.ASUSIDInterface;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class ASUSDeviceIDHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final LinkedBlockingQueue<IBinder> linkedBlockingQueue;
    private Context mContext;
    public ServiceConnection serviceConnection;

    public ASUSDeviceIDHelper(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4abc4f81704fea515379c0f1660a77dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4abc4f81704fea515379c0f1660a77dc");
            return;
        }
        this.linkedBlockingQueue = new LinkedBlockingQueue<>(1);
        this.serviceConnection = new ServiceConnection() { // from class: com.meituan.android.common.dfingerprint.dfpid.oaid.helpers.ASUSDeviceIDHelper.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Object[] objArr2 = {componentName, iBinder};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "092b5a4a999be4e72cc0c049bc47d463", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "092b5a4a999be4e72cc0c049bc47d463");
                    return;
                }
                try {
                    ASUSDeviceIDHelper.this.linkedBlockingQueue.offer(iBinder, 4L, TimeUnit.SECONDS);
                } catch (Throwable th) {
                    MTGuardLog.setErrorLogan(th);
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        };
        this.mContext = context;
    }

    public String getID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59874d83e7e3f37e6e3b11aa5fb5c488", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59874d83e7e3f37e6e3b11aa5fb5c488");
        }
        try {
            this.mContext.getPackageManager().getPackageInfo("com.asus.msa.SupplementaryDID", 0);
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
        }
        Intent intent = new Intent();
        intent.setAction("com.asus.msa.action.ACCESS_DID");
        intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
        if (this.mContext.bindService(intent, this.serviceConnection, 1)) {
            try {
                return new ASUSIDInterface.ASUSID(this.linkedBlockingQueue.poll(4L, TimeUnit.SECONDS)).getID();
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
                return "";
            }
        }
        return "";
    }
}
