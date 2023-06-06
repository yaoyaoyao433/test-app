package com.sankuai.waimai.store.search.template.guesslike;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RecommendHeadLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    TextView b;
    TextView c;
    String d;
    String e;

    public RecommendHeadLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05f75d6365a84ab3621e51252d77639b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05f75d6365a84ab3621e51252d77639b");
        } else {
            a();
        }
    }

    public RecommendHeadLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d021c865fe8b2d21cf6488b67fd8122", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d021c865fe8b2d21cf6488b67fd8122");
        } else {
            a();
        }
    }

    public RecommendHeadLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "681917c75f2b2e5c4e9ec8a602b859b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "681917c75f2b2e5c4e9ec8a602b859b9");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ad8ad80d218deb13378fefd05fc2dce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ad8ad80d218deb13378fefd05fc2dce");
        } else {
            setBackgroundColor(getResources().getColor(R.color.wm_sc_nox_search_list_recommend_head));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19b8e9eb45fe724f9ad1cf542e63f46f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19b8e9eb45fe724f9ad1cf542e63f46f");
            return;
        }
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.global_list_header_txt_tv_b);
        this.c = (TextView) findViewById(R.id.tv_recommend_head_subTitle);
    }

    public String getDesc() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b6d4c7b5d93bffb6ecddd8a46ece3a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b6d4c7b5d93bffb6ecddd8a46ece3a0");
        }
        if (TextUtils.isEmpty(this.d)) {
            return "";
        }
        String str = "1-" + this.d;
        if (TextUtils.isEmpty(this.e)) {
            return str;
        }
        return str + ",2-" + this.e;
    }
}
