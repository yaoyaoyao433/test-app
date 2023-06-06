package com.sankuai.meituan.shortvideocore.mrn;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.dianping.shield.entity.AgentScrollerParams;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mtplayer.video.callback.DisplayMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.shortvideocore.mrn.b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MRNShortVideoPlayerViewManager extends ViewGroupManager<f> implements b.c<f> {
    private static final String PROP_CALLBACK_TIME_INTERVAL = "callBackTimeInterval";
    private static final String PROP_CID = "cid";
    private static final String PROP_COVER_URL = "coverUrl";
    private static final String PROP_DISPLAY_MODE = "displayMode";
    private static final String PROP_ENABLE_CELLULAR_REMINDER = "enableCellularReminder";
    private static final String PROP_ENABLE_CONTROL_PANEL = "enableControlPanel";
    private static final String PROP_ENABLE_LOADING_ANIM = "enableLoadingAnim";
    private static final String PROP_ENABLE_PROXY_CACHE = "enableProxyCache";
    private static final String PROP_ENABLE_SEEK_TO_HISTORY = "enableSeekToHistory";
    private static final String PROP_MUTE = "mute";
    private static final String PROP_NOT_STOP_WHEN_DETACH = "notStopWhenDetach";
    private static final String PROP_REPEAT = "repeat";
    private static final String PROP_SET_PLAYER_TYPE = "setPlayerType";
    private static final String PROP_VIDEOH265URL = "videoH265Url";
    private static final String PROP_VIDEOURL = "videoUrl";
    private static final String PROP_VIDEO_URL_WITH_CACHE = "videoUrlWithCache";
    private static final String PROP_VID_START_WITHOUT_CACHE = "startWithoutCache";
    private static final String PROP_VOLUME = "volume";
    private static final String PRO_CACHE_VIDEO_LAYOUT = "cacheVideoLayout";
    private static final String PRO_PAUSE_IN_BACKGROUND = "pauseInBackground";
    private static final String PRO_PLAYBACK_RATE = "playbackRate";
    private static final String PRO_PLAYERVIEWOPAQUE = "playerViewOpaque";
    private static final String PRO_START_TIME = "startTime";
    private static final String REACT_CLASS = "MRNMediaPlayerView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = PROP_COVER_URL)
    public void setCoverUrl(f fVar, String str) {
    }

    @ReactProp(defaultBoolean = true, name = PROP_ENABLE_CELLULAR_REMINDER)
    public void setEnableCellularReminder(f fVar, boolean z) {
    }

    @ReactProp(defaultBoolean = false, name = PROP_ENABLE_CONTROL_PANEL)
    public void setEnableControlPanel(f fVar, boolean z) {
    }

    @ReactProp(defaultBoolean = false, name = PROP_ENABLE_LOADING_ANIM)
    public void setEnableLoadingAnim(f fVar, boolean z) {
    }

    @ReactProp(defaultBoolean = false, name = PROP_ENABLE_SEEK_TO_HISTORY)
    public void setEnableSeekToHistory(f fVar, boolean z) {
    }

    @Override // com.sankuai.meituan.shortvideocore.mrn.b.c
    public /* bridge */ /* synthetic */ void setVideoExtensionInfo(f fVar, HashMap hashMap) {
        setVideoExtensionInfo2(fVar, (HashMap<String, Object>) hashMap);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public f createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a7867c20207dc77f122d99763784d7a", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a7867c20207dc77f122d99763784d7a") : new f(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4150eabd196d5db6911068692df8c7e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4150eabd196d5db6911068692df8c7e0");
        } else if (fVar == null) {
        } else {
            release(fVar);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(f fVar, View view, int i) {
        Object[] objArr = {fVar, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2587d8e56daf7a69b061de95d016cdcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2587d8e56daf7a69b061de95d016cdcc");
        } else {
            fVar.setCoverView(view);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f016a821a8e8c4487ba371d81190a856", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f016a821a8e8c4487ba371d81190a856") : fVar.getCoverView();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69bc27e7ead692b68238b0121f70af76", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69bc27e7ead692b68238b0121f70af76")).intValue() : fVar.getCoverView() == null ? 0 : 1;
    }

    @ReactProp(name = PROP_VIDEOURL)
    public void setVideoUrl(f fVar, @Nullable String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11b3ebae991e255a4dd1a6d2d1ca0b0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11b3ebae991e255a4dd1a6d2d1ca0b0c");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            fVar.a(str, true);
        }
    }

    @ReactProp(name = PROP_VID_START_WITHOUT_CACHE)
    public void startWithoutCache(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "252e0023da4317b2e2f1860189576289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "252e0023da4317b2e2f1860189576289");
        } else {
            fVar.setUseCache(z);
        }
    }

    @ReactProp(name = PROP_VIDEOH265URL)
    public void setPropVideoh265url(f fVar, @Nullable String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a599ada89e2f1b2bd9ee39e8515c0ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a599ada89e2f1b2bd9ee39e8515c0ee");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Object[] objArr2 = {str, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect3 = f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect3, false, "307f88c598765693cdd897adf3dff291", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect3, false, "307f88c598765693cdd897adf3dff291");
                return;
            }
            new StringBuilder("setVideoH265Url: ").append(str);
            fVar.d = str;
        }
    }

    @ReactProp(name = PROP_SET_PLAYER_TYPE)
    public void setPlayerType(f fVar, @Nullable int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "261d488bb8f10ffa8ce9a4e998c66370", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "261d488bb8f10ffa8ce9a4e998c66370");
        } else {
            fVar.setPlayerType(i);
        }
    }

    @ReactProp(name = PROP_VIDEO_URL_WITH_CACHE)
    public void setVideoUrlWithCache(f fVar, @Nullable String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d51708755c77bbe24c70f1d76429d35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d51708755c77bbe24c70f1d76429d35");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            fVar.a(str, true);
        }
    }

    @ReactProp(defaultBoolean = false, name = PROP_REPEAT)
    public void setRepeat(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a68ea92e9021e76999e1c4e27682521c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a68ea92e9021e76999e1c4e27682521c");
        } else {
            fVar.setRepeat(z);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = PROP_VOLUME)
    public void setVolume(f fVar, float f) {
        Object[] objArr = {fVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2d748f509c2f2b18c1e9b93053abbe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2d748f509c2f2b18c1e9b93053abbe3");
        } else {
            fVar.setVolume(f);
        }
    }

    @ReactProp(defaultBoolean = true, name = PROP_MUTE)
    public void setMute(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "798579046be49bf7c645dfe247c3974c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "798579046be49bf7c645dfe247c3974c");
            return;
        }
        fVar.setMute(z);
        fVar.setVolume(z ? 0.0d : 1.0d);
    }

    @ReactProp(defaultBoolean = true, name = PRO_PLAYERVIEWOPAQUE)
    public void setDisplayOpaque(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8e27139ad101fd797229d95e88df499", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8e27139ad101fd797229d95e88df499");
        } else {
            fVar.setDisplayOpaque(z);
        }
    }

    @ReactProp(defaultBoolean = false, name = PRO_PAUSE_IN_BACKGROUND)
    public void pauseInBackground(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13c38b312f49c9975874bb51af4807b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13c38b312f49c9975874bb51af4807b9");
        } else {
            fVar.setPauseInBackground(z);
        }
    }

    @ReactProp(defaultInt = 0, name = PROP_DISPLAY_MODE)
    public void setDisplayMode(f fVar, @DisplayMode int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9b18ecc944eddec171395955fc83c99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9b18ecc944eddec171395955fc83c99");
        } else {
            fVar.setDisplayMode(i);
        }
    }

    @ReactProp(defaultFloat = 1.0f, name = PROP_CALLBACK_TIME_INTERVAL)
    public void setCallBackTimeInterval(f fVar, float f) {
        Object[] objArr = {fVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49d311fa31583c6f01d7c086d76d69b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49d311fa31583c6f01d7c086d76d69b4");
        } else {
            fVar.setProgressUpdateDuration((int) (f * 1000.0f));
        }
    }

    @ReactProp(name = "cid")
    public void setCid(f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "797f4c29fec9c97fbc4e5f315357e247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "797f4c29fec9c97fbc4e5f315357e247");
        } else {
            fVar.setCid(str);
        }
    }

    @ReactProp(defaultBoolean = true, name = PROP_ENABLE_PROXY_CACHE)
    public void setEnableProxyCache(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10de095a3a4de8a440b2afa5d9695009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10de095a3a4de8a440b2afa5d9695009");
        } else {
            fVar.setUseCache(z);
        }
    }

    @ReactProp(defaultInt = 0, name = PRO_START_TIME)
    public void setStartTime(f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72e2350ce858e74ab63d9aa91ca1a7a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72e2350ce858e74ab63d9aa91ca1a7a3");
        } else {
            fVar.setStartSeekPosition(i);
        }
    }

    @ReactProp(defaultFloat = AgentScrollerParams.DEFAULT_SPEED, name = PRO_PLAYBACK_RATE)
    public void setPlaybackRate(f fVar, float f) {
        Object[] objArr = {fVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b117996026da4ee3d753f8fcb6cfd18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b117996026da4ee3d753f8fcb6cfd18");
        } else {
            fVar.setPlaybackRate(f);
        }
    }

    @ReactProp(defaultBoolean = false, name = PRO_CACHE_VIDEO_LAYOUT)
    public void setCacheVideoLayout(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb0e068be9da9849fb4c7f10960544c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb0e068be9da9849fb4c7f10960544c0");
        } else {
            fVar.setCacheVideoLayout(z);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1acf7201b844ef258fbad9de8c535e33", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1acf7201b844ef258fbad9de8c535e33");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "3daf693cc8e7408086fff8abd083980c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "3daf693cc8e7408086fff8abd083980c");
        }
        HashMap a = com.facebook.react.common.c.a();
        a.put("videoPrepare", 0);
        a.put("videoStart", 1);
        a.put("videoPause", 2);
        a.put("videoRelease", 3);
        a.put("videoReset", 4);
        a.put("seekTo", 5);
        a.put("setVolume", 6);
        a.put("setCid", 7);
        a.put("monitorUserPlay", 8);
        a.put("monitorPagePause", 9);
        a.put("toggleFullscreen", 10);
        a.put("savePlayerView", 11);
        a.put("setPlaybackRate", 12);
        a.put("setMute", 13);
        a.put("setVideoExtensionInfo", 14);
        return a;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(f fVar, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {fVar, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb83231737da6046107b1c734b9347b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb83231737da6046107b1c734b9347b4");
        } else {
            b.a(this, fVar, i, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73f57ba8e85683e6fb1a2ca39979e557", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73f57ba8e85683e6fb1a2ca39979e557");
        }
        c.a b = com.facebook.react.common.c.b();
        for (e eVar : e.valuesCustom()) {
            String str = eVar.t;
            b.a(str, com.facebook.react.common.c.a("registrationName", str));
        }
        return b.a();
    }

    @Override // com.sankuai.meituan.shortvideocore.mrn.b.c
    public void prepare(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00c97124e6c336b58310080e16ea4088", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00c97124e6c336b58310080e16ea4088");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect3, false, "3a5a83e7cdee0af506688f3abb742304", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect3, false, "3a5a83e7cdee0af506688f3abb742304");
        } else if (TextUtils.isEmpty(fVar.c) || fVar.b == null) {
        } else {
            fVar.e = System.currentTimeMillis();
            fVar.b();
            fVar.b.b();
        }
    }

    @Override // com.sankuai.meituan.shortvideocore.mrn.b.c
    public void start(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e10587f59a448fae3d8760549a135410", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e10587f59a448fae3d8760549a135410");
        } else {
            fVar.c();
        }
    }

    @Override // com.sankuai.meituan.shortvideocore.mrn.b.c
    public void pause(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23649d54e873ad58ea41513712775033", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23649d54e873ad58ea41513712775033");
        } else {
            fVar.e();
        }
    }

    @Override // com.sankuai.meituan.shortvideocore.mrn.b.c
    public void saveVideoView(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1435a9001f8582b5838743ae8513340", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1435a9001f8582b5838743ae8513340");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect3, false, "b082eb471b301e448ab02482a422428c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect3, false, "b082eb471b301e448ab02482a422428c");
        } else if (fVar.b == null || fVar.c == null) {
        } else {
            com.sankuai.meituan.shortvideocore.mrn.cache.b.a().a(fVar.b, fVar.c);
            fVar.b = null;
            fVar.g = true;
        }
    }

    @Override // com.sankuai.meituan.shortvideocore.mrn.b.c
    public void release(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcf9b0277cb960927123e45f19b5223e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcf9b0277cb960927123e45f19b5223e");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect3, false, "0b2c88e5c8a861f9b7c4254718b99329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect3, false, "0b2c88e5c8a861f9b7c4254718b99329");
            return;
        }
        if (fVar.g && fVar.b == null) {
            com.sankuai.meituan.shortvideocore.mrn.cache.b.a().b(fVar.c);
        }
        fVar.d();
        if (fVar.b != null) {
            fVar.b.g();
        }
        fVar.a();
        fVar.a(false);
        fVar.h = -1;
        fVar.f = false;
        fVar.i = false;
    }

    @Override // com.sankuai.meituan.shortvideocore.mrn.b.c
    public void reset(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b4e5033458497e944fb475014f89ea2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b4e5033458497e944fb475014f89ea2");
        } else {
            fVar.f();
        }
    }

    @Override // com.sankuai.meituan.shortvideocore.mrn.b.c
    public void seekTo(f fVar, b.a aVar) {
        Object[] objArr = {fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5359d595e60d2f0c568bc523392c97c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5359d595e60d2f0c568bc523392c97c0");
        } else {
            fVar.a(aVar.a);
        }
    }

    @Override // com.sankuai.meituan.shortvideocore.mrn.b.c
    public void setVolume(f fVar, b.C0645b c0645b) {
        Object[] objArr = {fVar, c0645b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efa4f8942bc242d87cc19d972191091c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efa4f8942bc242d87cc19d972191091c");
        } else {
            fVar.setVolume(c0645b.a);
        }
    }

    @Override // com.sankuai.meituan.shortvideocore.mrn.b.c
    public void setVideoMute(f fVar, boolean z) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d54f362b57ccf88ba24889ab3b64d0f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d54f362b57ccf88ba24889ab3b64d0f3");
            return;
        }
        fVar.setMute(z);
        fVar.setVolume(z ? 0.0d : 1.0d);
    }

    /* renamed from: setVideoExtensionInfo  reason: avoid collision after fix types in other method */
    public void setVideoExtensionInfo2(f fVar, HashMap<String, Object> hashMap) {
        Object[] objArr = {fVar, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c87b5efb03d401a78e26c983c6b47205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c87b5efb03d401a78e26c983c6b47205");
        } else {
            fVar.setVideoExtensionInfo(hashMap);
        }
    }

    @Override // com.sankuai.meituan.shortvideocore.mrn.b.c
    public void setVideoPlaybackRate(f fVar, float f) {
        Object[] objArr = {fVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6370e9aee44db66faac8863e169271a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6370e9aee44db66faac8863e169271a7");
        } else {
            fVar.setPlaybackRate(f);
        }
    }
}
