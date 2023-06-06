package com.sankuai.waimai.store.newuser.outlink;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.raptor.SGNewUserOutLinkHookRate;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.raptor.SGNewUserOutLinkRate;
import com.sankuai.waimai.store.newuser.outlink.a;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.b;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGNewUserLandSchemeRule implements SchemeReplaceRule {
    private static final String DOWN_GRADE_SWITCH = "2";
    private static final String DOWN_GRADE_SWITCH_OFF = "0";
    private static final String DOWN_GRADE_SWITCH_ON = "1";
    private static final String GRAY_SWITCH = "1";
    private static final String GRAY_SWITCH_OFF = "0";
    private static final String GRAY_SWITCH_ON = "1";
    private static final String HORN_NEW_USER_LINK_KEY = "sm_newuser_outlink_config";
    private static final String MRN_ENTRY = "flashbuy-detonate-product";
    private static final String NATIVE_SCHEME = "meituanwaimai://waimai.meituan.com/supermarket/sgnewuserland";
    private static final String ORIGIN_SCHEME = "meituanwaimai://waimai.meituan.com/mrn?mrn_biz=sgc&mrn_component=flashbuy-detonate-product&mrn_entry=flashbuy-detonate-produc";
    private static int VERSION_1_LARGE = 1;
    private static int VERSION_1_SMALL = -1;
    private static int VERSION_EQUAL = 0;
    private static int VERSION_INVALID = -2;
    private static final String WM_HOME_SCHEME_PATH = "";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean hornInited;
    private a.C1247a ruleHornModel;

    public SGNewUserLandSchemeRule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "104b988688f59ec5521ca7164cfc5671", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "104b988688f59ec5521ca7164cfc5671");
        } else {
            this.hornInited = false;
        }
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public boolean shouldReplace(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f257401f78f974627807ecbac7d298a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f257401f78f974627807ecbac7d298a")).booleanValue();
        }
        try {
            if (!t.a(uri.toString()) && uri.toString().contains(ORIGIN_SCHEME)) {
                getSgNewUserLinkHorn();
                return isNeedIntercept(uri, "mrn");
            }
        } catch (Exception e) {
            SGNewUserOutLinkHookRate sGNewUserOutLinkHookRate = SGNewUserOutLinkHookRate.SGOutLinkHookError;
            raptorReport(sGNewUserOutLinkHookRate, null, false, "SGNewUserOutLinkHookRate.SGOutLinkHookError" + uri.toString() + e.toString());
        }
        return false;
    }

    private void getSgNewUserLinkHorn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f588cd8f7fe08c17c6c26143bf6b4e3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f588cd8f7fe08c17c6c26143bf6b4e3a");
        } else if (this.hornInited) {
        } else {
            String accessCache = Horn.accessCache(HORN_NEW_USER_LINK_KEY);
            a aVar = t.a(accessCache) ? null : (a) i.a(accessCache, a.class);
            if (aVar != null && aVar.b != null) {
                this.ruleHornModel = aVar.b;
            }
            if (this.ruleHornModel == null) {
                this.ruleHornModel = new a.C1247a();
            }
        }
    }

    public static Uri getGradePath(Intent intent) {
        Uri data;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20b8fdee804787390780cb40b55b7847", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20b8fdee804787390780cb40b55b7847");
        }
        if (intent == null || (data = intent.getData()) == null) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(NATIVE_SCHEME).buildUpon();
        Set<String> queryParameterNames = data.getQueryParameterNames();
        Set<String> filterParams = getFilterParams();
        for (String str : queryParameterNames) {
            if (!filterParams.contains(str)) {
                buildUpon.appendQueryParameter(str, data.getQueryParameter(str));
            }
        }
        Bundle extras = intent.getExtras();
        HashMap hashMap = new HashMap();
        if (extras != null) {
            boolean z = extras.getBoolean("_isDspColdStart", false);
            String str2 = extras.getBoolean("cold_launch", false) ? "1" : "0";
            String str3 = z ? "1" : "0";
            buildUpon.appendQueryParameter("_isDspColdStart", str3);
            buildUpon.appendQueryParameter("cold_launch", str2);
            hashMap.put("_isDspColdStart", str3);
            hashMap.put("cold_launch", str2);
        }
        hashMap.put("target_page_type", DiagnoseLog.NATIVE);
        buildUpon.appendQueryParameter("link_time", String.valueOf(System.currentTimeMillis()));
        raptorReport(SGNewUserOutLinkHookRate.SGOutLinkHookSuccess, hashMap, true, "");
        return buildUpon.build();
    }

    public static Set<String> getFilterParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cedd9da869f5d93fced69ffc3ac8866a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cedd9da869f5d93fced69ffc3ac8866a");
        }
        HashSet hashSet = new HashSet();
        hashSet.add("mrn_backup_url");
        hashSet.add("mrn_biz");
        hashSet.add("mrn_entry");
        hashSet.add("mrn_component");
        return hashSet;
    }

    public boolean isNeedIntercept(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4027cfe03f5cdd9c57f01db158d8faa1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4027cfe03f5cdd9c57f01db158d8faa1")).booleanValue() : innerNeedIntercept(uri, str);
    }

    private boolean innerNeedIntercept(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32d82bd48055464a67378d27fbd9b70a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32d82bd48055464a67378d27fbd9b70a")).booleanValue();
        }
        if (uri == null || this.ruleHornModel == null) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("mrn_biz");
        if (!t.a(queryParameter) && TextUtils.equals(str, "mrn") && TextUtils.equals("sgc", queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("mrn_component");
            if (t.a(queryParameter2) || !MRN_ENTRY.equals(queryParameter2)) {
                return false;
            }
            String queryParameter3 = uri.getQueryParameter("mrn_entry");
            if (t.a(queryParameter3) || !MRN_ENTRY.equals(queryParameter3)) {
                return false;
            }
            String queryParameter4 = uri.getQueryParameter("page_sourse_type");
            String queryParameter5 = uri.getQueryParameter("wm_native");
            if (t.a(queryParameter5) || TextUtils.equals("0", queryParameter5)) {
                return false;
            }
            HashMap hashMap = new HashMap();
            if (t.a(queryParameter4)) {
                queryParameter4 = "unknow";
            }
            hashMap.put("page_sourse_type", queryParameter4);
            raptorReport(SGNewUserOutLinkRate.SGNewUserOutLink, hashMap, true, "");
            String queryParameter6 = uri.getQueryParameter("wm_host_version");
            if (TextUtils.equals("1", queryParameter5)) {
                if (TextUtils.equals("1", this.ruleHornModel.c) && checkMinVersion(queryParameter6)) {
                    hashMap.put("target_page_type", DiagnoseLog.NATIVE);
                    hashMap.put("mt_native", "1");
                    raptorReport(SGNewUserOutLinkRate.SGNewUserOutLinkHook, hashMap, true, "");
                    return true;
                }
            } else if ("2".equals(queryParameter5)) {
                if (!TextUtils.equals("1", this.ruleHornModel.a) && checkMinVersion(queryParameter6)) {
                    hashMap.put("target_page_type", DiagnoseLog.NATIVE);
                    hashMap.put("mt_native", "2");
                    raptorReport(SGNewUserOutLinkRate.SGNewUserOutLinkHook, hashMap, true, "");
                    return true;
                }
            } else {
                hashMap.put("target_page_type", DiagnoseLog.MRN);
                if (t.a(queryParameter5)) {
                    queryParameter5 = "-999";
                }
                hashMap.put("mt_native", queryParameter5);
            }
            raptorReport(SGNewUserOutLinkRate.SGNewUserOutLinkHook, hashMap, true, "");
            return false;
        }
        return false;
    }

    public static void raptorReport(IMonitor iMonitor, Map map, boolean z, String str) {
        Object[] objArr = {iMonitor, map, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9d51d44c2b00bb90afa11007703a6387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9d51d44c2b00bb90afa11007703a6387");
            return;
        }
        b.a a = b.a();
        a.a(iMonitor);
        a.a(z);
        if (map != null && map.size() > 0) {
            a.a(map);
        }
        if (!t.a(str)) {
            a.a(str);
        }
        a.a();
    }

    private static boolean checkMinVersion(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d2d1d38ce00a531ab695e215ebac699", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d2d1d38ce00a531ab695e215ebac699")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String e = com.sankuai.waimai.foundation.core.common.a.a().e();
            if (!TextUtils.isEmpty(e)) {
                if (compareVersion(e, str) != VERSION_1_LARGE) {
                    if (compareVersion(e, str) == VERSION_EQUAL) {
                    }
                }
                return true;
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static int compareVersion(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "664a8daf4fdfd3dbc7478ca2559f0901", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "664a8daf4fdfd3dbc7478ca2559f0901")).intValue();
        }
        if (!isVersionValue(str) || !isVersionValue(str2)) {
            return VERSION_INVALID;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int length = split.length > split2.length ? split.length : split2.length;
        int i = 0;
        while (i < length) {
            int parseInt = i >= split.length ? 0 : NumberUtils.parseInt(split[i], 0);
            int parseInt2 = i >= split2.length ? 0 : NumberUtils.parseInt(split2[i], 0);
            if (parseInt > parseInt2) {
                return VERSION_1_LARGE;
            }
            if (parseInt < parseInt2) {
                return VERSION_1_SMALL;
            }
            i++;
        }
        return VERSION_EQUAL;
    }

    private static boolean isVersionValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "32f48d6ec7fd5660e48e796534624d2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "32f48d6ec7fd5660e48e796534624d2c")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.trim().length() == 0) {
            return false;
        }
        return str.contains(CommonConstant.Symbol.DOT);
    }

    @Override // com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule
    public void schemeReplace(@NonNull j jVar) {
        Uri uri;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5de0153485cbb3289c55ee5676110aa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5de0153485cbb3289c55ee5676110aa4");
        } else if (jVar != null && (uri = jVar.d) != null) {
            try {
                Uri.Builder buildUpon = Uri.parse(NATIVE_SCHEME).buildUpon();
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                Set<String> filterParams = getFilterParams();
                for (String str : queryParameterNames) {
                    if (!filterParams.contains(str)) {
                        buildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("target_page_type", DiagnoseLog.NATIVE);
                buildUpon.appendQueryParameter("link_time", String.valueOf(System.currentTimeMillis()));
                raptorReport(SGNewUserOutLinkHookRate.SGOutLinkHookSuccess, hashMap, true, "");
                jVar.a(buildUpon.build());
            } catch (Throwable th) {
                SGNewUserOutLinkHookRate sGNewUserOutLinkHookRate = SGNewUserOutLinkHookRate.SGOutLinkHookError;
                raptorReport(sGNewUserOutLinkHookRate, null, false, "SGNewUserOutLinkHookRate.SGOutLinkHookError" + uri.toString() + th.toString());
            }
        }
    }
}
