package com.sankuai.waimai.store.widgets.filterbar.sortlist.item.two;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
    private ImageView h;
    private ImageView i;

    public a(@NonNull Context context, b bVar) {
        super(context, bVar);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "445924ba9000c61ed288dfe51ec2d077", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "445924ba9000c61ed288dfe51ec2d077");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "786d75507ca5d968c3079aed32f0fee1", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "786d75507ca5d968c3079aed32f0fee1") : layoutInflater.inflate(R.layout.wm_sc_common_sort_style_two, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "733f4d79e16b0d79ad4307f2ed6a795b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "733f4d79e16b0d79ad4307f2ed6a795b");
            return;
        }
        super.onViewCreated();
        this.g = (TextView) findView(R.id.tv_sort_text);
        this.g.setTextSize(0, a());
        this.h = (ImageView) findView(R.id.iv_sort_up);
        this.i = (ImageView) findView(R.id.iv_sort_down);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.widgets.filterbar.sortlist.item.two.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ac40d5a0e8d6d2876a805a4b98dcde7", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ac40d5a0e8d6d2876a805a4b98dcde7");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f062fbfe8fd13a47afd805b6800bd0c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f062fbfe8fd13a47afd805b6800bd0c3");
            return;
        }
        this.g.setText(str);
        a(this.g, i >= 0);
        if (i == 0) {
            this.h.setSelected(true);
            this.i.setSelected(false);
        } else if (i == 1) {
            this.h.setSelected(false);
            this.i.setSelected(true);
        } else {
            this.h.setSelected(false);
            this.i.setSelected(false);
        }
    }

    private void a(TextView textView, boolean z) {
        Object[] objArr = {textView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fd35e3103d3caec0f8d6f3677abc606", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fd35e3103d3caec0f8d6f3677abc606");
            return;
        }
        textView.setTextColor(a(z));
        textView.getPaint().setFakeBoldText(z);
    }
}
