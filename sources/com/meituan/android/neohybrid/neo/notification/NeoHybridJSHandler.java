package com.meituan.android.neohybrid.neo.notification;

import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.animation.AccelerateInterpolator;
import com.google.gson.JsonObject;
import com.meituan.android.neohybrid.base.jshandler.NeoBaseJsHandler;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.android.neohybrid.neo.n;
import com.meituan.android.neohybrid.neo.nsr.b;
import com.meituan.android.neohybrid.neo.nsr.c;
import com.meituan.android.paybase.utils.i;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NeoHybridJSHandler extends NeoBaseJsHandler<String> implements c.a {
    private static final String ACTION_NOTIFY_DOWNGRADE = "notify_downgrade";
    private static final String ACTION_NOTIFY_NSR_FINISHED = "notify_prerender_finished";
    private static final String ACTION_NOTIFY_RENDER_FINISHED = "notify_render_finished";
    private static final String ACTION_NOTIFY_RENDER_FINISHED_AS_MODAL = "notify_render_finished_as_modal";
    private static final String ACTION_NOTIFY_REQUEST_FAIL = "notify_request_fail";
    private static final String ACTION_NOTIFY_UI_RESTORED = "notify_ui_restored";
    private static final String KEY_NEO_UI_CONFIG = "neo_ui_config";
    public static final String NAME = "neohybrid.notifyRender";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String nsrExtra;

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler
    public String getName() {
        return NAME;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r14.equals(com.meituan.android.neohybrid.neo.notification.NeoHybridJSHandler.ACTION_NOTIFY_DOWNGRADE) != false) goto L12;
     */
    @Override // com.meituan.android.neohybrid.base.jshandler.NeoFormatDataJsHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExecute(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.android.neohybrid.neo.notification.NeoHybridJSHandler.changeQuickRedirect
            java.lang.String r12 = "a7568ee638c192a9758ee27f515ad75c"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            return
        L1e:
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 != 0) goto L8b
            r1 = -1
            int r2 = r14.hashCode()
            switch(r2) {
                case -1685857106: goto L63;
                case -1113631739: goto L58;
                case -784167078: goto L4d;
                case 197890052: goto L42;
                case 1184897259: goto L37;
                case 1965554431: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L6e
        L2d:
            java.lang.String r2 = "notify_downgrade"
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L6e
            goto L6f
        L37:
            java.lang.String r0 = "notify_ui_restored"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L6e
            r0 = 4
            goto L6f
        L42:
            java.lang.String r0 = "notify_request_fail"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L6e
            r0 = 5
            goto L6f
        L4d:
            java.lang.String r0 = "notify_render_finished_as_modal"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L6e
            r0 = 3
            goto L6f
        L58:
            java.lang.String r0 = "notify_render_finished"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L6e
            r0 = 0
            goto L6f
        L63:
            java.lang.String r0 = "notify_prerender_finished"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L6e
            r0 = 1
            goto L6f
        L6e:
            r0 = -1
        L6f:
            switch(r0) {
                case 0: goto L87;
                case 1: goto L83;
                case 2: goto L7f;
                case 3: goto L7b;
                case 4: goto L77;
                case 5: goto L73;
                default: goto L72;
            }
        L72:
            goto L8b
        L73:
            r13.notifyRequestFail(r15)
            return
        L77:
            r13.notifyUIRestored()
            return
        L7b:
            r13.notifyShowAsModal()
            return
        L7f:
            r13.notifyDowngrade(r15)
            return
        L83:
            r13.notifyNSRFinished(r15)
            return
        L87:
            r13.notifyRenderFinish(r15)
            return
        L8b:
            r13.formatJsCallbackActionError()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.neo.notification.NeoHybridJSHandler.onExecute(java.lang.String, java.lang.String):void");
    }

    private void notifyNSRFinished(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a0dffa855f0fcf36ae0337d9ac34ee8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a0dffa855f0fcf36ae0337d9ac34ee8");
            return;
        }
        com.meituan.android.neohybrid.core.a neoCompat = getNeoCompat();
        if (neoCompat == null) {
            formatJsCallbackError(2001, "NeoCompat未知异常");
        } else if (!neoCompat.j()) {
            neoCompat.a(this);
            neoCompat.l();
            this.nsrExtra = str;
        } else {
            onBusinessProcess();
        }
    }

    private void notifyRenderFinish(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1cfc724135bcc14f7e0ca8d03518896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1cfc724135bcc14f7e0ca8d03518896");
            return;
        }
        n loadingStatus = getLoadingStatus(str);
        com.meituan.android.neohybrid.core.a neoCompat = getNeoCompat();
        if (neoCompat == null) {
            formatJsCallbackError(2001, "Activity未知异常");
        } else if (neoCompat.j()) {
            if (loadingStatus == n.FINISHED) {
                neoCompat.b();
            } else {
                neoCompat.a(loadingStatus);
            }
            formatJsCallbackSucc();
        } else {
            neoCompat.a(this);
            neoCompat.l();
        }
    }

    private void notifyDowngrade(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c38e0bac46e5427456b2e1a59a053b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c38e0bac46e5427456b2e1a59a053b6");
        } else if (TextUtils.isEmpty(str)) {
            formatJsCallbackDataError();
        } else {
            com.meituan.android.neohybrid.core.a neoCompat = getNeoCompat();
            if (neoCompat == null) {
                formatJsCallbackError(2001, "Fragment未知异常");
            } else if (neoCompat.j()) {
                neoCompat.a(str);
                formatJsCallbackSucc();
            } else {
                b.a(neoCompat);
            }
        }
    }

    private void notifyShowAsModal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "397b000b313666d5b7ca3c03c1bb2fd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "397b000b313666d5b7ca3c03c1bb2fd7");
        } else if (getNeoCompat() == null || getNeoCompat().f() == null) {
        } else {
            UIConfig uiConfig = getNeoCompat().f().uiConfig();
            HashMap hashMap = new HashMap();
            uiConfig.save(hashMap);
            com.meituan.android.neohybrid.base.a.a(getNeoCompat()).a(KEY_NEO_UI_CONFIG, hashMap);
            uiConfig.setStatusBarColor("#99000000");
            uiConfig.setBackgroundColor("#99000000");
            uiConfig.setTitleBarTransparent(true);
            getNeoCompat().m();
            notifyRenderFinish(null);
        }
    }

    private void notifyUIRestored() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5eafa88a6273cf07091042876903016d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5eafa88a6273cf07091042876903016d");
        } else if (jsHost().getActivity() == null || getNeoCompat() == null || getNeoCompat().f() == null) {
        } else {
            UIConfig uiConfig = getNeoCompat().f().uiConfig();
            Map<String, ?> map = (Map) com.meituan.android.neohybrid.base.a.a(getNeoCompat()).e(KEY_NEO_UI_CONFIG);
            if (i.a(map)) {
                return;
            }
            uiConfig.parse(map);
            map.clear();
            uiConfig.setTitleBarTransparent(false);
            getNeoCompat().m();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jsHost().getActivity().getWindow().getDecorView(), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.start();
            formatJsCallbackSucc();
        }
    }

    private void notifyRequestFail(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63d06b5c92704398464aac420e5559e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63d06b5c92704398464aac420e5559e7");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("url");
            jSONObject.optString(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE);
            jSONObject.optString(NetLogConstants.Details.ERROR_MSG);
            if (getNeoCompat() == null) {
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.a
    public void onBusinessProcess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19a7b05cfdc0032a3a7bade2d156910b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19a7b05cfdc0032a3a7bade2d156910b");
        } else {
            formatJsCallbackSucc(nsrCallbackWithTunnelParams(this.nsrExtra));
        }
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.a
    public void onFailProcess(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "617c2e437c2bf3f2f588b188b00ac7b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "617c2e437c2bf3f2f588b188b00ac7b4");
        } else {
            formatJsCallbackError(i, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONObject nsrCallbackWithTunnelParams(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.neohybrid.neo.notification.NeoHybridJSHandler.changeQuickRedirect
            java.lang.String r10 = "46dbfa723e4df6e339f277fe310419be"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            return r12
        L1e:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r1 = 0
            if (r0 == 0) goto L26
            return r1
        L26:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L35
            r0.<init>(r12)     // Catch: org.json.JSONException -> L35
            java.lang.String r12 = "useParamTunnel"
            org.json.JSONObject r12 = r0.optJSONObject(r12)     // Catch: org.json.JSONException -> L33
            goto L3d
        L33:
            r12 = move-exception
            goto L37
        L35:
            r12 = move-exception
            r0 = r1
        L37:
            java.lang.String r2 = "NeoHybridJSHandler_nsrCallbackWithTunnelParams"
            com.meituan.android.neohybrid.neo.report.b.a(r12, r2, r1)
            r12 = r0
        L3d:
            java.lang.Class<com.meituan.android.neohybrid.neo.tunnel.TunnelParamJSHandler> r0 = com.meituan.android.neohybrid.neo.tunnel.TunnelParamJSHandler.class
            org.json.JSONObject r12 = com.meituan.android.neohybrid.base.jshandler.NeoWrapperJsHandler.execNewJsHandler(r11, r0, r12)
            if (r12 == 0) goto L57
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "useParamTunnel"
            r0.put(r2, r12)     // Catch: org.json.JSONException -> L51
            return r0
        L51:
            r12 = move-exception
            java.lang.String r0 = "NeoHybridJSHandler_nsrCallbackWithTunnelParams"
            com.meituan.android.neohybrid.neo.report.b.a(r12, r0, r1)
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.neo.notification.NeoHybridJSHandler.nsrCallbackWithTunnelParams(java.lang.String):org.json.JSONObject");
    }

    public static n getLoadingStatus(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cf8ff7b5e45c455d14997d50ea17f8b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cf8ff7b5e45c455d14997d50ea17f8b0");
        }
        if (TextUtils.isEmpty(str)) {
            return n.FINISHED;
        }
        try {
            String asString = ((JsonObject) com.meituan.android.neohybrid.util.gson.b.a().fromJson(str, (Class<Object>) JsonObject.class)).get("ssr_show_on_visible").getAsString();
            if ("first_frame".equals(asString)) {
                return n.VISIBLE;
            }
            if ("first_frame_with_loading".equals(asString)) {
                return n.VISIBLE_WITH_LOADING;
            }
            return n.FINISHED;
        } catch (Exception unused) {
            return n.FINISHED;
        }
    }
}
