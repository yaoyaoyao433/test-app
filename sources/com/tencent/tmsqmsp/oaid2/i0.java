package com.tencent.tmsqmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface i0 extends IInterface {
    String a();

    String a(String str);

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class a extends Binder implements i0 {
        public static i0 a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof i0)) ? new C1502a(iBinder) : (i0) queryLocalInterface;
        }

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.tmsqmsp.oaid2.i0$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static class C1502a implements i0 {
            public IBinder a;

            public C1502a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.tencent.tmsqmsp.oaid2.i0
            public String a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                        obtain.writeString(str);
                        this.a.transact(3, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readString();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        obtain2.recycle();
                        obtain.recycle();
                        return null;
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.tencent.tmsqmsp.oaid2.i0
            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                        this.a.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readString();
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        obtain2.recycle();
                        obtain.recycle();
                        return null;
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
