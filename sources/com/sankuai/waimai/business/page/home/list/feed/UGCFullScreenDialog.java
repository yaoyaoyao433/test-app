package com.sankuai.waimai.business.page.home.list.feed;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.widget.HollowView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class UGCFullScreenDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public boolean b;
    public a c;
    private HollowView d;
    private View e;
    private int f;
    private boolean g;
    private int[] h;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(boolean z);
    }

    public abstract View a(Context context, FrameLayout frameLayout, int[] iArr);

    public int[] a() {
        return null;
    }

    public UGCFullScreenDialog(@NonNull Context context) {
        super(context, 2131558701);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7008019607224613d1703f2ed43c1739", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7008019607224613d1703f2ed43c1739");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9aa3cab6ddab8e13901fd015ba7c65dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9aa3cab6ddab8e13901fd015ba7c65dd");
        } else if (getWindow() != null) {
            getWindow().addFlags(512);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 0;
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b557ff9c65d49d68cd1ffd25e5fbd6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b557ff9c65d49d68cd1ffd25e5fbd6d");
            return;
        }
        this.g = z;
        super.setCanceledOnTouchOutside(z);
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e04a023aaf258f972fb0e894fdb1296e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e04a023aaf258f972fb0e894fdb1296e");
            return;
        }
        Context context = getContext();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4be7bc9934fe710500c26d57074bd03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4be7bc9934fe710500c26d57074bd03");
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.d = new HollowView(context);
            this.f = -1308622848;
            this.f = this.f > 0 ? this.f : -1308622848;
            this.h = a();
            if (this.h != null && this.h.length == 5) {
                this.d.a(this.h[0], this.h[1], this.h[2], this.h[3], this.h[4]);
            }
            this.d.setBackgroundColor(this.f);
            this.d.setClickThroughPoiCircle(true);
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.feed.UGCFullScreenDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "50f26220457c25987b7c450b2550db20", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "50f26220457c25987b7c450b2550db20");
                    } else if (UGCFullScreenDialog.this.g) {
                        if (UGCFullScreenDialog.this.c != null) {
                            UGCFullScreenDialog.this.c.a();
                        }
                        UGCFullScreenDialog.this.dismiss();
                    }
                }
            });
            this.d.setOnHollowClickListener(new HollowView.a() { // from class: com.sankuai.waimai.business.page.home.list.feed.UGCFullScreenDialog.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.page.home.widget.HollowView.a
                public final void a(boolean z) {
                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a02b639990cfc84982cc293d3f46ea01", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a02b639990cfc84982cc293d3f46ea01");
                        return;
                    }
                    if (UGCFullScreenDialog.this.c != null) {
                        UGCFullScreenDialog.this.c.a(z);
                    }
                    UGCFullScreenDialog.this.dismiss();
                }
            });
            frameLayout.addView(this.d, -1, -1);
            this.e = a(context, frameLayout, this.h);
            if (this.e != null) {
                frameLayout.addView(this.e);
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.feed.UGCFullScreenDialog.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a1f66145789017d25088d996a71a38ec", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a1f66145789017d25088d996a71a38ec");
                            return;
                        }
                        if (UGCFullScreenDialog.this.c != null) {
                            a unused = UGCFullScreenDialog.this.c;
                        }
                        if (UGCFullScreenDialog.this.b) {
                            UGCFullScreenDialog.this.dismiss();
                        }
                    }
                });
            }
            setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.sankuai.waimai.business.page.home.list.feed.UGCFullScreenDialog.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    Object[] objArr3 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a972efdd28c3d8a596a85c3ffc211785", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a972efdd28c3d8a596a85c3ffc211785");
                    } else if (UGCFullScreenDialog.this.c != null) {
                        a unused = UGCFullScreenDialog.this.c;
                    }
                }
            });
            setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.business.page.home.list.feed.UGCFullScreenDialog.5
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr3 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d576c603735409d140dc019e4b17aaef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d576c603735409d140dc019e4b17aaef");
                    } else if (UGCFullScreenDialog.this.c != null) {
                        a unused = UGCFullScreenDialog.this.c;
                    }
                }
            });
            setContentView(frameLayout);
        }
        if (this.e != null) {
            super.show();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aa8de7608315e37a0d1714bbf8111c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aa8de7608315e37a0d1714bbf8111c0");
        } else {
            super.dismiss();
        }
    }
}
