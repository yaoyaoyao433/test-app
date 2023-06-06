package com.meituan.android.mrn.services;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import com.dianping.titans.js.BridgeManager;
import com.dianping.titans.js.CommonJsHost;
import com.dianping.titans.js.jshandler.CaptureJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    CommonJsHost b;
    List<BridgeManager> c;

    public a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb8f5e5f80995e150a45d28d6e679d80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb8f5e5f80995e150a45d28d6e679d80");
            return;
        }
        this.c = new CopyOnWriteArrayList();
        this.b = new CommonJsHost(activity) { // from class: com.meituan.android.mrn.services.a.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.titans.js.CommonJsHost, com.dianping.titans.js.JsHost
            public final void getCapture(String str, CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener) {
                Object[] objArr2 = {str, bitmapCallbackListener};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3144ccd070501d912c2cc0d943147cae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3144ccd070501d912c2cc0d943147cae");
                    return;
                }
                try {
                    bitmapCallbackListener.onGetBitmap(com.meituan.android.mrn.utils.b.a(this.activity), Bitmap.CompressFormat.JPEG);
                } catch (OutOfMemoryError unused) {
                    bitmapCallbackListener.onOOM();
                    com.facebook.common.logging.a.b("[KNBBridgeHost@getCapture]", String.format("method:getCapture captureType:%s", str));
                }
            }
        };
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7140443d0453e7b0b8081f66c82dbd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7140443d0453e7b0b8081f66c82dbd9");
        } else if (this.b != null) {
            this.b.publish(str);
        }
    }

    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85d7d416aa6f7866c783457087a9d706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85d7d416aa6f7866c783457087a9d706");
            return;
        }
        for (BridgeManager bridgeManager : this.c) {
            bridgeManager.onActivityResult(i, i2, intent);
        }
    }
}
