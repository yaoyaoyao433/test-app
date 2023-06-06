package com.dianping.titans.js.jshandler;

import android.content.Context;
import android.os.PowerManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AutoLockJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private PowerManager.WakeLock wakeLock;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cceed63022b68378cd665b1f78399f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cceed63022b68378cd665b1f78399f3");
            return;
        }
        int optInt = jsBean().argsJson.optInt("disable", -1);
        if (optInt == -1) {
            return;
        }
        if (optInt == 1) {
            acquireWakeLock();
        } else {
            releaseWakeLock();
        }
        jsCallback();
    }

    private void acquireWakeLock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b0c3ae861da3730a0385999c5d75275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b0c3ae861da3730a0385999c5d75275");
            return;
        }
        Context context = jsHost().getContext();
        if (this.wakeLock != null || context == null) {
            return;
        }
        this.wakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(26, getClass().getCanonicalName());
        this.wakeLock.acquire();
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a56e0481465bc5bc07b98faf991d7a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a56e0481465bc5bc07b98faf991d7a1");
            return;
        }
        super.onDestroy();
        releaseWakeLock();
    }

    private void releaseWakeLock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52b5f8f4a4033b455bcc4b30222ce873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52b5f8f4a4033b455bcc4b30222ce873");
        } else if (this.wakeLock == null || !this.wakeLock.isHeld()) {
        } else {
            this.wakeLock.release();
            this.wakeLock = null;
        }
    }
}
