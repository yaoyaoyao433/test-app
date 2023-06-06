package com.dianping.shield.dynamic.views;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DMEmptyView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ImageView imageEmpty;
    public TextView textEmpty;

    public DMEmptyView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89414c7f4598861c05e44b9071a41422", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89414c7f4598861c05e44b9071a41422");
        }
    }

    public DMEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bde05445ac48567fb5f8d94613ef7fec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bde05445ac48567fb5f8d94613ef7fec");
            return;
        }
        inflate(context, R.layout.pm_empty_view, this);
        this.imageEmpty = (ImageView) findViewById(R.id.pm_empty_image);
        this.textEmpty = (TextView) findViewById(R.id.pm_empty_text);
        this.textEmpty.setText("您查询的内容为空");
        if (DMUtils.isMT()) {
            this.imageEmpty.setImageResource(R.drawable.pic_empty_state_currency);
        } else {
            this.imageEmpty.setImageResource(R.drawable.pm_dp_empty);
        }
    }

    public void setEmptyText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae32ce9aca32b03f5e25033a2ded341b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae32ce9aca32b03f5e25033a2ded341b");
        } else if (str != null) {
            this.textEmpty.setText(str);
        }
    }
}
