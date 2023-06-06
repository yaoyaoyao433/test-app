package com.sankuai.waimai.store.widgets.filterbar.sortlist.item.one;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.widgets.filterbar.sortlist.item.a {
    public static ChangeQuickRedirect f;
    private TextView g;

    public a(@NonNull Context context, b bVar) {
        super(context, bVar);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f040482cac6dda4d8c71e2f316002da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f040482cac6dda4d8c71e2f316002da");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "135b5fb6ca9be50ed89c088062cfb0c2", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "135b5fb6ca9be50ed89c088062cfb0c2") : layoutInflater.inflate(R.layout.wm_sc_common_sort_style_one, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed6adaf7eb3a7912707ece954d7a15f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed6adaf7eb3a7912707ece954d7a15f4");
            return;
        }
        super.onViewCreated();
        this.g = (TextView) findView(R.id.tv_sort_text);
        this.g.setTextSize(0, a());
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.sortlist.item.one.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3590dd98be3a3016bc553be4ec64831b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3590dd98be3a3016bc553be4ec64831b");
                } else {
                    a.this.b.a();
                }
            }
        });
        a(this.g, false);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.item.c.b
    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e82d90a8ef4855898d4643f70728ac5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e82d90a8ef4855898d4643f70728ac5");
            return;
        }
        this.g.setText(str);
        a(this.g, i >= 0);
    }

    private void a(TextView textView, boolean z) {
        Object[] objArr = {textView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3955d496403a00f9b57ed470ab8f846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3955d496403a00f9b57ed470ab8f846");
            return;
        }
        textView.setTextColor(a(z));
        textView.getPaint().setFakeBoldText(z);
    }
}
