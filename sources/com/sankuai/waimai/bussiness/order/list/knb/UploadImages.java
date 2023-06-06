package com.sankuai.waimai.bussiness.order.list.knb;

import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.reactnative.upload.e;
import com.sankuai.waimai.reactnative.upload.j;
import com.tencent.mapsdk.internal.jw;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UploadImages extends BaseJsHandler implements e {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String DEFAULT_URL;
    private final String PARAMS_IMG_MAXPIXEL;
    private final String PARAMS_IMG_QUALITY;
    private final String PARAMS_KEY_LOCALIDS;
    private final String PARAMS_KEY_URL;
    private final String PERMISSION_TOKEN;
    private final String SCENE_TOKEN;
    private j mImageUploadManager;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "fT5A4Zfh0EL4MjzYvYkFMbrl5lJt39QvLMr/m9KpdZMqWwJ23YECr4TN7GvMevUZSBEGR+DbfRZjJ9EjCqfJVw==";
    }

    public UploadImages() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9eceec8a160fd5dc927a3543f9762297", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9eceec8a160fd5dc927a3543f9762297");
            return;
        }
        this.PARAMS_KEY_LOCALIDS = "localIds";
        this.PERMISSION_TOKEN = "permissionToken";
        this.SCENE_TOKEN = "sceneToken";
        this.PARAMS_IMG_MAXPIXEL = "maxPixel";
        this.PARAMS_IMG_QUALITY = "compressionQuality";
        this.PARAMS_KEY_URL = "url";
        this.DEFAULT_URL = "";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "553f5486adfb86291c625d555dc0848f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "553f5486adfb86291c625d555dc0848f");
        } else if (validateArgs()) {
            if (this.mImageUploadManager == null) {
                this.mImageUploadManager = j.a(jsHost().getContext());
                this.mImageUploadManager.d = false;
            }
            String str = "";
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = jsBean().argsJson;
                if (!TextUtils.isEmpty(jSONObject2.optString("permissionToken"))) {
                    str = jSONObject2.optString("permissionToken");
                } else if (!TextUtils.isEmpty(jSONObject2.optString("sceneToken"))) {
                    str = jSONObject2.optString("sceneToken");
                }
                if (TextUtils.isEmpty(str)) {
                    str = "dj-d2865e42de07ebac";
                }
                String str2 = str;
                JSONArray optJSONArray = jSONObject2.optJSONArray("localIds");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    this.mImageUploadManager.a(jSONObject2.optInt("maxPixel") > 0 ? jSONObject2.optInt("maxPixel") : jw.h, jSONObject2.optInt("compressionQuality") > 0 ? jSONObject2.optInt("compressionQuality") : 75);
                    ArrayList<Object> arrayList = new ArrayList<>();
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            arrayList.add(optJSONArray.getString(i));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        if (!TextUtils.isEmpty(jSONObject2.optString("url"))) {
                            this.mImageUploadManager.a(arrayList, jSONObject2.optString("url"), null, this, str2);
                            return;
                        } else {
                            this.mImageUploadManager.a(arrayList, "", null, this, str2);
                            return;
                        }
                    }
                    jSONObject.put("error", "localIds size 0");
                    jsCallback(jSONObject);
                    return;
                }
                jSONObject.put("error", "localIds size 0");
                jsCallback(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65e363ff3f6e2469f43a5d55805d7c68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65e363ff3f6e2469f43a5d55805d7c68")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }

    private void sendMessageToKnb(String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2aea977c7acd027c2b49620aacf5fc44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2aea977c7acd027c2b49620aacf5fc44");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "KNBOrderUpdateUploadImageStatusAction");
            jSONObject.put("event", str);
            jSONObject.put("data", new JSONObject(writableMap.toHashMap()).toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JsHandlerFactory.publish(jSONObject);
    }

    @Override // com.sankuai.waimai.reactnative.upload.e
    public void sendEvent(String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00de74e3225e62bd5e610b51fd4a2984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00de74e3225e62bd5e610b51fd4a2984");
        } else if ("UploadImageCompleteEvent".equals(str)) {
            jsCallback(new JSONObject());
        } else {
            sendMessageToKnb(str, writableMap);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03b28abe4115f9351795e22722ce11df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03b28abe4115f9351795e22722ce11df");
            return;
        }
        super.onDestroy();
        if (this.mImageUploadManager != null) {
            this.mImageUploadManager.d = true;
            this.mImageUploadManager.a();
        }
    }
}
