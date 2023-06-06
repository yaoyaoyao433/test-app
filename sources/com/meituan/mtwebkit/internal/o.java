package com.meituan.mtwebkit.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ChangedPackages;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.ModuleInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.VersionedPackage;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.UserHandle;
import android.support.annotation.RequiresApi;
import com.meituan.mtwebkit.internal.process.MultiProcessManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o extends PackageManager {
    public static ChangeQuickRedirect a;
    private PackageManager b;
    private PackageInfo c;
    private Context d;

    @Override // android.content.pm.PackageManager
    public final String getInstallerPackageName(String str) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final Intent getLaunchIntentForPackage(String str) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final ResolveInfo resolveActivity(Intent intent, int i) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final ProviderInfo resolveContentProvider(String str, int i) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final ResolveInfo resolveService(Intent intent, int i) {
        return null;
    }

    public o(Context context, PackageInfo packageInfo) {
        Object[] objArr = {context, packageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f5f061a8f8ef88ffe232c18e0e6cfc2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f5f061a8f8ef88ffe232c18e0e6cfc2");
            return;
        }
        this.d = context;
        this.c = packageInfo;
        this.b = context.getPackageManager();
    }

    @Override // android.content.pm.PackageManager
    public final PackageInfo getPackageInfo(String str, int i) throws PackageManager.NameNotFoundException {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf899b8a7af24937d2240f4c125eed76", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf899b8a7af24937d2240f4c125eed76");
        }
        if (this.c != null && this.c.packageName != null && this.c.packageName.equals(str)) {
            return this.c;
        }
        return this.b.getPackageInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final ApplicationInfo getApplicationInfo(String str, int i) throws PackageManager.NameNotFoundException {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f23d270c82ee2d93d38247cceef0803d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApplicationInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f23d270c82ee2d93d38247cceef0803d");
        }
        if (this.c != null && this.c.packageName != null && this.c.packageName.equals(str)) {
            return this.c.applicationInfo;
        }
        return this.b.getApplicationInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final ServiceInfo getServiceInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        Object[] objArr = {componentName, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81ec46ac8889646df102b175cc740519", RobustBitConfig.DEFAULT_VALUE)) {
            return (ServiceInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81ec46ac8889646df102b175cc740519");
        }
        int a2 = MultiProcessManager.a(componentName);
        PackageManager packageManager = this.b;
        if (a2 != -1) {
            componentName = MultiProcessManager.a(a2);
        }
        return packageManager.getServiceInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public final PackageInfo getPackageInfo(VersionedPackage versionedPackage, int i) throws PackageManager.NameNotFoundException {
        Object[] objArr = {versionedPackage, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "734541a444d4ca00f573d2fb6ebd262c", RobustBitConfig.DEFAULT_VALUE) ? (PackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "734541a444d4ca00f573d2fb6ebd262c") : this.b.getPackageInfo(versionedPackage, i);
    }

    @Override // android.content.pm.PackageManager
    public final String[] currentToCanonicalPackageNames(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e68b2b17e4aa4d72aced267d76aa2bac", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e68b2b17e4aa4d72aced267d76aa2bac") : this.b.currentToCanonicalPackageNames(strArr);
    }

    @Override // android.content.pm.PackageManager
    public final String[] canonicalToCurrentPackageNames(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b385dd6577943408fb11ef948bc15ea0", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b385dd6577943408fb11ef948bc15ea0") : this.b.canonicalToCurrentPackageNames(strArr);
    }

    @Override // android.content.pm.PackageManager
    public final Intent getLeanbackLaunchIntentForPackage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "891e29f2133aa431d5db2adbf6d9f3d3", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "891e29f2133aa431d5db2adbf6d9f3d3") : this.b.getLeanbackLaunchIntentForPackage(str);
    }

    @Override // android.content.pm.PackageManager
    public final int[] getPackageGids(String str) throws PackageManager.NameNotFoundException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54f77c45eae3392ece1c72ed060ef904", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54f77c45eae3392ece1c72ed060ef904") : this.b.getPackageGids(str);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 24)
    public final int[] getPackageGids(String str, int i) throws PackageManager.NameNotFoundException {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ef222e7407d8f59159e7616359d3af2", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ef222e7407d8f59159e7616359d3af2") : this.b.getPackageGids(str, i);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 24)
    public final int getPackageUid(String str, int i) throws PackageManager.NameNotFoundException {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14b7982885a664cef09d727ae772f412", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14b7982885a664cef09d727ae772f412")).intValue() : this.b.getPackageUid(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final PermissionInfo getPermissionInfo(String str, int i) throws PackageManager.NameNotFoundException {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dc0d22aaebacb57b43b92b30e4b73e5", RobustBitConfig.DEFAULT_VALUE) ? (PermissionInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dc0d22aaebacb57b43b92b30e4b73e5") : this.b.getPermissionInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final List<PermissionInfo> queryPermissionsByGroup(String str, int i) throws PackageManager.NameNotFoundException {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f673e896d14d205e5fa96614b0b6ee77", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f673e896d14d205e5fa96614b0b6ee77") : this.b.queryPermissionsByGroup(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final PermissionGroupInfo getPermissionGroupInfo(String str, int i) throws PackageManager.NameNotFoundException {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0937f0a1a4217ba7471664fbdf7cab22", RobustBitConfig.DEFAULT_VALUE) ? (PermissionGroupInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0937f0a1a4217ba7471664fbdf7cab22") : this.b.getPermissionGroupInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final List<PermissionGroupInfo> getAllPermissionGroups(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "934658f1c4f48ad2b6fa195d7f5bff9d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "934658f1c4f48ad2b6fa195d7f5bff9d") : this.b.getAllPermissionGroups(i);
    }

    @Override // android.content.pm.PackageManager
    public final ActivityInfo getActivityInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        Object[] objArr = {componentName, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13bf731b5a5f6606585cbefa9dcd2773", RobustBitConfig.DEFAULT_VALUE) ? (ActivityInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13bf731b5a5f6606585cbefa9dcd2773") : this.b.getActivityInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final ActivityInfo getReceiverInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        Object[] objArr = {componentName, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ef9ea98ddb199b9a4b8e113542e2fd8", RobustBitConfig.DEFAULT_VALUE) ? (ActivityInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ef9ea98ddb199b9a4b8e113542e2fd8") : this.b.getReceiverInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final ProviderInfo getProviderInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        Object[] objArr = {componentName, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28f7c7f985e7308585c040761073d90e", RobustBitConfig.DEFAULT_VALUE) ? (ProviderInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28f7c7f985e7308585c040761073d90e") : this.b.getProviderInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 29)
    public final ModuleInfo getModuleInfo(String str, int i) throws PackageManager.NameNotFoundException {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a5dfc5bb20fe6566ddbc8194c6f7cf7", RobustBitConfig.DEFAULT_VALUE) ? (ModuleInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a5dfc5bb20fe6566ddbc8194c6f7cf7") : this.b.getModuleInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 29)
    public final List<ModuleInfo> getInstalledModules(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea7e7816380966f21eef42f625cbe005", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea7e7816380966f21eef42f625cbe005") : Collections.emptyList();
    }

    @Override // android.content.pm.PackageManager
    public final List<PackageInfo> getInstalledPackages(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86b4ac413ddb756dc855d11f1e95edb4", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86b4ac413ddb756dc855d11f1e95edb4") : Collections.emptyList();
    }

    @Override // android.content.pm.PackageManager
    public final List<PackageInfo> getPackagesHoldingPermissions(String[] strArr, int i) {
        Object[] objArr = {strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7155956d746eaec0b73f790ac9710481", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7155956d746eaec0b73f790ac9710481") : this.b.getPackagesHoldingPermissions(strArr, i);
    }

    @Override // android.content.pm.PackageManager
    public final int checkPermission(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbed1389381403d82feb02de68b45284", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbed1389381403d82feb02de68b45284")).intValue() : this.b.checkPermission(str, str2);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 23)
    public final boolean isPermissionRevokedByPolicy(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "452e41c2c206739752525632caa942cd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "452e41c2c206739752525632caa942cd")).booleanValue() : this.b.isPermissionRevokedByPolicy(str, str2);
    }

    @Override // android.content.pm.PackageManager
    public final boolean addPermission(PermissionInfo permissionInfo) {
        Object[] objArr = {permissionInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "296f6782599492ab1854cfc25b94933e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "296f6782599492ab1854cfc25b94933e")).booleanValue() : this.b.addPermission(permissionInfo);
    }

    @Override // android.content.pm.PackageManager
    public final boolean addPermissionAsync(PermissionInfo permissionInfo) {
        Object[] objArr = {permissionInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d91196707736772b888b6af88f677ef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d91196707736772b888b6af88f677ef")).booleanValue() : this.b.addPermissionAsync(permissionInfo);
    }

    @Override // android.content.pm.PackageManager
    public final void removePermission(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d69ded0efa83333253669077f4fad4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d69ded0efa83333253669077f4fad4");
        } else {
            this.b.removePermission(str);
        }
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 29)
    public final Set<String> getWhitelistedRestrictedPermissions(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a44315578a2a3d70f64028217ba01536", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a44315578a2a3d70f64028217ba01536") : this.b.getWhitelistedRestrictedPermissions(str, i);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 29)
    public final boolean addWhitelistedRestrictedPermission(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3643baadf78084840401f69bf6ecb7a7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3643baadf78084840401f69bf6ecb7a7")).booleanValue() : this.b.addWhitelistedRestrictedPermission(str, str2, i);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 29)
    public final boolean removeWhitelistedRestrictedPermission(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84cc86980964f04eb436cb6489fcd47e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84cc86980964f04eb436cb6489fcd47e")).booleanValue() : this.b.removeWhitelistedRestrictedPermission(str, str2, i);
    }

    @Override // android.content.pm.PackageManager
    public final int checkSignatures(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76f12a017dc2e2658b8ccc2cc7ff5e41", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76f12a017dc2e2658b8ccc2cc7ff5e41")).intValue() : this.b.checkSignatures(str, str2);
    }

    @Override // android.content.pm.PackageManager
    public final int checkSignatures(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0bffc88540b9889bdf3667109e00a20", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0bffc88540b9889bdf3667109e00a20")).intValue() : this.b.checkSignatures(i, i2);
    }

    @Override // android.content.pm.PackageManager
    public final String[] getPackagesForUid(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63cd6ea41293afa05c74aaa4e444a665", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63cd6ea41293afa05c74aaa4e444a665") : this.b.getPackagesForUid(i);
    }

    @Override // android.content.pm.PackageManager
    public final String getNameForUid(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9121c8607799d2ba3acb81082d806037", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9121c8607799d2ba3acb81082d806037") : this.b.getNameForUid(i);
    }

    @Override // android.content.pm.PackageManager
    public final List<ApplicationInfo> getInstalledApplications(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a074f457f3a3ba1166500b165cc733", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a074f457f3a3ba1166500b165cc733") : Collections.emptyList();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public final boolean isInstantApp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7a204436b9fec3b0afeb306d220f117", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7a204436b9fec3b0afeb306d220f117")).booleanValue() : this.b.isInstantApp();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public final boolean isInstantApp(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51a599f8e19b4795be9a83f7ecb3c41", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51a599f8e19b4795be9a83f7ecb3c41")).booleanValue() : this.b.isInstantApp(str);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public final int getInstantAppCookieMaxBytes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b407d3bc773fd67b739ee043dbea13f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b407d3bc773fd67b739ee043dbea13f")).intValue() : this.b.getInstantAppCookieMaxBytes();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public final byte[] getInstantAppCookie() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6934c7f40255dc3253b00238a002ac0", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6934c7f40255dc3253b00238a002ac0") : this.b.getInstantAppCookie();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public final void clearInstantAppCookie() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7bc5fbd8aedc1c967b5ca158aaa1626", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7bc5fbd8aedc1c967b5ca158aaa1626");
        } else {
            this.b.clearInstantAppCookie();
        }
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public final void updateInstantAppCookie(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2ae7056647b6055bd48e0d7fe71de1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2ae7056647b6055bd48e0d7fe71de1d");
        } else {
            this.b.updateInstantAppCookie(bArr);
        }
    }

    @Override // android.content.pm.PackageManager
    public final String[] getSystemSharedLibraryNames() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ce00b04e6c473c693273de1d867275", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ce00b04e6c473c693273de1d867275") : this.b.getSystemSharedLibraryNames();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public final List<SharedLibraryInfo> getSharedLibraries(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39507d05a5fec00290dff1ba4d6dbdec", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39507d05a5fec00290dff1ba4d6dbdec") : this.b.getSharedLibraries(i);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public final ChangedPackages getChangedPackages(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2ffa94b07ca0d49fe407552f7f8da45", RobustBitConfig.DEFAULT_VALUE) ? (ChangedPackages) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2ffa94b07ca0d49fe407552f7f8da45") : this.b.getChangedPackages(i);
    }

    @Override // android.content.pm.PackageManager
    public final FeatureInfo[] getSystemAvailableFeatures() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0b8c1ceeeb746d74036f90ec520721d", RobustBitConfig.DEFAULT_VALUE) ? (FeatureInfo[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0b8c1ceeeb746d74036f90ec520721d") : this.b.getSystemAvailableFeatures();
    }

    @Override // android.content.pm.PackageManager
    public final boolean hasSystemFeature(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d78e6bbd0eea3a8d97ef235fb7f49f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d78e6bbd0eea3a8d97ef235fb7f49f")).booleanValue() : this.b.hasSystemFeature(str);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 24)
    public final boolean hasSystemFeature(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "369786a59b082948e1ed5f58ff90c919", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "369786a59b082948e1ed5f58ff90c919")).booleanValue() : this.b.hasSystemFeature(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final List<ResolveInfo> queryIntentActivities(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fc52571cfc3a9abc8b0f82558c07518", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fc52571cfc3a9abc8b0f82558c07518") : Collections.emptyList();
    }

    @Override // android.content.pm.PackageManager
    public final List<ResolveInfo> queryIntentActivityOptions(ComponentName componentName, Intent[] intentArr, Intent intent, int i) {
        Object[] objArr = {componentName, intentArr, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e252a6f2e9aa2330841caac4f572d9b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e252a6f2e9aa2330841caac4f572d9b") : Collections.emptyList();
    }

    @Override // android.content.pm.PackageManager
    public final List<ResolveInfo> queryBroadcastReceivers(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c32db82c29435815b6e5c44a05f76c8b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c32db82c29435815b6e5c44a05f76c8b") : Collections.emptyList();
    }

    @Override // android.content.pm.PackageManager
    public final List<ResolveInfo> queryIntentServices(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eaae36c29ac4ec154f43df17bb98e55", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eaae36c29ac4ec154f43df17bb98e55") : Collections.emptyList();
    }

    @Override // android.content.pm.PackageManager
    public final List<ResolveInfo> queryIntentContentProviders(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e2030018dbb6a965ccf16b61c3cf8cc", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e2030018dbb6a965ccf16b61c3cf8cc") : Collections.emptyList();
    }

    @Override // android.content.pm.PackageManager
    public final List<ProviderInfo> queryContentProviders(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "502315e8038c3852df3db440c91c083e", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "502315e8038c3852df3db440c91c083e") : Collections.emptyList();
    }

    @Override // android.content.pm.PackageManager
    public final InstrumentationInfo getInstrumentationInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        Object[] objArr = {componentName, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5949bf4da769ae75ca0dc7aa51b48c7e", RobustBitConfig.DEFAULT_VALUE) ? (InstrumentationInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5949bf4da769ae75ca0dc7aa51b48c7e") : this.b.getInstrumentationInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    public final List<InstrumentationInfo> queryInstrumentation(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b097a8bce79eb955f8d654ea66d901cd", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b097a8bce79eb955f8d654ea66d901cd") : this.b.queryInstrumentation(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getDrawable(String str, int i, ApplicationInfo applicationInfo) {
        Object[] objArr = {str, Integer.valueOf(i), applicationInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "595432c92a9b7de13a3cbb75994eae4c", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "595432c92a9b7de13a3cbb75994eae4c") : this.b.getDrawable(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityIcon(ComponentName componentName) throws PackageManager.NameNotFoundException {
        Object[] objArr = {componentName};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1216617990d6fff9e7c1f05bf7f9b26e", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1216617990d6fff9e7c1f05bf7f9b26e") : this.b.getActivityIcon(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityIcon(Intent intent) throws PackageManager.NameNotFoundException {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9f25d13b71c35087f328df31f64fde7", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9f25d13b71c35087f328df31f64fde7") : this.b.getActivityIcon(intent);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityBanner(ComponentName componentName) throws PackageManager.NameNotFoundException {
        Object[] objArr = {componentName};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b393ff88b7bc88764889918b711483d7", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b393ff88b7bc88764889918b711483d7") : this.b.getActivityBanner(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityBanner(Intent intent) throws PackageManager.NameNotFoundException {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e078e419918d6df68066d7a934430f82", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e078e419918d6df68066d7a934430f82") : this.b.getActivityBanner(intent);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getDefaultActivityIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36c56cb065f65ccd23be2207ca34d119", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36c56cb065f65ccd23be2207ca34d119") : this.b.getDefaultActivityIcon();
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationIcon(ApplicationInfo applicationInfo) {
        Object[] objArr = {applicationInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f9abf90d16e87c7b29cf53b49ca5f97", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f9abf90d16e87c7b29cf53b49ca5f97") : this.b.getApplicationIcon(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationIcon(String str) throws PackageManager.NameNotFoundException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae536fd2c649f86dbdcaefc9b9ee2d9", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae536fd2c649f86dbdcaefc9b9ee2d9") : this.b.getApplicationIcon(str);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationBanner(ApplicationInfo applicationInfo) {
        Object[] objArr = {applicationInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57c49daeb099c50a7cf33ebf7be89977", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57c49daeb099c50a7cf33ebf7be89977") : this.b.getApplicationBanner(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationBanner(String str) throws PackageManager.NameNotFoundException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8815a5879977849d77e4978c0fa7627a", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8815a5879977849d77e4978c0fa7627a") : this.b.getApplicationBanner(str);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityLogo(ComponentName componentName) throws PackageManager.NameNotFoundException {
        Object[] objArr = {componentName};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93db5a7ce8872f7bb9cd3974b69e59ab", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93db5a7ce8872f7bb9cd3974b69e59ab") : this.b.getActivityLogo(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityLogo(Intent intent) throws PackageManager.NameNotFoundException {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c80fc69b0ef721fd6dc6790075e45b23", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c80fc69b0ef721fd6dc6790075e45b23") : this.b.getActivityLogo(intent);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationLogo(ApplicationInfo applicationInfo) {
        Object[] objArr = {applicationInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bb6feca9562fe91021efe874b549a18", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bb6feca9562fe91021efe874b549a18") : this.b.getApplicationLogo(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationLogo(String str) throws PackageManager.NameNotFoundException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1faacf32174501e123c135b4c1460abf", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1faacf32174501e123c135b4c1460abf") : this.b.getApplicationLogo(str);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getUserBadgedIcon(Drawable drawable, UserHandle userHandle) {
        Object[] objArr = {drawable, userHandle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5861273b2905857a7e965a8914e06aba", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5861273b2905857a7e965a8914e06aba") : this.b.getUserBadgedIcon(drawable, userHandle);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle userHandle, Rect rect, int i) {
        Object[] objArr = {drawable, userHandle, rect, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4f41c0a49fa17ee4d38c76c6e728bc8", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4f41c0a49fa17ee4d38c76c6e728bc8") : this.b.getUserBadgedDrawableForDensity(drawable, userHandle, rect, i);
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getUserBadgedLabel(CharSequence charSequence, UserHandle userHandle) {
        Object[] objArr = {charSequence, userHandle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e3a851c03e89e2cafca44cc6bf1c00b", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e3a851c03e89e2cafca44cc6bf1c00b") : this.b.getUserBadgedLabel(charSequence, userHandle);
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getText(String str, int i, ApplicationInfo applicationInfo) {
        Object[] objArr = {str, Integer.valueOf(i), applicationInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff28fdd5aadcc8a19c9352b63ed67006", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff28fdd5aadcc8a19c9352b63ed67006") : this.b.getText(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final XmlResourceParser getXml(String str, int i, ApplicationInfo applicationInfo) {
        Object[] objArr = {str, Integer.valueOf(i), applicationInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d31d7eadf82727a8eb9d722c1c36b6e", RobustBitConfig.DEFAULT_VALUE) ? (XmlResourceParser) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d31d7eadf82727a8eb9d722c1c36b6e") : this.b.getXml(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getApplicationLabel(ApplicationInfo applicationInfo) {
        Object[] objArr = {applicationInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8112b207d0bd2748715dccfc973c3226", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8112b207d0bd2748715dccfc973c3226") : this.b.getApplicationLabel(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForActivity(ComponentName componentName) throws PackageManager.NameNotFoundException {
        Object[] objArr = {componentName};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d16b1e6be18bdd18c44923562f866828", RobustBitConfig.DEFAULT_VALUE) ? (Resources) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d16b1e6be18bdd18c44923562f866828") : this.b.getResourcesForActivity(componentName);
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForApplication(ApplicationInfo applicationInfo) throws PackageManager.NameNotFoundException {
        Object[] objArr = {applicationInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3d578d060ce3399f5ff7caf2c8df594", RobustBitConfig.DEFAULT_VALUE)) {
            return (Resources) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3d578d060ce3399f5ff7caf2c8df594");
        }
        throw new PackageManager.NameNotFoundException();
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForApplication(String str) throws PackageManager.NameNotFoundException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5877653098abb0ef4985384df01bab93", RobustBitConfig.DEFAULT_VALUE)) {
            return (Resources) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5877653098abb0ef4985384df01bab93");
        }
        throw new PackageManager.NameNotFoundException(str);
    }

    @Override // android.content.pm.PackageManager
    public final PackageInfo getPackageArchiveInfo(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50956b54c25f4765056484a695ad1f6c", RobustBitConfig.DEFAULT_VALUE) ? (PackageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50956b54c25f4765056484a695ad1f6c") : this.b.getPackageArchiveInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public final void verifyPendingInstall(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e25b74dce01fa41ce63f888bb4ee1615", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e25b74dce01fa41ce63f888bb4ee1615");
        } else {
            this.b.verifyPendingInstall(i, i2);
        }
    }

    @Override // android.content.pm.PackageManager
    public final void extendVerificationTimeout(int i, int i2, long j) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "417ef7481b698ab47270dce7785d1003", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "417ef7481b698ab47270dce7785d1003");
        } else {
            this.b.extendVerificationTimeout(i, i2, j);
        }
    }

    @Override // android.content.pm.PackageManager
    public final void setInstallerPackageName(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a18473ca46d99aa83b0d6cd702f54117", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a18473ca46d99aa83b0d6cd702f54117");
        } else {
            this.b.setInstallerPackageName(str, str2);
        }
    }

    @Override // android.content.pm.PackageManager
    @Deprecated
    public final void addPackageToPreferred(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f12e274408838e1d80c327fc0a391d3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f12e274408838e1d80c327fc0a391d3a");
        } else {
            this.b.addPackageToPreferred(str);
        }
    }

    @Override // android.content.pm.PackageManager
    @Deprecated
    public final void removePackageFromPreferred(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "990322101cf19cb3b48cdb8ca2822998", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "990322101cf19cb3b48cdb8ca2822998");
        } else {
            this.b.removePackageFromPreferred(str);
        }
    }

    @Override // android.content.pm.PackageManager
    @Deprecated
    public final List<PackageInfo> getPreferredPackages(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a49b91804c2bcda32e872de9e828fc11", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a49b91804c2bcda32e872de9e828fc11") : this.b.getPreferredPackages(i);
    }

    @Override // android.content.pm.PackageManager
    @Deprecated
    public final void addPreferredActivity(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName) {
        Object[] objArr = {intentFilter, Integer.valueOf(i), componentNameArr, componentName};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de005db666a2092e81164169caac3aa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de005db666a2092e81164169caac3aa5");
        } else {
            this.b.addPreferredActivity(intentFilter, i, componentNameArr, componentName);
        }
    }

    @Override // android.content.pm.PackageManager
    @Deprecated
    public final void clearPackagePreferredActivities(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a2b266f1f22f72ecdf872606c598b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a2b266f1f22f72ecdf872606c598b8");
        } else {
            this.b.clearPackagePreferredActivities(str);
        }
    }

    @Override // android.content.pm.PackageManager
    @Deprecated
    public final int getPreferredActivities(List<IntentFilter> list, List<ComponentName> list2, String str) {
        Object[] objArr = {list, list2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f995bcd96cb36b8381560f4aa68b9896", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f995bcd96cb36b8381560f4aa68b9896")).intValue() : this.b.getPreferredActivities(list, list2, str);
    }

    @Override // android.content.pm.PackageManager
    public final void setComponentEnabledSetting(ComponentName componentName, int i, int i2) {
        Object[] objArr = {componentName, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "808b82a3add59257ded628b6dbaeab35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "808b82a3add59257ded628b6dbaeab35");
        } else {
            this.b.setComponentEnabledSetting(componentName, i, i2);
        }
    }

    @Override // android.content.pm.PackageManager
    public final int getComponentEnabledSetting(ComponentName componentName) {
        Object[] objArr = {componentName};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6df404f5192c075fab2945619b8267e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6df404f5192c075fab2945619b8267e")).intValue();
        }
        if (this.d.getPackageName().equals(componentName.getPackageName())) {
            return this.b.getComponentEnabledSetting(componentName);
        }
        return 2;
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 29)
    public final boolean getSyntheticAppDetailsActivityEnabled(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c11f38968c45dbdbfded4a364788106b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c11f38968c45dbdbfded4a364788106b")).booleanValue() : this.b.getSyntheticAppDetailsActivityEnabled(str);
    }

    @Override // android.content.pm.PackageManager
    public final void setApplicationEnabledSetting(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3bad8e34553558c467307fe35b50632", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3bad8e34553558c467307fe35b50632");
        } else {
            this.b.setApplicationEnabledSetting(str, i, i2);
        }
    }

    @Override // android.content.pm.PackageManager
    public final int getApplicationEnabledSetting(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2364a2c9d0da5f53805f80ca5402d9a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2364a2c9d0da5f53805f80ca5402d9a")).intValue() : this.b.getApplicationEnabledSetting(str);
    }

    @Override // android.content.pm.PackageManager
    public final boolean isSafeMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83da06d4525cdb9b62f799a768c0b514", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83da06d4525cdb9b62f799a768c0b514")).booleanValue() : this.b.isSafeMode();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 29)
    public final boolean isPackageSuspended(String str) throws PackageManager.NameNotFoundException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ace0518f730c355d9391e6f5f4f51468", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ace0518f730c355d9391e6f5f4f51468")).booleanValue() : this.b.isPackageSuspended(str);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 28)
    public final boolean isPackageSuspended() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e745c1c3aa57ec7061b4185ba101860", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e745c1c3aa57ec7061b4185ba101860")).booleanValue() : this.b.isPackageSuspended();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 28)
    public final Bundle getSuspendedPackageAppExtras() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d352dc48bce579dbbf33b48da82294b3", RobustBitConfig.DEFAULT_VALUE) ? (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d352dc48bce579dbbf33b48da82294b3") : this.b.getSuspendedPackageAppExtras();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public final void setApplicationCategoryHint(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddaf005a8c55d1b6738c1dc0e92e9950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddaf005a8c55d1b6738c1dc0e92e9950");
        } else {
            this.b.setApplicationCategoryHint(str, i);
        }
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 29)
    public final boolean isDeviceUpgrading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5fe48868adac60de3de4703a9316b59", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5fe48868adac60de3de4703a9316b59")).booleanValue() : this.b.isDeviceUpgrading();
    }

    @Override // android.content.pm.PackageManager
    public final PackageInstaller getPackageInstaller() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2b790fc7362ae9947e6cb097a2b9859", RobustBitConfig.DEFAULT_VALUE) ? (PackageInstaller) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2b790fc7362ae9947e6cb097a2b9859") : this.b.getPackageInstaller();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public final boolean canRequestPackageInstalls() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "240300868dcc15403da7348866547c29", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "240300868dcc15403da7348866547c29")).booleanValue() : this.b.canRequestPackageInstalls();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 28)
    public final boolean hasSigningCertificate(String str, byte[] bArr, int i) {
        Object[] objArr = {str, bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39899ff0acc135313f2ae104a3a5f198", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39899ff0acc135313f2ae104a3a5f198")).booleanValue() : this.b.hasSigningCertificate(str, bArr, i);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 28)
    public final boolean hasSigningCertificate(int i, byte[] bArr, int i2) {
        Object[] objArr = {Integer.valueOf(i), bArr, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23c0dbd9b46816fc2078075e46df4ac0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23c0dbd9b46816fc2078075e46df4ac0")).booleanValue() : this.b.hasSigningCertificate(i, bArr, i2);
    }
}
