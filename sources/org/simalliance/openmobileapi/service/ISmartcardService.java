package org.simalliance.openmobileapi.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.simalliance.openmobileapi.service.ISmartcardServiceCallback;
import org.simalliance.openmobileapi.service.ISmartcardServiceReader;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface ISmartcardService extends IInterface {
    ISmartcardServiceReader getReader(String str, SmartcardError smartcardError) throws RemoteException;

    String[] getReaders(SmartcardError smartcardError) throws RemoteException;

    boolean[] isNFCEventAllowed(String str, byte[] bArr, String[] strArr, ISmartcardServiceCallback iSmartcardServiceCallback, SmartcardError smartcardError) throws RemoteException;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements ISmartcardService {
        private static final String DESCRIPTOR = "org.simalliance.openmobileapi.service.ISmartcardService";
        static final int TRANSACTION_getReader = 2;
        static final int TRANSACTION_getReaders = 1;
        static final int TRANSACTION_isNFCEventAllowed = 3;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISmartcardService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ISmartcardService)) {
                return (ISmartcardService) queryLocalInterface;
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
                    SmartcardError smartcardError = new SmartcardError();
                    String[] readers = getReaders(smartcardError);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(readers);
                    parcel2.writeInt(1);
                    smartcardError.writeToParcel(parcel2, 1);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString = parcel.readString();
                    SmartcardError smartcardError2 = new SmartcardError();
                    ISmartcardServiceReader reader = getReader(readString, smartcardError2);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(reader != null ? reader.asBinder() : null);
                    parcel2.writeInt(1);
                    smartcardError2.writeToParcel(parcel2, 1);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString2 = parcel.readString();
                    byte[] createByteArray = parcel.createByteArray();
                    String[] createStringArray = parcel.createStringArray();
                    ISmartcardServiceCallback asInterface = ISmartcardServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                    SmartcardError smartcardError3 = new SmartcardError();
                    boolean[] isNFCEventAllowed = isNFCEventAllowed(readString2, createByteArray, createStringArray, asInterface, smartcardError3);
                    parcel2.writeNoException();
                    parcel2.writeBooleanArray(isNFCEventAllowed);
                    parcel2.writeInt(1);
                    smartcardError3.writeToParcel(parcel2, 1);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes7.dex */
        public static class Proxy implements ISmartcardService {
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

            @Override // org.simalliance.openmobileapi.service.ISmartcardService
            public String[] getReaders(SmartcardError smartcardError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String[] createStringArray = obtain2.createStringArray();
                    if (obtain2.readInt() != 0) {
                        smartcardError.a(obtain2);
                    }
                    return createStringArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardService
            public ISmartcardServiceReader getReader(String str, SmartcardError smartcardError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    ISmartcardServiceReader asInterface = ISmartcardServiceReader.Stub.asInterface(obtain2.readStrongBinder());
                    if (obtain2.readInt() != 0) {
                        smartcardError.a(obtain2);
                    }
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardService
            public boolean[] isNFCEventAllowed(String str, byte[] bArr, String[] strArr, ISmartcardServiceCallback iSmartcardServiceCallback, SmartcardError smartcardError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeStringArray(strArr);
                    obtain.writeStrongBinder(iSmartcardServiceCallback != null ? iSmartcardServiceCallback.asBinder() : null);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    boolean[] createBooleanArray = obtain2.createBooleanArray();
                    if (obtain2.readInt() != 0) {
                        smartcardError.a(obtain2);
                    }
                    return createBooleanArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
