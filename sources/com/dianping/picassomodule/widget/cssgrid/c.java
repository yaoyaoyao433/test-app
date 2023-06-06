package com.dianping.picassomodule.widget.cssgrid;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements Cloneable {
    public static ChangeQuickRedirect a;
    public float b;
    public float c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public ArrayList<e> l;
    public ArrayList<i> m;
    public ArrayList<i> n;
    public g o;
    public String[][] p;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b10472fd6987cae672ebcf72f0878b35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b10472fd6987cae672ebcf72f0878b35");
            return;
        }
        this.l = new ArrayList<>();
        this.m = new ArrayList<>();
        this.n = new ArrayList<>();
        this.o = new g();
    }

    public final Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdae0228b25084247522b3d9c756e43f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdae0228b25084247522b3d9c756e43f") : super.clone();
    }
}
