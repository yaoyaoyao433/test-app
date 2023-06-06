package com.meituan.android.downloadmanager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.meituan.android.downloadmanager.model.DownloadException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ICallbackService extends IInterface {
    void onLoadComplete(String str) throws RemoteException;

    void onLoadFailure(DownloadException downloadException) throws RemoteException;

    void onLoadProgress(long j, long j2) throws RemoteException;

    void onLoadStart(long j) throws RemoteException;

    void onLoadTimeOut(DownloadException downloadException) throws RemoteException;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements ICallbackService {
        private static final String DESCRIPTOR = "com.meituan.android.downloadmanager.ICallbackService";
        public static final int TRANSACTION_onLoadComplete = 3;
        public static final int TRANSACTION_onLoadFailure = 5;
        public static final int TRANSACTION_onLoadProgress = 2;
        public static final int TRANSACTION_onLoadStart = 1;
        public static final int TRANSACTION_onLoadTimeOut = 4;
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "069b91a66f0116a134a87283b7879e36", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "069b91a66f0116a134a87283b7879e36");
            } else {
                attachInterface(this, DESCRIPTOR);
            }
        }

        public static ICallbackService asInterface(IBinder iBinder) {
            Object[] objArr = {iBinder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "53b4b8ec45c5a32a9cace30776fb15e7", RobustBitConfig.DEFAULT_VALUE)) {
                return (ICallbackService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "53b4b8ec45c5a32a9cace30776fb15e7");
            }
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ICallbackService)) {
                return (ICallbackService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Object[] objArr = {Integer.valueOf(i), parcel, parcel2, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdec96e1e974cf2013d92b9dce808745", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdec96e1e974cf2013d92b9dce808745")).booleanValue();
            }
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    onLoadStart(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onLoadProgress(parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onLoadComplete(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    onLoadTimeOut(parcel.readInt() != 0 ? DownloadException.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onLoadFailure(parcel.readInt() != 0 ? DownloadException.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes2.dex */
        static class Proxy implements ICallbackService {
            public static ChangeQuickRedirect changeQuickRedirect;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                Object[] objArr = {iBinder};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f13f52c597e468d38990ab276e60059", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f13f52c597e468d38990ab276e60059");
                } else {
                    this.mRemote = iBinder;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.meituan.android.downloadmanager.ICallbackService
            public void onLoadStart(long j) throws RemoteException {
                Object[] objArr = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c47f1987368d9b6e749eee0a8223810", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c47f1987368d9b6e749eee0a8223810");
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeLong(j);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.meituan.android.downloadmanager.ICallbackService
            public void onLoadProgress(long j, long j2) throws RemoteException {
                Object[] objArr = {new Long(j), new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "948d32f43f0b65eb8b0c1b02ebd889c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "948d32f43f0b65eb8b0c1b02ebd889c5");
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.meituan.android.downloadmanager.ICallbackService
            public void onLoadComplete(String str) throws RemoteException {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f3192f18e68d148ebf4d9ef64268c9a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f3192f18e68d148ebf4d9ef64268c9a");
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.meituan.android.downloadmanager.ICallbackService
            public void onLoadTimeOut(DownloadException downloadException) throws RemoteException {
                Object[] objArr = {downloadException};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4667fea48fd23326854f6b795076416", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4667fea48fd23326854f6b795076416");
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (downloadException != null) {
                        obtain.writeInt(1);
                        downloadException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.meituan.android.downloadmanager.ICallbackService
            public void onLoadFailure(DownloadException downloadException) throws RemoteException {
                Object[] objArr = {downloadException};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbbf6b21a589f53f05351664358198e0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbbf6b21a589f53f05351664358198e0");
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (downloadException != null) {
                        obtain.writeInt(1);
                        downloadException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
