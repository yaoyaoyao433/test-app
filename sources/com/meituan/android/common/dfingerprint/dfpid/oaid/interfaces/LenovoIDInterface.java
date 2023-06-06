package com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public interface LenovoIDInterface extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class len_up extends Binder implements LenovoIDInterface {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* loaded from: classes2.dex */
        public static class len_down implements LenovoIDInterface {
            public static ChangeQuickRedirect changeQuickRedirect;
            private IBinder iBinder;

            public len_down(IBinder iBinder) {
                Object[] objArr = {iBinder};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03c1f3ed414c6b3b3a3f89d5277373e4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03c1f3ed414c6b3b3a3f89d5277373e4");
                } else {
                    this.iBinder = iBinder;
                }
            }

            @Override // com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces.LenovoIDInterface
            public String a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7136196d9f0d41eb41570fe4fa9d79e9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7136196d9f0d41eb41570fe4fa9d79e9");
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.iBinder.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } catch (Exception e) {
                    MTGuardLog.setErrorLogan(e);
                    return null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces.LenovoIDInterface
            public String a(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eaf08b081e6f0515ab1be53d460a5c7a", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eaf08b081e6f0515ab1be53d460a5c7a");
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.iBinder.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } catch (Exception e) {
                    MTGuardLog.setErrorLogan(e);
                    return null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces.LenovoIDInterface
            public String b() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef8d89a31758164059bf5edcde6b14ff", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef8d89a31758164059bf5edcde6b14ff");
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.iBinder.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } catch (Exception e) {
                    MTGuardLog.setErrorLogan(e);
                    return null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces.LenovoIDInterface
            public String b(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "258dfd4df9d6670672f19da188ae598b", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "258dfd4df9d6670672f19da188ae598b");
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.iBinder.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } catch (Exception e) {
                    MTGuardLog.setErrorLogan(e);
                    return null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.meituan.android.common.dfingerprint.dfpid.oaid.interfaces.LenovoIDInterface
            public boolean c() {
                boolean z = false;
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "810e7d185cb999d714c9d73348a83b06", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "810e7d185cb999d714c9d73348a83b06")).booleanValue();
                }
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.iBinder.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                } finally {
                    try {
                        return z;
                    } finally {
                    }
                }
                return z;
            }
        }

        public static LenovoIDInterface getHelper(IBinder iBinder) {
            Object[] objArr = {iBinder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3e7e7270ec828ea02cc4137bf1962a1", RobustBitConfig.DEFAULT_VALUE)) {
                return (LenovoIDInterface) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3e7e7270ec828ea02cc4137bf1962a1");
            }
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.zui.deviceidservice.IDeviceidInterface");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof LenovoIDInterface)) ? new len_down(iBinder) : (LenovoIDInterface) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String a;
            Object[] objArr = {Integer.valueOf(i), parcel, parcel2, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e13f0c9b76c3fcb9c1c15fd3460d6eb", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e13f0c9b76c3fcb9c1c15fd3460d6eb")).booleanValue();
            }
            if (i == 1598968902) {
                parcel2.writeString("com.zui.deviceidservice.IDeviceidInterface");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    a = a();
                    break;
                case 2:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    a = b();
                    break;
                case 3:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    boolean c = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(c ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    a = a(parcel.readString());
                    break;
                case 5:
                    parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                    a = b(parcel.readString());
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeNoException();
            parcel2.writeString(a);
            return true;
        }
    }

    String a();

    String a(String str);

    String b();

    String b(String str);

    boolean c();
}
