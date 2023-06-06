package com.sankuai.waimai.store.search.common.view;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.GlobalSearchExtraInfo;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.net.URLEncoder;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    View b;
    public GlobalSearchExtraInfo c;
    int d;
    private TextView e;
    private TextView f;
    private String g;
    private SearchShareData h;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be01f2a8b9447b325937a521d39ebfe9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be01f2a8b9447b325937a521d39ebfe9");
        } else {
            this.d = 0;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "304e4ed190c7f6e863469b59ec80e8c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "304e4ed190c7f6e863469b59ec80e8c3");
            return;
        }
        super.onViewCreated();
        this.b = findView(R.id.ll_feedback_bubble_container);
        this.e = (TextView) findView(R.id.feedback_bubble_title);
        this.f = (TextView) findView(R.id.feedback_bubble_subtitle);
        setVisible(false);
        getView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.common.view.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0852e8348d62733e1b22c2a3c2fd7d1b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0852e8348d62733e1b22c2a3c2fd7d1b");
                } else if (a.this.c == null || TextUtils.isEmpty(a.this.c.getFeedbackUrl())) {
                } else {
                    com.sankuai.waimai.store.router.d.a(a.this.getContext(), a.this.a(a.this.c.getFeedbackUrl()));
                    a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "5fd5181cadea19e36e3686e8e14d4389", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "5fd5181cadea19e36e3686e8e14d4389");
                    } else {
                        com.sankuai.waimai.store.manager.judas.b.a(aVar.getContext(), "b_waimai_sg_ft17ekm5_mc").a("search_log_id", aVar.b().q).a("cat_id", Integer.valueOf(aVar.b().z)).a("stid", g.f(aVar.b())).a("keyword", aVar.b().h).a("entry_type", Integer.valueOf(aVar.d)).a();
                    }
                }
            }
        });
    }

    String a(@NonNull String str) {
        String sb;
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e54c5a96fe2feb81bf9e25eaa078e07", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e54c5a96fe2feb81bf9e25eaa078e07");
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("inner_url");
            String encode = URLEncoder.encode(queryParameter, "utf-8");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0e4fe480a9dcbd8f6cc5f922a71a67a", RobustBitConfig.DEFAULT_VALUE)) {
                sb = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0e4fe480a9dcbd8f6cc5f922a71a67a");
            } else {
                StringBuilder sb2 = new StringBuilder();
                String f = g.f(b());
                sb2.append("stid=");
                sb2.append(f);
                sb2.append("&entry_type");
                sb2.append("=");
                sb2.append(this.d);
                sb2.append("&sceneId");
                sb2.append("=");
                sb2.append(this.g);
                sb = sb2.toString();
            }
            if (queryParameter.indexOf(CommonConstant.Symbol.QUESTION_MARK, queryParameter.indexOf(CommonConstant.Symbol.COLON)) > 0) {
                str2 = queryParameter + "&" + sb;
            } else {
                str2 = queryParameter + CommonConstant.Symbol.QUESTION_MARK + sb;
            }
            return str.replace(encode, URLEncoder.encode(str2, "utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.search.common.view.a.a():void");
    }

    SearchShareData b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2cdc408a8d0c306fd6a042b67844026", RobustBitConfig.DEFAULT_VALUE)) {
            return (SearchShareData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2cdc408a8d0c306fd6a042b67844026");
        }
        if (this.h == null) {
            this.h = (SearchShareData) com.sankuai.waimai.modular.eventbus.sharedata.a.a(getContext(), SearchShareData.class);
        }
        return this.h;
    }

    public final void a(int i, String str) {
        this.d = i;
        this.g = str;
    }

    public boolean a(GlobalSearchExtraInfo globalSearchExtraInfo) {
        Object[] objArr = {globalSearchExtraInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e5f7f08a96b95230f2ee2785a49bf7e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e5f7f08a96b95230f2ee2785a49bf7e")).booleanValue() : globalSearchExtraInfo == null || TextUtils.isEmpty(globalSearchExtraInfo.getFeedbackUrl()) || globalSearchExtraInfo.getQuestionnaireConfig() == null || globalSearchExtraInfo.getQuestionnaireScene() == null;
    }
}
