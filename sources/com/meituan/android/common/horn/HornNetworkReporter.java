package com.meituan.android.common.horn;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornNetworkReporter {
    public static final String ACTION_BROADCAST_HORN_DEVELOPER_TOOL_INIT_FAIL = "ACTION_BROADCAST_HORN_DEVELOPER_TOOL_INIT_FAIL";
    public static final String ACTION_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER = "ACTION_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER";
    public static final String KEY_BROADCAST_HORN_DEVELOPER_TOOL_INIT_FAIL_STACK = "KEY_BROADCAST_HORN_DEVELOPER_TOOL_INIT_FAIL_STACK";
    public static final String KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_CONFIG_COUNT = "KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_CONFIG_COUNT";
    @Deprecated
    public static final String KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_HTTP_CONFIG_MAP = "ACTION_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_CONFIG_MAP";
    public static final String KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_HTTP_METHOD = "ACTION_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_METHOD";
    public static final String KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_HTTP_OS = "ACTION_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_OS";
    public static final String KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_HTTP_SOURCE = "ACTION_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_SOURCE";
    public static final String KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_HTTP_TOKEN = "ACTION_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_TOKEN";
    public static final String KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_HTTP_URL = "ACTION_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_URL";
    public static final String KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_RECEIVE_TIME = "ACTION_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_RECEIVE_TIME";
    public static final String KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_REQUEST_MAP = "ACTION_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_REQUEST_MAP";
    public static final String KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_RESPONSE_MAP = "ACTION_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_RESPONSE_MAP";
    public static final String KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_TYPE = "ACTION_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_TYPE";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void report(Context context, String str, String str2, String str3, String str4, long j, String str5, String str6, Map<String, String> map, Map<String, String> map2) {
        Object[] objArr = {context, str, str2, str3, str4, new Long(j), str5, str6, map, map2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4bcc8af4bad7d398b44d1ee71d615225", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4bcc8af4bad7d398b44d1ee71d615225");
            return;
        }
        Intent intent = new Intent();
        intent.setAction(ACTION_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER);
        intent.putExtra(KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_TYPE, str2);
        intent.putExtra(KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_HTTP_METHOD, str);
        intent.putExtra(KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_HTTP_URL, str6);
        intent.putExtra(KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_HTTP_SOURCE, str3);
        intent.putExtra(KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_HTTP_OS, str4);
        intent.putExtra(KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_RECEIVE_TIME, j);
        intent.putExtra(KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_HTTP_TOKEN, str5);
        if (map != null && (map instanceof HashMap)) {
            intent.putExtra(KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_REQUEST_MAP, (HashMap) map);
        }
        if (map2 != null && (map2 instanceof HashMap)) {
            intent.putExtra(KEY_BROADCAST_HORN_DEVELOPER_TOOL_NETWORK_LISTENER_RESPONSE_MAP, (HashMap) map2);
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void reportInitFail(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b6365c45a8e84ea208130c79689c41d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b6365c45a8e84ea208130c79689c41d1");
            return;
        }
        Intent intent = new Intent();
        intent.setAction(ACTION_BROADCAST_HORN_DEVELOPER_TOOL_INIT_FAIL);
        intent.putExtra(KEY_BROADCAST_HORN_DEVELOPER_TOOL_INIT_FAIL_STACK, str);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }
}
