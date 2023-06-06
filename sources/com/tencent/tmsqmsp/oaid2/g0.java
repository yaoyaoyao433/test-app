package com.tencent.tmsqmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface g0 extends IInterface {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class a extends Binder implements g0 {

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.tmsqmsp.oaid2.g0$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static class C1501a implements g0 {
            public IBinder a;

            public C1501a(IBinder iBinder) {
                this.a = iBinder;
            }

            public String a(String str, String str2, String str3) {
                String str4;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    str4 = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return str4;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    try {
                        throw th;
                    } catch (RemoteException e) {
                        e.printStackTrace();
                        str4 = "";
                    }
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public static g0 a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof g0)) ? new C1501a(iBinder) : (g0) queryLocalInterface;
        }
    }
}
