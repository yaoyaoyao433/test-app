package com.sankuai.waimai.business.im.common.message;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k implements d {
    public static ChangeQuickRedirect a;
    private final com.meituan.android.ptcommonim.ptcard.d b;
    private String c;

    public k(@NonNull com.meituan.android.ptcommonim.ptcard.d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4b03f9ad51292e85d2d8453f95cd6e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4b03f9ad51292e85d2d8453f95cd6e8");
            return;
        }
        this.b = dVar;
        this.c = str;
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d761d3c652b98fb5694d1aadafc10f9", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d761d3c652b98fb5694d1aadafc10f9") : this.b.a(context, viewGroup);
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Map<String, Object> hashMap;
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94d10d5594f343b1810b1425d5a5f764", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94d10d5594f343b1810b1425d5a5f764");
            return;
        }
        com.meituan.android.ptcommonim.ptcard.d dVar = this.b;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0dc604b7ed3d944edc8cbc835cdb0dfe", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0dc604b7ed3d944edc8cbc835cdb0dfe");
        } else {
            hashMap = new HashMap<>();
            hashMap.put("real_cid", com.sankuai.waimai.business.im.utils.d.a);
            hashMap.put(Constants.Business.KEY_BU_ID, 1705);
            hashMap.put("user_type", PTIMCommonBean.UserType.TYPE_C);
            hashMap.put("channel_id", Short.valueOf(bVar.b.getChannel()));
            hashMap.put("poi_id", this.c);
        }
        dVar.a(view, bVar, hashMap);
    }
}
