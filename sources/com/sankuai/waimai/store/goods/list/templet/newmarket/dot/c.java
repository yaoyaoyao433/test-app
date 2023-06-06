package com.sankuai.waimai.store.goods.list.templet.newmarket.dot;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c {
    public static ChangeQuickRedirect a;
    @NonNull
    public final Context b;
    @NonNull
    public final String c;

    public abstract void a();

    public void a(View view) {
    }

    public abstract void a(@NonNull String str, @Nullable String str2, @NonNull Map<String, Object> map, View view, String str3);

    public abstract void a(@NonNull String str, @NonNull Map<String, Object> map, View view, String str2);

    public abstract void b(@NonNull String str, @NonNull Map<String, Object> map, View view, String str2);

    public c(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a8364de7300b530fa3ac3ab8ade388", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a8364de7300b530fa3ac3ab8ade388");
            return;
        }
        this.b = context;
        this.c = str;
    }

    public final void a(@NonNull String str, @NonNull Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56f13fc28ee68a89e753cdeec01df321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56f13fc28ee68a89e753cdeec01df321");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.c, str).b(map).a(AppUtil.generatePageInfoKey(this.b)).a();
        }
    }
}
