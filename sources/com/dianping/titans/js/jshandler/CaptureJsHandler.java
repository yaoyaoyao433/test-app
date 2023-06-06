package com.dianping.titans.js.jshandler;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.sankuai.meituan.android.knb.util.AndroidAdapter;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CaptureJsHandler extends BaseJsHandler {
    public static final String CAPTURE_TYPE_DEFAULT = "screen";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String type;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface BitmapCallbackListener {
        void onGetBitmap(Bitmap bitmap, Bitmap.CompressFormat compressFormat);

        void onOOM();

        void onTimeOut();
    }

    public CaptureJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6f08f7db503fe33a183c683c53e5a82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6f08f7db503fe33a183c683c53e5a82");
        } else {
            this.type = CAPTURE_TYPE_DEFAULT;
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7d36724faaba40570267b01d52f6069", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7d36724faaba40570267b01d52f6069");
            return;
        }
        this.type = jsBean().argsJson.optString("area", CAPTURE_TYPE_DEFAULT);
        if (jsHost().getActivity() != null) {
            final String sceneToken = getSceneToken();
            TitansPermissionUtil.requestPermission(jsHost().getActivity(), PermissionGuard.PERMISSION_STORAGE, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.CaptureJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fe6fd7a7adf5e03a8b48fefa1f47bd72", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fe6fd7a7adf5e03a8b48fefa1f47bd72");
                    } else if (z) {
                        CaptureJsHandler.this.savePhotoByCapture(sceneToken);
                    } else {
                        CaptureJsHandler captureJsHandler = CaptureJsHandler.this;
                        captureJsHandler.jsCallbackError(i, "requestPermission error sceneToken is " + sceneToken);
                    }
                }
            });
            return;
        }
        jsFailedCallback(-100, "app need authroized");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jsFailedCallback(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6ba052de24d1a8fed7c9387fd74e438", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6ba052de24d1a8fed7c9387fd74e438");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
            jSONObject.put("errorCode", i);
            jSONObject.put("errorMsg", str);
        } catch (JSONException unused) {
        }
        jsCallback(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void savePhotoByCapture(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2efeefe43c3486e327ead1f68702bff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2efeefe43c3486e327ead1f68702bff0");
        } else if (!Environment.getExternalStorageState().equals("mounted")) {
            jsFailedCallback(-1, "internal error");
        } else {
            jsHost().getCapture(this.type, new BitmapCallbackListener() { // from class: com.dianping.titans.js.jshandler.CaptureJsHandler.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.titans.js.jshandler.CaptureJsHandler.BitmapCallbackListener
                public void onGetBitmap(final Bitmap bitmap, final Bitmap.CompressFormat compressFormat) {
                    Object[] objArr2 = {bitmap, compressFormat};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fc30db0148ef887a37e1879fb92a72c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fc30db0148ef887a37e1879fb92a72c2");
                    } else {
                        KNBRuntime.getRuntime().executeOnThreadPool(new Runnable() { // from class: com.dianping.titans.js.jshandler.CaptureJsHandler.2.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Uri saveBitmapToPublicDirectory;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "3c33802d7e12bf2013e90922bb39ff0d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "3c33802d7e12bf2013e90922bb39ff0d");
                                    return;
                                }
                                if (bitmap != null) {
                                    try {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            saveBitmapToPublicDirectory = AndroidAdapter.saveBitmapToPublicDirectory(CaptureJsHandler.this.jsHost().getContext(), Environment.DIRECTORY_SCREENSHOTS, compressFormat, bitmap, str);
                                        } else {
                                            saveBitmapToPublicDirectory = AndroidAdapter.saveBitmapToPublicDirectory(CaptureJsHandler.this.jsHost().getContext(), Environment.DIRECTORY_PICTURES, compressFormat, bitmap, str);
                                        }
                                        String build = new LocalIdUtils.Builder(saveBitmapToPublicDirectory).appendToken(str).build();
                                        if (TextUtils.isEmpty(build)) {
                                            CaptureJsHandler.this.jsFailedCallback(-1, "localId empty");
                                            return;
                                        }
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put(DeviceInfo.LOCAL_ID, build);
                                        CaptureJsHandler.this.jsCallback(jSONObject);
                                        return;
                                    } catch (Throwable unused) {
                                    }
                                }
                                CaptureJsHandler.this.jsFailedCallback(-1, "internal error");
                            }
                        });
                    }
                }

                @Override // com.dianping.titans.js.jshandler.CaptureJsHandler.BitmapCallbackListener
                public void onOOM() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "679be7630dc7d78d17674f9967ffd4f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "679be7630dc7d78d17674f9967ffd4f5");
                    } else {
                        CaptureJsHandler.this.jsFailedCallback(-1, "internal error oom");
                    }
                }

                @Override // com.dianping.titans.js.jshandler.CaptureJsHandler.BitmapCallbackListener
                public void onTimeOut() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2ed449732a752f5b1e938560e3db0f21", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2ed449732a752f5b1e938560e3db0f21");
                    } else {
                        CaptureJsHandler.this.jsFailedCallback(-1, "internal error timeout");
                    }
                }
            });
        }
    }
}
