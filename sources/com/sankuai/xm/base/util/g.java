package com.sankuai.xm.base.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.support.constraint.R;
import android.support.v7.app.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.ui.DownToUpSlideDialog;
import com.sankuai.xm.base.util.b;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static <T extends Dialog> T a(T t, Context context) {
        Object[] objArr = {t, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbfb6e893f00385a8852fe91110256ac", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbfb6e893f00385a8852fe91110256ac");
        }
        com.sankuai.xm.base.lifecycle.d.a(context, new com.sankuai.xm.base.lifecycle.c<Dialog>(t) { // from class: com.sankuai.xm.base.util.g.1
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.lifecycle.c, com.sankuai.xm.base.lifecycle.b
            public final void d(Context context2) {
                Object[] objArr2 = {context2};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af003e4846a9442dffe3294f98f1d343", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af003e4846a9442dffe3294f98f1d343");
                    return;
                }
                super.d(context2);
                Dialog dialog = (Dialog) this.b;
                if (dialog == null || !dialog.isShowing()) {
                    return;
                }
                dialog.dismiss();
            }

            @Override // com.sankuai.xm.base.lifecycle.c, com.sankuai.xm.base.lifecycle.b
            public final void f(Context context2) {
                Object[] objArr2 = {context2};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71e28a67d35390baa501923f06bbf840", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71e28a67d35390baa501923f06bbf840");
                    return;
                }
                g.a(this.b);
                if (this.b instanceof AlertDialog) {
                    g.a(x.a("mAlert", this.b));
                }
                super.f(context2);
            }
        });
        return t;
    }

    public static void b(Dialog dialog, Context context) {
        Object[] objArr = {dialog, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34f7fef0e1779b3699f71c6ac4972b34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34f7fef0e1779b3699f71c6ac4972b34");
            return;
        }
        Activity a2 = ActivityUtils.a(context);
        if (a2 == null) {
            a2 = b(dialog);
        }
        if (ActivityUtils.a(a2)) {
            a(dialog, a2);
            if (dialog.isShowing()) {
                return;
            }
            dialog.show();
        }
    }

    public static void a(CharSequence[] charSequenceArr, CharSequence charSequence, final DialogInterface.OnClickListener onClickListener) {
        Object[] objArr = {charSequenceArr, charSequence, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0829e544756034dbfc0586525af0b10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0829e544756034dbfc0586525af0b10");
            return;
        }
        Activity b = com.sankuai.xm.base.lifecycle.d.d().b();
        if (ActivityUtils.a(b)) {
            final DownToUpSlideDialog downToUpSlideDialog = new DownToUpSlideDialog(b);
            Object[] objArr2 = {charSequenceArr};
            ChangeQuickRedirect changeQuickRedirect2 = DownToUpSlideDialog.a;
            if (PatchProxy.isSupport(objArr2, downToUpSlideDialog, changeQuickRedirect2, false, "e21733db96af1f9f2aa8d6fa6a8a7a59", 6917529027641081856L)) {
                ArrayList arrayList = (ArrayList) PatchProxy.accessDispatch(objArr2, downToUpSlideDialog, changeQuickRedirect2, false, "e21733db96af1f9f2aa8d6fa6a8a7a59");
            } else {
                downToUpSlideDialog.d.clear();
                int i = 0;
                for (CharSequence charSequence2 : charSequenceArr) {
                    DownToUpSlideDialog.a aVar = new DownToUpSlideDialog.a();
                    aVar.a = charSequence2;
                    aVar.d = 0;
                    aVar.c = i == 0 ? 0 : downToUpSlideDialog.getContext().getResources().getDimensionPixelSize(R.dimen.xm_sdk_imui_dialog_slide_dialog_default_spacing_height);
                    aVar.b = R.style.xm_sdk_imui_dialog_MMLineButton;
                    downToUpSlideDialog.d.add(aVar);
                    i++;
                }
                downToUpSlideDialog.f = new boolean[i];
                for (int i2 = 0; i2 < downToUpSlideDialog.f.length; i2++) {
                    downToUpSlideDialog.f[i2] = true;
                }
                downToUpSlideDialog.e.a = downToUpSlideDialog.getContext().getString(R.string.xm_sdk_base_btn_cancel);
                downToUpSlideDialog.e.d = 0;
                downToUpSlideDialog.e.c = 0;
                downToUpSlideDialog.e.b = R.style.xm_sdk_imui_dialog_MMLineButtonCancel;
                ArrayList<DownToUpSlideDialog.a> arrayList2 = downToUpSlideDialog.d;
            }
            downToUpSlideDialog.setTitle(charSequence);
            downToUpSlideDialog.b = new DownToUpSlideDialog.b() { // from class: com.sankuai.xm.base.util.g.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.ui.DownToUpSlideDialog.b
                public final void a(int i3) {
                    Object[] objArr3 = {Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f798a5476b86463f4a0ef6f858871c31", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f798a5476b86463f4a0ef6f858871c31");
                    } else if (onClickListener == null) {
                    } else {
                        onClickListener.onClick(downToUpSlideDialog, i3);
                    }
                }
            };
            if (downToUpSlideDialog.isShowing()) {
                return;
            }
            downToUpSlideDialog.show();
        }
    }

    public static void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc9c175de34d875c8a1b72f65f21b5d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc9c175de34d875c8a1b72f65f21b5d9");
        } else if (dialog == null || !dialog.isShowing()) {
        } else {
            Activity ownerActivity = dialog.getOwnerActivity();
            if (ownerActivity == null || ActivityUtils.a(ownerActivity)) {
                Activity b = b(dialog);
                if (b == null || ActivityUtils.a(b)) {
                    dialog.dismiss();
                }
            }
        }
    }

    public static Activity b(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca2f4530c76f4e8abcdec6aa5d2c2ea2", 6917529027641081856L)) {
            return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca2f4530c76f4e8abcdec6aa5d2c2ea2");
        }
        Activity ownerActivity = dialog.getOwnerActivity();
        return ownerActivity == null ? ActivityUtils.a(dialog.getContext()) : ownerActivity;
    }

    public static void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1707dcbc50803db109751d9de3d77e74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1707dcbc50803db109751d9de3d77e74");
        } else if (obj == null) {
        } else {
            try {
                x.a(Handler.class, obj, false, (b.a) new b.a<Handler>() { // from class: com.sankuai.xm.base.util.g.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.util.b.a
                    public final /* synthetic */ boolean a(Handler handler) {
                        Handler handler2 = handler;
                        Object[] objArr2 = {handler2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a14b8fd3ca456ae74628bb589ec07563", 6917529027641081856L)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a14b8fd3ca456ae74628bb589ec07563")).booleanValue();
                        }
                        if (handler2 != null) {
                            handler2.removeCallbacksAndMessages(null);
                        }
                        return false;
                    }
                });
                x.a(Message.class, obj, true, (b.a) new b.a<Message>() { // from class: com.sankuai.xm.base.util.g.4
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.util.b.a
                    public final /* synthetic */ boolean a(Message message) {
                        Message message2 = message;
                        Object[] objArr2 = {message2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fee873337a0e91197fea5b3a99d621ae", 6917529027641081856L)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fee873337a0e91197fea5b3a99d621ae")).booleanValue();
                        }
                        if (message2 != null) {
                            message2.recycle();
                        }
                        return false;
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
