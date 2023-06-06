package com.dianping.live.live.mrn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum k {
    STATE_INIT_ALREADY("initAlready"),
    STATE_INIT_FAILED("initFailed"),
    STATE_INIT_SUCCESS("initSuccess"),
    STATE_ERROR("onMLivePusherError"),
    STATE_BIND_STATE_CHANGE("onBindStateChange"),
    STATE_BIND_NET_STATUS("onBindNetStatus"),
    STATE_ON_PUSHER_START_SUCCESS("onPusherStartSuccess"),
    STATE_ON_PUSHER_START_FAIL("onPusherStartFail"),
    STATE_ON_LICENSE_FAIL("onLicenseFail"),
    STATE_ON_PUSH_STREAM_SUCCESS("onPushStreamSuccess"),
    STATE_ON_CAMERA_SUCCESS("onCameraSuccess"),
    STATE_ON_CAMERA_FAIL("onCameraFail"),
    STATE_ON_MIC_FAIL("onMicFail"),
    STATE_ON_NETWORK_FAIL("onNetWorkFail"),
    STATE_ON_NETWORK_RESTART("onNetWorkRestart"),
    STATE_ON_SNAPSHOT_SUCCESS("onSnapshotSuccess"),
    STATE_ON_NETWORK_BUSY("onNetWorkBusy"),
    STATE_ON_NETWORK_AVAILABLE("onNetWorkAvailable"),
    STATE_ON_NETWORK_AVAILABLE_RESTART("onNetWorkAvailableRestart");
    
    public static ChangeQuickRedirect a;
    final String u;

    public static k valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58cdc891ba1a2582df876ba07a100c57", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58cdc891ba1a2582df876ba07a100c57") : (k) Enum.valueOf(k.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static k[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6f7377945ad1e25ef87f27e7d61a4f9", RobustBitConfig.DEFAULT_VALUE) ? (k[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6f7377945ad1e25ef87f27e7d61a4f9") : (k[]) values().clone();
    }

    k(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bf7e4e1aa2f80fb8ae2e5db7e40843a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bf7e4e1aa2f80fb8ae2e5db7e40843a");
        } else {
            this.u = str;
        }
    }
}
