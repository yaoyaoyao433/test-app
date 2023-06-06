package com.sankuai.waimai.bussiness.order.base.widget.extendlist;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.StatisticsListView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ExtendListView extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public ListView b;
    public View c;
    public StatisticsListView d;
    public c e;
    public d f;
    public int g;
    public int h;
    public int i;
    private Context j;
    private e k;
    private float l;

    public static /* synthetic */ void f(ExtendListView extendListView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, extendListView, changeQuickRedirect, false, "2eddc3949028840fb69a06ba1848b438", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, extendListView, changeQuickRedirect, false, "2eddc3949028840fb69a06ba1848b438");
        } else if (extendListView.k != null) {
            extendListView.k.a(extendListView.g, extendListView.h);
        }
    }

    public ExtendListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e85aa45ee4b86ccc5e6e6f2c97b9418f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e85aa45ee4b86ccc5e6e6f2c97b9418f");
            return;
        }
        this.g = 0;
        this.h = -1;
        this.i = 0;
        this.l = 0.0f;
        this.j = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.firstWidth, R.attr.firstWidthPercent});
        this.l = obtainStyledAttributes.getDimension(0, g.a(context, 102.0f));
        float f = obtainStyledAttributes.getFloat(1, -1.0f);
        if (f > 0.0f && f < 1.0f) {
            this.l = com.sankuai.waimai.platform.b.A().l() * f;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ece682a99e59b7f1bc9753ce282d7074", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ece682a99e59b7f1bc9753ce282d7074");
            return;
        }
        super.onFinishInflate();
        LayoutInflater.from(this.j).inflate(R.layout.wm_order_base_layout_extend_listview, (ViewGroup) this, true);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d4aa4c852e1f477401a578cb87855c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d4aa4c852e1f477401a578cb87855c0");
            return;
        }
        this.b = (ListView) findViewById(R.id.first_listView);
        this.c = findViewById(R.id.first_listView_bg);
        if (this.b.getLayoutParams() != null) {
            this.b.getLayoutParams().width = (int) this.l;
        }
        if (this.c.getLayoutParams() != null) {
            this.c.getLayoutParams().width = (int) this.l;
        }
        this.d = (StatisticsListView) findViewById(R.id.sub_listView);
    }

    public void setExtendOnItemClickListener(e eVar) {
        this.k = eVar;
    }
}
