package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.AndroidAdapter;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.titans.widget.MediaWidget;
import com.sankuai.titans.widget.PlayerBuilder;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PreviewImageJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf59741faad11435beaaff6b398ba321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf59741faad11435beaaff6b398ba321");
        } else {
            previewImage(jsBean().argsJson);
        }
    }

    public void previewImage(JSONObject jSONObject) {
        boolean z = true;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9802e5e808351a856e5a246dfdfbb46a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9802e5e808351a856e5a246dfdfbb46a");
        } else if (jsHost() == null || jsHost().getActivity() == null) {
            jsCallbackErrorMsg("no host");
        } else {
            final PlayerBuilder playerBuilder = new PlayerBuilder();
            final boolean optBoolean = jSONObject.optBoolean(DMKeys.KEY_SHARE_INFO_ANIMATED, true);
            final JSONArray optJSONArray = jSONObject.optJSONArray("urls");
            final String optString = jSONObject.optString("current");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                jsCallbackErrorMsg("urls empty");
                return;
            }
            int i = 0;
            while (true) {
                if (i >= optJSONArray.length()) {
                    z = false;
                    break;
                }
                String optString2 = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString2) && !URLUtil.isNetworkUrl(optString2)) {
                    break;
                }
                i++;
            }
            String str = z ? PermissionGuard.PERMISSION_STORAGE_READ : null;
            final String sceneToken = getSceneToken();
            if (TextUtils.isEmpty(str)) {
                toPreviewImage(optJSONArray, sceneToken, optString, playerBuilder, optBoolean);
            } else {
                TitansPermissionUtil.checkSelfPermission(jsHost().getActivity(), str, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.PreviewImageJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.titans.result.IRequestPermissionCallback
                    public void onResult(boolean z2, int i2) {
                        Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dbe3c22272b9016219f6faeb0e53d04e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dbe3c22272b9016219f6faeb0e53d04e");
                        } else if (z2) {
                            PreviewImageJsHandler.this.toPreviewImage(optJSONArray, sceneToken, optString, playerBuilder, optBoolean);
                        } else {
                            PreviewImageJsHandler previewImageJsHandler = PreviewImageJsHandler.this;
                            previewImageJsHandler.jsCallbackError(i2, "no storage permission，sceneToken:" + sceneToken);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toPreviewImage(JSONArray jSONArray, String str, String str2, PlayerBuilder playerBuilder, boolean z) {
        Object[] objArr = {jSONArray, str, str2, playerBuilder, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8396890ecf8387db79e78bb564fe009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8396890ecf8387db79e78bb564fe009");
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String optString = jSONArray.optString(i2);
            if (LocalIdUtils.isValid(optString)) {
                if (AndroidAdapter.androidCompatQ()) {
                    arrayList.add(LocalIdUtils.getUri(optString).toString());
                } else {
                    arrayList.add(LocalIdUtils.getFile(optString, str).getAbsolutePath());
                }
            } else {
                arrayList.add(optString);
            }
            if (!TextUtils.isEmpty(str2) && i == -1 && TextUtils.equals(str2, optString)) {
                i = i2;
            }
        }
        if (i == -1) {
            i = 0;
        }
        playerBuilder.assets(arrayList);
        playerBuilder.accessToken(str);
        playerBuilder.firstAssetIndex(i).showIndicate(true).showExitAnimate(z).showDownload(false);
        try {
            MediaWidget.getInstance().openMediaPlayer(jsHost().getActivity(), playerBuilder);
            jsCallback();
        } catch (Exception e) {
            jsCallbackError(8, Log.getStackTraceString(e));
        }
    }
}
