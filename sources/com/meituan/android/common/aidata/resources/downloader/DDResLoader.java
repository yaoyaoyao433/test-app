package com.meituan.android.common.aidata.resources.downloader;

import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.ai.bundle.AiBundleManager;
import com.meituan.android.common.aidata.feature.utils.ITaskListener;
import com.meituan.android.common.aidata.feature.utils.MultiTaskListener;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.resources.config.DDPresetConfig;
import com.meituan.android.common.aidata.resources.config.ResourceConfigManager;
import com.meituan.android.common.aidata.resources.downloader.DDResResponse;
import com.meituan.android.common.aidata.utils.FileUtil;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.android.common.aidata.utils.SP;
import com.meituan.met.mercury.load.core.DDLoadStrategy;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.met.mercury.load.core.d;
import com.meituan.met.mercury.load.core.f;
import com.meituan.met.mercury.load.core.g;
import com.meituan.met.mercury.load.core.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.stat.MttLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DDResLoader {
    private static final String DYNAMIC_APP_TYPE = "ddblue";
    private static final String TAG = "DDResLoader";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile DDResLoader sInstance;
    private volatile d mDDLoader;

    public DDResLoader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f04addae5647fe49426b6b0077c6a666", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f04addae5647fe49426b6b0077c6a666");
        } else {
            this.mDDLoader = null;
        }
    }

    public static DDResLoader getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "49ba6748051c0ad53ac113a99e40098d", RobustBitConfig.DEFAULT_VALUE)) {
            return (DDResLoader) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "49ba6748051c0ad53ac113a99e40098d");
        }
        if (sInstance == null) {
            synchronized (DDResLoader.class) {
                if (sInstance == null) {
                    sInstance = new DDResLoader();
                }
            }
        }
        return sInstance;
    }

    private d getLoader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6ad9fb1dc288b8cc67eb6e7ae69d828", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6ad9fb1dc288b8cc67eb6e7ae69d828");
        }
        if (this.mDDLoader != null) {
            return this.mDDLoader;
        }
        synchronized (this) {
            if (this.mDDLoader == null) {
                try {
                    this.mDDLoader = g.a(DYNAMIC_APP_TYPE);
                    if (this.mDDLoader != null) {
                        this.mDDLoader.c = isEnvDebug();
                    }
                } catch (f unused) {
                }
            }
        }
        return this.mDDLoader;
    }

    public <T extends DDResRequest> void loadResourceList(List<T> list, final DDResResultCallback dDResResultCallback) {
        boolean z = false;
        Object[] objArr = {list, dDResResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "207635e0ea2902fa6795382ba88cf0bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "207635e0ea2902fa6795382ba88cf0bb");
        } else if (list != null && dDResResultCallback != null) {
            if (list != null && list.size() > 0) {
                MultiTaskListener<String, DDResResponse, Exception> multiTaskListener = new MultiTaskListener<String, DDResResponse, Exception>() { // from class: com.meituan.android.common.aidata.resources.downloader.DDResLoader.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.feature.utils.MultiTaskListener
                    public void onAllTaskComplete(@NonNull Map<String, MultiTaskListener.ResultHolder<DDResResponse, Exception>> map) {
                        MultiTaskListener.ResultHolder<DDResResponse, Exception> value;
                        DDResResponse dDResResponse;
                        boolean z2 = false;
                        Object[] objArr2 = {map};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3c981cba26da332f1d38239d11e28720", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3c981cba26da332f1d38239d11e28720");
                            return;
                        }
                        DDResResponse dDResResponse2 = new DDResResponse();
                        for (Map.Entry<String, MultiTaskListener.ResultHolder<DDResResponse, Exception>> entry : map.entrySet()) {
                            if (entry != null && (value = entry.getValue()) != null && value.resultCode == 2 && (dDResResponse = value.resultValue) != null && dDResResponse.getResult() != null) {
                                try {
                                    dDResResponse2.addResponseBeanList(dDResResponse.getResult());
                                    z2 = true;
                                } catch (Exception unused) {
                                }
                            }
                        }
                        if (z2) {
                            if (dDResResultCallback != null) {
                                dDResResultCallback.onSuccess(dDResResponse2);
                            }
                        } else if (dDResResultCallback != null) {
                            dDResResultCallback.onFail(new Exception("DDResLoader loadResourceList isAnyResultAvailable=false"));
                        }
                    }
                };
                ArrayList<Runnable> arrayList = new ArrayList();
                for (final T t : list) {
                    final ITaskListener<DDResResponse, Exception> createOneTaskListener = multiTaskListener.createOneTaskListener(t.mResName);
                    arrayList.add(new Runnable() { // from class: com.meituan.android.common.aidata.resources.downloader.DDResLoader.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "068ecf15b4d29c8de911d4d2a9fb56fb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "068ecf15b4d29c8de911d4d2a9fb56fb");
                            } else {
                                DDResLoader.this.loadResource(t, new DDResResultCallback() { // from class: com.meituan.android.common.aidata.resources.downloader.DDResLoader.2.1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    @Override // com.meituan.android.common.aidata.resources.downloader.DDResResultCallback
                                    public void onSuccess(DDResResponse dDResResponse) {
                                        Object[] objArr3 = {dDResResponse};
                                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c5cd6b93684d43af9029e403c4731da6", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c5cd6b93684d43af9029e403c4731da6");
                                        } else {
                                            createOneTaskListener.onSuccess(dDResResponse);
                                        }
                                    }

                                    @Override // com.meituan.android.common.aidata.resources.downloader.DDResResultCallback
                                    public void onFail(Exception exc) {
                                        Object[] objArr3 = {exc};
                                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "60a9e34e27fb228b0497f344ab949ff1", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "60a9e34e27fb228b0497f344ab949ff1");
                                        } else {
                                            createOneTaskListener.onFailed(exc);
                                        }
                                    }
                                });
                            }
                        }
                    });
                    z = true;
                }
                for (Runnable runnable : arrayList) {
                    runnable.run();
                }
            }
            if (z) {
                return;
            }
            dDResResultCallback.onFail(new Exception("no feature is available"));
        }
    }

    public void loadResource(final DDResRequest dDResRequest, final DDResResultCallback dDResResultCallback) {
        DDPresetConfig dDPresetConfig;
        Object[] objArr = {dDResRequest, dDResResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b56b372e5018c6c34aff5f63020f9764", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b56b372e5018c6c34aff5f63020f9764");
        } else if (dDResRequest == null) {
            if (dDResResultCallback != null) {
                dDResResultCallback.onSuccess(null);
            }
        } else if (getLoader() == null) {
            if (dDResResultCallback != null) {
                dDResResultCallback.onFail(new IllegalArgumentException("DDLoader is null"));
            }
        } else {
            StringBuilder sb = new StringBuilder("ddd request params, name=");
            sb.append(dDResRequest.mResName);
            sb.append(MttLoader.QQBROWSER_PARAMS_VERSION);
            sb.append(dDResRequest.mResVer);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            k kVar = new k() { // from class: com.meituan.android.common.aidata.resources.downloader.DDResLoader.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.met.mercury.load.core.k
                public void onSuccess(DDResource dDResource) {
                    Object[] objArr2 = {dDResource};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2e52dc2a8f27b97931d0ea50371dd62c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2e52dc2a8f27b97931d0ea50371dd62c");
                        return;
                    }
                    CatMonitorManager.getInstance().reportDDDSdkResponse(dDResource != null ? dDResource.getName() : dDResRequest.mResName, dDResource != null ? dDResource.getVersion() : dDResRequest.mResVer, SystemClock.elapsedRealtime() - elapsedRealtime, dDResource, null);
                    if (dDResource != null) {
                        DDResResponse parseResource = DDResLoader.this.parseResource(dDResource, dDResRequest);
                        if (LogUtil.isLogEnabled()) {
                            StringBuilder sb2 = new StringBuilder("DDD SDK download onSuccess, ,isFromNet=");
                            sb2.append(dDResource.isFromNet());
                            sb2.append(",isPreset=");
                            sb2.append(dDResource.isPreset());
                            sb2.append(", name=");
                            sb2.append(dDResource.getName());
                            sb2.append(MttLoader.QQBROWSER_PARAMS_VERSION);
                            sb2.append(dDResource.getVersion());
                            sb2.append(",consumeTime=");
                            sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                            if (parseResource != null && parseResource.getResult() != null && parseResource.getResult().size() > 0) {
                                for (DDResResponse.PackageBean packageBean : parseResource.getResult()) {
                                    new StringBuilder("        DDD SDK download resource info bean:").append(packageBean.toString());
                                }
                            }
                        }
                        dDResResultCallback.onSuccess(parseResource);
                        return;
                    }
                    dDResResultCallback.onSuccess(null);
                }

                @Override // com.meituan.met.mercury.load.core.k
                public void onFail(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "531bca3ee35c93d993b11ad4d3c2eba6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "531bca3ee35c93d993b11ad4d3c2eba6");
                        return;
                    }
                    new StringBuilder("DDD SDK download resource info fail:").append(exc.toString());
                    CatMonitorManager.getInstance().reportDDDSdkResponse(dDResRequest.mResName, dDResRequest.mResVer, SystemClock.elapsedRealtime() - elapsedRealtime, null, new BlueException(exc.getMessage(), BaseRaptorUploader.ERROR_EMPTY_BUNDLE_RES));
                    dDResResultCallback.onFail(exc);
                }
            };
            Map<String, DDPresetConfig> dDPresetConfig2 = ResourceConfigManager.getInstance().getDDPresetConfig();
            if (dDPresetConfig2 != null && !dDPresetConfig2.isEmpty() && (dDPresetConfig = dDPresetConfig2.get(dDResRequest.mResName)) != null && dDPresetConfig.getMode() >= 0 && dDPresetConfig.getMode() < DDLoadStrategy.valuesCustom().length && dDPresetConfig.getMode() != DDLoadStrategy.SPECIFIED.ordinal()) {
                getLoader().a(dDResRequest.mResName, DDLoadStrategy.valuesCustom()[dDPresetConfig.getMode()], kVar);
            } else {
                getLoader().a(dDResRequest.mResName, dDResRequest.mResVer, kVar);
            }
        }
    }

    public void loadResource(final DDResRequest dDResRequest, final DDResRawResultCallback dDResRawResultCallback) {
        Object[] objArr = {dDResRequest, dDResRawResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c6fdd12eb4c49c73a9cfc6a19d63923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c6fdd12eb4c49c73a9cfc6a19d63923");
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (getLoader() == null) {
            dDResRawResultCallback.onFail(new IllegalArgumentException("DDLoader is null"));
        } else {
            getLoader().a(dDResRequest.mResName, dDResRequest.mResVer, new k() { // from class: com.meituan.android.common.aidata.resources.downloader.DDResLoader.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.met.mercury.load.core.k
                public void onSuccess(DDResource dDResource) {
                    Object[] objArr2 = {dDResource};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a16498e734ad04c3b8f1c4f7f21ea385", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a16498e734ad04c3b8f1c4f7f21ea385");
                        return;
                    }
                    CatMonitorManager.getInstance().reportDDDSdkResponse(dDResRequest.mResName, dDResRequest.mResVer, SystemClock.elapsedRealtime() - elapsedRealtime, dDResource, null);
                    if (dDResRawResultCallback != null) {
                        dDResRawResultCallback.onSuccess(dDResource);
                    }
                }

                @Override // com.meituan.met.mercury.load.core.k
                public void onFail(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a5e0a5b4921bd02d445afb71f97cf57f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a5e0a5b4921bd02d445afb71f97cf57f");
                        return;
                    }
                    if (dDResRawResultCallback != null) {
                        dDResRawResultCallback.onFail(exc);
                    }
                    new StringBuilder("DDD SDK download resource info fail:").append(exc.toString());
                    CatMonitorManager.getInstance().reportDDDSdkResponse(dDResRequest.mResName, dDResRequest.mResVer, SystemClock.elapsedRealtime() - elapsedRealtime, null, new BlueException(exc.getMessage(), BaseRaptorUploader.ERROR_EMPTY_BUNDLE_RES));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DDResResponse parseResource(DDResource dDResource, DDResRequest dDResRequest) {
        String str;
        Object[] objArr = {dDResource, dDResRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a734a78d94e32bb33375d8d49bb2efc", RobustBitConfig.DEFAULT_VALUE)) {
            return (DDResResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a734a78d94e32bb33375d8d49bb2efc");
        }
        if (dDResource == null || TextUtils.isEmpty(dDResource.getLocalPath())) {
            return null;
        }
        if (dDResource.isPreset()) {
            str = FileUtil.readFileFromAsset(AIData.getContext(), dDResource.getLocalPath());
        } else {
            String readFileAsString = FileUtil.readFileAsString(dDResource.getLocalPath());
            AiBundleManager.getInstance().cacheCepFile(new File(dDResource.getLocalPath()), dDResRequest);
            str = readFileAsString;
        }
        DDResResponse dDResResponse = new DDResResponse();
        dDResResponse.addResponseBean(new DDResResponse.PackageBean(dDResource.getName(), dDResource.getVersion(), str));
        return dDResResponse;
    }

    public void setEnvDebug(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "867d0a63d0939ea751e4c57b2ee12e22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "867d0a63d0939ea751e4c57b2ee12e22");
            return;
        }
        SP.putBoolean(context == null ? AIData.getContext() : context.getApplicationContext(), SP.SP_KEY_DDD_ENV, z);
        if (this.mDDLoader != null) {
            this.mDDLoader.c = z;
        }
    }

    public boolean isEnvDebug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e38c4ff538055186eefbde95dd3adac", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e38c4ff538055186eefbde95dd3adac")).booleanValue() : SP.getBoolean(AIData.getContext(), SP.SP_KEY_DDD_ENV, false);
    }
}
