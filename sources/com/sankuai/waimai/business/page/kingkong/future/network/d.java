package com.sankuai.waimai.business.page.kingkong.future.network;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.rocks.page.tablist.rocklist.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements com.sankuai.waimai.rocks.page.tablist.rocklist.b {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.business.page.kingkong.a b;
    b.a c;
    private Context d;
    private com.sankuai.waimai.platform.widget.emptylayout.d e;
    private String f;
    private ViewGroup g;

    public d(Context context, com.sankuai.waimai.business.page.kingkong.a aVar, boolean z) {
        Object[] objArr = {context, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51e6dba0b2135127bd6f148162216a19", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51e6dba0b2135127bd6f148162216a19");
            return;
        }
        this.f = "";
        this.d = context;
        this.g = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.wm_common_layout_refresh_info, (ViewGroup) null);
        if (!z) {
            this.g.setBackground(null);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = g.a(com.meituan.android.singleton.b.a, 5.0f);
        this.g.setLayoutParams(layoutParams);
        this.g.setMinimumHeight(g.c(com.meituan.android.singleton.b.a) / 2);
        this.e = new com.sankuai.waimai.platform.widget.emptylayout.d(this.g, R.id.layout_info, R.layout.skeleton_kingkong_area_layout);
        this.e.c(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.kingkong.future.network.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a912ec1cbeefa1ca96ebe69e43c3ab5", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a912ec1cbeefa1ca96ebe69e43c3ab5");
                } else if (d.this.c != null) {
                    d.this.c.a();
                }
            }
        });
        this.e.a("c_i5kxn8l");
        this.b = aVar;
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ac425f58df020596f2ad417e34bc3e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ac425f58df020596f2ad417e34bc3e7");
        } else {
            this.e.d();
        }
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0d1cf29a9df33ae2efc6b0e2e9e4992", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0d1cf29a9df33ae2efc6b0e2e9e4992");
        } else {
            this.e.h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r18.equals("EMPTY_DATA") != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r17, java.lang.String r18, com.sankuai.waimai.rocks.page.tablist.rocklist.b.a r19) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.kingkong.future.network.d.a(java.lang.String, java.lang.String, com.sankuai.waimai.rocks.page.tablist.rocklist.b$a):void");
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.b
    public final ViewGroup b() {
        return this.g;
    }
}
