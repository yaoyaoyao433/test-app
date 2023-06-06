package com.sankuai.waimai.business.im.group.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.model.g;
import com.sankuai.waimai.business.im.mach.c;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.business.im.model.j;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.mach.utils.b;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.capacity.abtest.f;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMUserMachGroupBannerBarAdapter implements IBannerAdapter {
    public static ChangeQuickRedirect a;
    public View b;
    protected com.sankuai.waimai.business.im.common.contract.a c;
    public a d;
    private Context e;
    private final String f;
    private final String g;
    private final String h;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public c a;
        public FrameLayout b;
    }

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public boolean isOverlay() {
        return false;
    }

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "116caa62e51103e4cbdb1b8e3f93c2ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "116caa62e51103e4cbdb1b8e3f93c2ad");
        }
    }

    public WMUserMachGroupBannerBarAdapter(Context context, com.sankuai.waimai.business.im.common.contract.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f679f22f49a16d944294108649c22fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f679f22f49a16d944294108649c22fb");
            return;
        }
        this.f = "waimai_im_im_group_banner_style_1";
        this.g = "waimai_im_mach";
        this.h = "c_waimai_reae8s5i";
        this.e = context;
        this.c = aVar;
    }

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26b06687c0db9962ba3f38e4d4ba009a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26b06687c0db9962ba3f38e4d4ba009a");
        }
        this.b = layoutInflater.inflate(R.layout.wm_im_comon_mach_adapter, viewGroup, false);
        a aVar = new a();
        aVar.b = (FrameLayout) this.b.findViewById(R.id.framelayout);
        c cVar = new c(this.e, this.c, "c_waimai_reae8s5i");
        cVar.a((ViewGroup) this.b.findViewById(R.id.framelayout));
        aVar.a = cVar;
        this.b.setTag(aVar);
        this.b.setClickable(true);
        this.b.setFocusable(true);
        return this.b;
    }

    public final void a(g gVar) {
        String str;
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c83a7d3e1094136c8e25c37e1dc0ffcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c83a7d3e1094136c8e25c37e1dc0ffcb");
        } else if (gVar == null || gVar.c == null) {
        } else {
            if ((gVar.c.c == null || gVar.c.c.size() <= 0) && TextUtils.isEmpty(gVar.c.b)) {
                return;
            }
            j jVar = new j();
            jVar.b = "waimai_im_im_group_banner_style_1";
            jVar.e = b.a(b.a().toJson(gVar.c));
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("env", f.b());
            Context context = this.e;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58ae7e4ff309868558ae559503a2e317", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58ae7e4ff309868558ae559503a2e317");
            } else {
                ABStrategy strategy = ABTestManager.getInstance(context).getStrategy("wm_im_group_setting", null);
                str = strategy != null ? strategy.expName : "";
            }
            hashMap2.put("strategy", str);
            hashMap.put("h5_strategy", hashMap2);
            jVar.e.putAll(hashMap);
            jVar.d = "";
            jVar.c = "waimai_im_mach";
            this.d = (a) this.b.getTag();
            this.d.a.a(jVar, "waimai_im_im_group_banner_style_1", "", (WMCommonDataInfo.IMDynamicCard) null);
        }
    }
}
