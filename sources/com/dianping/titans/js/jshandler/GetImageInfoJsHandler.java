package com.dianping.titans.js.jshandler;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.utils.ContentResolverProvider;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.sankuai.meituan.android.knb.util.ImageUtils;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import java.io.File;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetImageInfoJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea32fd86962c096009463007ac74dfa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea32fd86962c096009463007ac74dfa4");
        } else if (jsHost() == null) {
            jsCallbackErrorMsg("no host");
        } else {
            String optString = jsBean().argsJson.optString("image");
            if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("input error");
                return;
            }
            final Uri uri = LocalIdUtils.getUri(optString);
            if (uri == null) {
                jsCallbackErrorMsg("no file");
                return;
            }
            final String sceneToken = getSceneToken();
            TitansPermissionUtil.requestPermission(jsHost().getActivity(), PermissionGuard.PERMISSION_STORAGE_READ, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.GetImageInfoJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ae6a951f1f43f8a480113f28f20400af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ae6a951f1f43f8a480113f28f20400af");
                    } else if (!z) {
                        GetImageInfoJsHandler getImageInfoJsHandler = GetImageInfoJsHandler.this;
                        getImageInfoJsHandler.jsCallbackError(i, "no permission for storage read，sceneToken:" + sceneToken);
                    } else {
                        KNBRuntime.getRuntime().executeOnThreadPool(new Runnable() { // from class: com.dianping.titans.js.jshandler.GetImageInfoJsHandler.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c974355c1b1fa04abd95b20f727d32f0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c974355c1b1fa04abd95b20f727d32f0");
                                } else {
                                    GetImageInfoJsHandler.this.execImpl(GetImageInfoJsHandler.this.jsHost().getContext(), uri, sceneToken);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void execImpl(Context context, Uri uri, String str) {
        String mimeTypeFromExtension;
        long length;
        ExifInterface exifInterface;
        int[] bitmapSize;
        Object[] objArr = {context, uri, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9eb9b0ea64a34210b1ca463e5dedbf85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9eb9b0ea64a34210b1ca463e5dedbf85");
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            if (Build.VERSION.SDK_INT >= 24 && LocalIdUtils.isContentResource(uri.toString())) {
                ParcelFileDescriptor a = ContentResolverProvider.getContentResolver(context, str).a(uri, r.o);
                try {
                    long statSize = a.getStatSize();
                    ExifInterface exifInterface2 = new ExifInterface(a.getFileDescriptor());
                    mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(CommonConstant.File.JPG);
                    parcelFileDescriptor = a;
                    exifInterface = exifInterface2;
                    length = statSize;
                } catch (Throwable th) {
                    th = th;
                    parcelFileDescriptor = a;
                    try {
                        jsCallbackErrorMsg("inner err: " + Log.getStackTraceString(th));
                        return;
                    } finally {
                        IOUtils.close(parcelFileDescriptor);
                    }
                }
            } else {
                File file = new File(uri.getPath());
                if (!file.exists()) {
                    jsCallbackErrorMsg("no file");
                    return;
                }
                String path = file.getPath();
                int lastIndexOf = path.lastIndexOf(46);
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((lastIndexOf == -1 || lastIndexOf >= path.length() - 1) ? CommonConstant.File.JPG : path.substring(lastIndexOf + 1));
                length = file.length();
                exifInterface = new ExifInterface(path);
            }
            int attributeInt = exifInterface.getAttributeInt("ImageWidth", 0);
            int attributeInt2 = exifInterface.getAttributeInt("ImageLength", 0);
            if ((attributeInt == 0 || attributeInt2 == 0) && (bitmapSize = ImageUtils.getBitmapSize(jsHost().getContext(), uri.toString(), str)) != null && bitmapSize.length == 2) {
                attributeInt = bitmapSize[0];
                attributeInt2 = bitmapSize[1];
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", mimeTypeFromExtension);
            jSONObject.put("width", attributeInt);
            jSONObject.put("height", attributeInt2);
            jSONObject.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, length);
            jSONObject.put(WmChooseMediaModule.TYPE_CAMERA, exifInterface.getAttribute("Make") + ";" + exifInterface.getAttribute("Model"));
            jSONObject.put("datetime", exifInterface.getAttribute("DateTime"));
            jSONObject.put(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, exifInterface.getAttributeInt("Orientation", 0));
            jSONObject.put(Constants.PRIVACY.KEY_LATITUDE, dms2decimal(exifInterface.getAttribute("GPSLatitude")));
            jSONObject.put(Constants.PRIVACY.KEY_LONGITUDE, dms2decimal(exifInterface.getAttribute("GPSLongitude")));
            jsCallback(jSONObject);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private double dms2decimal(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5512c048be2d32106ddf9d73a7d66bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5512c048be2d32106ddf9d73a7d66bb")).doubleValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return 0.0d;
            }
            if (str.indexOf(44) == -1) {
                return Double.parseDouble(str);
            }
            String[] split = str.split(CommonConstant.Symbol.COMMA);
            return calculateDivVal(split[0]) + ((calculateDivVal(split[1]) + (calculateDivVal(split[2]) / 60.0d)) / 60.0d);
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }

    private double calculateDivVal(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d08376517adaad81377c1a9e0c22e6d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d08376517adaad81377c1a9e0c22e6d")).doubleValue();
        }
        String[] split = str.split("/");
        return Double.parseDouble(split[0].trim()) / Double.parseDouble(split[1].trim());
    }
}
