package com.android.meituan.multiprocess;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface IIPCBrigeCallBack extends IInterface {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class Default implements IIPCBrigeCallBack {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.android.meituan.multiprocess.IIPCBrigeCallBack
        public void callBack(int i, Bundle bundle) throws RemoteException {
        }
    }

    void callBack(int i, Bundle bundle) throws RemoteException;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IIPCBrigeCallBack {
        private static final String DESCRIPTOR = "com.android.meituan.multiprocess.IIPCBrigeCallBack";
        static final int TRANSACTION_callBack = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IIPCBrigeCallBack asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IIPCBrigeCallBack)) {
                return (IIPCBrigeCallBack) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            callBack(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public static class Proxy implements IIPCBrigeCallBack {
            public static IIPCBrigeCallBack sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.android.meituan.multiprocess.IIPCBrigeCallBack
            public void callBack(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().callBack(i, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IIPCBrigeCallBack iIPCBrigeCallBack) {
            if (Proxy.sDefaultImpl != null || iIPCBrigeCallBack == null) {
                return false;
            }
            Proxy.sDefaultImpl = iIPCBrigeCallBack;
            return true;
        }

        public static IIPCBrigeCallBack getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
