package com.sankuai.waimai.platform.widget.filterbar.view.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
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
public final class c extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    ImageView b;
    TextView c;
    ImageView d;
    TextView e;
    private TextView f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();
    }

    public c(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19cacae0e19aa230cd6abfa268271c64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19cacae0e19aa230cd6abfa268271c64");
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "990245fce3c0e8bc87198a51aae59e77", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "990245fce3c0e8bc87198a51aae59e77");
        }
        View inflate = this.z.inflate(R.layout.wm_widget_filter_bar_filter_dialog_filter_card_item_home, viewGroup, false);
        this.b = (ImageView) inflate.findViewById(R.id.image_filter_item_background);
        this.c = (TextView) inflate.findViewById(R.id.txt_activity_cond);
        this.d = (ImageView) inflate.findViewById(R.id.img_activity_cond);
        this.e = (TextView) inflate.findViewById(R.id.txt_bg_activity_cond);
        this.f = (TextView) inflate.findViewById(R.id.txt_bubble);
        ViewCompat.setAccessibilityDelegate(this.e, new AccessibilityDelegateCompat() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.FilterItemCardViewBlockHome$1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                Object[] objArr2 = {view, accessibilityNodeInfoCompat};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7632d27e1fdcc547e1cf6ef1222c2dc2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7632d27e1fdcc547e1cf6ef1222c2dc2");
                    return;
                }
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                if (c.this.e.isSelected()) {
                    return;
                }
                accessibilityNodeInfoCompat.setContentDescription(((Object) c.this.c.getText()) + "未选中");
            }
        });
        return inflate;
    }

    public final void a(final b.a.C1086a c1086a, final boolean z, a aVar) {
        Object[] objArr = {c1086a, Byte.valueOf(z ? (byte) 1 : (byte) 0), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cb8ccfee5ae0bda68edd26979dad8de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cb8ccfee5ae0bda68edd26979dad8de");
            return;
        }
        Object[] objArr2 = {c1086a, Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 1, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1f265df06677fec5c4a33fd3ee7e40e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1f265df06677fec5c4a33fd3ee7e40e");
        } else if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(c1086a)) {
        } else {
            final String str = c1086a.c;
            this.e.setContentDescription(c1086a.b);
            String str2 = c1086a.e;
            final String str3 = c1086a.b;
            final a aVar2 = new a() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.c.a
                public final void a() {
                    boolean z2 = false;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c8a26ce3478ef18e6f95247c20a8c81c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c8a26ce3478ef18e6f95247c20a8c81c");
                        return;
                    }
                    c.this.a(z);
                    c cVar = c.this;
                    if (c1086a.g != null && c1086a.g.a) {
                        z2 = true;
                    }
                    cVar.b(z2);
                    if (r4 != null) {
                        r4.a();
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.c.a
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ef99da818d2897e17a5e9a1f05e140e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ef99da818d2897e17a5e9a1f05e140e3");
                        return;
                    }
                    c.this.a(false);
                    c.this.b(false);
                    if (r4 != null) {
                        r4.b();
                    }
                }
            };
            Object[] objArr3 = {str2, str3, str, aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c2bd5593f372018ece59f6c01ac8d8c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c2bd5593f372018ece59f6c01ac8d8c6");
            } else if (TextUtils.isEmpty(str2)) {
                this.b.setVisibility(8);
                if (TextUtils.isEmpty(str3)) {
                    aVar2.b();
                    return;
                }
                a(str3);
                a(str, (a) null);
                aVar2.a();
            } else {
                this.b.setVisibility(0);
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = this.y;
                a2.c = str2;
                a2.a((View) this.b).a(new b.a() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.c.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr4 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "02b769160edce12268c518574669b023", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "02b769160edce12268c518574669b023");
                            return;
                        }
                        c.this.b.setImageBitmap(bitmap);
                        aVar2.a();
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2583c191bfa5815b64e1385f2003f5db", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2583c191bfa5815b64e1385f2003f5db");
                            return;
                        }
                        c.this.b.setVisibility(8);
                        c.this.a(str3);
                        c.this.a(str, aVar2);
                    }
                });
            }
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a3231f794583a8ad9fc437a943e9920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a3231f794583a8ad9fc437a943e9920");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.c.setText(str);
        }
    }

    public final void a(String str, final a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bc2a2f5232d68204028e190c108986b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bc2a2f5232d68204028e190c108986b");
        } else if (TextUtils.isEmpty(str)) {
            this.d.setVisibility(8);
            if (aVar != null) {
                aVar.b();
            }
        } else {
            this.d.setVisibility(0);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.y;
            a2.c = str;
            a2.l = true;
            a2.h = new b.c() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.c.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d02824edcf386f0bd45f7092770f3a98", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d02824edcf386f0bd45f7092770f3a98");
                    } else if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.c
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25e8cf8786d0a7b625046ce28998f684", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25e8cf8786d0a7b625046ce28998f684");
                        return;
                    }
                    c.this.d.setVisibility(8);
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            };
            a2.a(this.d);
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea00bd329765a4d2be2ed9f9a6b64439", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea00bd329765a4d2be2ed9f9a6b64439")).booleanValue() : this.e.isSelected();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "028aee38a1b982b6f44576b65930b357", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "028aee38a1b982b6f44576b65930b357");
            return;
        }
        this.e.setSelected(z);
        this.c.setSelected(z);
        if (z) {
            this.c.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            this.c.setTypeface(Typeface.DEFAULT);
        }
        this.d.setSelected(z);
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e5195af0e1f9e215697376e7b56622a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e5195af0e1f9e215697376e7b56622a");
        } else if (z) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
    }
}
