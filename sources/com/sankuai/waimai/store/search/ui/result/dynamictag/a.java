package com.sankuai.waimai.store.search.ui.result.dynamictag;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends com.sankuai.waimai.platform.widget.tag.b {
    public static ChangeQuickRedirect c;
    public static final int[] d = new int[2];
    public g e;
    private int[] f;
    private int g;

    public abstract int[] b(Context context, int i);

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45734ea02b509ea3805a409ad36492be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45734ea02b509ea3805a409ad36492be");
        } else {
            this.f = d;
        }
    }

    @NonNull
    public final int[] a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ad773f817e0c3983cdb15cccbc1cec0", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ad773f817e0c3983cdb15cccbc1cec0");
        }
        if (this.f == null || i != this.g) {
            this.f = b(context, i);
            this.g = i;
        }
        if (this.f == null) {
            this.f = d;
        }
        return this.f;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab7168cbf4c64e0b85fb1db54aea078b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab7168cbf4c64e0b85fb1db54aea078b");
            return;
        }
        if (this.e != null) {
            this.e.c();
            this.e = null;
        }
        this.f = d;
        this.g = 0;
    }
}
