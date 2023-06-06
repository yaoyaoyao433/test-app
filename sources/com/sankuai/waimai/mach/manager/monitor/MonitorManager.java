package com.sankuai.waimai.mach.manager.monitor;

import android.os.SystemClock;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.e;
import com.sankuai.waimai.mach.log.b;
import com.sankuai.waimai.mach.utils.g;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MonitorManager {
    public static final String TAG = "MonitorManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private e mMonitorReporter;

    private String genSnifferAnimatorModule() {
        return "mach_animator";
    }

    private int getCatLoadCode(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a21c948d8ede66de2cc3e287b09121a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a21c948d8ede66de2cc3e287b09121a")).intValue();
        }
        return (z ? 17700 : 17900) + (i * 10) + i2;
    }

    public MonitorManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08bf2b95d23afcc92510ca22b6973fb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08bf2b95d23afcc92510ca22b6973fb3");
        } else {
            this.mMonitorReporter = i.a().e();
        }
    }

    public void loadBundleSuccess(String str, String str2, String str3, String str4, String str5, long j) {
        char c;
        Object[] objArr = {str, str2, str3, str4, str5, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfd76a75b97edff4fd561d93ba73b0b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfd76a75b97edff4fd561d93ba73b0b4");
        } else if (i.a().h() || g.a(a.a)) {
            if (isDebug()) {
                StringBuilder sb = new StringBuilder("loadBundleSuccess::business=");
                sb.append(str);
                sb.append(",templateId=");
                sb.append(str2);
            }
            if (this.mMonitorReporter != null) {
                int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - j);
                HashMap hashMap = new HashMap();
                if (i.a().h()) {
                    hashMap.put("MachLoadTemplateTime_Test", Integer.valueOf(elapsedRealtime));
                } else {
                    hashMap.put("MachLoadTemplateTime", Integer.valueOf(elapsedRealtime));
                }
                Map<String, String> c2 = i.a().c();
                c2.put("biz", str3);
                c2.put("module_id", str);
                c2.put("template_id", str2);
                c2.put("template_version", str4);
                c = 0;
                c2.put("load_method", str5);
                this.mMonitorReporter.a(hashMap, c2);
            } else {
                c = 0;
            }
            String[] strArr = new String[1];
            strArr[c] = "template load succeed " + str2;
            b.a("MachTemplate", strArr);
        }
    }

    public void loadBundleFailure(String str, String str2, String str3, String str4, Map<String, Object> map, com.sankuai.waimai.mach.manager.exception.a aVar, int i) {
        Object[] objArr = {str, str2, str3, str4, map, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e05a61c45103cbebc1de273da85eefd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e05a61c45103cbebc1de273da85eefd");
            return;
        }
        if (isDebug()) {
            Log.e(TAG, "loadBundleFailure::business=" + str2 + ",templateId=" + str4 + " reason=" + aVar.a());
        }
        if (this.mMonitorReporter != null) {
            renderCatCustomReport(0, str2, str3, str4, str, 1);
            this.mMonitorReporter.a(genSnifferLoadModule(str2), aVar.a(), "加载MachBundle失败", getSnifferExtraMap2(str4, aVar));
        }
        b.b("MachTemplate", "template load error with bundleName:" + map, "templateID:" + str4, "bundleVersion:" + str, "errorMessage:" + aVar.a());
    }

    public void reportBundleFailure(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2db717ba1fe98b54cd9ac8d4d46797c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2db717ba1fe98b54cd9ac8d4d46797c3");
        } else if (this.mMonitorReporter != null) {
            renderCatCustomReport(0, str2, str3, str4, str, 1);
            this.mMonitorReporter.a(genSnifferLoadModule(str2), str4, "加载MachBundle失败", null);
        }
    }

    public void renderSuccess(String str, String str2, String str3, String str4, Map<String, Object> map, int i) {
        Object[] objArr = {str, str2, str3, str4, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "337275ee4073f9d44a7fee8655cee7d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "337275ee4073f9d44a7fee8655cee7d3");
            return;
        }
        if (isDebug()) {
            StringBuilder sb = new StringBuilder("renderSuccess::business=");
            sb.append(str);
            sb.append(",templateId=");
            sb.append(str3);
        }
        if (this.mMonitorReporter != null) {
            renderCatCustomReport(1, str, str2, str3, str4, 0);
            templateRenderCatCustomReport(1, str, str2, str3, str4);
            HashMap hashMap = new HashMap();
            if (i.a().h()) {
                hashMap.put("MachRenderTemplateTime_Test", Integer.valueOf(i));
                hashMap.put("MachRenderTemplateUserTime_Test", Integer.valueOf(i));
            } else if (g.a(a.a)) {
                hashMap.put("MachRenderTemplateTime", Integer.valueOf(i));
                hashMap.put("MachRenderTemplateUserTime", Integer.valueOf(i));
            }
            Map<String, String> c = i.a().c();
            c.put("biz", str2);
            c.put("module_id", str);
            c.put("template_id", str3);
            c.put("template_version", str4);
            this.mMonitorReporter.a(hashMap, c);
        }
    }

    public void renderFailure(String str, String str2, String str3, String str4, Map<String, Object> map, Throwable th, int i) {
        Object[] objArr = {str, str2, str3, str4, map, th, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e2dae649f60e67cfd636fbc22de68ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e2dae649f60e67cfd636fbc22de68ab");
            return;
        }
        if (isDebug()) {
            Log.e(TAG, "renderFailure::business=" + str + ",templateId=" + str3 + ",reason=" + th.getMessage());
        }
        if (this.mMonitorReporter != null) {
            renderCatCustomReport(0, str, str2, str3, str4, 2);
            templateRenderCatCustomReport(0, str, str2, str3, str4);
            this.mMonitorReporter.a(genSnifferRenderModule(str), th.getMessage(), "模板渲染失败", getSnifferExtraMap(str3, str4, map));
        }
    }

    public void jsError(String str, String str2, String str3, String str4, Map<String, Object> map, Throwable th) {
        Object[] objArr = {str, str2, str3, str4, map, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e924c093a07a9ed84167fc1eb5b639b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e924c093a07a9ed84167fc1eb5b639b");
            return;
        }
        if (isDebug()) {
            Log.e(TAG, "jsError::business=" + str3 + ",templateId=" + str4 + ",reason=" + th.getMessage());
        }
        if (this.mMonitorReporter != null) {
            HashMap hashMap = new HashMap();
            if (i.a().h()) {
                hashMap.put("MachJSException_Test", 1);
            } else {
                hashMap.put("MachJSException", 1);
            }
            Map<String, String> c = i.a().c();
            c.put("biz", str);
            c.put("module_id", str3);
            c.put("template_id", str4);
            c.put("template_version", str2);
            this.mMonitorReporter.a(hashMap, c);
            com.sankuai.waimai.mach.utils.e.a("", str4, str2, th.getMessage(), null, false, false);
        }
        b.b("MachJS", "js exception exception:" + th.toString());
    }

    public void exprError(String str, String str2, String str3, String str4, Map<String, Object> map, String str5, String str6) {
        Object[] objArr = {str, str2, str3, str4, map, str5, str6};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2276d85b8eef108bf2879adc3a41bd87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2276d85b8eef108bf2879adc3a41bd87");
            return;
        }
        if (isDebug()) {
            Log.e(TAG, "exprError::business=" + str3 + ",templateId=" + str4 + ",key=" + str5 + ",value=" + str6);
        }
        if (this.mMonitorReporter != null) {
            HashMap hashMap = new HashMap();
            if (i.a().h()) {
                hashMap.put("MachExprException_Test", 1);
            } else {
                hashMap.put("MachExprException", 1);
            }
            Map<String, String> c = i.a().c();
            c.put("biz", str);
            c.put("module_id", str3);
            c.put("template_id", str4);
            c.put("template_version", str2);
            this.mMonitorReporter.a(hashMap, c);
            Map<String, Object> snifferExtraMap = getSnifferExtraMap(str4, "", map);
            snifferExtraMap.put("key", str5);
            snifferExtraMap.put("value", str6);
            snifferExtraMap.put("template_id", str4);
            snifferExtraMap.put("template_version", str2);
            snifferExtraMap.put("data", com.sankuai.waimai.mach.utils.b.a().toJson(map));
            this.mMonitorReporter.a(genSnifferExprModule(str3), str4, "表达式解析异常", snifferExtraMap);
        }
    }

    public void animatorError(String str, Map<String, Object> map, Throwable th) {
        Object[] objArr = {str, map, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "584408e064212c1563ca435549754974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "584408e064212c1563ca435549754974");
            return;
        }
        if (isDebug()) {
            Log.e(TAG, "animatorError::templateId=" + str + ",reason=" + th.getMessage());
        }
        if (this.mMonitorReporter != null) {
            this.mMonitorReporter.a(genSnifferAnimatorModule(), str, th.getMessage(), getSnifferExtraMap(str, "", map));
        }
        b.b("MachAnimator", th.toString());
    }

    private Map<String, Object> getSnifferExtraMap2(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "410dd470e3be9c261da1d646b1499058", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "410dd470e3be9c261da1d646b1499058");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("template_id", str);
        hashMap.put("errorMsg", Log.getStackTraceString(th));
        return hashMap;
    }

    @NonNull
    private Map<String, Object> getSnifferExtraMap(String str, String str2, Map<String, Object> map) {
        String str3;
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38b642368a84b29e48d17ede9b390151", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38b642368a84b29e48d17ede9b390151");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("template_id", str);
        hashMap.put("template_version", str2);
        if (map != null) {
            try {
                str3 = com.sankuai.waimai.mach.utils.b.a().toJson(map);
            } catch (Exception unused) {
                str3 = "json解析失败";
            }
            hashMap.put("data", str3);
        } else {
            hashMap.put("data", "data = null!!!");
        }
        return hashMap;
    }

    private String genSnifferExprModule(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1915d5aeb3a65e90f00a727a341587c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1915d5aeb3a65e90f00a727a341587c6");
        }
        return "mach_expr_" + str;
    }

    private String genSnifferJsModule(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97863173fba2856a7f7c62e2165371f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97863173fba2856a7f7c62e2165371f6");
        }
        return "mach_js_" + str;
    }

    private String genSnifferLoadModule(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d1887bc669169d7db089f67e8621e72", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d1887bc669169d7db089f67e8621e72");
        }
        return "mach_load_" + str;
    }

    private String genSnifferRenderModule(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88b12a0907490375196dc3ef349a11c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88b12a0907490375196dc3ef349a11c4");
        }
        return "mach_render_" + str;
    }

    private boolean isDebug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17c5c28525f2195f29933a59b71eb403", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17c5c28525f2195f29933a59b71eb403")).booleanValue();
        }
        if (i.a().f != null) {
            return i.a().f.b;
        }
        return false;
    }

    public static String RECORD_START(boolean z, String str) {
        StringBuilder sb = z ? new StringBuilder("mach_reRender_") : new StringBuilder("mach_firstRender_");
        sb.append(str);
        return sb.toString();
    }

    public static String MACH_LIST_RECORD_START(String str) {
        return "mach_list_prerender_" + str;
    }

    public static void RECORD_STEP(com.sankuai.waimai.mach.model.data.a aVar, String str) {
        e e = i.a().e();
        if (e != null) {
            e.a(str, aVar);
        }
    }

    public static void RECORD_END(com.sankuai.waimai.mach.model.data.a aVar) {
        e e = i.a().e();
        if (e != null) {
            e.a(aVar);
        }
    }

    public static void loganReport(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "de0c332a6e10734cf21050921c458fe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "de0c332a6e10734cf21050921c458fe6");
            return;
        }
        e e = i.a().e();
        if (e != null) {
            e.a(i, str, str2);
        }
    }

    private void renderCatCustomReport(int i, String str, String str2, String str3, String str4, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, str4, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47a87cede5c05bf7e983bf67b4ac3896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47a87cede5c05bf7e983bf67b4ac3896");
        } else if (this.mMonitorReporter != null) {
            HashMap hashMap = new HashMap();
            if (i.a().h()) {
                hashMap.put("MachBusinessSuccess_Test", Integer.valueOf(i));
            } else {
                hashMap.put("MachBusinessSuccess", Integer.valueOf(i));
            }
            Map<String, String> c = i.a().c();
            c.put("biz", str2);
            c.put("module_id", str);
            c.put("template_id", str3);
            c.put("template_version", str4);
            c.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(i2));
            this.mMonitorReporter.a(hashMap, c);
        }
    }

    private void templateRenderCatCustomReport(int i, String str, String str2, String str3, String str4) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22c42c711c73e480b7a3c5a11c3b5020", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22c42c711c73e480b7a3c5a11c3b5020");
        } else if ((i.a().h() || g.a(a.a)) && this.mMonitorReporter != null) {
            HashMap hashMap = new HashMap();
            if (i.a().h()) {
                hashMap.put("MachRenderTemplate_Test", Integer.valueOf(i));
            } else {
                hashMap.put("MachRenderTemplate", Integer.valueOf(i));
            }
            Map<String, String> c = i.a().c();
            c.put("biz", str2);
            c.put("module_id", str);
            c.put("template_id", str3);
            c.put("template_version", str4);
            this.mMonitorReporter.a(hashMap, c);
        }
    }

    public void templateLoadCatCustomReport(int i, String str, String str2, String str3, String str4, String str5, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, str4, str5, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9cd107ef7c36baaec4269fa7269f547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9cd107ef7c36baaec4269fa7269f547");
        } else if ((i.a().h() || g.a(a.a)) && this.mMonitorReporter != null) {
            HashMap hashMap = new HashMap();
            if (i.a().h()) {
                hashMap.put("MachLoadTemplate_Test", Integer.valueOf(i));
            } else {
                hashMap.put("MachLoadTemplate", Integer.valueOf(i));
            }
            this.mMonitorReporter.a(hashMap, getTemplateLoadTags(str, str2, str3, str4, str5, i2));
        }
    }

    public void netTemplateLoadCatCustomReport(int i, String str, String str2, String str3, String str4, String str5, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, str4, str5, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a974b8e26f6c37dfa05561298b006e26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a974b8e26f6c37dfa05561298b006e26");
        } else if ((i.a().h() || g.a(a.a)) && this.mMonitorReporter != null) {
            HashMap hashMap = new HashMap();
            if (i.a().h()) {
                hashMap.put("MachLoadNetworkTemplate_Test", Integer.valueOf(i));
            } else {
                hashMap.put("MachLoadNetworkTemplate", Integer.valueOf(i));
            }
            this.mMonitorReporter.a(hashMap, getTemplateLoadTags(str, str2, str3, str4, str5, i2));
        }
    }

    public void presetTemplateLoadCatCustomReport(int i, String str, String str2, String str3, String str4, String str5, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, str4, str5, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d465ff6cf7f28d3cc3423bc1094d1af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d465ff6cf7f28d3cc3423bc1094d1af");
        } else if ((i.a().h() || g.a(a.a)) && this.mMonitorReporter != null) {
            HashMap hashMap = new HashMap();
            if (i.a().h()) {
                hashMap.put("MachLoadPresetTemplate_Test", Integer.valueOf(i));
            } else {
                hashMap.put("MachLoadPresetTemplate", Integer.valueOf(i));
            }
            this.mMonitorReporter.a(hashMap, getTemplateLoadTags(str, str2, str3, str4, str5, i2));
        }
    }

    private Map<String, String> getTemplateLoadTags(String str, String str2, String str3, String str4, String str5, int i) {
        Object[] objArr = {str, str2, str3, str4, str5, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd01400b76f5ad3f41e2857f28b854fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd01400b76f5ad3f41e2857f28b854fb");
        }
        Map<String, String> c = i.a().c();
        c.put("biz", str2);
        c.put("module_id", str);
        c.put("template_id", str3);
        c.put("template_version", str4);
        c.put("load_method", str5);
        c.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(i));
        return c;
    }
}
