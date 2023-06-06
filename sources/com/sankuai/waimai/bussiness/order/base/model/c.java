package com.sankuai.waimai.bussiness.order.base.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements Serializable {
    public static ChangeQuickRedirect a;
    public String b;
    public ArrayList<a> c;
    public boolean d;
    public String e;
    public int f;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3924ab0401db2c6022f3f15c1becd290", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3924ab0401db2c6022f3f15c1becd290");
            return;
        }
        this.c = new ArrayList<>();
        this.d = true;
        this.f = -1;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a implements Serializable {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public int e;
        public boolean f;
        public String g;
        public String h;
        public int i;
        public int j;
        public String k;

        public a() {
        }

        public final boolean a() {
            return this.j == 1;
        }
    }
}
