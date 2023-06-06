package com.meituan.msc.mmpviews.perflist.node;

import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public ThemedReactContext d;
    public String e;
    public JSONObject f;
    public Object g;
    public JSONObject h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public List<a> n;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1efeed4022e713b5d9f776105bbb0767", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1efeed4022e713b5d9f776105bbb0767");
        } else {
            this.n = new ArrayList();
        }
    }

    public final a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4416800a3bc5d52f8a21557f01f3069b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4416800a3bc5d52f8a21557f01f3069b");
        }
        a aVar = new a();
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.l;
        aVar.m = this.m;
        aVar.n = new ArrayList();
        for (int i = 0; i < this.n.size(); i++) {
            aVar.n.add(this.n.get(i).a());
        }
        return aVar;
    }
}
