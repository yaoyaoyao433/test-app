package com.meituan.android.pay.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.adapter.a;
import com.meituan.android.pay.model.BankCardListChooseType;
import com.meituan.android.pay.model.bean.BankCard;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.model.bean.Banks;
import com.meituan.android.pay.widget.view.PinnedHeaderListView;
import com.meituan.android.pay.widget.view.QuickAlphabeticBar;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paycommon.lib.fragment.PayListFragment;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MTCBanksFragment extends PayListFragment implements AbsListView.OnScrollListener, QuickAlphabeticBar.a, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private double g;
    @MTPayNeedToPersist
    private Banks h;
    private QuickAlphabeticBar i;
    private final List<a> j;
    private ArrayList<Integer> k;
    private BankInfo l;
    @MTPayNeedToPersist
    private a.d m;

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final String d() {
        return "c_nux4lg9r";
    }

    public MTCBanksFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ca0ba13b7f5f2bc5045498b583aad37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ca0ba13b7f5f2bc5045498b583aad37");
            return;
        }
        this.j = new ArrayList();
        this.m = a.d.DEBIT;
    }

    @Override // com.meituan.android.paycommon.lib.fragment.PayListFragment
    public final com.meituan.android.paycommon.lib.assist.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9d92720e77333ec7f86bad753e4b9ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.paycommon.lib.assist.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9d92720e77333ec7f86bad753e4b9ac");
        }
        FragmentActivity activity = getActivity();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        return new com.meituan.android.pay.adapter.a(activity, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0ed17f7e0c2f47d1ed49c1b456a38b88", RobustBitConfig.DEFAULT_VALUE) ? (a.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0ed17f7e0c2f47d1ed49c1b456a38b88") : new f(this));
    }

    public static /* synthetic */ void a(MTCBanksFragment mTCBanksFragment, a.d dVar) {
        Object[] objArr = {mTCBanksFragment, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8176b3c3dd932fc80bebf14be3a68fa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8176b3c3dd932fc80bebf14be3a68fa6");
            return;
        }
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, mTCBanksFragment, changeQuickRedirect2, false, "f3e107d958942bf63a102af4803f778a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mTCBanksFragment, changeQuickRedirect2, false, "f3e107d958942bf63a102af4803f778a");
            return;
        }
        mTCBanksFragment.m = dVar;
        for (a aVar : mTCBanksFragment.j) {
            if (aVar.d == dVar) {
                mTCBanksFragment.a(aVar);
            }
        }
    }

    @Override // com.meituan.android.paycommon.lib.fragment.PayListFragment, com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ac25b6c7dee5fa7a91aa273117270b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ac25b6c7dee5fa7a91aa273117270b6");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.l = (BankInfo) getArguments().get("bankInfo");
            if (this.l != null) {
                this.h = this.l.getBanks();
                this.g = this.l.getOrderMoney();
            }
        }
    }

    @Override // com.meituan.android.paycommon.lib.fragment.PayListFragment
    @SuppressLint({"InflateParams"})
    public final View c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9558f933427e58656648e99e5009f77", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9558f933427e58656648e99e5009f77");
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getActivity()).inflate(R.layout.mpay__fragment_bank_list, (ViewGroup) null, false);
        this.i = (QuickAlphabeticBar) LayoutInflater.from(getActivity()).inflate(R.layout.mpay__listview_alphabar, viewGroup, false);
        this.i.setOnTouchListener(g.a());
        viewGroup.addView(this.i);
        Object[] objArr2 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3de4af205bea538379638a2bebb4406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3de4af205bea538379638a2bebb4406");
        } else if (viewGroup != null) {
            Toolbar toolbar = (Toolbar) viewGroup.findViewById(R.id.mapy__fragment_bank_list_title);
            toolbar.setTitle(R.string.mpay__banklist_title);
            toolbar.setNavigationOnClickListener(h.a(this));
        }
        return viewGroup;
    }

    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09a2776e3c046c3011cba2088325e504", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09a2776e3c046c3011cba2088325e504")).booleanValue();
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    public static /* synthetic */ void a(MTCBanksFragment mTCBanksFragment, View view) {
        Object[] objArr = {mTCBanksFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8118a24cb7606eb1d55ab9ee3ce7d133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8118a24cb7606eb1d55ab9ee3ce7d133");
        } else {
            mTCBanksFragment.getActivity().onBackPressed();
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b00583123145a7b7673655902c9e36c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b00583123145a7b7673655902c9e36c7");
            return;
        }
        super.onActivityCreated(bundle);
        a(this.h);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d2d0f2c73fae1a36a9c9d2df2b219e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d2d0f2c73fae1a36a9c9d2df2b219e0")).booleanValue();
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_ehibacvd_mc", "点击返回", (Map<String, Object>) null, a.EnumC0329a.CLICK, -1);
        return super.h();
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e897f97241b83c64ea20f6af5daf249e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e897f97241b83c64ea20f6af5daf249e");
            return;
        }
        super.onStart();
        com.meituan.android.paybase.common.analyse.a.c("b_RcYVq", "POP", null);
    }

    @Override // com.meituan.android.paycommon.lib.fragment.PayListFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e7d7ffb968895ef7c9ee2092efe220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e7d7ffb968895ef7c9ee2092efe220");
            return;
        }
        super.onViewCreated(view, bundle);
        f().setCacheColorHint(0);
        f().setFastScrollEnabled(false);
        f().setOnScrollListener(this);
        this.i.setOnTouchingLetterChangedListener(this);
    }

    private void a(Banks banks) {
        Object[] objArr = {banks};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34aaf228b1d019ec41d0fd42c1494182", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34aaf228b1d019ec41d0fd42c1494182");
        } else if (banks == null || (com.meituan.android.paybase.utils.i.a((Collection) banks.getCredit()) && com.meituan.android.paybase.utils.i.a((Collection) banks.getDebit()))) {
            com.meituan.android.paybase.dialog.e.a((Activity) getActivity(), (Object) Integer.valueOf((int) R.string.mpay__no_banks));
            try {
                getActivity().getSupportFragmentManager().popBackStack();
            } catch (RuntimeException e) {
                com.meituan.android.pay.common.analyse.b.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "MTCBanksFragment_handleBanks").a("message", e.getMessage()).b, r());
            }
        } else {
            b(banks);
            for (a aVar : this.j) {
                if (aVar.d == this.m) {
                    a(aVar);
                }
            }
        }
    }

    private void b(Banks banks) {
        Object[] objArr = {banks};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f317b8a88dc2c11595d54c04ec0868db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f317b8a88dc2c11595d54c04ec0868db");
            return;
        }
        List<BankCard> credit = banks.getCredit();
        List<BankCard> debit = banks.getDebit();
        a(debit, this.g, a.d.DEBIT, !com.meituan.android.paybase.utils.i.a((Collection) credit));
        a(credit, this.g, a.d.CREDIT, !com.meituan.android.paybase.utils.i.a((Collection) debit));
    }

    private void a(List<BankCard> list, double d, a.d dVar, boolean z) {
        Object[] objArr = {list, Double.valueOf(d), dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74e3e0b4299b179e04a0f3704f873966", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74e3e0b4299b179e04a0f3704f873966");
        } else if (list == null) {
        } else {
            this.j.add(new a(g(), list, d, dVar, z));
            this.c.notifyDataSetChanged();
        }
    }

    private int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10661f6cc5ff37930bfd8413aa069e77", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10661f6cc5ff37930bfd8413aa069e77")).intValue() : this.j.size();
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cd01d6e846cc0e5b0e6400bb78cb480", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cd01d6e846cc0e5b0e6400bb78cb480");
        } else if (i == 0) {
            if (obj != null) {
                this.h = (Banks) obj;
                a(this.h);
            }
        } else if (i == 827 && (obj instanceof BankInfo)) {
            com.meituan.android.pay.process.f.a((Activity) getActivity()).c(getActivity(), (BankInfo) obj);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c474eedfbd404c01cb394ab5fc8e4e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c474eedfbd404c01cb394ab5fc8e4e0");
        } else if (i == 827) {
            com.meituan.android.pay.utils.s.a(getActivity(), exc, 3);
        }
    }

    @Override // com.meituan.android.paycommon.lib.fragment.PayListFragment, com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d884eefa799af3d89ce93a3a6b770076", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d884eefa799af3d89ce93a3a6b770076");
        } else {
            hideProgress();
        }
    }

    @Override // com.meituan.android.paycommon.lib.fragment.PayListFragment, com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82ab5c34d0fc4387fe87eb2f85f152b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82ab5c34d0fc4387fe87eb2f85f152b8");
        } else {
            showProgress();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        Object[] objArr = {absListView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798c49b3dfa67642a7341d7a7eb12869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798c49b3dfa67642a7341d7a7eb12869");
        } else if (i == 0) {
            Metrics.getInstance().stopCustomFPS(MTCBanksFragment.class.getName());
        } else if (i == 1) {
            Metrics.getInstance().startCustomFPS(MTCBanksFragment.class.getName());
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        Object[] objArr = {absListView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9523ba91ff994ec941047860b6904661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9523ba91ff994ec941047860b6904661");
        } else {
            ((PinnedHeaderListView) f()).a(absListView, (com.meituan.android.pay.adapter.a) this.c, i, i2, i3);
        }
    }

    @Override // com.meituan.android.pay.widget.view.QuickAlphabeticBar.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a812085f7fff66e672ff5212ff57320a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a812085f7fff66e672ff5212ff57320a");
        } else {
            f().setSelection(this.k.get(i).intValue());
        }
    }

    private void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a84bb68d6f1be67f1271eb9ecaf3014a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a84bb68d6f1be67f1271eb9ecaf3014a");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.k = new ArrayList<>();
        List<BankCard> b = b(aVar.b);
        arrayList.add(getString(R.string.mpay__choose_card_type));
        arrayList.add(new BankCardListChooseType(aVar.d, aVar.c, getString(R.string.mpay__creditcard), getString(R.string.mpay__debitcard), this.h.isNoCredit(), this.h.getCreditDesc()));
        arrayList.add(getString(R.string.mpay__hot_bank_title));
        arrayList2.add(getString(R.string.mpay__hot));
        this.k.add(0);
        c(b);
        arrayList.addAll(b);
        c(aVar.b);
        f().setDivider(null);
        int size = aVar.b.size();
        int size2 = b.size() + 3;
        char c = Constants.SPACE;
        for (int i = 0; i < size; i++) {
            String character = aVar.b.get(i).getCharacter();
            char charAt = character == null ? Constants.SPACE : character.toUpperCase().charAt(0);
            if (charAt != ' ' && charAt != c) {
                arrayList.add(String.valueOf(charAt));
                arrayList2.add(String.valueOf(charAt));
                this.k.add(Integer.valueOf(size2 + i));
                c = charAt;
                size2++;
            }
            arrayList.add(aVar.b.get(i));
        }
        a(arrayList);
        if (com.meituan.android.paybase.utils.i.a((Collection) aVar.b)) {
            return;
        }
        this.i.setAlphas((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        this.i.setShouldMeasureHeight(true);
        this.i.setShouldMakePath(true);
        this.i.requestLayout();
        ((com.meituan.android.pay.adapter.a) this.c).a(this.g);
        a(new ArrayList(arrayList));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        final List<BankCard> b;
        boolean c;
        a.d d;
        private final int e;
        private double f;

        public a(int i, List<BankCard> list, double d, a.d dVar, boolean z) {
            Object[] objArr = {Integer.valueOf(i), list, Double.valueOf(d), dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f4e8ce94815bf875dd67fc61f5cfa97", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f4e8ce94815bf875dd67fc61f5cfa97");
                return;
            }
            this.e = i;
            this.b = list;
            this.f = d;
            this.d = dVar;
            this.c = z;
        }
    }

    private List<BankCard> b(List<BankCard> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "515523e5ff9b971dd58661dac7c03db4", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "515523e5ff9b971dd58661dac7c03db4");
        }
        ArrayList arrayList = new ArrayList();
        if (!com.meituan.android.paybase.utils.i.a((Collection) list)) {
            for (BankCard bankCard : list) {
                if (bankCard.isHot()) {
                    arrayList.add(bankCard);
                }
            }
        }
        return arrayList;
    }

    private void c(List<BankCard> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23e990a36d4a289ec9def83b32aca0e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23e990a36d4a289ec9def83b32aca0e8");
        } else {
            Collections.sort(list, i.a());
        }
    }

    public static /* synthetic */ int a(BankCard bankCard, BankCard bankCard2) {
        Object[] objArr = {bankCard, bankCard2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b9b7c4ade4121359eaedec4751b0cb0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b9b7c4ade4121359eaedec4751b0cb0")).intValue();
        }
        String character = bankCard.getCharacter();
        String character2 = bankCard2.getCharacter();
        if (TextUtils.isEmpty(character) || TextUtils.isEmpty(character2)) {
            return 0;
        }
        return bankCard.getCharacter().toUpperCase().compareTo(bankCard2.getCharacter().toUpperCase());
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1db2f83b3a2e81216e437b8766f82da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1db2f83b3a2e81216e437b8766f82da");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.c("b_pV73n", "CLOSE", null);
        super.onStop();
    }

    @Override // com.meituan.android.paycommon.lib.fragment.PayListFragment
    public final void a(ListView listView, View view, int i, long j) {
        Object[] objArr = {listView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e79af4f00759d270414273dfad74f4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e79af4f00759d270414273dfad74f4c");
            return;
        }
        Object item = this.c.getItem(i);
        if (item instanceof BankCard) {
            BankCard bankCard = (BankCard) item;
            if (this.g > bankCard.getAmount() || bankCard.isErrorStatus()) {
                return;
            }
            Object[] objArr2 = {bankCard};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4abfb29f89e5fb1487fd435528f53848", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4abfb29f89e5fb1487fd435528f53848");
                return;
            }
            HashMap hashMap = new HashMap();
            if (!com.meituan.android.paybase.utils.i.a(this.l.getExtraParams())) {
                hashMap.putAll(this.l.getExtraParams());
            }
            hashMap.put("bank_type", bankCard.getBankType());
            hashMap.put("pay_type", bankCard.getPayType());
            PayActivity.a(getActivity(), this.l.getSubmitUrl(), hashMap, (HashMap<String, String>) null, 827, this);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_i1xbffne_mc", "确认银行类型页_点击某行", new a.c().a("name", bankCard.getName()).a("bankType", bankCard.getBankType()).a("cardType", bankCard.getCardType()).b, a.EnumC0329a.CLICK, -1);
        }
    }
}
