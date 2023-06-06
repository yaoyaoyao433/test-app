package com.sankuai.waimai.bussiness.order.confirm.submit;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.restaurant.dialog.GoodsLimitDialog;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RichTextDialog extends GoodsLimitDialog {
    public static ChangeQuickRedirect a;
    @Nullable
    private SpannableString g;
    @Nullable
    private TextView h;

    public RichTextDialog(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9243bc6abf84c1cb45260507a7977ed3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9243bc6abf84c1cb45260507a7977ed3");
        } else {
            this.g = null;
        }
    }

    @Override // com.sankuai.waimai.platform.restaurant.dialog.GoodsLimitDialog, com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon, android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a999e0da0047e34de522f11f2ef37b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a999e0da0047e34de522f11f2ef37b1");
            return;
        }
        super.onCreate(bundle);
        if (this.h == null || this.g == null) {
            return;
        }
        this.h.setText(this.g);
    }

    @Override // com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon
    public final void a(View view, FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ec05e1c64a0c9a3f18c57cf60b4ec88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ec05e1c64a0c9a3f18c57cf60b4ec88");
            return;
        }
        if (view instanceof TextView) {
            this.h = (TextView) view;
            this.h.setMovementMethod(LinkMovementMethod.getInstance());
        }
        super.a(view, layoutParams);
    }

    public final void a(@Nullable String str, @Nullable SpannableString spannableString) {
        Object[] objArr = {str, spannableString};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4610a931629863aed60a9413560fd943", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4610a931629863aed60a9413560fd943");
            return;
        }
        ((GoodsLimitDialog) this).e = str;
        this.g = spannableString;
    }
}
