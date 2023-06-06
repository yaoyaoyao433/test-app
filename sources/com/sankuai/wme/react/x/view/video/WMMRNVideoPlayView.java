package com.sankuai.wme.react.x.view.video;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.view.f;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.proxy.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class WMMRNVideoPlayView extends f {
    public static ChangeQuickRedirect a;
    Activity b;
    MTVideoPlayerView c;
    FrameLayout d;
    private Context e;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface JsPlayState {
    }

    public static /* synthetic */ int a(WMMRNVideoPlayView wMMRNVideoPlayView, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, wMMRNVideoPlayView, changeQuickRedirect, false, "ed8b0dd055f50f001f79b891aeaf6916", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, wMMRNVideoPlayView, changeQuickRedirect, false, "ed8b0dd055f50f001f79b891aeaf6916")).intValue();
        }
        switch (i) {
            case -1:
                return 6;
            case 0:
            case 5:
            case 6:
            default:
                return -1024;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 7:
                return 5;
        }
    }

    public static /* synthetic */ void b(WMMRNVideoPlayView wMMRNVideoPlayView, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, wMMRNVideoPlayView, changeQuickRedirect, false, "41c3fb0cd275083fb804c56c4d2cfb9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wMMRNVideoPlayView, changeQuickRedirect, false, "41c3fb0cd275083fb804c56c4d2cfb9d");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("playState", i);
        ((RCTEventEmitter) ((ReactContext) wMMRNVideoPlayView.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(wMMRNVideoPlayView.getId(), "onPlayStateChanged", createMap);
    }

    public WMMRNVideoPlayView(Context context, Activity activity) {
        super(context);
        Object[] objArr = {context, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9150df0c358ca72e3ecbe4a51240c087", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9150df0c358ca72e3ecbe4a51240c087");
            return;
        }
        this.e = context;
        this.b = activity;
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03721e31e9db443de7c1c649a0dea7dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03721e31e9db443de7c1c649a0dea7dc");
            return;
        }
        super.onMeasure(i, i2);
        this.d.measure(i, i2);
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d02b82ed287a1052ba48f7c559f13734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d02b82ed287a1052ba48f7c559f13734");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.d.layout(i, i2, i3, i4);
    }

    public final void setVideoUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e81463384d78b5cef86fe0fb8c3e3510", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e81463384d78b5cef86fe0fb8c3e3510");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.c.f();
            VideoPlayerParam videoPlayerParam = new VideoPlayerParam(str);
            videoPlayerParam.a("video-cache", new d.a(this.e).a(1).a());
            this.c.setDataSource(videoPlayerParam);
            this.c.b();
        }
    }

    public final void setLoop(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b523dc3c45c0e8f064038bd584fd91d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b523dc3c45c0e8f064038bd584fd91d");
        } else {
            this.c.setLooping(z);
        }
    }

    public final void setMuted(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "991f9bb58f5ddd0c71733dbd34f31e09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "991f9bb58f5ddd0c71733dbd34f31e09");
        } else if (z) {
            this.c.a(0.0f, 0.0f);
        } else {
            this.c.a(1.0f, 1.0f);
        }
    }
}
