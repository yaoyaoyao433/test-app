package com.dianping.titans.js.jshandler;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.sankuai.meituan.android.knb.util.ImageUtils;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import java.io.File;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CompressImageJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6138ce5fc42cd6264785aa228075093e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6138ce5fc42cd6264785aa228075093e");
            return;
        }
        final JSONObject jSONObject = jsBean().argsJson;
        if (jSONObject == null) {
            jsCallbackError(520, "no args");
        } else if (jsHost() == null || jsHost().getActivity() == null) {
            jsCallbackError(520, "no host");
        } else {
            final String sceneToken = getSceneToken();
            TitansPermissionUtil.requestPermission(jsHost().getActivity(), PermissionGuard.PERMISSION_STORAGE_READ, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.CompressImageJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1efc748e9f41169844e47eed33ba7cda", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1efc748e9f41169844e47eed33ba7cda");
                    } else if (!z) {
                        CompressImageJsHandler compressImageJsHandler = CompressImageJsHandler.this;
                        compressImageJsHandler.jsCallbackError(i, "no storage permission，sceneToke:" + sceneToken);
                    } else {
                        String optString = jSONObject.optString("image");
                        if (LocalIdUtils.isValid(optString)) {
                            optString = LocalIdUtils.getUri(optString).toString();
                        } else if (!URLUtil.isContentUrl(optString) && !new File(optString).exists()) {
                            CompressImageJsHandler.this.jsCallbackError(520, "file not exist");
                            return;
                        }
                        String str = optString;
                        if (TextUtils.isEmpty(str)) {
                            CompressImageJsHandler.this.jsCallbackError(520, "illegal image");
                            return;
                        }
                        int optInt = jSONObject.optInt("scale", 100);
                        if (optInt <= 0 || optInt > 100) {
                            CompressImageJsHandler.this.jsCallbackError(520, "scale no in (0,100]");
                            return;
                        }
                        int optInt2 = jSONObject.optInt(LocalIdUtils.QUERY_QUALITY, 50);
                        if (optInt2 <= 0 || optInt2 > 100) {
                            CompressImageJsHandler.this.jsCallbackError(520, "quality no in (0,100]");
                        } else {
                            KNBRuntime.getRuntime().executeOnThreadPool(new CompressImageTask(CompressImageJsHandler.this.jsHost().getContext(), str, optInt, optInt2, sceneToken));
                        }
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class CompressImageTask implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Context context;
        public int quality;
        public int scale;
        private final String sceneToken;
        public String uri;

        public CompressImageTask(Context context, String str, int i, int i2, String str2) {
            Object[] objArr = {CompressImageJsHandler.this, context, str, Integer.valueOf(i), Integer.valueOf(i2), str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "425c665fac4e6ca36af8ccdb2259e480", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "425c665fac4e6ca36af8ccdb2259e480");
                return;
            }
            this.context = context;
            this.uri = str;
            this.scale = i;
            this.quality = i2;
            this.sceneToken = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "112da7bbde9c68c15a9badbd4d0a68a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "112da7bbde9c68c15a9badbd4d0a68a2");
                return;
            }
            try {
                if (TextUtils.isEmpty(this.uri)) {
                    CompressImageJsHandler.this.jsCallbackErrorMsg("empty uri");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("outputPath", new LocalIdUtils.Builder(ImageUtils.compressAndSaveImage(CompressImageJsHandler.this.jsHost().getContext(), this.uri, this.scale, this.quality, this.sceneToken)).appendToken(this.sceneToken).build());
                CompressImageJsHandler.this.jsCallback(jSONObject);
            } catch (Exception e) {
                CompressImageJsHandler.this.jsCallbackError(500, e.getMessage());
            }
        }
    }
}
