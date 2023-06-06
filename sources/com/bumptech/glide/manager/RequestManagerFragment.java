package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.m;
import java.util.HashSet;
/* compiled from: ProGuard */
@TargetApi(11)
/* loaded from: classes.dex */
public class RequestManagerFragment extends Fragment {
    final com.bumptech.glide.manager.a a;
    final k b;
    m c;
    private final HashSet<RequestManagerFragment> d;
    private RequestManagerFragment e;

    public RequestManagerFragment() {
        this(new com.bumptech.glide.manager.a());
    }

    @SuppressLint({"ValidFragment"})
    private RequestManagerFragment(com.bumptech.glide.manager.a aVar) {
        this.b = new a();
        this.d = new HashSet<>();
        this.a = aVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.e = j.a().a(getActivity().getFragmentManager());
            if (this.e != this) {
                this.e.d.add(this);
            }
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (this.e != null) {
            this.e.d.remove(this);
            this.e = null;
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.a.a();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.a.b();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a.c();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (this.c != null) {
            this.c.a(i);
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        if (this.c != null) {
            this.c.d.b();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements k {
        private a() {
        }
    }
}
