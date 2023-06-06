package com.meituan.met.mercury.load.core;

import android.support.annotation.Keep;
import com.meituan.met.mercury.load.bean.ExtraParamsBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class DDLoadParams {
    public static final int BUNDLE_ASYNC_UPDATE = 2;
    public static final int PHASE_BUNDLE_REQUEST = 1;
    public static final int STORAGE_MODE_CACHE = 0;
    public static final int STORAGE_MODE_FILE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private h bundleAsyncUpdateCallback;
    private h bundleRequestCallback;
    private String businessSdkVersion;
    public List<ExtraParamsBean> extraParams;
    public boolean limitWifi;
    public long metaCacheDuration;
    public int preloadTag;
    public int storageMode;
    public String tag;
    private boolean useCurrPreset;

    public DDLoadParams(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d8ccdb8f6f858da129495a76384e885", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d8ccdb8f6f858da129495a76384e885");
            return;
        }
        this.storageMode = 0;
        this.storageMode = i;
    }

    public void setBundleRequestCallback(h hVar) {
        this.bundleRequestCallback = hVar;
    }

    public void setBundleAsyncUpdateCallback(h hVar) {
        this.bundleAsyncUpdateCallback = hVar;
    }

    public void setUseCurrPreset(boolean z) {
        this.useCurrPreset = z;
    }

    public void setBusinessSdkVersion(String str) {
        this.businessSdkVersion = str;
    }

    public String getBusinessSdkVersion() {
        return this.businessSdkVersion;
    }

    public boolean getUseCurrPreset() {
        return this.useCurrPreset;
    }

    public void onSuccess(int i, final DDResource dDResource, final boolean z) {
        final h hVar;
        Object[] objArr = {Integer.valueOf(i), dDResource, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32cb14e6e5b7f5b95f31480dbe634343", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32cb14e6e5b7f5b95f31480dbe634343");
            return;
        }
        switch (i) {
            case 1:
                hVar = this.bundleRequestCallback;
                break;
            case 2:
                hVar = this.bundleAsyncUpdateCallback;
                break;
            default:
                hVar = null;
                break;
        }
        if (hVar == null) {
            return;
        }
        com.sankuai.android.jarvis.c.a("ddCallbackSphase=" + i, new Runnable() { // from class: com.meituan.met.mercury.load.core.DDLoadParams.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "af4244c7db459fe34a3fe34709ae8dd5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "af4244c7db459fe34a3fe34709ae8dd5");
                }
            }
        }).start();
    }

    public void onFail(int i, final f fVar, final boolean z) {
        final h hVar;
        Object[] objArr = {Integer.valueOf(i), fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9938c4279ff798cff56fecf935cc57eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9938c4279ff798cff56fecf935cc57eb");
            return;
        }
        switch (i) {
            case 1:
                hVar = this.bundleRequestCallback;
                break;
            case 2:
                hVar = this.bundleAsyncUpdateCallback;
                break;
            default:
                hVar = null;
                break;
        }
        if (hVar == null) {
            return;
        }
        com.sankuai.android.jarvis.c.a("ddCallbackFphase=" + i, new Runnable() { // from class: com.meituan.met.mercury.load.core.DDLoadParams.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4a41486f00ba5221779a0bc215b93643", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4a41486f00ba5221779a0bc215b93643");
                }
            }
        }).start();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9289220b815cdb0fd2cfce9917c754eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9289220b815cdb0fd2cfce9917c754eb");
        }
        return "DDLoadParams{storageMode=" + this.storageMode + ", useCurrPreset=" + this.useCurrPreset + ", businessSdkVersion='" + this.businessSdkVersion + "', preloadTag=" + this.preloadTag + ", metaCacheDuration=" + this.metaCacheDuration + ", tag='" + this.tag + "', limitWifi=" + this.limitWifi + ", extraParams=" + this.extraParams + ", bundleRequestCallback=" + this.bundleRequestCallback + ", bundleAsyncUpdateCallback=" + this.bundleAsyncUpdateCallback + '}';
    }
}
