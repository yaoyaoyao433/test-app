package com.coloros.ocs.mediaunit;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface IKaraokeService extends IInterface {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class Default implements IKaraokeService {
        @Override // com.coloros.ocs.mediaunit.IKaraokeService
        public int abandonAudioLoopback(String str) throws RemoteException {
            return 0;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.coloros.ocs.mediaunit.IKaraokeService
        public int requestAudioLoopback(IBinder iBinder, String str) throws RemoteException {
            return 0;
        }
    }

    int abandonAudioLoopback(String str) throws RemoteException;

    int requestAudioLoopback(IBinder iBinder, String str) throws RemoteException;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IKaraokeService {
        private static final String DESCRIPTOR = "com.coloros.ocs.mediaunit.IKaraokeService";
        static final int TRANSACTION_abandonAudioLoopback = 2;
        static final int TRANSACTION_requestAudioLoopback = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IKaraokeService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IKaraokeService)) {
                return (IKaraokeService) queryLocalInterface;
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
                    int requestAudioLoopback = requestAudioLoopback(parcel.readStrongBinder(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(requestAudioLoopback);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int abandonAudioLoopback = abandonAudioLoopback(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(abandonAudioLoopback);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public static class Proxy implements IKaraokeService {
            public static IKaraokeService sDefaultImpl;
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

            @Override // com.coloros.ocs.mediaunit.IKaraokeService
            public int requestAudioLoopback(IBinder iBinder, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().requestAudioLoopback(iBinder, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.coloros.ocs.mediaunit.IKaraokeService
            public int abandonAudioLoopback(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().abandonAudioLoopback(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IKaraokeService iKaraokeService) {
            if (Proxy.sDefaultImpl != null || iKaraokeService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iKaraokeService;
            return true;
        }

        public static IKaraokeService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
