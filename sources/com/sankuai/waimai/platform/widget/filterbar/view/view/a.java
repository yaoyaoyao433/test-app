package com.sankuai.waimai.platform.widget.filterbar.view.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    ImageView b;
    ImageView c;
    View d;
    private View e;
    private TextView f;
    private View g;
    private View h;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.widget.filterbar.view.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1094a {
        void a();

        void b();
    }

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7564f3b563c2d1e6381a744607657224", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7564f3b563c2d1e6381a744607657224");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d822a91f162794079692802eb5f1b04c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d822a91f162794079692802eb5f1b04c");
        }
        this.e = this.z.inflate(R.layout.wm_widget_filter_bar_fast_filter_item_home, viewGroup, false);
        this.b = (ImageView) this.e.findViewById(R.id.image_filter_item_background);
        this.f = (TextView) this.e.findViewById(R.id.txt_activity_cond);
        this.c = (ImageView) this.e.findViewById(R.id.img_activity_cond);
        this.d = this.e.findViewById(R.id.txt_bg_activity_cond);
        this.g = this.e.findViewById(R.id.txt_bubble);
        this.h = this.e.findViewById(R.id.txt_bubble_copy);
        return this.e;
    }

    public final void a(final b.a.C1086a c1086a, final boolean z, boolean z2, final InterfaceC1094a interfaceC1094a) {
        Object[] objArr = {c1086a, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0, interfaceC1094a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab4582eb8523762ca309900bc61a0d01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab4582eb8523762ca309900bc61a0d01");
        } else if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(c1086a)) {
        } else {
            this.d.setContentDescription(c1086a.b);
            a(c1086a.b, false);
            a(c1086a.e, c1086a.b, "", new InterfaceC1094a() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.a.InterfaceC1094a
                public final void a() {
                    boolean z3 = false;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "180a8dd219d650240c65f47b97c5b63d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "180a8dd219d650240c65f47b97c5b63d");
                        return;
                    }
                    a.this.a(z);
                    if (TextUtils.isEmpty(c1086a.e)) {
                        a aVar = a.this;
                        String str = c1086a.b;
                        if (c1086a.g != null && c1086a.g.a) {
                            z3 = true;
                        }
                        aVar.a(str, z3);
                    } else {
                        a.this.a(c1086a.b, false);
                    }
                    if (interfaceC1094a != null) {
                        interfaceC1094a.a();
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.a.InterfaceC1094a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9375f314c5e5b40e05c5d13f683b6e2d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9375f314c5e5b40e05c5d13f683b6e2d");
                        return;
                    }
                    a.this.a(false);
                    a.this.a(c1086a.b, false);
                    if (interfaceC1094a != null) {
                        interfaceC1094a.b();
                    }
                }
            });
        }
    }

    private void a(String str, final String str2, final String str3, final InterfaceC1094a interfaceC1094a) {
        Object[] objArr = {str, str2, str3, interfaceC1094a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63715f75858b2e0d24e2f7882e67f4f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63715f75858b2e0d24e2f7882e67f4f5");
        } else if (TextUtils.isEmpty(str)) {
            this.b.setVisibility(8);
            this.f.setVisibility(0);
            if (TextUtils.isEmpty(str2)) {
                interfaceC1094a.b();
                return;
            }
            a(str2);
            a(str3, (InterfaceC1094a) null);
            interfaceC1094a.a();
        } else {
            this.b.setVisibility(0);
            this.f.setVisibility(8);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.y;
            a2.c = str;
            a2.a((View) this.b).a(new b.a() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "627b389a49608e96e6b58839695fecd4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "627b389a49608e96e6b58839695fecd4");
                        return;
                    }
                    a.this.b.setImageBitmap(bitmap);
                    interfaceC1094a.a();
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbb14de86a97f1c14f68f1436cbfef73", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbb14de86a97f1c14f68f1436cbfef73");
                        return;
                    }
                    a.this.b.setVisibility(8);
                    a.this.a(str2);
                    a.this.a(str3, interfaceC1094a);
                }
            });
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd4129c2dfddd81b291de1d7916d33e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd4129c2dfddd81b291de1d7916d33e7");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.f.setText(str);
        }
    }

    public final void a(String str, final InterfaceC1094a interfaceC1094a) {
        Object[] objArr = {str, interfaceC1094a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d33e7ef0fe46d0205086cc7e430a680", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d33e7ef0fe46d0205086cc7e430a680");
        } else if (TextUtils.isEmpty(str)) {
            this.c.setVisibility(8);
            if (interfaceC1094a != null) {
                interfaceC1094a.b();
            }
        } else {
            this.c.setVisibility(0);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.y;
            a2.c = str;
            a2.l = true;
            a2.h = new b.c() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29de2e96fa8c3ad03728b9db92e662bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29de2e96fa8c3ad03728b9db92e662bf");
                    } else if (interfaceC1094a != null) {
                        interfaceC1094a.a();
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.c
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3dd90ba250b8cacc8730138cb30949f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3dd90ba250b8cacc8730138cb30949f");
                        return;
                    }
                    a.this.c.setVisibility(8);
                    if (interfaceC1094a != null) {
                        interfaceC1094a.b();
                    }
                }
            };
            a2.a(this.c);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "125b598c0f492fd055e6f51b33980ee1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "125b598c0f492fd055e6f51b33980ee1");
            return;
        }
        this.d.setSelected(z);
        this.f.setSelected(z);
        this.c.setSelected(z);
        this.f.setTypeface(Typeface.defaultFromStyle(z ? 1 : 0));
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df2e45eaa7100c16ebde89de15363b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df2e45eaa7100c16ebde89de15363b7");
        } else if (z) {
            if (!TextUtils.isEmpty(str) && str.length() >= 6) {
                this.h.setVisibility(0);
                this.g.setVisibility(8);
                return;
            }
            this.h.setVisibility(8);
            this.g.setVisibility(0);
        } else {
            this.h.setVisibility(8);
            this.g.setVisibility(8);
        }
    }

    public final void a(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a992356148ace756bbc4009e4aa5c967", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a992356148ace756bbc4009e4aa5c967");
        } else {
            this.d.setOnClickListener(onClickListener);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fcd081e71b933b6bc5f4fd7fcc21162", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fcd081e71b933b6bc5f4fd7fcc21162");
            return;
        }
        this.d.setBackgroundResource(R.drawable.wm_widget_filter_bar_fastfilter_dialog_card_item_background_home_page);
        this.f.setTextColor(this.y.getResources().getColor(R.color.wm_widget_filter_bar_filter_dialog_card_item_text_home_page));
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d122de3feb1c13c184ad98cce643fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d122de3feb1c13c184ad98cce643fc");
        } else {
            this.d.setBackgroundResource(i);
        }
    }
}
