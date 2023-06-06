package com.sankuai.waimai.business.ugc.pickme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.ugc.machpro.base.MPCustomBaseFragment;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.mach.manager.cache.c;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.util.b;
import com.sankuai.waimai.platform.preload.e;
import com.sankuai.waimai.platform.preload.f;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PickMeMPFragment extends MPCustomBaseFragment {
    public static ChangeQuickRedirect a;
    private long d;

    public PickMeMPFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e1fdb9e95ddfac1dead59fd124453bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e1fdb9e95ddfac1dead59fd124453bf");
        } else {
            this.d = 0L;
        }
    }

    public static PickMeMPFragment a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b3aa4e264ea6eab07085777e337d015", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickMeMPFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b3aa4e264ea6eab07085777e337d015");
        }
        PickMeMPFragment pickMeMPFragment = new PickMeMPFragment();
        pickMeMPFragment.b(str);
        return pickMeMPFragment;
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6473b64190a76cd984b63f5eb1aac959", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6473b64190a76cd984b63f5eb1aac959");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("scene_type", str);
        if (getArguments() == null) {
            setArguments(arguments);
        }
    }

    @Override // com.sankuai.waimai.business.ugc.machpro.base.MPCustomBaseFragment, com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e7ac5138515927ac3fc3ce19d3ffbf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e7ac5138515927ac3fc3ce19d3ffbf6");
            return;
        }
        this.d = System.currentTimeMillis();
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("bundle_name", "mach_pro_waimai_pickme");
        arguments.putString("biz", "waimai");
        arguments.putSerializable("bundle_params", null);
        if (getArguments() == null) {
            setArguments(arguments);
        }
        super.onCreate(bundle);
        m();
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5887b2ffb9a224cbad4367f63646e97e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5887b2ffb9a224cbad4367f63646e97e");
            return;
        }
        super.a(cVar);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87dd838d458d4ad65e801253c07e36aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87dd838d458d4ad65e801253c07e36aa");
        } else if (e.a().a("/pickme") || e.a().a("/takeout/pickme")) {
            e.a().a(getActivity(), new com.sankuai.waimai.platform.preload.c<MachMap>() { // from class: com.sankuai.waimai.business.ugc.pickme.PickMeMPFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.preload.c
                public final void a(f<MachMap> fVar) {
                    Object[] objArr3 = {fVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "26c95e87bd84165883f0f8188c44bb20", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "26c95e87bd84165883f0f8188c44bb20");
                        return;
                    }
                    f.a aVar = fVar.b;
                    if (aVar == f.a.SUCCESS) {
                        PickMeMPFragment.this.b(fVar.c);
                    } else if (aVar == f.a.FAILED) {
                        PickMeMPFragment.this.b(PickMeMPFragment.this.l());
                    }
                }
            });
        } else {
            b(l());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MachMap l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd73594be6ae47ba21506109375f1a3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd73594be6ae47ba21506109375f1a3b");
        }
        try {
            String a2 = com.sankuai.waimai.platform.utils.f.a(getActivity().getIntent(), "rank_list_id");
            String a3 = com.sankuai.waimai.platform.utils.f.a(getActivity().getIntent(), "ref_list_id");
            String a4 = com.sankuai.waimai.platform.utils.f.a(getActivity().getIntent(), "urlParams");
            String b = com.sankuai.waimai.platform.utils.f.b(getActivity().getIntent(), "source_id", "source_id");
            if (TextUtils.isEmpty(b)) {
                b = "PickMe";
            }
            JSONObject jSONObject = aa.a(a4) ? new JSONObject() : new JSONObject(a4);
            jSONObject.put("ref_list_id", a3);
            jSONObject.put("rank_list_id", a2);
            jSONObject.put("offset", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("urlParams", jSONObject.toString());
            jSONObject2.put("ref_list_id", a3);
            jSONObject2.put("rank_list_id", a2);
            jSONObject2.put("source_id", b);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("schemeQuery", jSONObject2);
            return b.a(jSONObject3);
        } catch (Exception unused) {
            return new MachMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "206fc0cd4b30f3fbb50e54bf6bc116c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "206fc0cd4b30f3fbb50e54bf6bc116c9");
            return;
        }
        try {
            m();
            this.g.b(machMap);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f121ac4a6b5e35c3570e20064b86d34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f121ac4a6b5e35c3570e20064b86d34");
            return;
        }
        MachMap machMap = new MachMap();
        machMap.put("preloadEndTime", Long.valueOf(System.currentTimeMillis()));
        if (getActivity() != null && getArguments() != null) {
            long a2 = com.sankuai.waimai.platform.utils.f.a(getActivity().getIntent(), "routerStartTime", "routerStartTime", -1L);
            String b = com.sankuai.waimai.platform.utils.f.b(getActivity().getIntent(), "source_id", "source_id");
            if (TextUtils.isEmpty(b)) {
                b = com.sankuai.waimai.platform.utils.f.b(getActivity().getIntent(), "source_id", "source_id");
                if (TextUtils.isEmpty(b)) {
                    b = "PickMe";
                }
            }
            machMap.put("routerStartTime", Long.valueOf(a2));
            machMap.put("pageCreateTime", Long.valueOf(this.d));
            machMap.put("source_id", b);
            machMap.put("scene_type", getArguments().getString("scene_type", "PickMe"));
        }
        City l = g.a().l();
        if (l != null) {
            machMap.put("city", l.getCityName());
        }
        MtTelephonyManager createTelephonyManager = Privacy.createTelephonyManager(getContext(), "com.sankuai.waimai.foundation:utils");
        if (createTelephonyManager != null) {
            machMap.put("networkOperator", createTelephonyManager.getNetworkOperatorName());
        }
        machMap.put("videoPlayerType", "xplayer");
        machMap.put("cpuMaxHz", Integer.valueOf(com.sankuai.waimai.business.ugc.utils.a.a()));
        machMap.put("cpuNum", Integer.valueOf(com.sankuai.waimai.business.ugc.utils.a.b()));
        machMap.put("totalMemory", Long.valueOf(com.sankuai.waimai.business.ugc.utils.a.a(getContext())));
        machMap.put(FingerprintManager.TAG, com.sankuai.waimai.platform.b.A().E());
        a(machMap);
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcfa84251e6165dbd8147ea2b19d2a8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcfa84251e6165dbd8147ea2b19d2a8d");
        } else {
            a("refresh_data", (MachMap) null);
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "711aec9615eaf8d4f8ca4a42f46229b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "711aec9615eaf8d4f8ca4a42f46229b6");
        } else if (this.g == null) {
        } else {
            super.onResume();
        }
    }
}
