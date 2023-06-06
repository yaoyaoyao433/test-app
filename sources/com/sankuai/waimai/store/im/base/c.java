package com.sankuai.waimai.store.im.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c<T> implements com.sankuai.waimai.business.im.common.message.d {
    public static ChangeQuickRedirect c;
    @Nullable
    protected com.sankuai.waimai.store.expose.v2.a d;
    protected Bundle e;
    protected int f;

    public abstract int a();

    public abstract void a(View view, @NonNull com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, @Nullable T t);

    public c(@Nullable com.sankuai.waimai.store.expose.v2.a aVar, @Nullable Bundle bundle) {
        Object[] objArr = {aVar, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "692e097ef5351e996bb9482cf1f1aee8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "692e097ef5351e996bb9482cf1f1aee8");
            return;
        }
        this.d = aVar;
        this.e = bundle;
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e00cc2ff2c0048f5035f6f50c6d0b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e00cc2ff2c0048f5035f6f50c6d0b9");
        }
        int a = a();
        if (a == 0) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return frameLayout;
        }
        return LayoutInflater.from(context).inflate(a, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.business.im.common.message.d
    public void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8984adcba7abc5d9689d5f4ab681e721", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8984adcba7abc5d9689d5f4ab681e721");
        } else if (bVar == null || bVar.b == null) {
        } else {
            Type genericSuperclass = getClass().getGenericSuperclass();
            ParameterizedType parameterizedType = genericSuperclass instanceof ParameterizedType ? (ParameterizedType) genericSuperclass : null;
            if (parameterizedType != null) {
                a(view, bVar, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) com.sankuai.waimai.store.im.util.b.a(bVar.b, (Class) parameterizedType.getActualTypeArguments()[0]));
                return;
            }
            com.sankuai.waimai.store.im.base.log.b.a("泛型类书写错误getGenericSuperclass为null " + getClass().getName(), bVar.b);
        }
    }
}
