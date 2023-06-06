package com.meituan.android.privacy.locate.lifecycle;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.meituan.android.privacy.locate.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: ProGuard */
@TargetApi(11)
/* loaded from: classes3.dex */
public class RequestManagerFragment extends Fragment {
    public static ChangeQuickRedirect a;
    final a b;
    private List<g> c;
    private final HashSet<RequestManagerFragment> d;
    private RequestManagerFragment e;

    public RequestManagerFragment() {
        this(new a());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "628f346c0505f3691e402aba5d0bff40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "628f346c0505f3691e402aba5d0bff40");
        }
    }

    @SuppressLint({"ValidFragment"})
    private RequestManagerFragment(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fcc2c01a2a673e5700eb25b5fe05055", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fcc2c01a2a673e5700eb25b5fe05055");
            return;
        }
        this.c = new ArrayList();
        this.d = new HashSet<>();
        this.b = aVar;
    }

    public final void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dcbff2125a0de493d39e96d805f0ed5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dcbff2125a0de493d39e96d805f0ed5");
        } else {
            this.c.add(gVar);
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99d47bafee56a6477a57aa9ea219c00f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99d47bafee56a6477a57aa9ea219c00f");
            return;
        }
        super.onAttach(activity);
        try {
            this.e = d.a().a(getActivity().getFragmentManager());
            if (this.e != this) {
                RequestManagerFragment requestManagerFragment = this.e;
                Object[] objArr2 = {this};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, requestManagerFragment, changeQuickRedirect2, false, "31ba4a80b0e96e3225b48d6ccd695c9a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, requestManagerFragment, changeQuickRedirect2, false, "31ba4a80b0e96e3225b48d6ccd695c9a");
                } else {
                    requestManagerFragment.d.add(this);
                }
            }
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c627d3ae1b25fb5732a31767e114ed9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c627d3ae1b25fb5732a31767e114ed9");
            return;
        }
        super.onDetach();
        if (this.e != null) {
            RequestManagerFragment requestManagerFragment = this.e;
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, requestManagerFragment, changeQuickRedirect2, false, "73565ac1214a9b121fd4a5aba8046b8a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, requestManagerFragment, changeQuickRedirect2, false, "73565ac1214a9b121fd4a5aba8046b8a");
            } else {
                requestManagerFragment.d.remove(this);
            }
            this.e = null;
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d11b7bd546571788b7afcac25e72a95b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d11b7bd546571788b7afcac25e72a95b");
            return;
        }
        super.onStart();
        this.b.a();
    }

    @Override // android.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5829c65e67ab514791c15d43787b995c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5829c65e67ab514791c15d43787b995c");
            return;
        }
        super.onStop();
        this.b.b();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5536e791b206eb603dc6ec0a1be8664", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5536e791b206eb603dc6ec0a1be8664");
            return;
        }
        super.onDestroy();
        this.b.c();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c7429092c974eb5d5251a81dc11edd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c7429092c974eb5d5251a81dc11edd6");
        } else {
            super.onTrimMemory(i);
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa0dd1ffd3a796a9ffa4fe6d63bc5807", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa0dd1ffd3a796a9ffa4fe6d63bc5807");
        } else {
            super.onLowMemory();
        }
    }
}
