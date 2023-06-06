package com.tencent.tmsqmsp.oaid2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface q extends IInterface {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class a extends Binder implements q {

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.tmsqmsp.oaid2.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static class C1505a implements q {
            public IBinder a;

            public C1505a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.tencent.tmsqmsp.oaid2.q
            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return "";
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.tencent.tmsqmsp.oaid2.q
            public boolean c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                boolean z = false;
                try {
                    try {
                        obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                        this.a.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            z = true;
                        }
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.tmsqmsp.oaid2.q
            public String d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return "";
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tencent.tmsqmsp.oaid2.q
            public void f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } catch (RemoteException e) {
                    e.printStackTrace();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
                if (r1.readInt() != 0) goto L6;
             */
            @Override // com.tencent.tmsqmsp.oaid2.q
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean g() {
                /*
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    r2 = 1
                    r3 = 0
                    java.lang.String r4 = "com.bun.lib.MsaIdInterface"
                    r0.writeInterfaceToken(r4)     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
                    android.os.IBinder r4 = r5.a     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
                    r4.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
                    r1.readException()     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
                    int r4 = r1.readInt()     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
                    if (r4 == 0) goto L24
                    goto L25
                L1e:
                    r2 = move-exception
                    goto L2c
                L20:
                    r2 = move-exception
                    r2.printStackTrace()     // Catch: java.lang.Throwable -> L1e
                L24:
                    r2 = 0
                L25:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L2c:
                    r1.recycle()
                    r0.recycle()
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.q.a.C1505a.g():boolean");
            }
        }

        public static q a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bun.lib.MsaIdInterface");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof q)) ? new C1505a(iBinder) : (q) queryLocalInterface;
        }
    }

    String a();

    boolean c();

    String d();

    void f();

    boolean g();
}
