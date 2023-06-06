package com.sankuai.waimai.business.im.chatpage;

import android.os.Bundle;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.xm.imui.session.SessionFragment;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class BasePvChatFragment extends SessionFragment {
    public static ChangeQuickRedirect h;
    protected String i;
    protected int j;

    public abstract int e();

    public boolean g() {
        return true;
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, com.sankuai.xm.imui.base.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0706877e2f1fa38f6334d49d1649304a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0706877e2f1fa38f6334d49d1649304a");
            return;
        }
        super.onCreate(bundle);
        this.i = AppUtil.generatePageInfoKey(this);
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b6b301dba124dff442c294136aa8ca1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b6b301dba124dff442c294136aa8ca1");
            return;
        }
        super.onResume();
        if (g()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd1226935d18970bf0a574803beebc21", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd1226935d18970bf0a574803beebc21");
                return;
            }
            d.a aVar = new d.a();
            a(aVar);
            Statistics.getChannel("waimai").writePageView(this.i, com.sankuai.waimai.business.im.utils.d.a, aVar.a());
        }
    }

    @Override // com.sankuai.xm.imui.session.SessionFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb602040f020091b50822a7fbf730c06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb602040f020091b50822a7fbf730c06");
            return;
        }
        super.onPause();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6afca5f097232d1a7f753575b650c69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6afca5f097232d1a7f753575b650c69");
        } else {
            Statistics.getChannel("waimai").writePageDisappear(this.i, com.sankuai.waimai.business.im.utils.d.a, null);
        }
    }

    public void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea514e52c471aa75ad40407762370a78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea514e52c471aa75ad40407762370a78");
            return;
        }
        aVar.a("receive_user_type", Integer.valueOf(com.sankuai.waimai.business.im.utils.c.a(e())));
        if (this.j == 100) {
            aVar.a("i_source", 1);
        } else if (this.j == 2 || this.j == 3) {
            aVar.a("i_source", Integer.valueOf(this.j));
        } else {
            aVar.a("i_source", 0);
        }
    }
}
