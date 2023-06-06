package com.meituan.mmp.lib.api.file;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.config.f;
import com.meituan.mmp.lib.utils.ay;
import com.meituan.mmp.lib.utils.q;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsReaderView;
import java.io.File;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DocumentModule extends ActivityApi {
    public static ChangeQuickRedirect h;
    public static boolean i;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6f584d35262d7c0924341d41884ce5c", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6f584d35262d7c0924341d41884ce5c") : new String[]{"openDocument"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, final IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b264c4076b8422476665f3f347dd753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b264c4076b8422476665f3f347dd753");
            return;
        }
        if (((str.hashCode() == -944934523 && str.equals("openDocument")) ? (char) 0 : (char) 65535) != 0) {
            return;
        }
        Object[] objArr2 = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ede945f3a8f282ca728bd0447c17f576", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ede945f3a8f282ca728bd0447c17f576");
            return;
        }
        String optString = jSONObject.optString(TbsReaderView.KEY_FILE_PATH, null);
        String optString2 = jSONObject.optString("fileType", null);
        if (TextUtils.isEmpty(optString)) {
            iApiCallback.onFail(codeJson(-1, "filePath is null"));
            return;
        }
        String a = s.a(getContext(), optString, getAppConfig());
        if (TextUtils.isEmpty(a)) {
            iApiCallback.onFail(codeJson(-1, "file is not exit"));
            return;
        }
        File file = new File(a);
        if (!file.exists()) {
            iApiCallback.onFail(codeJson(-1, "file is not exit"));
        } else if (!q.a(file.getAbsoluteFile(), ay.b(getContext(), getAppId())) && !q.a(file.getAbsoluteFile(), ay.c(getContext(), getAppId())) && !q.a(file.getAbsoluteFile(), ay.d(getContext(), getAppId()))) {
            iApiCallback.onFail(codeJson(-1, "Please use miniProgram dir!"));
        } else {
            final Intent intent = new Intent("com.meituan.mmp.action.DocumentPreviewActivity");
            intent.setPackage(getContext().getPackageName());
            intent.putExtra(TbsReaderView.KEY_FILE_PATH, a);
            intent.putExtra("fileType", optString2);
            if (f.c) {
                startActivity(intent, iApiCallback);
            } else if (i) {
                startActivity(intent, iApiCallback);
            } else {
                QbSdk.initX5Environment(getContext(), new QbSdk.PreInitCallback() { // from class: com.meituan.mmp.lib.api.file.DocumentModule.1
                    public static ChangeQuickRedirect a;

                    @Override // com.tencent.smtt.sdk.QbSdk.PreInitCallback
                    public final void onCoreInitFinished() {
                    }

                    @Override // com.tencent.smtt.sdk.QbSdk.PreInitCallback
                    public final void onViewInitFinished(boolean z) {
                        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2b0cbff1a1c98a8db9c66cf7b888ef6b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2b0cbff1a1c98a8db9c66cf7b888ef6b");
                            return;
                        }
                        DocumentModule.i = true;
                        DocumentModule.this.startActivity(intent, iApiCallback);
                    }
                });
                QbSdk.setDownloadWithoutWifi(true);
            }
        }
    }
}
