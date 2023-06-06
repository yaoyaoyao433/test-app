package com.sankuai.waimai.store.search.common.view;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends LinearLayout {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private TextView c;
    private Context d;

    public e(Context context, boolean z) {
        super(context);
        Object[] objArr = {context, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a86d577262e259e8137d25c1a74d1511", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a86d577262e259e8137d25c1a74d1511");
            return;
        }
        this.d = context;
        Object[] objArr2 = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "02a8b29d84911e249e1211430a893f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "02a8b29d84911e249e1211430a893f30");
            return;
        }
        View.inflate(this.d, R.layout.wm_sc_nox_search_global_tag_textview, this);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((LinearLayout) findViewById(R.id.takeout_search_tag)).getLayoutParams();
        layoutParams.rightMargin = layoutParams.leftMargin;
        layoutParams.leftMargin = 0;
        this.c = (TextView) findViewById(R.id.takeout_search_tag_text);
        this.b = (ImageView) findViewById(R.id.takeout_search_tag_close);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15003659533ba692490e572251793f59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15003659533ba692490e572251793f59");
        } else {
            this.c.setText(str);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "148819069597e0a9258ae17c0e0b516b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "148819069597e0a9258ae17c0e0b516b");
        } else {
            this.b.setVisibility(8);
        }
    }

    public final String getText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89f9df56ab0e33177ddd8eaecc423105", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89f9df56ab0e33177ddd8eaecc423105") : this.c.getText() != null ? this.c.getText().toString() : "";
    }
}
