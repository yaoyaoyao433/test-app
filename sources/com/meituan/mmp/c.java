package com.meituan.mmp;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.api.report.MetricsModule;
import com.meituan.mmp.main.Logger;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends Logger {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.main.Logger
    public final void log(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09eca358133577caa7fc1b3548f91e09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09eca358133577caa7fc1b3548f91e09");
            return;
        }
        if (com.meituan.mmp.lib.config.b.f()) {
            Babel.logRT(str, null, map);
        }
        if (com.meituan.mmp.lib.config.b.e()) {
            MMPEnvHelper.getCatHelper().a(str, map);
        }
    }

    @Override // com.meituan.mmp.main.Logger
    public final void log(String str, String str2, Map<String, Object> map, long j) {
        Object[] objArr = {str, str2, map, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af4ad85a29cf4206f5c54dd91d0545e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af4ad85a29cf4206f5c54dd91d0545e");
            return;
        }
        if (com.meituan.mmp.lib.config.b.f()) {
            Babel.logRT(MetricsModule.a(str, str2, j, map));
        }
        if (com.meituan.mmp.lib.config.b.e()) {
            com.meituan.mmp.main.b catHelper = MMPEnvHelper.getCatHelper();
            float f = (float) j;
            Object[] objArr2 = {str, Float.valueOf(f), map};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.main.b.a;
            if (PatchProxy.isSupport(objArr2, catHelper, changeQuickRedirect2, false, "2316976a02e20916a2f3dba2257f4adc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, catHelper, changeQuickRedirect2, false, "2316976a02e20916a2f3dba2257f4adc");
            } else {
                catHelper.a(str, Collections.singletonList(Float.valueOf(f)), map);
            }
        }
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62927668ee868c36785ca3ca9f458770", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62927668ee868c36785ca3ca9f458770") : String.format("%s_%s", "com.weidian.lib.hera.main.HeraActivity", str);
    }

    @Override // com.meituan.mmp.main.Logger
    public final void mgeView(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26fb65f26cbbe82080c68168f747dc72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26fb65f26cbbe82080c68168f747dc72");
        } else {
            Statistics.getChannel("group").writeModelView(a(str), str3, map, str2);
        }
    }

    @Override // com.meituan.mmp.main.Logger
    public final void mgePageView(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6612585773f0f74f9ec4324729b9efbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6612585773f0f74f9ec4324729b9efbf");
            return;
        }
        HashMap hashMap = new HashMap();
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("appid", str);
        hashMap.put("custom", map);
        Statistics.getChannel("group").writePageView(a(str), str2, hashMap);
    }

    @Override // com.meituan.mmp.main.Logger
    public final void mgePageDisappear(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fe39e68d8ec9c2291578e0425cc3351", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fe39e68d8ec9c2291578e0425cc3351");
            return;
        }
        HashMap hashMap = new HashMap();
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("appid", str);
        hashMap.put("custom", map);
        Statistics.getChannel("group").writePageDisappear(a(str), str2, hashMap);
    }

    @Override // com.meituan.mmp.main.Logger
    public final void disableAutoPageView(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f094d82ae8fa41f577a55c1c254719e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f094d82ae8fa41f577a55c1c254719e");
        } else {
            Statistics.disableAutoPV(AppUtil.generatePageInfoKey(obj));
        }
    }

    @Override // com.meituan.mmp.main.Logger
    public final void disableAutoPageDisappear(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a73ae11eb7a3384d186303c4b89eee6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a73ae11eb7a3384d186303c4b89eee6");
        } else {
            Statistics.disableAutoPD(AppUtil.generatePageInfoKey(obj));
        }
    }

    @Override // com.meituan.mmp.main.Logger
    public final void mgeClick(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3916eda18fe9bff82eb8df77391f4d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3916eda18fe9bff82eb8df77391f4d3");
        } else {
            Statistics.getChannel().writeModelClick(a(str), str3, map, str2);
        }
    }

    @Override // com.meituan.mmp.main.Logger
    public final void i(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "7d02004ca702a70075db94f8f2fda741", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "7d02004ca702a70075db94f8f2fda741");
            return;
        }
        String joinMessage = joinMessage(objArr);
        com.dianping.networklog.c.a(str + StringUtil.SPACE + joinMessage, 32, new String[]{"MMP"});
        if (DebugHelper.b()) {
            com.meituan.mmp.lib.trace.b.e(str, joinMessage);
        }
    }

    @Override // com.meituan.mmp.main.Logger
    public final void w(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "ab58b5d1c8bd6891527a578f93b26316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "ab58b5d1c8bd6891527a578f93b26316");
            return;
        }
        String joinMessage = joinMessage(objArr);
        com.dianping.networklog.c.a(str + StringUtil.SPACE + joinMessage, 32, new String[]{"MMP"});
        if (DebugHelper.b()) {
            com.meituan.mmp.lib.trace.b.e(str, joinMessage);
        }
    }

    @Override // com.meituan.mmp.main.Logger
    public final void e(String str, Throwable th, Object... objArr) {
        Object[] objArr2 = {str, th, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "682783c56ad573da28fa35444c77f440", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "682783c56ad573da28fa35444c77f440");
            return;
        }
        String joinMessage = joinMessage(objArr);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(StringUtil.SPACE);
        sb.append(joinMessage);
        sb.append(StringUtil.SPACE);
        sb.append(th != null ? th.getMessage() : null);
        com.dianping.networklog.c.a(sb.toString(), 32, new String[]{"MMP"});
        if (DebugHelper.b()) {
            com.meituan.mmp.lib.trace.b.e(str, joinMessage);
            if (th != null) {
                th.printStackTrace();
            }
        }
    }
}
