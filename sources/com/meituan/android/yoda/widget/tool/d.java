package com.meituan.android.yoda.widget.tool;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(int i, int i2, long j, HashMap<String, String> hashMap) {
        int i3;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "accb5a8d4b077d55cbd17624c19e4695", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "accb5a8d4b077d55cbd17624c19e4695");
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("duration", Long.valueOf(j));
        String str = "";
        switch (i) {
            case 1:
                i3 = i2 == 1 ? 10001 : i2 == 2 ? 10002 : i2 == 3 ? 10003 : i2 == 4 ? 10004 : 0;
                str = "yoda_face_live_wink";
                break;
            case 2:
                i3 = i2 == 1 ? 10011 : i2 == 2 ? RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_START_EVENT : i2 == 4 ? RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_STOP_EVENT : 0;
                str = "yoda_face_live_openmouth";
                break;
            case 3:
                i3 = i2 == 1 ? 10031 : i2 == 2 ? 10032 : i2 == 4 ? 10033 : 0;
                str = "yoda_face_live_uphead";
                break;
            case 4:
                i3 = i2 == 1 ? 10021 : i2 == 2 ? 10022 : i2 == 4 ? 10023 : 0;
                str = "yoda_face_live_shakehead";
                break;
            default:
                i3 = 0;
                break;
        }
        if (TextUtils.isEmpty(str) || i3 == 0) {
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("CameraReport", "reportFaceLiveAction " + str + " code:" + i3 + " duration:" + j, true);
        com.meituan.android.yoda.monitor.report.a.a(str, i3, (int) j, jsonObject);
    }

    public static void a(int[] iArr, int i, long j, HashMap<String, String> hashMap) {
        int i2;
        Object[] objArr = {iArr, Integer.valueOf(i), 0L, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db82dbcd50f4202ada454a87dc0790af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db82dbcd50f4202ada454a87dc0790af");
        } else if (iArr != null && iArr.length > 1) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("duration", (Number) 0L);
            StringBuilder sb = new StringBuilder();
            for (int i3 : iArr) {
                sb.append(i3);
            }
            if (i == 1) {
                sb.append("00041");
            } else if (i == 2) {
                sb.append("00042");
            } else if (i == 4) {
                sb.append("00043");
            }
            try {
                i2 = Integer.parseInt(sb.toString());
            } catch (Exception e) {
                e.printStackTrace();
                i2 = 0;
            }
            if (TextUtils.isEmpty("yoda_face_action_live") || i2 == 0) {
                return;
            }
            com.meituan.android.yoda.monitor.log.a.a("CameraReport", "reportFaceLiveGroupAction yoda_face_action_live code:" + i2 + " duration:0", true);
            com.meituan.android.yoda.monitor.report.a.a("yoda_face_action_live", i2, 0, jsonObject);
        }
    }

    public static void a(int i, long j, HashMap<String, String> hashMap) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90221530bb6f262faff2bde5021795cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90221530bb6f262faff2bde5021795cd");
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("duration", Long.valueOf(j));
        String str = "";
        if (i != 6) {
            switch (i) {
                case 1:
                    str = "yoda_face_live_wink_elapsedtime";
                    break;
                case 2:
                    str = "yoda_face_live_openmouth_elapsedtime";
                    break;
                case 3:
                    str = "yoda_face_live_uphead_elapsedtime";
                    break;
                case 4:
                    str = "yoda_face_live_shakehead_elapsedtime";
                    break;
            }
        } else {
            str = "yoda_face_action_live_elapsedtime";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.meituan.android.yoda.monitor.log.a.a("CameraReport", "reportFaceLiveSpendTime " + str + " duration:" + j, true);
        com.meituan.android.yoda.monitor.report.a.a(str, 0, (int) j, jsonObject);
    }
}
