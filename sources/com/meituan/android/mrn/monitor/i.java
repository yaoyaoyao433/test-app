package com.meituan.android.mrn.monitor;

import android.app.Activity;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import com.facebook.react.ReactRootView;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.views.textinput.ReactEditText;
import com.meituan.android.mrn.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class i implements com.facebook.react.log.c {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static final String d = "i";
    public c c;
    private WeakReference<NativeViewHierarchyManager> e;
    private WeakReference<View> f;
    private ArrayList<Integer> g;
    private HashSet<Integer> h;
    private boolean i;
    private boolean j;
    private ArrayList<WeakReference<ReactEditText>> k;
    private com.meituan.android.mrn.component.b l;
    private boolean m;
    private boolean n;
    private int o;

    public i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50cad560bdb4fb36b23da5c865119aeb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50cad560bdb4fb36b23da5c865119aeb");
            return;
        }
        this.g = new ArrayList<>();
        this.h = new HashSet<>();
        this.i = false;
        this.j = false;
        this.k = new ArrayList<>();
        this.o = 0;
    }

    public final void a(Activity activity, ReactRootView reactRootView, String str, String str2, String str3) {
        Object[] objArr = {activity, reactRootView, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18769277ffe1dbe588a54c45542ece07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18769277ffe1dbe588a54c45542ece07");
            return;
        }
        b = PreferenceManager.getDefaultSharedPreferences(activity).getBoolean("enable_fmp_debug", false);
        if (c.a(str, str2)) {
            return;
        }
        if (com.meituan.android.mrn.config.horn.g.b.a(str)) {
            this.o = ViewConfiguration.get(activity).getScaledTouchSlop();
            reactRootView.setFsTimeLogger(this);
            a(str, str2);
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        com.meituan.hotel.android.hplus.diagnoseTool.b.b();
    }

    public final void a(com.meituan.android.mrn.component.b bVar) {
        if (bVar != null) {
            this.l = bVar;
        }
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1db384bf352f7c4f6badf725207f7b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1db384bf352f7c4f6badf725207f7b9");
        } else if (activity == null) {
        } else {
            com.meituan.hotel.android.hplus.diagnoseTool.b.b();
            if (this.c == null || !b) {
                return;
            }
            com.meituan.android.mrn.debug.interfaces.b.a();
        }
    }

    public final void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95cc08ed0b2f0f69cc95c2dcc0aab46a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95cc08ed0b2f0f69cc95c2dcc0aab46a");
        } else {
            com.meituan.android.mrn.debug.interfaces.b.a();
        }
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d0d27d2834d916fb6bfd1c5965be613", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d0d27d2834d916fb6bfd1c5965be613");
            return;
        }
        p.a("[MRNFsTimeLoggerImpl@onCreate]", str + StringUtil.SPACE + str2);
        p.a("[MRNFsTimeLoggerImpl@onCreate]", "new FsRenderTimeMonitor");
        this.c = new c(str, str2);
    }

    @Override // com.facebook.react.log.c
    public final void a(int i, NativeViewHierarchyManager nativeViewHierarchyManager) {
        View d2;
        Object[] objArr = {Integer.valueOf(i), nativeViewHierarchyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af5eda7733fb386cd685b31ded17501f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af5eda7733fb386cd685b31ded17501f");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i), nativeViewHierarchyManager};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b156f7b3cbc5924d41db6664995e44b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b156f7b3cbc5924d41db6664995e44b3");
            return;
        }
        try {
            if (!d() && (d2 = nativeViewHierarchyManager.d(i)) != null && !(d2 instanceof ViewGroup)) {
                this.g.add(Integer.valueOf(i));
            }
        } catch (Exception e) {
            com.meituan.android.mrn.utils.c.a("[MRNFsTimeLoggerImpl@recordUpdateViewTag]", e);
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f2e4994ba5818bbc4444258a91fa999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f2e4994ba5818bbc4444258a91fa999");
        } else if (!this.m || this.n) {
            p.a("[MRNFsTimeLoggerImpl@onViewReachRootBottom]", "onViewReachRootBottom ");
            this.i = true;
            this.h.clear();
            if (this.c != null) {
                this.c.a();
            }
        }
    }

    @Override // com.facebook.react.log.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cecf754d2a4493746fe13a5d04ff7fec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cecf754d2a4493746fe13a5d04ff7fec");
        } else if (this.c != null) {
            this.c.c();
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0c6aae84b2e2c9e238c3b5d76f1f80b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0c6aae84b2e2c9e238c3b5d76f1f80b")).booleanValue();
        }
        if (this.i) {
            return true;
        }
        com.meituan.android.mrn.component.b bVar = this.l;
        return false;
    }

    @Override // com.facebook.react.log.c
    public final void a(View view, NativeViewHierarchyManager nativeViewHierarchyManager) {
        Object[] objArr = {view, nativeViewHierarchyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8acf1fb6fd638a70fa5b62d7810e07c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8acf1fb6fd638a70fa5b62d7810e07c");
            return;
        }
        try {
            if (this.c == null) {
                return;
            }
            if (!this.c.b()) {
                c cVar = this.c;
                long d2 = nativeViewHierarchyManager.d();
                Object[] objArr2 = {new Long(d2)};
                ChangeQuickRedirect changeQuickRedirect2 = c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "3673e0a2de2f99e17a69328a10d822ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "3673e0a2de2f99e17a69328a10d822ac");
                } else {
                    cVar.b.interactionTimeTreeNode = d2;
                    boolean z = b;
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c869295764a2d7c1af2a33eae9da91aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c869295764a2d7c1af2a33eae9da91aa");
                } else if (this.c != null) {
                    c cVar2 = this.c;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "176c360167e0b9c02994bc53de2de6e2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "176c360167e0b9c02994bc53de2de6e2");
                    } else {
                        cVar2.b.viewTreeChangedTime = System.currentTimeMillis();
                        if (cVar2.d != null) {
                            cVar2.d.recordStep("viewTreeChanged");
                        }
                    }
                }
            }
            if (d()) {
                return;
            }
            this.f = new WeakReference<>(view);
            this.e = new WeakReference<>(nativeViewHierarchyManager);
            c cVar3 = this.c;
            long d3 = nativeViewHierarchyManager.d();
            Object[] objArr5 = {new Long(d3)};
            ChangeQuickRedirect changeQuickRedirect5 = c.a;
            if (PatchProxy.isSupport(objArr5, cVar3, changeQuickRedirect5, false, "189548dba5689c4dfbbe0ddaf4664e9b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, cVar3, changeQuickRedirect5, false, "189548dba5689c4dfbbe0ddaf4664e9b");
            } else {
                cVar3.b.fmpTreeNode = d3;
                boolean z2 = b;
            }
            for (int i = 0; i < this.g.size(); i++) {
                View d4 = nativeViewHierarchyManager.d(this.g.get(i).intValue());
                if (d4 != null) {
                    if (d4 instanceof ReactEditText) {
                        a((ReactEditText) d4);
                    }
                    a(view, d4);
                }
            }
            if (!this.c.b()) {
                this.h.addAll(this.g);
            }
            this.g.clear();
        } catch (Exception e) {
            com.meituan.android.mrn.utils.c.a("[MRNFsTimeLoggerImpl@onUIOperationFinished]", e);
        }
    }

    private void a(ReactEditText reactEditText) {
        Object[] objArr = {reactEditText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1194c7ce3cd1026d9df25099d470918", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1194c7ce3cd1026d9df25099d470918");
            return;
        }
        for (int i = 0; i < this.k.size(); i++) {
            ReactEditText reactEditText2 = this.k.get(i).get();
            if (reactEditText2 != null && reactEditText2 == reactEditText) {
                return;
            }
        }
        this.k.add(new WeakReference<>(reactEditText));
        reactEditText.addTextChangedListener(new TextWatcher() { // from class: com.meituan.android.mrn.monitor.i.1
            public static ChangeQuickRedirect a;

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                Object[] objArr2 = {charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5425cee5cbbbf838f0e6d8c0eb59d23f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5425cee5cbbbf838f0e6d8c0eb59d23f");
                } else if (i.this.c != null) {
                    i.this.c.c();
                }
            }
        });
    }

    private void a(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0a4949e26e85003b2e8f8ee3359da9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0a4949e26e85003b2e8f8ee3359da9");
        } else if (view2 instanceof com.meituan.android.mrn.component.skeleton.a) {
            String str = d;
            com.facebook.common.logging.a.a(str, "has MrnSkeletonDrawerView: " + view2.toString());
        } else if (d()) {
        } else {
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int height = iArr[1] + view2.getHeight();
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            int height2 = iArr2[1] + view.getHeight();
            com.meituan.hotel.android.hplus.diagnoseTool.b.b();
            if (height2 <= 0 || height <= height2 - this.o) {
                return;
            }
            c();
            if (b) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setInterpolator(new LinearInterpolator());
                alphaAnimation.setRepeatCount(-1);
                alphaAnimation.setRepeatMode(2);
                view2.setBackgroundColor(Color.parseColor("#FFC402"));
                view2.startAnimation(alphaAnimation);
                String str2 = d;
                com.facebook.common.logging.a.a(str2, "reachedRootViewBottom: " + view2.toString());
            }
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64286523a2140eb54d3e9f0b4fbd8020", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64286523a2140eb54d3e9f0b4fbd8020")).booleanValue();
        }
        this.n = true;
        if (d() || this.e == null || this.e.get() == null || this.f == null || this.f.get() == null) {
            return true;
        }
        Iterator<Integer> it = this.h.iterator();
        while (!d() && it.hasNext()) {
            View d2 = this.e.get().d(it.next().intValue());
            if (d2 != null) {
                a(this.f.get(), d2);
            }
        }
        return d();
    }
}
