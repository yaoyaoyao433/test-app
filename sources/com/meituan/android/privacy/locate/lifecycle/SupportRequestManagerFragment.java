package com.meituan.android.privacy.locate.lifecycle;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.meituan.android.privacy.locate.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SupportRequestManagerFragment extends Fragment {
    public static ChangeQuickRedirect a;
    final a b;
    private List<g> c;
    private final HashSet<SupportRequestManagerFragment> d;
    private SupportRequestManagerFragment e;

    public SupportRequestManagerFragment() {
        this(new a());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3449bea1949f8e89f33f85a92869919", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3449bea1949f8e89f33f85a92869919");
        }
    }

    @SuppressLint({"ValidFragment"})
    private SupportRequestManagerFragment(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a10720c8c06cbf3691b0e3f666edea7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a10720c8c06cbf3691b0e3f666edea7f");
            return;
        }
        this.c = new ArrayList();
        this.d = new HashSet<>();
        this.b = aVar;
    }

    public final void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "563e1db64251c53a9bc3669b1f270f6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "563e1db64251c53a9bc3669b1f270f6a");
        } else {
            this.c.add(gVar);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a851f6edcb3f650a23c29ee5c36b040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a851f6edcb3f650a23c29ee5c36b040");
            return;
        }
        super.onAttach(activity);
        try {
            this.e = d.a().a(getActivity().getSupportFragmentManager());
            if (this.e != this) {
                SupportRequestManagerFragment supportRequestManagerFragment = this.e;
                Object[] objArr2 = {this};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, supportRequestManagerFragment, changeQuickRedirect2, false, "1871e17f4c9eaf273758ca463e1272be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, supportRequestManagerFragment, changeQuickRedirect2, false, "1871e17f4c9eaf273758ca463e1272be");
                } else {
                    supportRequestManagerFragment.d.add(this);
                }
            }
        } catch (IllegalStateException e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46211e3c3b8f65cea19661d3be9c8e6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46211e3c3b8f65cea19661d3be9c8e6c");
            return;
        }
        super.onDetach();
        if (this.e != null) {
            SupportRequestManagerFragment supportRequestManagerFragment = this.e;
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, supportRequestManagerFragment, changeQuickRedirect2, false, "c2b243224388b1b962989e21f9028bab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, supportRequestManagerFragment, changeQuickRedirect2, false, "c2b243224388b1b962989e21f9028bab");
            } else {
                supportRequestManagerFragment.d.remove(this);
            }
            this.e = null;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d599bd442afaadc7e64b8a290a6fc1d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d599bd442afaadc7e64b8a290a6fc1d1");
            return;
        }
        super.onStart();
        this.b.a();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd469d26a4e090d167502dc71f2e9f9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd469d26a4e090d167502dc71f2e9f9c");
            return;
        }
        super.onStop();
        this.b.b();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2599988f06dc2fad39c46df1f4f9d1ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2599988f06dc2fad39c46df1f4f9d1ff");
            return;
        }
        super.onDestroy();
        this.b.c();
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11510c5963ab46e673250011d7cbd49a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11510c5963ab46e673250011d7cbd49a");
        } else {
            super.onLowMemory();
        }
    }
}
