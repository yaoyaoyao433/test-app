package com.meituan.android.privacy.proxy;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import android.support.annotation.RequiresApi;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.proxy.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.Set;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements com.meituan.android.privacy.interfaces.k {
    public static ChangeQuickRedirect a;
    final BluetoothAdapter b;
    private final u c;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "116bed4920f93d0ce05ede493394938b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "116bed4920f93d0ce05ede493394938b");
            return;
        }
        this.c = new u();
        this.b = BluetoothAdapter.getDefaultAdapter();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    public final BluetoothDevice a(String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1073a0378813f15a5a49b348a21f8796", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothDevice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1073a0378813f15a5a49b348a21f8796");
        }
        if (this.b == null) {
            return null;
        }
        return (BluetoothDevice) this.c.a("bluetoothadapter.gRDevice_S", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN}, new u.a<BluetoothDevice>() { // from class: com.meituan.android.privacy.proxy.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ BluetoothDevice a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f5def7a6ca75feca6205067b9022a55", RobustBitConfig.DEFAULT_VALUE) ? (BluetoothDevice) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f5def7a6ca75feca6205067b9022a55") : d.this.b.getRemoteDevice(str2);
            }
        }, false);
    }

    @Override // com.meituan.android.privacy.interfaces.k
    public final BluetoothDevice a(String str, final byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7055066d8e1faca23dbecfc38500f42", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothDevice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7055066d8e1faca23dbecfc38500f42");
        }
        if (this.b == null) {
            return null;
        }
        return (BluetoothDevice) this.c.a("bluetoothadapter.gRDevice_B", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN}, new u.a<BluetoothDevice>() { // from class: com.meituan.android.privacy.proxy.d.12
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ BluetoothDevice a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d424e05c9f993efd3cdd2cd5ac35bbf", RobustBitConfig.DEFAULT_VALUE) ? (BluetoothDevice) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d424e05c9f993efd3cdd2cd5ac35bbf") : d.this.b.getRemoteDevice(bArr);
            }
        }, false);
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @RequiresApi(api = 21)
    public final BluetoothLeAdvertiser a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbbc06080c2c1819e27089b3a71e10d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothLeAdvertiser) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbbc06080c2c1819e27089b3a71e10d6");
        }
        if (this.b == null) {
            return null;
        }
        return (BluetoothLeAdvertiser) this.c.a("bluetoothadapter.gBLAdvertiser", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH_ADMIN}, new u.a<BluetoothLeAdvertiser>() { // from class: com.meituan.android.privacy.proxy.d.13
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ BluetoothLeAdvertiser a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0bd2b1ea81a664eaed4339ae0f87ac6", RobustBitConfig.DEFAULT_VALUE) ? (BluetoothLeAdvertiser) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0bd2b1ea81a664eaed4339ae0f87ac6") : d.this.b.getBluetoothLeAdvertiser();
            }
        }, false);
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean b(String str) {
        Boolean bool;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df2ed9da259bdcab080e422ef246649e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df2ed9da259bdcab080e422ef246649e")).booleanValue() : (this.b == null || (bool = (Boolean) this.c.a("bluetoothadapter.iEnabled", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.d.14
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ff1966ad03441598a93a1f7baa8f04b", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ff1966ad03441598a93a1f7baa8f04b") : Boolean.valueOf(d.this.b.isEnabled());
            }
        }, false)) == null || !bool.booleanValue()) ? false : true;
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final int c(String str) {
        Integer num;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7373c7a3e1a2b33274b48343d1403bc5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7373c7a3e1a2b33274b48343d1403bc5")).intValue();
        }
        if (this.b == null || (num = (Integer) this.c.a("bluetoothadapter.gState", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH}, new u.a<Integer>() { // from class: com.meituan.android.privacy.proxy.d.15
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Integer a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6d01bfa09cc1b6f1820df2ea1edca6c", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6d01bfa09cc1b6f1820df2ea1edca6c") : Integer.valueOf(d.this.b.getState());
            }
        }, false)) == null) {
            return 10;
        }
        return num.intValue();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean d(String str) {
        Boolean bool;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbb66bae1ec8fa78a9b91521aedbda1c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbb66bae1ec8fa78a9b91521aedbda1c")).booleanValue() : (this.b == null || (bool = (Boolean) this.c.a("bluetoothadapter.e", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH_ADMIN}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.d.16
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c512f003bd2699e07aa81c599151275", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c512f003bd2699e07aa81c599151275") : Boolean.valueOf(d.this.b.enable());
            }
        }, false)) == null || !bool.booleanValue()) ? false : true;
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean e(String str) {
        Boolean bool;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c08e6dd39e6f67e4aea8b375f86a002b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c08e6dd39e6f67e4aea8b375f86a002b")).booleanValue() : (this.b == null || (bool = (Boolean) this.c.a("bluetoothadapter.d", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH_ADMIN}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.d.17
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3824ab11dc20f3d32d983bd8e6f3c154", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3824ab11dc20f3d32d983bd8e6f3c154") : Boolean.valueOf(d.this.b.disable());
            }
        }, false)) == null || !bool.booleanValue()) ? false : true;
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"HardwareIds", "MissingPermission"})
    public final String f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28678a15a0e86e8253459dbf7312a424", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28678a15a0e86e8253459dbf7312a424");
        }
        if (com.meituan.android.privacy.impl.d.a() != null && z.a(PermissionGuard.PERMISSION_BLUETOOTH, str, "bluetoothadapter.gAddress") && z.a(PermissionGuard.PERMISSION_PHONE_READ, str, "bluetoothadapter.gAddress")) {
            return AppUtil.getBluetoothMac(com.meituan.android.privacy.impl.d.a());
        }
        return null;
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean g(String str) {
        Boolean bool;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16bb548541b2c9fc95b443f45c7fd5bd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16bb548541b2c9fc95b443f45c7fd5bd")).booleanValue() : (this.b == null || (bool = (Boolean) this.c.a("bluetoothadapter.sDiscovery", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH_ADMIN, PermissionGuard.PERMISSION_BLUETOOTH, "Locate.once"}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.d.18
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7b614778c368433e7360e02f2896a07", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7b614778c368433e7360e02f2896a07") : Boolean.valueOf(d.this.b.startDiscovery());
            }
        }, false)) == null || !bool.booleanValue()) ? false : true;
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean h(String str) {
        Boolean bool;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d868624213f120a8b3e93d9641a653b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d868624213f120a8b3e93d9641a653b")).booleanValue() : (this.b == null || (bool = (Boolean) this.c.a("bluetoothadapter.cDiscovery", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH_ADMIN}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.d.19
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba0a6f4a0902b768b7bbad5dedb2f513", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba0a6f4a0902b768b7bbad5dedb2f513") : Boolean.valueOf(d.this.b.cancelDiscovery());
            }
        }, false)) == null || !bool.booleanValue()) ? false : true;
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean i(String str) {
        Boolean bool;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a2ca4b6ef0e9362cdd2bd69bef96fa7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a2ca4b6ef0e9362cdd2bd69bef96fa7")).booleanValue() : (this.b == null || (bool = (Boolean) this.c.a("bluetoothadapter.iDiscovering", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.d.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20a561c93946c98fb4d5936a97ea7f08", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20a561c93946c98fb4d5936a97ea7f08") : Boolean.valueOf(d.this.b.isDiscovering());
            }
        }, false)) == null || !bool.booleanValue()) ? false : true;
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @RequiresApi(api = 21)
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4792d964632696c4b30d952d570b07c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4792d964632696c4b30d952d570b07c")).booleanValue() : this.b != null && this.b.isOffloadedScanBatchingSupported();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @RequiresApi(api = 26)
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51d6c61f9a0dfc834c4f3180364771e1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51d6c61f9a0dfc834c4f3180364771e1")).booleanValue() : this.b != null && this.b.isLe2MPhySupported();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final Set<BluetoothDevice> j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a646308168cb07cb0761a4940911ee5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a646308168cb07cb0761a4940911ee5");
        }
        if (this.b == null) {
            return null;
        }
        return (Set) this.c.a("bluetoothadapter.gBDevices", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN}, new u.a<Set<BluetoothDevice>>() { // from class: com.meituan.android.privacy.proxy.d.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Set<BluetoothDevice> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab3e08053b65ec566b2e737bef09ddfd", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab3e08053b65ec566b2e737bef09ddfd") : d.this.b.getBondedDevices();
            }
        }, false);
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final int a(String str, final int i) {
        Integer num;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67c28db12f274c47a19000ef5efe4c1e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67c28db12f274c47a19000ef5efe4c1e")).intValue();
        }
        if (this.b == null || (num = (Integer) this.c.a("bluetoothadapter.gPCState", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH}, new u.a<Integer>() { // from class: com.meituan.android.privacy.proxy.d.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Integer a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ddef9e17cc8a87afc0d1e0b47a0efec4", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ddef9e17cc8a87afc0d1e0b47a0efec4") : Integer.valueOf(d.this.b.getProfileConnectionState(i));
            }
        }, false)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final BluetoothServerSocket a(String str, final String str2, final UUID uuid) throws IOException {
        aa aaVar;
        Object[] objArr = {str, str2, uuid};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e4255faadbeed28fe06020739afcf16", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothServerSocket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e4255faadbeed28fe06020739afcf16");
        }
        if (this.b == null || (aaVar = (aa) this.c.a("bluetoothadapter.lURWSRecord", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH}, new u.a<aa>() { // from class: com.meituan.android.privacy.proxy.d.5
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.privacy.proxy.u.a
            /* renamed from: b */
            public aa a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9e6e2fd8f4602f3152e7b25c1de781f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (aa) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9e6e2fd8f4602f3152e7b25c1de781f");
                }
                try {
                    return new aa(d.this.b.listenUsingRfcommWithServiceRecord(str2, uuid), null);
                } catch (IOException e) {
                    return new aa(null, e);
                }
            }
        }, false)) == null) {
            return null;
        }
        if (aaVar.b instanceof IOException) {
            throw ((IOException) aaVar.b);
        }
        return (BluetoothServerSocket) aaVar.a;
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final BluetoothServerSocket b(String str, final String str2, final UUID uuid) throws IOException {
        aa aaVar;
        Object[] objArr = {str, str2, uuid};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7a1f7b00af21649e9892932dc8fab87", RobustBitConfig.DEFAULT_VALUE)) {
            return (BluetoothServerSocket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7a1f7b00af21649e9892932dc8fab87");
        }
        if (this.b == null || (aaVar = (aa) this.c.a("bluetoothadapter.lUIRWSRecord", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH}, new u.a<aa>() { // from class: com.meituan.android.privacy.proxy.d.6
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.privacy.proxy.u.a
            /* renamed from: b */
            public aa a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c5de66fb3b7d73cadd17334c24cdd51", RobustBitConfig.DEFAULT_VALUE)) {
                    return (aa) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c5de66fb3b7d73cadd17334c24cdd51");
                }
                try {
                    return new aa(d.this.b.listenUsingInsecureRfcommWithServiceRecord(str2, uuid), null);
                } catch (IOException e) {
                    return new aa(null, e);
                }
            }
        }, false)) == null) {
            return null;
        }
        if (aaVar.b instanceof IOException) {
            throw ((IOException) aaVar.b);
        }
        return (BluetoothServerSocket) aaVar.a;
    }

    @Override // com.meituan.android.privacy.interfaces.k
    public final boolean a(String str, final Context context, final BluetoothProfile.ServiceListener serviceListener, final int i) {
        Boolean bool;
        Object[] objArr = {str, context, serviceListener, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15ec926a6e7e156f0e3ac0e5cd38cdb2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15ec926a6e7e156f0e3ac0e5cd38cdb2")).booleanValue() : (this.b == null || (bool = (Boolean) this.c.a("bluetoothadapter.gPProxy", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.d.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16b665fab5e1270603e8bec4d7de1217", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16b665fab5e1270603e8bec4d7de1217") : Boolean.valueOf(d.this.b.getProfileProxy(context, serviceListener, i));
            }
        }, false)) == null || !bool.booleanValue()) ? false : true;
    }

    @Override // com.meituan.android.privacy.interfaces.k
    public final void a(int i, BluetoothProfile bluetoothProfile) {
        Object[] objArr = {Integer.valueOf(i), bluetoothProfile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8481f540e07634a48bc02fe9c92dac9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8481f540e07634a48bc02fe9c92dac9e");
        } else if (this.b != null) {
            this.b.closeProfileProxy(i, bluetoothProfile);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean a(String str, final BluetoothAdapter.LeScanCallback leScanCallback) {
        Boolean bool;
        Object[] objArr = {str, leScanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb462b416d601cbfe1eece50ac1c46b7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb462b416d601cbfe1eece50ac1c46b7")).booleanValue() : (this.b == null || (bool = (Boolean) this.c.a("bluetoothadapter.startLScan_B", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH_ADMIN, PermissionGuard.PERMISSION_BLUETOOTH, "Locate.once"}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.d.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9904dd39df3e02c8dac9290e7a3a1cfb", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9904dd39df3e02c8dac9290e7a3a1cfb") : Boolean.valueOf(d.this.b.startLeScan(leScanCallback));
            }
        }, false)) == null || !bool.booleanValue()) ? false : true;
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final boolean a(String str, final UUID[] uuidArr, final BluetoothAdapter.LeScanCallback leScanCallback) {
        Boolean bool;
        Object[] objArr = {str, uuidArr, leScanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54fd12a506f391989a5a076385758ecb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54fd12a506f391989a5a076385758ecb")).booleanValue() : (this.b == null || (bool = (Boolean) this.c.a("bluetoothadapter.startLScan_UB", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH_ADMIN, PermissionGuard.PERMISSION_BLUETOOTH, "Locate.once"}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.d.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53a4eeac4487b05d92229f943acc108b", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53a4eeac4487b05d92229f943acc108b") : Boolean.valueOf(d.this.b.startLeScan(uuidArr, leScanCallback));
            }
        }, false)) == null || !bool.booleanValue()) ? false : true;
    }

    @Override // com.meituan.android.privacy.interfaces.k
    @SuppressLint({"MissingPermission"})
    public final void b(String str, final BluetoothAdapter.LeScanCallback leScanCallback) {
        Object[] objArr = {str, leScanCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a7c11dc805c732ddb662abb99ba8cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a7c11dc805c732ddb662abb99ba8cd");
        } else if (this.b != null) {
            this.c.a("bluetoothadapter.stopLScan", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH_ADMIN}, new u.a<Object>() { // from class: com.meituan.android.privacy.proxy.d.10
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final Object a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d65b98129549f74a0f06af5d97fd600b", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d65b98129549f74a0f06af5d97fd600b");
                    }
                    d.this.b.stopLeScan(leScanCallback);
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.k
    public final String k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6813c7f2bf6a96deefaeaa899445b893", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6813c7f2bf6a96deefaeaa899445b893");
        }
        if (this.b == null) {
            return null;
        }
        return (String) this.c.a("bluetoothadapter.gName", str, new String[]{PermissionGuard.PERMISSION_BLUETOOTH}, new u.a<String>() { // from class: com.meituan.android.privacy.proxy.d.11
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "031220c408a96de550d7b911ea08a455", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "031220c408a96de550d7b911ea08a455") : d.this.b.getName();
            }
        }, false);
    }
}
