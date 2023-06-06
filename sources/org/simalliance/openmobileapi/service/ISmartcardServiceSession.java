package org.simalliance.openmobileapi.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.simalliance.openmobileapi.service.ISmartcardServiceCallback;
import org.simalliance.openmobileapi.service.ISmartcardServiceChannel;
import org.simalliance.openmobileapi.service.ISmartcardServiceReader;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface ISmartcardServiceSession extends IInterface {
    void close(SmartcardError smartcardError) throws RemoteException;

    void closeChannels(SmartcardError smartcardError) throws RemoteException;

    byte[] getAtr() throws RemoteException;

    ISmartcardServiceReader getReader() throws RemoteException;

    boolean isClosed() throws RemoteException;

    ISmartcardServiceChannel openBasicChannel(ISmartcardServiceCallback iSmartcardServiceCallback, SmartcardError smartcardError) throws RemoteException;

    ISmartcardServiceChannel openBasicChannelAid(byte[] bArr, ISmartcardServiceCallback iSmartcardServiceCallback, SmartcardError smartcardError) throws RemoteException;

    ISmartcardServiceChannel openLogicalChannel(byte[] bArr, ISmartcardServiceCallback iSmartcardServiceCallback, SmartcardError smartcardError) throws RemoteException;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static abstract class Stub extends Binder implements ISmartcardServiceSession {
        private static final String DESCRIPTOR = "org.simalliance.openmobileapi.service.ISmartcardServiceSession";
        static final int TRANSACTION_close = 3;
        static final int TRANSACTION_closeChannels = 4;
        static final int TRANSACTION_getAtr = 2;
        static final int TRANSACTION_getReader = 1;
        static final int TRANSACTION_isClosed = 5;
        static final int TRANSACTION_openBasicChannel = 6;
        static final int TRANSACTION_openBasicChannelAid = 7;
        static final int TRANSACTION_openLogicalChannel = 8;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISmartcardServiceSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ISmartcardServiceSession)) {
                return (ISmartcardServiceSession) queryLocalInterface;
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
                    ISmartcardServiceReader reader = getReader();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(reader != null ? reader.asBinder() : null);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] atr = getAtr();
                    parcel2.writeNoException();
                    parcel2.writeByteArray(atr);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    SmartcardError smartcardError = new SmartcardError();
                    close(smartcardError);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    smartcardError.writeToParcel(parcel2, 1);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    SmartcardError smartcardError2 = new SmartcardError();
                    closeChannels(smartcardError2);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    smartcardError2.writeToParcel(parcel2, 1);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isClosed = isClosed();
                    parcel2.writeNoException();
                    parcel2.writeInt(isClosed ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    ISmartcardServiceCallback asInterface = ISmartcardServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                    SmartcardError smartcardError3 = new SmartcardError();
                    ISmartcardServiceChannel openBasicChannel = openBasicChannel(asInterface, smartcardError3);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(openBasicChannel != null ? openBasicChannel.asBinder() : null);
                    parcel2.writeInt(1);
                    smartcardError3.writeToParcel(parcel2, 1);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray = parcel.createByteArray();
                    ISmartcardServiceCallback asInterface2 = ISmartcardServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                    SmartcardError smartcardError4 = new SmartcardError();
                    ISmartcardServiceChannel openBasicChannelAid = openBasicChannelAid(createByteArray, asInterface2, smartcardError4);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(openBasicChannelAid != null ? openBasicChannelAid.asBinder() : null);
                    parcel2.writeInt(1);
                    smartcardError4.writeToParcel(parcel2, 1);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte[] createByteArray2 = parcel.createByteArray();
                    ISmartcardServiceCallback asInterface3 = ISmartcardServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                    SmartcardError smartcardError5 = new SmartcardError();
                    ISmartcardServiceChannel openLogicalChannel = openLogicalChannel(createByteArray2, asInterface3, smartcardError5);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(openLogicalChannel != null ? openLogicalChannel.asBinder() : null);
                    parcel2.writeInt(1);
                    smartcardError5.writeToParcel(parcel2, 1);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes7.dex */
        static class Proxy implements ISmartcardServiceSession {
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

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceSession
            public ISmartcardServiceReader getReader() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return ISmartcardServiceReader.Stub.asInterface(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceSession
            public byte[] getAtr() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceSession
            public void close(SmartcardError smartcardError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        smartcardError.a(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceSession
            public void closeChannels(SmartcardError smartcardError) throws RemoteException {
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

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceSession
            public boolean isClosed() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceSession
            public ISmartcardServiceChannel openBasicChannel(ISmartcardServiceCallback iSmartcardServiceCallback, SmartcardError smartcardError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iSmartcardServiceCallback != null ? iSmartcardServiceCallback.asBinder() : null);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    ISmartcardServiceChannel asInterface = ISmartcardServiceChannel.Stub.asInterface(obtain2.readStrongBinder());
                    if (obtain2.readInt() != 0) {
                        smartcardError.a(obtain2);
                    }
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceSession
            public ISmartcardServiceChannel openBasicChannelAid(byte[] bArr, ISmartcardServiceCallback iSmartcardServiceCallback, SmartcardError smartcardError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongBinder(iSmartcardServiceCallback != null ? iSmartcardServiceCallback.asBinder() : null);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    ISmartcardServiceChannel asInterface = ISmartcardServiceChannel.Stub.asInterface(obtain2.readStrongBinder());
                    if (obtain2.readInt() != 0) {
                        smartcardError.a(obtain2);
                    }
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.simalliance.openmobileapi.service.ISmartcardServiceSession
            public ISmartcardServiceChannel openLogicalChannel(byte[] bArr, ISmartcardServiceCallback iSmartcardServiceCallback, SmartcardError smartcardError) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    obtain.writeStrongBinder(iSmartcardServiceCallback != null ? iSmartcardServiceCallback.asBinder() : null);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    ISmartcardServiceChannel asInterface = ISmartcardServiceChannel.Stub.asInterface(obtain2.readStrongBinder());
                    if (obtain2.readInt() != 0) {
                        smartcardError.a(obtain2);
                    }
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
