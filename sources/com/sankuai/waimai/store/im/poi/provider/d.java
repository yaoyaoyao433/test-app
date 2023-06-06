package com.sankuai.waimai.store.im.poi.provider;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.GeneralMessage;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements com.sankuai.waimai.business.im.common.message.d {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a82baf8457cf2475735933ed4102c1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a82baf8457cf2475735933ed4102c1e");
        }
        TextView textView = new TextView(context);
        int a2 = com.sankuai.waimai.foundation.utils.g.a(context, 5.0f);
        textView.setPadding(a2, a2, a2, a2);
        textView.setText("[消息解析异常，当前版本暂不支持]");
        return textView;
    }
}
