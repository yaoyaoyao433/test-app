package com.sankuai.waimai.store.im.poi.provider;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.poi.model.SGGeneralMessagData;
import com.sankuai.waimai.store.im.poi.model.SGGeneralTip;
import com.sankuai.xm.im.message.bean.GeneralMessage;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l implements com.sankuai.waimai.business.im.common.message.d {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public TextView a;
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a1248c5166255078ecc404254e25df", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a1248c5166255078ecc404254e25df");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_sc_im_custom_general_tip_message, viewGroup);
        a aVar = new a();
        aVar.a = (TextView) inflate.findViewById(R.id.txt_tip);
        inflate.setTag(aVar);
        return inflate;
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4bea3c52b96eb175832c413883d901c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4bea3c52b96eb175832c413883d901c");
        } else if (!(view.getTag() instanceof a) || bVar == null) {
        } else {
            a aVar = (a) view.getTag();
            SGGeneralTip sGGeneralTip = (SGGeneralTip) new SGGeneralMessagData().getData(bVar.b, SGGeneralTip.class);
            if (sGGeneralTip == null) {
                return;
            }
            String str = sGGeneralTip.tipContent;
            if (!TextUtils.isEmpty(str)) {
                aVar.a.setVisibility(0);
                aVar.a.setText(str);
                return;
            }
            aVar.a.setVisibility(8);
        }
    }
}
