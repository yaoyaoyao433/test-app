package com.meituan.android.mrn.component.video;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.video.a;
import com.meituan.android.mtplayer.video.callback.DisplayMode;
import com.meituan.android.mtplayer.video.proxy.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MRNVideoPlayerViewManager extends ViewGroupManager<e> implements a.c<e> {
    private static final String PROP_DISPLAY_MODE = "displayMode";
    private static final String PROP_MUTE = "mute";
    private static final String PROP_REPEAT = "repeat";
    private static final String PROP_VIDEOURL = "videoUrl";
    private static final String PROP_VIDEO_URL_WITH_CACHE = "videoUrlWithCache";
    private static final String PROP_VOLUME = "volume";
    private static final String REACT_CLASS = "MRNVideoPlayerView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public e createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d516c35f603b9a8f884aa7f44ded2a74", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d516c35f603b9a8f884aa7f44ded2a74") : new e(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f420b6f305ebe36f5807ea738275c0ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f420b6f305ebe36f5807ea738275c0ae");
        } else if (eVar == null) {
        } else {
            release(eVar);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(e eVar, View view, int i) {
        Object[] objArr = {eVar, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a6cda59d0ea2ab2dea2719010c4bf9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a6cda59d0ea2ab2dea2719010c4bf9d");
        } else {
            eVar.setCoverView(view);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61e837dee56caa2f626ada40f6fb8354", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61e837dee56caa2f626ada40f6fb8354") : eVar.getCoverView();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa75e3e3cbb4f154dbcac332e1b694e1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa75e3e3cbb4f154dbcac332e1b694e1")).intValue() : eVar.getCoverView() == null ? 0 : 1;
    }

    @ReactProp(name = PROP_VIDEOURL)
    public void setVideoUrl(e eVar, @Nullable String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de1b99e8d6351d3ad25ec021311b66f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de1b99e8d6351d3ad25ec021311b66f9");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            eVar.a(str, false);
        }
    }

    @ReactProp(name = PROP_VIDEO_URL_WITH_CACHE)
    public void setVideoUrlWithCache(e eVar, @Nullable String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0afc454f0d4bbf49b7c79b3935997e0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0afc454f0d4bbf49b7c79b3935997e0c");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            eVar.a(str, true);
        }
    }

    @ReactProp(defaultBoolean = false, name = PROP_REPEAT)
    public void setRepeat(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "daacdb4b535833e8ab764213d5745fb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "daacdb4b535833e8ab764213d5745fb5");
        } else {
            eVar.setRepeat(z);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = PROP_VOLUME)
    public void setVolume(e eVar, float f) {
        Object[] objArr = {eVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b804310f78685f1dd5a2201647ac0ea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b804310f78685f1dd5a2201647ac0ea9");
        } else {
            eVar.setVolume(f);
        }
    }

    @ReactProp(defaultBoolean = true, name = PROP_MUTE)
    public void setMute(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62936798ef87c25f291dae77c3ecfadd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62936798ef87c25f291dae77c3ecfadd");
        } else {
            eVar.setVolume(z ? 0.0d : 1.0d);
        }
    }

    @ReactProp(defaultInt = 0, name = PROP_DISPLAY_MODE)
    public void setDisplayMode(e eVar, @DisplayMode int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "280baf45f54919d4de4b8eedd63f2ec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "280baf45f54919d4de4b8eedd63f2ec8");
        } else {
            eVar.setDisplayMode(i);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4098495b18cc69cd2d7284c10fc7e6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4098495b18cc69cd2d7284c10fc7e6a");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "0cb56a59fb73f1f5ae038b4e7dbcbb9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "0cb56a59fb73f1f5ae038b4e7dbcbb9b");
        }
        HashMap a = com.facebook.react.common.c.a();
        a.put("videoPrepare", 0);
        a.put("videoStart", 1);
        a.put("videoPause", 2);
        a.put("videoRelease", 3);
        a.put("videoReset", 4);
        a.put("seekTo", 5);
        a.put("setVolume", 6);
        return a;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(e eVar, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {eVar, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe412a32bad489929b1a115d37281ff9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe412a32bad489929b1a115d37281ff9");
            return;
        }
        Object[] objArr2 = {this, eVar, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "26aa99081232c4925e0ba34358bb27cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "26aa99081232c4925e0ba34358bb27cc");
        } else if (eVar != null) {
            switch (i) {
                case 0:
                    prepare((MRNVideoPlayerViewManager) eVar);
                    return;
                case 1:
                    start((MRNVideoPlayerViewManager) eVar);
                    return;
                case 2:
                    pause((MRNVideoPlayerViewManager) eVar);
                    return;
                case 3:
                    release((MRNVideoPlayerViewManager) eVar);
                    return;
                case 4:
                    reset((MRNVideoPlayerViewManager) eVar);
                    return;
                case 5:
                    if (readableArray == null || readableArray.isNull(0)) {
                        return;
                    }
                    seekTo((MRNVideoPlayerViewManager) eVar, new a.C0284a(readableArray.getInt(0)));
                    return;
                case 6:
                    if (readableArray == null || readableArray.isNull(0)) {
                        return;
                    }
                    setVolume((MRNVideoPlayerViewManager) eVar, new a.b(readableArray.getDouble(0)));
                    return;
                default:
                    throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), getClass().getSimpleName()));
            }
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8d71570061817eccdd211d178ee9264", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8d71570061817eccdd211d178ee9264");
        }
        c.a b = com.facebook.react.common.c.b();
        for (d dVar : d.valuesCustom()) {
            String str = dVar.l;
            b.a(str, com.facebook.react.common.c.a("registrationName", str));
        }
        return b.a();
    }

    @Override // com.meituan.android.mrn.component.video.a.c
    public void prepare(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "613e82e58d1fa96ceeab564539385f1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "613e82e58d1fa96ceeab564539385f1a");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect3, false, "0d1ab2b4a459c6f70b96f5cf3c67d526", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect3, false, "0d1ab2b4a459c6f70b96f5cf3c67d526");
        } else if (TextUtils.isEmpty(eVar.c) || eVar.b == null) {
        } else {
            eVar.b.b();
        }
    }

    @Override // com.meituan.android.mrn.component.video.a.c
    public void start(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6b53548ad2968fefbfb52494a21db99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6b53548ad2968fefbfb52494a21db99");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect3, false, "50204f1d1ac32f798b67233282a5fb1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect3, false, "50204f1d1ac32f798b67233282a5fb1d");
        } else if (TextUtils.isEmpty(eVar.c) || eVar.b == null || eVar.b.e()) {
        } else {
            eVar.b.c();
        }
    }

    @Override // com.meituan.android.mrn.component.video.a.c
    public void pause(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3eee58066d3f10192037ea87e075666a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3eee58066d3f10192037ea87e075666a");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect3, false, "5195d12f6f4417d7dfe15d2801da0fb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect3, false, "5195d12f6f4417d7dfe15d2801da0fb5");
        } else if (eVar.b == null || !eVar.b.e()) {
        } else {
            eVar.b.d();
        }
    }

    @Override // com.meituan.android.mrn.component.video.a.c
    public void release(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "becf0068c0eadf46728b102cfaf9c868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "becf0068c0eadf46728b102cfaf9c868");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect3, false, "40a9c6a4c18cecb23488b238e0e019aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect3, false, "40a9c6a4c18cecb23488b238e0e019aa");
            return;
        }
        if (eVar.b != null) {
            eVar.b.g();
        }
        try {
            l.a().c();
        } catch (Exception e) {
            com.facebook.common.logging.a.d("[MRNVideoPlayerView@release]", null, e);
        }
    }

    @Override // com.meituan.android.mrn.component.video.a.c
    public void reset(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2728612061aa1f514f4762e80b67de41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2728612061aa1f514f4762e80b67de41");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect3, false, "b02b4d54b5c26533f7b9298a8060f34f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect3, false, "b02b4d54b5c26533f7b9298a8060f34f");
        } else if (eVar.b != null) {
            eVar.b.f();
        }
    }

    @Override // com.meituan.android.mrn.component.video.a.c
    public void seekTo(e eVar, a.C0284a c0284a) {
        Object[] objArr = {eVar, c0284a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a5616e48e4b355ac70cfb27a64332cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a5616e48e4b355ac70cfb27a64332cf");
            return;
        }
        int i = c0284a.a;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect3, false, "3c7e578a5fa92fb512c680bf2abeba54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect3, false, "3c7e578a5fa92fb512c680bf2abeba54");
        } else if (eVar.b == null || i < 0) {
        } else {
            eVar.b.a(i);
        }
    }

    @Override // com.meituan.android.mrn.component.video.a.c
    public void setVolume(e eVar, a.b bVar) {
        Object[] objArr = {eVar, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bdda0d20e22ba047bca51bc6aa06da7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bdda0d20e22ba047bca51bc6aa06da7");
        } else {
            eVar.setVolume(bVar.a);
        }
    }
}
