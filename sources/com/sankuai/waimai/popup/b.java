package com.sankuai.waimai.popup;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.HomePageFragment;
import com.sankuai.waimai.business.page.home.actinfo.b;
import com.sankuai.waimai.business.page.home.gray.HomeGrayManager;
import com.sankuai.waimai.business.page.home.gray.HomeGrayModel;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.o;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.mach.dialog.i;
import com.sankuai.waimai.popup.GetInfoResponse;
import com.sankuai.waimai.popup.c;
import com.sankuai.waimai.pouch.unionanim.d;
import com.sankuai.waimai.touchmatrix.data.TMatrixShowInfo;
import com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final DynamicDialog.h b = new DynamicDialog.h() { // from class: com.sankuai.waimai.popup.b.1
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.h
        public final com.sankuai.waimai.platform.mach.dialog.e a(Activity activity, AlertInfo.Module module) {
            com.sankuai.waimai.platform.mach.dialog.e eVar;
            Object[] objArr = {activity, module};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83b3a173fe1a943cb57e779fa828826", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.platform.mach.dialog.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83b3a173fe1a943cb57e779fa828826");
            }
            String w = activity instanceof BaseActivity ? ((BaseActivity) activity).w() : "";
            com.sankuai.waimai.mach.d dVar = null;
            switch (module.containerType) {
                case 1:
                    eVar = new com.sankuai.waimai.popup.container.e(activity, w);
                    break;
                case 2:
                    eVar = new com.sankuai.waimai.popup.container.e(activity, w);
                    break;
                case 3:
                    eVar = new com.sankuai.waimai.popup.container.c(activity, w);
                    break;
                default:
                    eVar = null;
                    break;
            }
            if (eVar == null) {
                return null;
            }
            String b2 = b.b(activity);
            if ("ad".equals(module.businessType)) {
                dVar = new com.sankuai.waimai.popup.container.a("c_m84bv26", b2, eVar.g());
            } else if ("marketing".equals(module.businessType)) {
                dVar = new com.sankuai.waimai.popup.container.d("c_m84bv26", b2);
            }
            eVar.a(dVar);
            eVar.a(new Rect(0, 0, activity.getResources().getDisplayMetrics().widthPixels, activity.getResources().getDisplayMetrics().heightPixels));
            return eVar;
        }
    };

    public static /* synthetic */ void a(int i, String str, Activity activity, GetInfoResponse.NativeData nativeData, com.sankuai.waimai.popup.strategy.b[] bVarArr, Map map) {
        Object[] objArr = {Integer.valueOf(i), str, activity, nativeData, bVarArr, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7dd52da91fb020002640b6ef819dfa36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7dd52da91fb020002640b6ef819dfa36");
        } else if (i == 0) {
            String str2 = (String) map.get("clickUrl");
            if (!TextUtils.isEmpty(str2)) {
                com.sankuai.waimai.foundation.router.a.a(activity, str2);
            }
            bVarArr[0].b();
            Object[] objArr2 = {str, nativeData};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5ceba4d4b680a24696833000eaa286ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5ceba4d4b680a24696833000eaa286ff");
            } else {
                JudasManualManager.a("b_6CLPA", "c_m84bv26", str).a("is_login", com.sankuai.waimai.platform.domain.manager.user.a.i().a() ? 1 : 0).a("is_new", nativeData.activityId != 1 ? 0 : 1).a("channel_id", a()).a();
            }
        }
    }

    public static /* synthetic */ void a(Activity activity, GetInfoResponse.NativeData nativeData, com.sankuai.waimai.popup.strategy.b[] bVarArr, boolean z) {
        Object[] objArr = {activity, nativeData, bVarArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f97fd23052c3e1a6d99912abcf61bfef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f97fd23052c3e1a6d99912abcf61bfef");
            return;
        }
        bVarArr[0].b();
        if (z) {
            JudasManualManager.a("b_waimai_xvlr5qpi_mc").a("c_m84bv26").a("page_style_tag", 1).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, 1).a();
        }
    }

    public static /* synthetic */ void a(AlertInfo.HeaderInfo headerInfo, String str, Activity activity, DynamicDialog.e eVar) {
        Object[] objArr = {headerInfo, str, activity, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0707c3d37498ecdf6fe95841ba1f2aaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0707c3d37498ecdf6fe95841ba1f2aaa");
        } else if (activity.isFinishing() || !eVar.a() || TextUtils.isEmpty(headerInfo.clickUrl)) {
        } else {
            JudasManualManager.b("b_waimai_vl0o9n2g_mv", "c_m84bv26", str).a("entry_item_id", headerInfo.entryItemId).a("activity_id", headerInfo.activityId).a("activity_type", headerInfo.activityType).a("template_id", headerInfo.templateId).a("module_id", headerInfo.moduleId).a("is_supplement_exposure", f.a().b()).a();
        }
    }

    public static /* synthetic */ void a(AlertInfo.HeaderInfo headerInfo, String str, Activity activity, com.sankuai.waimai.popup.strategy.b[] bVarArr) {
        Object[] objArr = {headerInfo, str, activity, bVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c479468e01c2c6b919f835c9576fccfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c479468e01c2c6b919f835c9576fccfa");
        } else if (TextUtils.isEmpty(headerInfo.clickUrl)) {
        } else {
            JudasManualManager.a("b_waimai_vl0o9n2g_mc", "c_m84bv26", str).a("entry_item_id", headerInfo.entryItemId).a("activity_id", headerInfo.activityId).a("activity_type", headerInfo.activityType).a("template_id", headerInfo.templateId).a("module_id", headerInfo.moduleId).a();
            com.sankuai.waimai.foundation.router.a.a(activity, headerInfo.clickUrl);
            bVarArr[0].b();
        }
    }

    public static /* synthetic */ void a(AlertInfo alertInfo, GetInfoResponse.NativeData nativeData, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        Object[] objArr = {alertInfo, nativeData, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e406ee6b0d16cc5ed4f976e2432ae80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e406ee6b0d16cc5ed4f976e2432ae80");
            return;
        }
        f.a().c = false;
        Object[] objArr2 = {str, nativeData};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "253d9ae660027fa7b17ba83724c50995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "253d9ae660027fa7b17ba83724c50995");
        } else {
            JudasManualManager.a a2 = JudasManualManager.b("b_cTwkJ", "c_m84bv26", str).a("is_new", nativeData.activityId == 1 ? 1 : 0).a("is_login", com.sankuai.waimai.platform.domain.manager.user.a.i().a() ? 1 : 0).a("position_count", nativeData.positionCount).a("is_supplement_exposure", f.a().b()).a("is_embed_template", nativeData.styleType == 4 ? 1 : 0).a("channel_id", a()).a("page_style_tag", nativeData.useTianJiangNewStyle);
            if (com.sankuai.waimai.foundation.utils.d.a(nativeData.discountCoupons)) {
                jSONArray = null;
                jSONArray2 = null;
                jSONArray3 = null;
            } else {
                jSONArray = new JSONArray();
                jSONArray2 = new JSONArray();
                jSONArray3 = new JSONArray();
                for (GetInfoResponse.NativeData.DiscountCoupon discountCoupon : nativeData.discountCoupons) {
                    jSONArray.put(discountCoupon.couponId);
                    jSONArray2.put(discountCoupon.channelConfigId);
                    jSONArray3.put(discountCoupon.marketingActivityId);
                }
            }
            a2.a("coupon_id", (jSONArray == null || jSONArray.length() == 0) ? "" : jSONArray.toString());
            a2.a("Redchannel_id", (jSONArray2 == null || jSONArray2.length() == 0) ? "" : jSONArray2.toString());
            a2.a("entry_item_id", (jSONArray3 == null || jSONArray3.length() == 0) ? "" : jSONArray3.toString());
            a2.a();
        }
        Object[] objArr3 = {str, alertInfo, nativeData};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6dce51060f347b3002246c2c3d2526ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6dce51060f347b3002246c2c3d2526ad");
        } else if (alertInfo.footerInfo != null && !com.sankuai.waimai.foundation.utils.d.a(alertInfo.footerInfo.buttonList) && nativeData.useTianJiangNewStyle != 1) {
            JudasManualManager.b("b_LFpXh", "c_m84bv26", str).a("is_login", com.sankuai.waimai.platform.domain.manager.user.a.i().a() ? 1 : 0).a("is_new", nativeData.activityId != 1 ? 0 : 1).a("channel_id", a()).a();
        }
    }

    public static /* synthetic */ void a(c.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "744ceb15965376261723a614003ec9ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "744ceb15965376261723a614003ec9ac");
        }
    }

    public static /* synthetic */ void a(c.b bVar, String str, GetInfoResponse.NativeData nativeData, com.sankuai.waimai.popup.spfx.b bVar2) {
        Object[] objArr = {bVar, str, nativeData, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90acd7295781a046b48d56f11b59c48c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90acd7295781a046b48d56f11b59c48c");
            return;
        }
        bVar.b();
        Object[] objArr2 = {str, nativeData};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f50f412cbed913037fa70a9fe35cb7b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f50f412cbed913037fa70a9fe35cb7b3");
        } else if (nativeData.useTianJiangNewStyle != 1) {
            JudasManualManager.a("b_lQR9G", "c_m84bv26", str).a("is_login", com.sankuai.waimai.platform.domain.manager.user.a.i().a() ? 1 : 0).a("is_new", nativeData.activityId != 1 ? 0 : 1).a("activity_id", nativeData.activityId).a("channel_id", a()).a();
        }
        bVar2.a();
    }

    public static /* synthetic */ void a(String str, com.sankuai.waimai.popup.strategy.b[] bVarArr, Map map, com.sankuai.waimai.popup.spfx.b bVar, long[] jArr, boolean[] zArr, Activity activity) {
        Object[] objArr = {str, bVarArr, map, bVar, jArr, zArr, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7ea2aeac71d87c7a872c7a0b0fb1158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7ea2aeac71d87c7a872c7a0b0fb1158");
        } else if ("popup_close".equals(str)) {
            bVarArr[0].b();
        } else if ("popup_click".equals(str)) {
            if (map != null) {
                Object obj = map.get("linkUrl");
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!TextUtils.isEmpty(str2)) {
                        com.sankuai.waimai.foundation.router.a.a(activity, str2);
                    }
                }
            }
            bVarArr[0].b();
        } else if (!"special_effect".equals(str) || map == null) {
        } else {
            Object obj2 = map.get("type");
            if (obj2 instanceof Long) {
                jArr[0] = ((Long) obj2).longValue();
                if (zArr[0]) {
                    bVar.a(bVarArr[0], jArr[0]);
                }
            }
        }
    }

    public static /* synthetic */ void a(com.sankuai.waimai.popup.strategy.b[] bVarArr) {
        Object[] objArr = {bVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40db8c710f1978008904660fcd7cb731", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40db8c710f1978008904660fcd7cb731");
        } else if (com.sankuai.waimai.business.page.common.superexpose.c.a().b() || b(bVarArr[0])) {
        } else {
            bVarArr[0].b();
        }
    }

    public static /* synthetic */ void a(com.sankuai.waimai.popup.strategy.b[] bVarArr, GetInfoResponse.NativeData nativeData, c.b bVar) {
        Object[] objArr = {bVarArr, nativeData, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "772a5fec0281c7dc103cb9263545b040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "772a5fec0281c7dc103cb9263545b040");
            return;
        }
        if (nativeData != null && nativeData.positionCount > 0) {
            com.sankuai.waimai.business.page.home.actinfo.b.a(nativeData.positionCount, b.a.FailureTypeRenderFailure);
        }
        if (bVarArr[0].d()) {
            bVarArr[0].b();
        } else {
            bVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(boolean[] r18, com.sankuai.waimai.popup.spfx.b r19, final com.sankuai.waimai.popup.strategy.b[] r20, long[] r21, com.sankuai.waimai.mach.node.a r22) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.popup.b.a(boolean[], com.sankuai.waimai.popup.spfx.b, com.sankuai.waimai.popup.strategy.b[], long[], com.sankuai.waimai.mach.node.a):void");
    }

    public static com.sankuai.waimai.popup.strategy.b a(final Activity activity, @NonNull final AlertInfo alertInfo, final GetInfoResponse.NativeData nativeData, Map<String, Object> map, final c.b bVar, final DynamicDialog.e eVar) {
        boolean z;
        a.C1107a c1107a;
        com.sankuai.waimai.popup.strategy.b bVar2;
        a.C1107a c1107a2;
        Object[] objArr = {activity, alertInfo, nativeData, map, bVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7eee475d574b850f51deef2895639218", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.popup.strategy.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7eee475d574b850f51deef2895639218");
        }
        final String b2 = b(activity);
        float a2 = g.a(activity, 320.0f) / activity.getResources().getDisplayMetrics().widthPixels;
        final long[] jArr = new long[1];
        final boolean[] zArr = {false};
        final com.sankuai.waimai.popup.spfx.b bVar3 = new com.sankuai.waimai.popup.spfx.b();
        Object[] objArr2 = {activity, alertInfo, nativeData, map, bVar, eVar, b2, Float.valueOf(a2), jArr, zArr, bVar3};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4104b4685a7e8dded7db1a05d4979793", RobustBitConfig.DEFAULT_VALUE)) {
            bVar2 = (com.sankuai.waimai.popup.strategy.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4104b4685a7e8dded7db1a05d4979793");
            z = false;
        } else {
            final com.sankuai.waimai.popup.strategy.b[] bVarArr = new com.sankuai.waimai.popup.strategy.b[1];
            boolean z2 = nativeData.useTianJiangNewStyle == 1;
            if (!z2) {
                com.sankuai.waimai.imbase.push.b.a(2);
            }
            com.sankuai.waimai.touchmatrix.data.a aVar = new com.sankuai.waimai.touchmatrix.data.a();
            com.sankuai.waimai.touchmatrix.data.AlertInfo a3 = com.sankuai.waimai.popup.util.b.a(alertInfo);
            TMatrixShowInfo tMatrixShowInfo = new TMatrixShowInfo();
            tMatrixShowInfo.businessContainer = "skyFallContainer";
            tMatrixShowInfo.bizId = "waimai";
            tMatrixShowInfo.businessData = a3;
            tMatrixShowInfo.touchMode = z2 ? 8 : 4;
            aVar.k = tMatrixShowInfo;
            Map<String, Object> hashMap = map == null ? new HashMap<>() : map;
            if (nativeData != null) {
                hashMap.put("useTianJiangNewStyle", Boolean.valueOf(z2));
            }
            a.C1107a c1107a3 = new a.C1107a();
            c1107a3.c = hashMap;
            c1107a3.d = b;
            c1107a3.n = new DynamicDialog.i() { // from class: com.sankuai.waimai.popup.b.12
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.i
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9085cba840a8b62301728b51a6214264", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9085cba840a8b62301728b51a6214264");
                    } else {
                        b.a(bVarArr);
                    }
                }
            };
            final boolean z3 = z2;
            final boolean z4 = z2;
            c1107a3.o = new DynamicDialog.g() { // from class: com.sankuai.waimai.popup.b.11
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.g
                public final void a(View view, @NonNull AlertInfo.HeaderInfo headerInfo) {
                    Object[] objArr3 = {view, headerInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "64c9757e35aa99fccde0928a86a3f887", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "64c9757e35aa99fccde0928a86a3f887");
                    } else {
                        b.a(headerInfo, b2, activity, bVarArr);
                    }
                }

                @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.g
                public final void b(View view, @NonNull AlertInfo.HeaderInfo headerInfo) {
                    Object[] objArr3 = {view, headerInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b517be3b108c960fb0b76f8e14a28e72", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b517be3b108c960fb0b76f8e14a28e72");
                    } else if (z3) {
                    } else {
                        b.a(headerInfo, b2, activity, eVar);
                    }
                }
            };
            c1107a3.j = new i() { // from class: com.sankuai.waimai.popup.b.10
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.i
                public final void a(int i, Throwable th) {
                    Object[] objArr3 = {Integer.valueOf(i), th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "653b6e98affe3d8e9256aba145150898", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "653b6e98affe3d8e9256aba145150898");
                    } else {
                        b.a(bVarArr, nativeData, bVar);
                    }
                }

                @Override // com.sankuai.waimai.platform.mach.dialog.i
                public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                    Object[] objArr3 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b8ff515366a086fba8922f430ca9fb2a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b8ff515366a086fba8922f430ca9fb2a");
                    } else {
                        b.a(zArr, bVar3, bVarArr, jArr, aVar2);
                    }
                }
            };
            z = false;
            Object[] objArr3 = {"c_m84bv26"};
            ChangeQuickRedirect changeQuickRedirect3 = a.C1107a.a;
            if (PatchProxy.isSupport(objArr3, c1107a3, changeQuickRedirect3, false, "cc1faa8fbafb084b5c765c1f31e136dd", RobustBitConfig.DEFAULT_VALUE)) {
                c1107a = (a.C1107a) PatchProxy.accessDispatch(objArr3, c1107a3, changeQuickRedirect3, false, "cc1faa8fbafb084b5c765c1f31e136dd");
            } else {
                if (!TextUtils.isEmpty("c_m84bv26")) {
                    c1107a3.b = "c_m84bv26";
                }
                c1107a = c1107a3;
            }
            c1107a.k = new DynamicDialog.f() { // from class: com.sankuai.waimai.popup.b.9
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.f
                public final void a(String str, Map<String, Object> map2) {
                    Object[] objArr4 = {str, map2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b966f965893483d26231dd0e1f10bb9d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b966f965893483d26231dd0e1f10bb9d");
                    } else {
                        b.a(str, bVarArr, map2, bVar3, jArr, zArr, activity);
                    }
                }
            };
            c1107a.m = new DynamicDialog.b() { // from class: com.sankuai.waimai.popup.b.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.b
                public final void a(int i, Map<String, String> map2) {
                    Object[] objArr4 = {Integer.valueOf(i), map2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b481e6a7d69fff769aa2ebd3445b0e38", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b481e6a7d69fff769aa2ebd3445b0e38");
                    } else {
                        b.a(i, b2, activity, nativeData, bVarArr, map2);
                    }
                }
            };
            if (nativeData.dynamicEffectType == GetInfoResponse.NativeData.a.SKY_FALL_WITH_ALLOWANCE.d) {
                c1107a.e = 1;
                Object[] objArr4 = {Float.valueOf(a2)};
                ChangeQuickRedirect changeQuickRedirect4 = a.C1107a.a;
                if (PatchProxy.isSupport(objArr4, c1107a, changeQuickRedirect4, false, "6ce39a25da2170ccac90132cca86cc8e", RobustBitConfig.DEFAULT_VALUE)) {
                    c1107a2 = (a.C1107a) PatchProxy.accessDispatch(objArr4, c1107a, changeQuickRedirect4, false, "6ce39a25da2170ccac90132cca86cc8e");
                } else {
                    c1107a.f = o.a(a2, 0.0f, 1.0f);
                    c1107a2 = c1107a;
                }
                c1107a2.g = false;
            } else {
                Object[] objArr5 = {Float.valueOf(a2)};
                ChangeQuickRedirect changeQuickRedirect5 = a.C1107a.a;
                if (PatchProxy.isSupport(objArr5, c1107a, changeQuickRedirect5, false, "4fe9321bbd2e728afe35e28c43f2f683", RobustBitConfig.DEFAULT_VALUE)) {
                    a.C1107a c1107a4 = (a.C1107a) PatchProxy.accessDispatch(objArr5, c1107a, changeQuickRedirect5, false, "4fe9321bbd2e728afe35e28c43f2f683");
                } else {
                    c1107a.h = o.a(a2, 0.0f, 1.0f);
                }
            }
            final HomeGrayManager.a aVar2 = new HomeGrayManager.a() { // from class: com.sankuai.waimai.popup.b.13
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.page.home.gray.HomeGrayManager.a
                public final void a(HomeGrayModel.PositionsDTO.ResourcesDTO.ConfigDTO configDTO) {
                    Object[] objArr6 = {configDTO};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "13f67221550b003a4c22181a9e1f5211", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "13f67221550b003a4c22181a9e1f5211");
                    } else if (configDTO == null || !z4 || bVarArr == null || bVarArr[0] == null) {
                    } else {
                        HomeGrayManager.a().a(configDTO.getGrayLevel() != 0, bVarArr[0].f(), configDTO.getGrayRate());
                    }
                }
            };
            DynamicDialogNew.a aVar3 = new DynamicDialogNew.a(activity);
            aVar3.c = aVar;
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = a.C1107a.a;
            aVar3.k = PatchProxy.isSupport(objArr6, c1107a, changeQuickRedirect6, false, "a48eb84d1e12f01d9b96e2a7a7aa9821", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr6, c1107a, changeQuickRedirect6, false, "a48eb84d1e12f01d9b96e2a7a7aa9821") : new a(c1107a);
            aVar3.e = false;
            aVar3.j = nativeData.disallowCloseOnBackPress != 1 ? 0 : 1;
            aVar3.g = new DialogInterface.OnShowListener() { // from class: com.sankuai.waimai.popup.b.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    Object[] objArr7 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "92692f3d24802bc44f6f98141f4c93f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "92692f3d24802bc44f6f98141f4c93f5");
                        return;
                    }
                    if (z4) {
                        com.sankuai.waimai.imbase.push.b.a(3);
                        HomeGrayManager a4 = HomeGrayManager.a();
                        HomeGrayManager.a aVar4 = aVar2;
                        Object[] objArr8 = {aVar4};
                        ChangeQuickRedirect changeQuickRedirect8 = HomeGrayManager.a;
                        if (PatchProxy.isSupport(objArr8, a4, changeQuickRedirect8, false, "42d3d2bdece6755c53e18a7926699b7b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, a4, changeQuickRedirect8, false, "42d3d2bdece6755c53e18a7926699b7b");
                        } else if (aVar4 != null) {
                            if (a4.j == null) {
                                a4.j = new ArrayList();
                            }
                            a4.j.add(aVar4);
                            if (a4.d) {
                                aVar4.a(a4.h);
                            } else if (a4.g != null && a4.g.getGrayLevel() > 0) {
                                aVar4.a(a4.g);
                            }
                        }
                    }
                    b.a(bVar);
                }
            };
            aVar3.f = new DynamicDialogNew.d() { // from class: com.sankuai.waimai.popup.b.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.d
                public final void a() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7cf43df8f901c0990acdd20937a38e08", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7cf43df8f901c0990acdd20937a38e08");
                    } else {
                        b.a(AlertInfo.this, nativeData, b2);
                    }
                }
            };
            aVar3.h = new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.popup.b.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr7 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e18cf51573591914128f947bf34cd0c1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e18cf51573591914128f947bf34cd0c1");
                        return;
                    }
                    b.a(c.b.this, b2, nativeData, bVar3);
                    HomeGrayManager a4 = HomeGrayManager.a();
                    HomeGrayManager.a aVar4 = aVar2;
                    Object[] objArr8 = {aVar4};
                    ChangeQuickRedirect changeQuickRedirect8 = HomeGrayManager.a;
                    if (PatchProxy.isSupport(objArr8, a4, changeQuickRedirect8, false, "3c0a9a025ddeb4bc2e92b4a8b9793182", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, a4, changeQuickRedirect8, false, "3c0a9a025ddeb4bc2e92b4a8b9793182");
                    } else if (aVar4 == null || a4.j == null || a4.j.size() <= 0 || !a4.j.contains(aVar4)) {
                    } else {
                        a4.j.remove(aVar4);
                    }
                }
            };
            DynamicDialogNew.a a4 = aVar3.a(new DynamicDialogNew.f() { // from class: com.sankuai.waimai.popup.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.f
                public final boolean a() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "4555ac0e1ef59d846078712d22e3123c", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "4555ac0e1ef59d846078712d22e3123c")).booleanValue();
                    }
                    if (DynamicDialog.e.this != null) {
                        return DynamicDialog.e.this.a();
                    }
                    return true;
                }
            });
            a4.i = new DynamicDialogNew.c() { // from class: com.sankuai.waimai.popup.b.15
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.c
                public final void a(boolean z5) {
                    Object[] objArr7 = {Byte.valueOf(z5 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "4ecdbddab5b06627ef0738fa51189541", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "4ecdbddab5b06627ef0738fa51189541");
                    } else {
                        b.a(activity, nativeData, bVarArr, z5);
                    }
                }
            };
            a4.d = new com.sankuai.waimai.touchmatrix.show.d() { // from class: com.sankuai.waimai.popup.b.14
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.touchmatrix.show.d
                public final void a(Dialog dialog, com.sankuai.waimai.touchmatrix.data.a aVar4) {
                    Object[] objArr7 = {dialog, aVar4};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "6b7dbc8d09aa7f87147d3137721ca8e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "6b7dbc8d09aa7f87147d3137721ca8e9");
                    } else if (!z4 || dialog == null || activity == null || dialog.getWindow() == null || activity.getWindow() == null) {
                    } else {
                        Window window = dialog.getWindow();
                        WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
                        WindowManager.LayoutParams attributes2 = activity.getWindow().getAttributes();
                        if (attributes == null || attributes2 == null) {
                            return;
                        }
                        attributes.flags = attributes2.flags;
                        dialog.getWindow().addFlags(8);
                        dialog.getWindow().addFlags(32);
                        if (Build.VERSION.SDK_INT >= 23) {
                            window.clearFlags(201326592);
                            window.getDecorView().setSystemUiVisibility(1280);
                            window.addFlags(Integer.MIN_VALUE);
                            window.setStatusBarColor(0);
                        }
                    }
                }
            };
            bVarArr[0] = new com.sankuai.waimai.popup.strategy.a(a4.a(), tMatrixShowInfo);
            bVar2 = bVarArr[0];
        }
        bVar2.a();
        if (nativeData.positionCount > 0) {
            com.sankuai.waimai.business.page.home.actinfo.b.b(nativeData.positionCount, z);
        }
        return bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(@NonNull final com.sankuai.waimai.popup.strategy.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d72bec9f9fc620d8f8897714cfe11f8c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d72bec9f9fc620d8f8897714cfe11f8c")).booleanValue();
        }
        if (com.sankuai.waimai.business.page.common.superexpose.c.a().c()) {
            if (bVar.c() != null && bVar.c().getWindow() != null) {
                bVar.c().getWindow().setWindowAnimations(2131559204);
            }
            com.sankuai.waimai.business.page.common.superexpose.c.a().b.a(new d.a() { // from class: com.sankuai.waimai.popup.b.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.pouch.unionanim.d.a
                public final void a(@NonNull com.sankuai.waimai.pouch.unionanim.d dVar) {
                }

                @Override // com.sankuai.waimai.pouch.unionanim.d.a
                public final void b(@NonNull com.sankuai.waimai.pouch.unionanim.d dVar) {
                    Object[] objArr2 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "311311905135fb32b634e1c58beba0af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "311311905135fb32b634e1c58beba0af");
                    } else {
                        com.sankuai.waimai.popup.strategy.b.this.b();
                    }
                }

                @Override // com.sankuai.waimai.pouch.unionanim.d.a
                public final void c(@NonNull com.sankuai.waimai.pouch.unionanim.d dVar) {
                    Object[] objArr2 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "537c9668c07a79b4332e2756132352fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "537c9668c07a79b4332e2756132352fb");
                    } else {
                        com.sankuai.waimai.popup.strategy.b.this.b();
                    }
                }
            });
            com.sankuai.waimai.pouch.monitor.c.a(1, "linkage_animation_exec_succssed", com.sankuai.waimai.business.page.common.superexpose.c.a().l);
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", com.sankuai.waimai.business.page.common.superexpose.c.a().d);
            JudasManualManager.b("b_waimai_gmscis7a_mv").a("c_m84bv26").a((Map<String, Object>) hashMap).a();
            return true;
        }
        return false;
    }

    private static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9feabab4e63e6b0c6639ed50014fc72", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9feabab4e63e6b0c6639ed50014fc72")).intValue();
        }
        if (com.sankuai.waimai.foundation.core.a.f()) {
            return 5;
        }
        if (com.sankuai.waimai.foundation.core.a.e()) {
            return 3;
        }
        return com.sankuai.waimai.foundation.core.a.d() ? 2 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62e91bedb19796acdd52d0cbe1ecf52b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62e91bedb19796acdd52d0cbe1ecf52b");
        }
        String str = "";
        if (activity instanceof FragmentActivity) {
            for (Fragment fragment : ((FragmentActivity) activity).getSupportFragmentManager().getFragments()) {
                if (fragment instanceof HomePageFragment) {
                    str = AppUtil.generatePageInfoKey(fragment);
                }
            }
        }
        return str;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements DynamicDialogNew.b {
        public static ChangeQuickRedirect a;
        final C1107a b;

        private a(@Nonnull C1107a c1107a) {
            Object[] objArr = {c1107a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e79b5f3d8f202ab9ecb4979ef510d176", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e79b5f3d8f202ab9ecb4979ef510d176");
            } else {
                this.b = c1107a;
            }
        }

        public final DynamicDialog.i a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e11406cfd7945a986ad3735a950f0db", RobustBitConfig.DEFAULT_VALUE) ? (DynamicDialog.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e11406cfd7945a986ad3735a950f0db") : this.b.n;
        }

        public final Map<String, Object> b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77741d59394c9d60825cca243e1d8f64", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77741d59394c9d60825cca243e1d8f64") : this.b.c;
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.popup.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C1107a {
            public static ChangeQuickRedirect a;
            String b;
            Map<String, Object> c;
            DynamicDialog.h d;
            int e;
            float f;
            boolean g;
            float h;
            boolean i;
            i j;
            DynamicDialog.f k;
            com.sankuai.waimai.mach.d l;
            DynamicDialog.b m;
            DynamicDialog.i n;
            DynamicDialog.g o;

            public C1107a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b0885487532f77478bd822c89e405d0", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b0885487532f77478bd822c89e405d0");
                    return;
                }
                this.b = "";
                this.e = 0;
                this.h = 1.0f;
                this.i = false;
            }
        }
    }
}
