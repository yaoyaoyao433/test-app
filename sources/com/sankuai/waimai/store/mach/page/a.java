package com.sankuai.waimai.store.mach.page;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    final InterfaceC1219a b;
    TextView c;
    View d;
    int e;
    private ImageView f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.mach.page.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1219a {
        void a();
    }

    public a(@NonNull Context context, @NonNull InterfaceC1219a interfaceC1219a) {
        super(context);
        Object[] objArr = {context, interfaceC1219a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e28d8fbf4ecf01a91df21a42fe100018", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e28d8fbf4ecf01a91df21a42fe100018");
        } else {
            this.b = interfaceC1219a;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c573154b47097ad3a486046c76dadaca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c573154b47097ad3a486046c76dadaca");
            return;
        }
        super.onViewCreated();
        this.c = (TextView) findView(R.id.wm_sc_mach_tile_title);
        this.d = findView(R.id.wm_sc_mach_tile_action_bar_bg);
        this.f = (ImageView) findView(R.id.wm_sc_mach_tile_back_button);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.mach.page.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01ca51f93a43d9107173a24ece4466a1", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01ca51f93a43d9107173a24ece4466a1");
                } else {
                    a.this.b.a();
                }
            }
        });
    }
}
