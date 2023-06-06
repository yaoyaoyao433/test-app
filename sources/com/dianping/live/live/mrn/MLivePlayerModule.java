package com.dianping.live.live.mrn;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.Nullable;
import com.dianping.live.live.mrn.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = MLivePlayerModule.REACT_CLASS)
/* loaded from: classes.dex */
public class MLivePlayerModule extends SimpleViewManager<MLivePlayerView> implements e.b<MLivePlayerView> {
    public static final String REACT_CLASS = "live-player";
    private static String TAG = "MLive_PlayerModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MLivePlayerView createViewInstance(ao aoVar) {
        Activity currentActivity;
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5b149bd36188aa8f64f5a451fb20aa6", RobustBitConfig.DEFAULT_VALUE)) {
            return (MLivePlayerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5b149bd36188aa8f64f5a451fb20aa6");
        }
        if (aoVar != null && aoVar.getCurrentActivity() != null && (aoVar.getCurrentActivity() instanceof a)) {
            long startTime = ((a) aoVar.getCurrentActivity()).getStartTime();
            String str = com.dianping.live.live.utils.i.c;
            com.dianping.live.live.utils.i.a(str, "createViewInstance::" + (System.currentTimeMillis() - startTime));
        }
        MLivePlayerView mLivePlayerView = new MLivePlayerView(aoVar);
        mLivePlayerView.setReactContext(aoVar);
        if (b.c.booleanValue()) {
            b.c = Boolean.FALSE;
        }
        if (aoVar != null && (currentActivity = aoVar.getCurrentActivity()) != null && currentActivity.getWindow() != null) {
            if (Build.VERSION.SDK_INT >= 27) {
                currentActivity.setTurnScreenOn(true);
            } else {
                currentActivity.getWindow().addFlags(2097152);
            }
            currentActivity.getWindow().addFlags(128);
        }
        return mLivePlayerView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(MLivePlayerView mLivePlayerView) {
        Object[] objArr = {mLivePlayerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4dac7bf60684e9540ab3a4906f40e6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4dac7bf60684e9540ab3a4906f40e6c");
            return;
        }
        com.dianping.live.live.utils.j.a("MLive_Logan: Player onDropViewInstance call view.stopPlay");
        if (!isMLiveContainer(mLivePlayerView.getReactContext())) {
            mLivePlayerView.b();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = MLivePlayerView.a;
            if (PatchProxy.isSupport(objArr2, mLivePlayerView, changeQuickRedirect3, false, "e22094d42f4bcad9883a6d9baaff4dc3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mLivePlayerView, changeQuickRedirect3, false, "e22094d42f4bcad9883a6d9baaff4dc3");
            } else {
                if (mLivePlayerView.c != null && !mLivePlayerView.c.d) {
                    if (mLivePlayerView.getCurrentActivity() != null) {
                        com.dianping.live.playerManager.a.a(mLivePlayerView.getContext()).a(mLivePlayerView.getContext(), mLivePlayerView.c);
                    } else {
                        mLivePlayerView.c.a();
                    }
                }
                mLivePlayerView.b = null;
                mLivePlayerView.c = null;
                mLivePlayerView.d = null;
                mLivePlayerView.e = null;
            }
        }
        b.a().b();
        super.onDropViewInstance((MLivePlayerModule) mLivePlayerView);
    }

    private boolean isMLiveContainer(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15cfd01f18b230174e1c3f5672330b41", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15cfd01f18b230174e1c3f5672330b41")).booleanValue() : (aoVar == null || aoVar.getCurrentActivity() == null || !(aoVar.getCurrentActivity() instanceof a)) ? false : true;
    }

    private a getMLiveContainer(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90e59193d09d4f45a9dd9d01eefc0f32", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90e59193d09d4f45a9dd9d01eefc0f32") : (a) aoVar.getCurrentActivity();
    }

    @ReactProp(name = "allParas")
    public void setAllParas(MLivePlayerView mLivePlayerView, ReadableMap readableMap) {
        Object[] objArr = {mLivePlayerView, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca18f6a2245e67bac5af6239ddbd271a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca18f6a2245e67bac5af6239ddbd271a");
            return;
        }
        if (isMLiveContainer(mLivePlayerView.getReactContext())) {
            long startTime = getMLiveContainer(mLivePlayerView.getReactContext()).getStartTime();
            String str = com.dianping.live.live.utils.i.c;
            com.dianping.live.live.utils.i.a(str, "setAllParas:" + (System.currentTimeMillis() - startTime));
            getMLiveContainer(mLivePlayerView.getReactContext()).getMLivePlayerStatusMonitor();
        }
        com.dianping.live.live.utils.g.a();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("code", BasicPushStatus.SUCCESS_CODE);
        mLivePlayerView.a(g.STATE_INIT_SUCCESS, createMap);
        mLivePlayerView.a(readableMap);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1b4ba64ec65196cbf3ce0cebee5ed79", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1b4ba64ec65196cbf3ce0cebee5ed79");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "94abaabf08c9641e5fb10a202170d4b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "94abaabf08c9641e5fb10a202170d4b7");
        }
        HashMap a = com.facebook.react.common.c.a();
        a.put("play", 0);
        a.put("stop", 1);
        a.put("pause", 2);
        a.put("resume", 3);
        a.put("mute", 4);
        a.put("requestFullScreen", 5);
        a.put("exitFullScreen", 6);
        a.put("seek", 17);
        return a;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(MLivePlayerView mLivePlayerView, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {mLivePlayerView, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "967bed1179b6622008753385d92cfe2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "967bed1179b6622008753385d92cfe2f");
            return;
        }
        Object[] objArr2 = {this, mLivePlayerView, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "092a6725169872c4a75777628620d4f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "092a6725169872c4a75777628620d4f0");
        } else if (mLivePlayerView != null) {
            if (i != 17) {
                switch (i) {
                    case 0:
                        play((MLivePlayerModule) mLivePlayerView);
                        return;
                    case 1:
                        stop((MLivePlayerModule) mLivePlayerView);
                        return;
                    case 2:
                        pause((MLivePlayerModule) mLivePlayerView);
                        return;
                    case 3:
                        resume((MLivePlayerModule) mLivePlayerView);
                        return;
                    case 4:
                        if (readableArray == null || readableArray.isNull(0)) {
                            return;
                        }
                        mute((MLivePlayerModule) mLivePlayerView, new e.a(readableArray.getBoolean(0)));
                        return;
                    case 5:
                        requestFullScreen((MLivePlayerModule) mLivePlayerView);
                        return;
                    case 6:
                        exitFullScreen((MLivePlayerModule) mLivePlayerView);
                        return;
                    default:
                        throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), getClass().getSimpleName()));
                }
            } else if (readableArray == null || readableArray.isNull(0)) {
            } else {
                seek((MLivePlayerModule) mLivePlayerView, readableArray.getInt(0));
            }
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c8657235f4f856ce58aef99b4738f8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c8657235f4f856ce58aef99b4738f8e");
        }
        c.a b = com.facebook.react.common.c.b();
        for (g gVar : g.valuesCustom()) {
            String str = gVar.u;
            b.a(str, com.facebook.react.common.c.a("registrationName", str));
        }
        return b.a();
    }

    @Override // com.dianping.live.live.mrn.e.b
    public void play(MLivePlayerView mLivePlayerView) {
        Object[] objArr = {mLivePlayerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6c3bd98689e408d61334b65a89975ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6c3bd98689e408d61334b65a89975ea");
        } else if (b.a().a(mLivePlayerView.getReactContext().getApplicationContext())) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = MLivePlayerView.a;
            if (PatchProxy.isSupport(objArr2, mLivePlayerView, changeQuickRedirect3, false, "9ea80be3e3dd40cfaef4b3b9185c4307", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mLivePlayerView, changeQuickRedirect3, false, "9ea80be3e3dd40cfaef4b3b9185c4307");
            } else if (mLivePlayerView.f != null) {
                mLivePlayerView.a();
            }
        }
    }

    @Override // com.dianping.live.live.mrn.e.b
    public void stop(MLivePlayerView mLivePlayerView) {
        Object[] objArr = {mLivePlayerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "978d5e48b51e87c7a3c41aef6155a8d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "978d5e48b51e87c7a3c41aef6155a8d0");
        } else if (b.a().a(mLivePlayerView.getReactContext().getApplicationContext())) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = MLivePlayerView.a;
            if (PatchProxy.isSupport(objArr2, mLivePlayerView, changeQuickRedirect3, false, "017e5906466dcb4a612669b19fae136f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mLivePlayerView, changeQuickRedirect3, false, "017e5906466dcb4a612669b19fae136f");
            } else {
                mLivePlayerView.b();
            }
        }
    }

    @Override // com.dianping.live.live.mrn.e.b
    public void pause(MLivePlayerView mLivePlayerView) {
        Object[] objArr = {mLivePlayerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2588b2312e6cad174117d82acde95e42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2588b2312e6cad174117d82acde95e42");
        } else if (b.a().a(mLivePlayerView.getReactContext().getApplicationContext())) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = MLivePlayerView.a;
            if (PatchProxy.isSupport(objArr2, mLivePlayerView, changeQuickRedirect3, false, "79d93cdf46ab2234401e3fab8072c9cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mLivePlayerView, changeQuickRedirect3, false, "79d93cdf46ab2234401e3fab8072c9cd");
            } else if (mLivePlayerView.c == null || mLivePlayerView.c.d) {
            } else {
                mLivePlayerView.c.c();
            }
        }
    }

    @Override // com.dianping.live.live.mrn.e.b
    public void resume(MLivePlayerView mLivePlayerView) {
        Object[] objArr = {mLivePlayerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2864d9115b962b411c24542e413dc340", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2864d9115b962b411c24542e413dc340");
        } else if (b.a().a(mLivePlayerView.getReactContext().getApplicationContext())) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = MLivePlayerView.a;
            if (PatchProxy.isSupport(objArr2, mLivePlayerView, changeQuickRedirect3, false, "085bfb32531b57da0df5e1d3931f5a91", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mLivePlayerView, changeQuickRedirect3, false, "085bfb32531b57da0df5e1d3931f5a91");
            } else if (mLivePlayerView.c == null || mLivePlayerView.c.d) {
            } else {
                mLivePlayerView.g = false;
                if (mLivePlayerView.getCurrentActivity() != null) {
                    mLivePlayerView.c.a(mLivePlayerView);
                    mLivePlayerView.c.a(mLivePlayerView.e);
                    mLivePlayerView.c.c(false);
                    mLivePlayerView.setmLivePlayer(mLivePlayerView.c);
                }
                mLivePlayerView.c.d();
            }
        }
    }

    @Override // com.dianping.live.live.mrn.e.b
    public void mute(MLivePlayerView mLivePlayerView, e.a aVar) {
        Object[] objArr = {mLivePlayerView, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e5dc515fdd7a785ed97d8027d85411a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e5dc515fdd7a785ed97d8027d85411a");
        } else if (b.a().a(mLivePlayerView.getReactContext().getApplicationContext())) {
            boolean z = aVar.a;
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = MLivePlayerView.a;
            if (PatchProxy.isSupport(objArr2, mLivePlayerView, changeQuickRedirect3, false, "f5c836df27d50f25eb7c62aedaf210ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mLivePlayerView, changeQuickRedirect3, false, "f5c836df27d50f25eb7c62aedaf210ff");
            } else if (mLivePlayerView.c == null || mLivePlayerView.c.d) {
            } else {
                mLivePlayerView.c.c(z);
            }
        }
    }

    @Override // com.dianping.live.live.mrn.e.b
    public void requestFullScreen(MLivePlayerView mLivePlayerView) {
        Object[] objArr = {mLivePlayerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52f9002300b2418e8de8ca6e81cda783", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52f9002300b2418e8de8ca6e81cda783");
        } else if (b.a().a(mLivePlayerView.getReactContext().getApplicationContext())) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = MLivePlayerView.a;
            if (PatchProxy.isSupport(objArr2, mLivePlayerView, changeQuickRedirect3, false, "31a1dbeea4e4bd4470245e36b4b0ce27", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mLivePlayerView, changeQuickRedirect3, false, "31a1dbeea4e4bd4470245e36b4b0ce27");
            } else if (mLivePlayerView.c == null || mLivePlayerView.c.d) {
            } else {
                mLivePlayerView.c.a(0);
            }
        }
    }

    @Override // com.dianping.live.live.mrn.e.b
    public void exitFullScreen(MLivePlayerView mLivePlayerView) {
        Object[] objArr = {mLivePlayerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8ea3b12d1aa49488938052624aefc23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8ea3b12d1aa49488938052624aefc23");
        } else if (b.a().a(mLivePlayerView.getReactContext().getApplicationContext())) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = MLivePlayerView.a;
            if (PatchProxy.isSupport(objArr2, mLivePlayerView, changeQuickRedirect3, false, "219a0c1c6b9cc2010c32b9111c6a87e6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mLivePlayerView, changeQuickRedirect3, false, "219a0c1c6b9cc2010c32b9111c6a87e6");
            } else if (mLivePlayerView.c == null || mLivePlayerView.c.d) {
            } else {
                mLivePlayerView.c.a(1);
            }
        }
    }

    @Override // com.dianping.live.live.mrn.e.b
    public void seek(MLivePlayerView mLivePlayerView, int i) {
        Object[] objArr = {mLivePlayerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f9141bc2ca67a73aebfa9c625984b7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f9141bc2ca67a73aebfa9c625984b7e");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = MLivePlayerView.a;
        if (PatchProxy.isSupport(objArr2, mLivePlayerView, changeQuickRedirect3, false, "288acfd5eab1861c208a90d449b0f5c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mLivePlayerView, changeQuickRedirect3, false, "288acfd5eab1861c208a90d449b0f5c0");
        } else if (mLivePlayerView.c == null || mLivePlayerView.c.d) {
        } else {
            d dVar = mLivePlayerView.c;
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect4, false, "4ff8b6f280307879442f24b342c1ded4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect4, false, "4ff8b6f280307879442f24b342c1ded4");
            } else {
                dVar.b.e(i);
            }
        }
    }
}
