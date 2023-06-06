package com.sankuai.waimai.business.address.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public boolean b;
    public Context c;
    private InterfaceC0726a d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.address.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0726a {
        void a();

        void b();
    }

    public a(Context context, InterfaceC0726a interfaceC0726a) {
        Object[] objArr = {context, interfaceC0726a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2025c9102c7a6484bc19adbc7c9bc73d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2025c9102c7a6484bc19adbc7c9bc73d");
            return;
        }
        this.b = false;
        this.c = context;
        this.d = interfaceC0726a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63dc4c10dc16475dd977f7e114e237c5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63dc4c10dc16475dd977f7e114e237c5");
            return;
        }
        if (this.b) {
            this.d.b();
        } else {
            this.d.a();
            JudasManualManager.a("b_KFMEs").a();
        }
        this.b = !this.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b {
        public TextView a;
        public ImageView b;

        public b() {
        }
    }
}
