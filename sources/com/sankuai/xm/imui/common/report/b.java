package com.sankuai.xm.imui.common.report;

import android.text.TextUtils;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.monitor.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static Map<String, MetricsSpeedMeterTask> b = new ConcurrentHashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d45c4094319396a2272bddea31a0ac2", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d45c4094319396a2272bddea31a0ac2")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        switch (str.hashCode()) {
            case -1441964970:
                if (str.equals("com.sankuai.xm.integration.mediapicker.preview.PreviewImgActivity")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -214085369:
                if (str.equals("com.sankuai.xm.imui.session.SessionActivity")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 128152509:
                if (str.equals("com.sankuai.xm.integration.mediapicker.picchooser.MediaPickActivity")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 382981907:
                if (str.equals("com.sankuai.xm.video.PlayVideoActivity")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 813258677:
                if (str.equals("com.sankuai.xm.imui.common.activity.FileDownloadActivity")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 830804438:
                if (str.equals("com.sankuai.xm.video.RecordVideoActivity")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1029532326:
                if (str.equals("com.sankuai.xm.imui.common.activity.WebViewActivity")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 8;
            case 3:
                return 7;
            case 4:
                return 9;
            case 5:
                return 6;
            case 6:
                return 4;
            default:
                return -1;
        }
    }

    public static void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26eda7aadff62273f861c8ac5343bd53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26eda7aadff62273f861c8ac5343bd53");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i));
        if (i == -1) {
            hashMap.put("name", str);
        }
        c.a("ui_active", hashMap);
    }

    public static void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c02671c6dcf562964b0c3863e4b7af06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c02671c6dcf562964b0c3863e4b7af06");
            return;
        }
        d.b("reportUISession chatId:" + str + " action:" + str2 + "msg:" + str3, new Object[0]);
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a38563d5b47460ba76a84c1654c621db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a38563d5b47460ba76a84c1654c621db");
            return;
        }
        b.put(str, MetricsSpeedMeterTask.createPageSpeedMeterTask("XM_SDK_SESSION_ACTIVITY"));
        c.a("ui_session_load", str);
    }

    public static void a(String str, SessionId sessionId, boolean z) {
        Object[] objArr = {str, sessionId, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e731680923aefb49fb99f20ed2abce0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e731680923aefb49fb99f20ed2abce0");
        } else if (z) {
            c.b("ui_session_load", str);
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3dfaa786f8a632f3e781eb0a39266526", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3dfaa786f8a632f3e781eb0a39266526");
                return;
            }
            MetricsSpeedMeterTask remove = b.remove(str);
            if (remove != null) {
                h.a(remove);
            }
        } else {
            a(str, "view first load done");
            HashMap hashMap = new HashMap();
            hashMap.put(MessageStatisticsEntry.PARAM_CHAT, sessionId.b + CommonConstant.Symbol.UNDERLINE + sessionId.c);
            hashMap.put(MessageStatisticsEntry.PARAM_CHANNEL, Short.valueOf(sessionId.g));
            hashMap.put(MessageStatisticsEntry.PARAM_MSG_CATEGORY, Integer.valueOf(sessionId.e));
            c.a("ui_session_load", str, (Map<String, Object>) hashMap);
        }
    }

    public static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c163147eeb5a65322f86e3878780f57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c163147eeb5a65322f86e3878780f57");
        } else if (i == 1 || i == 6) {
            a(str, "local data load start");
            c.a("ui_session_msg_load", str);
        }
    }

    public static void a(String str, SessionId sessionId, int i) {
        Object[] objArr = {str, sessionId, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41d95bd65989df9755ef7da214a15106", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41d95bd65989df9755ef7da214a15106");
        } else if (i == 0) {
            c.b("ui_session_msg_load", str);
        } else if (i == 1 || i == 6) {
            a(str, "local data load done");
            HashMap hashMap = new HashMap();
            hashMap.put(MessageStatisticsEntry.PARAM_CHAT, sessionId.b + CommonConstant.Symbol.UNDERLINE + sessionId.c);
            hashMap.put(MessageStatisticsEntry.PARAM_CHANNEL, Short.valueOf(sessionId.g));
            hashMap.put(MessageStatisticsEntry.PARAM_MSG_CATEGORY, Integer.valueOf(sessionId.e));
            c.a("ui_session_msg_load", str, (Map<String, Object>) hashMap);
        }
    }

    private static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc280d6c52d9e184c326ee5a2b162bbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc280d6c52d9e184c326ee5a2b162bbb");
            return;
        }
        MetricsSpeedMeterTask metricsSpeedMeterTask = b.get(str);
        if (metricsSpeedMeterTask != null) {
            metricsSpeedMeterTask.recordStep(str2);
        }
    }
}
