package com.sankuai.waimai.business.page.mine.module;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dianping.monitor.impl.m;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMRNBaseFragment extends MRNBaseFragment implements View.OnAttachStateChangeListener {
    public static ChangeQuickRedirect b;
    private boolean a;
    protected Activity c;
    protected boolean g;
    protected boolean h;
    protected String i;
    protected TextView j;

    public void a(boolean z) {
    }

    public WMRNBaseFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "024cb5c606652b9c010a7ba1b6a5c80c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "024cb5c606652b9c010a7ba1b6a5c80c");
            return;
        }
        this.g = false;
        this.h = false;
        this.i = "";
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f35daffc977c6be13b69d8caadc459e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f35daffc977c6be13b69d8caadc459e0");
            return;
        }
        super.onAttach(context);
        c(true);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d77650e5d4aa914a03ed5cbe3f6b4040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d77650e5d4aa914a03ed5cbe3f6b4040");
            return;
        }
        super.onAttach(activity);
        this.c = activity;
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d7eda2245ace28b4715afe6bfab125f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d7eda2245ace28b4715afe6bfab125f");
            return;
        }
        super.onDetach();
        c(false);
        try {
            Field declaredField = Fragment.class.getDeclaredField("mChildFragmentManager");
            declaredField.setAccessible(true);
            declaredField.set(this, null);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "749e8a053479b34cd7c00071c167114d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "749e8a053479b34cd7c00071c167114d");
            return;
        }
        super.onCreate(bundle);
        this.c = getActivity();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "194ab14acc0e27f87d6ec1de4eb719b1", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "194ab14acc0e27f87d6ec1de4eb719b1") : LayoutInflater.from(context).inflate(R.layout.wm_page_mine_progressview, (ViewGroup) null);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final View c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc3f29461c097f6961d73d93a4bebcb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc3f29461c097f6961d73d93a4bebcb2");
        }
        this.a = true;
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_page_mine_errorview, (ViewGroup) null);
        this.j = (TextView) inflate.findViewById(R.id.txt_sub_info);
        this.j.setText(this.i);
        ((TextView) inflate.findViewById(R.id.btn_info)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.mine.module.WMRNBaseFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec6f04f7e140a4dc361416c98667c0ca", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec6f04f7e140a4dc361416c98667c0ca");
                } else {
                    WMRNBaseFragment.this.getActivity().finish();
                }
            }
        });
        return inflate;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd7bae46b8d7bdb8a644fa10f063bbbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd7bae46b8d7bdb8a644fa10f063bbbe");
            return;
        }
        super.onPause();
        new m(11, com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c()).a("platform", "android").a("bundle_name", a()).a("rn.render.failure.rate", Collections.singletonList(Float.valueOf(this.a ? 1.0f : 0.0f))).a();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64be2910f5fea52f134ccc53da52ed5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64be2910f5fea52f134ccc53da52ed5e");
        } else {
            super.onDestroy();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e435dac7a5a2d392835b32bec7a89591", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e435dac7a5a2d392835b32bec7a89591");
            return;
        }
        super.onStart();
        b(true);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24f140d08db74c1fb547d5b8b3ababc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24f140d08db74c1fb547d5b8b3ababc8");
        } else {
            super.onResume();
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "297df3757f63cfb6ba91bf699091a957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "297df3757f63cfb6ba91bf699091a957");
            return;
        }
        super.onStop();
        b(false);
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28b20790ecdcdcb2ea12ed37a724c28d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28b20790ecdcdcb2ea12ed37a724c28d");
            return;
        }
        this.g = z;
        c(z);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80bbcf3b961aa45028543c54266383c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80bbcf3b961aa45028543c54266383c5");
            return;
        }
        super.onViewCreated(view, bundle);
        view.addOnAttachStateChangeListener(this);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92a10be87cd7492df4ada6775d705156", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92a10be87cd7492df4ada6775d705156");
            return;
        }
        super.onHiddenChanged(z);
        c(!z ? 1 : 0);
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44adce3a5ab15a200e3dd19e895406c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44adce3a5ab15a200e3dd19e895406c2");
            return;
        }
        super.setUserVisibleHint(z);
        c(z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8f6a23f7787b4f12d09c73577a3e752", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8f6a23f7787b4f12d09c73577a3e752");
        } else {
            c(true);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60d7912576cba93dd9da1b27646f2d43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60d7912576cba93dd9da1b27646f2d43");
            return;
        }
        view.removeOnAttachStateChangeListener(this);
        c(false);
    }

    private boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "161d093804a5ea74a38b309b8dd29b32", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "161d093804a5ea74a38b309b8dd29b32")).booleanValue();
        }
        return this.g && super.isVisible() && getUserVisibleHint();
    }

    private void c(boolean z) {
        boolean p;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20ab5384e059dc74d807cda39a4ce7ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20ab5384e059dc74d807cda39a4ce7ce");
        } else if (z == this.h || (p = p()) == this.h) {
        } else {
            this.h = p;
            a(this.h);
        }
    }
}
