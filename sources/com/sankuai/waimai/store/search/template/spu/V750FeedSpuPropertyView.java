package com.sankuai.waimai.store.search.template.spu;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.waimai.store.search.model.RecommendSummary;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class V750FeedSpuPropertyView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private View b;
    private TextView c;

    public V750FeedSpuPropertyView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5af0ce93187864d006dccb24b5167de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5af0ce93187864d006dccb24b5167de");
        }
    }

    public V750FeedSpuPropertyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "686844a16253bce23ed30bc1b4627b84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "686844a16253bce23ed30bc1b4627b84");
        }
    }

    public V750FeedSpuPropertyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea3e7f751542a1ca1f86f6e34416e1a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea3e7f751542a1ca1f86f6e34416e1a7");
        }
    }

    public V750FeedSpuPropertyView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b4ef90e4437429dca9a4ba676b8a465", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b4ef90e4437429dca9a4ba676b8a465");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b238ea6bf8db52fc3675b496b8776a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b238ea6bf8db52fc3675b496b8776a0");
            return;
        }
        super.onFinishInflate();
        this.b = findViewById(R.id.search_result_spu_property_line);
        this.c = (TextView) findViewById(R.id.search_result_spu_property_content);
    }

    public final void a(RecommendSummary.RecommendTag recommendTag, int i) {
        Object[] objArr = {recommendTag, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43f5d4931dc8dcb81016adf09ca6eaa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43f5d4931dc8dcb81016adf09ca6eaa3");
        } else if (recommendTag == null) {
            setVisibility(8);
        } else {
            setVisibility(0);
            if (i == 0) {
                this.b.setVisibility(8);
            } else {
                this.b.setVisibility(0);
            }
            this.c.setText(recommendTag.text);
            this.c.setTextColor(d.a(recommendTag.textColor, 10065812));
            this.c.setBackgroundColor(d.a(recommendTag.backgroundColor, 0));
            this.b.setBackgroundColor(d.a(recommendTag.textColor, 10065812));
        }
    }
}
