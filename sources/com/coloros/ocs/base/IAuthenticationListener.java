package com.coloros.ocs.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.coloros.ocs.base.common.CapabilityInfo;
/* loaded from: classes.dex */
public interface IAuthenticationListener extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IAuthenticationListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.coloros.ocs.base.IAuthenticationListener
        public void onFail(int i) throws RemoteException {
        }

        @Override // com.coloros.ocs.base.IAuthenticationListener
        public void onSuccess(CapabilityInfo capabilityInfo) throws RemoteException {
        }
    }

    void onFail(int i) throws RemoteException;

    void onSuccess(CapabilityInfo capabilityInfo) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IAuthenticationListener {
        private static final String DESCRIPTOR = "com.coloros.ocs.base.IAuthenticationListener";
        static final int TRANSACTION_onFail = 2;
        static final int TRANSACTION_onSuccess = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAuthenticationListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAuthenticationListener)) {
                return (IAuthenticationListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    onSuccess(parcel.readInt() != 0 ? CapabilityInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onFail(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class Proxy implements IAuthenticationListener {
            public static IAuthenticationListener sDefaultImpl;
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

            @Override // com.coloros.ocs.base.IAuthenticationListener
            public void onSuccess(CapabilityInfo capabilityInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (capabilityInfo != null) {
                        obtain.writeInt(1);
                        capabilityInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onSuccess(capabilityInfo);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.coloros.ocs.base.IAuthenticationListener
            public void onFail(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onFail(i);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IAuthenticationListener iAuthenticationListener) {
            if (Proxy.sDefaultImpl != null || iAuthenticationListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iAuthenticationListener;
            return true;
        }

        public static IAuthenticationListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
