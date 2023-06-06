package com.meituan.android.yoda.callbacks;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.android.yoda.interfaces.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a implements h<YodaResult> {
    public static ChangeQuickRedirect a;
    protected String b;

    public abstract FragmentActivity a();

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b637c90056f59f8d71459c75dc9d1c5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b637c90056f59f8d71459c75dc9d1c5c");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.b = str;
        }
    }
}
