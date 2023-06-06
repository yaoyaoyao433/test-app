package com.sankuai.waimai.store.order.prescription.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.store.order.prescription.model.b;
import com.sankuai.waimai.store.router.d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    private TextView e;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_sc_order_detail_drug_protocal_view;
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f34b0854b46c11f0e7b7e68aad22a25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f34b0854b46c11f0e7b7e68aad22a25");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35f2d6175c5e98c2ad5883d4a0484b45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35f2d6175c5e98c2ad5883d4a0484b45");
            return;
        }
        super.b();
        this.e = (TextView) this.b.findViewById(R.id.protocal_tips);
    }

    public final void a(@NonNull b.a aVar) {
        SpannableString spannableString;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d00f9a97f6f80e8885dc169615a21b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d00f9a97f6f80e8885dc169615a21b");
            return;
        }
        b.C1254b c1254b = (b.C1254b) com.sankuai.shangou.stone.util.a.a((List<Object>) aVar.a, 0);
        if (c1254b != null && !t.a(c1254b.a)) {
            String str = c1254b.a;
            final Context context = this.c;
            final List<String> list = c1254b.b;
            Object[] objArr2 = {context, str, "<highlight>", "</highlight>", list};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.order.detail.manager.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6a84ea3300d96fc552405b8e52246f90", RobustBitConfig.DEFAULT_VALUE)) {
                spannableString = (SpannableString) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6a84ea3300d96fc552405b8e52246f90");
            } else {
                String replace = str.replace("<highlight>", "").replace("</highlight>", "");
                ArrayList<String> b = com.sankuai.waimai.store.order.detail.manager.a.b(str, "<highlight>(.*?)</highlight>");
                final int a = ColorUtils.a("#FF8000", (int) SupportMenu.CATEGORY_MASK);
                SpannableString spannableString2 = new SpannableString(replace);
                if (list != null && list.size() == b.size()) {
                    String str2 = str;
                    for (final int i = 0; i < b.size(); i++) {
                        String str3 = b.get(i);
                        String str4 = "<highlight>" + str3 + "</highlight>";
                        int indexOf = str2.indexOf(str4);
                        if (indexOf > 0) {
                            str2 = str2.replaceFirst(str4, "");
                            spannableString2.setSpan(new ClickableSpan() { // from class: com.sankuai.waimai.store.order.detail.manager.a.3
                                public static ChangeQuickRedirect a;

                                @Override // android.text.style.ClickableSpan
                                public final void onClick(View view) {
                                    Object[] objArr3 = {view};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb94ace0c443b1e5c127989043f31708", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb94ace0c443b1e5c127989043f31708");
                                        return;
                                    }
                                    String str5 = (String) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
                                    if (aa.a(str5)) {
                                        return;
                                    }
                                    d.a(context, str5);
                                }

                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                public final void updateDrawState(@NonNull TextPaint textPaint) {
                                    Object[] objArr3 = {textPaint};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e02ac11cd0999162f49c3cdc41110ed2", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e02ac11cd0999162f49c3cdc41110ed2");
                                        return;
                                    }
                                    super.updateDrawState(textPaint);
                                    textPaint.setColor(a);
                                    textPaint.setUnderlineText(false);
                                }
                            }, indexOf, str3.length() + indexOf, 33);
                        }
                    }
                }
                spannableString = spannableString2;
            }
            if (spannableString.length() > 0) {
                this.b.setVisibility(0);
                this.e.setText(spannableString);
                this.e.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            this.b.setVisibility(8);
            return;
        }
        this.b.setVisibility(8);
    }
}
