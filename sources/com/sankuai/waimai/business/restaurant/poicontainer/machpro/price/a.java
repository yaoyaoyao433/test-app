package com.sankuai.waimai.business.restaurant.poicontainer.machpro.price;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.pricegroup.RooPriceGroup;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.util.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends MPComponent<RooPriceGroup> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ RooPriceGroup createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a5361b8872b65fddd31d46257ccec1f", RobustBitConfig.DEFAULT_VALUE)) {
            return (RooPriceGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a5361b8872b65fddd31d46257ccec1f");
        }
        RooPriceGroup rooPriceGroup = new RooPriceGroup(this.mMachContext.getContext());
        rooPriceGroup.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        rooPriceGroup.setDiscountPriceTextSize(g.d(this.mMachContext.getContext(), 18.0f));
        rooPriceGroup.setOriginPriceTextSize(g.d(this.mMachContext.getContext(), 11.0f));
        return rooPriceGroup;
    }

    public a(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4381ec2db4b50efbc7b11649ff70971", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4381ec2db4b50efbc7b11649ff70971");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e45181f0950b665a681718d2a36b62d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e45181f0950b665a681718d2a36b62d");
            return;
        }
        super.updateAttribute(str, obj);
        if ("discountprice".equalsIgnoreCase(str)) {
            ((RooPriceGroup) this.mView).setDiscountPrice(Float.parseFloat(b.a(obj, "")));
        } else if ("originprice".equalsIgnoreCase(str)) {
            float parseFloat = Float.parseFloat(b.a(obj, ""));
            ((RooPriceGroup) this.mView).setOriginPrice(parseFloat);
            ((RooPriceGroup) this.mView).setOriginPrice(parseFloat);
        } else if ("originprice-visible".equalsIgnoreCase(str)) {
            ((RooPriceGroup) this.mView).setOriginPriceVisibility(Boolean.parseBoolean(b.a(obj, "")) ? 0 : 8);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((RooPriceGroup) this.mView).getLayoutParams();
        marginLayoutParams.width = -2;
        marginLayoutParams.height = -2;
        ((RooPriceGroup) this.mView).setLayoutParams(marginLayoutParams);
        requestLayout();
    }
}
