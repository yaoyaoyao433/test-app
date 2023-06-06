package com.meituan.mmp.lib.api.device;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.meituan.mmp.lib.api.device.AbsScanCodeModule;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class MTScanCodeModule extends AbsScanCodeModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ScanCode extends AbsScanCodeModule.AbsScanCode {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.mmp.lib.api.ApiFunction
        public final /* synthetic */ void a(String str, AbsScanCodeModule.ScanCodeParams scanCodeParams, IApiCallback iApiCallback) {
            AbsScanCodeModule.ScanCodeParams scanCodeParams2 = scanCodeParams;
            Object[] objArr = {str, scanCodeParams2, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fdbb194e13e35a27a3db2dd369ffdc5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fdbb194e13e35a27a3db2dd369ffdc5");
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(getContext().getPackageName());
            try {
                intent.setData(Uri.parse(String.format(Locale.ENGLISH, "imeituan://www.meituan.com/scanQRCodeForResult?openAR=0&albumScanEnable=%d&needResult=1", Integer.valueOf(!scanCodeParams2.onlyFromCamera ? 1 : 0))));
                PackageManager packageManager = getContext().getPackageManager();
                if (packageManager == null) {
                    iApiCallback.onFail(null);
                } else if (!com.meituan.mmp.lib.utils.b.a(packageManager, intent)) {
                    Intent intent2 = new Intent();
                    intent2.setClassName(getContext(), "com.meituan.mmp.lib.scancode.ui.activity.ScanCaptureUI");
                    if (com.meituan.mmp.lib.utils.b.a(packageManager, intent2)) {
                        startActivityForResult(intent2, iApiCallback);
                    } else {
                        iApiCallback.onFail(codeJson(-1, "API not found, host need to import mtScan dependencies"));
                    }
                } else {
                    Object[] objArr2 = {scanCodeParams2, intent, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69279268b80bbb20030edda6643551ca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69279268b80bbb20030edda6643551ca");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (scanCodeParams2.scanType != null) {
                        Collections.addAll(arrayList, scanCodeParams2.scanType);
                    }
                    if (arrayList.isEmpty()) {
                        arrayList.add("barCode");
                        arrayList.add("qrCode");
                    }
                    intent.putExtra("scanTypeEnable", true);
                    intent.putExtra("scanType", arrayList);
                    intent.setPackage(getContext().getPackageName());
                    startActivityForResult(intent, iApiCallback);
                }
            } catch (Exception e) {
                com.meituan.mmp.lib.trace.b.a(e);
                iApiCallback.onFail(null);
            }
        }

        @Override // com.meituan.mmp.lib.api.ApiFunction, com.meituan.mmp.lib.api.AbsApi
        public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
            Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53eba6cfde7cdeac09de7f616a51421f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53eba6cfde7cdeac09de7f616a51421f");
            } else if (i != -1) {
                iApiCallback.onCancel();
            } else if (intent == null) {
                iApiCallback.onFail();
            } else {
                AbsScanCodeModule.ScanCodeResult scanCodeResult = new AbsScanCodeModule.ScanCodeResult();
                scanCodeResult.result = f.a(intent, "result_url");
                scanCodeResult.scanType = f.a(intent, "barcode_format");
                a(scanCodeResult, iApiCallback);
            }
        }
    }
}
