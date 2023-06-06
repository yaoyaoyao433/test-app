package com.meituan.android.privacy.interfaces.def;

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

    public q(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79359c688bc4601893c6702ae3e1dad9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79359c688bc4601893c6702ae3e1dad9");
        } else if (context != null) {
            this.b = context.getPackageManager();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.MtPackageManager
    @Nullable
    public final Intent getLaunchIntentForPackage(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa1dc203c82b38dcc2d86358cb2740b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa1dc203c82b38dcc2d86358cb2740b");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getLaunchIntentForPackage(str);
    }

    @Override // com.meituan.android.privacy.interfaces.MtPackageManager
    @NonNull
    public final List<PackageInfo> getInstalledPackages(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "517ce3ffbb2e9839246ab224bb59e273", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "517ce3ffbb2e9839246ab224bb59e273") : Collections.emptyList();
    }

    @Override // com.meituan.android.privacy.interfaces.MtPackageManager
    @NonNull
    public final List<ApplicationInfo> getInstalledApplications(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "239f1e241616a49c72a378d0d4335676", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "239f1e241616a49c72a378d0d4335676") : Collections.emptyList();
    }

    @Override // com.meituan.android.privacy.interfaces.MtPackageManager
    @NonNull
    public final List<ResolveInfo> queryIntentActivities(@NonNull Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc9a00fc77b1bb6cf6246d0eb9aca85b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc9a00fc77b1bb6cf6246d0eb9aca85b") : this.b == null ? Collections.emptyList() : this.b.queryIntentActivities(intent, i);
    }

    @Override // com.meituan.android.privacy.interfaces.MtPackageManager
    @NonNull
    public final List<ResolveInfo> queryIntentActivityOptions(@Nullable ComponentName componentName, @Nullable Intent[] intentArr, @NonNull Intent intent, int i) {
        Object[] objArr = {componentName, intentArr, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f3d400b2f53aa1748d025477d1abaab", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f3d400b2f53aa1748d025477d1abaab") : this.b == null ? Collections.emptyList() : this.b.queryIntentActivityOptions(componentName, intentArr, intent, i);
    }
}
