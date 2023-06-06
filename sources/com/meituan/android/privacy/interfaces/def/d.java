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
import com.meituan.android.privacy.interfaces.MtBluetoothAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.Set;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements MtBluetoothAdapter {
    public static ChangeQuickRedirect a;
    private final BluetoothAdapter b;
    private final String c;

    public d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c0e623cbf932d9c7ba68b3f3e23964", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c0e623cbf932d9c7ba68b3f3e23964");
            return;
        }
        this.b = BluetoothAdapter.getDefaultAdapter();
        this.c = str;
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @RequiresApi(api = 21)
    public final com.meituan.android.privacy.interfaces.l getBluetoothLeScanner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eccf760fe31ffcf348fdffe81253d871", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.privacy.interfaces.l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eccf760fe31ffcf348fdffe81253d871") : new f(this.c);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @Nullable
    public final BluetoothDevice getRemoteDevice(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3548d7c9ddb152b1257fad3d82921906", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothDevice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3548d7c9ddb152b1257fad3d82921906");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getRemoteDevice(str);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @Nullable
    public final BluetoothDevice getRemoteDevice(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28f96ccb7697df1dd2808982f9f63809", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothDevice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28f96ccb7697df1dd2808982f9f63809");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getRemoteDevice(bArr);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @RequiresApi(api = 21)
    public final BluetoothLeAdvertiser getBluetoothLeAdvertiser() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f4276ab27fec09df78a0d6d14cb1523", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothLeAdvertiser) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f4276ab27fec09df78a0d6d14cb1523");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getBluetoothLeAdvertiser();
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean isEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf8955ded95cbc6ee310f4644777e107", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf8955ded95cbc6ee310f4644777e107")).booleanValue() : this.b != null && this.b.isEnabled();
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final int getState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90804eeabcd68c98b345bb1ce1fd73fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90804eeabcd68c98b345bb1ce1fd73fb")).intValue();
        }
        if (this.b == null) {
            return 10;
        }
        return this.b.getState();
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean enable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bbe4fb8d2b081c0745485d277342321", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bbe4fb8d2b081c0745485d277342321")).booleanValue() : this.b != null && this.b.enable();
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean disable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f92f1893694b4448e33bd109b774ee69", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f92f1893694b4448e33bd109b774ee69")).booleanValue() : this.b != null && this.b.disable();
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final String getAddress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93914e6f397446b3f2443cc2b04fe32b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93914e6f397446b3f2443cc2b04fe32b");
        }
        if (this.b == null) {
            return null;
        }
        return com.meituan.android.privacy.aop.b.a(this.b);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean startDiscovery() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be1d3b3cda87d2e71d132f1964445ba5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be1d3b3cda87d2e71d132f1964445ba5")).booleanValue() : this.b != null && this.b.startDiscovery();
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean cancelDiscovery() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a602f3799544db5fb0f69e49bffd993a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a602f3799544db5fb0f69e49bffd993a")).booleanValue() : this.b != null && this.b.cancelDiscovery();
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean isDiscovering() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "707e90a8353659e5866198edd825a49d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "707e90a8353659e5866198edd825a49d")).booleanValue() : this.b != null && this.b.isDiscovering();
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @RequiresApi(api = 21)
    public final boolean isOffloadedScanBatchingSupported() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4adec3010793a81d3be6fec1c9698bc2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4adec3010793a81d3be6fec1c9698bc2")).booleanValue() : this.b != null && this.b.isOffloadedScanBatchingSupported();
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @RequiresApi(api = 26)
    public final boolean isLe2MPhySupported() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20aa2e5b9a7b46129ccd9bd2b3145970", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20aa2e5b9a7b46129ccd9bd2b3145970")).booleanValue() : this.b != null && this.b.isLe2MPhySupported();
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final Set<BluetoothDevice> getBondedDevices() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f12b13ae1436ea18a86996cf5268986", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f12b13ae1436ea18a86996cf5268986");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getBondedDevices();
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final int getProfileConnectionState(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39b2fe362759014533c73a4176e57a19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39b2fe362759014533c73a4176e57a19")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.getProfileConnectionState(i);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    @Nullable
    public final BluetoothServerSocket listenUsingRfcommWithServiceRecord(String str, UUID uuid) throws IOException {
        Object[] objArr = {str, uuid};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5d1e8396d3b70685a777c8139b19c96", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothServerSocket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5d1e8396d3b70685a777c8139b19c96");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.listenUsingRfcommWithServiceRecord(str, uuid);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    @Nullable
    public final BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord(String str, UUID uuid) throws IOException {
        Object[] objArr = {str, uuid};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64f0405dedac70d2f85d524128c0c332", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothServerSocket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64f0405dedac70d2f85d524128c0c332");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.listenUsingInsecureRfcommWithServiceRecord(str, uuid);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    public final boolean getProfileProxy(Context context, BluetoothProfile.ServiceListener serviceListener, int i) {
        Object[] objArr = {context, serviceListener, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "746d8925abb188c6c7a0f59b84670802", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "746d8925abb188c6c7a0f59b84670802")).booleanValue() : this.b != null && this.b.getProfileProxy(context, serviceListener, i);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    public final void closeProfileProxy(int i, BluetoothProfile bluetoothProfile) {
        Object[] objArr = {Integer.valueOf(i), bluetoothProfile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d372a512cbdcddad600d7af15f00614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d372a512cbdcddad600d7af15f00614");
        } else if (this.b != null) {
            this.b.closeProfileProxy(i, bluetoothProfile);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    public final boolean checkBluetoothAddress(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0434dc8183376a703e876e0f8e36f743", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0434dc8183376a703e876e0f8e36f743")).booleanValue() : BluetoothAdapter.checkBluetoothAddress(str);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean startLeScan(BluetoothAdapter.LeScanCallback leScanCallback) {
        Object[] objArr = {leScanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76bc4d4d2d8328a5e14ae9774e50ec76", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76bc4d4d2d8328a5e14ae9774e50ec76")).booleanValue() : this.b != null && this.b.startLeScan(leScanCallback);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final boolean startLeScan(UUID[] uuidArr, BluetoothAdapter.LeScanCallback leScanCallback) {
        Object[] objArr = {uuidArr, leScanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80388d2723691c47d77619502bb7e7f0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80388d2723691c47d77619502bb7e7f0")).booleanValue() : this.b != null && this.b.startLeScan(uuidArr, leScanCallback);
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final void stopLeScan(BluetoothAdapter.LeScanCallback leScanCallback) {
        Object[] objArr = {leScanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a4845d105679377c07534b62b61977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a4845d105679377c07534b62b61977");
        } else if (this.b != null) {
            this.b.stopLeScan(leScanCallback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtBluetoothAdapter
    @SuppressLint({"MissingPermission"})
    public final String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d51ff6491fb8cd74acbc3212279efd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d51ff6491fb8cd74acbc3212279efd9");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getName();
    }
}
