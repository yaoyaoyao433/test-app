package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.bumptech.glide.m;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SupportRequestManagerFragment extends Fragment {
    m a;
    final com.bumptech.glide.manager.a b;
    final k c;
    private final HashSet<SupportRequestManagerFragment> d;
    private SupportRequestManagerFragment e;

    public SupportRequestManagerFragment() {
        this(new com.bumptech.glide.manager.a());
    }

    @SuppressLint({"ValidFragment"})
    private SupportRequestManagerFragment(com.bumptech.glide.manager.a aVar) {
        this.c = new a();
        this.d = new HashSet<>();
        this.b = aVar;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.e = j.a().a(getActivity().getSupportFragmentManager());
            if (this.e != this) {
                this.e.d.add(this);
            }
        } catch (IllegalStateException e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (this.e != null) {
            this.e.d.remove(this);
            this.e = null;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        super.onStart();
        this.b.a();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        super.onStop();
        this.b.b();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        if (this.a != null) {
            this.a.d.b();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements k {
        private a() {
        }
    }
}
