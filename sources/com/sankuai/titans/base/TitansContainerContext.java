package com.sankuai.titans.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.ActionMode;
import android.webkit.ValueCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.context.ITitansContainerContext;
import com.sankuai.titans.protocol.context.ITitansContext;
import com.sankuai.titans.protocol.services.IContainerAdapter;
import com.sankuai.titans.protocol.utils.OnWebEventListener;
import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
import com.sankuai.titans.protocol.webcompat.jshost.IBridgePubSub;
import com.sankuai.titans.protocol.webcompat.jshost.RequestPermissionsResultListener;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class TitansContainerContext implements ITitansContainerContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Activity activity;
    private final IContainerAdapter adapter;
    private final Bundle bundle;
    private final AbsJsHost jsHost;
    private final ITitansContext titansContext;

    public TitansContainerContext(ITitansContext iTitansContext, Activity activity, Bundle bundle, IContainerAdapter iContainerAdapter, AbsJsHost absJsHost) {
        Object[] objArr = {iTitansContext, activity, bundle, iContainerAdapter, absJsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c047fd596edf4f31b7ab6bbf52a67a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c047fd596edf4f31b7ab6bbf52a67a2");
            return;
        }
        this.titansContext = iTitansContext;
        this.activity = activity;
        this.bundle = bundle;
        this.jsHost = absJsHost;
        this.adapter = iContainerAdapter;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContainerContext
    public final ITitansContext getTitansContext() {
        return this.titansContext;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContainerContext
    public final IContainerAdapter getContainerAdapter() {
        return this.adapter;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContainerContext
    public final Activity getActivity() {
        return this.activity;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContainerContext
    public final Bundle getExtraBundle() {
        return this.bundle;
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContainerContext
    public final void loadJs(String str, ValueCallback valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bccb89c14259f525b46d3dafd8e133ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bccb89c14259f525b46d3dafd8e133ce");
        } else {
            this.jsHost.getUiManager().loadJs(str, valueCallback);
        }
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContainerContext
    public final void registerRequestPermissionResultListener(int i, RequestPermissionsResultListener requestPermissionsResultListener) {
        Object[] objArr = {Integer.valueOf(i), requestPermissionsResultListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99330019daded5f5ba50d6f5d1fd9f19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99330019daded5f5ba50d6f5d1fd9f19");
        } else {
            this.jsHost.registerRequestPermissionResultListener(i, requestPermissionsResultListener);
        }
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContainerContext
    public final void unregisterRequestPermissionResultListener(int i, RequestPermissionsResultListener requestPermissionsResultListener) {
        Object[] objArr = {Integer.valueOf(i), requestPermissionsResultListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00496240be7978f57906ed1c162d64a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00496240be7978f57906ed1c162d64a2");
        } else {
            this.jsHost.unregisterRequestPermissionResultListener(i, requestPermissionsResultListener);
        }
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContainerContext
    public final void setActionModeCallback(ActionMode.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70e0622bc73bd967d40c6498d69ec7ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70e0622bc73bd967d40c6498d69ec7ab");
        } else {
            this.jsHost.getUiManager().setActionModeCallback(callback);
        }
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContainerContext
    public final void registerWebEventListener(OnWebEventListener onWebEventListener) {
        Object[] objArr = {onWebEventListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29a3a4d5f271600db62746a8787add9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29a3a4d5f271600db62746a8787add9b");
        } else {
            this.jsHost.getUiManager().registerWebEventListener(onWebEventListener);
        }
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContainerContext
    public final void unregisterWebEventListener(OnWebEventListener onWebEventListener) {
        Object[] objArr = {onWebEventListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37b60852da6f17a4ba16d7d47013e978", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37b60852da6f17a4ba16d7d47013e978");
        } else {
            this.jsHost.getUiManager().unregisterWebEventListener(onWebEventListener);
        }
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContainerContext
    @NonNull
    public final IBridgePubSub getBridgePubSub() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a758bfcff5d61aab1231e835aef49b9", RobustBitConfig.DEFAULT_VALUE) ? (IBridgePubSub) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a758bfcff5d61aab1231e835aef49b9") : this.jsHost.getBridgePubSub();
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContainerContext
    public final void startActivity(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "971882ce272d671a32a356c29bc6a6cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "971882ce272d671a32a356c29bc6a6cf");
        } else {
            this.jsHost.startActivity(intent);
        }
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContainerContext
    public final void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47df24ac8e4627311417b6efd5b179e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47df24ac8e4627311417b6efd5b179e9");
        } else {
            this.jsHost.startActivityForResult(intent, i);
        }
    }

    @Override // com.sankuai.titans.protocol.context.ITitansContainerContext
    public final String getWebViewKernel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfbdb6afbe37e4a2837c5c85ae5bb5d8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfbdb6afbe37e4a2837c5c85ae5bb5d8") : this.jsHost.getUiManager().getWebViewKernel();
    }
}
