package com.meituan.android.common.dfingerprint.dfpid.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces.ZTEIDInterface;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class ZTEDeviceIDHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String idPkgName;
    public final LinkedBlockingQueue<IBinder> linkedBlockingQueue;
    public Context mContext;
    public ServiceConnection serviceConnection;

    public ZTEDeviceIDHelper(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2d8f0f31e7beabe035dfebd3d5a949c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2d8f0f31e7beabe035dfebd3d5a949c");
            return;
        }
        this.idPkgName = "com.mdid.msa";
        this.linkedBlockingQueue = new LinkedBlockingQueue<>(1);
        this.serviceConnection = new ServiceConnection() { // from class: com.meituan.android.common.dfingerprint.dfpid.oaid.helpers.ZTEDeviceIDHelper.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Object[] objArr2 = {componentName, iBinder};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "31996dddae485fdbb25fdc33dd9261af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "31996dddae485fdbb25fdc33dd9261af");
                    return;
                }
                try {
                    ZTEDeviceIDHelper.this.linkedBlockingQueue.offer(iBinder, 4L, TimeUnit.SECONDS);
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

    private int checkService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b44dec9748ed71783eb7d72d5ee19faa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b44dec9748ed71783eb7d72d5ee19faa")).intValue();
        }
        try {
            this.mContext.getPackageManager().getPackageInfo(this.idPkgName, 0);
            return 1;
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
            return 0;
        }
    }

    private void startMsaklServer(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef973a915551cc80de0e830fa16e8140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef973a915551cc80de0e830fa16e8140");
            return;
        }
        checkService();
        Intent intent = new Intent();
        intent.setClassName(this.idPkgName, "com.mdid.msa.service.MsaKlService");
        intent.setAction("com.bun.msa.action.start.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        try {
            intent.putExtra("com.bun.msa.param.runinset", true);
            if (this.mContext.startService(intent) != null) {
            }
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
        }
    }

    public String getID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7a423a619781795d34eb0e0f951046d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7a423a619781795d34eb0e0f951046d");
        }
        try {
            this.mContext.getPackageManager().getPackageInfo(this.idPkgName, 0);
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
        }
        String packageName = this.mContext.getPackageName();
        startMsaklServer(packageName);
        Intent intent = new Intent();
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.setAction("com.bun.msa.action.bindto.service");
        intent.putExtra("com.bun.msa.param.pkgname", packageName);
        if (this.mContext.bindService(intent, this.serviceConnection, 1)) {
            try {
                String oaid = new ZTEIDInterface.up.down(this.linkedBlockingQueue.poll(4L, TimeUnit.SECONDS)).getOAID();
                this.mContext.unbindService(this.serviceConnection);
                return oaid;
            } catch (Throwable th) {
                try {
                    MTGuardLog.setErrorLogan(th);
                    return "";
                } finally {
                    this.mContext.unbindService(this.serviceConnection);
                }
            }
        }
        return "";
    }
}
