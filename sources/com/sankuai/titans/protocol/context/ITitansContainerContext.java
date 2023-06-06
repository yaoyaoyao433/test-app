package com.sankuai.titans.protocol.context;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.ActionMode;
import android.webkit.ValueCallback;
import com.sankuai.titans.protocol.services.IContainerAdapter;
import com.sankuai.titans.protocol.utils.OnWebEventListener;
import com.sankuai.titans.protocol.webcompat.jshost.IBridgePubSub;
import com.sankuai.titans.protocol.webcompat.jshost.RequestPermissionsResultListener;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ITitansContainerContext {
    Activity getActivity();

    @NonNull
    IBridgePubSub getBridgePubSub();

    IContainerAdapter getContainerAdapter();

    Bundle getExtraBundle();

    ITitansContext getTitansContext();

    String getWebViewKernel();

    void loadJs(String str, ValueCallback valueCallback);

    void registerRequestPermissionResultListener(int i, RequestPermissionsResultListener requestPermissionsResultListener);

    void registerWebEventListener(OnWebEventListener onWebEventListener);

    void setActionModeCallback(ActionMode.Callback callback);

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i);

    void unregisterRequestPermissionResultListener(int i, RequestPermissionsResultListener requestPermissionsResultListener);

    void unregisterWebEventListener(OnWebEventListener onWebEventListener);
}
