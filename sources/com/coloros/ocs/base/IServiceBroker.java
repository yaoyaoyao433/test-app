package com.coloros.ocs.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.coloros.ocs.base.IAuthenticationListener;
/* loaded from: classes.dex */
public interface IServiceBroker extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IServiceBroker {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.coloros.ocs.base.IServiceBroker
        public IBinder getBinder(String str, String str2) throws RemoteException {
            return null;
        }

        @Override // com.coloros.ocs.base.IServiceBroker
        public void handleAuthentication(String str, String str2, IAuthenticationListener iAuthenticationListener) throws RemoteException {
        }
    }

    IBinder getBinder(String str, String str2) throws RemoteException;

    void handleAuthentication(String str, String str2, IAuthenticationListener iAuthenticationListener) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IServiceBroker {
        private static final String DESCRIPTOR = "com.coloros.ocs.base.IServiceBroker";
        static final int TRANSACTION_getBinder = 2;
        static final int TRANSACTION_handleAuthentication = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IServiceBroker asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IServiceBroker)) {
                return (IServiceBroker) queryLocalInterface;
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
                    handleAuthentication(parcel.readString(), parcel.readString(), IAuthenticationListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    IBinder binder = getBinder(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(binder);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class Proxy implements IServiceBroker {
            public static IServiceBroker sDefaultImpl;
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

            @Override // com.coloros.ocs.base.IServiceBroker
            public void handleAuthentication(String str, String str2, IAuthenticationListener iAuthenticationListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(iAuthenticationListener != null ? iAuthenticationListener.asBinder() : null);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().handleAuthentication(str, str2, iAuthenticationListener);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.coloros.ocs.base.IServiceBroker
            public IBinder getBinder(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getBinder(str, str2);
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IServiceBroker iServiceBroker) {
            if (Proxy.sDefaultImpl != null || iServiceBroker == null) {
                return false;
            }
            Proxy.sDefaultImpl = iServiceBroker;
            return true;
        }

        public static IServiceBroker getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
