package com.sankuai.waimai.platform.widget.listforscrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class LinearLayoutForList extends LinearLayout {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.platform.widget.listforscrollview.a b;
    private a c;
    private boolean d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(View view, Object obj, int i);
    }

    public LinearLayoutForList(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac80e45919467d626687bbd7cc1a7559", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac80e45919467d626687bbd7cc1a7559");
        } else {
            this.d = true;
        }
    }

    public LinearLayoutForList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fec58b49ecc0a76af548a33177b5bd1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fec58b49ecc0a76af548a33177b5bd1f");
        } else {
            this.d = true;
        }
    }

    public void setAdapter(com.sankuai.waimai.platform.widget.listforscrollview.a aVar) {
        int size;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f51f15ef0a9d5dc282381648867f832a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f51f15ef0a9d5dc282381648867f832a");
            return;
        }
        this.b = aVar;
        removeAllViews();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4976dbadd01d423c1d176e3ae7a26cc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4976dbadd01d423c1d176e3ae7a26cc0");
        } else if (this.b == null) {
        } else {
            final int i = 0;
            while (true) {
                com.sankuai.waimai.platform.widget.listforscrollview.a aVar2 = this.b;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.widget.listforscrollview.a.g;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "8f7f55d189ddfeae887de870e0cf8d66", RobustBitConfig.DEFAULT_VALUE)) {
                    size = ((Integer) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "8f7f55d189ddfeae887de870e0cf8d66")).intValue();
                } else {
                    size = aVar2.h != null ? aVar2.h.size() : 0;
                }
                if (i >= size) {
                    return;
                }
                View a2 = this.b.a(i);
                final Object b = this.b.b(i);
                if (this.d) {
                    a2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.listforscrollview.LinearLayoutForList.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0301abf652a75bee04542c92e6feb359", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0301abf652a75bee04542c92e6feb359");
                            } else if (LinearLayoutForList.this.c != null) {
                                LinearLayoutForList.this.c.a(view, b, i);
                            }
                        }
                    });
                }
                addView(a2);
                i++;
            }
        }
    }

    public void setOnItemClickListener(a aVar) {
        this.c = aVar;
    }

    public void setItemClickable(boolean z) {
        this.d = z;
    }
}
