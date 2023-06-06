package com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public interface ASUSIDInterface extends IInterface {

    /* loaded from: classes2.dex */
    public static final class ASUSID implements ASUSIDInterface {
        public static ChangeQuickRedirect changeQuickRedirect;
        private IBinder iBinder;

        public ASUSID(IBinder iBinder) {
            Object[] objArr = {iBinder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c06b9b4d081022b170663b482b44240c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c06b9b4d081022b170663b482b44240c");
            } else {
                this.iBinder = iBinder;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.iBinder;
        }

        @Override // com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces.ASUSIDInterface
        public final String getID() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbc9d730f22d8fb90e144c9cbe6b7630", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbc9d730f22d8fb90e144c9cbe6b7630");
            }
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                this.iBinder.transact(3, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } catch (Throwable th) {
                try {
                    MTGuardLog.setErrorLogan(th);
                    return null;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            }
        }
    }

    String getID();
}
