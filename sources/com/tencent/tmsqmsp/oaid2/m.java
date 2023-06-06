package com.tencent.tmsqmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface m extends IInterface {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class a extends Binder implements m {

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.tmsqmsp.oaid2.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static class C1503a implements m {
            public IBinder a;

            public C1503a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.tencent.tmsqmsp.oaid2.m
            public boolean h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.tmsqmsp.oaid2.m
            public String m() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static m a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof m)) {
                return (m) queryLocalInterface;
            }
            return new C1503a(iBinder);
        }
    }

    boolean h();

    String m();
}
