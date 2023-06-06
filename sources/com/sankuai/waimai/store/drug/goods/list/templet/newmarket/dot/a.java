package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.dot;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    @NonNull
    public final Context b;
    @NonNull
    public final String c;

    public void a(View view) {
    }

    public abstract void a(@NonNull String str, @NonNull Map<String, Object> map, View view, String str2);

    public a(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac8000901717bffc2b41738f03062aa5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac8000901717bffc2b41738f03062aa5");
            return;
        }
        this.b = context;
        this.c = str;
    }

    public final void a(@NonNull String str, @NonNull Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6228031958b01778f47e7c20aa44723", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6228031958b01778f47e7c20aa44723");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.c, str).b(map).a(AppUtil.generatePageInfoKey(this.b)).a();
        }
    }
}
