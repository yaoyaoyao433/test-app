package com.sankuai.waimai.business.restaurant.poicontainer.machpro.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.l;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.mach.manager.cache.c;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.container.a;
import com.sankuai.waimai.machpro.container.b;
import com.sankuai.waimai.machpro.container.g;
import com.sankuai.waimai.platform.utils.f;
import java.io.Serializable;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPBaseDialogFragment extends DialogFragment implements b {
    public static ChangeQuickRedirect a;
    protected a b;
    protected FrameLayout c;
    protected FrameLayout d;
    private View e;
    private View f;
    private String g;
    private MachMap h;
    private String i;

    @Override // com.sankuai.waimai.machpro.container.b
    public void a(CacheException cacheException) {
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void a(c cVar) {
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void a(Throwable th) {
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void b(c cVar) {
    }

    public MachMap e() {
        return null;
    }

    public MPBaseDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "532f993fa26e38cd2faf0a324951ce57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "532f993fa26e38cd2faf0a324951ce57");
        } else {
            this.i = "";
        }
    }

    public static /* synthetic */ a a(MPBaseDialogFragment mPBaseDialogFragment, a aVar) {
        mPBaseDialogFragment.b = null;
        return null;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fba54d4c4c4538dcdaff68f81f1270d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fba54d4c4c4538dcdaff68f81f1270d");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4220a68dd5ff22db224b618bbe315845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4220a68dd5ff22db224b618bbe315845");
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.g = arguments.getString("bundle_name");
                this.i = arguments.getString("biz");
                Serializable a2 = f.a(arguments, "bundle_params");
                if (a2 instanceof MachMap) {
                    this.h = (MachMap) a2;
                }
            }
        }
        if (com.sankuai.waimai.machpro.f.a().i.i) {
            this.b = l();
            if (this.b == null) {
                this.b = new g(this);
                return;
            }
            return;
        }
        this.b = new g(this);
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a981ec741e97928b57cb5ba16e0f9d22", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a981ec741e97928b57cb5ba16e0f9d22");
        }
        this.c = new FrameLayout(getActivity());
        if (com.sankuai.waimai.machpro.f.a().i.j) {
            this.d = new FrameLayout(getActivity());
            this.c.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
            k();
        } else {
            this.d = this.c;
        }
        return this.c;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0dd1a7e402abd4a7e9d8f3b89120293", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0dd1a7e402abd4a7e9d8f3b89120293");
            return;
        }
        super.onActivityCreated(bundle);
        this.b.a();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d37b8f22666f2884fa9d51245fbf9c2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d37b8f22666f2884fa9d51245fbf9c2b");
            return;
        }
        super.onStart();
        this.b.c();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd41748eb1013bde6560680f3b572146", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd41748eb1013bde6560680f3b572146");
            return;
        }
        super.onResume();
        this.b.d();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d33639b9d103bd987226df2f8069d92b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d33639b9d103bd987226df2f8069d92b");
            return;
        }
        super.onPause();
        this.b.e();
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final FrameLayout ay_() {
        return this.d;
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final String az_() {
        return this.i;
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final Context aA_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b4a0bf98a1c7792dabf79e217266353", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b4a0bf98a1c7792dabf79e217266353") : getActivity();
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final MachMap d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d07fbc408f2063fdd09eed13dcb09f", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d07fbc408f2063fdd09eed13dcb09f");
        }
        if (this.h == null) {
            this.h = e();
        }
        return this.h;
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void f() {
        FrameLayout frameLayout;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "524a8830aa461ababbf01709aad90bc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "524a8830aa461ababbf01709aad90bc0");
            return;
        }
        if (this.e == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "668db326379f8580a65ae3c6b546ca3b", RobustBitConfig.DEFAULT_VALUE)) {
                frameLayout = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "668db326379f8580a65ae3c6b546ca3b");
            } else {
                FrameLayout frameLayout2 = new FrameLayout(getActivity());
                frameLayout2.setBackgroundColor(-1);
                TextView textView = new TextView(getActivity());
                textView.setText("加载中...");
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                frameLayout2.addView(textView, layoutParams);
                frameLayout = frameLayout2;
            }
            this.e = frameLayout;
        }
        if (this.e.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.e.getParent()).removeView(this.e);
        }
        this.c.addView(this.e, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a32ad24bceb5585f46377318ee74c523", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a32ad24bceb5585f46377318ee74c523");
        } else if (this.e == null || !(this.e.getParent() instanceof ViewGroup)) {
        } else {
            ((ViewGroup) this.e.getParent()).removeView(this.e);
        }
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void h() {
        FrameLayout frameLayout;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dd463a55b95b8203634e29c7fbc32dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dd463a55b95b8203634e29c7fbc32dd");
        } else if (getActivity() == null) {
        } else {
            if (this.f == null) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d3fb8680161a33fbccb5638ed659c02", RobustBitConfig.DEFAULT_VALUE)) {
                    frameLayout = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d3fb8680161a33fbccb5638ed659c02");
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(getActivity());
                    frameLayout2.setBackgroundColor(-1);
                    TextView textView = new TextView(getActivity());
                    textView.setText("加载失败，点击重试!!!");
                    textView.setPadding(20, 20, 20, 20);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPBaseDialogFragment.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "23c534f31a3e69a1552cf0990f9d31cb", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "23c534f31a3e69a1552cf0990f9d31cb");
                            } else {
                                MPBaseDialogFragment.this.b.b();
                            }
                        }
                    });
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    frameLayout2.addView(textView, layoutParams);
                    frameLayout = frameLayout2;
                }
                this.f = frameLayout;
            }
            if (this.f.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.f.getParent()).removeView(this.f);
            }
            this.c.addView(this.f, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98ba394f7da91781adab776a6b61d383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98ba394f7da91781adab776a6b61d383");
        } else if (this.f == null || !(this.f.getParent() instanceof ViewGroup)) {
        } else {
            ((ViewGroup) this.f.getParent()).removeView(this.f);
        }
    }

    @Override // com.sankuai.waimai.machpro.container.b
    public final String j() {
        return this.g;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27753002ac9679426c3740d5e6983cbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27753002ac9679426c3740d5e6983cbb");
            return;
        }
        super.onStop();
        this.b.f();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "656c57b771fde5adc035ae63b75fc73d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "656c57b771fde5adc035ae63b75fc73d");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.MPBaseDialogFragment.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44055c6738ba60d3b720a8ebcd4d3597", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44055c6738ba60d3b720a8ebcd4d3597");
                } else if (MPBaseDialogFragment.this.b != null) {
                    MPBaseDialogFragment.this.b.g();
                    MPBaseDialogFragment.a(MPBaseDialogFragment.this, null);
                }
            }
        });
    }

    private a l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce03f969b7a1be07f156fb8f3e17e38d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce03f969b7a1be07f156fb8f3e17e38d");
        }
        try {
            String a2 = l.a(getContext(), "mp_local_server_channel", "mp_local_server_key", "");
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a2);
            JSONObject optJSONObject = jSONObject.optJSONObject(this.g);
            String str = "";
            String str2 = "";
            if (optJSONObject == null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
                    if (TextUtils.equals(optJSONObject2.optString("main_bundle"), this.g) && optJSONObject2.optBoolean("is_sub_bundle")) {
                        str = optJSONObject2.optString("url");
                        str2 = next;
                    }
                    optJSONObject = optJSONObject2;
                }
            }
            if (optJSONObject != null && TextUtils.isEmpty(str)) {
                str = optJSONObject.optString("url");
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            TextUtils.isEmpty(str2);
            return (a) Class.forName("com.sankuai.waimai.mach.assistant.playground.machpro.MPPlaygroundRenderDelegate").getConstructor(b.class).newInstance(this);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private View m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3187c075c6043dd26c178e1b7654e368", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3187c075c6043dd26c178e1b7654e368");
        }
        try {
            Class<?> cls = Class.forName("com.sankuai.waimai.mach.assistant.playground.MPToolsHelper");
            return (View) cls.getMethod("getTagView", Context.class, String.class).invoke(cls.newInstance(), getActivity(), this.g);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "781da9cf5d673fda4a16916a0f1852e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "781da9cf5d673fda4a16916a0f1852e2");
            return;
        }
        View m = m();
        if (m != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) MapConstant.ANIMATION_DURATION_SHORT, (int) MapConstant.ANIMATION_DURATION_SHORT);
            layoutParams.gravity = 5;
            layoutParams.topMargin = 1000;
            this.c.addView(m, layoutParams);
        }
    }
}
