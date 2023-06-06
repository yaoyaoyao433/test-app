package com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.dianping.shield.entity.ExposeAction;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.a;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends com.sankuai.waimai.router.core.h {
    public static ChangeQuickRedirect a;
    private com.sankuai.meituan.android.ui.widget.a b;
    private final Handler c;

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        return true;
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33e3365d405a2d7519498497302489a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33e3365d405a2d7519498497302489a2");
        } else {
            this.c = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.g.1
                public static ChangeQuickRedirect a;

                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    Object[] objArr2 = {message};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "413be756b5ef3484e2e72efed086fe59", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "413be756b5ef3484e2e72efed086fe59")).booleanValue();
                    }
                    if (message.what != 100) {
                        return false;
                    }
                    g.this.a();
                    return true;
                }
            });
        }
    }

    void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e46950e908750637f00527b721b945ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e46950e908750637f00527b721b945ba");
        } else if (this.b != null) {
            this.b.b();
            this.b = null;
        }
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull com.sankuai.waimai.router.core.g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3f01a85db891fe27caec03a7e35ece5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3f01a85db891fe27caec03a7e35ece5");
        } else if (jVar.c instanceof Activity) {
            final Activity activity = (Activity) jVar.c;
            Uri parse = Uri.parse(Uri.decode(jVar.d.toString()));
            try {
                int parseInt = NumberUtils.parseInt(parse.getQueryParameter("type"), 0);
                if (parseInt == 0) {
                    String queryParameter = parse.getQueryParameter("title");
                    String queryParameter2 = parse.getQueryParameter("message");
                    String queryParameter3 = parse.getQueryParameter("leftButtonTitle");
                    String queryParameter4 = parse.getQueryParameter("rightButtonTitle");
                    Object[] objArr2 = {queryParameter, queryParameter2, queryParameter3, queryParameter4, activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "795ddde6e3c4e0fea4a26061994703d3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "795ddde6e3c4e0fea4a26061994703d3");
                    } else {
                        new RooAlertDialog.a(new ContextThemeWrapper(activity, 2131558963)).a(queryParameter).b(queryParameter2).b(queryParameter3, (DialogInterface.OnClickListener) null).a(queryParameter4, (DialogInterface.OnClickListener) null).b();
                    }
                } else if (parseInt == 1) {
                    final String queryParameter5 = parse.getQueryParameter("message");
                    int parseInt2 = NumberUtils.parseInt(parse.getQueryParameter("delay"), 0);
                    if (TextUtils.isEmpty(queryParameter5)) {
                        return;
                    }
                    if (parseInt2 > 0) {
                        ad.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.g.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2755f6948d473d2a1987370b45131b99", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2755f6948d473d2a1987370b45131b99");
                                } else {
                                    ae.b(activity, queryParameter5);
                                }
                            }
                        }, parseInt2);
                    } else {
                        ae.b(activity, queryParameter5);
                    }
                } else if (parseInt != 2) {
                    if (parseInt == 3) {
                        String queryParameter6 = parse.getQueryParameter("message");
                        if (TextUtils.isEmpty(queryParameter6)) {
                            a();
                            return;
                        }
                        Object[] objArr3 = {activity, queryParameter6};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7eccf329d39035de1f5b0534b51a3928", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7eccf329d39035de1f5b0534b51a3928");
                            return;
                        }
                        if (this.b == null) {
                            this.b = com.sankuai.meituan.android.ui.widget.a.a(activity, queryParameter6, -1);
                        } else {
                            this.b.a(queryParameter6);
                        }
                        this.b.a();
                        this.c.removeMessages(100);
                        this.c.sendMessageDelayed(Message.obtain(this.c, 100), ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                    }
                } else {
                    String queryParameter7 = parse.getQueryParameter("message");
                    String queryParameter8 = parse.getQueryParameter(RemoteMessageConst.Notification.ICON);
                    if (TextUtils.isEmpty(queryParameter7)) {
                        return;
                    }
                    Object[] objArr4 = {activity, queryParameter7, queryParameter8};
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "e6065884739a75f73983f380f4efbb78", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "e6065884739a75f73983f380f4efbb78");
                    } else if (com.sankuai.waimai.foundation.utils.f.a(activity)) {
                    } else {
                        try {
                            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
                            View inflate = LayoutInflater.from(activity).inflate(R.layout.wm_order_confirm_biggest_discount_tips, viewGroup, false);
                            ((TextView) inflate.findViewById(R.id.anim_text)).setText(com.sankuai.waimai.bussiness.order.detailnew.util.e.a(queryParameter7, "#FF8001"));
                            inflate.setVisibility(8);
                            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                            a2.h = new a.AnonymousClass1(inflate, viewGroup);
                            a2.b = activity;
                            a2.c = queryParameter8;
                            a2.a((ImageView) inflate.findViewById(R.id.anim_icon));
                            viewGroup.addView(inflate);
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
                activity.finish();
            }
        }
    }
}
