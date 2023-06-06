package com.meituan.android.privacy.proxy;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import com.meituan.android.privacy.interfaces.MtBluetoothAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.Set;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements MtBluetoothAdapter {
    public static ChangeQuickRedirect a;
    private com.meituan.android.privacy.interfaces.k b;
    private final u c;
    private final String d;

    public c(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb051e0378aaa6f8c1cdf3e78f186686", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb051e0378aaa6f8c1cdf3e78f186686");
            return;
        }
        this.d = str;
        this.c = new u();
        this.b = new d();
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @RequiresApi(api = 21)
    public final com.meituan.android.privacy.interfaces.l getBluetoothLeScanner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee0cef403210687fcb21f09c8418aae6", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.privacy.interfaces.l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee0cef403210687fcb21f09c8418aae6") : new e(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    public final BluetoothDevice getRemoteDevice(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e5c5f9eea030242bed5d6aa5d39c603", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothDevice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e5c5f9eea030242bed5d6aa5d39c603");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.a(this.d, str);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    public final BluetoothDevice getRemoteDevice(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00621c62161d182a54202979cf35c5c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothDevice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00621c62161d182a54202979cf35c5c4");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.a(this.d, bArr);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @RequiresApi(api = 21)
    public final BluetoothLeAdvertiser getBluetoothLeAdvertiser() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e875fa6f4fc44992e131bd6d90cf8fa0", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothLeAdvertiser) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e875fa6f4fc44992e131bd6d90cf8fa0");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.a(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean isEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0000226b678dbaf9404a5f1e3fea2f45", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0000226b678dbaf9404a5f1e3fea2f45")).booleanValue() : this.b != null && this.b.b(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final int getState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2781747a0eefe825aeae5469f9f4d1fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2781747a0eefe825aeae5469f9f4d1fb")).intValue();
        }
        if (this.b == null) {
            return 10;
        }
        return this.b.c(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean enable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c901c3c93294f0560a9326c3cd8b8b5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c901c3c93294f0560a9326c3cd8b8b5")).booleanValue() : this.b != null && this.b.d(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean disable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6b7a0f53eaa6a192e57b64de6de1ce1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6b7a0f53eaa6a192e57b64de6de1ce1")).booleanValue() : this.b != null && this.b.e(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"HardwareIds", "MissingPermission"})
    public final String getAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f587c9e65bbe6ef96af46bb670ce9f37", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f587c9e65bbe6ef96af46bb670ce9f37");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.f(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean startDiscovery() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb8b647841c449c1042694a1c0ca2cc6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb8b647841c449c1042694a1c0ca2cc6")).booleanValue() : this.b != null && this.b.g(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean cancelDiscovery() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "819d96600689831285cde8b7b913b9d4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "819d96600689831285cde8b7b913b9d4")).booleanValue() : this.b != null && this.b.h(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean isDiscovering() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0efd10cec35e6cd3a18fb771fb04649", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0efd10cec35e6cd3a18fb771fb04649")).booleanValue() : this.b != null && this.b.i(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @RequiresApi(api = 21)
    public final boolean isOffloadedScanBatchingSupported() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54a73e450b39b4514ee9f6c2361c7ea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54a73e450b39b4514ee9f6c2361c7ea")).booleanValue() : this.b != null && this.b.a();
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @RequiresApi(api = 26)
    public final boolean isLe2MPhySupported() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74217d62ba0080c157b6e740bfdd9d64", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74217d62ba0080c157b6e740bfdd9d64")).booleanValue() : this.b != null && this.b.b();
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final Set<BluetoothDevice> getBondedDevices() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32606ecc36a63c2e87c2c4cce30a20a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32606ecc36a63c2e87c2c4cce30a20a1");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.j(this.d);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final int getProfileConnectionState(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e07efef4be9a2bafa36f58932a2c27d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e07efef4be9a2bafa36f58932a2c27d")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.a(this.d, i);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final BluetoothServerSocket listenUsingRfcommWithServiceRecord(String str, UUID uuid) throws IOException {
        Object[] objArr = {str, uuid};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "645afff89eca818c80cd3ce7c07629d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothServerSocket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "645afff89eca818c80cd3ce7c07629d6");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.a(this.d, str, uuid);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord(String str, UUID uuid) throws IOException {
        Object[] objArr = {str, uuid};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb8c07f7e20b2591ee31942caaa83ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothServerSocket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb8c07f7e20b2591ee31942caaa83ab");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.b(this.d, str, uuid);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    public final boolean getProfileProxy(Context context, BluetoothProfile.ServiceListener serviceListener, int i) {
        Object[] objArr = {context, serviceListener, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a7f6ea101a286665a59f6901762c4c7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a7f6ea101a286665a59f6901762c4c7")).booleanValue() : this.b != null && this.b.a(this.d, context, serviceListener, i);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    public final void closeProfileProxy(int i, BluetoothProfile bluetoothProfile) {
        Object[] objArr = {Integer.valueOf(i), bluetoothProfile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb78fa34b29a38290fc77138d1fe9cea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb78fa34b29a38290fc77138d1fe9cea");
        } else if (this.b != null) {
            this.b.a(i, bluetoothProfile);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    public final boolean checkBluetoothAddress(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38c2e7e2cdddee00ddec67bd53f702ba", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38c2e7e2cdddee00ddec67bd53f702ba")).booleanValue() : BluetoothAdapter.checkBluetoothAddress(str);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean startLeScan(BluetoothAdapter.LeScanCallback leScanCallback) {
        Object[] objArr = {leScanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0459491acdd5fa57e1ce0ea30ee16726", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0459491acdd5fa57e1ce0ea30ee16726")).booleanValue() : this.b != null && this.b.a(this.d, leScanCallback);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean startLeScan(UUID[] uuidArr, BluetoothAdapter.LeScanCallback leScanCallback) {
        Object[] objArr = {uuidArr, leScanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6833036efd5fdfd3ae71e3edbe4ce686", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6833036efd5fdfd3ae71e3edbe4ce686")).booleanValue() : this.b != null && this.b.a(this.d, uuidArr, leScanCallback);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final void stopLeScan(BluetoothAdapter.LeScanCallback leScanCallback) {
        Object[] objArr = {leScanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64b56d51a202f1e34ddd77486f1040a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64b56d51a202f1e34ddd77486f1040a2");
        } else if (this.b != null) {
            this.b.b(this.d, leScanCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    public final String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6dd0631e19b79810e22a811bbfd1e18", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6dd0631e19b79810e22a811bbfd1e18");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.k(this.d);
    }
}
