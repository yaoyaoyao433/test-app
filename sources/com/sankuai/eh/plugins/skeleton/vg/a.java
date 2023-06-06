package com.sankuai.eh.plugins.skeleton.vg;

import android.os.Build;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.aidata.config.DBConfig;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.plugins.skeleton.util.b;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static final String d = "com.sankuai.eh.plugins.skeleton.vg.a";
    public ViewGroup b;
    public com.sankuai.eh.plugins.skeleton.util.b c;
    private final ViewGroup e;
    private View f;
    private FrameLayout g;
    private boolean h;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a();
    }

    private a(C0566a c0566a) {
        Object[] objArr = {c0566a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3571178d9cb181c17a191e24e67cd976", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3571178d9cb181c17a191e24e67cd976");
            return;
        }
        this.e = c0566a.d;
        this.f = c0566a.e;
        this.b = (ViewGroup) LayoutInflater.from(this.e.getContext()).inflate(R.layout.ehcore_layout_skeleton, this.e, false);
        this.g = (FrameLayout) this.b.findViewById(R.id.content_skeleton);
        this.h = c0566a.b;
        this.c = c0566a.f;
    }

    public final void a() {
        boolean z;
        View view;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c092d7dfaf723a79149ccaf3b879b7f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c092d7dfaf723a79149ccaf3b879b7f1");
            return;
        }
        try {
            FrameLayout frameLayout = this.g;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c0ccc5cf9496a37064773b5b89fea80", RobustBitConfig.DEFAULT_VALUE)) {
                view = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c0ccc5cf9496a37064773b5b89fea80");
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d96205ec964794f6bdd826ac28216b17", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d96205ec964794f6bdd826ac28216b17");
                } else {
                    com.sankuai.eh.plugins.skeleton.util.b bVar = this.c;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.eh.plugins.skeleton.util.b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "df0d2fbe50a379fcf1b3be26d9948d4c", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "df0d2fbe50a379fcf1b3be26d9948d4c")).booleanValue();
                    } else {
                        if (!bVar.c && !com.sankuai.eh.component.service.utils.b.a(bVar.b.get("notitlebar"), false).booleanValue()) {
                            z = false;
                        }
                        z = true;
                    }
                    if (z) {
                        this.b.findViewById(R.id.title_skeleton).setVisibility(8);
                    } else {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.findViewById(R.id.title_space).getLayoutParams();
                        layoutParams.height = com.sankuai.eh.component.service.utils.a.a(48.0f);
                        this.b.findViewById(R.id.title_space).setLayoutParams(layoutParams);
                    }
                }
                if (1 == this.c.a()) {
                    this.f.setBackgroundColor(this.c.d());
                    view = this.f;
                } else if (2 == this.c.a()) {
                    if (this.f instanceof ImageView) {
                        Picasso g = Picasso.g(this.e.getContext());
                        com.sankuai.eh.plugins.skeleton.util.b bVar2 = this.c;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.eh.plugins.skeleton.util.b.a;
                        g.d(PatchProxy.isSupport(objArr5, bVar2, changeQuickRedirect5, false, "4309c010d41d6d362c59288db83267fe", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr5, bVar2, changeQuickRedirect5, false, "4309c010d41d6d362c59288db83267fe") : com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(bVar2.b(), "data"), "")).a((ImageView) this.f);
                        this.g.setBackgroundColor(this.c.d());
                    }
                    view = this.f;
                } else {
                    view = null;
                }
            }
            frameLayout.addView(view);
            if (this.c.d) {
                this.g.setVisibility(0);
                this.g.setAlpha(0.0f);
                this.g.animate().alpha(1.0f).setDuration(300L).setListener(null);
            }
            this.e.addView(this.b);
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af59d463f73cabeacb569f4474027506", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af59d463f73cabeacb569f4474027506");
        } else {
            this.e.removeView(this.b);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.plugins.skeleton.vg.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0566a {
        public static ChangeQuickRedirect a;
        public boolean b;
        public boolean c;
        final ViewGroup d;
        View e;
        com.sankuai.eh.plugins.skeleton.util.b f;
        private boolean g;

        public C0566a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a603bccb7791bd8739b63a7e784adf1c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a603bccb7791bd8739b63a7e784adf1c");
                return;
            }
            this.b = true;
            this.c = true;
            this.g = true;
            this.d = viewGroup;
        }

        public final C0566a a(com.sankuai.eh.plugins.skeleton.util.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63697a4b2aeb14b2662ce604636c8a93", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0566a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63697a4b2aeb14b2662ce604636c8a93");
            }
            this.f = bVar;
            JsonElement c = com.sankuai.eh.component.service.utils.b.c(bVar.b(), "data");
            if (c == null || TextUtils.isEmpty(c.toString())) {
                this.g = false;
                com.sankuai.eh.component.service.tools.d.b("没有发现骨架屏数据！！！");
            }
            return this;
        }

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0664bc3c970d56b856be63cc0f09707", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0664bc3c970d56b856be63cc0f09707");
            }
            if (!b() && (this.c && this.g)) {
                e();
                a aVar = new a(this);
                aVar.a();
                return aVar;
            }
            return null;
        }

        private boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f96de6944eb7e0638be997fd96d360d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f96de6944eb7e0638be997fd96d360d")).booleanValue() : c() || d();
        }

        private static boolean c() {
            return Build.VERSION.SDK_INT < 21;
        }

        private boolean d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7327e3140651b1eae8876a70d7047eb1", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7327e3140651b1eae8876a70d7047eb1")).booleanValue();
            }
            String c = com.sankuai.eh.component.service.utils.a.c();
            return ("vivo V3Max A".equals(c) || "vivo V3Max".equals(c) || "vivo V3Max L".equals(c)) && Build.VERSION.SDK_INT == 22;
        }

        private void e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "099df511510f34f27a355bbfa4426a94", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "099df511510f34f27a355bbfa4426a94");
            } else if (1 == this.f.a()) {
                this.e = new FrameLayout(this.d.getContext());
                this.e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                if (this.f.c()) {
                    com.sankuai.eh.component.service.utils.b.a(this.f.b(), "hideStatusBar", new JsonPrimitive(Boolean.TRUE));
                }
                this.f.a((b.InterfaceC0565b) new c(this.e, this.f.b()));
            } else if (this.g && 2 == this.f.a()) {
                ImageView imageView = new ImageView(this.d.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                a(layoutParams, com.sankuai.eh.component.service.utils.b.c(this.f.b(), DBConfig.KEY_SQL_CONFIG_VER));
                imageView.setLayoutParams(layoutParams);
                this.e = imageView;
            }
        }

        private void a(FrameLayout.LayoutParams layoutParams, JsonElement jsonElement) {
            Object[] objArr = {layoutParams, jsonElement};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef703fb28caba26c233c7b16b8744e3e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef703fb28caba26c233c7b16b8744e3e");
                return;
            }
            if (com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "width"), -1) != -1 && com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "height"), -1) != -1) {
                layoutParams.width = com.sankuai.eh.component.service.utils.a.a(com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "width"), 0));
                layoutParams.height = com.sankuai.eh.component.service.utils.a.a(com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "height"), 0));
            }
            if (com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, Constants.GestureMoveEvent.KEY_X), -1) != -1 && com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, Constants.GestureMoveEvent.KEY_Y), -1) != -1) {
                layoutParams.leftMargin = com.sankuai.eh.component.service.utils.a.a(com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, Constants.GestureMoveEvent.KEY_X), 0));
                layoutParams.topMargin = com.sankuai.eh.component.service.utils.a.a(com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, Constants.GestureMoveEvent.KEY_Y), 0));
                return;
            }
            layoutParams.gravity = 17;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c implements b.InterfaceC0565b {
        public static ChangeQuickRedirect a;
        private WeakReference<View> b;
        private JsonElement c;

        public c(View view, JsonElement jsonElement) {
            Object[] objArr = {view, jsonElement};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10db02f708ff4a5203402a85db209a1e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10db02f708ff4a5203402a85db209a1e");
                return;
            }
            this.b = new WeakReference<>(view);
            this.c = jsonElement;
        }

        @Override // com.sankuai.eh.plugins.skeleton.util.b.InterfaceC0565b
        public final void a(List<ArrayList<Integer>> list) {
            boolean z;
            boolean booleanValue;
            boolean booleanValue2;
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3428d3a36fac6ac2b07420bf84593058", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3428d3a36fac6ac2b07420bf84593058");
                return;
            }
            try {
                View view = this.b.get();
                if (view != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    JsonElement jsonElement = this.c;
                    Object[] objArr2 = {frameLayout, list, jsonElement};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.plugins.skeleton.view.d.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "15192a44772e14531210ae8f6dc90902", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "15192a44772e14531210ae8f6dc90902");
                        return;
                    }
                    Object[] objArr3 = {frameLayout, list, jsonElement};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.eh.plugins.skeleton.view.d.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "370ab909824da5f4faa8252bf4d9c1f9", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "370ab909824da5f4faa8252bf4d9c1f9")).booleanValue();
                    } else {
                        com.sankuai.eh.component.service.database.d.d();
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    Map<String, JsonElement> c = com.sankuai.eh.component.service.utils.b.c(jsonElement);
                    com.sankuai.eh.plugins.skeleton.vg.c cVar = new com.sankuai.eh.plugins.skeleton.vg.c(frameLayout.getContext(), c);
                    com.sankuai.eh.plugins.skeleton.vg.b bVar = new com.sankuai.eh.plugins.skeleton.vg.b(frameLayout.getContext());
                    Object[] objArr4 = {cVar, bVar, list, c};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.eh.plugins.skeleton.view.d.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "f38cb124a858400917d80bda6a36a92a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "f38cb124a858400917d80bda6a36a92a");
                    } else if (list != null && list.size() <= 1000) {
                        List<Integer> a2 = com.sankuai.eh.plugins.skeleton.view.d.a(c, false);
                        Map map = (Map) com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(c.get("style")), new TypeToken<HashMap<Integer, JsonElement>>() { // from class: com.sankuai.eh.plugins.skeleton.view.d.1
                        }.getType());
                        for (int i = 0; i < list.size(); i++) {
                            Boolean a3 = com.sankuai.eh.component.service.utils.b.a(c.get("shimmerEnabled"), true);
                            if (a3.booleanValue()) {
                                if (a2 != null && !a2.contains(Integer.valueOf(i))) {
                                    booleanValue = false;
                                }
                                booleanValue = true;
                            } else {
                                booleanValue = a3.booleanValue();
                            }
                            com.sankuai.eh.plugins.skeleton.view.d.a(cVar, bVar, list.get(i), c, map != null ? (JsonElement) map.get(Integer.valueOf(i)) : null, booleanValue);
                        }
                    }
                    Object[] objArr5 = {cVar, bVar, c};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.eh.plugins.skeleton.view.d.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "ebbbcb09e4df1a2e8ea816a4021dca77", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "ebbbcb09e4df1a2e8ea816a4021dca77");
                    } else {
                        List<Integer> a4 = com.sankuai.eh.plugins.skeleton.view.d.a(c, true);
                        if (c.containsKey("dataV2") && com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(c.get("dataV2"), "type"), 0) == 1) {
                            JsonArray b = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(c.get("dataV2"), "data"));
                            if (b.size() <= 1000) {
                                for (int i2 = 0; i2 < b.size(); i2++) {
                                    JsonElement jsonElement2 = b.get(i2);
                                    ArrayList<Integer> a5 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.c(jsonElement2, "layout"), "p")), 0);
                                    if (!com.sankuai.eh.plugins.skeleton.view.d.a(a5)) {
                                        Object[] objArr6 = {a5};
                                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.eh.plugins.skeleton.util.b.a;
                                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "3ce91669cd62f52d42fcc8a97b4b941b", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "3ce91669cd62f52d42fcc8a97b4b941b");
                                        } else {
                                            for (int i3 = 0; a5 != null && i3 < a5.size(); i3++) {
                                                a5.set(i3, Integer.valueOf(com.sankuai.eh.plugins.skeleton.util.b.a(a5.get(i3).intValue())));
                                            }
                                        }
                                        Boolean a6 = com.sankuai.eh.component.service.utils.b.a(c.get("shimmerEnabled"), true);
                                        if (a6.booleanValue()) {
                                            if (a4 != null && !a4.contains(Integer.valueOf(i2))) {
                                                booleanValue2 = false;
                                            }
                                            booleanValue2 = true;
                                        } else {
                                            booleanValue2 = a6.booleanValue();
                                        }
                                        com.sankuai.eh.plugins.skeleton.view.d.a(cVar, bVar, a5, c, jsonElement2, booleanValue2);
                                    }
                                }
                            }
                        }
                    }
                    frameLayout.addView(bVar);
                    frameLayout.addView(cVar);
                }
            } catch (Exception e) {
                com.sankuai.eh.component.service.tools.d.a(e);
            }
        }
    }
}
