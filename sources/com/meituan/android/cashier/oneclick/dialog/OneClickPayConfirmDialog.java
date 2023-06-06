package com.meituan.android.cashier.oneclick.dialog;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.constraint.R;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.oneclick.model.bean.OpenOneClickPay;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OneClickPayConfirmDialog extends BaseDialog {
    public static ChangeQuickRedirect a;
    public OpenOneClickPay b;
    private int e;
    private b f;
    private Context g;
    private Button h;
    private boolean i;
    private Handler j;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b();
    }

    public static /* synthetic */ void a(OneClickPayConfirmDialog oneClickPayConfirmDialog, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, oneClickPayConfirmDialog, changeQuickRedirect, false, "a741aed19152292f20aadef8769b23d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, oneClickPayConfirmDialog, changeQuickRedirect, false, "a741aed19152292f20aadef8769b23d2");
        } else {
            oneClickPayConfirmDialog.h.setText(String.format(oneClickPayConfirmDialog.g.getString(R.string.cashieroneclick__pay_confirm), Integer.valueOf(i)));
        }
    }

    public static /* synthetic */ boolean a(OneClickPayConfirmDialog oneClickPayConfirmDialog, boolean z) {
        oneClickPayConfirmDialog.i = true;
        return true;
    }

    public static /* synthetic */ void b(OneClickPayConfirmDialog oneClickPayConfirmDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, oneClickPayConfirmDialog, changeQuickRedirect, false, "fb16aa1baacde7667a4e89c0604221cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, oneClickPayConfirmDialog, changeQuickRedirect, false, "fb16aa1baacde7667a4e89c0604221cc");
        } else if (oneClickPayConfirmDialog.f != null) {
            oneClickPayConfirmDialog.dismiss();
            oneClickPayConfirmDialog.f.a();
        }
    }

    public static /* synthetic */ void c(OneClickPayConfirmDialog oneClickPayConfirmDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, oneClickPayConfirmDialog, changeQuickRedirect, false, "2d4a4397289a96833961ff2e5f3778ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, oneClickPayConfirmDialog, changeQuickRedirect, false, "2d4a4397289a96833961ff2e5f3778ea");
        } else if (oneClickPayConfirmDialog.f != null) {
            oneClickPayConfirmDialog.dismiss();
            oneClickPayConfirmDialog.f.b();
        }
    }

    public static /* synthetic */ int e(OneClickPayConfirmDialog oneClickPayConfirmDialog) {
        int i = oneClickPayConfirmDialog.e;
        oneClickPayConfirmDialog.e = i - 1;
        return i;
    }

    public OneClickPayConfirmDialog(Context context, OpenOneClickPay openOneClickPay, b bVar) {
        super(context);
        Object[] objArr = {context, openOneClickPay, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b47f17d394f913d8ff6aa1b25b0a31e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b47f17d394f913d8ff6aa1b25b0a31e5");
            return;
        }
        this.e = 5;
        this.i = false;
        this.b = openOneClickPay;
        this.e = openOneClickPay.getCloseTime();
        this.f = bVar;
        this.g = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60bed9e512fddc32cba93ca0158884e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60bed9e512fddc32cba93ca0158884e3");
            return;
        }
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(R.layout.cashieroneclick__confirm_dialog_layout);
        TextView textView = (TextView) findViewById(R.id.tv_title);
        TextView textView2 = (TextView) findViewById(R.id.tv_context);
        TextView textView3 = (TextView) findViewById(R.id.tv_cut_payment_info);
        TextView textView4 = (TextView) findViewById(R.id.tv_cut_payment_list);
        String string = TextUtils.isEmpty(this.b.getSecondToastTitle()) ? getContext().getString(R.string.cashieroneclick__confirm_dialong_default_tilte) : this.b.getSecondToastTitle();
        String string2 = TextUtils.isEmpty(this.b.getSecondToastMessage()) ? getContext().getString(R.string.cashieroneclick__confirm_dialong_default_content) : this.b.getSecondToastMessage();
        textView.setText(string);
        textView2.setText(string2);
        if (TextUtils.isEmpty(this.b.getSecondToastSubText())) {
            if (TextUtils.isEmpty(this.b.getSecondToastText())) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                textView3.setText(Html.fromHtml(this.b.getSecondToastText()));
            }
            textView4.setVisibility(8);
        } else {
            a(textView3, this.b.getSecondToastSubText());
            a(textView4, this.b.getSecondToastText());
        }
        this.j = new a(this);
        this.h = (Button) findViewById(R.id.button_confirm);
        if (this.e <= 0) {
            this.h.setText(this.g.getString(R.string.cashieroneclick__pay_confirm2));
        } else {
            this.h.setText(this.g.getString(R.string.cashieroneclick__pay_confirm));
            this.j.sendEmptyMessage(3);
        }
        this.h.setOnClickListener(com.meituan.android.cashier.oneclick.dialog.a.a(this));
        ImageView imageView = (ImageView) findViewById(R.id.dialog_close);
        if (this.b.isShowCloseBtn()) {
            imageView.setOnClickListener(com.meituan.android.cashier.oneclick.dialog.b.a(this));
            imageView.setVisibility(0);
            return;
        }
        imageView.setVisibility(4);
    }

    public static /* synthetic */ void b(OneClickPayConfirmDialog oneClickPayConfirmDialog, View view) {
        Object[] objArr = {oneClickPayConfirmDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb244bd34ec8ce217017eb5f72658170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb244bd34ec8ce217017eb5f72658170");
        } else if (oneClickPayConfirmDialog.j != null) {
            oneClickPayConfirmDialog.j.sendEmptyMessage(0);
        }
    }

    public static /* synthetic */ void a(OneClickPayConfirmDialog oneClickPayConfirmDialog, View view) {
        Object[] objArr = {oneClickPayConfirmDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7706085e58966514b87d361a0d6e029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7706085e58966514b87d361a0d6e029");
            return;
        }
        if (oneClickPayConfirmDialog.j != null) {
            oneClickPayConfirmDialog.j.sendEmptyMessage(2);
        }
        oneClickPayConfirmDialog.a("b_pay_nvy4l5vo_mc", oneClickPayConfirmDialog.b());
    }

    private void a(TextView textView, CharSequence charSequence) {
        Object[] objArr = {textView, charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e8f2b9064d1978fbb5a9a21f4a57234", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e8f2b9064d1978fbb5a9a21f4a57234");
        } else if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86fd8299ddb6796285d49e3713fb11f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86fd8299ddb6796285d49e3713fb11f0");
            return;
        }
        super.dismiss();
        if (this.j != null) {
            this.j.removeCallbacksAndMessages(null);
            this.j = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a extends Handler {
        public static ChangeQuickRedirect a;
        private WeakReference<OneClickPayConfirmDialog> b;

        public a(OneClickPayConfirmDialog oneClickPayConfirmDialog) {
            Object[] objArr = {oneClickPayConfirmDialog};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89cfc19c400849e2529ba4cd06771f28", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89cfc19c400849e2529ba4cd06771f28");
            } else {
                this.b = new WeakReference<>(oneClickPayConfirmDialog);
            }
        }

        @Override // android.os.Handler
        @MTPaySuppressFBWarnings({"SIC_INNER_SHOULD_BE_STATIC_ANON"})
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e804a1e52d8df65dd90c2726c48f557d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e804a1e52d8df65dd90c2726c48f557d");
                return;
            }
            super.handleMessage(message);
            OneClickPayConfirmDialog oneClickPayConfirmDialog = this.b.get();
            if (oneClickPayConfirmDialog == null || oneClickPayConfirmDialog.i) {
                return;
            }
            switch (message.what) {
                case 0:
                case 1:
                    OneClickPayConfirmDialog.b(oneClickPayConfirmDialog);
                    OneClickPayConfirmDialog.a(oneClickPayConfirmDialog, true);
                    return;
                case 2:
                    OneClickPayConfirmDialog.c(oneClickPayConfirmDialog);
                    OneClickPayConfirmDialog.a(oneClickPayConfirmDialog, true);
                    return;
                case 3:
                    OneClickPayConfirmDialog.a(oneClickPayConfirmDialog, oneClickPayConfirmDialog.e);
                    OneClickPayConfirmDialog.e(oneClickPayConfirmDialog);
                    if (oneClickPayConfirmDialog.e <= 0) {
                        sendEmptyMessage(1);
                        oneClickPayConfirmDialog.a("b_pay_h0pmez3b_mc", oneClickPayConfirmDialog.b());
                        return;
                    }
                    sendEmptyMessageDelayed(3, 1000L);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1170a54746e99ad51feae2e5d3d855d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1170a54746e99ad51feae2e5d3d855d5");
        } else {
            q.a(str, (Map<String, Object>) null, "c_pay_ohbr8ry1", str2);
        }
    }
}
