package com.meituan.android.privacy.proxy;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.privacy.interfaces.MtPackageManager;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.proxy.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q implements MtPackageManager {
    public static ChangeQuickRedirect a;
    private PackageManager b;
    private u c;
    private String d;

    public q(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b0bb692aef3c4bd0782ce740d3585f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b0bb692aef3c4bd0782ce740d3585f4");
            return;
        }
        this.c = new u();
        if (context != null) {
            this.b = context.getApplicationContext().getPackageManager();
        }
        this.d = str;
    }

    @Override // com.meituan.android.privacy.interfaces.MtPackageManager
    @Nullable
    public final Intent getLaunchIntentForPackage(@NonNull final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d445cae8e0807a05a67fe32e6a87bb21", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d445cae8e0807a05a67fe32e6a87bb21") : (Intent) this.c.a("pm.gLIFPackage", this.d, new String[]{PermissionGuard.PERMISSION_AL}, new u.a<Intent>() { // from class: com.meituan.android.privacy.proxy.q.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Intent a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd0fe08661d0656f0665de3236c41763", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd0fe08661d0656f0665de3236c41763") : q.this.b.getLaunchIntentForPackage(str);
            }
        });
    }

    @Override // com.meituan.android.privacy.interfaces.MtPackageManager
    @NonNull
    public final List<PackageInfo> getInstalledPackages(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02d6bf603f87e8c9a73620facd81070d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02d6bf603f87e8c9a73620facd81070d") : Collections.emptyList();
    }

    @Override // com.meituan.android.privacy.interfaces.MtPackageManager
    @NonNull
    public final List<ApplicationInfo> getInstalledApplications(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a175b2b21d9aac9c0e29188260218ecd", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a175b2b21d9aac9c0e29188260218ecd") : Collections.emptyList();
    }

    @Override // com.meituan.android.privacy.interfaces.MtPackageManager
    @NonNull
    public final List<ResolveInfo> queryIntentActivities(@NonNull final Intent intent, final int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5552d56450bbe2888f8bfc141b94013", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5552d56450bbe2888f8bfc141b94013") : (List) this.c.a("pm.qIActivities", this.d, new String[]{PermissionGuard.PERMISSION_AL}, new u.a<List<ResolveInfo>>() { // from class: com.meituan.android.privacy.proxy.q.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ List<ResolveInfo> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c9cfb3bf0ef5c6ef086ada001b57730", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c9cfb3bf0ef5c6ef086ada001b57730") : q.this.b.queryIntentActivities(intent, i);
            }
        });
    }

    @Override // com.meituan.android.privacy.interfaces.MtPackageManager
    @NonNull
    public final List<ResolveInfo> queryIntentActivityOptions(@Nullable final ComponentName componentName, @Nullable final Intent[] intentArr, @NonNull final Intent intent, final int i) {
        Object[] objArr = {componentName, intentArr, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f554d3dd7ce2d35edf5f62ff5d11310", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f554d3dd7ce2d35edf5f62ff5d11310") : (List) this.c.a("pm.qIAOptions", this.d, new String[]{PermissionGuard.PERMISSION_AL}, new u.a<List<ResolveInfo>>() { // from class: com.meituan.android.privacy.proxy.q.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ List<ResolveInfo> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36818c9ec0b2972fc28b0f2e01005a18", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36818c9ec0b2972fc28b0f2e01005a18") : q.this.b.queryIntentActivityOptions(componentName, intentArr, intent, i);
            }
        });
    }
}
