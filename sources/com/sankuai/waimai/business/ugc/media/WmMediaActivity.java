package com.sankuai.waimai.business.ugc.media;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.framework.BaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmMediaActivity extends BaseActivity {
    public static ChangeQuickRedirect a;
    private a d;

    @Override // com.sankuai.waimai.ugc.creator.framework.BaseActivity
    public final com.sankuai.waimai.ugc.creator.framework.b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ca0330ed59bc2a43cff5681d7be9dba", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.ugc.creator.framework.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ca0330ed59bc2a43cff5681d7be9dba");
        }
        this.d = new a();
        return this.d;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acf58ed5dd6421a94753d242aa2b049f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acf58ed5dd6421a94753d242aa2b049f");
        } else {
            this.d.a(i);
        }
    }
}
