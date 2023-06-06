package com.sankuai.waimai.store.im.group.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView c;
    private int d;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65ff54ae2e9e7ee851c984619419b21d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65ff54ae2e9e7ee851c984619419b21d");
        } else {
            this.d = 2;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45ee310a5fd2d23d8f432af911b4f071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45ee310a5fd2d23d8f432af911b4f071");
            return;
        }
        super.onViewCreated();
        this.b = (TextView) this.mView.findViewById(R.id.wm_c_user_group_notice_layout_content);
        this.c = (TextView) this.mView.findViewById(R.id.wm_c_user_group_notice_layout_other);
    }
}
