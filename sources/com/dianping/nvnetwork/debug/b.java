package com.dianping.nvnetwork.debug;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum b {
    NV_DEBUG_EVENT_CODE_FORCE_SELECT_TUNNEL,
    NV_DEBUG_EVENT_CODE_CLOSE_SHARK_TUNNEL,
    NV_DEBUG_EVENT_CODE_SHARK_TUNNEL_STATUS_CHANGE,
    NV_DEBUG_EVENT_CODE_SHARK_CONNECTION_INFO_CHANGE,
    NV_DEBUG_EVENT_CODE_SHARK_CONNECTION_ADDED,
    NV_DEBUG_EVENT_CODE_SHARK_CONNECTION_REMOVED,
    NV_DEBUG_EVENT_CODE_SHARK_CIP_REQUEST_COUNT_ADD,
    NV_DEBUG_EVENT_CODE_SHARK_CIP_REQUEST_SUCCEEDED_COUNT_ADD,
    NV_DEBUG_EVENT_CODE_SHARK_CIP_REQUEST_FAILED_COUNT_ADD,
    NV_DEBUG_EVENT_CODE_SHARK_CIP_REQUEST_FAILOVER_COUNT_ADD,
    NV_DEBUG_EVENT_CODE_SHARK_HTTP_REQUEST_COUNT_ADD,
    NV_DEBUG_EVENT_CODE_SHARK_HTTP_REQUEST_SUCCEEDED_COUNT_ADD,
    NV_DEBUG_EVENT_CODE_SHARK_HTTP_REQUEST_FAILED_COUNT_ADD,
    NV_SHARK_PUSH_DEBUG_EVENT_CODE_TUNNEL_STATUS_CHANGE,
    NV_SHARK_PUSH_DEBUG_EVENT_CODE_LOGIN_STATUS_CHANGE,
    NV_SHARK_PUSH_DEBUG_EVENT_CODE_RECEIVE_MSG;
    
    public static ChangeQuickRedirect a;

    b() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19de73e87acac80fa8ac0328c386c987", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19de73e87acac80fa8ac0328c386c987");
        }
    }

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f68c99f28aa078ca2a1b4bfda5c0f7ff", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f68c99f28aa078ca2a1b4bfda5c0f7ff") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07d472eb1ad0219e80787f23bc53b6ef", 6917529027641081856L) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07d472eb1ad0219e80787f23bc53b6ef") : (b[]) values().clone();
    }
}
