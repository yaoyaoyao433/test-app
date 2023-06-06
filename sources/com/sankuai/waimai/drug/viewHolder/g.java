package com.sankuai.waimai.drug.viewHolder;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.b;
import com.sankuai.waimai.store.util.l;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.z;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;
    final View b;
    final TextView c;
    final TextView d;
    final TextView e;
    final View f;
    final ViewGroup g;

    public g(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae52585c63b21a98cc8eb68a6ad1478", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae52585c63b21a98cc8eb68a6ad1478");
            return;
        }
        this.b = view;
        this.c = (TextView) this.b.findViewById(R.id.update_price_left);
        this.d = (TextView) this.b.findViewById(R.id.update_price_right);
        this.e = (TextView) this.b.findViewById(R.id.update_new_user_tip);
        this.f = this.b.findViewById(R.id.update_price_layout);
        this.g = (ViewGroup) this.b.findViewById(R.id.update_price_detail_layout);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2eefd80c5d8b6f4b6dc07c85ef89c76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2eefd80c5d8b6f4b6dc07c85ef89c76");
        } else {
            this.b.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v3 */
    public void a(@NonNull List<b> list) {
        int i;
        String str;
        char c = 1;
        ?? r10 = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39f04106a78e08c0fcaa1f3156916d21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39f04106a78e08c0fcaa1f3156916d21");
            return;
        }
        this.g.removeAllViews();
        for (b bVar : list) {
            View a2 = z.a(this.g.getContext(), R.layout.wm_drug_shopcart_adapter_food_update_price_item, this.g, r10);
            TextView textView = (TextView) a2.findViewById(R.id.price);
            TextView textView2 = (TextView) a2.findViewById(R.id.price_tag);
            ImageView imageView = (ImageView) a2.findViewById(R.id.member_price_icon);
            String str2 = bVar.e;
            Object[] objArr2 = new Object[2];
            objArr2[r10] = imageView;
            objArr2[c] = str2;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e12c48acf272e89c4f34923422398068", RobustBitConfig.DEFAULT_VALUE)) {
                i = 0;
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e12c48acf272e89c4f34923422398068");
            } else {
                i = 0;
                if (imageView == null || t.a(str2)) {
                    u.c(imageView);
                } else {
                    u.a(imageView);
                    b.C0608b a3 = m.a(str2, ImageQualityUtil.a());
                    a3.b = imageView.getContext();
                    a3.e = 1;
                    a3.a(imageView);
                }
            }
            u.a(textView, bVar.b);
            Object[] objArr3 = new Object[i];
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "ce4729cf2298395e10eda72ab0d876a1", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "ce4729cf2298395e10eda72ab0d876a1");
            } else if (t.a(bVar.c) || t.a(bVar.d)) {
                str = "";
            } else {
                str = bVar.d + "×" + bVar.c;
            }
            u.a(textView2, str);
            this.g.addView(a2);
            c = 1;
            r10 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<b> a(@NonNull b.c cVar, String str, boolean z, int i, boolean z2) {
        String str2;
        Object[] objArr = {cVar, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00f7e90d66e98cd0ccf5dfa286e332c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00f7e90d66e98cd0ccf5dfa286e332c6");
        }
        ArrayList arrayList = new ArrayList();
        if (i <= 1) {
            b bVar = new b();
            bVar.b = cVar.a;
            bVar.e = str;
            arrayList.add(bVar);
            return arrayList;
        } else if (!z) {
            b bVar2 = new b();
            if (z2) {
                str2 = cVar.c;
            } else {
                str2 = cVar.a;
            }
            bVar2.b = str2;
            bVar2.e = z2 ? "" : str;
            arrayList.add(bVar2);
            return arrayList;
        } else if (com.sankuai.shangou.stone.util.a.c(cVar.e) <= 0) {
            return arrayList;
        } else {
            for (b.a aVar : cVar.e) {
                if (aVar != null) {
                    b bVar3 = new b();
                    bVar3.b = z2 ? aVar.e : aVar.a;
                    bVar3.e = z2 ? str : "";
                    bVar3.c = aVar.b;
                    bVar3.d = aVar.d;
                    arrayList.add(bVar3);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        Spanned a;
        Spanned b;

        public a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        String b;
        String c;
        String d;
        String e;

        public b() {
        }
    }

    public static Spanned a(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37e22f05cd8c0bab69c8ae69c18c9616", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spanned) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37e22f05cd8c0bab69c8ae69c18c9616");
        }
        return l.a(str + "<b>" + str2 + "</b>");
    }
}
