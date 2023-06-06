package com.meituan.android.common.locate.loader;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.MasterLocator;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.reporter.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class b extends a<MtLocation> implements Loader.OnLoadCompleteListener<MtLocation> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private c e;
    private MtLocationLoader f;
    private Loader.OnLoadCompleteListener<MtLocation> g;
    private LoadConfig h;

    public b(Context context, MasterLocator masterLocator, LocationStrategy locationStrategy, Looper looper) {
        super(context);
        Object[] objArr = {context, masterLocator, locationStrategy, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60422f45f149692ff05a119f4209e975", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60422f45f149692ff05a119f4209e975");
            return;
        }
        try {
            this.f = new MtLocationLoader(context, masterLocator, locationStrategy, looper);
        } catch (Exception unused) {
        }
        try {
            this.e = new c(context, masterLocator, locationStrategy, looper);
        } catch (Exception unused2) {
        }
        this.b = locationStrategy;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffedaa9da47fec7462045743994d8457", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffedaa9da47fec7462045743994d8457");
        } else {
            c();
        }
    }

    private boolean a(Context context, LoadConfig loadConfig) {
        Object[] objArr = {context, loadConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "656d61e2ee878131ad4e39c4ac6b64c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "656d61e2ee878131ad4e39c4ac6b64c1")).booleanValue();
        }
        if (loadConfig != null && TextUtils.equals("TRUE", loadConfig.get(LoadConfig.IS_TURN_ON_TENCENT_LOCATION)) && e.a(context).p()) {
            return com.meituan.android.common.locate.loader.tencent.b.a(context).a();
        }
        return false;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d67e42e06dfce4ebaa15ccb9d568c4c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d67e42e06dfce4ebaa15ccb9d568c4c8");
        } else if (this.b instanceof BaseLocationStrategy) {
            this.a = ((BaseLocationStrategy) this.b).getBusinessId();
            this.h = ((BaseLocationStrategy) this.b).getConfig();
        }
    }

    @Override // com.meituan.android.common.locate.loader.a
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f93146de4f31750ac73904d553063c9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f93146de4f31750ac73904d553063c9a");
            return;
        }
        super.a();
        if (this.f != null) {
            this.f.startLoading();
        }
        if (this.e != null) {
            this.e.startLoading();
        }
        com.meituan.android.common.locate.platform.logs.c.a("MTMIXLocationLoader::onStartLoading" + this.a, 3);
    }

    @Override // android.support.v4.content.Loader.OnLoadCompleteListener
    /* renamed from: a */
    public void onLoadComplete(@NonNull Loader<MtLocation> loader, @Nullable MtLocation mtLocation) {
        Object[] objArr = {loader, mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8bf708270386950ce8fb25ea9e14873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8bf708270386950ce8fb25ea9e14873");
        } else if (mtLocation == null || this.g == null) {
        } else {
            if (a(getContext(), this.h) && (loader instanceof c)) {
                this.g.onLoadComplete(loader, mtLocation);
                com.meituan.android.common.locate.platform.logs.c.a("MTMixLocationLoader::onLoadComplete_tencent" + this.a, 3);
            } else if (a(getContext(), this.h) || (loader instanceof c)) {
            } else {
                this.g.onLoadComplete(loader, mtLocation);
                com.meituan.android.common.locate.platform.logs.c.a("MTMixLocationLoader::onLoadComplete_meituan" + this.a, 3);
            }
        }
    }

    @Override // com.meituan.android.common.locate.loader.a
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a30605614cab3e28c5ee8bbeebfc2efc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a30605614cab3e28c5ee8bbeebfc2efc");
            return;
        }
        super.b();
        if (this.f != null) {
            this.f.stopLoading();
        }
        if (this.e != null) {
            this.e.stopLoading();
        }
        com.meituan.android.common.locate.platform.logs.c.a("MTMixLocationLoader::onStopLoading" + this.a, 3);
    }

    @Override // android.support.v4.content.Loader
    public void registerListener(int i, @NonNull Loader.OnLoadCompleteListener<MtLocation> onLoadCompleteListener) {
        Object[] objArr = {Integer.valueOf(i), onLoadCompleteListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38505f17f3c6eba40b9d5f7e4d4a8e85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38505f17f3c6eba40b9d5f7e4d4a8e85");
            return;
        }
        this.g = onLoadCompleteListener;
        if (this.f != null) {
            this.f.registerListener(i, this);
        }
        if (this.e != null) {
            this.e.registerListener(i, this);
        }
    }

    @Override // android.support.v4.content.Loader
    public void unregisterListener(@NonNull Loader.OnLoadCompleteListener<MtLocation> onLoadCompleteListener) {
        Object[] objArr = {onLoadCompleteListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c52df0798f92a5167817879475683f83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c52df0798f92a5167817879475683f83");
            return;
        }
        if (this.f != null) {
            this.f.unregisterListener(this);
        }
        if (this.e != null) {
            this.e.unregisterListener(this);
        }
        this.g = null;
    }
}
