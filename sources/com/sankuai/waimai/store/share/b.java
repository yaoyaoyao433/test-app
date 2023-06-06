package com.sankuai.waimai.store.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.waimai.store.share.a;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b extends a {
    public static ChangeQuickRedirect h;
    protected String i;
    protected String j;
    ImageView k;

    @IdRes
    public abstract int a();

    public b(Context context, int i, String str) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8942cbc4f35d936b815e3cef7083f5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8942cbc4f35d936b815e3cef7083f5d");
        } else {
            this.i = str;
        }
    }

    public b(Context context, int i, String str, String str2) {
        super(context, R.layout.wm_sc_goods_detail_share_template);
        Object[] objArr = {context, Integer.valueOf((int) R.layout.wm_sc_goods_detail_share_template), str, str2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a9d9086587fccea4fa1136ec1089fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a9d9086587fccea4fa1136ec1089fa");
            return;
        }
        this.i = str;
        this.j = str2;
    }

    @Override // com.sankuai.waimai.store.share.a
    public void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b00d80978bcaa341967dc064dd561c0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b00d80978bcaa341967dc064dd561c0b");
        } else {
            this.k = (ImageView) view.findViewById(a());
        }
    }

    @Override // com.sankuai.waimai.store.share.a
    public void a(a.InterfaceC1326a interfaceC1326a) {
        Object[] objArr = {interfaceC1326a};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1477aeba5dc410a64dd20a7d550b12b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1477aeba5dc410a64dd20a7d550b12b");
        } else {
            b(interfaceC1326a);
        }
    }

    public final void b(final a.InterfaceC1326a interfaceC1326a) {
        Object[] objArr = {interfaceC1326a};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ba79defc88b1ca61fd1e5f2888a2854", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ba79defc88b1ca61fd1e5f2888a2854");
        } else if (this.k == null || TextUtils.isEmpty(this.i)) {
        } else {
            b.C0608b a = m.a(this.i, ImageQualityUtil.a());
            a.b = this.g;
            a.a(new b.a() { // from class: com.sankuai.waimai.store.share.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7d6e930bc5f8f4bf18167d2d51d650b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7d6e930bc5f8f4bf18167d2d51d650b");
                        return;
                    }
                    b.this.k.setImageBitmap(bitmap);
                    b.super.a(interfaceC1326a);
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7612aaf415d9f2776aec8eb91ee0a077", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7612aaf415d9f2776aec8eb91ee0a077");
                        return;
                    }
                    b.C0608b a2 = m.a("http://p0.meituan.net/scarlett/b7d8b11d06b91fba85acdc49736ef67427247.png");
                    a2.b = b.this.g;
                    a2.a(new b.a() { // from class: com.sankuai.waimai.store.share.b.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr3 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6fd614f13e367d1a884b27a0d3316c64", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6fd614f13e367d1a884b27a0d3316c64");
                                return;
                            }
                            b.this.k.setImageBitmap(bitmap);
                            b.super.a(interfaceC1326a);
                        }
                    });
                }
            }, 1);
        }
    }
}
