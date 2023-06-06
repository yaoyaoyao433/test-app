package com.meituan.android.yoda.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.activity.YodaConfirmActivity;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.util.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ConfirmListFragment extends BaseFragment {
    public static ChangeQuickRedirect o;
    private RecyclerView p;

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str, Error error) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str, String str2) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void c(String str, int i, @Nullable Bundle bundle) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void d(String str, int i, @Nullable Bundle bundle) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final String e() {
        return "c_tn9cgqi0";
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void f() {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final int g() {
        return 0;
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d416f881fe005dc4cd544ab9f600c6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d416f881fe005dc4cd544ab9f600c6d");
            return;
        }
        super.onCreate(bundle);
        this.d = getArguments().getString(OtherVerifyTypeConstants.REQUEST_CODE);
        if (getParentFragment() == null) {
            setRetainInstance(true);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a444d395b6c69b6ef834a939de3614c", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a444d395b6c69b6ef834a939de3614c") : layoutInflater.inflate(R.layout.yoda_fragment_confirmlist, viewGroup, false);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a45922a0827af2819fb8b2c9b644d2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a45922a0827af2819fb8b2c9b644d2a");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c0f6c1e3599a0dcf1a887ebd43a6454", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c0f6c1e3599a0dcf1a887ebd43a6454");
            return;
        }
        this.p = (RecyclerView) view.findViewById(R.id.yoda_list_recyclerView);
        this.p.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        com.meituan.android.yoda.data.a a2 = com.meituan.android.yoda.data.b.a(this.d);
        if (a2 != null) {
            a(b.a(this, String.valueOf(a2.c.data.get("riskLevel"))));
        } else {
            com.meituan.android.yoda.monitor.log.a.a(this.c, "callerPackage is null", true);
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85763f66f8651d2a34ec4113b2860a23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85763f66f8651d2a34ec4113b2860a23");
            return;
        }
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity == null || !(activity instanceof YodaConfirmActivity)) {
            return;
        }
        YodaConfirmActivity yodaConfirmActivity = (YodaConfirmActivity) activity;
        if (yodaConfirmActivity.getSupportFragmentManager().findFragmentById(R.id.yoda_activity_rootView) == this) {
            yodaConfirmActivity.a(false);
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d66c3b0cf7e68fa661c27aa977de3ac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d66c3b0cf7e68fa661c27aa977de3ac1");
            return;
        }
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity == null || !(activity instanceof YodaConfirmActivity)) {
            return;
        }
        YodaConfirmActivity yodaConfirmActivity = (YodaConfirmActivity) activity;
        if (yodaConfirmActivity.getSupportFragmentManager().findFragmentById(R.id.yoda_activity_rootView) != this) {
            yodaConfirmActivity.a(true);
        }
    }

    public static /* synthetic */ void a(ConfirmListFragment confirmListFragment, String str) {
        Object[] objArr = {confirmListFragment, str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88f66ba9190e3ed6d2a40b329d5e271c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88f66ba9190e3ed6d2a40b329d5e271c");
        } else {
            confirmListFragment.p.setAdapter(new a(com.meituan.android.yoda.data.c.a(str)));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends RecyclerView.a<C0376a> {
        public static ChangeQuickRedirect a;
        private com.meituan.android.yoda.data.c c;
        private View d;

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(C0376a c0376a, int i) {
            C0376a c0376a2 = c0376a;
            Object[] objArr = {c0376a2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "464d1fcd2bf9b5f24ea934d4dbe8ad5e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "464d1fcd2bf9b5f24ea934d4dbe8ad5e");
            } else if (getItemViewType(i) == 0) {
                if (this.d != null) {
                    i--;
                }
                if (this.c != null) {
                    ArrayList<Integer> a2 = this.c.a(i);
                    com.meituan.android.yoda.data.a a3 = com.meituan.android.yoda.data.b.a(ConfirmListFragment.this.getRequestCode());
                    if (a2 != null && a3 != null && a3.f != null) {
                        c0376a2.a.setText(a3.f.a(a2));
                    }
                    CardView cardView = (CardView) c0376a2.b;
                    if (cardView != null) {
                        cardView.setRadius(10.0f);
                        cardView.setCardElevation(4.0f);
                        cardView.a(20, 10, 20, 10);
                        cardView.setOnClickListener(c.a(this, cardView, a2));
                    }
                }
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ C0376a onCreateViewHolder(ViewGroup viewGroup, int i) {
            View inflate;
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daf13e55a022f0a900f20e07c9b5cc72", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0376a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daf13e55a022f0a900f20e07c9b5cc72");
            }
            if (this.d != null && i == 1) {
                inflate = this.d;
            } else {
                inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.yoda_item_confirmlist, viewGroup, false);
            }
            return new C0376a(inflate, i);
        }

        public a(com.meituan.android.yoda.data.c cVar) {
            Object[] objArr = {ConfirmListFragment.this, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d340f60db880c23e2e4f12989c1a24f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d340f60db880c23e2e4f12989c1a24f");
            } else {
                this.c = cVar;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemViewType(int i) {
            return (this.d == null || i != 0) ? 0 : 1;
        }

        public static /* synthetic */ void a(a aVar, ArrayList arrayList, CardView cardView) {
            Object[] objArr = {aVar, arrayList, cardView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88912ef2459f36baf6b20d4be6caaef1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88912ef2459f36baf6b20d4be6caaef1");
                return;
            }
            if (ConfirmListFragment.this.i != null) {
                com.meituan.android.yoda.interfaces.i iVar = ConfirmListFragment.this.i;
                String str = ConfirmListFragment.this.d;
                com.meituan.android.yoda.data.c cVar = aVar.c;
                Object[] objArr2 = {arrayList};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.yoda.data.c.a;
                iVar.a(str, PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "01c55e876cb3121ee3871a8bb093d580", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "01c55e876cb3121ee3871a8bb093d580")).intValue() : cVar.b.indexOf(arrayList), new Bundle());
            }
            cardView.setClickable(true);
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c150d6408793030bfbedfd2101ec5dbb", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c150d6408793030bfbedfd2101ec5dbb")).intValue();
            }
            if (this.c == null) {
                return 0;
            }
            return this.d == null ? this.c.a() : this.c.a() + 1;
        }

        /* compiled from: ProGuard */
        /* renamed from: com.meituan.android.yoda.fragment.ConfirmListFragment$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0376a extends RecyclerView.s {
            public TextView a;
            public View b;

            public C0376a(View view, int i) {
                super(view);
                this.b = view;
                if (i == 0) {
                    this.a = (TextView) view.findViewById(R.id.yoda_list_item_type_name);
                }
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2a3a4038ce559c29e63323bd336b38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2a3a4038ce559c29e63323bd336b38");
            return;
        }
        super.onStart();
        y.b(this.p);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262988341a7039287fe5a41b7eea62de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262988341a7039287fe5a41b7eea62de");
        } else if (z) {
            y.b(this.p);
        }
    }
}
