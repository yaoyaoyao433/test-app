package com.meituan.mmp.lib.api.update;

import android.support.annotation.Nullable;
import com.meituan.android.upgrade.e;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.Empty;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.annotation.NeedDependency;
import com.meituan.mmp.main.annotation.Optional;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class UpdateHostAppModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class AbsUpdateHostApp extends ApiFunction<UpdateParams, Empty> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class UpdateParams implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Optional
        @Nullable
        public Boolean isManual;
        public String source;
    }

    /* compiled from: ProGuard */
    @NeedDependency({e.class})
    /* loaded from: classes3.dex */
    public static class UpdateHostApp extends AbsUpdateHostApp {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, UpdateParams updateParams, final IApiCallback iApiCallback) {
            UpdateParams updateParams2 = updateParams;
            Object[] objArr = {str, updateParams2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ed22de8484600dc5b1d9a8a5847ce48", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ed22de8484600dc5b1d9a8a5847ce48");
            } else if (updateParams2 == null) {
                com.meituan.mmp.lib.trace.b.d("UpdateHostApp", "MTUpdateHostAppModule params is null");
                iApiCallback.onFail();
            } else {
                if (updateParams2.isManual == null) {
                    updateParams2.isManual = Boolean.TRUE;
                }
                e.a().a(updateParams2.isManual.booleanValue(), true, new com.meituan.android.upgrade.a() { // from class: com.meituan.mmp.lib.api.update.UpdateHostAppModule.UpdateHostApp.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.upgrade.a
                    public final void a(VersionInfo versionInfo, boolean z) {
                        Object[] objArr2 = {versionInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eea39605af8908082c332171119bbee5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eea39605af8908082c332171119bbee5");
                        } else if (versionInfo == null || !versionInfo.isUpdated) {
                            iApiCallback.onFail(AbsApi.codeJson(10001, "host app no new version"));
                            com.meituan.mmp.lib.trace.b.d("UpdateHostApp", "MTUpdateHostAppModule no new version");
                            iApiCallback.onFail(AbsApi.codeJson(10001, "no new version"));
                        } else {
                            iApiCallback.onSuccess(new JSONObject());
                        }
                    }

                    @Override // com.meituan.android.upgrade.a
                    public final void a(com.meituan.android.upgrade.d dVar) {
                        Object[] objArr2 = {dVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47ba05fab1f550fe2c0762ba3a523bbb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47ba05fab1f550fe2c0762ba3a523bbb");
                            return;
                        }
                        String format = String.format("host app update failed:%s", dVar.toString());
                        iApiCallback.onFail(AbsApi.codeJson(10002, format));
                        com.meituan.mmp.lib.trace.b.d("UpdateHostApp", format);
                    }
                });
            }
        }
    }
}
