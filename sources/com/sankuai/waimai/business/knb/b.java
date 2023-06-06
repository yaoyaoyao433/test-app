package com.sankuai.waimai.business.knb;

import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.android.common.statistics.mock.StatisticsJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.handlers.AbStrategyJsHandler;
import com.sankuai.waimai.business.knb.handlers.ClearHistoryHandler;
import com.sankuai.waimai.business.knb.handlers.CommonOrderPreviewHandler;
import com.sankuai.waimai.business.knb.handlers.CouponJumpToHomePoiListHandler;
import com.sankuai.waimai.business.knb.handlers.DailPrivacyTelHandler;
import com.sankuai.waimai.business.knb.handlers.GetPushTokenHandler;
import com.sankuai.waimai.business.knb.handlers.HertzMetricHandler;
import com.sankuai.waimai.business.knb.handlers.MsgIsOpenMessagePush;
import com.sankuai.waimai.business.knb.handlers.MsgOpenMessagePush;
import com.sankuai.waimai.business.knb.handlers.MsgReadIMChatList;
import com.sankuai.waimai.business.knb.handlers.NetWorkDiagnosisHandler;
import com.sankuai.waimai.business.knb.handlers.NewCustomerOrderHandler;
import com.sankuai.waimai.business.knb.handlers.PassCrawlerVerificationHandler;
import com.sankuai.waimai.business.knb.handlers.PayForWMVIPHandler;
import com.sankuai.waimai.business.knb.handlers.PersonaSubscribeJsHandler;
import com.sankuai.waimai.business.knb.handlers.PersonaUnSubscribeJsHandler;
import com.sankuai.waimai.business.knb.handlers.PostOrderHandler;
import com.sankuai.waimai.business.knb.handlers.PremiumDiscountShopCartHandler;
import com.sankuai.waimai.business.knb.handlers.ScanQRCodeHandler;
import com.sankuai.waimai.business.knb.handlers.SetTitleImageHandler;
import com.sankuai.waimai.business.knb.handlers.ShareCommonHandler;
import com.sankuai.waimai.business.knb.handlers.WaimaiCardStatusHandler;
import com.sankuai.waimai.imbase.knb.DelSessionByChatIdHandler;
import com.sankuai.waimai.imbase.knb.GetAllSessionListHandler;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b846f1424602b560190eea11c1f28496", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b846f1424602b560190eea11c1f28496");
            return;
        }
        try {
            JsHandlerFactory.registerJsHandler("scanQRCode", ScanQRCodeHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.shareCommon", ShareCommonHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.waimaiSetTitleImageURL", SetTitleImageHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.waimaiGetPushToken", GetPushTokenHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.waimaiPayForWMVIP", PayForWMVIPHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.hertzMetric", HertzMetricHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.getIMChatList", "vJN5O+VbFhDPSaEsICAyVxc5sApA+Fjru7wuEAeBY4eF76/k5GuUEElokj29ZR4g/mObrtF9yM/juF/tXnGF7A==", GetAllSessionListHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.clearAIMMessage", "hJVAT1LbsyL37RTYxOWSiIAUJjw4yAIu54Zxvnz2TBnepwbfVJ727K539gpXtpkMSkkBzU28eSPyjM6sa1YOoA==", DelSessionByChatIdHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.clearHistory", ClearHistoryHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.passCrawlerVerification", PassCrawlerVerificationHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.dailPrivacyTEL", DailPrivacyTelHandler.class);
            JsHandlerFactory.registerJsHandler("lxlog", StatisticsJsHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.waimaiRefreshBenefitCardStatus", "X2426tHydlgcBc7bHLnLHkAKarMlPoe5C1LH15FYD5+jBs3wWNKrpTdX4Okkdz8/0y1OsBRaYUE6qRE8RimhBQ==", WaimaiCardStatusHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.newCustomerOrderPreview", "BSHzfWNqDU6y2d3SBaXnXlnNE6+egBA7OqGMGlCKknlWGg2SA54QegVsU5uSHBc7GWVzm9UJ1E5Egd+RfCx7Yw==", NewCustomerOrderHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.commonOrderPreview", "mI0cWSrE5923D3tTiLUROwTIL+trv1NqmcMtOHwHNXEiSPfFG9VjJECClRV+JSbnpT5mKNIeJrsgz4jlDeaP5Q==", CommonOrderPreviewHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.addPremiumDiscountShopCart", "OH1M4hvQtgURXidoM0qt4UB1t2hNQYpPW++Da6u6ooY7ssHb15tKqexjXCwUNI6hTeDG9zaDFtNCKdUUoHPJYQ==", PremiumDiscountShopCartHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.couponJumpToHomePoiList", "C8MUZ9YVzB4dANkuAnt7kryb0YMwdXAatXNWuz0iIZOd0LSx3zEzYmEeTQi83GT4u5Aj6FwH5sPD6kNz588Yuw==", CouponJumpToHomePoiListHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.readIMChatList", "A9HSwOS7VxxTE941mNhzDk9guZUAlJzkbtj00oBcBMXUPY2K5lsQKE+07PlC5rXm5/Tk76I4cVQVLbK9afdnzw==", MsgReadIMChatList.class);
            JsHandlerFactory.registerJsHandler("waimai.isOpenMessagePush", "pEfOc1vtmTP0FuGLVD/dL7WL/jQ/kUpHeKxIPIlOhvHmEBXJTcD3MuUP0pw4HvXg+wWJq7L6RPaUOUyLbPuc6w==", MsgIsOpenMessagePush.class);
            JsHandlerFactory.registerJsHandler("waimai.openMessagePush", "BDgCmXoI71NSXya5zkRSJAC5BGbW1xWUL+mO2mY6V08eoAxar2toiXpki0SGykH7Y294cC930mNH7zqwELaP5Q==", MsgOpenMessagePush.class);
            JsHandlerFactory.registerJsHandler("waimai.closeCommentChat", "K64ucVCLTxF+s2EvLtCNB/+G8as8Ng6fGPlcDhLoxhPBDv2LP6oKSMlj6H2cG6ZDDtbkWSkzgpmEWCphvmfL+A==", "com.sankuai.waimai.business.im.group.knb.CloseBadCommentGroupJsHandler");
            JsHandlerFactory.registerJsHandler("waimai.checkNetworkStatus", "bXeAOnfgdHbgi7jdlTrj9UvKbFvsTd4s4IEF8qR/Pwz5b3Qv6TozSsOwufx0HvnGkFOruxIYVy5tfllfdNTKCg==", NetWorkDiagnosisHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.postOrder", "J8vg2i61FAwkBO7Ucjy54uHa1uGFZsGIrWmIMbLF3ZjEZdw77R1rKwGb3Rvf7bTuXg26649V4LEFqjTYNNtqNg==", PostOrderHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.getABStrategy", "VHe4zgs/7DcTpWoV2Eiwo5bxOgWyq41M9tfx4F0485TCkQofzO6qhkNkbh1gUXX/XzDHt43Sg2yWNELhYTfqJQ==", AbStrategyJsHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.observeAlitaPersona", "Diw7Kpm5bPgsfXJRLRLp99XFXPGaBu3hRbnekRRF7tWpw1fVuD8xq5zve7Fp16fNPVD28yBuMMLF1nz0lBd06w==", PersonaSubscribeJsHandler.class);
            JsHandlerFactory.registerJsHandler("waimai.unObserveAlitaPersona", "iZcrszHhMmZnTGqWeTVgIh5/atxmAMtbmpB8XZA+n9K6rhXpr+YgoAQzdY9cuW4zv18/urYFUAdwexPFm5UZ+w==", PersonaUnSubscribeJsHandler.class);
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a("KNBHandlerRegistry", e);
        }
    }
}
