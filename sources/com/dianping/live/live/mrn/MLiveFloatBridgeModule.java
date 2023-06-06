package com.dianping.live.live.mrn;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.dianping.live.live.livefloat.MLiveFloatPlayerModel;
import com.dianping.live.live.livefloat.MLiveFloatPlayerService;
import com.dianping.live.live.utils.m;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.recce.props.gens.BorderStyle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MLiveFloatBridgeModule extends ReactContextBaseJavaModule {
    private static final int PERMISSION_REQUEST_CODE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private ReactApplicationContext mContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MLiveFloatBridgeModule";
    }

    public MLiveFloatBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88c1e925f770598f993e4b1fef57b18c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88c1e925f770598f993e4b1fef57b18c");
        } else {
            this.mContext = reactApplicationContext;
        }
    }

    @ReactMethod
    public void showMLiveFloat(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de9d382818a43911f5b596b5b75e5626", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de9d382818a43911f5b596b5b75e5626");
            return;
        }
        try {
            Intent intent = new Intent(com.dianping.codelog.b.b(), MLiveFloatPlayerService.class);
            if (!com.dianping.live.live.utils.b.a(com.dianping.codelog.b.b())) {
                if (checkPlayParams(readableMap) || checkPushParams(readableMap)) {
                    MLiveFloatPlayerModel mLiveFloatPlayerModel = new MLiveFloatPlayerModel();
                    if (readableMap.hasKey("playInfo") && readableMap.getMap("playInfo") != null) {
                        mLiveFloatPlayerModel.b = readableMap.getMap("playInfo").toHashMap();
                    }
                    if (readableMap.hasKey("pushInfo") && readableMap.getMap("pushInfo") != null) {
                        mLiveFloatPlayerModel.c = readableMap.getMap("pushInfo").toHashMap();
                    }
                    if (readableMap.hasKey(DMKeys.KEY_JUMP_URL) && readableMap.getString(DMKeys.KEY_JUMP_URL) != null) {
                        mLiveFloatPlayerModel.d = readableMap.getString(DMKeys.KEY_JUMP_URL);
                    }
                    if (readableMap.hasKey("style") && readableMap.getMap("style") != null) {
                        mLiveFloatPlayerModel.e = readableMap.getMap("style").toHashMap();
                    }
                    if (readableMap.hasKey("closeIconStyle") && readableMap.getMap("closeIconStyle") != null) {
                        mLiveFloatPlayerModel.f = readableMap.getMap("closeIconStyle").toHashMap();
                    }
                    if (readableMap.hasKey(BorderStyle.LOWER_CASE_NAME) && readableMap.getMap(BorderStyle.LOWER_CASE_NAME) != null) {
                        mLiveFloatPlayerModel.g = readableMap.getMap(BorderStyle.LOWER_CASE_NAME).toHashMap();
                    }
                    if (readableMap.hasKey("picsInfo") && readableMap.getArray("picsInfo") != null) {
                        mLiveFloatPlayerModel.h = readableMap.getArray("picsInfo").toArrayList();
                    }
                    intent.putExtra("floatplayeraction", "floatplayershow");
                    intent.putExtra("floatplayermodel", mLiveFloatPlayerModel);
                    com.dianping.live.live.utils.g.a();
                    promise.resolve("startFloatService");
                    if (this.mContext != null) {
                        this.mContext.startService(intent);
                        return;
                    }
                    return;
                }
                return;
            }
            showPermissionAlertDialog(promise);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean checkPlayParams(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7b9eda87811b3383ab99ba7eb6a4df5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7b9eda87811b3383ab99ba7eb6a4df5")).booleanValue() : readableMap.hasKey("playInfo") && readableMap.getMap("playInfo") != null;
    }

    private boolean checkPushParams(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25b019873b8db35d2b114e6cfe43b033", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25b019873b8db35d2b114e6cfe43b033")).booleanValue() : readableMap.hasKey("pushInfo") && readableMap.getMap("pushInfo") != null;
    }

    private void showPermissionAlertDialog(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a93dd0ead7fc74cdc2d547da58578b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a93dd0ead7fc74cdc2d547da58578b8");
        } else if (this.mContext == null || this.mContext.getCurrentActivity() == null) {
        } else {
            showNormalDialog(promise);
        }
    }

    private void showNormalDialog(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caebdab70df38d6ae67dd4daed7abb3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caebdab70df38d6ae67dd4daed7abb3b");
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mContext.getCurrentActivity());
        builder.setTitle("权限提示");
        builder.setMessage("在权限管理中开启悬浮窗权限可以通过小窗口形式继续观看直播哦～");
        builder.setPositiveButton("去开启", new DialogInterface.OnClickListener() { // from class: com.dianping.live.live.mrn.MLiveFloatBridgeModule.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4e999366719e23b9dd4984166a6b0e4c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4e999366719e23b9dd4984166a6b0e4c");
                    return;
                }
                promise.resolve("gotoAddPermission");
                MLiveFloatBridgeModule.this.requestAlertWindowPermission();
            }
        });
        builder.setNegativeButton("不看了", new DialogInterface.OnClickListener() { // from class: com.dianping.live.live.mrn.MLiveFloatBridgeModule.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "74c3bcaeec8718d65fb34807bb08fa7d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "74c3bcaeec8718d65fb34807bb08fa7d");
                } else {
                    promise.resolve("cancel");
                }
            }
        });
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestAlertWindowPermission() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9eeaf515643d53cd63725a10eeb25c49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9eeaf515643d53cd63725a10eeb25c49");
        } else if (this.mContext == null || this.mContext.getCurrentActivity() == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                    intent.setData(Uri.parse("package:" + this.mContext.getPackageName()));
                    this.mContext.getCurrentActivity().startActivityForResult(intent, 1);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    com.dianping.codelog.b.b(getClass(), "ACTION_MANAGE_OVERLAY_PERMISSION", com.dianping.util.exception.a.a(e));
                    return;
                }
            }
            try {
                if (m.a() == 8) {
                    Intent intent2 = new Intent();
                    intent2.setAction("miui.intent.action.APP_PERM_EDITOR");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.putExtra("extra_pkgname", this.mContext.getPackageName());
                    this.mContext.getCurrentActivity().startActivityForResult(intent2, 1);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                com.dianping.codelog.b.b(getClass(), "APP_PERM_EDITOR", com.dianping.util.exception.a.a(e2));
            }
        }
    }

    @ReactMethod
    public void dismissMLiveFloat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0340320fb0ced33ef067c7fc531a762", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0340320fb0ced33ef067c7fc531a762");
        } else if (this.mContext == null) {
        } else {
            try {
                Intent intent = new Intent(com.dianping.codelog.b.b(), MLiveFloatPlayerService.class);
                intent.putExtra("floatplayeraction", "floatplayerhide");
                this.mContext.startService(intent);
            } catch (Exception e) {
                e.printStackTrace();
                com.dianping.live.live.utils.j.a("MLive_LogandismissMLiveFloat fail:" + com.dianping.util.exception.a.a(e));
            }
        }
    }

    public static void killMLiveFloat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30c7f69b9eb2da58fbfa7bf69aa0ed45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30c7f69b9eb2da58fbfa7bf69aa0ed45");
            return;
        }
        try {
            Intent intent = new Intent(com.dianping.codelog.b.b(), MLiveFloatPlayerService.class);
            intent.putExtra("floatplayeraction", "floatplayerhide");
            intent.putExtra("needmute", true);
            com.dianping.codelog.b.b().startService(intent);
        } catch (Exception e) {
            e.printStackTrace();
            com.dianping.live.live.utils.j.a("MLive_LogankillMLiveFloat fail:" + com.dianping.util.exception.a.a(e));
        }
    }
}
