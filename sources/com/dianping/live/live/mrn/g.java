package com.dianping.live.live.mrn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum g {
    STATE_INIT_ALREADY("initAlready"),
    STATE_INIT_FAILED("initFailed"),
    STATE_INIT_SUCCESS("initSuccess"),
    STATE_ERROR("onMLivePlayerError"),
    STATE_BIND_STATE_CHANGE("onBindStateChange"),
    STATE_BIND_NET_STATUS("onBindNetStatus"),
    STATE_ON_PLAYER_START_SUCCESS("onPlayerStartSuccess"),
    STATE_ON_PLAY_URL_NULL("onPlayUrlNull"),
    STATE_ON_PLAY_URL_ILLEGAL("onPlayUrlIllegal"),
    STATE_ON_PLAY_TYPE_ILLEGAL("onPlayTypeIllegal"),
    STATE_ON_PLAY_STREAM_SUCCESS("onPlayStreamSuccess"),
    STATE_ON_NETWORK_RESTART("onNetWorkRestart"),
    STATE_ON_NETWORK_FAIL("onNetWorkFail"),
    STATE_ON_PLAY_BEGIN("onPlayBegin"),
    STATE_ON_PLAY_END("onPlayEnd"),
    STATE_ON_NETWORK_AVAILABLE("onNetWorkAvailable"),
    STATE_ON_NETWORK_AVAILABLE_RESTART("onNetWorkAvailableRestart"),
    STATE_ON_NETWORK_AUTO_RESTART("onNetWorkAutoRestart"),
    STATE_ON_PROGRESS_UPDATE("onProgressUpdate");
    
    public static ChangeQuickRedirect a;
    final String u;

    public static g valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b18453c83a89bc0221c161ff4a37f106", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b18453c83a89bc0221c161ff4a37f106") : (g) Enum.valueOf(g.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82b73a33c0c93efe9c0a5983ed54bbe9", RobustBitConfig.DEFAULT_VALUE) ? (g[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82b73a33c0c93efe9c0a5983ed54bbe9") : (g[]) values().clone();
    }

    g(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d866e930ca194402f0b43ad787c94ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d866e930ca194402f0b43ad787c94ff");
        } else {
            this.u = str;
        }
    }
}
