package com.sankuai.titans.protocol.webcompat.jshost;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.sankuai.titans.protocol.bean.HostState;
import com.sankuai.titans.protocol.context.ITitansContext;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface AbsJsHost {
    Activity getActivity();

    JSONObject getActivityResult();

    @NonNull
    IBridgeManager getBridgeManager();

    @NonNull
    IBridgePubSub getBridgePubSub();

    @NonNull
    Context getContext();

    HostState getHostState();

    @NonNull
    AbsMsgCenter getMsgCenter();

    ITitansWebPageContext getPageContext();

    @NonNull
    ITitansContext getTitansContext();

    IUIManager getUiManager();

    void onActivityResult(int i, int i2, Intent intent);

    void onDestroy();

    void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);

    void registerActivityResultListener(int i, ActivityResultListener activityResultListener);

    void registerRequestPermissionResultListener(int i, RequestPermissionsResultListener requestPermissionsResultListener);

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i);

    void unregisterActivityResultListener(int i, ActivityResultListener activityResultListener);

    void unregisterRequestPermissionResultListener(int i, RequestPermissionsResultListener requestPermissionsResultListener);
}
