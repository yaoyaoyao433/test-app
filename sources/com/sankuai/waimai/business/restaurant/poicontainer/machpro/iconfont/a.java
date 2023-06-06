package com.sankuai.waimai.business.restaurant.poicontainer.machpro.iconfont;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.util.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends MPComponent<RooIconFont> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ RooIconFont createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbab48960c283bc0006e427f10065f6c", RobustBitConfig.DEFAULT_VALUE) ? (RooIconFont) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbab48960c283bc0006e427f10065f6c") : new RooIconFont(this.mMachContext.getContext());
    }

    public a(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d24bd29b714029cffcb2e1a99a4899a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d24bd29b714029cffcb2e1a99a4899a");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93a55527f4c066dc8f129cc4fb3ac2fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93a55527f4c066dc8f129cc4fb3ac2fb");
            return;
        }
        super.updateAttribute(str, obj);
        String a2 = b.a(obj, "");
        Context context = getView().getContext();
        if ("text".equalsIgnoreCase(str)) {
            ((RooIconFont) this.mView).setText(context.getResources().getIdentifier(a2, "string", context.getPackageName()));
            requestLayout();
        } else if ("text-size".equalsIgnoreCase(str)) {
            ((RooIconFont) this.mView).setTextSize(0, b.a(obj));
            requestLayout();
        } else if ("text-color".equalsIgnoreCase(str)) {
            ((RooIconFont) this.mView).setTextColor(b.a(b.a(obj, ""), -16777216));
        }
    }
}
