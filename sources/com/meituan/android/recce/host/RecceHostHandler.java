package com.meituan.android.recce.host;

import com.meituan.android.recce.c;
import com.meituan.android.recce.exception.RecceException;
import com.meituan.android.recce.h;
import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class RecceHostHandler implements HostHandler {
    private static final String TAG = "RecceHostHandler";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final c recceInstanceManager;
    private h rootView;

    public RecceHostHandler(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6a3357a909483a2b9a25a3d5e764f4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6a3357a909483a2b9a25a3d5e764f4e");
            return;
        }
        this.recceInstanceManager = cVar;
        this.rootView = cVar.e;
    }

    @Override // com.meituan.android.recce.host.HostHandler
    public final void applyViewChanged(int i, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06c45071b8ae3c782bdb346cae0abb3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06c45071b8ae3c782bdb346cae0abb3d");
        } else {
            this.recceInstanceManager.c.a().runOnNativeModulesQueueThread(RecceHostHandler$$Lambda$1.lambdaFactory$(this, new BinReader(bArr).len(i)));
        }
    }

    public static /* synthetic */ void lambda$applyViewChanged$0(RecceHostHandler recceHostHandler, BinReader binReader) {
        Object[] objArr = {recceHostHandler, binReader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "40ef3f6e942f3f2c30ae5b3711bf8806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "40ef3f6e942f3f2c30ae5b3711bf8806");
            return;
        }
        try {
            recceHostHandler.recceInstanceManager.b.recceApplyAllViewChanged(recceHostHandler.rootView.getId(), binReader);
        } catch (Throwable th) {
            com.dianping.networklog.c.a("RecceHostHandler: applyViewChanged exception " + th.getMessage(), 3, new String[]{"Recce-Android"});
            recceHostHandler.recceInstanceManager.a(RecceException.UPDATE_VIEW_FAILED, th);
        }
    }

    @Override // com.meituan.android.recce.host.HostHandler
    public final void asyncInvokeBridge(String str, String str2, AsyncCallback asyncCallback) {
        Object[] objArr = {str, str2, asyncCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a78903b5cf47f912cacf807efe929caa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a78903b5cf47f912cacf807efe929caa");
        } else {
            this.recceInstanceManager.b().asyncInvokeBridge(str, str2, asyncCallback);
        }
    }

    @Override // com.meituan.android.recce.host.HostHandler
    public final byte[] syncInvokeBridge(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce9db8d6dd7798e88ee65f694c4b7cff", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce9db8d6dd7798e88ee65f694c4b7cff") : this.recceInstanceManager.b().syncInvokeBridge(str, str2);
    }

    @Override // com.meituan.android.recce.host.HostHandler
    public final void reportError(int i, int i2, int i3, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6c7c9b2bb66586081f5289b04b6521f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6c7c9b2bb66586081f5289b04b6521f");
        } else {
            RecceReportUtils.reportError(this.recceInstanceManager.j, this.recceInstanceManager.i, i, i2, i3, str, str2);
        }
    }

    @Override // com.meituan.android.recce.host.HostHandler
    public final String[] getViewManagerNameList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3e25f3fa632d71a89e4abde46f11756", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3e25f3fa632d71a89e4abde46f11756") : this.recceInstanceManager.b.viewManagerNameList;
    }
}
