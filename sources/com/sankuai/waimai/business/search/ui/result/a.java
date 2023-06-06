package com.sankuai.waimai.business.search.ui.result;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a<T> extends com.sankuai.waimai.platform.base.a<T, Nullable> {
    public static ChangeQuickRedirect a;
    protected View b;

    public abstract int a();

    @Override // com.sankuai.waimai.platform.base.a
    public void a(int i, @NonNull T t) {
    }

    public abstract void a(View view);

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53aba0836eaad93be15f0b917dbd1024", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53aba0836eaad93be15f0b917dbd1024");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90edae6abcbfe57e185a0ed912827e82", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90edae6abcbfe57e185a0ed912827e82");
        }
        this.b = layoutInflater.inflate(a(), viewGroup, false);
        a(this.b);
        return this.b;
    }
}
