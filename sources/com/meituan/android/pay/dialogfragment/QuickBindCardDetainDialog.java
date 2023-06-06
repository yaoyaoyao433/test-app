package com.meituan.android.pay.dialogfragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.dialogfragment.QuickBindCardDetainDialogFragment;
import com.meituan.android.pay.model.PayErrorCode;
import com.meituan.android.pay.model.bean.PopWindowInfo;
import com.meituan.android.pay.model.bean.QuickBankDetail;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class QuickBindCardDetainDialog extends BaseDialog {
    public static ChangeQuickRedirect a;
    private QuickBindCardDetainDialogFragment.a b;
    private PopWindowInfo e;
    private ArrayList<QuickBankDetail> f;
    private HashMap<String, Object> g;
    private View.OnClickListener h;
    private Activity i;

    public QuickBindCardDetainDialog(Activity activity, PopWindowInfo popWindowInfo, ArrayList<QuickBankDetail> arrayList, HashMap<String, Object> hashMap, QuickBindCardDetainDialogFragment.a aVar, View.OnClickListener onClickListener) {
        super(activity);
        Object[] objArr = {activity, popWindowInfo, arrayList, hashMap, aVar, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8aa28bf24dd0b34f9eca1ba79cace02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8aa28bf24dd0b34f9eca1ba79cace02");
            return;
        }
        this.i = activity;
        this.b = aVar;
        this.e = popWindowInfo;
        this.f = arrayList;
        this.g = hashMap;
        this.h = onClickListener;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0328edf122118dced8fa94e1e8ef8659", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0328edf122118dced8fa94e1e8ef8659");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b287a490f551ae7b69f55dd6978649a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b287a490f551ae7b69f55dd6978649a");
        } else {
            requestWindowFeature(1);
            getWindow().setBackgroundDrawableResource(17170445);
            setContentView(R.layout.mpay__quickbind_card_detain_dialog_layout);
            Button button = (Button) findViewById(R.id.mpay__btn_left);
            Button button2 = (Button) findViewById(R.id.mpay__btn_right);
            final ListView listView = (ListView) findViewById(R.id.mpay__quick_bindcard_list);
            TextView textView = (TextView) findViewById(R.id.mpay__dialog_title);
            TextView textView2 = (TextView) findViewById(R.id.mpay__dialog_sub_title);
            ImageView imageView = (ImageView) findViewById(R.id.mpay__dialog_icon);
            final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mpay__dialog_view);
            final View findViewById = findViewById(R.id.mpay__quick_bindcard_list_bottom);
            if (com.meituan.android.pay.desk.component.data.b.f(this.i)) {
                button.setOnClickListener(this.h);
            } else {
                button.setOnClickListener(o.a(this));
            }
            button2.setOnClickListener(p.a(this));
            listView.setAdapter((ListAdapter) new com.meituan.android.pay.adapter.b(getContext(), this.f));
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.meituan.android.pay.dialogfragment.QuickBindCardDetainDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    Object[] objArr3 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "176b09c6f728b1fb5725ad28afc73f63", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "176b09c6f728b1fb5725ad28afc73f63");
                    } else if (QuickBindCardDetainDialog.this.b != null) {
                        QuickBindCardDetainDialog.this.b.a(((QuickBankDetail) QuickBindCardDetainDialog.this.f.get(i)).getProtocolSign());
                        QuickBindCardDetainDialog.this.g.put("bank_name", ((QuickBankDetail) QuickBindCardDetainDialog.this.f.get(i)).getName());
                        com.meituan.android.pay.common.analyse.b.a("c_pay_25o5hq2j", "b_pay_fjnhhvn6_mc", "挽留弹框 - 点击极速绑卡item", QuickBindCardDetainDialog.this.g, ae.a.CLICK, QuickBindCardDetainDialog.this.b());
                        QuickBindCardDetainDialog.this.dismiss();
                    }
                }
            });
            textView.setText(this.e.getTitle());
            button.setText(this.e.getLeftButton());
            button2.setText(this.e.getRightButton());
            if (TextUtils.isEmpty(this.e.getSubTitle())) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(this.e.getSubTitle());
            }
            if (TextUtils.isEmpty(this.e.getSubTitleIcon())) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                com.meituan.android.paycommon.lib.config.a.a().r().a(this.e.getSubTitleIcon()).a(imageView);
            }
            Object[] objArr3 = {linearLayout, listView, findViewById};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8176a148617026a8c2ed8f42084eac63", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8176a148617026a8c2ed8f42084eac63");
            } else {
                linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.android.pay.dialogfragment.QuickBindCardDetainDialog.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "60f7c03c2f35f9eae4e497bd8248d475", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "60f7c03c2f35f9eae4e497bd8248d475");
                            return;
                        }
                        linearLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        int height = (int) (((WindowManager) QuickBindCardDetainDialog.this.getContext().getSystemService("window")).getDefaultDisplay().getHeight() * 0.75d);
                        if (linearLayout.getHeight() > height) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                            layoutParams.height = height;
                            linearLayout.setLayoutParams(layoutParams);
                            findViewById.setVisibility(0);
                            listView.setPadding(0, 0, 0, aj.a(QuickBindCardDetainDialog.this.getContext(), 30.0f));
                            return;
                        }
                        findViewById.setVisibility(8);
                        listView.setPadding(0, 0, 0, aj.a(QuickBindCardDetainDialog.this.getContext(), 0.0f));
                    }
                });
            }
        }
        com.meituan.android.pay.common.analyse.b.a("c_pay_25o5hq2j", "b_pay_jqti9cga_mv", "挽留弹框 - 极速绑卡", this.g, ae.a.VIEW, b());
    }

    public static /* synthetic */ void b(QuickBindCardDetainDialog quickBindCardDetainDialog, View view) {
        Object[] objArr = {quickBindCardDetainDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b96cfd676bc2227145b83f6bae87921", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b96cfd676bc2227145b83f6bae87921");
            return;
        }
        quickBindCardDetainDialog.dismiss();
        PayActivity.b(quickBindCardDetainDialog.i, "退出签约支付", PayErrorCode.VERIFY_BANK_INFO_CANCEL);
        com.meituan.android.pay.common.analyse.b.a("c_pay_25o5hq2j", "b_pay_m8ey52j7_mc", "挽留弹框 - 点击确认离开", quickBindCardDetainDialog.g, ae.a.CLICK, quickBindCardDetainDialog.b());
    }

    public static /* synthetic */ void a(QuickBindCardDetainDialog quickBindCardDetainDialog, View view) {
        Object[] objArr = {quickBindCardDetainDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82c5cc64e19eb221b94a969d9d4c1db9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82c5cc64e19eb221b94a969d9d4c1db9");
            return;
        }
        quickBindCardDetainDialog.dismiss();
        com.meituan.android.pay.common.analyse.b.a("c_pay_25o5hq2j", "b_pay_lme47fx9_mc", "挽留弹框 - 点击继续支付", quickBindCardDetainDialog.g, ae.a.CLICK, quickBindCardDetainDialog.b());
    }
}
