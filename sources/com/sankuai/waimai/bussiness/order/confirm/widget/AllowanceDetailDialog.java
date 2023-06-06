package com.sankuai.waimai.bussiness.order.confirm.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.judas.util.a;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompactFactory;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.meituan.android.knb.listener.OnWebClientListener;
import com.sankuai.waimai.business.order.api.submit.model.DiscountItem;
import com.sankuai.waimai.bussiness.order.base.utils.e;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.adapter.b;
import com.sankuai.waimai.bussiness.order.confirm.helper.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.emptylayout.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AllowanceDetailDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public boolean b;
    private long c;
    private String d;
    private LinearLayout e;
    private FrameLayout f;
    private LinearLayout g;
    private RecyclerView h;
    private TextView i;
    private TextView j;
    private Button k;
    private boolean l;
    private d m;
    private KNBWebCompat n;
    private FrameLayout o;

    public static /* synthetic */ void a(AllowanceDetailDialog allowanceDetailDialog, View view, final String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, allowanceDetailDialog, changeQuickRedirect, false, "37cc6dbb37c9a15cb3f039504e7383a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, allowanceDetailDialog, changeQuickRedirect, false, "37cc6dbb37c9a15cb3f039504e7383a7");
            return;
        }
        if (!allowanceDetailDialog.b) {
            allowanceDetailDialog.n = KNBWebCompactFactory.getKNBCompact(0);
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            allowanceDetailDialog.n.onCreate(allowanceDetailDialog.getContext(), bundle);
            allowanceDetailDialog.n.setAutoInflateTitleBar(false);
            allowanceDetailDialog.m = new d(allowanceDetailDialog.o);
            allowanceDetailDialog.m.a("c_ykhs39e");
            allowanceDetailDialog.m.c(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.widget.AllowanceDetailDialog.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36278a8f53cdd048a1f2ce924b39abdc", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36278a8f53cdd048a1f2ce924b39abdc");
                    } else if (AllowanceDetailDialog.this.a(str)) {
                        AllowanceDetailDialog.this.m.a(true).b("");
                        AllowanceDetailDialog.this.n.getWebHandler().reload();
                    }
                }
            });
            allowanceDetailDialog.n.setOnWebViewClientListener(new OnWebClientListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.widget.AllowanceDetailDialog.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                public final void onPageStarted(String str2, Bitmap bitmap) {
                }

                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                public final boolean shouldOverrideUrlLoading(String str2) {
                    return false;
                }

                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                public final void onPageFinished(String str2) {
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9c16e062cfe4cb564c4eff20772f6f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9c16e062cfe4cb564c4eff20772f6f0");
                        return;
                    }
                    if (!AllowanceDetailDialog.this.l) {
                        AllowanceDetailDialog.this.m.h();
                        if (AllowanceDetailDialog.this.k != null) {
                            AllowanceDetailDialog.this.k.setVisibility(0);
                        }
                    }
                    AllowanceDetailDialog.this.l = false;
                }

                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                public final void onReceivedError(int i, String str2, String str3) {
                    Object[] objArr2 = {Integer.valueOf(i), str2, str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14ac56ba2c3761d720350cfc9b439d04", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14ac56ba2c3761d720350cfc9b439d04");
                        return;
                    }
                    AllowanceDetailDialog.this.l = true;
                    if (AllowanceDetailDialog.this.k != null) {
                        AllowanceDetailDialog.this.k.setVisibility(8);
                    }
                    AllowanceDetailDialog.this.m.g();
                }

                @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
                public final void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError) {
                    Object[] objArr2 = {sslErrorHandler, sslError};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96a32f2dc95ead99011c5ac486360444", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96a32f2dc95ead99011c5ac486360444");
                        return;
                    }
                    AllowanceDetailDialog.this.l = true;
                    if (AllowanceDetailDialog.this.k != null) {
                        AllowanceDetailDialog.this.k.setVisibility(8);
                    }
                }
            });
            View onCreateView = allowanceDetailDialog.n.onCreateView(allowanceDetailDialog.getLayoutInflater(), allowanceDetailDialog.f);
            if (allowanceDetailDialog.a(str)) {
                allowanceDetailDialog.n.loadUrl(str);
            } else {
                allowanceDetailDialog.m.g();
                allowanceDetailDialog.k.setVisibility(8);
            }
            WebView webView = allowanceDetailDialog.n.getWebView();
            if (webView != null) {
                webView.getSettings().setTextZoom(120);
            }
            allowanceDetailDialog.f.addView(onCreateView);
            int measuredHeight = view.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = allowanceDetailDialog.e.getLayoutParams();
            layoutParams.height = measuredHeight;
            allowanceDetailDialog.e.setLayoutParams(layoutParams);
            allowanceDetailDialog.b = true;
        }
        allowanceDetailDialog.e.startAnimation(AnimationUtils.loadAnimation(allowanceDetailDialog.getContext(), R.anim.wm_order_confirm_allowance_rule_dialog_in));
        allowanceDetailDialog.e.setVisibility(0);
    }

    public static /* synthetic */ void a(AllowanceDetailDialog allowanceDetailDialog, DiscountItem.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, allowanceDetailDialog, changeQuickRedirect, false, "b913b3ce543c2b3db3bc322d353770e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, allowanceDetailDialog, changeQuickRedirect, false, "b913b3ce543c2b3db3bc322d353770e8");
        } else {
            JudasManualManager.b("b_waimai_8nh6kmgg_mc", "c_ykhs39e", allowanceDetailDialog.getContext()).a("price_per_usr", dVar.c).a("poi_id", i.a(allowanceDetailDialog.c, allowanceDetailDialog.d)).a("allowance_amt", dVar.d.a).a(allowanceDetailDialog.getContext()).a();
        }
    }

    public AllowanceDetailDialog(@NonNull Context context, final DiscountItem.d dVar, long j, String str) {
        super(context, R.style.wm_order_confirm_address_dialog_style);
        Object[] objArr = {context, dVar, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b01b7403ba8ca2d1786e15d187cacb3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b01b7403ba8ca2d1786e15d187cacb3a");
            return;
        }
        this.l = false;
        this.c = j;
        this.d = str;
        final View inflate = LayoutInflater.from(context).inflate(R.layout.wm_order_confirm_view_allowance_dialog, (ViewGroup) null);
        Object[] objArr2 = {dVar, inflate};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3467abce06c44a61acebe0637ef9c895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3467abce06c44a61acebe0637ef9c895");
        } else {
            Object[] objArr3 = {dVar, inflate};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f14a08e39875dee5a94f7e9ed9ea7057", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f14a08e39875dee5a94f7e9ed9ea7057");
            } else {
                this.e = (LinearLayout) inflate.findViewById(R.id.ll_rule_container);
                this.f = (FrameLayout) inflate.findViewById(R.id.fl_wv_container);
                this.o = (FrameLayout) inflate.findViewById(R.id.fl_web_container);
                this.g = (LinearLayout) inflate.findViewById(R.id.ll_reduction);
                this.h = (RecyclerView) inflate.findViewById(R.id.rv_allowance_foodlist);
                this.k = (Button) inflate.findViewById(R.id.btn_confirm2);
                this.i = (TextView) inflate.findViewById(R.id.txt_tltle);
                this.j = (TextView) inflate.findViewById(R.id.txt_rule_title);
                this.i.getPaint().setFakeBoldText(true);
                this.j.getPaint().setFakeBoldText(true);
                inflate.findViewById(R.id.txt_cancel).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.widget.AllowanceDetailDialog.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4ea99432aa3fcb83a1039d93b99ef9c2", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4ea99432aa3fcb83a1039d93b99ef9c2");
                            return;
                        }
                        if (AllowanceDetailDialog.this.n != null) {
                            AllowanceDetailDialog.this.n.onDestroy();
                        }
                        AllowanceDetailDialog.this.dismiss();
                    }
                });
                inflate.findViewById(R.id.btn_confirm).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.widget.AllowanceDetailDialog.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0cf6691a0bd88a8a42810de41be2ed7f", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0cf6691a0bd88a8a42810de41be2ed7f");
                        } else {
                            AllowanceDetailDialog.this.dismiss();
                        }
                    }
                });
                inflate.findViewById(R.id.btn_confirm2).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.widget.AllowanceDetailDialog.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c76bc1708c8325a17e61b0524c06e18a", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c76bc1708c8325a17e61b0524c06e18a");
                        } else {
                            AllowanceDetailDialog.this.dismiss();
                        }
                    }
                });
                if (!TextUtils.isEmpty(dVar.b) && !TextUtils.isEmpty(dVar.b.trim())) {
                    inflate.findViewById(R.id.txt_rule).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.widget.AllowanceDetailDialog.4
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b3e9615a7dbe76f7ca79d0f5856d74a0", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b3e9615a7dbe76f7ca79d0f5856d74a0");
                                return;
                            }
                            AllowanceDetailDialog.a(AllowanceDetailDialog.this, dVar);
                            AllowanceDetailDialog.a(AllowanceDetailDialog.this, inflate, dVar.b.trim());
                        }
                    });
                }
                inflate.findViewById(R.id.iv_rule_back).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.widget.AllowanceDetailDialog.5
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "babfb13d5410e02214291a4138444313", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "babfb13d5410e02214291a4138444313");
                            return;
                        }
                        Animation loadAnimation = AnimationUtils.loadAnimation(AllowanceDetailDialog.this.getContext(), R.anim.wm_order_confirm_allowance_rule_dialog_out);
                        AllowanceDetailDialog.this.e.startAnimation(loadAnimation);
                        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.widget.AllowanceDetailDialog.5.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationRepeat(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationStart(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                Object[] objArr5 = {animation};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8c2e3d93a42ef613ef6daf42b13a745b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8c2e3d93a42ef613ef6daf42b13a745b");
                                } else {
                                    AllowanceDetailDialog.this.e.setVisibility(8);
                                }
                            }
                        });
                    }
                });
            }
            a(inflate, dVar.d);
            DiscountItem.d.a aVar = dVar.e;
            Object[] objArr4 = {inflate, aVar};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "de9bc3bab1940e63bfff3888e0f4b90d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "de9bc3bab1940e63bfff3888e0f4b90d");
            } else if (aVar != null) {
                if (aVar.a == 1 && aVar.b && aVar.c != null) {
                    this.h.setVisibility(8);
                    this.g.setVisibility(0);
                    Object[] objArr5 = {inflate, aVar};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f2d4ea22aca29451635aa8cd19b47fc5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f2d4ea22aca29451635aa8cd19b47fc5");
                    } else {
                        ((TextView) inflate.findViewById(R.id.txt_reduction_tip)).setText(aVar.c.a);
                        ((TextView) inflate.findViewById(R.id.txt_reduction_reduce)).setText(getContext().getString(R.string.wm_order_confirm_allowance_dialog_reduce, aVar.c.b));
                    }
                } else if (aVar.a == 2 && aVar.d != null && !aVar.d.isEmpty()) {
                    this.h.setVisibility(0);
                    this.g.setVisibility(8);
                    Object[] objArr6 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "374d5b43b4daf64ad113bc656a2f4f29", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "374d5b43b4daf64ad113bc656a2f4f29");
                    } else {
                        this.h.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                        this.h.setAdapter(new b(getContext(), aVar.d));
                    }
                }
            }
        }
        Object[] objArr7 = {inflate};
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "05a5e3fadc68ee9e0dc0dab39a12ef30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "05a5e3fadc68ee9e0dc0dab39a12ef30");
            return;
        }
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        setContentView(inflate);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56c7407be388ddb3643b3644a06008d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56c7407be388ddb3643b3644a06008d9");
            return;
        }
        super.dismiss();
        if (this.n != null) {
            this.n.onDestroy();
        }
    }

    private void a(View view, DiscountItem.d.f fVar) {
        Object[] objArr = {view, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ee0b17fbbc7b345192d982a755aa11a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ee0b17fbbc7b345192d982a755aa11a");
        } else if (fVar == null) {
        } else {
            TextView textView = (TextView) view.findViewById(R.id.txt_tip_reduce);
            String string = getContext().getString(R.string.wm_order_confirm_allowance_dialog_reduce, fVar.a);
            if (TextUtils.isEmpty(string)) {
                string = "0";
            }
            h.a(textView, string, e.a(), getContext().getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_allowance_small_price_symbol), getContext().getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_allowance_large_price_symbol));
            TextView textView2 = (TextView) view.findViewById(R.id.txt_tip_msg);
            if (!fVar.b || fVar.c == null || TextUtils.isEmpty(fVar.c.a)) {
                textView2.setVisibility(8);
                return;
            }
            textView2.setText(fVar.c.a);
            if (!TextUtils.isEmpty(fVar.c.b)) {
                try {
                    textView2.setTextColor(Color.parseColor(fVar.c.b));
                } catch (Exception e) {
                    a.a(e);
                }
            }
            textView2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b92c3e0be5632efe5d0872f5a71467fb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b92c3e0be5632efe5d0872f5a71467fb")).booleanValue() : str.startsWith(AbsApiFactory.HTTP) || str.startsWith(AbsApiFactory.HTTPS);
    }
}
