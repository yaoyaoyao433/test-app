package com.sankuai.waimai.business.im.common.message;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class f<T> extends l<T> {
    public static ChangeQuickRedirect a;
    protected WMCommonDataInfo.IMDynamicCard b;
    protected com.sankuai.waimai.business.im.common.contract.a c;
    protected String d;

    public f(WMCommonDataInfo.IMDynamicCard iMDynamicCard, com.sankuai.waimai.business.im.common.contract.a aVar, String str) {
        Object[] objArr = {iMDynamicCard, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ed294c4f8467947575db67c0faaf0f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ed294c4f8467947575db67c0faaf0f9");
            return;
        }
        this.b = iMDynamicCard;
        this.c = aVar;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.business.im.common.message.l, com.sankuai.waimai.business.im.common.message.d
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object b;
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32fddfbfdab6a042599b15edd4de63ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32fddfbfdab6a042599b15edd4de63ee");
        } else if (bVar == null || bVar.b == null) {
        } else {
            Type genericSuperclass = getClass().getGenericSuperclass();
            ParameterizedType parameterizedType = genericSuperclass instanceof ParameterizedType ? (ParameterizedType) genericSuperclass : null;
            if (parameterizedType != null) {
                if (this.b != null && this.b.isAnalysisData) {
                    b = com.sankuai.waimai.business.im.common.utils.d.a(bVar.b, (Class) parameterizedType.getActualTypeArguments()[0]);
                } else {
                    b = com.sankuai.waimai.business.im.common.utils.d.b(bVar.b, (Class) parameterizedType.getActualTypeArguments()[0]);
                }
                a(view, bVar, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) b);
            }
        }
    }
}
