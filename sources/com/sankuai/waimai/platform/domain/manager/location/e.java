package com.sankuai.waimai.platform.domain.manager.location;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.Loader;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.loader.LoadConfigImpl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.model.MtLocationConfig;
import com.sankuai.waimai.foundation.location.v2.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.platform.domain.manager.location.locatesdk.b {
    public static ChangeQuickRedirect a;
    private static Looper e;
    public k b;
    private final String d;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2c19b532047bf538a9b8734882f8c67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2c19b532047bf538a9b8734882f8c67");
        } else {
            this.d = "e7DHqN4tsOAfS9U9rPZv9pPVRbsMU7kO";
        }
    }

    public final Loader<MtLocation> a(Context context, MtLocationConfig mtLocationConfig) {
        Object[] objArr = {context, mtLocationConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8308f2b566f02d438ab5cfe22ad7b906", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8308f2b566f02d438ab5cfe22ad7b906");
        }
        LoadConfigImpl loadConfigImpl = new LoadConfigImpl();
        LocationLoaderFactory.LoadStrategy loadStrategy = LocationLoaderFactory.LoadStrategy.instant;
        if (mtLocationConfig != null) {
            loadConfigImpl.set(LoadConfig.LOCATION_TIMEOUT, String.valueOf(mtLocationConfig.getLocationTimeout()));
            loadConfigImpl.set(LoadConfig.CACHE_VALIDITY_TIME, String.valueOf(mtLocationConfig.getCacheValidTime()));
            loadConfigImpl.set(LoadConfig.GPS_MIN_TIME, String.valueOf(mtLocationConfig.getGpsMinTime()));
            loadConfigImpl.set(LoadConfig.DELIVER_INTERVAL, String.valueOf(mtLocationConfig.getDeliverInterval()));
            loadConfigImpl.set(LoadConfig.GPS_FIX_FIRST_WAIT, String.valueOf(mtLocationConfig.getGpsFixFirstWait()));
            loadConfigImpl.set("business_id", this.b.b);
            loadConfigImpl.set(LoadConfig.IS_NEED_GPS, String.valueOf(mtLocationConfig.isNeedGps()));
        }
        try {
            String str = this.b.b;
            Activity a2 = this.b.a();
            Fragment c = this.b.c();
            android.app.Fragment b = this.b.b();
            FragmentActivity d = this.b.d();
            if (a2 != null && !a2.isDestroyed() && !a2.isFinishing()) {
                return com.meituan.android.privacy.locate.g.a(a2, str, d.a()).a(context, loadStrategy, loadConfigImpl, e);
            }
            if (b != null && b.getActivity() != null) {
                return com.meituan.android.privacy.locate.g.a(b, str, d.a()).a(context, loadStrategy, loadConfigImpl, e);
            }
            if (c != null && c.getActivity() != null) {
                return com.meituan.android.privacy.locate.g.a(c, str, d.a()).a(context, loadStrategy, loadConfigImpl, e);
            }
            if (d != null && !d.isDestroyed() && !d.isFinishing()) {
                return com.meituan.android.privacy.locate.g.a(d, str, d.a()).a(context, loadStrategy, loadConfigImpl, e);
            }
            if (a2 == null && d == null && b == null && c == null && str.length() != 0) {
                return com.meituan.android.privacy.locate.g.a((com.meituan.android.privacy.locate.lifecycle.b) null, str, d.a()).a(context, loadStrategy, loadConfigImpl, e);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final Loader<MtLocation> b(Context context, MtLocationConfig mtLocationConfig) {
        Object[] objArr = {context, mtLocationConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "269360c9a9e3df007121f9925c6065e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "269360c9a9e3df007121f9925c6065e2");
        }
        LoadConfigImpl loadConfigImpl = new LoadConfigImpl();
        LocationLoaderFactory.LoadStrategy loadStrategy = LocationLoaderFactory.LoadStrategy.normal;
        if (mtLocationConfig != null) {
            loadConfigImpl.set(LoadConfig.LOCATION_TIMEOUT, String.valueOf(mtLocationConfig.getLocationTimeout()));
            loadConfigImpl.set(LoadConfig.CACHE_VALIDITY_TIME, String.valueOf(mtLocationConfig.getCacheValidTime()));
            loadConfigImpl.set(LoadConfig.GPS_MIN_TIME, String.valueOf(mtLocationConfig.getGpsMinTime()));
            loadConfigImpl.set(LoadConfig.DELIVER_INTERVAL, String.valueOf(mtLocationConfig.getDeliverInterval()));
            loadConfigImpl.set(LoadConfig.GPS_FIX_FIRST_WAIT, String.valueOf(mtLocationConfig.getGpsFixFirstWait()));
            loadConfigImpl.set("business_id", this.b.b);
            loadConfigImpl.set(LoadConfig.IS_NEED_GPS, String.valueOf(mtLocationConfig.isNeedGps()));
            loadStrategy = mtLocationConfig.getStrategyMode();
        }
        if (loadStrategy == LocationLoaderFactory.LoadStrategy.normal) {
            loadConfigImpl.set(LoadConfig.FORCE_SINGLE_CALLBACK, "TRUE");
        }
        try {
            String str = this.b.b;
            Activity a2 = this.b.a();
            Fragment c = this.b.c();
            android.app.Fragment b = this.b.b();
            FragmentActivity d = this.b.d();
            if (a2 != null && !a2.isDestroyed() && !a2.isFinishing()) {
                return com.meituan.android.privacy.locate.g.a(a2, str, d.a()).a(context, loadStrategy, loadConfigImpl, e);
            }
            if (b != null && b.getActivity() != null) {
                return com.meituan.android.privacy.locate.g.a(b, str, d.a()).a(context, loadStrategy, loadConfigImpl, e);
            }
            if (c != null && c.getActivity() != null) {
                return com.meituan.android.privacy.locate.g.a(c, str, d.a()).a(context, loadStrategy, loadConfigImpl, e);
            }
            if (d != null && !d.isDestroyed() && !d.isFinishing()) {
                return com.meituan.android.privacy.locate.g.a(d, str, d.a()).a(context, loadStrategy, loadConfigImpl, e);
            }
            if (a2 == null && d == null && b == null && c == null && str.length() != 0) {
                return com.meituan.android.privacy.locate.g.a((com.meituan.android.privacy.locate.lifecycle.b) null, str, d.a()).a(context, loadStrategy, loadConfigImpl, e);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
