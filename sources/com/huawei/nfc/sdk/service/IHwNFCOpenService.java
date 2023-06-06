package com.huawei.nfc.sdk.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IHwNFCOpenService extends IInterface {
    int createSSD(String str, String str2, String str3, String str4) throws RemoteException;

    int deleteSSD(String str, String str2, String str3, String str4) throws RemoteException;

    int eSEInfoSync(String str, String str2, String str3) throws RemoteException;

    String getCplc() throws RemoteException;

    int prepareProcess() throws RemoteException;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IHwNFCOpenService {
        private static final String DESCRIPTOR = "com.huawei.nfc.sdk.service.IHwNFCOpenService";
        static final int TRANSACTION_createSSD = 1;
        static final int TRANSACTION_deleteSSD = 2;
        static final int TRANSACTION_eSEInfoSync = 4;
        static final int TRANSACTION_getCplc = 3;
        static final int TRANSACTION_prepareProcess = 5;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IHwNFCOpenService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IHwNFCOpenService)) {
                return (IHwNFCOpenService) queryLocalInterface;
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
                    int createSSD = createSSD(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(createSSD);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int deleteSSD = deleteSSD(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(deleteSSD);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    String cplc = getCplc();
                    parcel2.writeNoException();
                    parcel2.writeString(cplc);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int eSEInfoSync = eSEInfoSync(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(eSEInfoSync);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int prepareProcess = prepareProcess();
                    parcel2.writeNoException();
                    parcel2.writeInt(prepareProcess);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes2.dex */
        public static class Proxy implements IHwNFCOpenService {
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

            @Override // com.huawei.nfc.sdk.service.IHwNFCOpenService
            public int createSSD(String str, String str2, String str3, String str4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nfc.sdk.service.IHwNFCOpenService
            public int deleteSSD(String str, String str2, String str3, String str4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nfc.sdk.service.IHwNFCOpenService
            public String getCplc() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nfc.sdk.service.IHwNFCOpenService
            public int eSEInfoSync(String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.nfc.sdk.service.IHwNFCOpenService
            public int prepareProcess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
