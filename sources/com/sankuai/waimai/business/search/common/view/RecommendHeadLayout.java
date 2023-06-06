package com.sankuai.waimai.business.search.common.view;

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
/* loaded from: classes4.dex */
public class RecommendHeadLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView c;
    private String d;
    private String e;

    public RecommendHeadLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c40a18a3eff5e80ec5af813c5c42e78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c40a18a3eff5e80ec5af813c5c42e78");
        } else {
            a();
        }
    }

    public RecommendHeadLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "503b961ee457251e1ae958efcd3a71f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "503b961ee457251e1ae958efcd3a71f9");
        } else {
            a();
        }
    }

    public RecommendHeadLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da679bc6b769e27d5e2caebcdaf24949", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da679bc6b769e27d5e2caebcdaf24949");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8ea28132232986037c5444e16852a79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8ea28132232986037c5444e16852a79");
        } else {
            setBackgroundColor(getResources().getColor(R.color.wm_nox_search_list_recommend_head));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a5ff51db65a8a54b3955a566678863", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a5ff51db65a8a54b3955a566678863");
            return;
        }
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.global_list_header_txt_tv_b);
        this.c = (TextView) findViewById(R.id.tv_recommend_head_subTitle);
    }

    public String getDesc() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "161c8bf6ef0b139e36e8f46318033174", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "161c8bf6ef0b139e36e8f46318033174");
        }
        StringBuilder sb = new StringBuilder("1-");
        sb.append(this.d == null ? "" : this.d);
        sb.append(",2-");
        sb.append(this.e == null ? "" : this.e);
        return sb.toString();
    }

    public void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "907ecddcd006d01160af962843072033", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "907ecddcd006d01160af962843072033");
            return;
        }
        this.d = str;
        if (TextUtils.isEmpty(str)) {
            this.b.setVisibility(8);
            return;
        }
        this.b.setVisibility(0);
        this.b.setText(str);
    }

    public void setSubtitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b93e7eeb56718faef8db98693adce72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b93e7eeb56718faef8db98693adce72");
            return;
        }
        this.e = str;
        if (!TextUtils.isEmpty(str)) {
            this.c.setVisibility(0);
            this.c.setText(str);
            return;
        }
        this.c.setVisibility(8);
    }
}
