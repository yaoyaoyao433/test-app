package com.sankuai.waimai.business.search.ui.result.guideQuery;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    Context b;
    ViewGroup c;
    View d;
    TextView e;
    RecyclerView f;
    com.sankuai.waimai.business.search.ui.result.guideQuery.a g;
    TextView h;
    TextView i;
    public boolean j;
    ArrayMap<String, String> k;
    public View l;
    a m;
    private int n;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(View view);

        void a(View view, Map<String, String> map, boolean z);
    }

    public static /* synthetic */ void a(b bVar, ArrayMap arrayMap, boolean z) {
        Object[] objArr = {arrayMap, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "1e6dfd7e8752e606b0dd4196d58704bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "1e6dfd7e8752e606b0dd4196d58704bf");
        } else if (bVar.m != null) {
            bVar.m.a(bVar.l, arrayMap, z);
        }
    }

    public b(@NonNull Context context, View view) {
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7e8eef8056eb6a1f05f95991d52e62a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7e8eef8056eb6a1f05f95991d52e62a");
            return;
        }
        this.k = new ArrayMap<>();
        this.b = context;
        this.d = view;
        this.n = g.a(this.b, 5.0f);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d7af83c23026a53330683cb5e3d4261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d7af83c23026a53330683cb5e3d4261");
            return;
        }
        if (this.m != null) {
            this.m.a(this.l);
        }
        this.j = false;
        if (this.c != null) {
            this.c.setVisibility(8);
        }
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6c7f5d6f2cbe29ff39b3604b2756c96", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6c7f5d6f2cbe29ff39b3604b2756c96");
        }
        if (this.e != null) {
            return this.e.getText().toString();
        }
        return null;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbff50168e2611cb25b1cbbc505a8554", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbff50168e2611cb25b1cbbc505a8554");
            return;
        }
        Rect rect = new Rect();
        this.l.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        this.d.getGlobalVisibleRect(rect2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
        marginLayoutParams.topMargin = (rect.bottom + this.n) - rect2.top;
        this.c.setLayoutParams(marginLayoutParams);
    }
}
