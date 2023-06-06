package com.meituan.android.common.unionid.oneid.network;

import android.os.SystemClock;
import android.util.Pair;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OneIdNetworkHandler {
    public static final int CHNAGE_REQUEST = 3;
    public static final int NORMAL_REQUEST = 1;
    public static final int OAID_REQUEST = 2;
    private static final String TAG = "OneIdNetworkHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static long getWaitTimeExp(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b481bfa901e1c2dcb35b8246500060e", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b481bfa901e1c2dcb35b8246500060e")).longValue() : ((long) Math.pow(2.0d, i)) * 500;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x033f A[LOOP:0: B:265:0x00d4->B:179:0x033f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x040c A[Catch: JSONException -> 0x041c, TRY_LEAVE, TryCatch #25 {JSONException -> 0x041c, blocks: (B:215:0x03f6, B:217:0x040c), top: B:277:0x03f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04ad A[Catch: Exception -> 0x04d7, TryCatch #22 {Exception -> 0x04d7, blocks: (B:238:0x0495, B:240:0x04ad, B:242:0x04d0, B:241:0x04b7), top: B:275:0x0495 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04b7 A[Catch: Exception -> 0x04d7, TryCatch #22 {Exception -> 0x04d7, blocks: (B:238:0x0495, B:240:0x04ad, B:242:0x04d0, B:241:0x04b7), top: B:275:0x0495 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x01e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.String, java.lang.String> request(android.content.Context r26, java.lang.String r27, com.meituan.android.common.unionid.oneid.util.DeviceInfo r28, java.lang.String r29, int r30) {
        /*
            Method dump skipped, instructions count: 1245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.network.OneIdNetworkHandler.request(android.content.Context, java.lang.String, com.meituan.android.common.unionid.oneid.util.DeviceInfo, java.lang.String, int):android.util.Pair");
    }

    private static void setRequestDuration(JSONArray jSONArray, String str, DeviceInfo deviceInfo) {
        Object[] objArr = {jSONArray, str, deviceInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b15848e2ab32b73169bd3b7cc9ec683f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b15848e2ab32b73169bd3b7cc9ec683f");
        } else if (deviceInfo != null) {
            try {
                if (deviceInfo.stat == null || deviceInfo.stat.monitorLog == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("requestId", str);
                jSONObject.put("duration", SystemClock.uptimeMillis() - deviceInfo.stat.monitorLog.startTime);
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static Pair<Integer, JSONObject> addReqTime(DeviceInfo deviceInfo, boolean z, String str) {
        Object[] objArr = {deviceInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d73384b5320e95d40fb381c3ce49c921", RobustBitConfig.DEFAULT_VALUE) ? (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d73384b5320e95d40fb381c3ce49c921") : MonitorManager.addEvent(deviceInfo.stat, getMarkKey(deviceInfo), 122, z, MonitorManager.getExceptionMsg(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r12.equals("1") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getMarkKey(com.meituan.android.common.unionid.oneid.util.DeviceInfo r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.unionid.oneid.network.OneIdNetworkHandler.changeQuickRedirect
            java.lang.String r11 = "5d317a9f0b929e2303b09a31e1ff5a25"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1f:
            java.lang.String r1 = ""
            java.lang.String r12 = r12.requiredId
            r2 = -1
            int r3 = r12.hashCode()
            switch(r3) {
                case 49: goto L40;
                case 50: goto L36;
                case 51: goto L2b;
                case 52: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L49
        L2c:
            java.lang.String r0 = "4"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L49
            r0 = 0
            goto L4a
        L36:
            java.lang.String r0 = "2"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L49
            r0 = 2
            goto L4a
        L40:
            java.lang.String r3 = "1"
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L49
            goto L4a
        L49:
            r0 = -1
        L4a:
            switch(r0) {
                case 0: goto L55;
                case 1: goto L51;
                case 2: goto L4e;
                default: goto L4d;
            }
        L4d:
            goto L58
        L4e:
            java.lang.String r1 = "dpid"
            goto L58
        L51:
            java.lang.String r1 = "unionId"
            goto L58
        L55:
            java.lang.String r1 = "uuid"
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.network.OneIdNetworkHandler.getMarkKey(com.meituan.android.common.unionid.oneid.util.DeviceInfo):java.lang.String");
    }
}
