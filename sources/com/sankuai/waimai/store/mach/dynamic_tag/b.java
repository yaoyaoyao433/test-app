package com.sankuai.waimai.store.mach.dynamic_tag;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f31748ff29c50b80de4b3bec114d61f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f31748ff29c50b80de4b3bec114d61f");
        } else {
            this.f = d;
        }
    }

    @NonNull
    public final int[] a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5c4e95081df38a5a5c96edf664d1fc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5c4e95081df38a5a5c96edf664d1fc5");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d64a3e396de046f724230a5610a29a6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d64a3e396de046f724230a5610a29a6a");
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
