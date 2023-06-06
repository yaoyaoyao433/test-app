package com.meituan.android.mrn.component.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum d {
    STATE_ERROR("onVideoError"),
    STATE_PREPARING("onVideoPreparing"),
    STATE_PREPARED("onVideoPrepared"),
    STATE_PLAYBACK_COMPLETED("onVideoCompleted"),
    STATE_PLAYING("onVideoPlaying"),
    STATE_BUFFERING_PLAYING("onVideoBufferingPlaying"),
    STATE_PAUSED("onVideoPaused"),
    STATE_BUFFERING_PAUSED("onVideoBufferingPaused"),
    STATE_IDLE("onVideoIdle"),
    STATE_PROGRESS("onVideoProgress");
    
    public static ChangeQuickRedirect a;
    final String l;

    public static d valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b2c54b96786d7f92d5032bdb193d569", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b2c54b96786d7f92d5032bdb193d569") : (d) Enum.valueOf(d.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1069b197f7c63696ccbc2cb779af3ac9", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1069b197f7c63696ccbc2cb779af3ac9") : (d[]) values().clone();
    }

    d(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14d365ca2645401cd0d9e153832e7cdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14d365ca2645401cd0d9e153832e7cdc");
        } else {
            this.l = str;
        }
    }
}
