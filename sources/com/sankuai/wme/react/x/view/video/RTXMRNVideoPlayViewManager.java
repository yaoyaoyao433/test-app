package com.sankuai.wme.react.x.view.video;

import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.callback.IPlayerStateCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RTXMRNVideoPlayViewManager extends SimpleViewManager<WMMRNVideoPlayView> {
    private static final int COMMAND_MUTE = 3;
    private static final int COMMAND_PAUSE = 2;
    private static final int COMMAND_PLAY = 1;
    private static final int COMMAND_RELEASE = 5;
    private static final int COMMAND_RESET = 4;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String myName;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.myName;
    }

    public RTXMRNVideoPlayViewManager(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e86ff1bb1b022e3d1061c113f676b81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e86ff1bb1b022e3d1061c113f676b81");
        } else {
            this.myName = str;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public WMMRNVideoPlayView createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2073947f4390e9e7fe5d2571550e1e7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMMRNVideoPlayView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2073947f4390e9e7fe5d2571550e1e7b");
        }
        final WMMRNVideoPlayView wMMRNVideoPlayView = null;
        if (aoVar.hasCurrentActivity()) {
            wMMRNVideoPlayView = new WMMRNVideoPlayView(aoVar, aoVar.getCurrentActivity());
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = WMMRNVideoPlayView.a;
            if (PatchProxy.isSupport(objArr2, wMMRNVideoPlayView, changeQuickRedirect3, false, "cd59793ea5874a619e3c4047be695bed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, wMMRNVideoPlayView, changeQuickRedirect3, false, "cd59793ea5874a619e3c4047be695bed");
            } else {
                View inflate = LayoutInflater.from(wMMRNVideoPlayView.b).inflate(R.layout.wm_layout_video_play_view, (ViewGroup) wMMRNVideoPlayView, false);
                wMMRNVideoPlayView.addView(inflate, 0, new ViewGroup.LayoutParams(-1, -1));
                wMMRNVideoPlayView.d = (FrameLayout) inflate.findViewById(R.id.fl_player_container);
                wMMRNVideoPlayView.c = (MTVideoPlayerView) inflate.findViewById(R.id.poi_header_video_player);
                Object[] objArr3 = {inflate};
                ChangeQuickRedirect changeQuickRedirect4 = WMMRNVideoPlayView.a;
                if (PatchProxy.isSupport(objArr3, wMMRNVideoPlayView, changeQuickRedirect4, false, "56b5326d4927d0e382f35418408acf44", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, wMMRNVideoPlayView, changeQuickRedirect4, false, "56b5326d4927d0e382f35418408acf44");
                } else {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = WMMRNVideoPlayView.a;
                    if (PatchProxy.isSupport(objArr4, wMMRNVideoPlayView, changeQuickRedirect5, false, "488b4fe86f48f6d38891eae27b1b5e52", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, wMMRNVideoPlayView, changeQuickRedirect5, false, "488b4fe86f48f6d38891eae27b1b5e52");
                    } else {
                        wMMRNVideoPlayView.c.setDisplayView(MTVideoPlayerView.a.TYPE_TEXTURE);
                        wMMRNVideoPlayView.c.setDisplayMode(1);
                        wMMRNVideoPlayView.c.setPlayStateCallback(new IPlayerStateCallback() { // from class: com.sankuai.wme.react.x.view.video.WMMRNVideoPlayView.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
                            public final void a(int i, int i2, int i3) {
                            }

                            @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
                            public final void a(int i) {
                                Object[] objArr5 = {Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "beb6828cd74ce906bd41d5a558b61ee4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "beb6828cd74ce906bd41d5a558b61ee4");
                                    return;
                                }
                                int a2 = WMMRNVideoPlayView.a(wMMRNVideoPlayView, i);
                                if (a2 != -1024) {
                                    WMMRNVideoPlayView.b(wMMRNVideoPlayView, a2);
                                }
                            }
                        });
                    }
                }
            }
            wMMRNVideoPlayView.setMuted(true);
        }
        return wMMRNVideoPlayView;
    }

    @ReactProp(name = "videoUrl")
    public void setVideoUrl(final WMMRNVideoPlayView wMMRNVideoPlayView, final String str) {
        Object[] objArr = {wMMRNVideoPlayView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "835a3fbff7442aae37e4ab55f08dd6e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "835a3fbff7442aae37e4ab55f08dd6e1");
        } else if (wMMRNVideoPlayView != null) {
            wMMRNVideoPlayView.post(new Runnable() { // from class: com.sankuai.wme.react.x.view.video.RTXMRNVideoPlayViewManager.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "811a72e438da743c71c622f94c80d9c1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "811a72e438da743c71c622f94c80d9c1");
                    } else {
                        wMMRNVideoPlayView.setVideoUrl(str);
                    }
                }
            });
        }
    }

    @ReactProp(name = "loop")
    public void setLoop(final WMMRNVideoPlayView wMMRNVideoPlayView, final boolean z) {
        Object[] objArr = {wMMRNVideoPlayView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e26d1f00a43e1effdeb56bee109d5d38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e26d1f00a43e1effdeb56bee109d5d38");
        } else if (wMMRNVideoPlayView != null) {
            wMMRNVideoPlayView.post(new Runnable() { // from class: com.sankuai.wme.react.x.view.video.RTXMRNVideoPlayViewManager.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "413114c8b9fb9a771f91291074c9c114", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "413114c8b9fb9a771f91291074c9c114");
                    } else {
                        wMMRNVideoPlayView.setLoop(z);
                    }
                }
            });
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e99804f088e789201e0b8fff7d4a946", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e99804f088e789201e0b8fff7d4a946") : c.a("play", 1, "pause", 2, "setMuted", 3, "reset", 4, "release", 5);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(WMMRNVideoPlayView wMMRNVideoPlayView, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {wMMRNVideoPlayView, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65bcabb3680102c834636ad25eced525", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65bcabb3680102c834636ad25eced525");
            return;
        }
        switch (i) {
            case 1:
                play(wMMRNVideoPlayView);
                return;
            case 2:
                pause(wMMRNVideoPlayView);
                return;
            case 3:
                if (readableArray == null || readableArray.size() <= 0 || readableArray.isNull(0) || readableArray.getType(0) != ReadableType.Boolean) {
                    return;
                }
                setMuted(wMMRNVideoPlayView, readableArray.getBoolean(0));
                return;
            case 4:
                reset(wMMRNVideoPlayView);
                return;
            case 5:
                release(wMMRNVideoPlayView);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fee0175bbe2596293579ee6da5839da6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fee0175bbe2596293579ee6da5839da6");
        }
        c.a b = c.b();
        b.a("onPlayStateChanged", c.a("phasedRegistrationNames", c.a("bubbled", "onPlayStateChanged")));
        return b.a();
    }

    private void play(final WMMRNVideoPlayView wMMRNVideoPlayView) {
        Object[] objArr = {wMMRNVideoPlayView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f068ad81a129b7a3fb9a3f7283ad810", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f068ad81a129b7a3fb9a3f7283ad810");
        } else {
            wMMRNVideoPlayView.post(new Runnable() { // from class: com.sankuai.wme.react.x.view.video.RTXMRNVideoPlayViewManager.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a21260b60fbee02ace4d7e3a25718d68", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a21260b60fbee02ace4d7e3a25718d68");
                        return;
                    }
                    WMMRNVideoPlayView wMMRNVideoPlayView2 = wMMRNVideoPlayView;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = WMMRNVideoPlayView.a;
                    if (PatchProxy.isSupport(objArr3, wMMRNVideoPlayView2, changeQuickRedirect4, false, "430069d2246933e2c5f38ad7b2300667", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, wMMRNVideoPlayView2, changeQuickRedirect4, false, "430069d2246933e2c5f38ad7b2300667");
                    } else {
                        wMMRNVideoPlayView2.c.c();
                    }
                }
            });
        }
    }

    private void pause(final WMMRNVideoPlayView wMMRNVideoPlayView) {
        Object[] objArr = {wMMRNVideoPlayView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bf6189c58cc34ebf7ad08a3b0d7ba38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bf6189c58cc34ebf7ad08a3b0d7ba38");
        } else {
            wMMRNVideoPlayView.post(new Runnable() { // from class: com.sankuai.wme.react.x.view.video.RTXMRNVideoPlayViewManager.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ce21c0ec981e4db54c51270daa9b984c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ce21c0ec981e4db54c51270daa9b984c");
                        return;
                    }
                    WMMRNVideoPlayView wMMRNVideoPlayView2 = wMMRNVideoPlayView;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = WMMRNVideoPlayView.a;
                    if (PatchProxy.isSupport(objArr3, wMMRNVideoPlayView2, changeQuickRedirect4, false, "1d2ec6ecd95e22401e367985575eb32b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, wMMRNVideoPlayView2, changeQuickRedirect4, false, "1d2ec6ecd95e22401e367985575eb32b");
                    } else {
                        wMMRNVideoPlayView2.c.d();
                    }
                }
            });
        }
    }

    private void setMuted(final WMMRNVideoPlayView wMMRNVideoPlayView, final boolean z) {
        Object[] objArr = {wMMRNVideoPlayView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13b873616e2281af180fcaacb9f894d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13b873616e2281af180fcaacb9f894d4");
        } else {
            wMMRNVideoPlayView.post(new Runnable() { // from class: com.sankuai.wme.react.x.view.video.RTXMRNVideoPlayViewManager.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "18fe2b05e1654271dc5bbf7245f0bdbf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "18fe2b05e1654271dc5bbf7245f0bdbf");
                    } else {
                        wMMRNVideoPlayView.setMuted(z);
                    }
                }
            });
        }
    }

    private void reset(final WMMRNVideoPlayView wMMRNVideoPlayView) {
        Object[] objArr = {wMMRNVideoPlayView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c178c1366be04e34db30036ab10a620b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c178c1366be04e34db30036ab10a620b");
        } else {
            wMMRNVideoPlayView.post(new Runnable() { // from class: com.sankuai.wme.react.x.view.video.RTXMRNVideoPlayViewManager.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9bd76f9b0f304c07f810fea052e91306", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9bd76f9b0f304c07f810fea052e91306");
                        return;
                    }
                    WMMRNVideoPlayView wMMRNVideoPlayView2 = wMMRNVideoPlayView;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = WMMRNVideoPlayView.a;
                    if (PatchProxy.isSupport(objArr3, wMMRNVideoPlayView2, changeQuickRedirect4, false, "c7a8ceb820ed387538dec7d97e91faa8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, wMMRNVideoPlayView2, changeQuickRedirect4, false, "c7a8ceb820ed387538dec7d97e91faa8");
                    } else if (wMMRNVideoPlayView2.c != null) {
                        wMMRNVideoPlayView2.c.f();
                    }
                }
            });
        }
    }

    private void release(final WMMRNVideoPlayView wMMRNVideoPlayView) {
        Object[] objArr = {wMMRNVideoPlayView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c361c9a3aff75ceae909fbc654bebd24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c361c9a3aff75ceae909fbc654bebd24");
        } else {
            wMMRNVideoPlayView.post(new Runnable() { // from class: com.sankuai.wme.react.x.view.video.RTXMRNVideoPlayViewManager.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9294e3d0c81d493520dd0276ff553175", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9294e3d0c81d493520dd0276ff553175");
                        return;
                    }
                    WMMRNVideoPlayView wMMRNVideoPlayView2 = wMMRNVideoPlayView;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = WMMRNVideoPlayView.a;
                    if (PatchProxy.isSupport(objArr3, wMMRNVideoPlayView2, changeQuickRedirect4, false, "edb49c5e07bfa3346121bde73df02647", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, wMMRNVideoPlayView2, changeQuickRedirect4, false, "edb49c5e07bfa3346121bde73df02647");
                        return;
                    }
                    new Exception().printStackTrace();
                    if (wMMRNVideoPlayView2.c != null) {
                        wMMRNVideoPlayView2.c.g();
                    }
                }
            });
        }
    }
}
