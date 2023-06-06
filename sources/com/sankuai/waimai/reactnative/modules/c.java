package com.sankuai.waimai.reactnative.modules;

import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private View b;
    private TextView c;
    private LayoutInflater d;
    private ViewGroup e;

    public c(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1151233c90e7d5aa9e804da9e8ad85eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1151233c90e7d5aa9e804da9e8ad85eb");
            return;
        }
        this.d = LayoutInflater.from(com.meituan.android.singleton.b.a);
        this.e = viewGroup;
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0340446314b91ddf57883a910910ad41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0340446314b91ddf57883a910910ad41");
            return;
        }
        this.b = this.d.inflate(R.layout.wm_restaurant_local_share_bottom_label_layout, this.e, false);
        this.b.setId(View.generateViewId());
        this.c = (TextView) this.b.findViewById(R.id.local_share_bottom_label_txt);
        this.c.setText(str);
        this.e.addView(this.b);
    }

    public final void a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b21736feb703e2be4750ec36ffdec204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b21736feb703e2be4750ec36ffdec204");
            return;
        }
        for (String str : list) {
            a(str);
        }
    }
}
