package com.sankuai.waimai.business.page.mine;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.container.MPBaseFragment;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MineMPFragment extends MPBaseFragment {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private boolean d;
    private boolean e;
    private boolean j;

    public MineMPFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2edfb41bb94ced75e9fb05e9fb7d1e32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2edfb41bb94ced75e9fb05e9fb7d1e32");
        } else {
            this.b = "";
        }
    }

    public static MineMPFragment a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56b84e8acc973857f49c4ba9d530b714", RobustBitConfig.DEFAULT_VALUE)) {
            return (MineMPFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56b84e8acc973857f49c4ba9d530b714");
        }
        MineMPFragment mineMPFragment = new MineMPFragment();
        mineMPFragment.c = str;
        return mineMPFragment;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public final MachMap a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d32eb42a3b198f7a7e52884a646efd1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d32eb42a3b198f7a7e52884a646efd1e");
        }
        MachMap a2 = super.a();
        if (a2 == null) {
            a2 = new MachMap();
        }
        getContext();
        return a2;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eecc97acdb56bd245cb483f9da800ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eecc97acdb56bd245cb483f9da800ac");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("bundle_name", "mach_pro_waimai_mine");
        arguments.putString("biz", "waimai");
        arguments.putSerializable("bundle_params", null);
        if (getArguments() == null) {
            setArguments(arguments);
        }
        super.onCreate(bundle);
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31c72ed6f18e2c9c9749d1f1165ef24b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31c72ed6f18e2c9c9749d1f1165ef24b");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        Weaver.getExtension().onFragmentCreateView(getActivity(), this, onCreateView);
        return onCreateView;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public final View b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9d67b052527115ddc144a14a03ac272", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9d67b052527115ddc144a14a03ac272") : super.b();
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public final View c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2171a3fe05e30c56f7c749042c92ea2", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2171a3fe05e30c56f7c749042c92ea2") : super.c();
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0810aa74fb929fc266d66b7862ffa1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0810aa74fb929fc266d66b7862ffa1b");
            return;
        }
        super.onAttach(context);
        b(true);
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f084341a63e1fc690ca158c49a426aed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f084341a63e1fc690ca158c49a426aed");
            return;
        }
        super.onDetach();
        b(false);
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e59b554fa9b739e348f85db8410bc9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e59b554fa9b739e348f85db8410bc9c");
            return;
        }
        super.onStart();
        a(true);
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78470e5dfb101f71cc0468997f509a29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78470e5dfb101f71cc0468997f509a29");
            return;
        }
        super.onStop();
        a(false);
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a4649a78560cacd492e959c5fa8178c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a4649a78560cacd492e959c5fa8178c");
            return;
        }
        super.onHiddenChanged(z);
        b(!z ? 1 : 0);
    }

    @Override // android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9129ca78b1313d60c30072505fe686f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9129ca78b1313d60c30072505fe686f2");
            return;
        }
        super.setUserVisibleHint(z);
        b(z);
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6fd7ed24dd7fad4e88ad745eeb8db19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6fd7ed24dd7fad4e88ad745eeb8db19");
            return;
        }
        this.e = z;
        b(z);
    }

    private void b(boolean z) {
        boolean e;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef2cc27b7eafbb2eeb41adbbcbdde246", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef2cc27b7eafbb2eeb41adbbcbdde246");
        } else if (z == this.d || (e = e()) == this.d) {
        } else {
            this.d = e;
            c(this.d);
        }
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b41675103bbe4b3808f17ecba9c967b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b41675103bbe4b3808f17ecba9c967b")).booleanValue();
        }
        return this.e && super.isVisible() && getUserVisibleHint();
    }

    private void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5104fc7130ea34382456cb96ddbcbf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5104fc7130ea34382456cb96ddbcbf9");
        } else if (z) {
            if (this.j) {
                this.j = false;
                return;
            }
            MachMap machMap = new MachMap();
            machMap.put("intent", 1);
            this.g.a("setNeedsRequestData", machMap);
        }
    }
}
