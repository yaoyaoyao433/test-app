package com.meituan.mmp.lib.api.device;

import android.content.Intent;
import com.meituan.mmp.lib.api.device.AbsScanCodeModule;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class InternalScanCodeModule extends AbsScanCodeModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ScanCode extends AbsScanCodeModule.AbsScanCode {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsScanCodeModule.ScanCodeParams scanCodeParams, IApiCallback iApiCallback) {
            Object[] objArr = {str, scanCodeParams, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c646fb0a1267905825b3a6cf32fadb1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c646fb0a1267905825b3a6cf32fadb1");
                return;
            }
            try {
                Intent intent = new Intent();
                intent.setClassName(getContext(), "com.meituan.mmp.lib.scancode.ui.activity.ScanCaptureUI");
                startActivityForResult(intent, iApiCallback);
            } catch (Exception e) {
                com.meituan.mmp.lib.trace.b.a(e);
                a(-1, "start scanner activity failed", iApiCallback);
            }
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
        public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
            Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "588524776fdf9153332cda73bc37dfcb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "588524776fdf9153332cda73bc37dfcb");
            } else if (i != -1) {
                iApiCallback.onCancel();
            } else if (intent == null) {
                iApiCallback.onFail(null);
            } else {
                AbsScanCodeModule.ScanCodeResult scanCodeResult = new AbsScanCodeModule.ScanCodeResult();
                scanCodeResult.result = f.a(intent, "result_url");
                scanCodeResult.scanType = f.a(intent, "scanType");
                a(scanCodeResult, iApiCallback);
            }
        }
    }
}
