package com.meituan.msc.modules.api.msi.api;

import android.text.TextUtils;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.api.report.MSCReportBizTagsManager;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Map;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class ReportBizTagsApi extends MSCApi {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class RemoveBizTagsResult {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String bizTagValue;
    }

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class ReportBizTagsParams {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String bizTagKey;
        public Map<String, String> mtBizTagsMap;
        public String targetPath;
    }

    @MsiApiMethod(name = "mtAddBizTags", request = ReportBizTagsParams.class)
    public void mtAddBizTags(ReportBizTagsParams reportBizTagsParams, MsiContext msiContext) {
        Object[] objArr = {reportBizTagsParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ffe39e714666852c54697433d508d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ffe39e714666852c54697433d508d8");
        } else if (MSCReportBizTagsManager.a().a(a(), reportBizTagsParams.targetPath, reportBizTagsParams.mtBizTagsMap)) {
            msiContext.onSuccess(null);
        } else {
            msiContext.onError(TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_COUNTS, "bizTags out limit");
        }
    }

    @MsiApiMethod(name = "mtRemoveBizTag", request = ReportBizTagsParams.class, response = RemoveBizTagsResult.class)
    public void mtRemoveBizTag(ReportBizTagsParams reportBizTagsParams, MsiContext msiContext) {
        String remove;
        Object[] objArr = {reportBizTagsParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2804f9ce53580b2fbc24acb2ae306025", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2804f9ce53580b2fbc24acb2ae306025");
            return;
        }
        MSCReportBizTagsManager a2 = MSCReportBizTagsManager.a();
        String a3 = a();
        String str = reportBizTagsParams.targetPath;
        String str2 = reportBizTagsParams.bizTagKey;
        Object[] objArr2 = {a3, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = MSCReportBizTagsManager.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "347f7bf310abb245719dc5dfe26da3ea", RobustBitConfig.DEFAULT_VALUE)) {
            remove = (String) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "347f7bf310abb245719dc5dfe26da3ea");
        } else if (TextUtils.isEmpty(a3)) {
            g.a("MSCReportBizTagsManager", "removeBizTags appId null");
            remove = "";
        } else {
            g.d("MSCReportBizTagsManager", "removeBizTags", a3, str, str2);
            String b = am.b(str);
            if (TextUtils.isEmpty(b)) {
                remove = a2.b.get(a3).remove(str2);
            } else {
                Map<String, Map<String, String>> map = a2.c.get(a3);
                if (map == null) {
                    remove = "";
                } else {
                    Map<String, String> map2 = map.get(b);
                    remove = map2 == null ? "" : map2.remove(str2);
                }
            }
        }
        if (TextUtils.isEmpty(remove)) {
            msiContext.onError(TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_COUNTS, "key is not exist");
        } else {
            msiContext.onSuccess(remove);
        }
    }

    @MsiApiMethod(name = "mtClearBizTags", request = ReportBizTagsParams.class)
    public void mtClearBizTags(ReportBizTagsParams reportBizTagsParams, MsiContext msiContext) {
        Map<String, String> map;
        Object[] objArr = {reportBizTagsParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b28e076cd61ae16616084377860c18a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b28e076cd61ae16616084377860c18a");
            return;
        }
        MSCReportBizTagsManager a2 = MSCReportBizTagsManager.a();
        String a3 = a();
        String str = reportBizTagsParams.targetPath;
        Object[] objArr2 = {a3, str};
        ChangeQuickRedirect changeQuickRedirect2 = MSCReportBizTagsManager.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "c2fd9ebed9c1aba8a6a7fd66a77cfbd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "c2fd9ebed9c1aba8a6a7fd66a77cfbd7");
        } else if (TextUtils.isEmpty(a3)) {
            g.a("MSCReportBizTagsManager", "clearBizTags appId null");
        } else {
            g.d("MSCReportBizTagsManager", "clearBizTags", a3, str);
            String b = am.b(str);
            if (TextUtils.isEmpty(b)) {
                Map<String, String> map2 = a2.b.get(a3);
                if (map2 != null) {
                    map2.clear();
                }
            } else {
                Map<String, Map<String, String>> map3 = a2.c.get(a3);
                if (map3 != null && (map = map3.get(b)) != null) {
                    map.clear();
                }
            }
        }
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "mtClearAllBizTags")
    public void mtClearAllBizTags(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "019f1622dbbbddd36fa43da29012cdbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "019f1622dbbbddd36fa43da29012cdbb");
            return;
        }
        MSCReportBizTagsManager a2 = MSCReportBizTagsManager.a();
        String a3 = a();
        Object[] objArr2 = {a3};
        ChangeQuickRedirect changeQuickRedirect2 = MSCReportBizTagsManager.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "d8c5fc2f42709df9ca80442480817662", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "d8c5fc2f42709df9ca80442480817662");
        } else if (TextUtils.isEmpty(a3)) {
            g.a("MSCReportBizTagsManager", "clearAllBizTags appId null");
        } else {
            g.d("MSCReportBizTagsManager", "clearAllBizTags", a3);
            Map<String, String> map = a2.b.get(a3);
            if (map != null) {
                map.clear();
            }
            Map<String, Map<String, String>> map2 = a2.c.get(a3);
            if (map2 != null) {
                map2.clear();
            }
        }
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "mtGetBizTags", request = ReportBizTagsParams.class, response = MSCReportBizTagsManager.BizTagsData.class)
    public void mtGetBizTags(ReportBizTagsParams reportBizTagsParams, MsiContext msiContext) {
        Object[] objArr = {reportBizTagsParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa4e11d1bc7e3a84877df545fbf17971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa4e11d1bc7e3a84877df545fbf17971");
        } else {
            msiContext.onSuccess(MSCReportBizTagsManager.a().a(a(), reportBizTagsParams.targetPath));
        }
    }

    @MsiApiMethod(name = "mtGetAllBizTags", request = ReportBizTagsParams.class, response = MSCReportBizTagsManager.BizTagsData.class)
    public void mtGetAllBizTags(ReportBizTagsParams reportBizTagsParams, MsiContext msiContext) {
        Object[] objArr = {reportBizTagsParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03f585c0efa93490738db64c38f05200", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03f585c0efa93490738db64c38f05200");
        } else {
            msiContext.onSuccess(MSCReportBizTagsManager.a().a(a(), reportBizTagsParams.targetPath));
        }
    }
}
