package com.sankuai.waimai.platform.widget.common;

import android.content.Context;
import android.support.annotation.LayoutRes;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class h<T> extends f<T> {
    public static ChangeQuickRedirect h;
    protected int i;

    public abstract void a(b bVar, T t, int i);

    public h(Context context, @LayoutRes int i, List<T> list) {
        super(context, list);
        Object[] objArr = {context, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22d4a6a1c156681cebdb8bdd6e53923b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22d4a6a1c156681cebdb8bdd6e53923b");
            return;
        }
        this.i = i;
        a(new d<T>() { // from class: com.sankuai.waimai.platform.widget.common.h.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.common.d
            public final boolean a(T t, int i2) {
                return true;
            }

            @Override // com.sankuai.waimai.platform.widget.common.d
            public final int a() {
                return h.this.i;
            }

            @Override // com.sankuai.waimai.platform.widget.common.d
            public final void a(b bVar, T t, int i2) {
                Object[] objArr2 = {bVar, t, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e82350f391345835cf7e7b8b5e689b92", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e82350f391345835cf7e7b8b5e689b92");
                } else {
                    h.this.a(bVar, t, i2);
                }
            }
        });
    }
}
