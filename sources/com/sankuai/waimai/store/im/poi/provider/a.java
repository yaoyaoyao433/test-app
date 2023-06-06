package com.sankuai.waimai.store.im.poi.provider;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.poi.model.SGCommonDataInfo;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> extends com.sankuai.waimai.store.im.base.c<T> {
    public static ChangeQuickRedirect a;
    protected com.sankuai.waimai.store.im.poi.contract.a b;
    protected SGCommonDataInfo.IMDynamicCard g;

    public a(@Nullable com.sankuai.waimai.store.expose.v2.a aVar, @Nullable Bundle bundle, com.sankuai.waimai.store.im.poi.contract.a aVar2, SGCommonDataInfo.IMDynamicCard iMDynamicCard) {
        super(aVar, bundle);
        Object[] objArr = {aVar, bundle, aVar2, iMDynamicCard};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aca3fabdc4f28a623c7ed18df813dd2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aca3fabdc4f28a623c7ed18df813dd2");
            return;
        }
        this.b = aVar2;
        this.g = iMDynamicCard;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.store.im.base.c, com.sankuai.waimai.business.im.common.message.d
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object b;
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bda8155e8f9782a7633ac25133dbc47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bda8155e8f9782a7633ac25133dbc47");
        } else if (bVar == null || bVar.b == null) {
        } else {
            Type genericSuperclass = getClass().getGenericSuperclass();
            ParameterizedType parameterizedType = genericSuperclass instanceof ParameterizedType ? (ParameterizedType) genericSuperclass : null;
            if (parameterizedType != null) {
                if (this.g != null && this.g.isAnalysisData) {
                    b = com.sankuai.waimai.store.im.util.b.a(bVar.b, (Class) parameterizedType.getActualTypeArguments()[0]);
                } else {
                    b = com.sankuai.waimai.store.im.util.b.b(bVar.b, (Class) parameterizedType.getActualTypeArguments()[0]);
                }
                a(view, bVar, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) b);
                return;
            }
            com.sankuai.waimai.store.im.base.log.b.a("泛型类书写错误getGenericSuperclass为null " + getClass().getName(), bVar.b);
        }
    }
}
