package com.dianping.titans.js.jshandler;

import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.utils.ContentResolverProvider;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ChooseFileJsHandler extends BaseJsHandler {
    private static final int REQUEST_CODE_LOCAL = 101;
    public static final String RETURN_KEY = "fileInfos";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef28ef5e4833e9e5c40c5dc18f0c6044", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef28ef5e4833e9e5c40c5dc18f0c6044");
            return;
        }
        final String sceneToken = getSceneToken();
        TitansPermissionUtil.requestPermission(jsHost().getActivity(), PermissionGuard.PERMISSION_STORAGE_READ, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.ChooseFileJsHandler.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.result.IRequestPermissionCallback
            public void onResult(boolean z, int i) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2f046fab03de0f4829af98facba09de7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2f046fab03de0f4829af98facba09de7");
                } else if (z) {
                    ChooseFileJsHandler.this.openFileExplorer(ChooseFileJsHandler.this.jsBean().argsJson.optBoolean("enableMultiple"), ChooseFileJsHandler.this.jsBean().argsJson.optString("acceptMIMEType"));
                } else {
                    ChooseFileJsHandler chooseFileJsHandler = ChooseFileJsHandler.this;
                    chooseFileJsHandler.jsCallbackError(i, "no permission for storage，sceneToken:" + sceneToken);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openFileExplorer(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ba469c719854c5a56f90096c74f756e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ba469c719854c5a56f90096c74f756e");
            return;
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        if (TextUtils.isEmpty(str)) {
            intent.setType("*/*");
        } else {
            String[] split = str.split(CommonConstant.Symbol.COMMA);
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.MIME_TYPES", split);
        }
        try {
            jsHost().startActivityForResult(intent, 101);
        } catch (Exception unused) {
            jsCallbackError(500, "Start activity error!");
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72789ee7b638dc59855bc2d97622f051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72789ee7b638dc59855bc2d97622f051");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 101) {
            if (i2 == -1 && intent != null) {
                if (intent.getData() != null) {
                    ArrayList<Uri> arrayList = new ArrayList<>();
                    arrayList.add(intent.getData());
                    callbackFromLocal(arrayList);
                    return;
                } else if (intent.getClipData() != null) {
                    ClipData clipData = intent.getClipData();
                    ArrayList<Uri> arrayList2 = new ArrayList<>();
                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                        arrayList2.add(clipData.getItemAt(i3).getUri());
                    }
                    callbackFromLocal(arrayList2);
                    return;
                } else {
                    callbackFromLocal(new ArrayList<>());
                    return;
                }
            }
            callbackFromLocal(new ArrayList<>());
        }
    }

    private void callbackFromLocal(ArrayList<Uri> arrayList) {
        Cursor cursor;
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1205124e5acfc3f6df8f2e596705777e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1205124e5acfc3f6df8f2e596705777e");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        if (arrayList.size() > 0) {
            Iterator<Uri> it = arrayList.iterator();
            while (it.hasNext()) {
                Uri next = it.next();
                Cursor cursor2 = null;
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        cursor = ContentResolverProvider.getContentResolver(jsHost().getContext(), getSceneToken()).a(next, null, null, null, null);
                        if (cursor != null) {
                            try {
                                if (cursor.moveToFirst()) {
                                    int columnIndex = cursor.getColumnIndex("_size");
                                    String string = !cursor.isNull(columnIndex) ? cursor.getString(columnIndex) : "Unknown";
                                    int columnIndex2 = cursor.getColumnIndex("_display_name");
                                    jSONObject.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, string);
                                    jSONObject.put("name", cursor.getString(columnIndex2));
                                    cursor.close();
                                }
                            } catch (Exception e) {
                                e = e;
                                cursor2 = cursor;
                                try {
                                    jSONObject.put("cursorError", Log.getStackTraceString(e));
                                } catch (JSONException unused) {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        try {
                            jSONObject.put(DeviceInfo.LOCAL_ID, new LocalIdUtils.Builder(next).appendToken(getSceneToken()).build(next.toString()));
                        } catch (JSONException unused2) {
                        }
                        jSONArray.put(jSONObject);
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursor2;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }
        callbackData(jSONArray);
    }

    private void callbackData(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff8d9036dedd5d921ad3bc49b476d0bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff8d9036dedd5d921ad3bc49b476d0bb");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RETURN_KEY, jSONArray);
            jsCallback(jSONObject);
        } catch (JSONException unused) {
            jsCallbackError(521, "params change error");
        }
    }
}
