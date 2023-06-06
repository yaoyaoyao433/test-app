package com.sankuai.waimai.reactnative.modules;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.platform.widget.AutoWrapHorizontalLayout;
import com.sankuai.waimai.reactnative.modules.a;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a {
    public static ChangeQuickRedirect h;
    ImageView i;
    private AutoWrapHorizontalLayout j;

    public b(Activity activity, String str) {
        super(str);
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba8fd02ce54c6f7031d95d765acac776", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba8fd02ce54c6f7031d95d765acac776");
            return;
        }
        this.b = activity.getLayoutInflater().inflate(R.layout.wm_restaurant_add_friend_share_layout, (ViewGroup) null);
        this.i = (ImageView) this.b.findViewById(R.id.local_share_bg);
        this.j = (AutoWrapHorizontalLayout) this.b.findViewById(R.id.local_share_bottom_label_layout);
    }

    public final void a(final Context context, ShareTip shareTip, ArrayList<String> arrayList, ArrayList<String> arrayList2, final a.InterfaceC1117a interfaceC1117a) {
        char c;
        Object[] objArr = {context, shareTip, arrayList, arrayList2, interfaceC1117a};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2425482ae07e4b9043c7feaeee9e6f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2425482ae07e4b9043c7feaeee9e6f9");
            return;
        }
        a();
        this.b.setVisibility(0);
        String icon = shareTip.getIcon();
        Object[] objArr2 = {context, icon, interfaceC1117a};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "459c8a02f65b8c4d9de0cb0973ab4d57", RobustBitConfig.DEFAULT_VALUE)) {
            c = 0;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "459c8a02f65b8c4d9de0cb0973ab4d57");
        } else {
            c = 0;
            a(icon);
            b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a.c = icon;
            a.b = context;
            a.a(new b.a() { // from class: com.sankuai.waimai.reactnative.modules.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr3 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "952f43f5e0d77ccdbd7ea1ca5b1626b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "952f43f5e0d77ccdbd7ea1ca5b1626b8");
                        return;
                    }
                    b.this.i.setImageBitmap(bitmap);
                    b.this.b();
                    if (interfaceC1117a != null) {
                        l.b(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.b.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c078c4d12293819370eca93a2a1a1bbd", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c078c4d12293819370eca93a2a1a1bbd");
                                } else {
                                    interfaceC1117a.a(true);
                                }
                            }
                        }, (String) null);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b22bf1120181b264afb9d598dc352341", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b22bf1120181b264afb9d598dc352341");
                        return;
                    }
                    b.this.i.setImageBitmap(com.sankuai.waimai.launcher.util.image.a.a(context.getResources(), (int) R.drawable.wm_restaurant_share_default_bg));
                    b.this.b();
                    if (interfaceC1117a != null) {
                        l.b(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.b.1.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c3ce1521362af2859d08a3a39a4b5610", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c3ce1521362af2859d08a3a39a4b5610");
                                } else {
                                    interfaceC1117a.a(false);
                                }
                            }
                        }, (String) null);
                    }
                }
            });
        }
        Object[] objArr3 = new Object[2];
        objArr3[c] = arrayList2;
        objArr3[1] = arrayList;
        ChangeQuickRedirect changeQuickRedirect3 = h;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5238fcefaf22b08b3d165af3a4ba8ff1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5238fcefaf22b08b3d165af3a4ba8ff1");
        } else if (com.sankuai.waimai.foundation.utils.b.b(arrayList2) && com.sankuai.waimai.foundation.utils.b.b(arrayList)) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
            this.j.removeAllViews();
            if (!com.sankuai.waimai.foundation.utils.b.b(arrayList2)) {
                new c(this.j).a(arrayList2);
            }
            if (com.sankuai.waimai.foundation.utils.b.b(arrayList)) {
                return;
            }
            new c(this.j).a(arrayList);
        }
    }
}
