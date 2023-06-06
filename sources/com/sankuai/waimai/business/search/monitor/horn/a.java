package com.sankuai.waimai.business.search.monitor.horn;

import android.os.Build;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.meituan.android.singleton.b;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.business.search.model.GlobalPageResponse;
import com.sankuai.waimai.business.search.model.OasisModule;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.mach.common.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a j;
    public WMSearchHornConfigModel b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ef9b988dc22b032188b847e05484e89", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ef9b988dc22b032188b847e05484e89");
        }
        if (j == null) {
            synchronized (a.class) {
                if (j == null) {
                    j = new a();
                }
            }
        }
        return j;
    }

    public final void a(WMSearchHornConfigModel wMSearchHornConfigModel) {
        Object[] objArr = {wMSearchHornConfigModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04d5cf6c69120e5125aa333b62c14043", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04d5cf6c69120e5125aa333b62c14043");
            return;
        }
        this.b = wMSearchHornConfigModel;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0fc2af0899e5dcd353b2cc6795be3338", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0fc2af0899e5dcd353b2cc6795be3338");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e2b5d97dda1df53d1dc2458ae6e01042", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e2b5d97dda1df53d1dc2458ae6e01042");
        } else {
            this.e = this.b != null && this.b.isEnabled();
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "08dccd7117c596115070a2a7b4384da9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "08dccd7117c596115070a2a7b4384da9");
        } else {
            this.f = ((float) ((new Random().nextInt(1000000) % 1000000) + 1)) < (this.b != null ? this.b.successSampleRate * 1000000.0f : 0.0f);
        }
    }

    private String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1519f3d41969d33d05c216070ca29cda", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1519f3d41969d33d05c216070ca29cda") : this.b != null ? this.b.getRelatedSuccessBids() : new String[0];
    }

    private String[] d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5148b960f3f0ab92e15e63965a14e6dc", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5148b960f3f0ab92e15e63965a14e6dc") : this.b != null ? this.b.getRecommendedSuccessBids() : new String[0];
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d82aef8d23fe6c2f1e5f6c6b7b2a0ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d82aef8d23fe6c2f1e5f6c6b7b2a0ab");
        } else if (this.e) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58df4bd6198a2e4ff77cdd65201dd6e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58df4bd6198a2e4ff77cdd65201dd6e3");
            } else {
                this.c = true;
                this.g = true;
                this.d = true;
                this.h = true;
                this.i = true;
            }
            b("search_request_qv");
        }
    }

    public final void a(GlobalPageResponse globalPageResponse) {
        boolean z;
        String[] recommendedTemplateIDs;
        Object[] objArr = {globalPageResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9ec45619e43ebcb5296f343b97f8679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9ec45619e43ebcb5296f343b97f8679");
        } else if (this.e) {
            if (globalPageResponse != null && globalPageResponse.moduleList != null && globalPageResponse.moduleList.size() > 0) {
                String str = null;
                z = false;
                for (OasisModule oasisModule : globalPageResponse.moduleList) {
                    if (oasisModule.templateType == 0) {
                        str = oasisModule.nativeTemplateId;
                    } else if (oasisModule.templateType == 1) {
                        str = oasisModule.machTemplateId;
                    }
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c889d45217b17fb58f16fbe10bc13ca", RobustBitConfig.DEFAULT_VALUE)) {
                        recommendedTemplateIDs = (String[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c889d45217b17fb58f16fbe10bc13ca");
                    } else {
                        recommendedTemplateIDs = this.b != null ? this.b.getRecommendedTemplateIDs() : new String[0];
                    }
                    z = a(str, recommendedTemplateIDs);
                    if (z) {
                        break;
                    }
                }
            } else {
                z = false;
            }
            if (this.g && z) {
                this.g = false;
                b("search_data_success_qv");
            }
        }
    }

    private boolean a(String str, String[] strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a57d56938db5d1fb5a591bdecebea1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a57d56938db5d1fb5a591bdecebea1d")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7109e595fcd7e50b2ceac544f12ffa03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7109e595fcd7e50b2ceac544f12ffa03");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            c(str);
            d(str);
        }
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f7258fff648ad61da17d23c787e63d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f7258fff648ad61da17d23c787e63d9");
        } else if (this.e && this.h && a(str, c())) {
            this.h = false;
            b("search_related_card_show_qv");
        }
    }

    private void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea6d5bb5ee9a6c6d2ab98e8400aa8f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea6d5bb5ee9a6c6d2ab98e8400aa8f5");
        } else if (this.e && this.i && a(str, d())) {
            this.i = false;
            b("search_recommend_card_show_qv");
        }
    }

    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a31e8973cb41fd980de5c97fc59def3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a31e8973cb41fd980de5c97fc59def3b");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("wm_search_no_result_monitor", Float.valueOf(1.0f));
            HashMap hashMap2 = new HashMap();
            hashMap2.put(Constants.SPEED_METER_STEP, str);
            a(hashMap, hashMap2);
        }
    }

    public final void a(Map<String, Number> map, Map<String, String> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c4726a718b3c1f8251279baa0e682e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c4726a718b3c1f8251279baa0e682e6");
            return;
        }
        m mVar = new m(i.a().f(), b.a, com.sankuai.waimai.platform.b.A().c());
        if (map.size() > 0) {
            for (Map.Entry<String, Number> entry : map.entrySet()) {
                mVar.a(entry.getKey(), Collections.singletonList(Float.valueOf(entry.getValue().floatValue())));
            }
        }
        if (map2.size() > 0) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                mVar.a(entry2.getKey(), entry2.getValue());
            }
            mVar.a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.sankuai.waimai.platform.b.A().i());
            mVar.a("platform", "Android");
            mVar.a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_SYS_VERSION, Build.VERSION.RELEASE);
            mVar.a(NetLogConstants.Tags.NETWORK_TYPE, p.b(b.a.getApplicationContext()));
            mVar.a("uuid", com.sankuai.waimai.platform.b.A().c());
        }
        mVar.a();
    }
}
