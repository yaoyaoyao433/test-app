package com.meituan.android.privacy.interfaces.def;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.Set;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements com.meituan.android.privacy.interfaces.k {
    public static ChangeQuickRedirect a;
    private final BluetoothAdapter b;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ced298d9ee3b793842f0eb379a903087", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ced298d9ee3b793842f0eb379a903087");
        } else {
            this.b = BluetoothAdapter.getDefaultAdapter();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @Nullable
    public final BluetoothDevice a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beea19eb0f0dd783cc3c7dfffa819d8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothDevice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beea19eb0f0dd783cc3c7dfffa819d8d");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getRemoteDevice(str2);
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @Nullable
    public final BluetoothDevice a(String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "018cfd61d9821459ff8c9dd5fedcc780", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothDevice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "018cfd61d9821459ff8c9dd5fedcc780");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getRemoteDevice(bArr);
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @RequiresApi(api = 21)
    public final BluetoothLeAdvertiser a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6070a9a1372954e1b855c78b09befcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothLeAdvertiser) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6070a9a1372954e1b855c78b09befcf");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getBluetoothLeAdvertiser();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e49f399851e5550c18aa58a7f3135e35", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e49f399851e5550c18aa58a7f3135e35")).booleanValue() : this.b != null && this.b.isEnabled();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final int c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2fb4d8b5ecf605c802bc7aab8438179", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2fb4d8b5ecf605c802bc7aab8438179")).intValue();
        }
        if (this.b == null) {
            return 10;
        }
        return this.b.getState();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d4b894594bba0e98dcf75eaaab27a3d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d4b894594bba0e98dcf75eaaab27a3d")).booleanValue() : this.b != null && this.b.enable();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3da1c104d21d0e6d020de25b243c2ee", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3da1c104d21d0e6d020de25b243c2ee")).booleanValue() : this.b != null && this.b.disable();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final String f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f36f62a4e58dabdf2aeb72899b1367d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f36f62a4e58dabdf2aeb72899b1367d3");
        }
        if (this.b == null) {
            return null;
        }
        return com.meituan.android.privacy.aop.b.a(this.b);
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "024e1190e923c89c3a3fe3edeb251d49", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "024e1190e923c89c3a3fe3edeb251d49")).booleanValue() : this.b != null && this.b.startDiscovery();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86007eacab966dd7c44d94d845bc2582", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86007eacab966dd7c44d94d845bc2582")).booleanValue() : this.b != null && this.b.cancelDiscovery();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5a581ea7747105ae88c048026504c4f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5a581ea7747105ae88c048026504c4f")).booleanValue() : this.b != null && this.b.isDiscovering();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @RequiresApi(api = 21)
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ebf895e68315bba8826e95774bc87b6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ebf895e68315bba8826e95774bc87b6")).booleanValue() : this.b != null && this.b.isOffloadedScanBatchingSupported();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @RequiresApi(api = 26)
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b596a4831f684762f6a1231159fe68c3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b596a4831f684762f6a1231159fe68c3")).booleanValue() : this.b != null && this.b.isLe2MPhySupported();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final Set<BluetoothDevice> j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d15f4dbc19b6b03e620da02c59c8e656", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d15f4dbc19b6b03e620da02c59c8e656");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getBondedDevices();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f43684fc98a9d2f0066ec838c564c64", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f43684fc98a9d2f0066ec838c564c64")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.getProfileConnectionState(i);
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    @Nullable
    public final BluetoothServerSocket a(String str, String str2, UUID uuid) throws IOException {
        Object[] objArr = {str, str2, uuid};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f304fa4e674ab0360896a3d6cfa36e1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothServerSocket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f304fa4e674ab0360896a3d6cfa36e1b");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.listenUsingRfcommWithServiceRecord(str2, uuid);
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    @Nullable
    public final BluetoothServerSocket b(String str, String str2, UUID uuid) throws IOException {
        Object[] objArr = {str, str2, uuid};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b993f3c9f327b0154994f008301ec5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothServerSocket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b993f3c9f327b0154994f008301ec5c");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.listenUsingInsecureRfcommWithServiceRecord(str2, uuid);
    }

    @Override // com.meituan.android.privacy.interfaces.k
    public final boolean a(String str, Context context, BluetoothProfile.ServiceListener serviceListener, int i) {
        Object[] objArr = {str, context, serviceListener, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ac3980d4b7cdfa41d5528821be9aabd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ac3980d4b7cdfa41d5528821be9aabd")).booleanValue() : this.b != null && this.b.getProfileProxy(context, serviceListener, i);
    }

    @Override // com.meituan.android.privacy.interfaces.k
    public final void a(int i, BluetoothProfile bluetoothProfile) {
        Object[] objArr = {Integer.valueOf(i), bluetoothProfile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2762f338a08e3f18382f9f40d39efd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2762f338a08e3f18382f9f40d39efd5");
        } else if (this.b != null) {
            this.b.closeProfileProxy(i, bluetoothProfile);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean a(String str, BluetoothAdapter.LeScanCallback leScanCallback) {
        Object[] objArr = {str, leScanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "956e80b6080fd96e40489b8f9a50ba85", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "956e80b6080fd96e40489b8f9a50ba85")).booleanValue() : this.b != null && this.b.startLeScan(leScanCallback);
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean a(String str, UUID[] uuidArr, BluetoothAdapter.LeScanCallback leScanCallback) {
        Object[] objArr = {str, uuidArr, leScanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aa468dff52f43a40969524f0612b9fd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aa468dff52f43a40969524f0612b9fd")).booleanValue() : this.b != null && this.b.startLeScan(uuidArr, leScanCallback);
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @RequiresApi(api = 18)
    @SuppressLint({"MissingPermission"})
    public final void b(String str, BluetoothAdapter.LeScanCallback leScanCallback) {
        Object[] objArr = {str, leScanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50a82c56b576b295eda8bf51ece5de3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50a82c56b576b295eda8bf51ece5de3a");
        } else if (this.b != null) {
            this.b.stopLeScan(leScanCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final String k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cd626cb4b42f6417dfd783baf3bf42b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cd626cb4b42f6417dfd783baf3bf42b");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getName();
    }
}
