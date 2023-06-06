package com.sankuai.waimai.store.viewblocks;

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
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.view.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public TextView b;
    private ImageView c;

    public f(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08682bf48549b214e2930e035fdd4703", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08682bf48549b214e2930e035fdd4703");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b3d8fa81dcdfd533d9b02b51264caeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b3d8fa81dcdfd533d9b02b51264caeb");
            return;
        }
        super.onViewCreated();
        this.c = (ImageView) findView(R.id.layout_simple_action_bar_back_image);
        this.c.setImageDrawable(com.sankuai.waimai.store.view.a.a(this.mContext, R.dimen.wm_sc_common_dimen_9, R.dimen.wm_sc_common_dimen_17, R.color.wm_st_common_222426, R.dimen.wm_sc_common_dimen_2, a.EnumC1338a.LEFT));
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.f.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96094c3ed5e6193805a8ba2de6f35815", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96094c3ed5e6193805a8ba2de6f35815");
                } else {
                    ((SCBaseActivity) f.this.getContext()).onBackPressed();
                }
            }
        });
        this.b = (TextView) findView(R.id.layout_simple_action_bar_title);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "208a0473d2ea070fe8780bf75097aa95", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "208a0473d2ea070fe8780bf75097aa95") : super.onCreateView(layoutInflater, viewGroup);
    }
}
