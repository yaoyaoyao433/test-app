package com.sankuai.waimai.alita.platform.knbbridge;

import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.bundle.checkupdate.AlitaCheckUpdateException;
import com.sankuai.waimai.alita.core.base.util.c;
import com.sankuai.waimai.alita.core.mlmodel.operator.exception.b;
import com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    static {
        String str = GetFeatureJsHandler.NAME;
        String str2 = StopBizJsHandler.NAME;
        String str3 = UpdateFeatureJsHandler.NAME;
        String str4 = ShowLogJsHandler.NAME;
        String str5 = AlitaCheckUpdateException.b;
        String str6 = c.b;
        String str7 = com.sankuai.waimai.alita.core.mlmodel.operator.exception.a.b;
        String str8 = b.d;
        String str9 = com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.a.b;
        String str10 = com.sankuai.waimai.alita.core.mlmodel.predictor.exception.a.b;
        String str11 = com.sankuai.waimai.alita.core.mlmodel.predictor.exception.b.b;
        String str12 = com.sankuai.waimai.alita.core.mlmodel.predictor.exception.c.b;
        String str13 = d.b;
        String str14 = com.sankuai.waimai.alita.platform.debug.c.b;
        String str15 = AddJSBundlesJsHandler.NAME;
        String str16 = GetServiceConfigJsHandler.NAME;
        String str17 = ExecuteJSBundleJsHandler.NAME;
        String str18 = PredictMLModelJsHandler.NAME;
        String str19 = com.sankuai.waimai.alita.platform.privacy.a.b;
        String str20 = com.sankuai.waimai.alita.platform.privacy.c.b;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfb716511028a4bbcf6af1afee0d056d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfb716511028a4bbcf6af1afee0d056d");
            return;
        }
        JsHandlerFactory.registerJsHandler("alita.startBiz", "Jr9kCGogursTa3T2W8MZMF0O1UGGYqav2kO0xGaewskifcYMI0vL4YOsOvalCQViX/PRxXreur5e6xIkjQh32Q==", StartBizJsHandler.class);
        JsHandlerFactory.registerJsHandler("alita.downloadJSBundle", "NhjDDcsQXsice42pZm1hccHHIvrdvbRKmCiOwfsITqpTK8Y2XOhzeFye9RkobDz+RNAuzGMcMk4+DZ8JQthm/g==", DownloadJsBundleJsHandler.class);
        JsHandlerFactory.registerJsHandler("alita.observeARJSBundle", "ekYulPHwRPcxutDhOPxL3wRiKEMZU30PSZ2Ir4Bb5RFMX3XZYT4ThUCRcLgD2EMvZHaWPsIQeVk6LWRI+FzEdQ==", ObserveAutoRunnerJsHandler.class);
        JsHandlerFactory.registerJsHandler("alita.cancelObserveARJSBundle", "RPXhkTVNkuBjp5IPqI5+liSBbWyygSbJFtKNK7WSyZD7GZc21XNLLmAN2wmvfT+iMqOsVVXW9dnPWhDr1IMaJw==", CancelObserveAutoRunnerJsHandler.class);
        JsHandlerFactory.registerJsHandler("alita.addCustomEvent", "jXpyvs7dVhvA74Wg4n/6/uRE34tKvhYxkQik0/u8fk3CgAIyty69c73QRA4x4GuKZrTAltTB/9jFBGIq5SQy2Q==", AddCustomEventJsHandler.class);
        JsHandlerFactory.registerJsHandler("alita.getFeature", "QTiOV+JnY3ek7k4vxdQSMz0JVcPU2C6e7pavvl1Omb/j7I9A/FtdYcG8P0ftQuHhgb2I6PVXibPR/0JiiDJWMg==", GetFeatureJsHandler.class);
        JsHandlerFactory.registerJsHandler("alita.updateFeature", "inFw/JtG2qVC2ojWIksRSgMNPu3MPGEhMZokS47H2x/OAdaQbKBEwse0FGKzHeEN42oMnhutgWy07eGGFiIV2Q==", UpdateFeatureJsHandler.class);
        JsHandlerFactory.registerJsHandler("alita.stopBiz", "byVkLPv067T0EEU/Q0J9A9v9prPlC8uTPokPQ2VHVl+xwqakdzlfuFk6EODt7sY54wUoFEkRFZv8oKEcdX87TQ==", StopBizJsHandler.class);
        JsHandlerFactory.registerJsHandler("alita.showLog", "sLOzuTp3Sn8c8Wy8MyqJ9X1Zq72YAeYYUbfSzQ5+bRvxgXYFUW+LaDWKnxjzmynHmXydw0HxZ2a99Q6Wt+tlDA==", ShowLogJsHandler.class);
        JsHandlerFactory.registerJsHandler("alita.executeJSBundle", "Jq6C/jsq+RtdcFWB1Vdnp4Ln2lIIcfAUZQFZPjZ+FUE2S1x/QgQ2iAQc2ddZhyonI6qrJQq4M4Ikhkisdmb7kg==", ExecuteJSBundleJsHandler.class);
        JsHandlerFactory.registerJsHandler("alita.predictMLModel", "qvehhYlkUcYpoQk00TIiY+Ut4VJM/9+jPWSVkc85JKw357coqEcJ/DCD+gmxHH3i79OiSs25vGofN6GWMOczjw==", PredictMLModelJsHandler.class);
    }
}
