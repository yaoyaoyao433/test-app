package com.sankuai.android.spawn.base;

import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class BaseDetailFragment extends BaseFragment {
    public static ChangeQuickRedirect a;
    protected final int b;
    protected final int c;
    protected final int d;
    protected final int e;
    private View h;

    public BaseDetailFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a820c75c980add2080e7a42f0903ddb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a820c75c980add2080e7a42f0903ddb6");
            return;
        }
        this.b = 0;
        this.c = 1;
        this.d = 2;
        this.e = 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.View] */
    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout;
        int i;
        View inflate;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e712ec958ff5eb34dc72dda55b3f67", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e712ec958ff5eb34dc72dda55b3f67");
        }
        FragmentActivity activity = getActivity();
        FrameLayout frameLayout = new FrameLayout(activity);
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "adf4d5659e9a269e156f1d70f485a595", 6917529027641081856L)) {
            linearLayout = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "adf4d5659e9a269e156f1d70f485a595");
            i = -2;
        } else {
            linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            Object[] objArr3 = {activity};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            View inflate2 = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c223b6ab52de75eb44fa929fd64ffedc", 6917529027641081856L) ? (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c223b6ab52de75eb44fa929fd64ffedc") : LayoutInflater.from(activity).inflate(R.layout.progress_layout, (ViewGroup) null);
            i = -2;
            linearLayout.addView(inflate2, new FrameLayout.LayoutParams(-2, -2));
        }
        linearLayout.setId(16711682);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        View a2 = a();
        a2.setId(16711684);
        frameLayout.addView(a2, new FrameLayout.LayoutParams(i, i, 17));
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7f849a0ebd22c4c7a8ec468f4c42b631", 6917529027641081856L)) {
            inflate = (View) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7f849a0ebd22c4c7a8ec468f4c42b631");
        } else {
            inflate = LayoutInflater.from(getActivity()).inflate(R.layout.error, (ViewGroup) null);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.android.spawn.base.BaseDetailFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "292dc2c022310697f77028e060dcf803", 6917529027641081858L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "292dc2c022310697f77028e060dcf803");
                    }
                }
            });
        }
        inflate.setId(16711685);
        frameLayout.addView(inflate, new FrameLayout.LayoutParams(i, i, 17));
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        this.h = PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "cd3e44836fa8fc5d994e613cf4848574", 6917529027641081856L) ? (View) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "cd3e44836fa8fc5d994e613cf4848574") : a();
        frameLayout.addView(this.h, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    private View a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9f7b9556483d5414e486f473826ccb", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9f7b9556483d5414e486f473826ccb");
        }
        TextView textView = new TextView(getActivity());
        textView.setText(b());
        return textView;
    }

    private CharSequence b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea931eb7c43bbd440669dae8af0d3ed", 6917529027641081856L) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea931eb7c43bbd440669dae8af0d3ed") : getString(R.string.empty_info);
    }
}
