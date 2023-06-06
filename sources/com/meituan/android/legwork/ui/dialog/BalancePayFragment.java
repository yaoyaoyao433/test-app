package com.meituan.android.legwork.ui.dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.legwork.bean.PayBean;
import com.meituan.android.legwork.bean.PayCashierBean;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.android.legwork.ui.base.BaseDialogFragment;
import com.meituan.android.legwork.ui.component.CommonDialog;
import com.meituan.android.legwork.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BalancePayFragment extends BaseDialogFragment {
    public static ChangeQuickRedirect b;
    public a c;
    private PayCashierBean d;
    private String e;
    private View f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private LinearLayout k;
    private TextView l;
    private ImageView m;
    private RotateAnimation n;
    private rx.k o;
    private rx.k p;
    private StringBuilder q;
    private CommonDialog r;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(int i, String str);
    }

    public BalancePayFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69f4fbab71aac31b9e0a899dc13313a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69f4fbab71aac31b9e0a899dc13313a9");
        } else {
            this.q = new StringBuilder(8);
        }
    }

    public static BalancePayFragment a(String str, PayCashierBean payCashierBean) {
        Object[] objArr = {str, payCashierBean};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20974510e5ba41f1aecafdd1d0b2611f", RobustBitConfig.DEFAULT_VALUE)) {
            return (BalancePayFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20974510e5ba41f1aecafdd1d0b2611f");
        }
        BalancePayFragment balancePayFragment = new BalancePayFragment();
        Bundle bundle = new Bundle();
        bundle.putString("balance_pay_order_id", str);
        bundle.putSerializable("balance_pay_cashier", payCashierBean);
        balancePayFragment.setArguments(bundle);
        return balancePayFragment;
    }

    @Override // com.meituan.android.legwork.ui.base.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f5005c4c29a6b4dfad90acc7e4d0d1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f5005c4c29a6b4dfad90acc7e4d0d1f");
            return;
        }
        super.onCreate(bundle);
        a();
        if (getArguments() == null) {
            a(1, "");
            return;
        }
        Bundle arguments = getArguments();
        this.e = arguments.getString("balance_pay_order_id");
        Serializable a2 = com.sankuai.waimai.platform.utils.f.a(arguments, "balance_pay_cashier");
        if (!(a2 instanceof PayCashierBean)) {
            a(1, "");
        } else {
            this.d = (PayCashierBean) a2;
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "268a87d349a97aa2ef909b5ae73da380", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "268a87d349a97aa2ef909b5ae73da380");
        }
        this.f = layoutInflater.inflate(R.layout.legwork_fragment_pay_balance, viewGroup, false);
        this.g = (ImageView) this.f.findViewById(R.id.balance_pay_close);
        this.i = (TextView) this.f.findViewById(R.id.balance_order_id);
        this.h = (TextView) this.f.findViewById(R.id.balance_limit_time);
        this.j = (TextView) this.f.findViewById(R.id.balance_pay_amount);
        this.k = (LinearLayout) this.f.findViewById(R.id.balance_pay_container);
        this.l = (TextView) this.f.findViewById(R.id.balance_pay_btn);
        this.m = (ImageView) this.f.findViewById(R.id.balance_pay_loading);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec6b92cb51dac2992001587e99d58427", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec6b92cb51dac2992001587e99d58427");
        } else {
            this.g.setOnClickListener(b.a(this));
            this.j.setText(com.meituan.android.legwork.utils.f.a(this.d.payTotal));
            this.i.setText(this.e);
            if (this.d.payRemainTime <= 0) {
                this.h.setText(getString(R.string.legwork_pay_rest_time, "00:00"));
                e();
            } else {
                rx.d<Long> a2 = rx.d.a(0L, 1L, TimeUnit.SECONDS).b(rx.schedulers.a.e()).c(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).a(this.d.payRemainTime + 1);
                Object[] objArr3 = {this};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                this.o = a2.c(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "26c53cf207a9574f0bcba4532e58ef23", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "26c53cf207a9574f0bcba4532e58ef23") : new c(this));
                this.k.setOnClickListener(d.a(this));
            }
        }
        getDialog().setCanceledOnTouchOutside(false);
        getDialog().setOnKeyListener(com.meituan.android.legwork.ui.dialog.a.a(this));
        return this.f;
    }

    public static /* synthetic */ boolean a(BalancePayFragment balancePayFragment, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Object[] objArr = {balancePayFragment, dialogInterface, Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d628bb75c79564c55ff75cb7d71bf86", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d628bb75c79564c55ff75cb7d71bf86")).booleanValue();
        }
        if (i == 4) {
            balancePayFragment.c();
            return true;
        }
        return false;
    }

    public static /* synthetic */ void b(BalancePayFragment balancePayFragment, View view) {
        Object[] objArr = {balancePayFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20190e9653bb56a38940317218590c60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20190e9653bb56a38940317218590c60");
        } else {
            balancePayFragment.c();
        }
    }

    public static /* synthetic */ void a(BalancePayFragment balancePayFragment, Long l) {
        Object[] objArr = {balancePayFragment, l};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11f877a894714d2395c3431e87d7cf2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11f877a894714d2395c3431e87d7cf2a");
            return;
        }
        long longValue = balancePayFragment.d.payRemainTime - l.longValue();
        balancePayFragment.h.setText(balancePayFragment.getString(R.string.legwork_pay_rest_time, com.meituan.android.legwork.utils.g.a(balancePayFragment.q, longValue)));
        if (longValue <= 0) {
            balancePayFragment.e();
        }
    }

    public static /* synthetic */ void a(BalancePayFragment balancePayFragment, View view) {
        Object[] objArr = {balancePayFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1d0e345cb96a14eed54e4104549eaf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1d0e345cb96a14eed54e4104549eaf3");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, balancePayFragment, changeQuickRedirect2, false, "64cf5d0f7887e2d7755c6adaa8dea02d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, balancePayFragment, changeQuickRedirect2, false, "64cf5d0f7887e2d7755c6adaa8dea02d");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, balancePayFragment, changeQuickRedirect3, false, "672f860ce41848ed33e6ebe0c45e3899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, balancePayFragment, changeQuickRedirect3, false, "672f860ce41848ed33e6ebe0c45e3899");
        } else {
            balancePayFragment.l.setText(R.string.legwork_balance_paying);
            balancePayFragment.k.setEnabled(false);
            balancePayFragment.m.setVisibility(0);
            balancePayFragment.n = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            balancePayFragment.n.setRepeatCount(-1);
            balancePayFragment.n.setDuration(1000L);
            balancePayFragment.m.startAnimation(balancePayFragment.n);
        }
        com.meituan.android.legwork.mvp.model.d dVar = new com.meituan.android.legwork.mvp.model.d();
        String str = balancePayFragment.e;
        Object[] objArr4 = {str};
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.legwork.mvp.model.d.a;
        balancePayFragment.p = rx.d.a(new AnonymousClass1(), (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "834b7c48d4f8ab08bcb0d83c56a997fc", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "834b7c48d4f8ab08bcb0d83c56a997fc") : ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).balancePayment(str)).b(rx.schedulers.a.e()).c(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "155654c871f586b11cb2e3943291377a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "155654c871f586b11cb2e3943291377a");
        } else if (this.o != null) {
            this.o.unsubscribe();
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "099a95f190c47d600c781bff34a44e5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "099a95f190c47d600c781bff34a44e5d");
            return;
        }
        super.onCancel(dialogInterface);
        a(7, "");
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8af9676ad5d43898d1c55147fdb44e33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8af9676ad5d43898d1c55147fdb44e33");
            return;
        }
        b();
        d();
        if (this.p != null && !this.p.isUnsubscribed()) {
            this.p.unsubscribe();
        }
        super.onDestroy();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24dc2a8898462e7b133adad352ca4541", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24dc2a8898462e7b133adad352ca4541");
            return;
        }
        super.onStart();
        a(R.color.legwork_common_bg_color_transparent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1659fe6f70d0c9fd142529003d4d562d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1659fe6f70d0c9fd142529003d4d562d");
            return;
        }
        if (this.c != null) {
            if (i == 0) {
                this.c.a();
            } else {
                this.c.a(i, str);
            }
        }
        if (i != 7) {
            dismiss();
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b018addbb771ee7aba219faa2589510", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b018addbb771ee7aba219faa2589510")).booleanValue();
        }
        if (isDetached() || !isVisible()) {
            return false;
        }
        if (this.r == null) {
            this.r = new CommonDialog(getContext());
            CommonDialog commonDialog = this.r;
            Object[] objArr2 = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = CommonDialog.a;
            if (PatchProxy.isSupport(objArr2, commonDialog, changeQuickRedirect2, false, "39caf068844946964a10f77a232af0c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, commonDialog, changeQuickRedirect2, false, "39caf068844946964a10f77a232af0c6");
            } else {
                commonDialog.b.setVisibility(8);
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = CommonDialog.a;
                if (PatchProxy.isSupport(objArr3, commonDialog, changeQuickRedirect3, false, "642790c42f0212d9dda94363b881534b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, commonDialog, changeQuickRedirect3, false, "642790c42f0212d9dda94363b881534b");
                } else {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) commonDialog.c.getLayoutParams();
                    if (commonDialog.b.getVisibility() == 0) {
                        layoutParams.topMargin = com.meituan.android.legwork.utils.h.a(13);
                    } else {
                        layoutParams.topMargin = com.meituan.android.legwork.utils.h.a(23);
                    }
                    commonDialog.c.setLayoutParams(layoutParams);
                }
            }
            this.r.b(getString(R.string.legwork_balance_pay_remind_body));
            this.r.c(getString(R.string.legwork_balance_pay_remind_cancel));
            this.r.d(getString(R.string.legwork_balance_pay_remind_ok));
            CommonDialog commonDialog2 = this.r;
            Object[] objArr4 = {this};
            ChangeQuickRedirect changeQuickRedirect4 = e.a;
            commonDialog2.e = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "f03e293f590b69cece3a7b1668fb95a3", RobustBitConfig.DEFAULT_VALUE) ? (CommonDialog.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "f03e293f590b69cece3a7b1668fb95a3") : new e(this);
            CommonDialog commonDialog3 = this.r;
            Object[] objArr5 = {this};
            ChangeQuickRedirect changeQuickRedirect5 = f.a;
            commonDialog3.d = PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "384dcc63db64ee14cf8d6ed7f0f116a0", RobustBitConfig.DEFAULT_VALUE) ? (CommonDialog.b) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "384dcc63db64ee14cf8d6ed7f0f116a0") : new f(this);
        }
        this.r.show();
        return true;
    }

    public static /* synthetic */ void c(BalancePayFragment balancePayFragment) {
        Object[] objArr = {balancePayFragment};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e94eff49a55683dbba528438168a796", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e94eff49a55683dbba528438168a796");
            return;
        }
        balancePayFragment.a(5, "");
        balancePayFragment.r.dismiss();
    }

    public static /* synthetic */ void b(BalancePayFragment balancePayFragment) {
        Object[] objArr = {balancePayFragment};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fbdc7c6a2c13e19a25e047579c15e40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fbdc7c6a2c13e19a25e047579c15e40");
        } else {
            balancePayFragment.r.dismiss();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.ui.dialog.BalancePayFragment$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends com.meituan.android.legwork.net.subscriber.a<PayBean> {
        public static ChangeQuickRedirect a;

        public AnonymousClass1() {
        }

        @Override // com.meituan.android.legwork.net.subscriber.a
        public final /* synthetic */ void a(PayBean payBean) {
            Object[] objArr = {payBean};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aab768b81b4f4b8f4ef498ff798d3493", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aab768b81b4f4b8f4ef498ff798d3493");
                return;
            }
            ab.a(BalancePayFragment.this.f, BalancePayFragment.this.getString(R.string.legwork_balance_pay_success));
            BalancePayFragment.this.l.setText(R.string.legwork_balance_pay_success);
            BalancePayFragment.this.d();
            BalancePayFragment.this.b();
            BalancePayFragment.this.l.setClickable(false);
            BalancePayFragment.this.h.postDelayed(h.a(this), 1000L);
        }

        @Override // com.meituan.android.legwork.net.subscriber.a
        public final void a(boolean z, int i, String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d48225b0c9724680cf8b9b4636ae2b95", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d48225b0c9724680cf8b9b4636ae2b95");
                return;
            }
            BalancePayFragment.this.d();
            BalancePayFragment.this.k.setEnabled(true);
            if (i != 16002) {
                ab.a(BalancePayFragment.this.f, str);
            }
            BalancePayFragment.this.l.setText(R.string.legwork_pay_right_now);
            if (i == 16002) {
                BalancePayFragment.this.a(4, str);
            } else if (i == 16003) {
                BalancePayFragment.this.l.setEnabled(false);
                BalancePayFragment.this.h.postDelayed(i.a(this, str), PayTask.j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3292052b5355ef2d5881642515806c27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3292052b5355ef2d5881642515806c27");
            return;
        }
        if (this.n != null) {
            this.n.cancel();
        }
        this.m.clearAnimation();
        this.m.setVisibility(8);
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa6819091ec0c2580de661f2f61d062f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa6819091ec0c2580de661f2f61d062f");
            return;
        }
        ab.a(this.f, getString(R.string.legwork_pay_over_time_content));
        this.h.postDelayed(g.a(this), PayTask.j);
    }

    public static /* synthetic */ void a(BalancePayFragment balancePayFragment) {
        Object[] objArr = {balancePayFragment};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b13c648a604f485cdb9f529b347d4769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b13c648a604f485cdb9f529b347d4769");
        } else {
            balancePayFragment.a(2, balancePayFragment.getString(R.string.legwork_pay_over_time_content));
        }
    }
}
