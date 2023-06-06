package com.huawei.multimedia.liteav.audioengine;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IHwAudioEngine extends IInterface {
    List getSupportedFeatures() throws RemoteException;

    void init(String str, String str2) throws RemoteException;

    boolean isFeatureSupported(int i) throws RemoteException;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IHwAudioEngine {
        private static final String DESCRIPTOR = "com.huawei.multimedia.audioengine.IHwAudioEngine";
        static final int TRANSACTION_getSupportedFeatures = 1;
        static final int TRANSACTION_init = 3;
        static final int TRANSACTION_isFeatureSupported = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IHwAudioEngine asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IHwAudioEngine)) {
                return (IHwAudioEngine) queryLocalInterface;
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
                    List supportedFeatures = getSupportedFeatures();
                    parcel2.writeNoException();
                    parcel2.writeList(supportedFeatures);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isFeatureSupported = isFeatureSupported(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(isFeatureSupported ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    init(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes2.dex */
        static class Proxy implements IHwAudioEngine {
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

            @Override // com.huawei.multimedia.liteav.audioengine.IHwAudioEngine
            public List getSupportedFeatures() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.multimedia.liteav.audioengine.IHwAudioEngine
            public boolean isFeatureSupported(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.huawei.multimedia.liteav.audioengine.IHwAudioEngine
            public void init(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
