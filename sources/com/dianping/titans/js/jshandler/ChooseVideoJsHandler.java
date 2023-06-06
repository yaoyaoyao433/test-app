package com.dianping.titans.js.jshandler;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.provider.MediaStore;
import com.dianping.titans.utils.ContentResolverProvider;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.titans.widget.IWidgetFinishListener;
import com.sankuai.titans.widget.MediaWidget;
import com.sankuai.titans.widget.PickerBuilder;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ChooseVideoJsHandler extends BaseJsHandler implements IWidgetFinishListener {
    private static final String MAX_DURATION = "maxDuration";
    private static final String MIN_DURATION = "minDuration";
    protected static final String[] Media_Columns = {"_id", "mime_type", "_size", "duration"};
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface ScanFileCallback {
        void onFail(Exception exc);

        void onSuccess(JSONObject jSONObject);
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0dd4ee34cb2a4cdecd3522b0f4d2a09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0dd4ee34cb2a4cdecd3522b0f4d2a09");
        } else {
            chooseVideo(jsBean().argsJson);
        }
    }

    private void chooseVideo(JSONObject jSONObject) {
        double d;
        double d2;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89d6f55482225fb6e1de381fb6de2e9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89d6f55482225fb6e1de381fb6de2e9b");
        } else if (jSONObject == null) {
            jsCallbackError(KNBJsErrorInfo.Error_520_Params_Not_Enough.getErrorCode(), "no args");
        } else if (jsHost() == null || jsHost().getActivity() == null) {
            jsCallbackError(KNBJsErrorInfo.Error_5_Container_Type_Not_Support.getErrorCode(), "no host");
        } else {
            final Activity activity = jsHost().getActivity();
            JSONArray optJSONArray = jSONObject.optJSONArray("source");
            final PickerBuilder pickerBuilder = new PickerBuilder();
            boolean has = jSONObject.has(MAX_DURATION);
            if (has) {
                d = optDouble(jSONObject, MAX_DURATION, -1.0d).doubleValue();
                if (d <= 0.0d) {
                    jsCallbackError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorCode(), "maxDuration Parameter Less than or equal to 0!");
                    return;
                }
                pickerBuilder.maxDuration((int) d);
            } else {
                d = 0.0d;
            }
            boolean has2 = jSONObject.has(MIN_DURATION);
            if (has2) {
                d2 = optDouble(jSONObject, MIN_DURATION, -1.0d).doubleValue();
                if (d2 < 0.0d) {
                    jsCallbackError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorCode(), "minDuration Parameter less than 0!");
                    return;
                }
                pickerBuilder.minDuration((int) d2);
            } else {
                d2 = 0.0d;
            }
            if (has && has2 && d <= d2) {
                jsCallbackError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorCode(), "maxDuration Parameter less than or equal to minDuration Parameter!");
                return;
            }
            pickerBuilder.mediaType("video").mediaSize("original");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                String[] strArr = new String[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    strArr[i] = optJSONArray.optString(i);
                }
                pickerBuilder.source(strArr);
            } else {
                pickerBuilder.source("");
            }
            pickerBuilder.finishListener(this);
            pickerBuilder.accessToken(getSceneToken());
            boolean z = pickerBuilder.getBundle().getBoolean(PickerBuilder.EXTRA_SHOW_CAMERA);
            final String sceneToken = getSceneToken();
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(PermissionGuard.PERMISSION_CAMERA);
                arrayList.add(PermissionGuard.PERMISSION_STORAGE);
                TitansPermissionUtil.requestPermissions(activity, arrayList, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.ChooseVideoJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.result.IRequestPermissionCallback
                    public void onResult(boolean z2, int i2) {
                        Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5fe3b106900561a873552e588078af73", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5fe3b106900561a873552e588078af73");
                        } else if (z2) {
                            MediaWidget.getInstance().openMediaPicker(activity, pickerBuilder);
                        } else {
                            ChooseVideoJsHandler chooseVideoJsHandler = ChooseVideoJsHandler.this;
                            chooseVideoJsHandler.jsCallbackError(i2, "requestPermission error sceneToken is " + sceneToken);
                        }
                    }
                });
                return;
            }
            TitansPermissionUtil.requestPermission(activity, PermissionGuard.PERMISSION_STORAGE_READ, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.ChooseVideoJsHandler.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z2, int i2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "666e2be4fdc84a548fcf319682c53180", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "666e2be4fdc84a548fcf319682c53180");
                    } else if (z2) {
                        MediaWidget.getInstance().openMediaPicker(activity, pickerBuilder);
                    } else {
                        ChooseVideoJsHandler chooseVideoJsHandler = ChooseVideoJsHandler.this;
                        chooseVideoJsHandler.jsCallbackError(i2, "requestPermission error sceneToken is " + sceneToken);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    @Override // com.sankuai.titans.widget.IWidgetFinishListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResult(java.util.ArrayList<java.lang.String> r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.titans.js.jshandler.ChooseVideoJsHandler.onResult(java.util.ArrayList, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scanFile(String str, final ScanFileCallback scanFileCallback) {
        Object[] objArr = {str, scanFileCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8efa425d929323438d088bfed7a6f840", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8efa425d929323438d088bfed7a6f840");
            return;
        }
        final Context context = jsHost().getContext();
        MediaScannerConnection.scanFile(context, new String[]{str}, new String[]{"video/mp4"}, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.dianping.titans.js.jshandler.ChooseVideoJsHandler.4
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: Exception -> 0x0068, all -> 0x00fa, TRY_LEAVE, TryCatch #2 {Exception -> 0x0068, blocks: (B:10:0x002d, B:12:0x0033, B:14:0x005a, B:16:0x0062, B:22:0x0071), top: B:57:0x002d }] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onScanCompleted(java.lang.String r13, android.net.Uri r14) {
                /*
                    Method dump skipped, instructions count: 263
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dianping.titans.js.jshandler.ChooseVideoJsHandler.AnonymousClass4.onScanCompleted(java.lang.String, android.net.Uri):void");
            }
        });
    }

    public String getRealPathFromURI(Context context, Uri uri) {
        Cursor a;
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa0aa06f32797fd5a0177fc5e5b3c2eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa0aa06f32797fd5a0177fc5e5b3c2eb");
        }
        Cursor cursor = null;
        try {
            try {
                a = ContentResolverProvider.getContentResolver(context, getSceneToken()).a(uri, new String[]{"_data"}, null, null, null);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            int columnIndexOrThrow = a.getColumnIndexOrThrow("_data");
            a.moveToFirst();
            String string = a.getString(columnIndexOrThrow);
            if (a != null) {
                a.close();
            }
            return string;
        } catch (Exception e2) {
            e = e2;
            cursor = a;
            e.printStackTrace();
            if (cursor != null) {
                cursor.close();
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            cursor = a;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Cursor getCursor(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f673d2396edad0d7faca70a317a52eb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f673d2396edad0d7faca70a317a52eb3");
        }
        if (LocalIdUtils.isContentResource(str)) {
            return ContentResolverProvider.getContentResolver(context, getSceneToken()).a(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, Media_Columns, "_id=?", new String[]{str.substring(str.lastIndexOf("/") + 1)}, null);
        }
        return ContentResolverProvider.getContentResolver(context, getSceneToken()).a(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, Media_Columns, "_data=?", new String[]{str}, null);
    }

    public Double optDouble(JSONObject jSONObject, String str, double d) {
        Object[] objArr = {jSONObject, str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c437ce44657ef84c16876843180a4fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c437ce44657ef84c16876843180a4fc");
        }
        Object opt = jSONObject.opt(str);
        if (opt instanceof Double) {
            return (Double) opt;
        }
        if (opt instanceof Number) {
            return Double.valueOf(((Number) opt).doubleValue());
        }
        return Double.valueOf(d);
    }
}
