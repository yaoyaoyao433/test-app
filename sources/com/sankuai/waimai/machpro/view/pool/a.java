package com.sankuai.waimai.machpro.view.pool;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    int g;
    int h;
    public Context i;
    public b j;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a859909b22fc4ddce49aa766c35de0a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a859909b22fc4ddce49aa766c35de0a1");
        } else {
            this.i = context;
        }
    }

    public final void a(int i) {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "742f3cb1e8bf9fb25621b1bb02cbc635", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "742f3cb1e8bf9fb25621b1bb02cbc635");
            return;
        }
        this.g++;
        if (this.g > 300) {
            this.g = 300;
        }
    }

    public final void b(int i) {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f34ebfd7db5adfb63436084c15909a03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f34ebfd7db5adfb63436084c15909a03");
            return;
        }
        this.h++;
        if (this.h > 100) {
            this.h = 100;
        }
    }
}
