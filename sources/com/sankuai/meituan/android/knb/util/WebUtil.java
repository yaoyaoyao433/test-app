package com.sankuai.meituan.android.knb.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.b;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WebUtil {
    private static final String ACTION = "com.meituan.android.intent.action.pick_review_photo";
    private static final String[] DPHOSTS = {".dianping.com", ".51ping.com", ".dpfile.com", ".alpha.dp"};
    private static final String EXTRA_COMPLETION_TEXT = "completion_text";
    public static final String EXTRA_RESULT_IMAGES = "results";
    private static final String EXTRA_SELECTED_IMAGES = "selected";
    private static final String EXTRA_SELECT_LIMITS = "lmits";
    private static final String TAG = "knb_wu";
    public static final String TitansWhiteBoard = "[ \".dianping.com\",\".51ping.com\", \".dpfile.com\", \".alpha.dp\",\".meituan.com\",\".maoyan.com\",\".dper.com\",\".kuxun.cn\"]";
    public static final String TitansWhiteList = "TitansWhiteList";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[Catch: Throwable -> 0x0096, TRY_ENTER, TryCatch #1 {Throwable -> 0x0096, blocks: (B:6:0x0023, B:8:0x002c, B:11:0x0036, B:14:0x0045, B:31:0x0083, B:33:0x0089, B:17:0x0057, B:21:0x0066, B:23:0x006c, B:25:0x0076), top: B:43:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isFromDP(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.android.knb.util.WebUtil.changeQuickRedirect
            java.lang.String r11 = "71de34dedf3a6c039b77f3feff96599b"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L23
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L23:
            java.lang.String r1 = "js://_"
            boolean r1 = r12.startsWith(r1)     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L95
            java.lang.String r1 = "javascript:"
            boolean r1 = r12.startsWith(r1)     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L36
            goto L95
        L36:
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch: java.lang.Throwable -> L96
            java.lang.String r12 = r12.getHost()     // Catch: java.lang.Throwable -> L96
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L45
            return r9
        L45:
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L96
            java.lang.String r12 = r12.toLowerCase(r1)     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = "[ \".dianping.com\",\".51ping.com\", \".dpfile.com\", \".alpha.dp\",\".meituan.com\",\".maoyan.com\",\".dper.com\",\".kuxun.cn\"]"
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L57
        L55:
            r1 = 1
            goto L81
        L57:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L96
            java.lang.String r2 = "[ \".dianping.com\",\".51ping.com\", \".dpfile.com\", \".alpha.dp\",\".meituan.com\",\".maoyan.com\",\".dper.com\",\".kuxun.cn\"]"
            r1.<init>(r2)     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L96
            int r2 = r1.length()     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L96
            if (r2 != 0) goto L65
            goto L55
        L65:
            r2 = 0
        L66:
            int r3 = r1.length()     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L96
            if (r2 >= r3) goto L80
            java.lang.String r3 = r1.optString(r2)     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L96
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L96
            if (r4 != 0) goto L7d
            boolean r3 = r12.endsWith(r3)     // Catch: org.json.JSONException -> L55 java.lang.Throwable -> L96
            if (r3 == 0) goto L7d
            return r0
        L7d:
            int r2 = r2 + 1
            goto L66
        L80:
            r1 = 0
        L81:
            if (r1 == 0) goto L96
            java.lang.String[] r1 = com.sankuai.meituan.android.knb.util.WebUtil.DPHOSTS     // Catch: java.lang.Throwable -> L96
            int r2 = r1.length     // Catch: java.lang.Throwable -> L96
            r3 = 0
        L87:
            if (r3 >= r2) goto L96
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L96
            boolean r4 = r12.endsWith(r4)     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto L92
            return r0
        L92:
            int r3 = r3 + 1
            goto L87
        L95:
            return r9
        L96:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.util.WebUtil.isFromDP(java.lang.String):boolean");
    }

    public static void fileScan(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c7b15383a514a0d5c28de43686f247f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c7b15383a514a0d5c28de43686f247f8");
            return;
        }
        b.a(context, new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + str)));
    }

    public static Intent createPickImageIntent(int i, String str, ArrayList<Uri> arrayList, ArrayList<Uri> arrayList2) {
        Object[] objArr = {Integer.valueOf(i), str, arrayList, arrayList2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "02b11ba2757f94f23cac70f554bdfc2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "02b11ba2757f94f23cac70f554bdfc2d");
        }
        Intent intent = new Intent(ACTION);
        intent.putExtra(EXTRA_SELECT_LIMITS, i);
        intent.putExtra(EXTRA_COMPLETION_TEXT, str);
        intent.putExtra("selected", arrayList);
        intent.putExtra(EXTRA_RESULT_IMAGES, arrayList2);
        return intent;
    }

    public static int getRGBAColor(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "68d83cd489edd28cc669254a76dc3d32", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "68d83cd489edd28cc669254a76dc3d32")).intValue();
        }
        try {
            return getRGBAColor(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static int getRGBAColor(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d1d7c420b22a671b18eea106626c332", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d1d7c420b22a671b18eea106626c332")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            throw new Exception("invalid color");
        }
        try {
            if (str.startsWith("#")) {
                str = str.substring(1);
            }
            int length = str.length();
            if (length == 4 || length == 3) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < length; i++) {
                    stringBuffer.append(str.charAt(i));
                    stringBuffer.append(str.charAt(i));
                }
                str = stringBuffer.toString();
            }
            if (str.length() == 8) {
                return (Integer.parseInt(str.substring(6), 16) << 24) + Integer.parseInt(str.substring(0, 6), 16);
            }
            if (str.length() == 6) {
                return (-16777216) + Integer.parseInt(str, 16);
            }
            throw new Exception("invalid color");
        } catch (Exception unused) {
            throw new Exception("invalid color");
        }
    }
}
