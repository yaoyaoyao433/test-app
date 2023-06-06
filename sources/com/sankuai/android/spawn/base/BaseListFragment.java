package com.sankuai.android.spawn.base;

import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.handmark.pulltorefresh.library.view.RecyclerViewCompat;
import com.meituan.android.common.ui.emptypage.EmptyPage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BaseListFragment extends BaseFragment {
    public static ChangeQuickRedirect a;
    public ListAdapter b;
    public ListView c;
    public RecyclerViewCompat d;
    public RecyclerViewCompat.a e;
    public View h;
    public View i;
    public View j;
    public boolean k;
    private int l;
    private final Handler m;
    private final Runnable n;
    private final AdapterView.OnItemClickListener o;
    private final AdapterView.OnItemLongClickListener p;

    public void c() {
    }

    public BaseListFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0707ce25f832f01d02411ba312c2ea3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0707ce25f832f01d02411ba312c2ea3");
            return;
        }
        this.l = 1;
        this.m = new Handler();
        this.n = new Runnable() { // from class: com.sankuai.android.spawn.base.BaseListFragment.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b97ded62bda0798387749ead5739e58b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b97ded62bda0798387749ead5739e58b");
                } else if (BaseListFragment.this.l != 1 || BaseListFragment.this.c == null) {
                    if (BaseListFragment.this.l != 2 || BaseListFragment.this.d == null) {
                        return;
                    }
                    BaseListFragment.this.d.focusableViewAvailable(BaseListFragment.this.d);
                } else {
                    BaseListFragment.this.c.focusableViewAvailable(BaseListFragment.this.c);
                }
            }
        };
        this.o = new AdapterView.OnItemClickListener() { // from class: com.sankuai.android.spawn.base.BaseListFragment.2
            public static ChangeQuickRedirect a;

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Object[] objArr2 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b678e64b3693067815d750a20e6c096f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b678e64b3693067815d750a20e6c096f");
                    return;
                }
                BaseListFragment.this.a().getHeaderViewsCount();
                if (BaseListFragment.this.b != null) {
                    BaseListFragment.this.b.getCount();
                }
            }
        };
        this.p = new AdapterView.OnItemLongClickListener() { // from class: com.sankuai.android.spawn.base.BaseListFragment.3
            public static ChangeQuickRedirect a;

            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                Object[] objArr2 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c2301b3dca326520f7f5fb55ba38026", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c2301b3dca326520f7f5fb55ba38026")).booleanValue();
                }
                try {
                    return (BaseListFragment.this.b == null || i - BaseListFragment.this.a().getHeaderViewsCount() < BaseListFragment.this.b.getCount()) ? false : false;
                } catch (IllegalStateException unused) {
                    return false;
                }
            }
        };
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout;
        View view;
        FrameLayout frameLayout;
        View inflate;
        FrameLayout frameLayout2;
        RecyclerViewCompat recyclerViewCompat;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15bc5a69fc62594b574e2fe046b4c0d8", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15bc5a69fc62594b574e2fe046b4c0d8");
        }
        FragmentActivity activity = getActivity();
        FrameLayout frameLayout3 = new FrameLayout(activity);
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "398ceb2bc6d7cfc0d64594b4a34f6f08", 6917529027641081856L)) {
            linearLayout = (LinearLayout) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "398ceb2bc6d7cfc0d64594b4a34f6f08");
        } else {
            linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            linearLayout.setGravity(17);
            linearLayout.addView(LayoutInflater.from(activity).inflate(R.layout.progress_layout, (ViewGroup) null), new FrameLayout.LayoutParams(-2, -2));
        }
        if (linearLayout != null) {
            linearLayout.setId(16711682);
            frameLayout3.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        }
        FrameLayout frameLayout4 = new FrameLayout(activity);
        frameLayout4.setId(16711683);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3fc5fe9d12717238cb89f8252937cce5", 6917529027641081856L)) {
            frameLayout2 = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3fc5fe9d12717238cb89f8252937cce5");
        } else {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "49271ee10044b2f7811c8d9774bc6952", 6917529027641081856L)) {
                view = (View) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "49271ee10044b2f7811c8d9774bc6952");
            } else {
                View inflate2 = LayoutInflater.from(getActivity()).inflate(R.layout.info_empty_view, (ViewGroup) null);
                TextView textView = (TextView) inflate2.findViewById(R.id.empty_text);
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                textView.setText(PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2fe119ca6149c3ddaced7997e8053b5b", 6917529027641081856L) ? (CharSequence) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2fe119ca6149c3ddaced7997e8053b5b") : getString(R.string.empty_info));
                view = inflate2;
            }
            if (view != null) {
                view.setId(16711684);
                FrameLayout frameLayout5 = new FrameLayout(getActivity());
                frameLayout5.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
                frameLayout = frameLayout5;
            } else {
                frameLayout = null;
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b7e4a3dc3d4c6cc7fb387ce33d7919e1", 6917529027641081856L)) {
                inflate = (View) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b7e4a3dc3d4c6cc7fb387ce33d7919e1");
            } else {
                inflate = LayoutInflater.from(getActivity()).inflate(R.layout.error_default, (ViewGroup) null);
                ((EmptyPage) inflate).setOnButtonClickListener(new View.OnClickListener() { // from class: com.sankuai.android.spawn.base.BaseListFragment.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr7 = {view2};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "daf48a090933eb0983b3e2cf392369b2", 6917529027641081858L)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "daf48a090933eb0983b3e2cf392369b2");
                            return;
                        }
                        BaseListFragment.this.a(false);
                        BaseListFragment.this.c();
                    }
                });
            }
            if (inflate != null) {
                inflate.setId(16711685);
                inflate.setVisibility(8);
                if (frameLayout == null) {
                    frameLayout = new FrameLayout(getActivity());
                }
                frameLayout.addView(inflate, new FrameLayout.LayoutParams(-2, -2, 17));
            }
            FrameLayout frameLayout6 = frameLayout;
            frameLayout2 = frameLayout6;
            if (frameLayout6 != null) {
                frameLayout6.setId(16908292);
                frameLayout2 = frameLayout6;
            }
        }
        if (frameLayout2 != null) {
            frameLayout4.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.l == 1) {
            recyclerViewCompat = d();
        } else {
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7f503e220c9f7c2eed4c921cc8cbdd27", 6917529027641081856L)) {
                recyclerViewCompat = (View) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7f503e220c9f7c2eed4c921cc8cbdd27");
            } else {
                RecyclerViewCompat recyclerViewCompat2 = new RecyclerViewCompat(getActivity());
                recyclerViewCompat2.setId(16908298);
                recyclerViewCompat = recyclerViewCompat2;
            }
        }
        frameLayout4.addView(recyclerViewCompat, new FrameLayout.LayoutParams(-1, -1));
        frameLayout3.addView(frameLayout4, new FrameLayout.LayoutParams(-1, -1));
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout3;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b23a2706c133c821acb0dbd2bb37d97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b23a2706c133c821acb0dbd2bb37d97");
            return;
        }
        super.onViewCreated(view, bundle);
        b();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a856ed85334450fa2db13c36011e0ba1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a856ed85334450fa2db13c36011e0ba1");
            return;
        }
        this.m.removeCallbacks(this.n);
        this.c = null;
        this.k = false;
        this.j = null;
        this.i = null;
        this.h = null;
        this.d = null;
        super.onDestroyView();
    }

    public final ListView a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1466c3264fba28a782e85b08941f41fa", 6917529027641081856L)) {
            return (ListView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1466c3264fba28a782e85b08941f41fa");
        }
        b();
        return this.c;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32d4d43a0068eb6ae42caf6c2d7982d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32d4d43a0068eb6ae42caf6c2d7982d5");
            return;
        }
        b();
        if (this.k == z) {
            return;
        }
        this.k = z;
        if (z) {
            if (this.i != null) {
                this.i.setVisibility(8);
            }
            this.j.setVisibility(0);
            return;
        }
        if (this.i != null) {
            this.i.setVisibility(0);
        }
        this.j.setVisibility(8);
    }

    public void b() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59153c98cd853595d0fe3d24cd03f032", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59153c98cd853595d0fe3d24cd03f032");
        } else if (this.l == 1) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dceeec484f1c2810004f3279ade710cd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dceeec484f1c2810004f3279ade710cd");
            } else if (this.c == null) {
                View view = getView();
                if (view == null) {
                    throw new IllegalStateException("Content view not yet created");
                }
                if (view instanceof ListView) {
                    this.c = (ListView) view;
                } else {
                    this.h = view.findViewById(16908292);
                    this.i = view.findViewById(16711682);
                    this.j = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (!(findViewById instanceof ListView)) {
                        if (findViewById == null) {
                            throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                        }
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                    this.c = (ListView) findViewById;
                    if (this.h != null) {
                        this.c.setEmptyView(this.h);
                    }
                }
                this.k = true;
                this.c.setOnItemClickListener(this.o);
                this.c.setOnItemLongClickListener(this.p);
                if (this.b != null) {
                    ListAdapter listAdapter = this.b;
                    this.b = null;
                    Object[] objArr3 = {listAdapter};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "07bb9774b174c2b1267c93d970598bd6", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "07bb9774b174c2b1267c93d970598bd6");
                    } else {
                        z = this.b != null;
                        this.b = listAdapter;
                        if (this.c != null) {
                            this.c.setAdapter(listAdapter);
                            if (!this.k && !z) {
                                a(true);
                            }
                        }
                    }
                } else if (this.i != null) {
                    a(false);
                }
                this.m.post(this.n);
            }
        } else {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c34b820f8d4e7ebe6dfa320ac1bac39c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c34b820f8d4e7ebe6dfa320ac1bac39c");
            } else if (this.d == null) {
                View view2 = getView();
                if (view2 == null) {
                    throw new IllegalStateException("Content view not yet created");
                }
                if (view2 instanceof RecyclerViewCompat) {
                    this.d = (RecyclerViewCompat) view2;
                } else {
                    this.h = view2.findViewById(16908292);
                    this.i = view2.findViewById(16711682);
                    this.j = view2.findViewById(16711683);
                    View findViewById2 = view2.findViewById(16908298);
                    if (!(findViewById2 instanceof RecyclerViewCompat)) {
                        if (findViewById2 == null) {
                            throw new RuntimeException("Your content must have a RecyclerView whose id attribute is 'android.R.id.list'");
                        }
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a RecyclerView class");
                    }
                    this.d = (RecyclerViewCompat) findViewById2;
                    if (this.h != null) {
                        this.d.setEmptyView(this.h);
                    }
                }
                this.k = true;
                if (this.e != null) {
                    RecyclerViewCompat.a aVar = this.e;
                    this.e = null;
                    Object[] objArr5 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b24c405233b680c52c4ccaed551f0507", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b24c405233b680c52c4ccaed551f0507");
                    } else {
                        z = this.e != null;
                        this.e = aVar;
                        if (this.d != null) {
                            this.d.setAdapter2(this.e);
                            if (!this.k && !z) {
                                a(true);
                            }
                        }
                    }
                } else if (this.i != null) {
                    a(false);
                }
                this.m.post(this.n);
            }
        }
    }

    public View d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed872f965c374ee433ba5a5f346a79a", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed872f965c374ee433ba5a5f346a79a");
        }
        ListView listView = new ListView(getActivity());
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(true);
        return listView;
    }
}
