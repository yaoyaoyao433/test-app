package com.sankuai.waimai.platform.widget.tag.model;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b extends com.sankuai.waimai.platform.widget.tag.b {
    public static ChangeQuickRedirect k;
    public static final int[] m = new int[2];
    private int c;
    public int[] l;
    public com.sankuai.waimai.platform.widget.tag.virtualview.render.g n;

    public abstract int[] b(Context context, int i);

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb0c8ee5dbc3dfa34c0f6f23e73942ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb0c8ee5dbc3dfa34c0f6f23e73942ba");
        } else {
            this.l = m;
        }
    }

    @NonNull
    public final int[] a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eb18f20a5ef35d062b71387675bfa73", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eb18f20a5ef35d062b71387675bfa73");
        }
        if (this.l == null || i != this.c) {
            this.l = b(context, i);
            this.c = i;
        }
        if (this.l == null) {
            this.l = m;
        }
        return this.l;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a5d37360c87d60a4ead289d5f621d0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a5d37360c87d60a4ead289d5f621d0f");
            return;
        }
        if (this.n != null) {
            this.n.c();
            this.n = null;
        }
        this.l = m;
        this.c = 0;
    }
}
