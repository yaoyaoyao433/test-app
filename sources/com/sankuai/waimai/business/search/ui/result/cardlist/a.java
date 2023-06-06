package com.sankuai.waimai.business.search.ui.result.cardlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.common.view.CardTitleView;
import com.sankuai.waimai.business.search.datatype.CardTitle;
import com.sankuai.waimai.business.search.ui.SearchShareData;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.search.ui.result.a<CardTitle> {
    public static ChangeQuickRedirect c;
    protected SearchShareData d;
    private CardTitleView e;

    @Override // com.sankuai.waimai.business.search.ui.result.a
    public final int a() {
        return R.layout.wm_nox_search_cardlist_header;
    }

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1483571fb8ec64a61f549389e38b7c33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1483571fb8ec64a61f549389e38b7c33");
        } else {
            this.d = SearchShareData.a(context);
        }
    }

    @Override // com.sankuai.waimai.business.search.ui.result.a
    public final void a(View view) {
        this.e = (CardTitleView) view;
    }

    @Override // com.sankuai.waimai.business.search.ui.result.a, com.sankuai.waimai.platform.base.a
    public final void a(int i, @NonNull CardTitle cardTitle) {
        Object[] objArr = {Integer.valueOf(i), cardTitle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cad91f932a90841997856c1584c863be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cad91f932a90841997856c1584c863be");
            return;
        }
        super.a(i, (int) cardTitle);
        CardTitleView cardTitleView = this.e;
        String str = cardTitle.mainTitle;
        String str2 = this.d.g;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = CardTitleView.a;
        if (PatchProxy.isSupport(objArr2, cardTitleView, changeQuickRedirect2, false, "a914065543793365907c0b003038729f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cardTitleView, changeQuickRedirect2, false, "a914065543793365907c0b003038729f");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            cardTitleView.b.setText(str);
            cardTitleView.c.setText("");
            cardTitleView.d.setText("");
            cardTitleView.e.setText("");
            cardTitleView.f.setText("");
        } else {
            int indexOf = str.indexOf("<highlight>");
            int length = str.length() - 11;
            if (indexOf == 0) {
                cardTitleView.b.setText("");
                cardTitleView.c.setText(str2);
                cardTitleView.d.setText(str.substring(11));
                cardTitleView.e.setText("“");
                cardTitleView.f.setText("”");
            } else if (indexOf == length) {
                cardTitleView.b.setText(str.substring(0, str.length() - 11));
                cardTitleView.c.setText(str2);
                cardTitleView.d.setText("");
                cardTitleView.e.setText("“");
                cardTitleView.f.setText("”");
            } else if (indexOf > 0) {
                cardTitleView.b.setText(str.substring(0, indexOf));
                cardTitleView.c.setText(str2);
                cardTitleView.d.setText(str.substring(indexOf + 11));
                cardTitleView.e.setText("“");
                cardTitleView.f.setText("”");
            } else {
                cardTitleView.b.setText(str);
                cardTitleView.c.setText("");
                cardTitleView.d.setText("");
                cardTitleView.e.setText("");
                cardTitleView.f.setText("");
            }
        }
    }
}
