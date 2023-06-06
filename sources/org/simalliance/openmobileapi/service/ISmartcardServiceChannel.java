package org.simalliance.openmobileapi.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.simalliance.openmobileapi.service.ISmartcardServiceSession;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface ISmartcardServiceChannel extends IInterface {
    void close(SmartcardError smartcardError) throws RemoteException;

    byte[] getSelectResponse() throws RemoteException;

    ISmartcardServiceSession getSession() throws RemoteException;

    boolean isBasicChannel() throws RemoteException;

    boolean isClosed() throws RemoteException;

    boolean selectNext(SmartcardError smartcardError) throws RemoteException;

    byte[] transmit(byte[] bArr, SmartcardError smartcardError) throws RemoteException;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements ISmartcardServiceChannel {
        private static final String DESCRIPTOR = "org.simalliance.openmobileapi.service.ISmartcardServiceChannel";
        static final int TRANSACTION_close = 1;
        static final int TRANSACTION_getSelectResponse = 4;
        static final int TRANSACTION_getSession = 5;
        static final int TRANSACTION_isBasicChannel = 3;
        static final int TRANSACTION_isClosed = 2;
        static final int TRANSACTION_selectNext = 7;
        static final int TRANSACTION_transmit = 6;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISmartcardServiceChannel asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ISmartcardServiceChannel)) {
                return (ISmartcardServiceChannel) queryLocalInterface;
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
                    close(smartcardError);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    smartcardError.writeToParcel(parcel2, 1);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isClosed = isClosed();
                    parcel2.writeNoException();
                    parcel2.writeInt(isClosed ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isBasicChannel = isBasicChannel();
                    parcel2.writeNoException();
                    parcel2.writeInt(isBasicChannel ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] selectResponse = getSelectResponse();
                    parcel2.writeNoException();
                    parcel2.writeByteArray(selectResponse);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    ISmartcardServiceSession session = getSession();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(session != null ? session.asBinder() : null);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray = parcel.createByteArray();
                    SmartcardError smartcardError2 = new SmartcardError();
                    byte[] transmit = transmit(createByteArray, smartcardError2);
                    parcel2.writeNoException();
                    parcel2.writeByteArray(transmit);
                    parcel2.writeInt(1);
                    smartcardError2.writeToParcel(parcel2, 1);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    SmartcardError smartcardError3 = new SmartcardError();
                    boolean selectNext = selectNext(smartcardError3);
                    parcel2.writeNoException();
                    parcel2.writeInt(selectNext ? 1 : 0);
                    parcel2.writeInt(1);
                    smartcardError3.writeToParcel(parcel2, 1);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes7.dex */
        public static class Proxy implements ISmartcardServiceChannel {
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

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceChannel
            public void close(SmartcardError smartcardError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        smartcardError.a(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceChannel
            public boolean isClosed() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceChannel
            public boolean isBasicChannel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceChannel
            public byte[] getSelectResponse() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceChannel
            public ISmartcardServiceSession getSession() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return ISmartcardServiceSession.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceChannel
            public byte[] transmit(byte[] bArr, SmartcardError smartcardError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    byte[] createByteArray = obtain2.createByteArray();
                    if (obtain2.readInt() != 0) {
                        smartcardError.a(obtain2);
                    }
                    return createByteArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceChannel
            public boolean selectNext(SmartcardError smartcardError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(7, obtain, obtain2, 0);
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
        }
    }
}
