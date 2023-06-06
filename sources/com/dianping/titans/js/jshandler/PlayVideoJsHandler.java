package com.dianping.titans.js.jshandler;

import android.content.Intent;
import android.net.Uri;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.titans.widget.MediaWidget;
import com.sankuai.titans.widget.PlayerBuilder;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PlayVideoJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9b1894cf15ddc026438f509ba7309a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9b1894cf15ddc026438f509ba7309a3");
        } else if (this.mJsBean.argsJson == null) {
            jsCallbackError(520, "no host");
        } else if (jsHost() == null || jsHost().getActivity() == null) {
            jsCallbackError(520, "no host");
        } else {
            Uri uri = LocalIdUtils.getUri(this.mJsBean.argsJson.optString("video"));
            if (uri == null) {
                jsCallbackError(500, "no file");
                return;
            }
            try {
                playVideo(uri);
                jsCallback();
            } catch (Exception e) {
                jsCallbackError(500, e.getMessage());
            }
        }
    }

    private void playVideo(final Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b032bdf6c4956bec6f66090e07f0a3fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b032bdf6c4956bec6f66090e07f0a3fa");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, "video/mp4");
            jsHost().getActivity().startActivity(intent);
        } catch (Exception e) {
            final String sceneToken = getSceneToken();
            TitansPermissionUtil.requestPermission(jsHost().getActivity(), PermissionGuard.PERMISSION_STORAGE_READ, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.PlayVideoJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7da336e8e7a6455aa5e8c9002bc580de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7da336e8e7a6455aa5e8c9002bc580de");
                    } else if (!z) {
                        PlayVideoJsHandler playVideoJsHandler = PlayVideoJsHandler.this;
                        playVideoJsHandler.jsCallbackError(i, "no permission for storage，sceneToken:" + sceneToken);
                    } else {
                        try {
                            ArrayList<String> arrayList = new ArrayList<>();
                            arrayList.add(uri.toString());
                            PlayerBuilder playerBuilder = new PlayerBuilder();
                            playerBuilder.assets(arrayList);
                            playerBuilder.showDownload(false);
                            playerBuilder.accessToken(sceneToken);
                            MediaWidget.getInstance().openMediaPlayer(PlayVideoJsHandler.this.jsHost().getActivity(), playerBuilder);
                        } catch (Exception unused) {
                            PlayVideoJsHandler.this.jsCallbackError(500, e.getMessage());
                        }
                    }
                }
            });
        }
    }
}
