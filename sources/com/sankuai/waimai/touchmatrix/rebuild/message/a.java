package com.sankuai.waimai.touchmatrix.rebuild.message;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.android.paybase.fingerprint.OnlineVerifyFingerprintActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.a;
import com.sankuai.waimai.touchmatrix.data.TMatrixShowInfo;
import com.sankuai.waimai.touchmatrix.monitor.j;
import com.sankuai.waimai.touchmatrix.utils.g;
import io.agora.rtc.internal.RtcEngineEvent;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static HashSet<String> b;

    static {
        HashSet<String> hashSet = new HashSet<>();
        b = hashSet;
        hashSet.add("HybridCashierActivity");
        b.add("MTCashierActivity");
        b.add("MTCashierWrapperActivity");
        b.add("PayActivity");
        b.add("VerifyFingerprintActivity");
        b.add("SchemeRouteActivity");
        b.add(OnlineVerifyFingerprintActivity.b);
        b.add("APayEntranceActivity");
        b.add("PasswordVerifyActivity");
        b.add("PayBaseCameraActivity");
        b.add("H5PayActivity");
        b.add("DisplayCardNumActivity");
        b.add("PhotoSelectorActivity");
        b.add("RetrievePasswordActivity");
        b.add("IdCardCaptureActivity");
        b.add("OcrCaptureActivity");
        b.add("PhotoPreviewActivity");
        b.add("MediumUnionPayQrCodeActivity");
        b.add("QRHomeActivity");
        b.add("UPPayWapActivity");
        b.add("AlipayResultActivity");
        b.add("WXPayEntryActivity");
        b.add("NeoBaseActivity");
        b.add("NeoCommonActivity");
        b.add("MPCashierActivity1");
        b.add("MPCashierActivity2");
        b.add("MPCashierActivity3");
    }

    public static boolean a(@Nullable com.sankuai.waimai.touchmatrix.data.a aVar) {
        Activity c;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a23edfe68b209df4717b15839993034", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a23edfe68b209df4717b15839993034")).booleanValue();
        }
        if (aVar == null) {
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew CanDisplay校验 失败  message为空", new Object[0]);
            j.a().a(RtcEngineEvent.EvtType.EVT_USER_OFFLINE);
            return false;
        }
        try {
            c = c(aVar);
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e4240d4e08aa7850278e76011b0460e6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e4240d4e08aa7850278e76011b0460e6");
            } else if (aVar != null && aVar.b() != null) {
                TMatrixShowInfo.a b2 = aVar.b();
                if (b2.a == 1) {
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("消息 id(%s) 配置白名单 ,  白名单信息: " + a(b2.b), aVar.c);
                } else if (b2.a == 2) {
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.d("消息 id(%s) 配置黑名单 ,  黑名单信息: " + a(b2.b), aVar.c);
                }
            }
            String str = "";
            if (aVar.k != null && !g.a(aVar.k.bizId)) {
                str = aVar.k.bizId;
            }
            a.C1348a b3 = com.sankuai.waimai.touchmatrix.a.a().b(str);
            com.sankuai.waimai.touchmatrix.rebuild.biz.b bVar = b3 != null ? b3.l : null;
            if (bVar != null) {
                Map<String, String> b4 = bVar.b();
                if (!g.a(b4)) {
                    String str2 = b4.get("page_id");
                    aVar.l = str2;
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("根据业务方ITMatrixBizProvider 获取pageId, biz: " + str + " cusPageId: " + str2, new Object[0]);
                    TMatrixShowInfo.a b5 = aVar.b();
                    if (b5 != null) {
                        if (b5.a == 1) {
                            return a(b5.b, b4);
                        }
                        if (b5.a == 2) {
                            return b(b5.b, b4);
                        }
                    }
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew CanDisplay校验 异常: " + e.getMessage(), new Object[0]);
        }
        if (c == null || !b.contains(c.getClass().getSimpleName())) {
            if (c instanceof com.sankuai.waimai.foundation.core.base.activity.c) {
                Map<String, String> Z_ = ((com.sankuai.waimai.foundation.core.base.activity.c) c).Z_();
                if (!g.a(Z_)) {
                    aVar.l = Z_.get("page_id");
                }
                TMatrixShowInfo.a b6 = aVar.b();
                if (b6 != null) {
                    if (b6.a == 1) {
                        return a(b6.b, Z_);
                    }
                    if (b6.a == 2) {
                        return b(b6.b, Z_);
                    }
                }
            } else if (c instanceof com.sankuai.waimai.touchmatrix.rebuild.biz.b) {
                Map<String, String> b7 = ((com.sankuai.waimai.touchmatrix.rebuild.biz.b) c).b();
                if (!g.a(b7)) {
                    aVar.l = b7.get("page_id");
                }
                TMatrixShowInfo.a b8 = aVar.b();
                if (b8 != null) {
                    if (b8.a == 1) {
                        return a(b8.b, b7);
                    }
                    if (b8.a == 2) {
                        return b(b8.b, b7);
                    }
                }
            } else if (c instanceof MRNBaseActivity) {
                MRNBaseActivity mRNBaseActivity = (MRNBaseActivity) c;
                String str3 = mRNBaseActivity.k().p().b() + CommonConstant.Symbol.UNDERLINE + mRNBaseActivity.k().p().c();
                aVar.l = str3;
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.a("TMatrixDisplayHelperNew , MRN  获取 pageId ： " + str3, new Object[0]);
                TMatrixShowInfo.a b9 = aVar.b();
                if (b9 != null) {
                    if (b9.a == 1) {
                        return a(b9.b, str3);
                    }
                    if (b9.a == 2) {
                        return b(b9.b, str3);
                    }
                }
            } else {
                String b10 = com.sankuai.waimai.touchmatrix.utils.c.a().b();
                if (TextUtils.isEmpty(b10) && c != null) {
                    b10 = c.getClass().getSimpleName();
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew 获取不到pageId,取类名: " + b10, new Object[0]);
                }
                aVar.l = b10;
                TMatrixShowInfo.a b11 = aVar.b();
                if (b11 != null) {
                    if (b11.a == 1) {
                        return a(b11.b, b10);
                    }
                    if (b11.a == 2) {
                        return b(b11.b, b10);
                    }
                }
            }
            return false;
        }
        aVar.l = "waimai_cashier";
        return a(aVar.b());
    }

    private static String a(List<TMatrixShowInfo.b> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c1841429c683424beccefa106576db3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c1841429c683424beccefa106576db3");
        }
        if (g.a(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder("\n");
        for (TMatrixShowInfo.b bVar : list) {
            if (bVar != null) {
                i++;
                sb.append(i + "  page_id: " + bVar.a + " ,poi_id: " + bVar.b + " ,category_code: " + bVar.c + " \n");
            }
        }
        return sb.toString();
    }

    private static boolean a(TMatrixShowInfo.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bad26526449de28f6741b9d105e7923a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bad26526449de28f6741b9d105e7923a")).booleanValue();
        }
        if (aVar != null) {
            if (aVar.a == 1) {
                if (aVar.b == null || aVar.b.size() <= 0) {
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew CanDisplay校验 失败 :   支付页白名单下发空", new Object[0]);
                    j.a().a(RtcEngineEvent.EvtType.EVT_USER_OFFLINE);
                    return false;
                }
                for (TMatrixShowInfo.b bVar : aVar.b) {
                    if (bVar != null && !TextUtils.isEmpty(bVar.a) && "waimai_cashier".equals(bVar.a)) {
                        return true;
                    }
                }
            } else if (aVar.a == 2) {
                if (aVar.b == null || aVar.b.size() <= 0) {
                    return true;
                }
                for (TMatrixShowInfo.b bVar2 : aVar.b) {
                    if (bVar2 != null && !TextUtils.isEmpty(bVar2.a) && "waimai_cashier".equals(bVar2.a)) {
                        com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew CanDisplay校验 失败 :   支付页黑名单匹配", new Object[0]);
                        j.a().a(13012);
                        return false;
                    }
                }
                return true;
            }
        }
        com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew CanDisplay校验 失败 :   支付页未下发condition", new Object[0]);
        j.a().a(RtcEngineEvent.EvtType.EVT_USER_OFFLINE);
        return false;
    }

    private static boolean a(List<TMatrixShowInfo.b> list, Map<String, String> map) {
        Object[] objArr = {list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5047b1a80283f759f0819daad5657494", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5047b1a80283f759f0819daad5657494")).booleanValue();
        }
        if (g.a(list) || g.a(map)) {
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew CanDisplay校验 失败 : 白名单  校验信息为空", new Object[0]);
            j.a().a(RtcEngineEvent.EvtType.EVT_USER_OFFLINE);
            return false;
        }
        for (TMatrixShowInfo.b bVar : list) {
            if (bVar != null && !TextUtils.isEmpty(bVar.a) && bVar.a.equals(map.get("page_id"))) {
                if (!TextUtils.isEmpty(bVar.b) && !bVar.b.equals(map.get("poi_id"))) {
                    j.a().a(RtcEngineEvent.EvtType.EVT_USER_OFFLINE, "wmtm_msg_not_match");
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew CanDisplay校验 失败 : 白名单校验 pageId 匹配  poiId 不匹配", new Object[0]);
                    return false;
                } else if (TextUtils.isEmpty(bVar.c) || bVar.c.equals(map.get("category_code"))) {
                    return true;
                } else {
                    j.a().a(RtcEngineEvent.EvtType.EVT_USER_OFFLINE);
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew CanDisplay校验 失败 : 白名单校验 pageId 匹配  category 不匹配", new Object[0]);
                    return false;
                }
            }
        }
        j.a().a(RtcEngineEvent.EvtType.EVT_USER_OFFLINE);
        return false;
    }

    private static boolean a(List<TMatrixShowInfo.b> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22a70ea073345dc3472ddc588b14135e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22a70ea073345dc3472ddc588b14135e")).booleanValue();
        }
        if (g.a(list) || g.a(str)) {
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew CanDisplay校验 失败 :   白名单1校验信息为空", new Object[0]);
            j.a().a(RtcEngineEvent.EvtType.EVT_USER_OFFLINE);
            return false;
        }
        for (TMatrixShowInfo.b bVar : list) {
            if (bVar != null && !TextUtils.isEmpty(bVar.a) && bVar.a.equals(str)) {
                return true;
            }
        }
        com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew CanDisplay校验 失败 :   白名单1校验 PageId不匹配", new Object[0]);
        j.a().a(RtcEngineEvent.EvtType.EVT_USER_OFFLINE);
        return false;
    }

    private static boolean b(List<TMatrixShowInfo.b> list, Map<String, String> map) {
        Object[] objArr = {list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6143adcbf0968560779eb954e96ceb5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6143adcbf0968560779eb954e96ceb5d")).booleanValue();
        }
        if (g.a(list) || g.a(map)) {
            return true;
        }
        for (TMatrixShowInfo.b bVar : list) {
            if (bVar != null) {
                if (!TextUtils.isEmpty(bVar.a) && bVar.a.equals(map.get("page_id"))) {
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew CanDisplay校验 失败 :   黑名单校验 PageId匹配", new Object[0]);
                    j.a().a(RtcEngineEvent.EvtType.EVT_USER_OFFLINE);
                    return false;
                } else if (!TextUtils.isEmpty(bVar.b) && bVar.b.equals(map.get("poi_id"))) {
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew CanDisplay校验 失败 :   黑名单校验 PoiId匹配", new Object[0]);
                    j.a().a(RtcEngineEvent.EvtType.EVT_USER_OFFLINE);
                    return false;
                } else if (!TextUtils.isEmpty(bVar.c) && bVar.c.equals(map.get("category_code"))) {
                    com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew CanDisplay校验 失败 :   黑名单校验 categoryCode匹配", new Object[0]);
                    j.a().a(RtcEngineEvent.EvtType.EVT_USER_OFFLINE);
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean b(List<TMatrixShowInfo.b> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd4db6358ad6adc57c8a9c30dc413ffe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd4db6358ad6adc57c8a9c30dc413ffe")).booleanValue();
        }
        if (g.a(list) || g.a(str)) {
            return true;
        }
        for (TMatrixShowInfo.b bVar : list) {
            if (bVar != null && !TextUtils.isEmpty(bVar.a) && bVar.a.equals(str)) {
                j.a().a(RtcEngineEvent.EvtType.EVT_USER_OFFLINE);
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("TMatrixDisplayHelperNew CanDisplay校验 失败 :   黑名单1校验 PageId匹配", new Object[0]);
                return false;
            }
        }
        return true;
    }

    public static a.C1348a b(com.sankuai.waimai.touchmatrix.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49b70cf58a861cb5727e7011335e80fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.C1348a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49b70cf58a861cb5727e7011335e80fd");
        }
        if (aVar == null || aVar.k == null || TextUtils.isEmpty(aVar.k.bizId)) {
            return null;
        }
        return com.sankuai.waimai.touchmatrix.a.a().b(aVar.k.bizId);
    }

    public static Activity c(com.sankuai.waimai.touchmatrix.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        Activity activity = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2fc38529e34ca4097e549ec46f54a3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2fc38529e34ca4097e549ec46f54a3f");
        }
        a.C1348a b2 = b(aVar);
        if (b2 != null && b2.e != null) {
            activity = b2.e.b();
        }
        return activity == null ? com.sankuai.waimai.touchmatrix.rebuild.utils.d.a().b() : activity;
    }

    public static boolean d(com.sankuai.waimai.touchmatrix.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c66c2685c3321e4f25868ca5cc61e5af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c66c2685c3321e4f25868ca5cc61e5af")).booleanValue();
        }
        a.C1348a b2 = b(aVar);
        if (b2 != null && b2.e != null) {
            return b2.e.a();
        }
        return com.sankuai.waimai.touchmatrix.rebuild.utils.d.a().c;
    }
}
