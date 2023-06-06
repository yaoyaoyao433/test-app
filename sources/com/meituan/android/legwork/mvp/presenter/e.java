package com.meituan.android.legwork.mvp.presenter;

import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.legwork.bean.PayCashierBean;
import com.meituan.android.legwork.bean.PayTypeBean;
import com.meituan.android.legwork.mvp.contract.PayTypeContract;
import com.meituan.android.legwork.ui.dialog.BalancePayFragment;
import com.meituan.android.legwork.ui.dialog.PayTypeFragment;
import com.meituan.android.legwork.utils.ab;
import com.meituan.android.legwork.utils.f;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e extends com.meituan.android.legwork.mvp.base.a<PayTypeContract.a> {
    public static ChangeQuickRedirect c;
    public int d;
    com.meituan.android.legwork.mvp.model.d e;
    PayTypeFragment f;
    BalancePayFragment g;
    int h;
    int i;
    private int j;

    public static /* synthetic */ void a(e eVar, PayTypeBean payTypeBean, int i, int i2) {
        Object[] objArr = {payTypeBean, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "a32deac55ed4613701226591de5c3769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "a32deac55ed4613701226591de5c3769");
        } else if (eVar.c()) {
            if (eVar.b().a() == null) {
                x.e("PayTypePresenter.updatePayTypeFragment()", "支付方式 无法获取fragmentManager 转在线支付");
                eVar.b().a(1);
                return;
            }
            eVar.f = PayTypeFragment.a(eVar.j, eVar.d, payTypeBean, i, i2, eVar.h, eVar.i);
            eVar.f.show(eVar.b().a(), "payType");
            eVar.f.h = new PayTypeFragment.a() { // from class: com.meituan.android.legwork.mvp.presenter.e.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.legwork.ui.dialog.PayTypeFragment.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0c3900cf1af3b8e0100271dfcfc218a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0c3900cf1af3b8e0100271dfcfc218a");
                    } else if (e.this.c()) {
                        e.this.b().b();
                    }
                }

                @Override // com.meituan.android.legwork.ui.dialog.PayTypeFragment.a
                public final void a(int i3) {
                    Object[] objArr2 = {Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a824aed7ea1cd9f677537791be569be8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a824aed7ea1cd9f677537791be569be8");
                    } else if (e.this.c()) {
                        e.this.b().a(i3);
                    }
                }

                @Override // com.meituan.android.legwork.ui.dialog.PayTypeFragment.a
                public final void a(final PayTypeBean payTypeBean2) {
                    Object[] objArr2 = {payTypeBean2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a79c9b6aff6c49331fcd96cae2c10a1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a79c9b6aff6c49331fcd96cae2c10a1");
                    } else {
                        e.this.a(rx.d.a(new com.meituan.android.legwork.net.subscriber.a<PayTypeBean>() { // from class: com.meituan.android.legwork.mvp.presenter.e.3.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.legwork.net.subscriber.a
                            public final void a(boolean z, int i3, String str) {
                            }

                            @Override // com.meituan.android.legwork.net.subscriber.a
                            public final /* synthetic */ void a(PayTypeBean payTypeBean3) {
                                PayTypeBean payTypeBean4 = payTypeBean3;
                                Object[] objArr3 = {payTypeBean4};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da70040bff8bb6ca771247c8371240d0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da70040bff8bb6ca771247c8371240d0");
                                } else if (payTypeBean4 != null && e.this.c() && e.this.f.isVisible()) {
                                    payTypeBean4.orderPayType = e.this.f.c();
                                    payTypeBean4.orderTotal = payTypeBean2.orderTotal;
                                    int i3 = e.this.f.e;
                                    if (i3 == 1 || i3 == 2) {
                                        if (!payTypeBean4.isBalanceDegrade() && payTypeBean4.isBalanceSufficient(payTypeBean2.orderTotal)) {
                                            i3 = i3 == 1 ? 4 : 3;
                                        }
                                    } else if (i3 == 4) {
                                        if (payTypeBean4.isBalanceDegrade()) {
                                            i3 = 1;
                                        }
                                    } else if (i3 == 3 && payTypeBean4.isBalanceDegrade()) {
                                        i3 = 2;
                                    }
                                    PayTypeFragment payTypeFragment = e.this.f;
                                    Object[] objArr4 = {4, payTypeBean4, Integer.valueOf(i3)};
                                    ChangeQuickRedirect changeQuickRedirect4 = PayTypeFragment.b;
                                    if (PatchProxy.isSupport(objArr4, payTypeFragment, changeQuickRedirect4, false, "6149ebfb70b6392cca023a9f24416da9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, payTypeFragment, changeQuickRedirect4, false, "6149ebfb70b6392cca023a9f24416da9");
                                    } else if (payTypeBean4 != null) {
                                        if (payTypeBean4.isBalanceDegrade() && payTypeFragment.e != 5) {
                                            ab.a(payTypeFragment.f, payTypeFragment.getString(R.string.legwork_balance_pay_degrade_toast));
                                        }
                                        payTypeFragment.c = 4;
                                        payTypeFragment.d = payTypeBean4;
                                        payTypeFragment.e = i3;
                                        payTypeFragment.b();
                                        if (payTypeBean4.isBalanceDegrade() && payTypeBean4.isBalanceSufficient(payTypeFragment.d.orderTotal)) {
                                            payTypeFragment.g.setText(payTypeFragment.getString(R.string.legwork_pay_mode_balance_amount, f.a(payTypeFragment.d.balanceAmount)));
                                        }
                                    }
                                    e.this.b();
                                }
                            }
                        }, e.this.e.a("", e.this.h, e.this.i).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
                    }
                }

                @Override // com.meituan.android.legwork.ui.dialog.PayTypeFragment.a
                public final void a(boolean z, String str, int i3) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b82624417160670e497dc8912d4e44d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b82624417160670e497dc8912d4e44d5");
                    } else if (e.this.c()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("pay_type", Integer.valueOf(com.meituan.android.legwork.statistics.a.a(i3)));
                        e.this.b().a(z, str, hashMap);
                    }
                }
            };
        }
    }

    public e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9638104e1c2d8801a187204c02b3fff7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9638104e1c2d8801a187204c02b3fff7");
            return;
        }
        this.j = i;
        this.e = new com.meituan.android.legwork.mvp.model.d();
    }

    public final void a(int i, int i2) {
        this.h = i;
        this.i = i2;
    }

    public final void a(String str, final int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad3640fa2d35195e27551cbe4a8625a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad3640fa2d35195e27551cbe4a8625a4");
        } else if (c()) {
            b().d();
            a(rx.d.a(new com.meituan.android.legwork.net.subscriber.a<PayTypeBean>() { // from class: com.meituan.android.legwork.mvp.presenter.e.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final /* synthetic */ void a(PayTypeBean payTypeBean) {
                    PayTypeBean payTypeBean2 = payTypeBean;
                    Object[] objArr2 = {payTypeBean2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37bb9f1b6c782be5f0c6b1e8b5e9deda", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37bb9f1b6c782be5f0c6b1e8b5e9deda");
                    } else if (e.this.c()) {
                        if (payTypeBean2 == null) {
                            a(false, -1, com.meituan.android.legwork.a.a().getString(R.string.legwork_network_connection_failed));
                            return;
                        }
                        e.this.b().e();
                        if (payTypeBean2.getPayType() == 3 && !payTypeBean2.isBalanceDegrade()) {
                            if (payTypeBean2.isBalanceSufficient(payTypeBean2.orderTotal)) {
                                e.this.b().a(3);
                            } else {
                                e.a(e.this, payTypeBean2, 1, i);
                            }
                        } else {
                            e.this.b().a(1);
                        }
                        e.this.b();
                    }
                }

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final void a(boolean z, int i2, String str2) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a663798b33ef946a2001b146584191b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a663798b33ef946a2001b146584191b1");
                    } else if (e.this.c()) {
                        e.this.b().e();
                        e.this.b().a(1);
                    }
                }
            }, this.e.a(str, this.h, this.i).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
        }
    }

    public final void a(final double d, final int i, final int i2) {
        Object[] objArr = {Double.valueOf(d), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cd3488623019f1069834d88e033ca14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cd3488623019f1069834d88e033ca14");
        } else if (c()) {
            b().d();
            a(rx.d.a(new com.meituan.android.legwork.net.subscriber.a<PayTypeBean>() { // from class: com.meituan.android.legwork.mvp.presenter.e.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final /* synthetic */ void a(PayTypeBean payTypeBean) {
                    PayTypeBean payTypeBean2 = payTypeBean;
                    int i3 = 1;
                    Object[] objArr2 = {payTypeBean2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2370c0639326c5c560467819ff9130c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2370c0639326c5c560467819ff9130c2");
                    } else if (e.this.c()) {
                        if (payTypeBean2 == null) {
                            a(false, -1, com.meituan.android.legwork.a.a().getString(R.string.legwork_network_connection_failed));
                            return;
                        }
                        e.this.b().e();
                        payTypeBean2.orderTotal = d;
                        payTypeBean2.orderPayType = i;
                        e.this.b();
                        int i4 = 2;
                        if (e.this.d == 2) {
                            if (i == 3 && !payTypeBean2.isBalanceDegrade()) {
                                if (payTypeBean2.isBalanceSufficient(d)) {
                                    e.this.b().a(3);
                                    return;
                                } else {
                                    e.a(e.this, payTypeBean2, 1, i2);
                                    return;
                                }
                            }
                            e.this.b().a(1);
                        } else if (e.this.d == 5) {
                            if (i == 3 && !payTypeBean2.isBalanceDegrade()) {
                                if (payTypeBean2.isBalanceSufficient(d)) {
                                    e.this.b().a(3);
                                    return;
                                } else {
                                    e.a(e.this, payTypeBean2, 1, i2);
                                    return;
                                }
                            }
                            e.this.b().a(1);
                        } else if (i == 0) {
                            if (payTypeBean2.isBalanceDegrade()) {
                                i4 = 5;
                            } else if (payTypeBean2.isBalanceSufficient(d)) {
                                i4 = 3;
                            }
                            e.a(e.this, payTypeBean2, i4, i2);
                        } else if (i == 3) {
                            if (payTypeBean2.isBalanceDegrade()) {
                                i3 = 5;
                            } else if (payTypeBean2.isBalanceSufficient(d)) {
                                i3 = 4;
                            }
                            e.a(e.this, payTypeBean2, i3, i2);
                        } else if (e.this.d == 3) {
                            if (payTypeBean2.isBalanceDegrade()) {
                                i4 = 5;
                            } else if (payTypeBean2.isBalanceSufficient(d)) {
                                i4 = 3;
                            }
                            e.a(e.this, payTypeBean2, i4, i2);
                        } else {
                            e.this.b().a(1);
                        }
                    }
                }

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final void a(boolean z, int i3, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i3), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00db66f00093989b3ea8d78da8680201", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00db66f00093989b3ea8d78da8680201");
                    } else if (e.this.c()) {
                        e.this.b().e();
                        if (!TextUtils.isEmpty(str)) {
                            ab.a(str);
                        }
                        PayTypeBean payTypeBean = new PayTypeBean();
                        payTypeBean.translateToOnlineBean(d);
                        e.a(e.this, payTypeBean, 5, i2);
                    }
                }
            }, this.e.a("", this.h, this.i).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
        }
    }

    public final void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9888fd95d990228c5657220f56d1d88f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9888fd95d990228c5657220f56d1d88f");
        } else if (c()) {
            b().d();
            a(rx.d.a(new com.meituan.android.legwork.net.subscriber.a<PayCashierBean>() { // from class: com.meituan.android.legwork.mvp.presenter.e.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final /* synthetic */ void a(PayCashierBean payCashierBean) {
                    PayCashierBean payCashierBean2 = payCashierBean;
                    Object[] objArr2 = {payCashierBean2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13152ee02e3cd9a700db7ead259abc08", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13152ee02e3cd9a700db7ead259abc08");
                    } else if (e.this.c()) {
                        if (payCashierBean2 == null || e.this.b().a() == null) {
                            a(false, -1, com.meituan.android.legwork.a.a().getString(R.string.legwork_network_connection_failed));
                            return;
                        }
                        e.this.b().e();
                        e.this.g = BalancePayFragment.a(str, payCashierBean2);
                        e.this.g.c = new BalancePayFragment.a() { // from class: com.meituan.android.legwork.mvp.presenter.e.4.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.legwork.ui.dialog.BalancePayFragment.a
                            public final void a(int i, String str2) {
                                Object[] objArr3 = {Integer.valueOf(i), str2};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1d9d7e4cde7f6e74e0b4f1ea2ff4ac0d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1d9d7e4cde7f6e74e0b4f1ea2ff4ac0d");
                                } else if (e.this.c()) {
                                    e.this.b().a(i, str2);
                                }
                            }

                            @Override // com.meituan.android.legwork.ui.dialog.BalancePayFragment.a
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0915d2f7c57f50ab490ab59c909135a7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0915d2f7c57f50ab490ab59c909135a7");
                                } else if (e.this.c()) {
                                    e.this.b().c();
                                }
                            }
                        };
                        if (e.this.b().a() != null) {
                            e.this.g.show(e.this.b().a(), "balance_pay");
                        }
                    }
                }

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final void a(boolean z, int i, String str2) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87f41d43021672ac00557e69df8c3d1c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87f41d43021672ac00557e69df8c3d1c");
                    } else if (e.this.c()) {
                        e.this.b().e();
                        if (!TextUtils.isEmpty(str2)) {
                            ab.a(str2);
                        }
                        e.this.b().a(1, str2);
                    }
                }
            }, this.e.a(str).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
        }
    }
}
