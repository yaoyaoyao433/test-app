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
public final class c extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    TextView b;
    TextView c;
    b d;

    public c(@NonNull Context context, b bVar) {
        super(context);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b61dcc3fb82925b8287238e402aa2936", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b61dcc3fb82925b8287238e402aa2936");
        } else {
            this.d = bVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b2601fdb1d154a36babb386d6e31f3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b2601fdb1d154a36babb386d6e31f3b");
            return;
        }
        super.onViewCreated();
        this.b = (TextView) findView(R.id.tv_patchwork_tip);
        this.c = (TextView) findView(R.id.tv_activity_detail);
        findView(R.id.iv_close).setOnClickListener(new a());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b43041f4d82e0055930a30f2d29c69cc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b43041f4d82e0055930a30f2d29c69cc");
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7953050e3203991d0b64dc6ddbd25c", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7953050e3203991d0b64dc6ddbd25c");
            } else if (c.this.d != null) {
                c.this.d.a(view);
            }
        }
    }
}
