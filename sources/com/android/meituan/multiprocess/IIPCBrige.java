package com.android.meituan.multiprocess;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.android.meituan.multiprocess.IIPCBrigeCallBack;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface IIPCBrige extends IInterface {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class Default implements IIPCBrige {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.android.meituan.multiprocess.IIPCBrige
        public void invokeAsync(Bundle bundle, String str, IIPCBrigeCallBack iIPCBrigeCallBack) throws RemoteException {
        }

        @Override // com.android.meituan.multiprocess.IIPCBrige
        public Bundle invokeSync(Bundle bundle, String str) throws RemoteException {
            return null;
        }
    }

    void invokeAsync(Bundle bundle, String str, IIPCBrigeCallBack iIPCBrigeCallBack) throws RemoteException;

    Bundle invokeSync(Bundle bundle, String str) throws RemoteException;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IIPCBrige {
        private static final String DESCRIPTOR = "com.android.meituan.multiprocess.IIPCBrige";
        static final int TRANSACTION_invokeAsync = 2;
        static final int TRANSACTION_invokeSync = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IIPCBrige asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IIPCBrige)) {
                return (IIPCBrige) queryLocalInterface;
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
                    Bundle invokeSync = invokeSync(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                    parcel2.writeNoException();
                    if (invokeSync != null) {
                        parcel2.writeInt(1);
                        invokeSync.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    invokeAsync(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString(), IIPCBrigeCallBack.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public static class Proxy implements IIPCBrige {
            public static IIPCBrige sDefaultImpl;
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

            @Override // com.android.meituan.multiprocess.IIPCBrige
            public Bundle invokeSync(Bundle bundle, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().invokeSync(bundle, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.meituan.multiprocess.IIPCBrige
            public void invokeAsync(Bundle bundle, String str, IIPCBrigeCallBack iIPCBrigeCallBack) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iIPCBrigeCallBack != null ? iIPCBrigeCallBack.asBinder() : null);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().invokeAsync(bundle, str, iIPCBrigeCallBack);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IIPCBrige iIPCBrige) {
            if (Proxy.sDefaultImpl != null || iIPCBrige == null) {
                return false;
            }
            Proxy.sDefaultImpl = iIPCBrige;
            return true;
        }

        public static IIPCBrige getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
