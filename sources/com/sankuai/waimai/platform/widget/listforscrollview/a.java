package com.sankuai.waimai.platform.widget.listforscrollview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    public static ChangeQuickRedirect g;
    private Context a;
    List h;

    public abstract View a(int i);

    public a(Context context, List list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e961dd5fce2eb4fbce11a40f7d25331", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e961dd5fce2eb4fbce11a40f7d25331");
            return;
        }
        this.a = context;
        this.h = list;
    }

    public final LayoutInflater a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be3a7b2bee5021d3c08941bfc663ce6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (LayoutInflater) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be3a7b2bee5021d3c08941bfc663ce6a");
        }
        if (this.a != null) {
            return LayoutInflater.from(this.a);
        }
        return null;
    }

    public final Object b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21ced0c4c2d124646a2a289157d30690", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21ced0c4c2d124646a2a289157d30690");
        }
        if (this.h != null) {
            return this.h.get(i);
        }
        return null;
    }
}
