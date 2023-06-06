package com.meituan.android.paycommon.lib.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.retrofit.b;
import com.meituan.android.paycommon.lib.assist.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class PayListFragment extends PayBaseFragment implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, b {
    public static ChangeQuickRedirect b;
    private Handler a;
    public a c;
    protected ListView d;
    public View e;
    public View f;
    private Runnable g;
    private FrameLayout h;

    public void a(ListView listView, View view, int i, long j) {
    }

    public abstract a b();

    public PayListFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af042ac318349527a57e9352dca4ef17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af042ac318349527a57e9352dca4ef17");
            return;
        }
        this.a = new Handler();
        this.g = new Runnable() { // from class: com.meituan.android.paycommon.lib.fragment.PayListFragment.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b166cd929dd8842c58ebb26fe6425e22", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b166cd929dd8842c58ebb26fe6425e22");
                } else {
                    PayListFragment.this.d.focusableViewAvailable(PayListFragment.this.d);
                }
            }
        };
    }

    public final void a(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09c1b80989cdfe5ade82c87f21086bc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09c1b80989cdfe5ade82c87f21086bc1");
            return;
        }
        if (this.c.k != null) {
            this.c.k.clear();
        }
        this.c.a(list);
        a(true);
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78c652bbfa5140ccbe9d4a1a325ac47e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78c652bbfa5140ccbe9d4a1a325ac47e");
            return;
        }
        g();
        if (z) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b67e83534541690343f64be6a7b05c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b67e83534541690343f64be6a7b05c4");
            return;
        }
        super.onCreate(bundle);
        this.c = b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.FrameLayout, android.view.View] */
    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        View view;
        int i;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a21dd9355196595b2459fa082d87b26f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a21dd9355196595b2459fa082d87b26f");
        }
        FragmentActivity activity = getActivity();
        ?? frameLayout2 = new FrameLayout(activity);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        frameLayout3.setId(R.id.pay__dynastic_view_listviewholder);
        Object[] objArr2 = {frameLayout3};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b538d07a38217be23bf9771b85c0248", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b538d07a38217be23bf9771b85c0248");
            i = -1;
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c79f0455d49d67c962e6514a00d8c217", RobustBitConfig.DEFAULT_VALUE)) {
                frameLayout = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c79f0455d49d67c962e6514a00d8c217");
            } else {
                frameLayout = new FrameLayout(getActivity());
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f10b25a87f9de58e5a3ec089a5572718", RobustBitConfig.DEFAULT_VALUE)) {
                    view = (View) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f10b25a87f9de58e5a3ec089a5572718");
                } else {
                    TextView textView = new TextView(getActivity());
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = b;
                    textView.setText(PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0b79c8f8584a38959d76634357b19206", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0b79c8f8584a38959d76634357b19206") : getString(R.string.paycommon__fetch_data_empty));
                    view = textView;
                }
                view.setId(R.id.pay__dynastic_view_emptyview);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
            }
            frameLayout.setId(16908292);
            i = -1;
            frameLayout3.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            frameLayout3.addView(c(), new FrameLayout.LayoutParams(-1, -1));
        }
        frameLayout2.addView(frameLayout3, new FrameLayout.LayoutParams(i, i));
        ?? r10 = {frameLayout2};
        ChangeQuickRedirect changeQuickRedirect6 = b;
        if (PatchProxy.isSupport(r10, this, changeQuickRedirect6, false, "70f3995b7fdcc56ce488952568458cda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(r10, this, changeQuickRedirect6, false, "70f3995b7fdcc56ce488952568458cda");
        } else {
            this.h = new FrameLayout(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
            this.h.setBackgroundColor(-1);
            this.h.setVisibility(8);
            frameLayout2.addView(this.h, layoutParams);
        }
        return frameLayout2;
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b10d1546bf1e56ba397231557a0d2ac5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b10d1546bf1e56ba397231557a0d2ac5");
            return;
        }
        super.onViewCreated(view, bundle);
        g();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8455a64139b50882b2dfed6a339ce946", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8455a64139b50882b2dfed6a339ce946");
            return;
        }
        this.a.removeCallbacks(this.g);
        this.d = null;
        this.f = null;
        this.e = null;
        super.onDestroyView();
    }

    public final ListView f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b5740bc1205a7169b53a3b8d3d54def", RobustBitConfig.DEFAULT_VALUE)) {
            return (ListView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b5740bc1205a7169b53a3b8d3d54def");
        }
        g();
        return this.d;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "634638e7fa255867fcecb3569eaff107", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "634638e7fa255867fcecb3569eaff107");
        } else if (this.d != null) {
        } else {
            View view = getView();
            if (view == null) {
                throw new IllegalStateException("Content view not yet created");
            }
            if (view instanceof ListView) {
                this.d = (ListView) view;
            } else {
                this.e = view.findViewById(16908292);
                this.f = view.findViewById(R.id.pay__dynastic_view_listviewholder);
                View findViewById = view.findViewById(16908298);
                if (!(findViewById instanceof ListView)) {
                    if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    }
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                this.d = (ListView) findViewById;
                if (this.e != null) {
                    this.d.setEmptyView(this.e);
                }
            }
            this.d.setOnItemClickListener(this);
            this.d.setOnItemLongClickListener(this);
            this.d.setAdapter((ListAdapter) this.c);
            if (this.c.getCount() == 0) {
                a(false);
            }
            this.a.post(this.g);
        }
    }

    public View c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5de2862046bb2c234682fee87f558e07", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5de2862046bb2c234682fee87f558e07");
        }
        ListView listView = new ListView(getActivity());
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        return listView;
    }

    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4b80fcf1107061024045c320be85304", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4b80fcf1107061024045c320be85304");
        } else if (this.d == null || this.d.getAdapter() == null || this.d.getAdapter().getCount() <= 0) {
            a(false);
            b(com.meituan.android.paybase.common.utils.b.a());
        }
    }

    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4e75d271bcf01274d798153c60c624a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4e75d271bcf01274d798153c60c624a");
            return;
        }
        a(true);
        hideProgress();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int headerViewsCount;
        Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b078d79086ce46ab6b3c8b700a502321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b078d79086ce46ab6b3c8b700a502321");
        } else if (this.c == null || i < (headerViewsCount = f().getHeaderViewsCount()) || i >= this.c.getCount() + headerViewsCount) {
        } else {
            a((ListView) adapterView, view, i - headerViewsCount, j);
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        int headerViewsCount;
        Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "268747aceddd7a2d68d3529db34a43b0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "268747aceddd7a2d68d3529db34a43b0")).booleanValue() : (this.c == null || i < (headerViewsCount = f().getHeaderViewsCount()) || i < headerViewsCount + this.c.getCount()) ? false : false;
    }
}
