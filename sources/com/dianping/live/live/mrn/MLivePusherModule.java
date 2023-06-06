package com.dianping.live.live.mrn;

import android.app.Activity;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.Nullable;
import com.dianping.live.live.mrn.i;
import com.dianping.live.live.utils.NetWorkStateReceiver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.sankuai.meituan.mtlive.pusher.library.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = MLivePusherModule.REACT_CLASS)
/* loaded from: classes.dex */
public class MLivePusherModule extends SimpleViewManager<MLivePusherView> implements i.e<MLivePusherView> {
    protected static final String REACT_CLASS = "live-pusher";
    private static String TAG = "MLive_PusherModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MLivePusherView createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3b2064c641679905b282d3a6b05dafd", RobustBitConfig.DEFAULT_VALUE)) {
            return (MLivePusherView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3b2064c641679905b282d3a6b05dafd");
        }
        final MLivePusherView mLivePusherView = new MLivePusherView(aoVar);
        mLivePusherView.setReactContext(aoVar);
        Object[] objArr2 = {aoVar};
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "0e47400a36fb38b588c371e278b7ed7c", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "0e47400a36fb38b588c371e278b7ed7c")).booleanValue();
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                ArrayList<String> arrayList = new ArrayList();
                if (Privacy.createPermissionGuard().a(aoVar, PermissionGuard.PERMISSION_CAMERA, "pt-642a4204d91edfe0") <= 0) {
                    arrayList.add(PermissionGuard.PERMISSION_CAMERA);
                }
                if (Privacy.createPermissionGuard().a(aoVar, PermissionGuard.PERMISSION_MICROPHONE, "pt-642a4204d91edfe0") <= 0) {
                    arrayList.add(PermissionGuard.PERMISSION_MICROPHONE);
                }
                if (Privacy.createPermissionGuard().a(aoVar, PermissionGuard.PERMISSION_STORAGE_WRITE, "pt-642a4204d91edfe0") <= 0) {
                    arrayList.add(PermissionGuard.PERMISSION_STORAGE_WRITE);
                }
                if (Privacy.createPermissionGuard().a(aoVar, PermissionGuard.PERMISSION_PHONE_READ, "pt-642a4204d91edfe0") <= 0) {
                    arrayList.add(PermissionGuard.PERMISSION_PHONE_READ);
                }
                if (arrayList.size() != 0 && aoVar.getCurrentActivity() != null) {
                    for (String str : arrayList) {
                        Privacy.createPermissionGuard().a(aoVar.getCurrentActivity(), str, "pt-642a4204d91edfe0", (com.meituan.android.privacy.interfaces.d) mLivePusherView);
                    }
                }
            }
            if (mLivePusherView.getReactContext() != null && mLivePusherView.getReactContext().getCurrentActivity() != null && (mLivePusherView.getReactContext().getCurrentActivity() instanceof a)) {
                NetWorkStateReceiver pusherNetWorkStateReceiver = ((a) mLivePusherView.getReactContext().getCurrentActivity()).getPusherNetWorkStateReceiver();
                if (pusherNetWorkStateReceiver == null) {
                    pusherNetWorkStateReceiver = new NetWorkStateReceiver(new NetWorkStateReceiver.a() { // from class: com.dianping.live.live.mrn.MLivePusherView.1
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.live.live.utils.NetWorkStateReceiver.a
                        public final void a(int i) {
                            Object[] objArr3 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "29103f9747674f6a23881f2c99b4afa2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "29103f9747674f6a23881f2c99b4afa2");
                                return;
                            }
                            mLivePusherView.r = i != 0;
                            WritableMap createMap = Arguments.createMap();
                            createMap.putString("available", mLivePusherView.r ? "1" : "0");
                            mLivePusherView.a(k.STATE_ON_NETWORK_AVAILABLE, createMap);
                            StringBuilder sb = new StringBuilder("MLive_Logan: Pusher NETWORK ");
                            sb.append(mLivePusherView.r ? "网络已连接" : "网络已断开");
                            com.dianping.live.live.utils.j.a(sb.toString());
                            String unused = mLivePusherView.t;
                            new StringBuilder("NETWORK ").append(mLivePusherView.r ? "网络已连接" : "网络已断开");
                            MLivePusherView.c(mLivePusherView);
                        }
                    });
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                mLivePusherView.getContext().registerReceiver(pusherNetWorkStateReceiver, intentFilter);
                ((a) mLivePusherView.getReactContext().getCurrentActivity()).setPusherNetWorkStateReceiver(pusherNetWorkStateReceiver);
            }
        }
        Activity currentActivity = aoVar.getCurrentActivity();
        if (currentActivity != null && currentActivity.getWindow() != null) {
            if (Build.VERSION.SDK_INT >= 27) {
                currentActivity.setTurnScreenOn(true);
            } else {
                currentActivity.getWindow().addFlags(2097152);
            }
            currentActivity.getWindow().addFlags(128);
        }
        return mLivePusherView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(MLivePusherView mLivePusherView) {
        Object[] objArr = {mLivePusherView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f349a8a56bd961044470467a463a7d6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f349a8a56bd961044470467a463a7d6f");
            return;
        }
        if (!"1".equals(MLiveMRNActivity.e)) {
            com.dianping.live.live.utils.j.a("MLive_Logan: Pusher call stopPush from onDropViewInstance");
            mLivePusherView.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
            if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "469ad42a9079b8388ea7a796ad490ad0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "469ad42a9079b8388ea7a796ad490ad0");
            } else {
                mLivePusherView.c = null;
                mLivePusherView.d = null;
                mLivePusherView.e = null;
                mLivePusherView.f = null;
            }
        }
        mLivePusherView.setReactContext(null);
        super.onDropViewInstance((MLivePusherModule) mLivePusherView);
    }

    @ReactProp(name = "allParas")
    public void setAllParas(MLivePusherView mLivePusherView, ReadableMap readableMap) {
        Object[] objArr = {mLivePusherView, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c7515305dc6bcd1c60c7950800c8fd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c7515305dc6bcd1c60c7950800c8fd9");
            return;
        }
        mLivePusherView.setAllParas(readableMap);
        com.dianping.live.live.utils.g.a();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("code", BasicPushStatus.SUCCESS_CODE);
        mLivePusherView.a(k.STATE_INIT_SUCCESS, createMap);
        if (Privacy.createPermissionGuard().a(mLivePusherView.getReactContext().getApplicationContext(), PermissionGuard.PERMISSION_CAMERA, "pt-642a4204d91edfe0") <= 0) {
            return;
        }
        mLivePusherView.a(readableMap);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0a1c8275a4887c96810eaf19ea9ee1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0a1c8275a4887c96810eaf19ea9ee1a");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = i.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "2f2dc2cc7b824f05afa91bb25b7a18f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "2f2dc2cc7b824f05afa91bb25b7a18f6");
        }
        HashMap a = com.facebook.react.common.c.a();
        a.put("start", 0);
        a.put("stop", 1);
        a.put("pause", 2);
        a.put("resume", 3);
        a.put("switchCamera", 4);
        a.put("snapshot", 5);
        a.put("toggleTorch", 6);
        a.put("playBGM", 7);
        a.put("stopBGM", 8);
        a.put("pauseBGM", 9);
        a.put("resumeBGM", 10);
        a.put("setMICVolume", 11);
        a.put("setBGMVolume", 12);
        a.put("startPreview", 13);
        a.put("stopPreview", 14);
        a.put("sendMessage", 15);
        a.put("mute", 16);
        return a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(MLivePusherView mLivePusherView, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {mLivePusherView, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ab8b72b64115e24515a93ab132ca778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ab8b72b64115e24515a93ab132ca778");
            return;
        }
        Object[] objArr2 = {this, mLivePusherView, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect3 = i.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "c5341e1266a179b0bea98d286f8620c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "c5341e1266a179b0bea98d286f8620c3");
        } else if (mLivePusherView != null) {
            switch (i) {
                case 0:
                    start((MLivePusherModule) mLivePusherView);
                    return;
                case 1:
                    stop((MLivePusherModule) mLivePusherView);
                    return;
                case 2:
                    pause((MLivePusherModule) mLivePusherView);
                    return;
                case 3:
                    resume((MLivePusherModule) mLivePusherView);
                    return;
                case 4:
                    switchCamera((MLivePusherModule) mLivePusherView);
                    return;
                case 5:
                    snapshot((MLivePusherModule) mLivePusherView);
                    return;
                case 6:
                    if (readableArray == null || readableArray.isNull(0)) {
                        return;
                    }
                    toggleTorch((MLivePusherModule) mLivePusherView, new i.d(readableArray.getBoolean(0)));
                    return;
                case 7:
                    if (readableArray == null || readableArray.isNull(0)) {
                        return;
                    }
                    playBGM((MLivePusherModule) mLivePusherView, new i.a(readableArray.getString(0)));
                    return;
                case 8:
                    stopBGM((MLivePusherModule) mLivePusherView);
                    return;
                case 9:
                    pauseBGM((MLivePusherModule) mLivePusherView);
                    return;
                case 10:
                    resumeBGM((MLivePusherModule) mLivePusherView);
                    return;
                case 11:
                    if (readableArray == null || readableArray.isNull(0)) {
                        return;
                    }
                    setMICVolume((MLivePusherModule) mLivePusherView, new i.f((float) readableArray.getDouble(0)));
                    return;
                case 12:
                    if (readableArray == null || readableArray.isNull(0)) {
                        return;
                    }
                    setBGMVolume((MLivePusherModule) mLivePusherView, new i.f((float) readableArray.getDouble(0)));
                    return;
                case 13:
                    startPreview((MLivePusherModule) mLivePusherView);
                    break;
                case 14:
                    break;
                case 15:
                    if (readableArray == null || readableArray.isNull(0)) {
                        return;
                    }
                    sendMessage((MLivePusherModule) mLivePusherView, new i.b(readableArray.getString(0)));
                    return;
                case 16:
                    if (readableArray == null || readableArray.isNull(0)) {
                        return;
                    }
                    mute((MLivePusherModule) mLivePusherView, new i.c(readableArray.getBoolean(0)));
                    return;
                default:
                    throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), getClass().getSimpleName()));
            }
            stopPreview((MLivePusherModule) mLivePusherView);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ece8dcf799aa6c44ca54370cfa08db22", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ece8dcf799aa6c44ca54370cfa08db22");
        }
        c.a b = com.facebook.react.common.c.b();
        for (k kVar : k.valuesCustom()) {
            String str = kVar.u;
            b.a(str, com.facebook.react.common.c.a("registrationName", str));
        }
        return b.a();
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void start(MLivePusherView mLivePusherView) {
        Object[] objArr = {mLivePusherView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "995b03ee7d6cc2d7e40f76fe4ef81bc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "995b03ee7d6cc2d7e40f76fe4ef81bc9");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "559481268961e35c13beb0609cb6689d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "559481268961e35c13beb0609cb6689d");
            return;
        }
        if (mLivePusherView.g != null) {
            mLivePusherView.b(mLivePusherView.h);
        } else {
            mLivePusherView.a(mLivePusherView.h);
        }
        if (Privacy.createPermissionGuard().a(mLivePusherView.c.getCurrentActivity(), PermissionGuard.PERMISSION_MICROPHONE, "pt-642a4204d91edfe0") <= 0) {
            mLivePusherView.a(k.STATE_ON_MIC_FAIL, (WritableMap) null);
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void stop(MLivePusherView mLivePusherView) {
        Object[] objArr = {mLivePusherView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11c81d98669ddb26ffc688c665bf5f09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11c81d98669ddb26ffc688c665bf5f09");
            return;
        }
        com.dianping.live.live.utils.j.a("MLive_Logan: Pusher call MLivePusherModule stop");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "985a4635cf2d4a9bf744c6046b383823", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "985a4635cf2d4a9bf744c6046b383823");
        } else {
            mLivePusherView.a();
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void pause(MLivePusherView mLivePusherView) {
        Object[] objArr = {mLivePusherView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93e210168edde4ee57b96b9892d2ce79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93e210168edde4ee57b96b9892d2ce79");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "34be9df4fe7f5b7f1d7b44ed9cb7336b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "34be9df4fe7f5b7f1d7b44ed9cb7336b");
        } else if (mLivePusherView.d != null) {
            h hVar = mLivePusherView.d;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = h.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect4, false, "b86764a86906dc2ffc01296d0db9fcb4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect4, false, "b86764a86906dc2ffc01296d0db9fcb4");
            } else {
                hVar.b.g();
            }
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void resume(MLivePusherView mLivePusherView) {
        Object[] objArr = {mLivePusherView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11d24fd104b60082351b9b47aaa155dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11d24fd104b60082351b9b47aaa155dd");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "f2b8853a6f2d7de3d29cc2d9d4e8747b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "f2b8853a6f2d7de3d29cc2d9d4e8747b");
        } else if (mLivePusherView.d != null) {
            h hVar = mLivePusherView.d;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = h.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect4, false, "4f3e95d12da01a4a935d12514c90f91e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect4, false, "4f3e95d12da01a4a935d12514c90f91e");
            } else {
                hVar.b.h();
            }
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void switchCamera(MLivePusherView mLivePusherView) {
        Object[] objArr = {mLivePusherView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "403e166a0170de3a7bc9af5a0190305b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "403e166a0170de3a7bc9af5a0190305b");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "f7f82d8e4e1c07775bb0ab2589e4f4f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "f7f82d8e4e1c07775bb0ab2589e4f4f2");
        } else if (mLivePusherView.d != null) {
            mLivePusherView.d.d();
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void snapshot(final MLivePusherView mLivePusherView) {
        Object[] objArr = {mLivePusherView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "719979f27cfac346267481bb8974277e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "719979f27cfac346267481bb8974277e");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "8e173821c25de55ae71cfb2b92ed76fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "8e173821c25de55ae71cfb2b92ed76fd");
        } else if (mLivePusherView.d != null) {
            h hVar = mLivePusherView.d;
            i.b bVar = new i.b() { // from class: com.dianping.live.live.mrn.MLivePusherView.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.pusher.library.i.b
                public final void a(Bitmap bitmap) {
                    Object[] objArr3 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "03e486e18ef0d2662f1b416ad42771b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "03e486e18ef0d2662f1b416ad42771b9");
                    } else if (!mLivePusherView.d.c() || bitmap == null) {
                    } else {
                        MLivePusherView.a(mLivePusherView, bitmap);
                    }
                }
            };
            Object[] objArr3 = {bVar};
            ChangeQuickRedirect changeQuickRedirect4 = h.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect4, false, "55f56ee6105a46f6d753792cda6889f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect4, false, "55f56ee6105a46f6d753792cda6889f1");
            } else {
                hVar.b.a(bVar);
            }
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void toggleTorch(MLivePusherView mLivePusherView, i.d dVar) {
        Object[] objArr = {mLivePusherView, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a59d89343378a5ca4f5e7eb3e5f44447", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a59d89343378a5ca4f5e7eb3e5f44447");
        } else {
            mLivePusherView.a(dVar.a);
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void playBGM(final MLivePusherView mLivePusherView, i.a aVar) {
        Object[] objArr = {mLivePusherView, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7c407e4b35a9452515233b6c3b002e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7c407e4b35a9452515233b6c3b002e1");
            return;
        }
        final String str = aVar.a;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "34ddd2506f011748b2fa87341c26d52b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "34ddd2506f011748b2fa87341c26d52b");
        } else if (mLivePusherView.d != null) {
            mLivePusherView.d.g();
            AsyncTask.execute(new Runnable() { // from class: com.dianping.live.live.mrn.MLivePusherView.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "aab75f5d3381d7749daa496774be5b57", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "aab75f5d3381d7749daa496774be5b57");
                        return;
                    }
                    h hVar = mLivePusherView.d;
                    String str2 = str;
                    Object[] objArr4 = {str2};
                    ChangeQuickRedirect changeQuickRedirect5 = h.a;
                    if (PatchProxy.isSupport(objArr4, hVar, changeQuickRedirect5, false, "1af53474849314f1cfa68df5cadfc664", RobustBitConfig.DEFAULT_VALUE)) {
                        ((Boolean) PatchProxy.accessDispatch(objArr4, hVar, changeQuickRedirect5, false, "1af53474849314f1cfa68df5cadfc664")).booleanValue();
                    } else {
                        hVar.b.b(str2);
                    }
                }
            });
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void stopBGM(MLivePusherView mLivePusherView) {
        Object[] objArr = {mLivePusherView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "246b2d4ea1b55837daad84eb43911cf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "246b2d4ea1b55837daad84eb43911cf2");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "ffeee6d17e0f36245f3168100d8df462", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "ffeee6d17e0f36245f3168100d8df462");
        } else if (mLivePusherView.d != null) {
            mLivePusherView.d.g();
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void pauseBGM(MLivePusherView mLivePusherView) {
        Object[] objArr = {mLivePusherView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "723e6ac1bbc932e1c7fd8382e0dd27e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "723e6ac1bbc932e1c7fd8382e0dd27e6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "aa4a89bc3a93141d0b48aaba325e58a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "aa4a89bc3a93141d0b48aaba325e58a8");
        } else if (mLivePusherView.d != null) {
            h hVar = mLivePusherView.d;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = h.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect4, false, "0ccba6d355e2609e0fde27604314dc55", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect4, false, "0ccba6d355e2609e0fde27604314dc55")).booleanValue();
            } else {
                hVar.b.j();
            }
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void resumeBGM(MLivePusherView mLivePusherView) {
        Object[] objArr = {mLivePusherView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e84af2460db9bbe596f8b6222db2410c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e84af2460db9bbe596f8b6222db2410c");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "7f287b325c4a67010105552f11aa031a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "7f287b325c4a67010105552f11aa031a");
        } else if (mLivePusherView.d != null) {
            h hVar = mLivePusherView.d;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = h.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect4, false, "c467beb750229d08f94264b4f163e644", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect4, false, "c467beb750229d08f94264b4f163e644")).booleanValue();
            } else {
                hVar.b.k();
            }
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void setMICVolume(MLivePusherView mLivePusherView, i.f fVar) {
        Object[] objArr = {mLivePusherView, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42d0b4695bda15741e7aecdea23adf6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42d0b4695bda15741e7aecdea23adf6a");
        } else {
            mLivePusherView.setMICVolume(fVar.a);
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void setBGMVolume(MLivePusherView mLivePusherView, i.f fVar) {
        Object[] objArr = {mLivePusherView, fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72efcd55726859808f30673cb78a9569", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72efcd55726859808f30673cb78a9569");
        } else {
            mLivePusherView.setBGMVolume(fVar.a);
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void startPreview(MLivePusherView mLivePusherView) {
        Object[] objArr = {mLivePusherView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13f2022a07605d56f231272a040bfb82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13f2022a07605d56f231272a040bfb82");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "eaffc833b3823f7b11358ce521e7f180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "eaffc833b3823f7b11358ce521e7f180");
        } else if (mLivePusherView.d != null) {
            mLivePusherView.d.a(true);
            mLivePusherView.d.a(mLivePusherView);
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void stopPreview(MLivePusherView mLivePusherView) {
        Object[] objArr = {mLivePusherView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de8dfd37658f158f16881a45abd1232a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de8dfd37658f158f16881a45abd1232a");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "aa93d47d3b8e7f816a246fe6cae16afb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "aa93d47d3b8e7f816a246fe6cae16afb");
        } else if (mLivePusherView.d != null) {
            mLivePusherView.d.a(true);
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void sendMessage(MLivePusherView mLivePusherView, i.b bVar) {
        Object[] objArr = {mLivePusherView, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1af1a0e5360af1d967d742280a049f9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1af1a0e5360af1d967d742280a049f9e");
            return;
        }
        byte[] bytes = bVar.a.getBytes();
        Object[] objArr2 = {bytes};
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "b36edcb53fb16cce430bc867de6d7925", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "b36edcb53fb16cce430bc867de6d7925");
        } else if (mLivePusherView.d != null) {
            h hVar = mLivePusherView.d;
            Object[] objArr3 = {bytes};
            ChangeQuickRedirect changeQuickRedirect4 = h.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect4, false, "51d87552a313c74ac7564476996014d8", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect4, false, "51d87552a313c74ac7564476996014d8")).booleanValue();
            } else {
                hVar.b.a(bytes);
            }
        }
    }

    @Override // com.dianping.live.live.mrn.i.e
    public void mute(MLivePusherView mLivePusherView, i.c cVar) {
        Object[] objArr = {mLivePusherView, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be1798902501912adabb0563a3812476", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be1798902501912adabb0563a3812476");
            return;
        }
        boolean z = cVar.a;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = MLivePusherView.a;
        if (PatchProxy.isSupport(objArr2, mLivePusherView, changeQuickRedirect3, false, "21e781b12941a7e7c5ee288e836acd1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePusherView, changeQuickRedirect3, false, "21e781b12941a7e7c5ee288e836acd1c");
        } else if (mLivePusherView.d != null) {
            mLivePusherView.d.d(z);
        }
    }
}
