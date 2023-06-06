package com.sankuai.waimai.machpro.adapter;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.machpro.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1022a {
        int a(Bitmap bitmap);

        void a();

        void a(com.sankuai.waimai.machpro.component.image.a aVar);

        MachMap b(Bitmap bitmap);

        void b(com.sankuai.waimai.machpro.component.image.a aVar);

        void c(com.sankuai.waimai.machpro.component.image.a aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c {
        public int a;
        public int b;
        public int c;
        public int d;
    }

    public abstract void a(b bVar, InterfaceC1022a interfaceC1022a);

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public ImageView b;
        public String c;
        public int d;
        public int[] e;
        public int f;
        public String g;
        public String h;
        public float[] i;
        public String j;
        public int k;
        public int l;
        public c m;
        public boolean n;
        public boolean o;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6bea3d199f911c8f85bd5beef72a182", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6bea3d199f911c8f85bd5beef72a182");
                return;
            }
            this.c = "";
            this.f = -1;
            this.i = new float[8];
        }

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "936074fe7ab54fa7d7e5cf4b7e6027c8", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "936074fe7ab54fa7d7e5cf4b7e6027c8");
            }
            StringBuilder sb = new StringBuilder(this.c);
            for (float f : this.i) {
                sb.append(f);
            }
            sb.append(this.j.toString());
            sb.append(this.l);
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(this.k);
            sb.append(this.n);
            sb.append(this.o);
            return sb.toString();
        }
    }
}
