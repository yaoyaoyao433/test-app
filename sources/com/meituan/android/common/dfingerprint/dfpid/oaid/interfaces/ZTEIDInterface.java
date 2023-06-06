package com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public interface ZTEIDInterface extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class up extends Binder implements ZTEIDInterface {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* loaded from: classes2.dex */
        public static class down implements ZTEIDInterface {
            public static ChangeQuickRedirect changeQuickRedirect;
            private IBinder binder;

            public down(IBinder iBinder) {
                Object[] objArr = {iBinder};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "612fcb28707b4deb6a4d971375a3cdf7", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "612fcb28707b4deb6a4d971375a3cdf7");
                } else {
                    this.binder = iBinder;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.binder;
            }

            @Override // com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces.ZTEIDInterface
            public boolean c() {
                boolean z = false;
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0758ef000af68509aad73e14ace612d7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0758ef000af68509aad73e14ace612d7")).booleanValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.binder.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = true;
                    }
                } finally {
                    try {
                        return z;
                    } finally {
                    }
                }
                return z;
            }

            @Override // com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces.ZTEIDInterface
            public String getOAID() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a09297c1c81322fda68843e35f9c99b", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a09297c1c81322fda68843e35f9c99b");
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.binder.transact(3, obtain, obtain2, 0);
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

            @Override // com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces.ZTEIDInterface
            public boolean isSupported() {
                return false;
            }

            @Override // com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces.ZTEIDInterface
            public void shutDown() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9fb27c8e3072bfaf28a18d2cbb6d3ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9fb27c8e3072bfaf28a18d2cbb6d3ea");
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.binder.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }

    boolean c();

    String getOAID();

    boolean isSupported();

    void shutDown();
}
