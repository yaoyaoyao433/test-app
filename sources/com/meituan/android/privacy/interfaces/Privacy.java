package com.meituan.android.privacy.interfaces;

import android.content.Context;
import android.hardware.Camera;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class Privacy {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NonNull
    public static e createPermissionGuard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "12d8fe52ff365305de3547e421255409", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "12d8fe52ff365305de3547e421255409");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.privacy.aop.f.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "9f4876331ffca09bb24d8abba82ed3d7", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "9f4876331ffca09bb24d8abba82ed3d7") : com.meituan.android.privacy.impl.permission.d.a();
    }

    @Nullable
    public static u createLocationManager(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b717547009f2b6c24f179b7ba710be0d", RobustBitConfig.DEFAULT_VALUE) ? (u) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b717547009f2b6c24f179b7ba710be0d") : ac.c().a(context, str);
    }

    @Nullable
    public static MtTelephonyManager createTelephonyManager(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "78f1a1dd1882dd5b823520d2d596ac2e", RobustBitConfig.DEFAULT_VALUE) ? (MtTelephonyManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "78f1a1dd1882dd5b823520d2d596ac2e") : ac.c().b(context, str);
    }

    @Nullable
    public static MtWifiManager createWifiManager(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1fdcc2c15a42ca44adaf7705d9afcc36", RobustBitConfig.DEFAULT_VALUE) ? (MtWifiManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1fdcc2c15a42ca44adaf7705d9afcc36") : ac.c().c(context, str);
    }

    @Nullable
    public static w createSubscriptionManager(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f00fe7015375dbb0f00b6e804681181b", RobustBitConfig.DEFAULT_VALUE) ? (w) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f00fe7015375dbb0f00b6e804681181b") : ac.c().d(context, str);
    }

    @Nullable
    public static x createTelecomManager(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7833c3e52e7b212c177310ded11be34e", RobustBitConfig.DEFAULT_VALUE) ? (x) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7833c3e52e7b212c177310ded11be34e") : ac.c().e(context, str);
    }

    public static r createClipboardManager(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "130e393afb797b5f6ffbbe900a2305d8", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "130e393afb797b5f6ffbbe900a2305d8") : ac.c().f(context, str);
    }

    public static r createClipboardManager(Context context, String str, b bVar) {
        Object[] objArr = {context, str, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8bb521a62498e19ea2ba7af62652266", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8bb521a62498e19ea2ba7af62652266") : ac.c().a(context, str, bVar);
    }

    public static s createPrivateClipboardManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a14e82fe93961770c117bd36ecbcc1ff", RobustBitConfig.DEFAULT_VALUE) ? (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a14e82fe93961770c117bd36ecbcc1ff") : ac.c().b(context);
    }

    public static s createPrivateClipboardManager(Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f4f478d9d02e490ebefffa0b7d76bd2", RobustBitConfig.DEFAULT_VALUE) ? (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f4f478d9d02e490ebefffa0b7d76bd2") : ac.c().a(context, bVar);
    }

    public static p createCamera(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fe288c7141293949812c31d4e10ccea7", RobustBitConfig.DEFAULT_VALUE) ? (p) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fe288c7141293949812c31d4e10ccea7") : ac.c().a(str);
    }

    public static p createCamera(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "04363f45d35cb8ecb9e256e89092159c", RobustBitConfig.DEFAULT_VALUE) ? (p) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "04363f45d35cb8ecb9e256e89092159c") : ac.c().a(str, i);
    }

    public static p createCamera(String str, Camera camera) {
        Object[] objArr = {str, camera};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cdbd09f648cd3ee3638a90aef3cb47b8", RobustBitConfig.DEFAULT_VALUE) ? (p) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cdbd09f648cd3ee3638a90aef3cb47b8") : ac.c().a(str, camera);
    }

    public static j createAudioRecord(String str, int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f461df798034eb3ddaf06a426cc7cbf6", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f461df798034eb3ddaf06a426cc7cbf6") : ac.c().a(str, i, i2, i3, i4, i5);
    }

    public static v createMediaRecorder(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c8c29df5fa95854968bdf93aeec1b13c", RobustBitConfig.DEFAULT_VALUE) ? (v) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c8c29df5fa95854968bdf93aeec1b13c") : ac.c().b(str);
    }

    @Nullable
    public static n createBluetoothManager(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a4e0444d5a2c7669b30cd7825a21a26f", RobustBitConfig.DEFAULT_VALUE) ? (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a4e0444d5a2c7669b30cd7825a21a26f") : ac.c().g(context, str);
    }

    public static o createPrivateBluetoothManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cdb06397fcbac15d2d6fd2ace3c48de7", RobustBitConfig.DEFAULT_VALUE) ? (o) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cdb06397fcbac15d2d6fd2ace3c48de7") : ac.c().a(context);
    }

    @Nullable
    public static MtBluetoothAdapter createBluetoothAdapter(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "44355b5102905e88e937b616d0d0e2b3", RobustBitConfig.DEFAULT_VALUE) ? (MtBluetoothAdapter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "44355b5102905e88e937b616d0d0e2b3") : ac.c().c(str);
    }

    public static k createPrivateBluetoothAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b66edf6521037e290abec17e7bf32d2a", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b66edf6521037e290abec17e7bf32d2a") : ac.c().a();
    }

    @Nullable
    public static l createBluetoothLeScanner(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64e4f87b65d95f8aa5980a3049fde714", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64e4f87b65d95f8aa5980a3049fde714") : ac.c().d(str);
    }

    public static m createPrivateBluetoothLeScanner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca2306f8a09f30cc202efd67e92987e9", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca2306f8a09f30cc202efd67e92987e9") : ac.c().b();
    }

    @Nullable
    public static t createContentResolver(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d477770c442d60d669050e6a68fde7ed", RobustBitConfig.DEFAULT_VALUE) ? (t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d477770c442d60d669050e6a68fde7ed") : ac.c().h(context, str);
    }

    public static MtSensorManager createSensorManager(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a265f734bc13711b533b18be065c0c6", RobustBitConfig.DEFAULT_VALUE) ? (MtSensorManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a265f734bc13711b533b18be065c0c6") : ac.c().i(context, str);
    }

    @Nullable
    public static q createCameraManager(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5af4ea630f030533d31a607548b59bd1", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5af4ea630f030533d31a607548b59bd1") : ac.c().j(context, str);
    }

    public static MtPackageManager createPackageManager(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e37225db20ebfd1b022cb0c12a692a7", RobustBitConfig.DEFAULT_VALUE) ? (MtPackageManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e37225db20ebfd1b022cb0c12a692a7") : ac.c().k(context, str);
    }

    @NonNull
    public static c createNetFilter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e5b35d3516d1b66c1e65d839dba090b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e5b35d3516d1b66c1e65d839dba090b3");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.privacy.aop.f.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "0858cdc25bc6c2f5f18172af176104e1", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "0858cdc25bc6c2f5f18172af176104e1") : com.meituan.android.privacy.impl.c.a();
    }

    public static i createActivityManager(@NonNull Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b59ec551729f3ad87ce44498b1043774", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b59ec551729f3ad87ce44498b1043774") : ac.c().l(context, str);
    }
}
