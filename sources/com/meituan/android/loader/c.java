package com.meituan.android.loader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public List<String> b;
    public List<String> c;
    public List<String> d;
    public List<String> e;

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c6e8a166ef679819010bc3d89bdb877", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c6e8a166ef679819010bc3d89bdb877");
        }
        StringBuilder sb = new StringBuilder("DynParams{soFileParams=");
        sb.append(this.b != null ? Arrays.toString(this.b.toArray()) : "");
        sb.append(", assetsFileParams=");
        sb.append(this.c != null ? Arrays.toString(this.c.toArray()) : "");
        sb.append(", soUnzipWhiteList=");
        sb.append(this.d != null ? Arrays.toString(this.d.toArray()) : "");
        sb.append(", assetsUnzipWhiteList=");
        sb.append(this.e != null ? Arrays.toString(this.e.toArray()) : "");
        sb.append('}');
        return sb.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public c b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d366efc4f48fb3829a6c8e07bcfae0e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d366efc4f48fb3829a6c8e07bcfae0e");
            } else {
                this.b = new c();
            }
        }

        public final a a(List<String> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f33a9209e447071244d599df770b6242", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f33a9209e447071244d599df770b6242");
            }
            this.b.b = list;
            return this;
        }
    }
}
