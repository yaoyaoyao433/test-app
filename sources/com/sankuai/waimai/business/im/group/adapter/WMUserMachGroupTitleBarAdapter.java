package com.sankuai.waimai.business.im.group.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
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
import com.sankuai.xm.imui.common.view.titlebar.DefaultTitleBarAdapter;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMUserMachGroupTitleBarAdapter extends DefaultTitleBarAdapter {
    public static ChangeQuickRedirect a;
    protected com.sankuai.waimai.business.im.common.contract.a b;
    private final String o;
    private final String p;
    private final String q;
    private View r;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public c a;
        public FrameLayout b;
    }

    public WMUserMachGroupTitleBarAdapter(com.sankuai.waimai.business.im.common.contract.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e34444bbc0d2e95670cb223364cfc5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e34444bbc0d2e95670cb223364cfc5c");
            return;
        }
        this.o = "waimai_im_im_group_title_style_1";
        this.p = "waimai_im_mach";
        this.q = "c_waimai_reae8s5i";
        this.b = aVar;
    }

    @Override // com.sankuai.xm.imui.common.view.titlebar.DefaultTitleBarAdapter, com.sankuai.xm.imui.common.view.titlebar.BaseTitleBarAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce59c999246e8e789b13a41328929b82", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce59c999246e8e789b13a41328929b82");
        }
        this.r = LayoutInflater.from(context).inflate(R.layout.wm_im_comon_mach_adapter, viewGroup, true);
        a aVar = new a();
        aVar.b = (FrameLayout) this.r.findViewById(R.id.framelayout);
        c cVar = new c(context, this.b, "c_waimai_reae8s5i");
        cVar.a((ViewGroup) this.r.findViewById(R.id.framelayout));
        aVar.a = cVar;
        this.r.setTag(aVar);
        return this.r;
    }

    public final void a(g gVar) {
        String str;
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01c51a833fde8d08e185e54b0299809d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01c51a833fde8d08e185e54b0299809d");
        } else if (gVar != null) {
            j jVar = new j();
            jVar.b = "waimai_im_im_group_title_style_1";
            jVar.e = b.a(b.a().toJson(gVar));
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("env", f.b());
            Activity activity = this.d;
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d282892dcb5ca7068c9280c0e9663123", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d282892dcb5ca7068c9280c0e9663123");
            } else {
                ABStrategy strategy = ABTestManager.getInstance(activity).getStrategy("wm_im_group_setting", null);
                str = strategy != null ? strategy.expName : "";
            }
            hashMap2.put("strategy", str);
            hashMap.put("h5_strategy", hashMap2);
            jVar.e.putAll(hashMap);
            jVar.d = "";
            jVar.c = "waimai_im_mach";
            ((a) this.r.getTag()).a.a(jVar, "waimai_im_im_group_title_style_1", "", (WMCommonDataInfo.IMDynamicCard) null);
        }
    }
}
