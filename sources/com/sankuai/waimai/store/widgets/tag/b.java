package com.sankuai.waimai.store.widgets.tag;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b extends com.sankuai.waimai.platform.widget.tag.b {
    public static ChangeQuickRedirect c;
    public static final int[] d = new int[2];
    public g e;
    private int[] f;
    private int g;

    public abstract int[] b(Context context, int i);

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdf69746dad491788d425f813c62b1c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdf69746dad491788d425f813c62b1c6");
        } else {
            this.f = d;
        }
    }

    @NonNull
    public final int[] a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e1d2eaac9e7c8e315057772675252c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e1d2eaac9e7c8e315057772675252c5");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a71ca03cb74a6b486bf27ad35e86eeb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a71ca03cb74a6b486bf27ad35e86eeb4");
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
