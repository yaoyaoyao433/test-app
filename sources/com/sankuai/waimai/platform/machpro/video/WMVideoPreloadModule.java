package com.sankuai.waimai.platform.machpro.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.proxy.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.instance.b;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMVideoPreloadModule extends MPModule {
    private static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    public static ChangeQuickRedirect changeQuickRedirect;
    private AudioManager mAudioManager;
    private BroadcastReceiver mVolumeBroadcastReceiver;
    private MPJSCallBack mVolumeCallback;

    @JSMethod(methodName = "cleanAllCaches")
    public void cleanAllCaches() {
    }

    public WMVideoPreloadModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69537b04b4fdffd177d6ece60c7b6f2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69537b04b4fdffd177d6ece60c7b6f2f");
            return;
        }
        this.mVolumeBroadcastReceiver = new BroadcastReceiver() { // from class: com.sankuai.waimai.platform.machpro.video.WMVideoPreloadModule.2
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fc1140f2d88bf1cd83e4b2421de2aabd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fc1140f2d88bf1cd83e4b2421de2aabd");
                } else if (WMVideoPreloadModule.this.mVolumeCallback != null && WMVideoPreloadModule.VOLUME_CHANGED_ACTION.equals(intent.getAction()) && f.a(intent, WMVideoPreloadModule.EXTRA_VOLUME_STREAM_TYPE, -1) == 3) {
                    MachMap machMap = new MachMap();
                    machMap.put("volume", WMVideoPreloadModule.this.getVolume());
                    WMVideoPreloadModule.this.mVolumeCallback.invoke(machMap);
                }
            }
        };
        if (getMachContext() != null) {
            getMachContext().getInstance().a(new b() { // from class: com.sankuai.waimai.platform.machpro.video.WMVideoPreloadModule.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.machpro.instance.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "38d10b036fef63819d67edce62cbdd0e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "38d10b036fef63819d67edce62cbdd0e");
                        return;
                    }
                    super.a();
                    Context context = WMVideoPreloadModule.this.getMachContext() != null ? WMVideoPreloadModule.this.getMachContext().getContext() : null;
                    if (context == null) {
                        return;
                    }
                    try {
                        context.unregisterReceiver(WMVideoPreloadModule.this.mVolumeBroadcastReceiver);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    @JSMethod(methodName = "preloadVideo")
    public void preloadVideo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a5c51ff6631ef8a5d93d25acaa9e514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a5c51ff6631ef8a5d93d25acaa9e514");
        } else if (TextUtils.isEmpty(str) || getMachContext() == null) {
        } else {
            VideoPlayerParam videoPlayerParam = new VideoPlayerParam(str);
            videoPlayerParam.a(getMachContext().getContext(), "MachProVideoCache");
            videoPlayerParam.a((m.b) null, m.d.a((long) PlaybackStateCompat.ACTION_SET_REPEAT_MODE));
        }
    }

    @JSMethod(methodName = "preloadVideos")
    public void preloadVideos(MachArray machArray) {
        Object[] objArr = {machArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de90e98ec7687f87a79070c3a955e446", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de90e98ec7687f87a79070c3a955e446");
        } else if (machArray != null && machArray.size() > 0) {
            for (int i = 0; i < machArray.size(); i++) {
                preloadVideo(com.sankuai.waimai.machpro.util.b.a(machArray.get(i), ""));
            }
        }
    }

    @JSMethod(methodName = "hasCacheData")
    public boolean hasCacheData(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc87d8731344710dcfef67144d59e24b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc87d8731344710dcfef67144d59e24b")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || getMachContext() == null) {
            return false;
        }
        VideoPlayerParam videoPlayerParam = new VideoPlayerParam(str);
        videoPlayerParam.a(getMachContext().getContext(), "MachProVideoCache");
        return videoPlayerParam.f();
    }

    @JSMethod(methodName = "getVolume")
    public Integer getVolume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9780d7f43666390ec69d2205072dfdbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9780d7f43666390ec69d2205072dfdbc");
        }
        Context context = getMachContext() != null ? getMachContext().getContext() : null;
        if (context == null) {
            return -1;
        }
        if (this.mAudioManager == null) {
            this.mAudioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        }
        return Integer.valueOf(this.mAudioManager.getStreamVolume(3));
    }

    @JSMethod(methodName = "observeVolume")
    public void observeVolume(MPJSCallBack mPJSCallBack) {
        Object[] objArr = {mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14f7613ae6dc76e69061013f8c4b875a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14f7613ae6dc76e69061013f8c4b875a");
            return;
        }
        this.mVolumeCallback = mPJSCallBack;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(VOLUME_CHANGED_ACTION);
        if (getMachContext() != null) {
            getMachContext().getContext().registerReceiver(this.mVolumeBroadcastReceiver, intentFilter);
        }
    }
}
