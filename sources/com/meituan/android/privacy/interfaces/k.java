package com.meituan.android.privacy.interfaces;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import java.io.IOException;
import java.util.Set;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface k {
    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    int a(String str, int i);

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN})
    BluetoothDevice a(String str, String str2);

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN})
    BluetoothDevice a(String str, byte[] bArr);

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    BluetoothServerSocket a(String str, String str2, UUID uuid) throws IOException;

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN)
    BluetoothLeAdvertiser a(String str);

    void a(int i, BluetoothProfile bluetoothProfile);

    boolean a();

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN, "Locate.once"})
    boolean a(String str, BluetoothAdapter.LeScanCallback leScanCallback);

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    boolean a(String str, Context context, BluetoothProfile.ServiceListener serviceListener, int i);

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN, "Locate.once"})
    boolean a(String str, UUID[] uuidArr, BluetoothAdapter.LeScanCallback leScanCallback);

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    BluetoothServerSocket b(String str, String str2, UUID uuid) throws IOException;

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN)
    void b(String str, BluetoothAdapter.LeScanCallback leScanCallback);

    boolean b();

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    boolean b(String str);

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    int c(String str);

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN)
    boolean d(String str);

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN)
    boolean e(String str);

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_PHONE_READ})
    String f(String str);

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN, "Locate.once"})
    boolean g(String str);

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH_ADMIN)
    boolean h(String str);

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    boolean i(String str);

    @RequiresPermission(allOf = {PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN})
    Set<BluetoothDevice> j(String str);

    @RequiresPermission(PermissionGuard.PERMISSION_BLUETOOTH)
    String k(String str);
}
