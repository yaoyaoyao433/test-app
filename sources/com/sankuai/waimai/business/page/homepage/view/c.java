package com.sankuai.waimai.business.page.homepage.view;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.support.v4.util.LongSparseArray;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends b<com.sankuai.waimai.business.page.homepage.response.a> {
    public static ChangeQuickRedirect m;
    private int n;
    private Activity o;

    public c(Activity activity, Context context, View view) {
        super(context, view);
        Object[] objArr = {activity, context, view};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b08823962e47e1f106fc7cf3bd603c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b08823962e47e1f106fc7cf3bd603c0");
            return;
        }
        this.o = activity;
        this.g.setBackgroundResource(R.drawable.wm_page_weather_tips_bg_yellow);
        this.b.setBackgroundResource(R.drawable.wm_page_bg_main_order_status_avatar_border);
        this.b.setVisibility(0);
        this.c.setVisibility(8);
        this.f.setImageResource(R.drawable.wm_ic_main_order_status_close);
    }

    @Override // com.sankuai.waimai.business.page.homepage.view.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e25dd6f20bfec57357227028f4fa55a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e25dd6f20bfec57357227028f4fa55a");
        } else if (this.j == 0 || TextUtils.isEmpty(((com.sankuai.waimai.business.page.homepage.response.a) this.j).e)) {
        } else {
            JudasManualManager.a("b_9UfLn").a("c_m84bv26").a(this.i).a("has_message", this.n > 0 ? 1 : 0).a();
            com.sankuai.waimai.platform.domain.manager.user.a.a(this.i, new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.view.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "963f1649539d546ac585254539279de3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "963f1649539d546ac585254539279de3");
                    } else {
                        com.sankuai.waimai.foundation.router.a.a(c.this.i, ((com.sankuai.waimai.business.page.homepage.response.a) c.this.j).e);
                    }
                }
            });
        }
    }

    public final void a(com.sankuai.waimai.business.page.homepage.response.a aVar) {
        Spanned spanned;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "802e483e1f84693e8dbdd2de36a9a090", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "802e483e1f84693e8dbdd2de36a9a090");
        } else if (aVar == 0) {
        } else {
            this.j = aVar;
            b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a.c = aVar.b;
            a.i = R.drawable.wm_page_ic_bottom_status_default;
            a.j = R.drawable.wm_page_ic_bottom_status_default;
            a.a((ImageView) this.b);
            this.d.setVisibility(TextUtils.isEmpty(aVar.c) ? 8 : 0);
            this.d.setText(aVar.c);
            this.e.setVisibility(TextUtils.isEmpty(aVar.d) ? 8 : 0);
            TextView textView = this.e;
            String str = aVar.d;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = m;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92c991f52d48e724f8883ad92f10a00f", RobustBitConfig.DEFAULT_VALUE)) {
                spanned = (CharSequence) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92c991f52d48e724f8883ad92f10a00f");
            } else {
                boolean isEmpty = TextUtils.isEmpty(str);
                spanned = str;
                if (!isEmpty) {
                    spanned = Html.fromHtml(str.replace("<highlight>", "<font color=\"#FB4E44\">").replace("</highlight>", "</font>"));
                }
            }
            textView.setText(spanned);
            if (aVar.f == 1 && aVar.g != 0 && com.sankuai.waimai.imbase.manager.b.a().b()) {
                com.sankuai.waimai.business.im.api.a.a().a(aVar.g, aVar.h, "im-peer", new d.a() { // from class: com.sankuai.waimai.business.page.homepage.view.c.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.imbase.manager.d.a
                    public final void a(int i) {
                        Object[] objArr3 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1c145d4ab738f4ad7f7c58aa35ba8b6c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1c145d4ab738f4ad7f7c58aa35ba8b6c");
                        } else {
                            c.this.a(i);
                        }
                    }
                });
            } else {
                a(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c06f6775d1ba720f29bf972a822fe300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c06f6775d1ba720f29bf972a822fe300");
            return;
        }
        this.n = i;
        if (i <= 0) {
            this.h.setVisibility(8);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            String sb2 = sb.toString();
            this.h.setVisibility(0);
            if (i >= 100) {
                sb2 = "99+";
            }
            this.h.setText(sb2);
        }
        JudasManualManager.b("b_mFNri").a("c_m84bv26").a(this.o).a("has_message", i <= 0 ? 0 : 1).a();
    }

    public final void a(LongSparseArray<Integer> longSparseArray) {
        Object[] objArr = {longSparseArray};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d0be1f34166901b072d8447ac5a02f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d0be1f34166901b072d8447ac5a02f5");
        } else if (this.j == 0) {
        } else {
            com.sankuai.waimai.business.im.api.a.a().a(((com.sankuai.waimai.business.page.homepage.response.a) this.j).g, ((com.sankuai.waimai.business.page.homepage.response.a) this.j).h, "im-peer", new d.a() { // from class: com.sankuai.waimai.business.page.homepage.view.c.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.imbase.manager.d.a
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "599f4150cf821240b0098e42c45437ed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "599f4150cf821240b0098e42c45437ed");
                    } else {
                        c.this.a(i);
                    }
                }
            });
        }
    }
}
