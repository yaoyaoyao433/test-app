package org.simalliance.openmobileapi.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.simalliance.openmobileapi.service.ISmartcardServiceSession;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface ISmartcardServiceReader extends IInterface {
    void closeSessions(SmartcardError smartcardError) throws RemoteException;

    String getName(SmartcardError smartcardError) throws RemoteException;

    boolean isSecureElementPresent(SmartcardError smartcardError) throws RemoteException;

    ISmartcardServiceSession openSession(SmartcardError smartcardError) throws RemoteException;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements ISmartcardServiceReader {
        private static final String DESCRIPTOR = "org.simalliance.openmobileapi.service.ISmartcardServiceReader";
        static final int TRANSACTION_closeSessions = 4;
        static final int TRANSACTION_getName = 1;
        static final int TRANSACTION_isSecureElementPresent = 2;
        static final int TRANSACTION_openSession = 3;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISmartcardServiceReader asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ISmartcardServiceReader)) {
                return (ISmartcardServiceReader) queryLocalInterface;
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
                    String name = getName(smartcardError);
                    parcel2.writeNoException();
                    parcel2.writeString(name);
                    parcel2.writeInt(1);
                    smartcardError.writeToParcel(parcel2, 1);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    SmartcardError smartcardError2 = new SmartcardError();
                    boolean isSecureElementPresent = isSecureElementPresent(smartcardError2);
                    parcel2.writeNoException();
                    parcel2.writeInt(isSecureElementPresent ? 1 : 0);
                    parcel2.writeInt(1);
                    smartcardError2.writeToParcel(parcel2, 1);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    SmartcardError smartcardError3 = new SmartcardError();
                    ISmartcardServiceSession openSession = openSession(smartcardError3);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(openSession != null ? openSession.asBinder() : null);
                    parcel2.writeInt(1);
                    smartcardError3.writeToParcel(parcel2, 1);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    SmartcardError smartcardError4 = new SmartcardError();
                    closeSessions(smartcardError4);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    smartcardError4.writeToParcel(parcel2, 1);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes7.dex */
        public static class Proxy implements ISmartcardServiceReader {
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

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceReader
            public String getName(SmartcardError smartcardError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    if (obtain2.readInt() != 0) {
                        smartcardError.a(obtain2);
                    }
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceReader
            public boolean isSecureElementPresent(SmartcardError smartcardError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    boolean z = obtain2.readInt() != 0;
                    if (obtain2.readInt() != 0) {
                        smartcardError.a(obtain2);
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceReader
            public ISmartcardServiceSession openSession(SmartcardError smartcardError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    ISmartcardServiceSession asInterface = ISmartcardServiceSession.Stub.asInterface(obtain2.readStrongBinder());
                    if (obtain2.readInt() != 0) {
                        smartcardError.a(obtain2);
                    }
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceReader
            public void closeSessions(SmartcardError smartcardError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        smartcardError.a(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
