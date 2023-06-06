package com.meituan.android.elderly.dialog;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ElderlyPayDialog extends PayDialog {
    public static ChangeQuickRedirect a;
    private Context g;
    private int h;

    @Override // com.meituan.android.paybase.dialog.BasePayDialog
    public final int b() {
        return 18;
    }

    private ElderlyPayDialog(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec68ba201c6c8160dee608cfbea62139", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec68ba201c6c8160dee608cfbea62139");
        } else {
            this.g = context;
        }
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog
    public final int a() {
        return this.h == 1 ? R.layout.cashier_elderly__alter_vertical_dialog : R.layout.cashier_elderly__alter_horizontal_dialog;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog
    public final void a(final TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a58cd1186c607070bfb0888b29ba371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a58cd1186c607070bfb0888b29ba371");
            return;
        }
        super.a(textView);
        if (textView != null) {
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.android.elderly.dialog.ElderlyPayDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ac34f41f8db50b8a265c73892355e40", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ac34f41f8db50b8a265c73892355e40");
                        return;
                    }
                    if (textView.getLineCount() > 1) {
                        textView.setGravity(3);
                    } else {
                        textView.setGravity(17);
                    }
                    if (Build.VERSION.SDK_INT >= 16) {
                        textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        textView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            });
            textView.setTextColor(ContextCompat.getColor(getContext(), R.color.paybase__half_page_content_text_color));
        }
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog
    public final void a(View view, boolean z, BasePayDialog.c cVar) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1441a2cb4ac03135fc1dfd160c87666b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1441a2cb4ac03135fc1dfd160c87666b");
        } else {
            ((ImageView) view.findViewById(R.id.alert_close_icon)).setVisibility(4);
        }
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog
    public final void b(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6073abea23251b75bf3c5eb1554bfe7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6073abea23251b75bf3c5eb1554bfe7b");
            return;
        }
        super.b(textView);
        if (textView != null) {
            textView.setTextColor(ContextCompat.getColor(this.g, R.color.black));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends PayDialog.a {
        public static ChangeQuickRedirect a;
        public int b;
        private String u;
        private HashMap<String, Object> v;

        @Override // com.meituan.android.paybase.common.dialog.PayDialog.a, com.meituan.android.paybase.dialog.BasePayDialog.b
        public final /* synthetic */ BasePayDialog a(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ba26d0f879e5711bd012abe470fe4ec", RobustBitConfig.DEFAULT_VALUE)) {
                return (ElderlyPayDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ba26d0f879e5711bd012abe470fe4ec");
            }
            ElderlyPayDialog elderlyPayDialog = new ElderlyPayDialog(activity);
            elderlyPayDialog.e = this.u;
            elderlyPayDialog.c = this.v;
            elderlyPayDialog.h = this.b;
            return elderlyPayDialog;
        }

        public a(Activity activity) {
            super(activity);
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bde39a8d5a07c9d7086e14af6ca5c838", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bde39a8d5a07c9d7086e14af6ca5c838");
            }
        }

        @Override // com.meituan.android.paybase.common.dialog.PayDialog.a
        public final /* bridge */ /* synthetic */ PayDialog.a a(HashMap hashMap) {
            this.v = hashMap;
            return this;
        }

        @Override // com.meituan.android.paybase.common.dialog.PayDialog.a
        public final /* bridge */ /* synthetic */ PayDialog.a a(String str) {
            this.u = str;
            return this;
        }
    }
}
