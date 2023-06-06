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
import com.sankuai.waimai.store.im.poi.model.ImSGTip;
import com.sankuai.xm.im.message.bean.GeneralMessage;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h implements com.sankuai.waimai.business.im.common.message.d {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fe3228269a8f656afb4cf8b4fabdd3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fe3228269a8f656afb4cf8b4fabdd3a");
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_sc_im_custom_poi_status_message, viewGroup);
        a aVar = new a();
        aVar.a = (TextView) inflate.findViewById(R.id.txt_poi_status_tip);
        inflate.setTag(aVar);
        return inflate;
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faaf2f0bf76bb3f2a0cffc5285d95e4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faaf2f0bf76bb3f2a0cffc5285d95e4d");
        } else if (!(view.getTag() instanceof a) || bVar == null) {
        } else {
            a aVar = (a) view.getTag();
            String str = ImSGTip.convert(bVar.b).tipContent;
            if (!TextUtils.isEmpty(str)) {
                aVar.a.setVisibility(0);
                aVar.a.setText(str);
                return;
            }
            aVar.a.setVisibility(8);
        }
    }
}
