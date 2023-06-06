package com.sankuai.waimai.store.drug.coupons;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.f;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.platform.restaurant.membercoupon.MemberCouponListOutput;
import com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment;
import com.sankuai.waimai.platform.restaurant.membercoupon.d;
import com.sankuai.waimai.store.base.BaseCustomLinearLayout;
import com.sankuai.waimai.store.base.BaseMemberActivity;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.mmp.TabItem;
import com.sankuai.waimai.store.drug.mmp.dialog.MedMmpDialogFragment;
import com.sankuai.waimai.store.drug.newwidgets.indicator.SCPageFragmentAdapter;
import com.sankuai.waimai.store.ui.common.SGBaseDialogFragment;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.view.banner.SCBaseViewPager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CouponsDialogFragment extends SGBaseDialogFragment implements com.sankuai.waimai.store.expose.v2.a {
    public static ChangeQuickRedirect a;
    private SCBaseViewPager b;
    private SCPageFragmentAdapter d;
    private CouponsTitleWithIndicator e;
    private int f;
    private String g;
    private ArrayList<TabItem> h;
    private TextView i;
    private int j;

    @Override // com.sankuai.waimai.store.expose.v2.a
    public final /* synthetic */ Activity bB_() {
        return super.getActivity();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13aa7975fc80578a11bfbdc03e77609e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13aa7975fc80578a11bfbdc03e77609e");
        } else {
            super.onActivityCreated(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View decorView;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ea600931eee3a670d94acdbce9024d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ea600931eee3a670d94acdbce9024d9");
        }
        Context context = getContext();
        if (context == null) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("page_height")) {
            this.j = arguments.getInt("page_height", 0);
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1055064fe82243186147fd671a86422", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1055064fe82243186147fd671a86422");
        } else {
            Window window = getDialog().getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                    attributes.gravity = 80;
                    attributes.width = h.a(context);
                    attributes.height = this.j > 0 ? h.a(context, this.j) : -2;
                    window.setAttributes(attributes);
                }
                decorView.setPadding(0, 0, 0, 0);
                decorView.setBackgroundResource(R.color.transparent);
            }
        }
        BaseCustomLinearLayout baseCustomLinearLayout = (BaseCustomLinearLayout) layoutInflater.inflate(R.layout.wm_drug_common_coupons_view, viewGroup, false);
        double b = h.b(context);
        baseCustomLinearLayout.setMaximumHeight((int) (0.8d * b));
        baseCustomLinearLayout.setMinimumHeight((int) (b * 0.6d));
        baseCustomLinearLayout.setBackground(getResources().getDrawable(R.drawable.wm_drug_bg_poi_conpon));
        getDialog().setOnDismissListener(this);
        return baseCustomLinearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // android.support.v4.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        com.sankuai.waimai.store.drug.newwidgets.indicator.a aVar;
        Iterator<TabItem> it;
        MedMmpDialogFragment medMmpDialogFragment;
        int b;
        RNFloatCouponMemberFragment rNFloatCouponMemberFragment;
        int i = 0;
        int i2 = 1;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "445b0d9abc6698d50aadeb717571e8c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "445b0d9abc6698d50aadeb717571e8c4");
            return;
        }
        com.sankuai.waimai.store.expose.v2.b.a().a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.g = arguments.getString("drug_extra_data");
            this.h = (ArrayList) i.a(arguments.getString("tab_info"), new TypeToken<List<TabItem>>() { // from class: com.sankuai.waimai.store.drug.coupons.CouponsDialogFragment.1
            }.getType());
        }
        this.f = f.b(a("select_index"));
        this.b = (SCBaseViewPager) view.findViewById(R.id.pager);
        this.i = (TextView) view.findViewById(R.id.dialog_middle_text);
        this.d = new SCPageFragmentAdapter(getChildFragmentManager());
        this.b.setAdapter(this.d);
        this.b.setNoScroll(true);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "359a43bb66f2032bc9d4e0faab7bf0bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "359a43bb66f2032bc9d4e0faab7bf0bb");
        } else {
            this.e = (CouponsTitleWithIndicator) view.findViewById(R.id.indicator);
            this.e.setEnableScroll(true);
            this.e.setBackgroundColor(0);
            this.e.setIndicatorColor(Color.parseColor("#FFCC33"));
            this.e.getTabLayout().setTabGravity(0);
            this.e.setIndicatorHeight(h.a(view.getContext(), 2.0f));
            this.e.setIndicatorWidth(h.a(view.getContext(), 20.0f));
            this.e.setTextSize(15.0f);
            this.e.a(Color.parseColor("#575859"), Color.parseColor("#222426"));
            this.e.setupWithViewPager(this.b);
        }
        view.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.coupons.CouponsDialogFragment.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr3 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "984c052c09ed48fc4eee91f2f590ddd2", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "984c052c09ed48fc4eee91f2f590ddd2");
                    return;
                }
                CouponsDialogFragment.this.dismissAllowingStateLoss();
                com.sankuai.waimai.store.manager.judas.b.a(CouponsDialogFragment.this.getContext(), "b_waimai_sg_pbi474ow_mc").a("poi_id", CouponsDialogFragment.this.a("poi_id")).a();
            }
        });
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3b5f1db9c6c2f0122cbeb6e097eacd3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3b5f1db9c6c2f0122cbeb6e097eacd3f");
        } else {
            ArrayList arrayList = new ArrayList();
            if (!com.sankuai.shangou.stone.util.a.b(this.h)) {
                Iterator<TabItem> it2 = this.h.iterator();
                while (it2.hasNext()) {
                    TabItem next = it2.next();
                    if (next == null) {
                        break;
                    }
                    if (next.tabCode == i2) {
                        com.sankuai.waimai.store.drug.newwidgets.indicator.a aVar2 = new com.sankuai.waimai.store.drug.newwidgets.indicator.a();
                        Object[] objArr4 = new Object[i];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b6d8e8712cce10a6ea2a9db39a8ea909", RobustBitConfig.DEFAULT_VALUE)) {
                            rNFloatCouponMemberFragment = (RNFloatCouponMemberFragment) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, i, "b6d8e8712cce10a6ea2a9db39a8ea909");
                            it = it2;
                        } else {
                            RNFloatCouponMemberFragment rNFloatCouponMemberFragment2 = new RNFloatCouponMemberFragment();
                            Bundle bundle2 = new Bundle();
                            long a2 = f.a(a("poi_id"));
                            bundle2.putLong("poi_id", a2);
                            rNFloatCouponMemberFragment2.setArguments(bundle2);
                            d dVar = new d();
                            dVar.a = a2;
                            if (getActivity() != null && (getActivity() instanceof SCBaseActivity)) {
                                dVar.c = ((SCBaseActivity) getActivity()).w();
                            }
                            dVar.d = a("cid");
                            dVar.f = 1;
                            Object[] objArr5 = new Object[i];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            it = it2;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "56b87f03f6aeb0ee54123ddbf446ee38", RobustBitConfig.DEFAULT_VALUE)) {
                                b = ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "56b87f03f6aeb0ee54123ddbf446ee38")).intValue();
                            } else {
                                b = getContext() != null ? (int) ((h.b(getContext(), h.b(getContext())) * 0.8d) - 50.0d) : 0;
                            }
                            dVar.e = b;
                            rNFloatCouponMemberFragment2.a(dVar);
                            rNFloatCouponMemberFragment2.h = new com.sankuai.waimai.platform.restaurant.membercoupon.f() { // from class: com.sankuai.waimai.store.drug.coupons.CouponsDialogFragment.4
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
                                public final void a(@NonNull MemberCouponListOutput memberCouponListOutput) {
                                }

                                @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
                                public final void b(String str) {
                                }

                                @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
                                public final void h() {
                                }

                                @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
                                public final void i() {
                                    Object[] objArr6 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f0448aaecdc716684d4b432167b3b5c0", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f0448aaecdc716684d4b432167b3b5c0");
                                    } else {
                                        CouponsDialogFragment.this.dismissAllowingStateLoss();
                                    }
                                }
                            };
                            rNFloatCouponMemberFragment = rNFloatCouponMemberFragment2;
                        }
                        aVar2.b = rNFloatCouponMemberFragment;
                        aVar2.e = next.tabCode;
                        aVar2.c = 0;
                        aVar2.d = next.tabTitle;
                        arrayList.add(aVar2);
                    } else {
                        it = it2;
                        if (!t.a(next.scheme)) {
                            MedMmpDialogFragment.a aVar3 = new MedMmpDialogFragment.a();
                            aVar3.b = next.scheme;
                            aVar3.e = true;
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = MedMmpDialogFragment.a.a;
                            if (PatchProxy.isSupport(objArr6, aVar3, changeQuickRedirect6, false, "f23e6e28a06f4572539d89b3f1afab37", RobustBitConfig.DEFAULT_VALUE)) {
                                medMmpDialogFragment = (MedMmpDialogFragment) PatchProxy.accessDispatch(objArr6, aVar3, changeQuickRedirect6, false, "f23e6e28a06f4572539d89b3f1afab37");
                            } else {
                                MedMmpDialogFragment medMmpDialogFragment2 = new MedMmpDialogFragment();
                                Bundle bundle3 = new Bundle();
                                bundle3.putFloat("page_height", aVar3.c);
                                bundle3.putFloat("dim", aVar3.d);
                                bundle3.putBoolean("need_activity_result", aVar3.e);
                                bundle3.putString("mmp_scheme_uri", aVar3.b);
                                medMmpDialogFragment2.setArguments(bundle3);
                                medMmpDialogFragment2.setStyle(2, R.style.RetailCommonMRNDialog);
                                medMmpDialogFragment = medMmpDialogFragment2;
                            }
                            com.sankuai.waimai.store.drug.newwidgets.indicator.a aVar4 = new com.sankuai.waimai.store.drug.newwidgets.indicator.a();
                            aVar4.b = medMmpDialogFragment;
                            aVar4.e = next.tabCode;
                            aVar4.c = 0;
                            aVar4.d = next.tabTitle;
                            arrayList.add(aVar4);
                        }
                    }
                    it2 = it;
                    i = 0;
                    i2 = 1;
                }
            }
            Object[] objArr7 = {arrayList};
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "d774b688dcfa722b4269904f327d060d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "d774b688dcfa722b4269904f327d060d");
            } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList)) {
                this.b.setOffscreenPageLimit(arrayList.size() - 1);
                SCPageFragmentAdapter sCPageFragmentAdapter = this.d;
                Object[] objArr8 = {arrayList};
                ChangeQuickRedirect changeQuickRedirect8 = SCPageFragmentAdapter.a;
                if (PatchProxy.isSupport(objArr8, sCPageFragmentAdapter, changeQuickRedirect8, false, "16560c9b62c757d4e9c4f0d206d85b46", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, sCPageFragmentAdapter, changeQuickRedirect8, false, "16560c9b62c757d4e9c4f0d206d85b46");
                } else {
                    sCPageFragmentAdapter.b.clear();
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList)) {
                        sCPageFragmentAdapter.b.addAll(arrayList);
                    }
                    sCPageFragmentAdapter.notifyDataSetChanged();
                }
                this.e.setScTitleTabData(arrayList);
                this.e.setCurrentPosition(this.f);
                this.b.setCurrentItem(this.f);
                this.e.setVisibility(arrayList.size() > 1 ? 0 : 8);
                this.i.setVisibility(arrayList.size() <= 1 ? 0 : 8);
                if (arrayList.size() == 1 && (aVar = (com.sankuai.waimai.store.drug.newwidgets.indicator.a) arrayList.get(0)) != null) {
                    this.i.setText(aVar.d);
                }
            }
        }
        this.b.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.store.drug.coupons.CouponsDialogFragment.3
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i3) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i3, float f, int i4) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i3) {
                int i4;
                Object[] objArr9 = {Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "d874becda7bf7ab3436b1a7ea4fe0619", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "d874becda7bf7ab3436b1a7ea4fe0619");
                } else if (CouponsDialogFragment.this.d != null) {
                    com.sankuai.waimai.store.callback.a a3 = com.sankuai.waimai.store.manager.judas.b.a(CouponsDialogFragment.this.getContext(), "b_waimai_sg_jgonyivk_mc").a("poi_id", CouponsDialogFragment.this.a("poi_id")).a("stid", CouponsDialogFragment.this.a("stid"));
                    SCPageFragmentAdapter sCPageFragmentAdapter2 = CouponsDialogFragment.this.d;
                    Object[] objArr10 = {Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect10 = SCPageFragmentAdapter.a;
                    if (PatchProxy.isSupport(objArr10, sCPageFragmentAdapter2, changeQuickRedirect10, false, "a815fe8cbbaa8a2c26b4f77126273008", RobustBitConfig.DEFAULT_VALUE)) {
                        i4 = ((Integer) PatchProxy.accessDispatch(objArr10, sCPageFragmentAdapter2, changeQuickRedirect10, false, "a815fe8cbbaa8a2c26b4f77126273008")).intValue();
                    } else {
                        com.sankuai.waimai.store.drug.newwidgets.indicator.a aVar5 = (com.sankuai.waimai.store.drug.newwidgets.indicator.a) com.sankuai.shangou.stone.util.a.a((List<Object>) sCPageFragmentAdapter2.b, i3);
                        i4 = aVar5 != null ? aVar5.e : -999;
                    }
                    a3.a("tab_code", Integer.valueOf(i4)).a();
                }
            }
        });
    }

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f131d8821da934d393e7619adac8da37", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f131d8821da934d393e7619adac8da37");
        }
        setStyle(1, 0);
        return super.onCreateDialog(bundle);
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b8b9a27bfba79f5d79fe0937d6eded2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b8b9a27bfba79f5d79fe0937d6eded2");
            return;
        }
        super.onDismiss(dialogInterface);
        Activity d = d();
        if (d instanceof BaseMemberActivity) {
            d.finish();
            d.overridePendingTransition(0, R.anim.wm_sc_common_dialog_alpha_out);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b784edfa2bcb66f8ee9797a55c8c3386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b784edfa2bcb66f8ee9797a55c8c3386");
            return;
        }
        super.onCancel(dialogInterface);
        com.sankuai.shangou.stone.util.log.a.a("chuntong", "onCancel", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea5a21aab5978a06e1079adbb01ee9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea5a21aab5978a06e1079adbb01ee9e");
        }
        if (this.g == null) {
            return null;
        }
        try {
            return new JSONObject(this.g).optString(str);
        } catch (JSONException e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return null;
        }
    }

    @Override // com.sankuai.waimai.store.expose.v2.a
    public final View f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afdfc46e68b384e4b7eefb8faf297833", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afdfc46e68b384e4b7eefb8faf297833") : getView();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d9e0168166bc1168f66cd2afc83ea91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d9e0168166bc1168f66cd2afc83ea91");
            return;
        }
        super.onResume();
        com.sankuai.waimai.store.expose.v2.b.a().c(this);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9df21e3fbc457b58b29741d73e88b1e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9df21e3fbc457b58b29741d73e88b1e3");
            return;
        }
        super.onPause();
        com.sankuai.waimai.store.expose.v2.b.a().e(this);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c860271cca8478133714c7ef4a174028", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c860271cca8478133714c7ef4a174028");
            return;
        }
        super.onStop();
        com.sankuai.waimai.store.expose.v2.b.a().f(this);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6832a684800cdf107cdfafdbd18923dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6832a684800cdf107cdfafdbd18923dd");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.expose.v2.b.a().b(this);
    }
}
