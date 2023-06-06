package com.sankuai.waimai.platform.widget.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b extends RecyclerView.s {
    public static ChangeQuickRedirect f;
    private final f a;
    a g;

    public b(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cc0dc25218deef01454a9e5fe5324cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cc0dc25218deef01454a9e5fe5324cb");
            return;
        }
        this.a = new f() { // from class: com.sankuai.waimai.platform.widget.recycler.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.recycler.f
            public final void a(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75bf7a0019f5cd84f05fe7b8abf09256", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75bf7a0019f5cd84f05fe7b8abf09256");
                } else {
                    b.this.a(view2);
                }
            }
        };
        view.setOnClickListener(this.a);
    }

    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9922d87e9101899b0b0cf1017d951f9", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9922d87e9101899b0b0cf1017d951f9");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a12e8b1ba0581b938145b4f19ecd8f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a12e8b1ba0581b938145b4f19ecd8f3");
        } else if (this.g != null) {
            this.g.a(this, view);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe46215cc4be602bb7e774de27844456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe46215cc4be602bb7e774de27844456");
        } else {
            this.a.d = true;
        }
    }
}
