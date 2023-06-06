package com.heytap.openid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface h_a extends IInterface {

    /* compiled from: ProGuard */
    /* renamed from: com.heytap.openid.h_a$h_a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC0158h_a extends Binder implements h_a {

        /* compiled from: ProGuard */
        /* renamed from: com.heytap.openid.h_a$h_a$h_a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0159h_a implements h_a {
            public IBinder h_a;

            public C0159h_a(IBinder iBinder) {
                this.h_a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.h_a;
            }

            public String h_a(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.h_a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static h_a h_a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            if (queryLocalInterface != null && (queryLocalInterface instanceof h_a)) {
                return (h_a) queryLocalInterface;
            }
            return new C0159h_a(iBinder);
        }
    }
}
