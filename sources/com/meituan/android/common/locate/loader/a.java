package com.meituan.android.common.locate.loader;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import com.meituan.android.common.locate.GearsLocationState;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.LocationMode;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.controller.f;
import com.meituan.android.common.locate.loader.strategy.Instant;
import com.meituan.android.common.locate.locator.SystemLocator;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.reporter.e;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.k;
import com.meituan.passport.UserCenter;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class a<T> extends Loader<T> implements k.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String a;
    public LocationStrategy b;
    protected long c;
    protected final com.meituan.android.common.locate.platform.logs.a d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "978e93c312cb71c879191e15484b403d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "978e93c312cb71c879191e15484b403d");
            return;
        }
        this.a = "unKnown";
        this.c = 0L;
        this.e = false;
        this.f = false;
        String str = "";
        if ((this instanceof LocationLoader) || (this instanceof MtLocationLoader)) {
            str = AbsApiFactory.PASSPORT_ONLINE_URL;
        } else if (this instanceof c) {
            str = UserCenter.OAUTH_TYPE_QQ;
        }
        this.d = new com.meituan.android.common.locate.platform.logs.a(this, str);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ed42f674ebdba03cdb31ce1f07cf138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ed42f674ebdba03cdb31ce1f07cf138");
        } else if (!f.a().b() && e.a(getContext()).t() && GearsLocationState.a()) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap.put("state", String.valueOf(GearsLocationState.b()));
            concurrentHashMap.put("foreground", k.a().d() ? "1" : "2");
            try {
                com.meituan.android.common.locate.platform.babel.a.a().a("maplocatesdksnapshot", concurrentHashMap);
            } catch (Exception e) {
                com.meituan.android.common.locate.platform.logs.c.a("BaseLoader::report BabelService.getService().reportCategory(): " + e.getMessage(), 3);
            }
            GearsLocationState.a(false);
        }
    }

    private boolean d() {
        LoadConfig config;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7d40fec25bfec9bb5c01b8747bffd6b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7d40fec25bfec9bb5c01b8747bffd6b")).booleanValue() : !(this.b instanceof BaseLocationStrategy) || (config = ((BaseLocationStrategy) this.b).getConfig()) == null || TextUtils.isEmpty(config.get(LoadConfig.IS_ALLOW_BACKGROUND_LOCATION)) || !TextUtils.equals("TRUE", config.get(LoadConfig.IS_ALLOW_BACKGROUND_LOCATION));
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e5cc4c3d62ff236b4b4d2f2e1a8c89a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e5cc4c3d62ff236b4b4d2f2e1a8c89a")).booleanValue();
        }
        try {
            return com.meituan.android.common.locate.strategy.c.a().a(getContext(), this.a);
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
            return false;
        }
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b4df0fac2baea2c2ff89f5672c25e74", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b4df0fac2baea2c2ff89f5672c25e74")).booleanValue();
        }
        return g() && e.a(getContext()).q();
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b56a6c2d5a5952f82e3a5dab96a831ee", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b56a6c2d5a5952f82e3a5dab96a831ee")).booleanValue() : "biz_bike".equals(this.a);
    }

    @CallSuper
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "796e2b1deffbc0445ce5cad5a59e26f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "796e2b1deffbc0445ce5cad5a59e26f9");
            return;
        }
        k.a().a(this);
        if (this.b != null && (LocationMode.NO_USE_DB_MODE.equals(this.b.getLocationMode()) || e())) {
            com.meituan.android.common.locate.strategy.a.a(getContext()).a(toString(), true);
        }
        f.a().a(this.a);
        f.a().a(this.a, this.b instanceof Instant);
    }

    public void a(LocationStrategy locationStrategy) {
        Object[] objArr = {locationStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0338b0c3beb09597f18840ac4d45312", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0338b0c3beb09597f18840ac4d45312");
            return;
        }
        this.b = locationStrategy;
        if (locationStrategy instanceof BaseLocationStrategy) {
            LoadConfig config = ((BaseLocationStrategy) locationStrategy).getConfig();
            if (config instanceof LoadConfigImpl) {
                String configJson = ((LoadConfigImpl) config).getConfigJson();
                if (TextUtils.isEmpty(configJson)) {
                    return;
                }
                com.meituan.android.common.locate.platform.logs.c.a("BaseLoader::config:" + configJson, 3);
            }
        }
    }

    public boolean a(MtLocation mtLocation) {
        Bundle extras;
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed08c18d3b56cd6a19ce28d118425267", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed08c18d3b56cd6a19ce28d118425267")).booleanValue() : mtLocation != null && com.meituan.android.common.locate.strategy.c.a().a(getContext(), this.a) && (extras = mtLocation.getExtras()) != null && "db".equals(extras.getString("from"));
    }

    @CallSuper
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5b2df2fcd70fe1c285d42382163e704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5b2df2fcd70fe1c285d42382163e704");
            return;
        }
        if (!this.h) {
            k.a().b(this);
        }
        if (this.b != null && (LocationMode.NO_USE_DB_MODE.equals(this.b.getLocationMode()) || e())) {
            com.meituan.android.common.locate.strategy.a.a(getContext()).a(toString(), false);
        }
        c();
        f.a().b(this.a);
        f.a().b(this.a, this.b instanceof Instant);
    }

    public boolean b(MtLocation mtLocation) {
        Bundle extras;
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b954dfa2fd69e949489ee8a7ba8b8085", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b954dfa2fd69e949489ee8a7ba8b8085")).booleanValue();
        }
        if (mtLocation == null || this.e) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.c;
        if (f() && currentTimeMillis < e.a(getContext()).r() && (extras = mtLocation.getExtras()) != null) {
            this.e = "gps".equals(extras.getString("from"));
            StringBuilder sb = new StringBuilder("locationloader:isWaitingGps ");
            sb.append(!this.e);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            if (!this.e) {
                return true;
            }
        }
        return false;
    }

    public boolean c(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a59c15996b0b97ff67e0d03b6040f0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a59c15996b0b97ff67e0d03b6040f0d")).booleanValue();
        }
        if (this.f) {
            return false;
        }
        boolean s = e.a(getContext()).s();
        boolean equals = "mars".equals(mtLocation.getProvider());
        if (g() && s) {
            this.f = equals;
            com.meituan.android.common.locate.platform.logs.c.a("locationloader:timerFistGPSDeliver " + equals, 3);
            return equals;
        }
        return false;
    }

    public boolean isNoUseCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb1daa0de112dee16897105843faf47e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb1daa0de112dee16897105843faf47e")).booleanValue() : com.meituan.android.common.locate.strategy.c.a().a(getContext(), this.a);
    }

    @Override // com.meituan.android.common.locate.util.k.a
    public void onAppBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f98e44e33bdde3946c6976f62175ca13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f98e44e33bdde3946c6976f62175ca13");
        } else if (d()) {
            if (this.h) {
                return;
            }
            this.h = true;
            b();
        } else {
            com.meituan.android.common.locate.platform.logs.c.a("Loader-ProcessState-Background:bizKey=" + this.a, 3);
            com.meituan.android.common.locate.platform.sniffer.c.a(new c.a("sniffer_mt_process_state", "Background", "", "bizkey=" + this.a));
        }
    }

    @Override // com.meituan.android.common.locate.util.k.a
    public void onAppForeground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9483559818f906c4ce86d36bc980a04d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9483559818f906c4ce86d36bc980a04d");
        } else if (this.h) {
            a();
            this.h = false;
        }
    }

    @Override // android.support.v4.content.Loader
    public void onStartLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94651878eab7c72039b926b4694f7ba8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94651878eab7c72039b926b4694f7ba8");
            return;
        }
        if (this.d != null) {
            this.d.a(this.a);
        }
        if (this.g) {
            return;
        }
        this.g = true;
        if (!d() || k.a().a(getContext())) {
            a();
            return;
        }
        this.h = true;
        k.a().a(this);
    }

    @Override // android.support.v4.content.Loader
    public void onStopLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95017e3d682721c407e43dc278fda950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95017e3d682721c407e43dc278fda950");
            return;
        }
        if (this.d != null) {
            this.d.a(this.a, new Runnable() { // from class: com.meituan.android.common.locate.loader.a.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7bf9955010e9e675e91094974a986488", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7bf9955010e9e675e91094974a986488");
                    } else if (a.this.g) {
                        a.this.g = false;
                        a.this.h = false;
                        a.this.b();
                        SystemLocator systemLocator = SystemLocator.getInstance();
                        if (systemLocator == null || !systemLocator.isGpsRunning()) {
                            return;
                        }
                        systemLocator.stopGnnsEventListen();
                        systemLocator.startGnnsEventListen();
                    }
                }
            });
        }
        this.e = false;
        this.f = false;
    }
}
