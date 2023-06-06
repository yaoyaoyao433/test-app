package com.meituan.android.mrn.component.video;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.callback.DisplayMode;
import com.meituan.android.mtplayer.video.callback.IPlayerStateCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.share.QzonePublish;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e extends FrameLayout {
    public static ChangeQuickRedirect a;
    MTVideoPlayerView b;
    String c;
    private final ao d;
    private b e;

    public static /* synthetic */ void a(e eVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "e98a2db25f74d94b1fa1a531f1472769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "e98a2db25f74d94b1fa1a531f1472769");
            return;
        }
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION, i);
            ((UIManagerModule) eVar.d.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(c.a(eVar.getId(), d.STATE_PREPARED, createMap));
        } catch (Exception e) {
            com.facebook.common.logging.a.d("[MRNVideoPlayerView@notifyPreparedChanged]", null, e);
        }
    }

    public static /* synthetic */ void a(e eVar, int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "2966a6cff004be601651cc01cb7557ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "2966a6cff004be601651cc01cb7557ba");
            return;
        }
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("currentPlayTime", i);
            createMap.putInt(QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION, i2);
            createMap.putInt("currentBufferingPercent", i3);
            ((UIManagerModule) eVar.d.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(c.a(eVar.getId(), d.STATE_PROGRESS, createMap));
        } catch (Exception e) {
            com.facebook.common.logging.a.d("[MRNVideoPlayerView@notifyProgressChanged]", null, e);
        }
    }

    public static /* synthetic */ void a(e eVar, d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "a47db89e965cf474daf6aa9c6b9e6a3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "a47db89e965cf474daf6aa9c6b9e6a3f");
            return;
        }
        try {
            ((UIManagerModule) eVar.d.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(c.a(eVar.getId(), dVar, null));
        } catch (Exception e) {
            com.facebook.common.logging.a.d("[MRNVideoPlayerView@notifyStateChanged]", null, e);
        }
    }

    public e(@NonNull ao aoVar) {
        super(aoVar);
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30df511cf30a4397b063c12eb30a4c43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30df511cf30a4397b063c12eb30a4c43");
            return;
        }
        this.d = aoVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2c8d603df2778c98e279a4ff6bf9c6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2c8d603df2778c98e279a4ff6bf9c6b");
            return;
        }
        this.b = new MTVideoPlayerView(this.d);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aaccfe8399933c33b93b756ea467001e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aaccfe8399933c33b93b756ea467001e");
        } else {
            this.b.setPlayStateCallback(new IPlayerStateCallback() { // from class: com.meituan.android.mrn.component.video.e.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
                public final void a(int i) {
                    Object[] objArr4 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "797eab299db3000a6d3b0bb472c49d4c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "797eab299db3000a6d3b0bb472c49d4c");
                        return;
                    }
                    switch (i) {
                        case -1:
                            e.a(e.this, d.STATE_ERROR);
                            return;
                        case 0:
                            e.a(e.this, d.STATE_IDLE);
                            return;
                        case 1:
                            e.a(e.this, d.STATE_PREPARING);
                            return;
                        case 2:
                            e.a(e.this, e.this.b != null ? e.this.b.getDuration() : 0);
                            return;
                        case 3:
                            e.a(e.this, d.STATE_PLAYING);
                            return;
                        case 4:
                            e.a(e.this, d.STATE_PAUSED);
                            return;
                        case 5:
                            e.a(e.this, d.STATE_BUFFERING_PLAYING);
                            return;
                        case 6:
                            e.a(e.this, d.STATE_BUFFERING_PAUSED);
                            return;
                        case 7:
                            e.a(e.this, d.STATE_PLAYBACK_COMPLETED);
                            return;
                        default:
                            return;
                    }
                }

                @Override // com.meituan.android.mtplayer.video.callback.IPlayerStateCallback
                public final void a(int i, int i2, int i3) {
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "65f66f6cf9b0bda2c1dc2c4e0cfd8888", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "65f66f6cf9b0bda2c1dc2c4e0cfd8888");
                    } else {
                        e.a(e.this, i, i2, i3);
                    }
                }
            });
        }
        addView(this.b, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void setCoverView(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8fa16908a139899617428f72e61c8d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8fa16908a139899617428f72e61c8d6");
        } else if (view == null) {
        } else {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.e = new b(this.d, view);
            if (this.b != null) {
                this.b.setCoverView(this.e);
            }
        }
    }

    public final View getCoverView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bc3abe2cf4c294c0db48c13f3cc2e52", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bc3abe2cf4c294c0db48c13f3cc2e52");
        }
        if (this.e == null) {
            return null;
        }
        return this.e.getView();
    }

    public final void a(String str, boolean z) {
        Context context;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17569970033b10476dcd47d9ac54edda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17569970033b10476dcd47d9ac54edda");
        } else if (this.b == null) {
        } else {
            this.c = str;
            VideoPlayerParam videoPlayerParam = new VideoPlayerParam(str);
            if (z && (context = getContext()) != null) {
                videoPlayerParam.a(context, "MRNVideoCache");
            }
            this.b.setDataSource(videoPlayerParam);
        }
    }

    public final void setRepeat(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb0c21f1e5d4a0b8be4fefc9cc99ad80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb0c21f1e5d4a0b8be4fefc9cc99ad80");
        } else {
            this.b.setLooping(z);
        }
    }

    public final void setDisplayMode(@DisplayMode int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42efb76401d25986f1170489c2e4add1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42efb76401d25986f1170489c2e4add1");
        } else {
            this.b.setDisplayMode(i);
        }
    }

    public final void setVolume(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c18eefd3f91ea1d36fac4cb2dee4429a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c18eefd3f91ea1d36fac4cb2dee4429a");
        } else if (this.b != null) {
            float f = (float) d;
            this.b.a(f, f);
        }
    }
}
