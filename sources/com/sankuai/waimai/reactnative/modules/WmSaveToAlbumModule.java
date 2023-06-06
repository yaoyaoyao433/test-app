package com.sankuai.waimai.reactnative.modules;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.FileUtils;
import com.tencent.connect.share.QzonePublish;
import java.io.File;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WmSaveToAlbumModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "WMSaveToAlbumModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return REACT_CLASS;
    }

    public WmSaveToAlbumModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52ad4582fbb84ff4942323d780ad3f37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52ad4582fbb84ff4942323d780ad3f37");
        }
    }

    @ReactMethod
    public void saveToAlbum(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8a8daa2b6e3bf6d8ee53f0e437006b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8a8daa2b6e3bf6d8ee53f0e437006b3");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        boolean z = readableMap.getBoolean("isSaveVideo");
        String string = readableMap.getString(QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH);
        if (z) {
            sendScanVideo(currentActivity, string);
        } else {
            FileUtils.deleteFile(string);
        }
    }

    private void sendScanVideo(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81378379eb1599d10f1c842aaaa07845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81378379eb1599d10f1c842aaaa07845");
        } else if (FileUtils.isFileExist(str)) {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(new File(str)));
            activity.sendBroadcast(intent);
        }
    }
}
