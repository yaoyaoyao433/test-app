package com.sankuai.waimai.business.im.common.message;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class l<T> implements d {
    public static ChangeQuickRedirect j;

    public abstract void a(View view, @NonNull com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, @Nullable T t);

    @Override // com.sankuai.waimai.business.im.common.message.d
    public View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da13c8e977b061164f9794ebf6086ee8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da13c8e977b061164f9794ebf6086ee8") : LayoutInflater.from(context).inflate(R.layout.wm_im_comon_mach_card, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.business.im.common.message.d
    public void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1a0333e840f52810ec5e8e8f068431e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1a0333e840f52810ec5e8e8f068431e");
        } else if (bVar == null || bVar.b == null) {
        } else {
            Type genericSuperclass = getClass().getGenericSuperclass();
            ParameterizedType parameterizedType = genericSuperclass instanceof ParameterizedType ? (ParameterizedType) genericSuperclass : null;
            if (parameterizedType != null) {
                a(view, bVar, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) com.sankuai.waimai.business.im.common.utils.d.a(bVar.b, (Class) parameterizedType.getActualTypeArguments()[0]));
            }
        }
    }
}
