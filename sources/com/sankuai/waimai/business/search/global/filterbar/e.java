package com.sankuai.waimai.business.search.global.filterbar;

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
/* loaded from: classes4.dex */
public final class e extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    ImageView b;
    ImageView c;
    TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private boolean h;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    public e(@NonNull Context context, boolean z) {
        super(context);
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdcd643144d0cd4c451b3ac5513d6e01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdcd643144d0cd4c451b3ac5513d6e01");
            return;
        }
        this.h = false;
        this.h = z;
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ac370d203bef44a78d771f4e5bb67f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ac370d203bef44a78d771f4e5bb67f2");
        }
        View inflate = this.z.inflate(this.h ? R.layout.wm_widget_filter_bar_filter_dialog_filter_card_item_sg : R.layout.wm_widget_filter_bar_filter_dialog_filter_card_item, viewGroup, false);
        this.b = (ImageView) inflate.findViewById(R.id.image_filter_item_background);
        this.e = (TextView) inflate.findViewById(R.id.txt_activity_cond);
        this.c = (ImageView) inflate.findViewById(R.id.img_activity_cond);
        this.d = (TextView) inflate.findViewById(R.id.txt_bg_activity_cond);
        this.f = (TextView) inflate.findViewById(R.id.txt_bubble);
        if (this.h) {
            this.g = (TextView) inflate.findViewById(R.id.remark_activity_cond);
        }
        return inflate;
    }

    public final void a(final b.a.C1086a c1086a, final boolean z, a aVar) {
        Object[] objArr = {c1086a, Byte.valueOf(z ? (byte) 1 : (byte) 0), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f38352ab914abf603c0b6ec133f30a69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f38352ab914abf603c0b6ec133f30a69");
            return;
        }
        Object[] objArr2 = {c1086a, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 1, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f55b1f124ac42e0f789e03c980a0c5f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f55b1f124ac42e0f789e03c980a0c5f1");
        } else if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(c1086a)) {
        } else {
            final String str = c1086a.c;
            String str2 = c1086a.e;
            final String str3 = c1086a.b;
            final String str4 = c1086a.d;
            final a aVar2 = new a() { // from class: com.sankuai.waimai.business.search.global.filterbar.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.search.global.filterbar.e.a
                public final void a() {
                    boolean z2 = false;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4b5dac2386b83bc9dc22b2a8784bec3d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4b5dac2386b83bc9dc22b2a8784bec3d");
                        return;
                    }
                    e.this.a(z);
                    e eVar = e.this;
                    if (c1086a.g != null && c1086a.g.a) {
                        z2 = true;
                    }
                    eVar.b(z2);
                    if (r4 != null) {
                        r4.a();
                    }
                }

                @Override // com.sankuai.waimai.business.search.global.filterbar.e.a
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9b4032607a608000c85eed5b8efd2f2d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9b4032607a608000c85eed5b8efd2f2d");
                        return;
                    }
                    e.this.a(false);
                    e.this.b(false);
                    if (r4 != null) {
                        r4.b();
                    }
                }
            };
            Object[] objArr3 = {str2, str3, str4, str, aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "465c5447aaf5f362fbf89f3646724530", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "465c5447aaf5f362fbf89f3646724530");
            } else if (TextUtils.isEmpty(str2)) {
                this.b.setVisibility(8);
                if (TextUtils.isEmpty(str3)) {
                    aVar2.b();
                    return;
                }
                a(str3);
                b(str4);
                a(str, (a) null);
                aVar2.a();
            } else {
                this.b.setVisibility(0);
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = this.y;
                a2.c = str2;
                a2.a((View) this.b).a(new b.a() { // from class: com.sankuai.waimai.business.search.global.filterbar.e.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr4 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cb4350023d130099ef84be0cd019f9b2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cb4350023d130099ef84be0cd019f9b2");
                            return;
                        }
                        e.this.b.setImageBitmap(bitmap);
                        aVar2.a();
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4bc02c5d1cac494eae7f55afaf633c0b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4bc02c5d1cac494eae7f55afaf633c0b");
                            return;
                        }
                        e.this.b.setVisibility(8);
                        e.this.a(str3);
                        e.this.b(str4);
                        e.this.a(str, aVar2);
                    }
                });
            }
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65bbff920dfee81b9cc1a5f9a0184030", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65bbff920dfee81b9cc1a5f9a0184030");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.e.setText(str);
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f0321f897d62d722dfe2bc857e1371d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f0321f897d62d722dfe2bc857e1371d");
        } else if (this.g == null || TextUtils.isEmpty(str)) {
        } else {
            this.g.setText(str);
        }
    }

    public final void a(String str, final a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f20219edf84fe0c5d3f0038fce8478a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f20219edf84fe0c5d3f0038fce8478a9");
        } else if (TextUtils.isEmpty(str)) {
            this.c.setVisibility(8);
            if (aVar != null) {
                aVar.b();
            }
        } else {
            this.c.setVisibility(0);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.y;
            a2.c = str;
            a2.l = true;
            a2.h = new b.c() { // from class: com.sankuai.waimai.business.search.global.filterbar.e.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "040e829add195afa1188ddae9579435c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "040e829add195afa1188ddae9579435c");
                    } else if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.c
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a749ce497d709a22488a881c3987d4a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a749ce497d709a22488a881c3987d4a");
                        return;
                    }
                    e.this.c.setVisibility(8);
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            };
            a2.a(this.c);
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69a452d72ce4b0bf28ac0065d61896d5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69a452d72ce4b0bf28ac0065d61896d5")).booleanValue() : this.d.isSelected();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fc3724fa0467374bb28db0ec80beacf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fc3724fa0467374bb28db0ec80beacf");
            return;
        }
        this.d.setSelected(z);
        this.e.setSelected(z);
        if (z) {
            this.e.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            this.e.setTypeface(Typeface.DEFAULT);
        }
        if (this.h) {
            this.g.setSelected(z);
        }
        this.c.setSelected(z);
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5763f8f0be651d50aa456b85b30542fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5763f8f0be651d50aa456b85b30542fd");
        } else if (z) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
    }
}
