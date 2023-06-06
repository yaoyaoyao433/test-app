package com.meituan.android.downloadmanager;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.meituan.android.downloadmanager.ICallbackService;
import com.meituan.android.downloadmanager.model.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IMultiDownloadService extends IInterface {
    void cancel(String str) throws RemoteException;

    void download(Request request) throws RemoteException;

    int getDownloadState(String str) throws RemoteException;

    int getPid() throws RemoteException;

    void registerCallback(String str, ICallbackService iCallbackService) throws RemoteException;

    void setCallFactoryType(int i) throws RemoteException;

    void unregisterCallback(String str, ICallbackService iCallbackService) throws RemoteException;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IMultiDownloadService {
        private static final String DESCRIPTOR = "com.meituan.android.downloadmanager.IMultiDownloadService";
        public static final int TRANSACTION_cancel = 5;
        public static final int TRANSACTION_download = 4;
        public static final int TRANSACTION_getDownloadState = 2;
        public static final int TRANSACTION_getPid = 1;
        public static final int TRANSACTION_registerCallback = 6;
        public static final int TRANSACTION_setCallFactoryType = 3;
        public static final int TRANSACTION_unregisterCallback = 7;
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "273ebdeff063528093446f78608a2a55", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "273ebdeff063528093446f78608a2a55");
            } else {
                attachInterface(this, DESCRIPTOR);
            }
        }

        public static IMultiDownloadService asInterface(IBinder iBinder) {
            Object[] objArr = {iBinder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a5242c52b99cddb31d1e18253e9f783a", RobustBitConfig.DEFAULT_VALUE)) {
                return (IMultiDownloadService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a5242c52b99cddb31d1e18253e9f783a");
            }
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IMultiDownloadService)) {
                return (IMultiDownloadService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Object[] objArr = {Integer.valueOf(i), parcel, parcel2, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc4d2f8be6ca440b71147b3168c8ffab", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc4d2f8be6ca440b71147b3168c8ffab")).booleanValue();
            }
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    int pid = getPid();
                    parcel2.writeNoException();
                    parcel2.writeInt(pid);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    int downloadState = getDownloadState(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(downloadState);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    setCallFactoryType(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    download(parcel.readInt() != 0 ? Request.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    cancel(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    registerCallback(parcel.readString(), ICallbackService.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    unregisterCallback(parcel.readString(), ICallbackService.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes2.dex */
        static class Proxy implements IMultiDownloadService {
            public static ChangeQuickRedirect changeQuickRedirect;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                Object[] objArr = {iBinder};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b5f86fb9985ba1a7cc61983c74febeb", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b5f86fb9985ba1a7cc61983c74febeb");
                } else {
                    this.mRemote = iBinder;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.meituan.android.downloadmanager.IMultiDownloadService
            public int getPid() throws RemoteException {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34e8fe5fd324d8e27fbe1a79ff89c94c", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34e8fe5fd324d8e27fbe1a79ff89c94c")).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.meituan.android.downloadmanager.IMultiDownloadService
            public int getDownloadState(String str) throws RemoteException {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6ae9fd0486e5e863d0d8e3a7d5e08e6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6ae9fd0486e5e863d0d8e3a7d5e08e6")).intValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.meituan.android.downloadmanager.IMultiDownloadService
            public void setCallFactoryType(int i) throws RemoteException {
                Object[] objArr = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45a8c418948bf4c89f70693eecbd9c3f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45a8c418948bf4c89f70693eecbd9c3f");
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.meituan.android.downloadmanager.IMultiDownloadService
            public void download(Request request) throws RemoteException {
                Object[] objArr = {request};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd602ab8266b7c7a468ce0ef00cb2b7b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd602ab8266b7c7a468ce0ef00cb2b7b");
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (request != null) {
                        obtain.writeInt(1);
                        request.writeToParcel(obtain, 0);
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

            @Override // com.meituan.android.downloadmanager.IMultiDownloadService
            public void cancel(String str) throws RemoteException {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae4ae9983ccd3514f4fb68e60cda79ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae4ae9983ccd3514f4fb68e60cda79ae");
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.meituan.android.downloadmanager.IMultiDownloadService
            public void registerCallback(String str, ICallbackService iCallbackService) throws RemoteException {
                Object[] objArr = {str, iCallbackService};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df3d92db5bd452875633264d7cea8a88", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df3d92db5bd452875633264d7cea8a88");
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iCallbackService != null ? iCallbackService.asBinder() : null);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.meituan.android.downloadmanager.IMultiDownloadService
            public void unregisterCallback(String str, ICallbackService iCallbackService) throws RemoteException {
                Object[] objArr = {str, iCallbackService};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54d1962ba3898a8aa89d93d727a62c62", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54d1962ba3898a8aa89d93d727a62c62");
                    return;
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iCallbackService != null ? iCallbackService.asBinder() : null);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
