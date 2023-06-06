package com.sankuai.waimai.platform.preload;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    private boolean b;
    private final WeakHashMap<Activity, f<?>> c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.preload.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1076a {
        public static a a = new a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull @NotNull Activity activity, @Nullable @org.jetbrains.annotations.Nullable Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "289c4ccd28c01c2e848be6d294e7324e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "289c4ccd28c01c2e848be6d294e7324e");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull @NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull @NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull @NotNull Activity activity, @NonNull @NotNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull @NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull @NotNull Activity activity) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d676414467c4d25faf918a9c27e882a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d676414467c4d25faf918a9c27e882a");
            return;
        }
        this.b = false;
        this.c = new WeakHashMap<>();
    }

    @MainThread
    public static <T> void a(Activity activity, f<?> fVar) {
        Object[] objArr = {activity, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "642006202cebcd43df3dcd563c3cae9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "642006202cebcd43df3dcd563c3cae9b");
            return;
        }
        a aVar = C1076a.a;
        Object[] objArr2 = {activity, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ed9ecd6ab9303e9bdfe312750e07dc5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ed9ecd6ab9303e9bdfe312750e07dc5f");
            return;
        }
        Application application = activity.getApplication();
        Object[] objArr3 = {application};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "ef598ce319f59aa3e236bbf418db7167", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "ef598ce319f59aa3e236bbf418db7167");
        } else if (!aVar.b) {
            application.registerActivityLifecycleCallbacks(aVar);
            aVar.b = true;
        }
        aVar.c.put(activity, fVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull @NotNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9933a4a93784b342d20517528df66aea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9933a4a93784b342d20517528df66aea");
            return;
        }
        f<?> remove = this.c.remove(activity);
        if (remove != null) {
            remove.f = null;
        }
    }
}
