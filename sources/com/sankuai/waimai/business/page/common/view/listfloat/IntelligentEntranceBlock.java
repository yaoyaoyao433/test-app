package com.sankuai.waimai.business.page.common.view.listfloat;

import android.app.Activity;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IntelligentEntranceBlock {
    public static ChangeQuickRedirect a;
    public Activity b;
    public View c;
    public com.sankuai.waimai.business.page.common.list.model.c d;
    public RelativeLayout e;
    public ImageView f;
    public e g;
    private String h;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public com.sankuai.waimai.business.page.common.list.model.c a;
    }

    public IntelligentEntranceBlock(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98e5b93457788dc4af0f9ed2d66658e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98e5b93457788dc4af0f9ed2d66658e0");
            return;
        }
        this.b = activity;
        this.h = str;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onIntelligentInfoUpdate(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfd63816f0fbb9168f9e74287ef25c2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfd63816f0fbb9168f9e74287ef25c2e");
        } else if (aVar != null) {
            this.d = aVar.a;
            a();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8db2e1121d0ac33064250f2abd54872f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8db2e1121d0ac33064250f2abd54872f");
        } else if (this.d != null && this.d.a && !TextUtils.isEmpty(this.d.e) && !TextUtils.isEmpty(this.d.f)) {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.b;
            a2.c = this.d.e;
            a2.f = ImageQualityUtil.b();
            a2.i = R.drawable.wm_page_home_intelligent_entrance;
            a2.j = R.drawable.wm_page_home_intelligent_entrance;
            a2.a(this.f);
            if (this.e.getVisibility() != 0) {
                this.e.setVisibility(0);
                JudasManualManager.a a3 = JudasManualManager.b("b_waimai_6wjynbc5_mv").a("c_m84bv26");
                a3.b = this.h;
                a3.a("session_id", Statistics.getSession()).a();
            }
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.common.view.listfloat.IntelligentEntranceBlock.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab4f9d21fc8b0e64060becdf3fb02005", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab4f9d21fc8b0e64060becdf3fb02005");
                        return;
                    }
                    JudasManualManager.a a4 = JudasManualManager.a("b_waimai_6wjynbc5_mc").a("c_m84bv26");
                    a4.b = IntelligentEntranceBlock.this.h;
                    a4.a("session_id", Statistics.getSession()).a();
                    Activity activity = IntelligentEntranceBlock.this.b;
                    com.sankuai.waimai.foundation.router.a.a(activity, IntelligentEntranceBlock.this.d.f + "&session_id=" + Statistics.getSession());
                }
            });
        } else {
            this.e.setVisibility(8);
        }
    }
}
