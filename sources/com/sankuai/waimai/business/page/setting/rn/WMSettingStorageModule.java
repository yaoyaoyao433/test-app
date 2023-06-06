package com.sankuai.waimai.business.page.setting.rn;

import android.content.Context;
import android.support.constraint.R;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.loader.a;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.utils.l;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMSettingStorageModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isClearingCache;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMSettingStorage";
    }

    public WMSettingStorageModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78d4a035f35ecfab42ea921bc10913ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78d4a035f35ecfab42ea921bc10913ae");
        } else {
            this.isClearingCache = false;
        }
    }

    @ReactMethod
    public void clearCache(final Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "107a824c8c26a8479a04101da4f0376f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "107a824c8c26a8479a04101da4f0376f");
        } else if (this.isClearingCache) {
            ae.a(getReactApplicationContext(), (int) R.string.wm_page_setting_clearing_cache);
        } else {
            this.isClearingCache = true;
            l.a(new Runnable() { // from class: com.sankuai.waimai.business.page.setting.rn.WMSettingStorageModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bef94a6443a3e613cf456219dce23495", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bef94a6443a3e613cf456219dce23495");
                    } else {
                        a.b();
                    }
                }
            }, "SettingsActivity");
            l.a(new l.a() { // from class: com.sankuai.waimai.business.page.setting.rn.WMSettingStorageModule.2
                public static ChangeQuickRedirect a;

                private void a(File file) throws IOException {
                    Object[] objArr2 = {file};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cf3d60d554909845190510b184239edd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cf3d60d554909845190510b184239edd");
                        return;
                    }
                    File[] listFiles = file.listFiles();
                    if (listFiles == null) {
                        throw new IOException("not a readable directory: " + file);
                    }
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            a(file2);
                        }
                        if (!file2.delete()) {
                            throw new IOException("failed to delete file: " + file2);
                        }
                    }
                }

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bf8bcf1cbf29d7ec8617ddbbd0c370f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bf8bcf1cbf29d7ec8617ddbbd0c370f5");
                        return;
                    }
                    ae.a(WMSettingStorageModule.this.getReactApplicationContext(), (int) R.string.wm_page_setting_cache_cleared);
                    callback.invoke("0MB");
                    WMSettingStorageModule.this.isClearingCache = false;
                }

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7138223a11c7face12aa98cf796ecfea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7138223a11c7face12aa98cf796ecfea");
                        return;
                    }
                    try {
                        a(b.a.getCacheDir());
                    } catch (IOException e) {
                        i.d(new com.sankuai.waimai.business.page.common.log.a().a("home_page_setting_clear_cache_error").b("clear_cache_error").c(e.getMessage()).b());
                    }
                }
            }, "SettingsActivity");
        }
    }

    @ReactMethod
    public void getCacheSize(final Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75674e8ace893d26fba65ff49323e7e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75674e8ace893d26fba65ff49323e7e2");
        } else {
            l.a(new l.c<Long>() { // from class: com.sankuai.waimai.business.page.setting.rn.WMSettingStorageModule.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.c
                public final /* synthetic */ void a(Long l) {
                    Long l2 = l;
                    Object[] objArr2 = {l2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1a66c1c31837dad987accebd2cd3d581", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1a66c1c31837dad987accebd2cd3d581");
                    } else {
                        callback.invoke(WMSettingStorageModule.this.getCacheSizeTxt(l2.longValue()));
                    }
                }

                private long a(File file) {
                    Object[] objArr2 = {file};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2714d703c58210c407a6ca5260967f78", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2714d703c58210c407a6ca5260967f78")).longValue();
                    }
                    long j = 0;
                    if (file == null) {
                        return 0L;
                    }
                    if (!file.isDirectory()) {
                        return file.length();
                    }
                    File[] listFiles = file.listFiles();
                    if (listFiles == null) {
                        return 0L;
                    }
                    for (File file2 : listFiles) {
                        j += a(file2);
                    }
                    return j;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.sankuai.waimai.platform.utils.l.c
                /* renamed from: b */
                public Long a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "75d8a95f66e77c6a9948508c79d60cc3", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "75d8a95f66e77c6a9948508c79d60cc3");
                    }
                    try {
                        return Long.valueOf(a(b.a.getCacheDir()));
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                        return 0L;
                    }
                }
            }, "SettingsActivity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCacheSizeTxt(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a84ce727757dcebe6d44cba6f81de951", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a84ce727757dcebe6d44cba6f81de951");
        }
        if (j <= 0) {
            return "0MB";
        }
        double d = (j / 1024.0d) / 1024.0d;
        if (h.b(Double.valueOf(d), Double.valueOf(0.01d))) {
            return "0MB";
        }
        return h.a(Double.valueOf(d), 2, 2) + "MB";
    }

    @ReactMethod
    public void getSwitchState(Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "694133b9825bbc95591c99176a9f7371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "694133b9825bbc95591c99176a9f7371");
        } else {
            callback.invoke(Boolean.valueOf(com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) getReactApplicationContext(), "auto_update_switch", true)));
        }
    }
}
