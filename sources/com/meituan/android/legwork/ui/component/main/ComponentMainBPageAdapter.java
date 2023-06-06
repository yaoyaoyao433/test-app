package com.meituan.android.legwork.ui.component.main;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;
import com.meituan.android.legwork.mrn.b;
import com.meituan.android.legwork.ui.abfragment.LazyLoadHelperFragment;
import com.meituan.android.legwork.ui.abfragment.LegworkMRNBaseFragment;
import com.meituan.android.legwork.ui.abfragment.MarginBottomMrnFragment;
import com.meituan.android.legwork.utils.a;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ComponentMainBPageAdapter extends FragmentStatePagerAdapter {
    public static ChangeQuickRedirect a;
    public List<Fragment> b;
    public Object c;
    private Context d;
    private Fragment e;

    public ComponentMainBPageAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        Fragment instantiate;
        Object[] objArr = {context, fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d5575906a41b5ae86a48727961a0785", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d5575906a41b5ae86a48727961a0785");
            return;
        }
        this.b = new ArrayList();
        this.d = context;
        a aVar = new a();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8cae698cbfd01993267b2566867f202d", RobustBitConfig.DEFAULT_VALUE)) {
            instantiate = (Fragment) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8cae698cbfd01993267b2566867f202d");
        } else {
            Uri build = Uri.parse(b.a().b("legwork-send", "legwork-send", null)).buildUpon().build();
            Bundle bundle = new Bundle();
            bundle.putParcelable("mrn_arg", build);
            bundle.putString("eventType", "event_type_home_send");
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("key_real_argument", bundle);
            bundle2.putString("key_real_fragment_class_name", LegworkMRNBaseFragment.class.getName());
            x.d("ABTestPageUtils.getHomeSendFragment()", "使用MRN帮送首页");
            instantiate = Fragment.instantiate(context, LazyLoadHelperFragment.class.getName(), bundle2);
        }
        this.e = instantiate;
        this.b.add(this.e);
        if (!com.meituan.android.legwork.common.user.a.a().b()) {
            this.b.add(new Fragment());
            this.b.add(new Fragment());
            return;
        }
        this.b.add(a());
        this.b.add(b());
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(@NonNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de8351707375faffab9324a755676077", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de8351707375faffab9324a755676077")).intValue() : (this.e == null || !this.e.equals(obj)) ? -2 : -1;
    }

    @Override // android.support.v4.app.FragmentStatePagerAdapter
    public Fragment getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac02a7809c4cfe5fac0095ab5ccabd19", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac02a7809c4cfe5fac0095ab5ccabd19");
        }
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return this.b.get(i);
    }

    @Override // android.support.v4.app.FragmentStatePagerAdapter, android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94dd0f1ae7c05bea0762298db2a8890e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94dd0f1ae7c05bea0762298db2a8890e");
            return;
        }
        super.setPrimaryItem(viewGroup, i, obj);
        this.c = obj;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5e2ff9d02a38678cf8c6fe95b898041", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5e2ff9d02a38678cf8c6fe95b898041")).intValue() : this.b.size();
    }

    public Fragment a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaecf303791c56e1b54d8057ad10d025", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaecf303791c56e1b54d8057ad10d025");
        }
        Uri build = Uri.parse(b.a().b("legwork", "legwork-orderlist", null)).buildUpon().appendQueryParameter("fromType", "TabBar").build();
        Bundle bundle = new Bundle();
        bundle.putParcelable("mrn_arg", build);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("key_real_argument", bundle);
        bundle2.putString("key_real_fragment_class_name", MarginBottomMrnFragment.class.getName());
        return Fragment.instantiate(this.d, LazyLoadHelperFragment.class.getName(), bundle2);
    }

    public Fragment b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "138a06dba5aff96e5e53bee49b9847ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "138a06dba5aff96e5e53bee49b9847ef");
        }
        Uri build = Uri.parse(b.a().b("legwork", "legwork-my-info", null)).buildUpon().appendQueryParameter("fromType", "TabBar").build();
        Bundle bundle = new Bundle();
        bundle.putParcelable("mrn_arg", build);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("key_real_argument", bundle);
        bundle2.putString("key_real_fragment_class_name", MarginBottomMrnFragment.class.getName());
        return Fragment.instantiate(this.d, LazyLoadHelperFragment.class.getName(), bundle2);
    }
}
