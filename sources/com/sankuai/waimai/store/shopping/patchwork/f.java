package com.sankuai.waimai.store.shopping.patchwork;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    TextView b;
    TextView c;
    TextView d;
    b e;

    public f(@NonNull Context context, b bVar) {
        super(context);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b15c362655bfedc3e2166ce93ebf0e26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b15c362655bfedc3e2166ce93ebf0e26");
        } else {
            this.e = bVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "024d9ff367ce0b226b9bd422c3a3d26e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "024d9ff367ce0b226b9bd422c3a3d26e");
            return;
        }
        super.onViewCreated();
        this.b = (TextView) findView(R.id.tv_patchwork_tip);
        this.c = (TextView) findView(R.id.iv_activity_icon);
        this.d = (TextView) findView(R.id.tv_activity_detail);
        findView(R.id.iv_close).setOnClickListener(new a());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a implements View.OnClickListener {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {f.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b4f041e982b29932f11f03f6e6e70d4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b4f041e982b29932f11f03f6e6e70d4");
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "609a04af4bad67314edd193e78c5e443", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "609a04af4bad67314edd193e78c5e443");
            } else if (f.this.e != null) {
                f.this.e.a(view);
            }
        }
    }
}
