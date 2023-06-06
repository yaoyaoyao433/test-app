package com.meituan.android.privacy.interfaces;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import android.support.annotation.RequiresApi;
import java.io.IOException;
import java.util.Set;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MtBluetoothAdapter {
    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN)
    boolean cancelDiscovery();

    boolean checkBluetoothAddress(String str);

    void closeProfileProxy(int i, BluetoothProfile bluetoothProfile);

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN)
    boolean disable();

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN)
    boolean enable();

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_PHONE_READ})
    String getAddress();

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN)
    BluetoothLeAdvertiser getBluetoothLeAdvertiser();

    @RequiresApi(api = 21)
    l getBluetoothLeScanner();

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN})
    Set<BluetoothDevice> getBondedDevices();

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    String getName();

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    int getProfileConnectionState(int i);

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    boolean getProfileProxy(Context context, BluetoothProfile.ServiceListener serviceListener, int i);

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN})
    BluetoothDevice getRemoteDevice(String str);

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN})
    BluetoothDevice getRemoteDevice(byte[] bArr);

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    int getState();

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    boolean isDiscovering();

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    boolean isEnabled();

    boolean isLe2MPhySupported();

    boolean isOffloadedScanBatchingSupported();

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord(String str, UUID uuid) throws IOException;

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    BluetoothServerSocket listenUsingRfcommWithServiceRecord(String str, UUID uuid) throws IOException;

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN, "Locate.once"})
    boolean startDiscovery();

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN, "Locate.once"})
    boolean startLeScan(BluetoothAdapter.LeScanCallback leScanCallback);

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN, "Locate.once"})
    boolean startLeScan(UUID[] uuidArr, BluetoothAdapter.LeScanCallback leScanCallback);

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN)
    void stopLeScan(BluetoothAdapter.LeScanCallback leScanCallback);
}
