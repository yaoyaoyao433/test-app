package com.sankuai.waimai.business.page.kingkong.view.servicelabels;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    ImageView[] e;
    TextView[] f;
    int[] g;
    private View h;
    private int[] i;
    private boolean j;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_page_kingkong_header_service;
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82fe965d5ff28398d9cf11fb6658803d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82fe965d5ff28398d9cf11fb6658803d");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce5064c98b167811839082fde1212c9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce5064c98b167811839082fde1212c9f");
            return;
        }
        super.b();
        this.h = this.b;
        this.g = new int[]{R.id.img_service1, R.id.img_service2, R.id.img_service3};
        this.i = new int[]{R.id.txt_service1, R.id.txt_service2, R.id.txt_service3};
        this.e = new ImageView[this.g.length];
        this.f = new TextView[this.g.length];
        for (int i = 0; i < this.g.length; i++) {
            this.e[i] = (ImageView) this.h.findViewById(this.g[i]);
            this.f[i] = (TextView) this.h.findViewById(this.i[i]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b26bb154c213ecac0f1a844b5982c189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b26bb154c213ecac0f1a844b5982c189");
            return;
        }
        this.j = z;
        this.h.setVisibility(z ? 0 : 8);
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95aa54500dc62d7415fc93e2866f871d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95aa54500dc62d7415fc93e2866f871d")).intValue() : this.h.getHeight();
    }
}
