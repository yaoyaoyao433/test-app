package com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.PrivacyService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a<PrivacyService> {
    public static ChangeQuickRedirect o;
    public long p;
    public String q;
    public c r;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7626f36735c7cb3be8c4af26fdc68777", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7626f36735c7cb3be8c4af26fdc68777");
            return;
        }
        this.p = -1L;
        this.r = new c();
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9156693567832523a56db4b6109c221b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9156693567832523a56db4b6109c221b");
            return;
        }
        super.d();
        this.r.a = this.p;
        this.r.b = this.q;
        if (this.c != 0) {
            this.r.c = ((PrivacyService) this.c).privacy_selected == 1;
            this.r.d = ((PrivacyService) this.c).show == 1;
            this.r.e = ((PrivacyService) this.c).privacy_title;
            this.r.f = ((PrivacyService) this.c).privacy_icon;
            this.r.g = ((PrivacyService) this.c).privacy_explain_url;
            this.r.h = ((PrivacyService) this.c).privacy_open_desc;
            this.r.i = ((PrivacyService) this.c).privacy_open_guide_desc;
            this.r.j = ((PrivacyService) this.c).privacy_close_desc;
            this.r.k = ((PrivacyService) this.c).privacy_close_snd_desc;
            this.r.l = ((PrivacyService) this.c).privacy_open_snd_desc;
            this.r.m = ((PrivacyService) this.c).privacy_new_feature__guide_desc;
            return;
        }
        this.r.c = false;
        this.r.d = false;
        this.r.e = null;
        this.r.f = null;
        this.r.g = null;
        this.r.h = null;
        this.r.i = null;
        this.r.j = null;
        this.r.k = null;
        this.r.l = null;
        this.r.m = null;
    }
}
